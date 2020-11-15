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

        //When
        board.getToDoList().getTasks().add("Kupić makaron");
        board.getInProgressList().getTasks().add("Napisać maila");
        board.getDoneList().getTasks().add("Zrobić ciasto");

        //Then
        if (board.getToDoList().getTasks().contains("Kupić makaron")) {
            System.out.println("Zadanie >> " + board.getToDoList().getTasks().get(0) + " << jest na liście!");
        } else {
            System.out.println("Nie ma na liście takiego zadania!");
        };

        if (board.getInProgressList().getTasks().contains("Napisać maila")) {
            System.out.println("Zadanie >> " + board.getInProgressList().getTasks().get(0) + " << jest na liście!");
        } else {
            System.out.println("Nie ma na liście takiego zadania!");
        };

        if (board.getDoneList().getTasks().contains("Zrobić ciasto")) {
            System.out.println("Zadanie >> " + board.getDoneList().getTasks().get(0) + " << jest na liście!");
        } else {
            System.out.println("Nie ma na liście takiego zadania!");
        };
    }
}
