package com.example.gauravjha.calculator;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b9, b8, b7, b6, b5, b4, b3, b2, b1, b0, bdot, badd, bsub, bequ,bmul, bdiv, bac;
    EditText ans;
    float val1, val2;
    boolean add, sub, mul, div, v1=false;
    String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b9 = (Button) findViewById(R.id.button9);
        b8 = (Button) findViewById(R.id.button8);
        b7 = (Button) findViewById(R.id.button7);
        b6 = (Button) findViewById(R.id.button6);
        b5 = (Button) findViewById(R.id.button5);
        b4 = (Button) findViewById(R.id.button4);
        b3 = (Button) findViewById(R.id.button3);
        b2 = (Button) findViewById(R.id.button2);
        b1 = (Button) findViewById(R.id.button1);
        b0 = (Button) findViewById(R.id.button0);
        bdot = (Button) findViewById(R.id.buttondot);
        badd = (Button) findViewById(R.id.buttonadd);
        bsub = (Button) findViewById(R.id.buttonsub);
        bmul = (Button) findViewById(R.id.buttonmul);
        bdiv = (Button) findViewById(R.id.buttondiv);
        bequ = (Button) findViewById(R.id.buttomequal);
        bac = (Button) findViewById(R.id.buttonac);

        ans = (EditText) findViewById(R.id.editText);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "9");
                if(v1==true)
                    s+="9";
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "8");
                if(v1==true)
                    s+="8";
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "7");
                if(v1==true)
                    s+="7";
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "6");
                if(v1==true)
                    s+="6";
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "5");
                if(v1==true)
                    s+="5";
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "4");
                if(v1==true)
                    s+="4";
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "3");
                if(v1==true)
                    s+="3";
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "2");
                if(v1==true)
                    s+="2";
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "1");
                if(v1==true)
                    s+="1";
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "0");
                if(v1==true)
                    s+="0";
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + ".");
                if(v1==true)
                    s+=".";
            }
        });


            badd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (ans == null) {
                    /* ans.setText(""); */
                    } else {
                        val1 = Float.parseFloat(ans.getText() + "");
                        v1 = true;
                        add = true;
                        ans.setText(ans.getText() + " + ");
                    }
                }
            });

            bsub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (ans == null) {
                        // ans.setText("");
                    } else {
                        val1 = Float.parseFloat(ans.getText() + "");
                        v1 = true;
                        sub = true;
                        ans.setText(ans.getText() + " - ");
                    }
                }
            });


        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ans == null) {
                    // ans.setText("");
                } else {
                    val1 = Float.parseFloat(ans.getText() + "");
                    v1 = true;
                    mul = true;
                    ans.setText(ans.getText() + " * ");
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ans == null) {
                    // ans.setText("");
                } else {
                    val1 = Float.parseFloat(ans.getText() + "");
                    v1 = true;
                    div = true;
                    ans.setText(ans.getText() + " / ");
                }
            }
        });

            bequ.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    val2 = Float.parseFloat(s + "");
                    s = "";

                    if (add == true) {

                        ans.setText(val1 + val2 + "");
                        add = false;
                    }
                    if (sub == true) {
                        ans.setText(val1 - val2 + "");
                        sub = false;
                    }
                    if (mul == true) {
                        ans.setText(val1 * val2 + "");
                        sub = false;
                    }
                    if (div == true) {
                        try {
                            ans.setText(val1 / val2 + "");
                        }
                        catch (Exception e)
                        {
                            ans.setText("Infinity");
                        }
                        sub = false;
                    }

                }
            });

            bac.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ans.setText("");
                    val1 = 0;
                    val2 = 0;
                    v1 = false;
                    add = false;
                    sub = false;

                }
            });


    }
}