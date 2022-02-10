package com.company;

public class Circle {
 static private double PI = Math.PI;
  private int radius;
  public   static void area(int radius){
        System.out.println("площадь окружности:"+PI * (radius * radius));
    }
   public static void circumference(int radius){
        System.out.println("длина окружности:"+PI * 2* radius);
    }
}

