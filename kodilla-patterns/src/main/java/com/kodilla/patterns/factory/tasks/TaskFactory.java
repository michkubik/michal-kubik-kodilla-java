package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public final Task createTask(final String taskNew) {
        switch (taskNew) {
            case SHOPPING:
                return new ShoppingTask("Spożywcze", "Ziemniaki (kg)", 2.5);
            case DRIVING:
                return new DrivingTask("Do pracy", "Myśliwiecka 3/5/7", "Tramwaj");
            case PAINTING:
                return new PaintingTask("Malarstwo", "czarno-biały", "Krajobraz");
            default: return null;
        }
    }
}
