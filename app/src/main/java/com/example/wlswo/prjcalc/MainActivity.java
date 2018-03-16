package com.example.wlswo.prjcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btPlus, btMinus, btMultiply, btDivide;
    TextView txtResult;
    int num1, num2;
    String temp1, temp2;
    double db1, db2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        txtResult = findViewById(R.id.textResult);

        btPlus = findViewById(R.id.btPlus);
        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp1 = edit1.getText().toString();
                temp2 = edit2.getText().toString();
                num1 = Integer.parseInt(temp1);
                num2 = Integer.parseInt(temp2);
                result = num1 + num2;
                txtResult.setText(result + "");
            }
        });

        btMinus = findViewById(R.id.btMinus);
        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp1 = edit1.getText().toString();
                temp2 = edit2.getText().toString();
                num1 = Integer.parseInt(temp1);
                num2 = Integer.parseInt(temp2);
                result = num1 - num2;
                txtResult.setText(result + "");
            }
        });

        btMultiply = findViewById(R.id.btMultiply);
        btMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp1 = edit1.getText().toString();
                temp2 = edit2.getText().toString();
                num1 = Integer.parseInt(temp1);
                num2 = Integer.parseInt(temp2);
                result = num1 * num2;
                txtResult.setText(result + "");
            }
        });

        btDivide = findViewById(R.id.btDivide);
        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp1 = edit1.getText().toString();
                temp2 = edit2.getText().toString();
                db1 = Double.parseDouble(temp1);
                db2 = Double.parseDouble(temp2);
                result = db1 / db2;
                txtResult.setText(result + "");
            }
        });
    };
}
