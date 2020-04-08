package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {


    private TextView tvResult;
    Vibrator vibrator;
    private Deque<String> expression = new LinkedList<String>();
    private String temp = new String();
    private String finalAns = new String();
    private int nBrackets = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnClear, btnFact, btnSum, btnSubtract, btnFinalAns;
        Button btnMultiply, btnDivide, btnDecimal, btnAnswer;
        Button btnNum0, btnNum1, btnNum2, btnNum3, btnNum4, btnNum5;
        Button btnNum6, btnNum7, btnNum8, btnNum9, btnOBracket, btnCBracket;
        tvResult = findViewById(R.id.tv_result);
        btnClear = findViewById(R.id.btn_clear);
        btnFact = findViewById(R.id.btn_fact);
        btnSum = findViewById(R.id.btn_sum);
        btnSubtract = findViewById(R.id.btn_subtract);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnDivide = findViewById(R.id.btn_divide);
        btnDecimal = findViewById(R.id.btn_decimal);
        btnAnswer = findViewById(R.id.btn_answer);
        btnOBracket = findViewById(R.id.btn_open_bracket);
        btnCBracket = findViewById(R.id.btn_close_bracket);
        btnFinalAns = findViewById(R.id.btn_final_ans);
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
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if (!expression.isEmpty() && expression.peekLast().equals("/")) {
                    Display("Cannot Divide By Zero");
                    delQueue();
                }
                else {
                    if (!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")")) && temp.equals("")) {
                        expression.add("*");
                    }
                    if(!expression.isEmpty() && !expression.peekLast().equals("Ans"))
                        temp += "0";
                    else if(expression.isEmpty())
                        temp += "0";
                    showQueue();
                }
            }
        });
        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")"))&&temp.equals(""))
                    expression.add("*");
                if(!expression.isEmpty() && !expression.peekLast().equals("Ans"))
                    temp+="1";
                else if(expression.isEmpty())
                    temp += "1";
                showQueue();
            }
        });
        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")"))&&temp.equals(""))
                    expression.add("*");
                if(!expression.isEmpty() && !expression.peekLast().equals("Ans"))
                    temp+="2";
                else if(expression.isEmpty())
                    temp += "2";
                showQueue();
            }
        });
        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")"))&&temp.equals(""))
                    expression.add("*");
                if(!expression.isEmpty() && !expression.peekLast().equals("Ans"))
                    temp+="3";
                else if(expression.isEmpty())
                    temp += "3";
                showQueue();
            }
        });
        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")"))&&temp.equals(""))
                    expression.add("*");
                if(!expression.isEmpty() && !expression.peekLast().equals("Ans"))
                    temp+="4";
                else if(expression.isEmpty())
                    temp += "4";
                showQueue();
            }
        });
        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")"))&&temp.equals(""))
                    expression.add("*");
                if(!expression.isEmpty() && !expression.peekLast().equals("Ans"))
                    temp+="5";
                else if(expression.isEmpty())
                    temp += "5";
                showQueue();
            }
        });
        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")"))&&temp.equals(""))
                    expression.add("*");
                if(!expression.isEmpty() && !expression.peekLast().equals("Ans"))
                    temp+="6";
                else if(expression.isEmpty())
                    temp += "6";
                showQueue();
            }
        });
        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")"))&&temp.equals(""))
                    expression.add("*");
                if(!expression.isEmpty() && !expression.peekLast().equals("Ans"))
                    temp+="7";
                else if(expression.isEmpty())
                    temp += "7";
                showQueue();
            }
        });
        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")"))&&temp.equals(""))
                    expression.add("*");
                if(!expression.isEmpty() && !expression.peekLast().equals("Ans"))
                    temp+="8";
                else if(expression.isEmpty())
                    temp += "8";
                showQueue();
            }
        });
        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")"))&&temp.equals(""))
                    expression.add("*");
                if(!expression.isEmpty() && !expression.peekLast().equals("Ans"))
                    temp+="9";
                else if(expression.isEmpty())
                    temp += "9";
                showQueue();
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(!expression.isEmpty() && (expression.peekLast().equals("!") || expression.peekLast().equals(")"))&&temp.equals(""))
                    expression.add("*");
                boolean flag = true;
                for(int i=0;i<temp.length();i++)
                    if(temp.charAt(i) == '.')
                        flag = false;
                if(flag && !expression.isEmpty() && !expression.peekLast().equals("Ans"))
                    temp+=".";
                else if(expression.isEmpty())
                    temp += ".";
                showQueue();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(temp.equals("")) {
                    if (!expression.isEmpty())  {
                        String temp1 = expression.removeLast();
                        if(isNum(temp1) && temp1.length()>1)    {
                            temp1 = temp1.substring(0, temp1.length() - 1);
                            expression.add(temp1);
                        }
                    }
                }
                else
                    temp = temp.substring(0, temp.length() - 1);
                showQueue();
            }
        });
        btnClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                vibrator.vibrate(100);
                delQueue();
                showQueue();
                finalAns = "";
                return false;
            }
        });
        btnOBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(isNum(temp)) {
                    expression.add(temp);
                    temp = "";
                }
                if(!expression.isEmpty() &&(isNum(expression.peekLast()) || expression.peekLast().equals("!")))
                    expression.add("*");
                nBrackets++;
                expression.add("(");
                showQueue();
            }
        });
        btnCBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(isNum(temp)) {
                    expression.add(temp);
                    temp = "";
                }
                if(!expression.isEmpty() && (isNum(expression.peekLast()) || expression.peekLast().equals("!")) && nBrackets >0) {
                    expression.add(")");
                    nBrackets--;
                }
                showQueue();
            }
        });
        btnFinalAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(temp.equals("") && !finalAns.equals(""))
                    expression.add("Ans");
                showQueue();
            }
        });
        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(isNum(temp)) {
                    expression.add(temp);
                    temp = "";
                }
                if(!expression.isEmpty() && (isNum(expression.peekLast()) || expression.peekLast().equals(")")))
                    expression.add("!");
                showQueue();
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(isNum(temp)) {
                    expression.add(temp);
                    temp = "";
                }
                if(!expression.isEmpty() && (isNum(expression.peekLast()) || expression.peekLast().equals("!") || expression.peekLast().equals(")")))
                    expression.add("+");
                showQueue();
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(expression.isEmpty() && temp.equals(""))
                    temp = "-"+temp;
                else if(!expression.isEmpty() && expression.peekLast().equals("(") && temp.equals(""))
                    temp = "-"+temp;
                else if(isNum(temp)) {
                    expression.add(temp);
                    temp = "";
                }
                if(!expression.isEmpty() && (isNum(expression.peekLast()) || expression.peekLast().equals("!") || expression.peekLast().equals(")")))
                expression.add("-");
                showQueue();
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(isNum(temp)) {
                    expression.add(temp);
                    temp = "";
                }
                if(!expression.isEmpty() && (isNum(expression.peekLast()) || expression.peekLast().equals("!") || expression.peekLast().equals(")")))
                    expression.add("*");
                showQueue();
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(isNum(temp)) {
                    expression.add(temp);
                    temp = "";
                }
                if(!expression.isEmpty() && (isNum(expression.peekLast()) || expression.peekLast().equals("!") || expression.peekLast().equals(")")))
                    expression.add("/");
                showQueue();
            }
        });
        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(40);
                if(isNum(temp)) {
                    expression.add(temp);
                    temp = "";
                }
                if((!expression.isEmpty() && (isNum(expression.peekLast()) || expression.peekLast().equals("!") || expression.peekLast().equals(")")) && nBrackets == 0)) {
                    finalAns = infixToPostfix();
                    Display(finalAns);
                }
                else if(!finalAns.equals(""))
                    Display(finalAns);
                else
                    Display("Invalid Operation");
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
        Display(output);
    }

    public void Display(String s)   {
        tvResult.setText(s);
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
            case "!": return 3;
            default: return 0;
        }
    }

    public String infixToPostfix()    {
        Queue<String> iToP = new LinkedList<String>();
        Stack<String> opr = new Stack<String>();
        String temp1 = new String();
        while(!expression.isEmpty()) {
            temp1 = expression.remove();
            if(temp1.equals("Ans"))
                iToP.add(finalAns);
            else if (isNum(temp1))
                iToP.add(temp1);
            else if(temp1.equals("("))
                opr.push(temp1);
            else if(temp1.equals(")"))
                while(!opr.empty())	{
                    if(opr.peek().equals("("))	{
                        opr.pop();
                        break;
                    }
                    else
                        iToP.add(opr.pop());
                }
            else	{
                    while(!opr.empty())	{
                        if(priority(opr.peek()) >= priority(temp1))
                            iToP.add(opr.pop());
                        else
                            break;
                    }
                opr.push(temp1);
            }
        }
        while(!opr.empty())
            iToP.add(opr.pop());
        return result(iToP);
    }

    public static String result(Queue<String>postfix)    {
        Stack<String> pSolve = new Stack<String>();
        String temp1 = new String();
        double num1=0, num2=0, ans=0;
        while(!postfix.isEmpty())   {
            temp1 = postfix.remove();
            if(isNum(temp1))
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
        temp1 = pSolve.pop();
        ans = Double.parseDouble(temp1);
        if(ans == (double)(int)ans)
            temp1 = String.valueOf((int)ans);
        return temp1;
    }

    public static double bCalc(String opr, double num1, double num2)    {
        double ans = 0;
        switch(opr) {
            case "+": ans = num2+num1;
                break;
            case "-": ans = num2-num1;
                break;
            case "*": ans = num2*num1;
                break;
            case "/": ans = num2/num1;
                break;
            case "!": ans = fact((int)num1);
                break;
            default: ans = 0;
        }
        ans = Math.round(ans*100.000000)/100.000;
        return ans;
    }

    public static double fact(int num)  {
        long factorial = 1;
        for(int i=2;i<=num;i++)
            factorial*=i;
        return (double)factorial;
    }

    private static boolean isNum(String s) {
        if(s.equals("Ans"))
            return true;
        if (s.length() > 0) {
            if (s.charAt(0) >= '0' && s.charAt(0) <= '9')
                return true;
            else if (s.length() > 1 && ((s.charAt(0) == '-' || s.charAt(0) == '.') && s.charAt(1) >= '0' && s.charAt(1) <= '9'))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}