package com.example.demo;

public class FizzBuzz {

    public String get(int input){

//        if(input==3) return "Fizz";
//        if(input==5) return "Buzz";
//        if(input==6) return "Fizz";
//        if(input==9) return "Fizz";
//        if(input==10) return "Buzz";
//        if(input==15) return "FizzBuzz";

//        if((input%3==0)&&(input%5==0)) return "FizzBuzz";
//        if(input%3==0) return "Fizz";
//        if(input%5==0) return "Buzz";

        int[] numChecks = {15,3,5};
        String[] outputs = {"FizzBuzz","Fizz","Buzz"};
        for(int i=0;i<3;i++){
            if(input%numChecks[i]==0) return outputs[i];
        }

        return "" + input;

//        return String.valueOf(input);

//        return ((input%3==0)&&(input%5==0))?"FizzBuzz":((input%3==0)?"Fizz":((input%5==0)?"Buzz":String.valueOf((input))));
    }
}
