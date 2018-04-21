package com.FaysalTask6;

import java.util.Scanner;
public class ComplexNumberMain6 {
  public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    ComplexNumber6 obj = new ComplexNumber6(); 
    System.out.println(obj.toString());
    System.out.println(obj.polarRadius(5,3));
  }
}