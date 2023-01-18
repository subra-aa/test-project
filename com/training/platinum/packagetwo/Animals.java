package com.training.platinum.packagetwo;

import com.training.platinum.packageone.GeometryFigure;
import com.training.platinum.packageone.LivingThing;

public abstract class Animals extends LivingThing  {
    @Override
    public String legs() {
        return "Animal has legs";
    }

    @Override
    public String leaves() {
        return "Animal doesn't have leaves";
    }

    public abstract String wildAnimal();
}
