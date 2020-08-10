package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
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
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator exterminator1 = new OddNumbersExterminator(numbers);
        numbers = null;
        // When
        exterminator1.exterminate(numbers);
        // Then
        Assertions.assertEquals((Integer) null, null);
    };

    @DisplayName("When create a 'numbers' list with even and odd numbers " +
            "then evenNumbers List should contain only even numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        // Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator(numbers);
        for (int e=1; e<11; e++) {
            numbers.add(e);
        }

        //When
        exterminator2.exterminate(numbers);
        ArrayList<Integer> toCompareList = new ArrayList<>();
        for (int z = 0; z<11; z = z + 2){
            toCompareList.add(z);
        }
        //Then
        Assertions.assertEquals(toCompareList, exterminator2.exterminate(numbers));
        System.out.println(toCompareList);
        System.out.println(exterminator2.exterminate(numbers));
    }

}
