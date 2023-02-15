package com.cognizant.shapes;

import java.util.Scanner;

class Rectangle {
   void calculateArea() {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the length of rectangle");
      int length = sc.nextInt();

      System.out.println("enter the bredth of rectangle");
      int bredth = sc.nextInt();
      int area1 = length * bredth;
      System.out.println("area of rectangle " + area1);
   }
}

class AreaCalculator extends Rectangle {
   public static void main(String args[]) {
      AreaCalculator area = new AreaCalculator();
      area.calculateArea();
   }
}
