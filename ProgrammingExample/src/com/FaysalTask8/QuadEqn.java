package com.FaysalTask8;

public class QuadEqn {
	   public double var1,var2,var3,equation,eqn1,eqn2,eqn3;
	   // constructor
	   public QuadEqn(double a,double b, double c) {
	      var1 = a;
	      var2 = b;
	      var3 = c;
	      equationMethod();
	      calculateEquation();
	   }
	   // calculate first root
	   public double calculateSolution() {
	      return(-var2+Math.sqrt(equation))/(2.0*var1);
	   }
	   public void  calculateEquation(){
	     eqn1=var1;
	     eqn2=var2;
	     eqn3=var3;
	     System.out.println("the equation is=" + eqn1+"a^2" +"+"+eqn2+"b" +"+"+eqn3+"c");
	     
	   }
	   // check if there are real roots
	   public boolean hasSolution() {
	     if (equation < 0) {
	        return false;
	     }
	     else
	     { 
	       return true;
	     }
	   }
	   // calculate discriminant
	   public void equationMethod() {
	      equation=var2*var2-4.0*var1*var3;
	   }
	}


