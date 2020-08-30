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
                Shape shape = new Circle("Circle", 12.56);

                //When
                figures.addFigure(Shape shape);

                //Then
                Assertions.assertEquals(1, shapeCollector.size());
            }

            @Test
            void testRemoveFigure() {
                //Given
                ShapeCollector shapeCollector = new ShapeCollector(Shape);
                Shape shape = new Circle("Circle", 12.56);
                shapeCollector.addFigure(shape);

                //When
                shapeCollector.removeFigure(Circle);

                //Then
                Assertions.assertEquals(0, shapeCollector.getShapesQuantity());
            }


        }
    @Nested
    @DisplayName("Tests for getting and presenting figures")
    class TestGetPresent {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector(Shape);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            shapeCollector.getFigure(1);

            //Then
            Assertions.assertEquals(square, shapeCollector.getFigure(1));
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector(Shape);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("circle, square, triangle", shapeCollector.showFigures(1));
        }


    }

    }



