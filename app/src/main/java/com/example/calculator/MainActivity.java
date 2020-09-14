package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonClear,buttonAdd,buttonPercent,buttonSubtract,buttonMultiply,buttonBackSpace,buttonDivide,buttonDot,buttonEqual;
    private TextView textView,textview1;
    private double first;
    private double second;
    private double result;
    private String Operation;
    private String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        button0=findViewById(R.id.button0);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        buttonAdd=findViewById(R.id.buttonAdd);
        buttonSubtract=findViewById(R.id.buttonSubtract);
        buttonMultiply=findViewById(R.id.buttonMultiply);
        buttonDivide=findViewById(R.id.buttonDivide);
        buttonPercent=findViewById(R.id.buttonPercent);
        buttonDot=findViewById(R.id.buttonDot);
        buttonClear=findViewById(R.id.buttonClear);
        buttonBackSpace=findViewById(R.id.buttonBackSpace);
        buttonEqual=findViewById(R.id.buttonEqual);
        textView=findViewById(R.id.textview);
        textview1=findViewById(R.id.textview1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+button1.getText().toString();
                textView.setText(text);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+button2.getText().toString();
                textView.setText(text);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+button3.getText().toString();
                textView.setText(text);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+button4.getText().toString();
                textView.setText(text);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+button5.getText().toString();
                textView.setText(text);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+button6.getText().toString();
                textView.setText(text);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+button7.getText().toString();
                textView.setText(text);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+button8.getText().toString();
                textView.setText(text);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+button9.getText().toString();
                textView.setText(text);

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+button0.getText().toString();
                textView.setText(text);

            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textView.getText().toString()+buttonDot.getText().toString();
                textView.setText(text);

            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               textView.setText(null);

            }
        });
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary ;
                first=Double.parseDouble((String) textView.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
               // textview1.setText((int) first);
                textView.setText("");
                Operation="%";

            }
        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary ;
                first=Double.parseDouble((String) textView.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
              //  textview1.setText((int) first);
                textView.setText("");
                Operation="-";

            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary ;
                first=Double.parseDouble((String) textView.getText());
                primary=String.format("%.2f",first);
                textview1.setText(primary);
              //  textview1.setText((int) first);
                textView.setText("");
                Operation="/";

            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first=Double.parseDouble((String) textView.getText());
                textView.setText("");
                Operation="*";
                primary=String.format("%.2f",first);
                textview1.setText(primary);


            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary ;
                first=Double.parseDouble((String) textView.getText());
               // textview1.setText((int) first);
                primary=String.format("%.2f",first);
                textview1.setText(primary);

                textView.setText("");
                Operation="+";
            }
        });
        buttonBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String BackSpace= null;
                if(textView.getText().length()>0){
                    StringBuilder stringBuilder= new StringBuilder(textView.getText());
                    stringBuilder.deleteCharAt(textView.getText().length()-1);
                    BackSpace=stringBuilder.toString();
                    textView.setText(BackSpace);
                }

            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second=Double.parseDouble((String) textView.getText());
                if(Operation=="+")
                {
                    result=first+second;
                    answer=String.format("%.2f",result);
                    textView.setText(answer);
                   textview1.setText(null);
                }
                else if(Operation=="-")
                {
                    result=first-second;
                    answer=String.format("%.2f",result);
                    textView.setText(answer);
                   textview1.setText(null);
                }
               else  if(Operation=="*")
                {
                    result=first*second;
                    answer=String.format("%.2f",result);
                    textView.setText(answer);
                    textview1.setText(null);

                }
                else if(Operation=="/")
                {
                    result=first/second;
                    answer=String.format("%.2f",result);
                    textView.setText(answer);
                   textview1.setText(null);
                }
                else if(Operation=="%")
                {
                    result=first%second;
                    answer=String.format("%.2f",result);
                    textView.setText(answer);
                  textview1.setText(null);
                }

            }
        });

    }
}
