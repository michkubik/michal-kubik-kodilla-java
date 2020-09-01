package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


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
        figures.get(n);
    }

    public void showFigures() {
        //empty for now
        //for (Object shape: figures) {
          //  Object figuresList = shape;
           // System.out.println(shape);
        //}
    }

}
