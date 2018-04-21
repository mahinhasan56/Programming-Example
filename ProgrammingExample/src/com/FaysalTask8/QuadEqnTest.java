package com.FaysalTask8;

import java.util.Scanner;
public class QuadEqnTest
{
   public static void main(String[] args)  {
      Scanner k=new Scanner(System.in);  
      System.out.print("Enter value of a ");
      String input = k.nextLine();
      double a = Double.parseDouble(input);
      System.out.print("Enter value of b");
      input = k.nextLine();
      double b = Double.parseDouble(input);
      System.out.print("Enter value of c");
      input = k.nextLine();
      double c = Double.parseDouble(input);
      System.out.println(a+Math.sqrt(a)+b+c);
      QuadEqn obj =new QuadEqn(a, b, c);
      if (a==0)
         System.out.println("it is not an eqn");
      else if (obj.hasSolution()==false)
         System.out.println("Solution are impossible");
      else {
         double solution = obj.calculateSolution();
         System.out.println("Solution="+solution );
      }
   }
}

