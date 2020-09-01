package com.kodilla.testing.shape;

import java.util.ArrayList;


public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        //empty for now
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        //empty for now
        figures.remove(shape);
    }

    public void getFigure(int n) {
        //empty for now

        Shape figure = figures.get(n);
        String toString() {
            String figureNew = figure.getShapeName();
        }
        //public String toString();
        //return getFigure(n);
    }


    public String showFigures() {
        //empty for now

       String figureList = "";
        for (Shape figure : figures) {
            figure.getShapeName();
            figureList = figure + ", ";
        }
        System.out.println(figureList);
        return null;

    }

}


