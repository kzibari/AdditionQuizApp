package com.ak.additionquizapp;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by AK on 03/03/2017.
 */

public class QuestionAnswerBank {
    public final int MAX;
    public static final int MAX_NO_OF_QUESTIONS=10;
    private Set<QuestionAnswer> uniqueQuestions;
    public QuestionAnswerBank(int max){
        MAX=max;
        uniqueQuestions=new HashSet<>();
    }

    public QuestionAnswer getNextQuestion(){
        QuestionAnswer q=new QuestionAnswer(MAX);
        while(!uniqueQuestions.add(q))
            q=new QuestionAnswer(MAX);
        return q;
    }

    public int getNumOfQuestionsCreated(){
        return uniqueQuestions.size();
    }

}
