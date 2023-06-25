package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bsin,blog,bln,bb1,bb2,bcos,bAC,bC,b1x,bdiv,btan,b7,b8,b9,bmul,bxfac,b4,b5,b6,bminus,bsqroot,b1,b2,b3,badd,bsquare,bpi,b0,bdec,bequal;
    TextView tvmain,tvsec;
    String pi="3.14159263";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bsin = findViewById(R.id.bsin);
        blog = findViewById(R.id.blog);
        bln = findViewById(R.id.bln);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bcos = findViewById(R.id.bcos);
        bAC = findViewById(R.id.bAC);
        bC = findViewById(R.id.bC);
        b1x = findViewById(R.id.b1x);
        bdiv = findViewById(R.id.bdiv);
        btan = findViewById(R.id.btan);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bmul = findViewById(R.id.bmul);
        bxfac = findViewById(R.id.bxfac);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        bminus = findViewById(R.id.bminus);
        bsqroot=findViewById(R.id.bsqroot);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        badd = findViewById(R.id.badd);
        bsquare = findViewById(R.id.bsquare);
        bpi = findViewById(R.id.bpi);
        b0= findViewById(R.id.b0);
        bdec = findViewById(R.id.bdec);
        bequal = findViewById(R.id.bequal);


        tvmain=findViewById(R.id.tvmain);
        tvsec =findViewById(R.id.tvsec);


        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"sin");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"log");
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"ln");
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"cos");
            }
        });
        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val= tvmain.getText().toString();
                val = val.substring(0,val.length()-1);
                tvmain.setText(val);
            }
        });
        b1x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"1/x");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"/");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"tan");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"9");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"x");
            }
        });
        bxfac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val+"!");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"6");
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        bsqroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"3");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"+");
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d =Double.parseDouble(tvmain.getText().toString());
                double square = d*d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d+"²");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+pi);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"0");
            }
        });
        bdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                String replacedstr= val
                        .replace('÷','/')
                        .replace('x','*');
                double result = eval(replacedstr);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);
            }
        });









    }

    private int factorial(int n) {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);

    }

    private double eval(String str) {
        return new Object(){
            int pos = -1,ch;
            void nextChar(){
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat){
                while (ch == ' ') nextChar();
                if (ch == charToEat){
                    nextChar();
                    return true;

                }
                return false;
            }


            double parse(){
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected:" + (char) ch);
                return x;
            }

            double parseExpression(){
                double x = parseTerm();
                for(; ; ){
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm(){
                double x = parseFactor();
                for(; ; ){
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor(){
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startpos = this.pos;
                if (eat('(')) {
                    x= parseExpression();
                    eat(')');
                }
                else if ((ch>='0' && ch<= '9') || ch=='.'){
                    while ((ch>='0' && ch<= '9') || ch=='.') nextChar();
                    x=Double.parseDouble(str.substring(startpos,this.pos));

                }
                else if (ch>= 'a' && ch<= 'z'){
                    while (ch >= 'a' && ch<= 'z') nextChar();
                    String func = str.substring(startpos,this.pos);
                    x=parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x= Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x= Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x= Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x= Math.log10(x);
                    else if (func.equals("ln")) x= Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func );
                }
                else {
                    throw new RuntimeException("Unexpected: " + (char) ch);

                }

                if (eat('^')) x = Math.pow(x,parseFactor());
                return x;
            }


        }.parse();


    }
}