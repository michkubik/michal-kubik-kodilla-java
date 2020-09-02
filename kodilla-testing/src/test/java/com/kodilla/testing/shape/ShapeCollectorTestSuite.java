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
                ShapeCollector shapeCollector = new ShapeCollector();
                Shape circle = new Circle(3.00);

                //When
               shapeCollector.addFigure(circle);

                //Then
                Assertions.assertEquals(1, shapeCollector.getFigureCount());
                Assertions.assertEquals(circle, shapeCollector.getFigure(0));
            }

            @Test
            void testRemoveFigure() {
                //Given
                ShapeCollector shapeCollector = new ShapeCollector();

                Shape circle1 = new Circle(3.00);
                Shape circle2 = new Circle(4.00);
                shapeCollector.addFigure(circle1);
                shapeCollector.addFigure(circle2);

                Shape square1 = new Square(2.0);
                Shape square2 = new Square(3.0);
                shapeCollector.addFigure(square1);
                shapeCollector.addFigure(square2);

                Shape triangle1 = new Triangle(2.0, 3.0);
                Shape triangle2 = new Triangle(3.0, 4.0);
                shapeCollector.addFigure(triangle1);
                shapeCollector.addFigure(triangle2);

                //When
                shapeCollector.removeFigure(circle1);

                //Then
                Assertions.assertEquals(5, shapeCollector.getFigureCount());
            }

        }
    @Nested
    @DisplayName("Tests for getting and presenting figures")
    class TestGetPresent {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape circle = new Circle(2.0);
            Shape square = new Square( 5.0);
            Shape triangle = new Triangle(4.0, 3.0);

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            Shape result = shapeCollector.getFigure(1);

            //Then
            Assertions.assertEquals(square, result);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Shape circle = new Circle(2.0);
            Shape square = new Square( 5.0);
            Shape triangle = new Triangle(4.0, 3.0);

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("circle, square, triangle", result);
        }


    }

    }



