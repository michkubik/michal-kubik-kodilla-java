package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static com.kodilla.patterns.builder.bigmac.Bigmac.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(SESAME)
                .burgers(2)
                .sauce(STANDARD_SAUCE)
                .ingredient(CHEESE)
                .ingredient(ONION)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        boolean isOnion = bigmac.getIngredients().contains("Onion");
        String whichSauce = bigmac.getSauce();

        //Then
        assertEquals(2, howManyIngredients);
        assertEquals(2, howManyBurgers);
        assertEquals(true, isOnion);
        assertEquals("Standard", whichSauce);
    }

}
