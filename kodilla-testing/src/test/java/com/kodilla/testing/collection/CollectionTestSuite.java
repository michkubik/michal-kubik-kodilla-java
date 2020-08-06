package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @DisplayName("When create an empty 'numbers' list , " +
            "then evenNumbers List should be returned empty")

    @Test
   void testOddNumbersExterminatorEmptyList() {
        // Given
        List numbers = new List;
        numbers = null;
        // When
        OddNumbersExterminator.exterminate();
        // Then
        Assertions.assertEquals((Integer) null, null);
    };

    @DisplayName("When create a 'numbers' list with even and odd numbers " +
            "then evenNumbers List should contain only even numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        // Given
        List<Integer> numbers = new List<Integer>
        numbers = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //When
        OddNumbersExterminator.exterminate();
        List<Integer> toCompareList = (2, 4, 6, 8, 10);
        //Then
        Assertions.assertEquals(toCompareList, List<Integer> evenNumbers);
        Assertions.assertEquals(List<Integer> toCompareList, List<Integer> evenNumbers);
    };

}
