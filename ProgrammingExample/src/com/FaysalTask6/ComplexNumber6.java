package com.FaysalTask6;

public class ComplexNumber6 {
	public  int imaginarypart, realpart;
	  public ComplexNumber6(){
	  }
	  public void setComplexNumber( int i,int r){
	    imaginarypart=i;
	    realpart=r;
	  }
	  public int getComplexNumber(){
	    return  imaginarypart+realpart;
	  }
	  public  int polarRadius(int r,int im){
	  
	    System.out.println( Math.pow(((r*r)+(im*im)),(1/2)));
	    return r;
	  }
	   public String toString(){
	       return "(" +imaginarypart + "," +  realpart + ")";
	   }
}
