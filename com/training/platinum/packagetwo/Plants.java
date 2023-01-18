package com.training.platinum.packagetwo;

import com.training.platinum.packageone.LivingThing;

public class Plants extends LivingThing {
    @Override
    public String legs() {
        return "Plants doesn't have legs";
    }

    @Override
    public String leaves() {
        return "Plants have Leaves";
    }
}
