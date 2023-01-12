package com.training.platinum;

public class MethodOverloading
{
    public static void main(String[] args) {
        System.out.println("5ft,11in =" + convertToCentimeters(5,11)+ "cm");
        System.out.println("80in =" + convertToCentimeters(80)+ "cm");
    }
    public static double convertToCentimeters(int inches){
        return inches*2.54;
}
    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters((feet*12) + inches);
    }
}
