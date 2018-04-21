package com.FaysalBinHasan15;

//21 33 44 66 11 1 88 45 10 9 
//44 66 88 10
//21 33 44 66 11 1 88 45 10 9 
//0 0 44 66 0 0 88 0 10 0 

public class RemoveOdd{
public static int [] removeOdd (int [] input){
  //Your code here
  int size=input.length;
  int array[]=new int[size];
  for(int i=0;i<size;i++){
    if(input[i]%2==0)
    {    
     array[i]=input[i];
      
    }
  }
  return array;
}
public static void main(String [] args){
  int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
  for (int i = 0; i < mixedArray.length; i++) {
    System.out.print(mixedArray[i] + " ");
  }
  System.out.println();
  int [] noOdd = removeOdd(mixedArray);
  for (int i = 0; i < noOdd.length; i++) {
    System.out.print(noOdd[i] + " ");
  }    
}
}
