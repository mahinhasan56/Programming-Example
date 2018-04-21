package com.FaysalTask7;

import java.util.Scanner;
public class PointTester{
  public static void main(String[] args){
    Point object= new Point();
    Scanner k=new Scanner (System.in);
//    System.out.println("Enter two coordinates of a point");
    object.distanceFromOrigin(3,4); 
    System.out.println(object.toString());
   
 

  }
}
