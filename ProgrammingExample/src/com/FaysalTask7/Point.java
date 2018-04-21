package com.FaysalTask7;

public class Point
{
  public int x=0,y=0;double distance; 
  public void distanceFromOrigin(int p,int q){
     x=x-p;
     y=y-q;
     double value=Math.pow(x,2)+Math.pow(y,2);
     distance=Math.sqrt(value);
  }  
  public String toString()
  {
    return ""+distance;
  }
}
