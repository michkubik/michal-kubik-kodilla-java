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
        OddNumbersExterminator exterminator1 = new OddNumbersExterminator();
        // When
        exterminator1.exterminate(numbers);
        // Then
        Assertions.assertEquals(0, exterminator1.getOddNumbers().size());
        Assertions.assertEquals(0, exterminator1.getEvenNumbers().size());
    };

    @DisplayName("When create a 'numbers' list with even and odd numbers " +
            "then evenNumbers List should contain only even numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator exterminator1 = new OddNumbersExterminator();

        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(99);
        normalList.add(7);
        normalList.add(135);
        normalList.add(54);
        normalList.add(13);
        normalList.add(17);
        normalList.add(29);
        normalList.add(58);
        normalList.add(28);
        normalList.add(27);
        normalList.add(68);
        normalList.add(75);
        normalList.add(982);

        ArrayList<Integer> oddNumbersList = new ArrayList<>();
        oddNumbersList.add(1);
        oddNumbersList.add(99);
        oddNumbersList.add(7);
        oddNumbersList.add(135);
        oddNumbersList.add(13);
        oddNumbersList.add(17);
        oddNumbersList.add(29);
        oddNumbersList.add(27);
        oddNumbersList.add(75);

        ArrayList<Integer> eveNumbersList = new ArrayList<>();
        eveNumbersList.add(54);
        eveNumbersList.add(58);
        eveNumbersList.add(28);
        eveNumbersList.add(68);
        eveNumbersList.add(982);

        //When
        exterminator1.exterminate(normalList);


        //Then
        Assertions.assertEquals(oddNumbersList, exterminator1.getOddNumbers());
        Assertions.assertEquals(eveNumbersList, exterminator1.getEvenNumbers());

    }
}
