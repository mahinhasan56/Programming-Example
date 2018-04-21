package com.FaysalBinHasanTask1;

public class Square{
  double height, width,area;
  public double getHeight()
  {
    return height;
  }
  public void setHeight(double h){
    height=h;
  }
  public double getWidth (){
     return  width;
  }
  public void setWidth (double w){
    width=w;
    
  }
  public double getArea (){
    area=height*width;
    return area;
  }
}

