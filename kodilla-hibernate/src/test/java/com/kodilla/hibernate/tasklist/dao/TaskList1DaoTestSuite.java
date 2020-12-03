package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskList1DaoTestSuite {

    private static final String LISTNAME = "Shopping List";

    @Autowired
    private TaskListDao1 taskListDao1;

    @Test
    void testFindByListName() {

        //Given
        TaskList1 taskList1 = new TaskList1(LISTNAME, "Things to buy");
        taskListDao1.save(taskList1);
        String listName = taskList1.getListName();

        //When
        List<TaskList1> readTaskList1 = taskListDao1.findByListName(listName);

        //Then
        assertEquals("Shopping List", taskList1.getListName());

        //CleanUp
        int id = readTaskList1.get(0).getId();
        taskListDao1.deleteById(id);
    }

}
