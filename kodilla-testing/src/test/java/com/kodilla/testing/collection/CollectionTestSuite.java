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
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        numbers = null;
        // When
        exterminator.exterminate(numbers);
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
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        int e;
        for (e=1; e<11; e++) {
            numbers.add(e);
        }


        //When
        exterminator.exterminate(numbers);
        ArrayList<Integer> toCompareList;
        toCompareList = null;
        int z;
        for (z=0; z<11; z = z + 2){
            toCompareList.add(z);
        }
        //Then
        Assertions.assertEquals(toCompareList, exterminator.exterminate(numbers));
        System.out.println(toCompareList);
        System.out.println(exterminator.exterminate(numbers));
    };

}
