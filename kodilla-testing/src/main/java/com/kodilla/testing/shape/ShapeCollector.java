package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {

    private List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        //empty for now
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        //empty for now
        figures.remove(shape);
    }

    public Shape getFigure(int n) {
        //empty for now

        Shape figure = figures.get(n);
        System.out.println(figure);
        return figure;
    }


    public String showFigures() {
        //empty for now

       String figureList = "";
        for (Shape figure : figures) {
            figureList += figure.getShapeName() + ", ";
        }
        System.out.println(figureList);
        return figureList;

    }
    public int getFigureCount() {
        return figures.size();
    }

}


