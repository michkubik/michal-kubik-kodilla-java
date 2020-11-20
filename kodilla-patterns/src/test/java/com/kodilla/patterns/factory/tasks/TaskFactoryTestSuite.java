package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {

        System.out.println("\nTest zadania SHOPPING\n");

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING);

        //Then
        assertEquals("Spożywcze", shoppingTask.getTaskName());
        assertEquals("Kupić: Ziemniaki (kg), ile: 2.5", shoppingTask.executeTask());
        assertEquals(true, shoppingTask.executeTask().contains("Ziemniaki"));
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {

        System.out.println("\nTest zadania DRIVING\n");

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING);

        //Then
        assertEquals("Do pracy", drivingTask.getTaskName());
        assertEquals("Jadę do: Myśliwiecka 3/5/7", drivingTask.executeTask());
        assertEquals(true, drivingTask.executeTask().contains("Myśliwiecka"));
        assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {

        System.out.println("\nTest zadania PAINTING\n");

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING);

        //Then
        assertEquals("Malarstwo", paintingTask.getTaskName());
        assertEquals("Maluję: Krajobraz, a kolory to: czarno-biały", paintingTask.executeTask());
        assertEquals(true, (paintingTask.executeTask().contains("Krajobraz") && paintingTask.executeTask().contains("czarno")));
        assertEquals(true, paintingTask.isTaskExecuted());
    }
}
