package com.example.demo;

public class Factorize {

    public static String answer(int input) {
        String answers = "[";
        int input_tmp = input;
        while(true){
            for(int i=2;i<=input_tmp;i++){
                if(input_tmp%i==0){
                    answers = answers + i;
                    input_tmp = input_tmp/i;
                    break;
                }
            }
            if(input_tmp<=1) break;
            else answers = answers + ",";
        }
        answers = answers + "]";
        return answers;
    }
}