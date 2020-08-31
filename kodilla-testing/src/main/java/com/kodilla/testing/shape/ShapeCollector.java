package com.kodilla.testing.shape;
import com.kodilla.testing.shape.Shape;

import java.util.ArrayList;


public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public ShapeCollector(ArrayList<Shape> figures) {
        this.figures = figures;
    }

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
        for (Object shape: figures) {
            Object figuresList = shape;
            System.out.println(shape);
        }
    }

    public int size() {
        return 0;
    }

}
