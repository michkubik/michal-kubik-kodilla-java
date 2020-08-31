package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

@DisplayName("TDD: ShapeCollector Test Suite")

public class ShapeCollectorTestSuite {

        private static int testCounter = 0;

        @BeforeAll
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterAll
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @BeforeEach
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }

        @Nested
        @DisplayName("Tests for adding and removing figures")
        class TestAddRemove {
            @Test
            void testAddFigure() {
                //Given
                ArrayList<Shape> figures = new ArrayList<Shape>();
                Circle circle = new Circle("Circle1", 12.56);

                //When
                figures.addFigure(circle);

                //Then
                Assertions.assertEquals(1, figures.size());
            }

            @Test
            void testRemoveFigure() {
                //Given
                ArrayList<Shape> figures = new ArrayList<Shape>();
                Shape shape = new Circle("Circle1", 12.56);
                figures.addFigure(shape);

                //When
                figures.removeFigure();

                //Then
                Assertions.assertEquals(0, figures.getShapesQuantity());
            }


        }
    @Nested
    @DisplayName("Tests for getting and presenting figures")
    class TestGetPresent {
        @Test
        void testGetFigure() {
            //Given
            ArrayList<Shape> figures = new ArrayList<Shape>();
            figures.addFigure(circle);
            figures.addFigure(square);
            figures.addFigure(triangle);

            //When
            figures.getFigure(1);

            //Then
            Assertions.assertEquals(square, shapeCollector.getFigure(1));
        }

        @Test
        void testShowFigures() {
            //Given
            ArrayList<Shape> figures = new ArrayList<Shape>()
            Circle circle = new Circle("Circle1", 12.56);
            Square square = new Square("Square1", 25.0);
            Triangle triangle = new Triangle("Triangle1", 25.0);

            figures.addFigure(circle);
            figures.addFigure(square);
            figures.addFigure(triangle);

            //When
            figures.showFigures();

            //Then
            Assertions.assertEquals("circle, square, triangle", shapeCollector.showFigures(1));
        }


    }

    }



