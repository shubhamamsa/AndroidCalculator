package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private Button btnClear, btnMod, btnFact, btnSum, btnSubtract;
    private Button btnMultiply, btnDivide, btnDecimal, btnAnswer;
    private Button btnNum0, btnNum1, btnNum2, btnNum3, btnNum4, btnNum5;
    private Button btnNum6, btnNum7, btnNum8, btnNum9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

            }
        });
    }
}
