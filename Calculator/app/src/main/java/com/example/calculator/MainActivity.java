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
        btnClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                delQueue();
                showQueue();
                return false;
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
        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression.add(temp);
                temp = "";
                infixToPostfix();
                showQueue();
            }
        });
    }
    public void showQueue() {
        String output = new String();
        if(expression.isEmpty() && temp.equals(""))
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

    private int priority(String a)    {
        switch(a)   {
            case "+": return 1;
            case "-": return 1;
            case "*": return 2;
            case "/": return 2;
            default: return 0;
        }
    }

    public void infixToPostfix()    {
        Queue<String> iToP = new LinkedList<String>();
        Stack<String> opr = new Stack<String>();
        String temp1 = new String();
        while(!expression.isEmpty()) {
            temp1 = expression.remove();
            if (temp1.charAt(0) >= '0' && temp1.charAt(0) <= '9')
                iToP.add(temp1);
            else if(temp1.equals("("))
                opr.push(temp1);
            else if(temp1.equals(")"))
                while(!opr.empty())	{
                    if(opr.peek().equals("("))	{
                        opr.pop();
                        break;
                    }
                    else	{
                        iToP.add(opr.peek());
                        opr.pop();
                    }
                }
            else	{
                    while(!opr.empty() && priority(opr.peek()) >= priority(temp1))	{
                        iToP.add(opr.peek());
                        opr.pop();
                    }
                opr.push(temp1);
            }
        }
        while(!opr.empty())	{
            iToP.add(opr.peek());
            opr.pop();
        }
        expression.add(result(iToP));
    }

    public static String result(Queue<String>postfix)    {
        Stack<String> pSolve = new Stack<String>();
        String temp1 = new String();
        double num1=0, num2=0, ans=0;
        while(!postfix.isEmpty())   {
            temp1 = postfix.remove();
            if(temp1.charAt(0)>='0' && temp1.charAt(0)<='9')
                pSolve.push(temp1);
            else if(temp1.equals("!"))   {
                num1 = Double.parseDouble(pSolve.pop());
                ans = bCalc(temp1, num1, 0);
                pSolve.push(String.valueOf(ans));
            }
            else    {
                num1 = Double.parseDouble(pSolve.pop());
                num2 = Double.parseDouble(pSolve.pop());
                ans = bCalc(temp1, num1, num2);
                pSolve.push(String.valueOf(ans));
            }
        }
        return pSolve.pop();
    }

    public static double bCalc(String opr, double num1, double num2)    {
        double ans = 0.0;
        switch(opr) {
            case "+": ans = num2+num1;
                break;
            case "-": ans = num2-num1;
                break;
            case "*": ans = num2*num1;
                break;
            case "/": ans = num2/num1;
                break;
            case "%": ans = num2%num1;
                break;
            case "!": ans = fact((int)num1);
                break;
            default: ans = 0;
        }
        return ans;
    }

    public static long fact(int num)  {
        long factorial = 1;
        for(int i=2;i<=num;i++)
            factorial*=i;
        return factorial;
    }
}