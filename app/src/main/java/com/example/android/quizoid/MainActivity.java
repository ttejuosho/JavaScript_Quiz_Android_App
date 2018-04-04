package com.example.android.quizoid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void answerCheck(View view){
        boolean checked =( (RadioButton) view ).isChecked();

        switch (view.getId()){
            case R.id.q1Answer:
                if (checked) {
                    score = score + 1;
                } else {
                    score = score;
                }

            case R.id.q2Answer:
                if (checked) {
                    score = score + 1;
                } else {
                    score = score;
                }

            case R.id.q3Answer:
                if (checked) {
                    score = score + 1;
                } else {
                    score = score;
                }

            case R.id.q4Answer:
                if (checked) {
                    score = score + 1;
                } else {
                    score = score;
                }

            case R.id.q5Answer:
                if (checked) {
                    score = score + 1;
                } else {
                    score = score;
                    break;
                }
        }
    }
}
