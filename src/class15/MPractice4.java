package class15;

import java.sql.SQLOutput;

public class MPractice4 {

    /*
    create a method that takes two numbers as parameters and return the larger number
     */
// If I want to create a method i first need to :
    // return type is int
    //return name largerNumber it can be anything
    // parameters=> int num1, int num2

  int largerNumber(int num1,int num2){
      if(num1>num2){
          return num1;

      }else{
          return num2;
      }
  }

    public static void main(String[] args) {
      // this is how we call the method
      MPractice4 mp= new MPractice4();
        System.out.println(mp.largerNumber(12,13));



    }

        }


