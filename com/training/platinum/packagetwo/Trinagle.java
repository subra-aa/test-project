package com.training.platinum.packagetwo;

import com.training.platinum.packageone.GeometryFigure;

public class Trinagle implements GeometryFigure {

    public Trinagle(int a, int b) {
    }

    public Trinagle() {

    }

    @Override
    public int sides() {
        return 3;
    }

    @Override
    public int area(int length, int breadth) {
        return 1/2*length*breadth;
    }
}
