package com.training.platinum.packagetwo;

import com.training.platinum.packageone.GeometryFigure;

public class Square implements GeometryFigure {
    @Override
    public int sides() {
        return 4;
    }

    @Override
    public int area(int length, int breadth) {
        return length*breadth;
    }
}
