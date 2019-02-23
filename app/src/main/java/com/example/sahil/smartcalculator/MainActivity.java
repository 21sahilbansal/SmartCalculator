package com.example.sahil.smartcalculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ans = null;
    private Button btnZero = null;
    private Button btnOne = null;
    private Button btnTwo = null;
    private Button btnThree = null;
    private Button btnFour = null;
    private Button btnFive = null;
    private Button btnSix = null;
    private Button btnSeven = null;
    private Button btnEight = null;
    private Button btnNine = null;
    private Button btnPlus = null;
    private Button btnMinus = null;
    private Button btnMultiply = null;
    private Button btnDivide = null;
    private Button btnEquals = null;
    private Button btnC = null;
    private Button btnDecimal = null;
    private Button btnPerc = null;
    private Button btnSqrRoot = null;


    double var1, var2;
    boolean add, sub, mul, divide, sqrt, prcnt;
    boolean operator = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControls();
    }

    private void initControls() {
        ans = (EditText) findViewById(R.id.txtCalc);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnC = (Button) findViewById(R.id.btnC);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnPerc = (Button) findViewById(R.id.btnPerc);
        btnSqrRoot = (Button) findViewById(R.id.btnSqrRoot);


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText() + "0");
              operator = true;
            }
        });
        btnOne.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText() + "1");
                operator = true;
            }
        });
        btnTwo.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText() + "2");
                operator = true;
            }
        });
        btnThree.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText() + "3");
                operator = true;
            }
        });
        btnFour.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText() + "4");
                operator = true;
            }
        });
        btnFive.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText() + "5");
                operator = true;
            }
        });
        btnSix.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText() + "6");
                operator = true;
            }
        });
        btnSeven.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText() + "7");
                operator = true;
            }
        });
        btnEight.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText() + "8");
                operator = true;
            }
        });
        btnNine.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ans.setText(ans.getText() + "9");
                operator = true;
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checkDecimal = true;
                for(int i = 0;i < ans.getText().length(); i++){
                   if(ans.getText().charAt(i) == '.'){
                       Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
                       checkDecimal =false;
                   }
                }

                if(checkDecimal ){
                ans.setText(ans.getText() + ".");
                operator = true;}

            }
        });
        btnPlus.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if( operator == true){
                var1 = Double.parseDouble(ans.getText() + "");
                add = true;
                ans.setText(null);
                operator = false;
            }}
        });
        btnMinus.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
               if(operator == true){
                var1 = Double.parseDouble(ans.getText() + "");
                sub = true;
                ans.setText(null);
               operator = false;
               }

            }
        });
        btnMultiply.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {
                if(operator == true){
                var1 = Double.parseDouble(ans.getText() + "");
                mul = true;
                ans.setText(null);
                operator = false;
            }}
        });
        btnDivide.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                    if(operator == true){

                var1 = Double.parseDouble(ans.getText() + "");
                divide = true;
                ans.setText(null);
            operator = false;
                    }}
        });
        btnEquals.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                var2 = Double.parseDouble(ans.getText() + "");
                if (add == true) {
                    ans.setText(Double.toString((var1 + var2)));
                    add = false;
                }
                if (sub == true) {
                    ans.setText(Double.toString((var1 - var2)));
                    sub = false;
                }
                if (mul == true) {
                    ans.setText(Double.toString((var1 * var2)));
                    mul = false;
                }

                if (divide == true) {
                    ans.setText(Double.toString((var1 / var2)));
                    divide = false;
                }
                if (prcnt == true) {
                    ans.setText(Double.toString(((var1 * 100) / var2)));
                    prcnt = false;
                }

            }
        });
        btnC.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                ans.setText("");
                var1 = 0;

            }
        });

        btnPerc.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                if(operator == true){

                var1 = Double.parseDouble(ans.getText()+"");
                prcnt = true;
                ans.setText(null);
            operator = false;
                }}
        });
        btnSqrRoot.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                    if(operator == true){
                 ans.setText(Double.toString(Math.sqrt(Double.parseDouble(ans.getText()+""))));

                 operator = false;

            }}
        });

    }



}
