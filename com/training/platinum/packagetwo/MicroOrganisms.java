package com.training.platinum.packagetwo;

import com.training.platinum.packageone.LivingThing;

public class MicroOrganisms extends LivingThing {

    @Override
    public String legs() {
        return "Micro Organism doesn't have legs";
    }

    @Override
    public String leaves() {
        return "Micro Organisms doesn't have leaves";
    }
}
