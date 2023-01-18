package com.training.platinum.TestCode;

import com.training.platinum.packageone.GeometryFigure;
import com.training.platinum.packageone.LivingThing;
import com.training.platinum.packagethree.Tiger;
import com.training.platinum.packagetwo.Animals;
import com.training.platinum.packagetwo.Plants;
import com.training.platinum.packagetwo.Square;
import com.training.platinum.packagetwo.Trinagle;

public class TestMyCode {

    public static void main(String[] args) {
        GeometryFigure triangleType = new Square();
        System.out.println(triangleType.sides());
    }
}
