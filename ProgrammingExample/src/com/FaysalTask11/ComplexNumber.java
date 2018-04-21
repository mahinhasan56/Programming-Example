package com.FaysalTask11;

public class ComplexNumber extends RealNumber {
	 public double imaginarypart;
	  public ComplexNumber(){
	    
	   setImaginaryPart(1); 
	  }
	  public ComplexNumber(double r,double p){
	    super(r);
	    setImaginaryPart(p);
	  }
	  public void setImaginaryPart(double i){
	    imaginarypart=i;
	  }
	  public double getImaginaryPart(){
	    return imaginarypart;
	  }
	  public String toString(){
	    return super.toString()+"\nImaginaryPart:"+imaginarypart;
	  }
	  public void check(){
	  System.out.println("I am in complex number class");
	  ping();
	  System.out.println("Checking ended");
	  }
}
