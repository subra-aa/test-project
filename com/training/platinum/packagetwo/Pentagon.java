package com.training.platinum.packagetwo;

import com.training.platinum.packageone.GeometryFigure;

public class Pentagon implements GeometryFigure {
    @Override
    public int sides() {
        return 5;
    }

    @Override
    public int area(int length, int breadth) {
        return length + breadth;
    }
}
