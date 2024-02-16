package com.iamnjabuo;

public class Triangle{

   public void printTriangle(){ 
      int rows = 7;
      for(int row = 0;row < rows;row++){
         for(int col = 0; col < rows - 1;col++){
            System.out.print(" ");
         }
         for(int star = 0; star < row+1;++star){
            System.out.print("*");
         }
         System.out.println();
         rows-=1;
      }
   }
}