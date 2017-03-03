package com.ak.additionquizapp;

import java.util.Random;

/**
 * Created by AK on 03/03/2017.
 */

public class QuestionAnswer {
    private int mOperand1;
    private int mOperand2;
    private int mResult;

    public QuestionAnswer(int max){

        Random num1=new Random();
        Random num2=new Random();
        mOperand1=num1.nextInt(max);
        mOperand2=num2.nextInt(max);
        mResult=mOperand1+mOperand2;
    }
    public int getOperand1(){
        return mOperand1;
    }
    public int getOperand2(){
        return mOperand2;
    }
    public int getResult(){
        return mResult;
    }
    @Override
    public String toString(){
        return mOperand1  + " + " + mOperand1 + " = "+ mResult;
    }
    @Override
    public boolean equals(Object other){

        return (mOperand1==((QuestionAnswer)other).getOperand1() && mOperand2==((QuestionAnswer) other).getOperand2());
    }
}
