package com.ak.additionquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class AdditionQuizActivity extends AppCompatActivity {
    private TextView mQuestion;
    final QuestionAnswerBank obj=new QuestionAnswerBank(10);
    private QuestionAnswer qa;
    private Button[] mAnswers=new Button[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_quiz);

        mQuestion= (TextView) findViewById(R.id.questionTextView);
        mAnswers[0]= (Button) findViewById(R.id.answer1Button);
        mAnswers[1]= (Button) findViewById(R.id.answer2Button);
        mAnswers[2]= (Button) findViewById(R.id.answer3Button);

        resetQuestion();
        mAnswers[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(mAnswers[0].getText().toString())==qa.getResult())
                    Toast.makeText(AdditionQuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(AdditionQuizActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                resetQuestion();

            }
        });
        mAnswers[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(mAnswers[1].getText().toString())==qa.getResult())
                    Toast.makeText(AdditionQuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(AdditionQuizActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                resetQuestion();
            }
        });
        mAnswers[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(mAnswers[2].getText().toString())==qa.getResult())
                    Toast.makeText(AdditionQuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(AdditionQuizActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                resetQuestion();
            }
        });
    }
    private void resetQuestion(){
        if(obj.getNumOfQuestionsCreated()<QuestionAnswerBank.MAX_NO_OF_QUESTIONS) {
            qa = obj.getNextQuestion();
            mQuestion.setText(qa.getOperand1() + " + " + qa.getOperand2() + " ?");

            mAnswers[0].setText((new Random()).nextInt(100) + "");
            mAnswers[1].setText((new Random()).nextInt(100) + "");
            mAnswers[2].setText((new Random()).nextInt(100) + "");
            mAnswers[(new Random()).nextInt(3)].setText(qa.getResult() + "");
        }
        else
            Toast.makeText(AdditionQuizActivity.this, "No more questions available in the bank!", Toast.LENGTH_SHORT).show();

    }

}
