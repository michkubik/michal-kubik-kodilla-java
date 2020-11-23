package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    public static final String SESAME = "SESAME";
    public static final String NO_SESAME = "NO SESAME";
    public static final String STANDARD_SAUCE = "Standard";
    public static final String ISLANDS_SAUCE = "1000 Islands";
    public static final String BARBECUE_SAUCE = "Barbecue";
    public static final String SALAD = "Salad";
    public static final String ONION = "Onion";
    public static final String BACON = "Bacon";
    public static final String CUCUMBER = "Cucumber";
    public static final String CHILLI = "Chilli";
    public static final String MUSHROOMS = "Mushrooma";
    public static final String SHRIMPS = "Shrimps";
    public static final String CHEESE = "Cheese";


    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals(SESAME) || bun.equals(NO_SESAME)) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Bun can be with or without sesame");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals(STANDARD_SAUCE) || sauce.equals(ISLANDS_SAUCE) || sauce.equals(BARBECUE_SAUCE)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("No such sauce!");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (ingredient.equals(SALAD) || ingredient.equals(ONION) || ingredient.equals(BACON) || ingredient.equals(CUCUMBER) || ingredient.equals(CHILLI) || ingredient.equals(MUSHROOMS) || ingredient.equals(SHRIMPS) || ingredient.equals(CHEESE)) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("No such ingredient!");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);

        }

    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
