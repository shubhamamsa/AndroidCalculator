package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {


    private TextView tvResult;

    private Queue<String>expression = new LinkedList<String>();
    private Stack<Character> IToP = new Stack<Character>();
    private String temp = new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClear, btnMod, btnFact, btnSum, btnSubtract;
        Button btnMultiply, btnDivide, btnDecimal, btnAnswer;
        Button btnNum0, btnNum1, btnNum2, btnNum3, btnNum4, btnNum5;
        Button btnNum6, btnNum7, btnNum8, btnNum9;
        tvResult = findViewById(R.id.tv_result);
        btnClear = findViewById(R.id.btn_clear);
        btnMod = findViewById(R.id.btn_mod);
        btnFact = findViewById(R.id.btn_fact);
        btnSum = findViewById(R.id.btn_sum);
        btnSubtract = findViewById(R.id.btn_subtract);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivide = findViewById(R.id.btn_divide);
        btnDecimal = findViewById(R.id.btn_decimal);
        btnAnswer = findViewById(R.id.btn_answer);
        btnNum0 = findViewById(R.id.btn_num_0);
        btnNum1 = findViewById(R.id.btn_num_1);
        btnNum2 = findViewById(R.id.btn_num_2);
        btnNum3 = findViewById(R.id.btn_num_3);
        btnNum4 = findViewById(R.id.btn_num_4);
        btnNum5 = findViewById(R.id.btn_num_5);
        btnNum6 = findViewById(R.id.btn_num_6);
        btnNum7 = findViewById(R.id.btn_num_7);
        btnNum8 = findViewById(R.id.btn_num_8);
        btnNum9 = findViewById(R.id.btn_num_9);

        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+="0";
                showQueue();
            }
        });
        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+="1";
                showQueue();
            }
        });
        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+="2";
                showQueue();
            }
        });
        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+="3";
                showQueue();
            }
        });
        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+="4";
                showQueue();
            }
        });
        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+="5";
                showQueue();
            }
        });
        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+="6";
                showQueue();
            }
        });
        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+="7";
                showQueue();
            }
        });
        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+="8";
                showQueue();
            }
        });
        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+="9";
                showQueue();
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp+=".";
                showQueue();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delQueue();
                showQueue();
            }
        });
        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.add(temp);
                temp="";
                expression.add("!");
                showQueue();
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.add(temp);
                temp="";
                expression.add("+");
                showQueue();
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.add(temp);
                temp="";
                expression.add("-");
                showQueue();
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.add(temp);
                temp="";
                expression.add("*");
                showQueue();
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.add(temp);
                temp="";
                expression.add("/");
                showQueue();
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.add(temp);
                temp="";
                expression.add("%");
                showQueue();
            }
        });
    }
    public void showQueue() {
        String output = new String();
        if(expression.isEmpty() && temp == "")
            output = "0";
        else {
            for (String item : expression)
                output += item;
            output = output + temp;
        }
        tvResult.setText(output);
    }

    public void delQueue()  {
        temp = "";
        while(!expression.isEmpty())
            expression.remove();
    }
}
