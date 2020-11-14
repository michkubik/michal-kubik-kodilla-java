package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;
    private TaskList toDoList;

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        TaskList taskList = new TaskList();
        toDoList = board.getToDoList();
        taskList = board.getToDoList();
        taskList = board.getDoneList();

        //When & Then
        board.getToDoList().getTasks();


        //Then

    }

}
