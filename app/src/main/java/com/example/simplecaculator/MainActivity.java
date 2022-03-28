package com.example.simplecaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextOperand1, editTextOperand2;
    TextView textViewResult;
    Button btnAdd, btnSub, btnDiv, btnMul, btnLog, btnPow, btnFac;
    Caculator caculator = new Caculator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapping();

    btnAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            long value1 = Integer.parseInt( editTextOperand1.getText().toString());
            long value2 = Integer.parseInt( editTextOperand2.getText().toString());
            long result = caculator.add(value1,value2);
           textViewResult.setText("" + result);

        }
    });

    btnSub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            long value1 = Integer.parseInt( editTextOperand1.getText().toString());
            long value2 = Integer.parseInt( editTextOperand2.getText().toString());
            long result = caculator.sub(value1,value2);
            textViewResult.setText("" + result);
        }
    });

    btnDiv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            long value1 = Integer.parseInt( editTextOperand1.getText().toString());
            long value2 = Integer.parseInt( editTextOperand2.getText().toString());
            long result = caculator.div(value1,value2);
            textViewResult.setText("" + result);
        }
    });

    btnMul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            long value1 = Integer.parseInt( editTextOperand1.getText().toString());
            long value2 = Integer.parseInt( editTextOperand2.getText().toString());
            long result = caculator.mul(value1,value2);
            textViewResult.setText("" + result);
        }
    });

    btnLog.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int value1 = Integer.parseInt( editTextOperand1.getText().toString());
            int value2 = Integer.parseInt( editTextOperand2.getText().toString());
            double result = caculator.log(value1,value2);
            textViewResult.setText("" + result);
        }
    });

    btnPow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            long value1 = Integer.parseInt( editTextOperand1.getText().toString());
            long value2 = Integer.parseInt( editTextOperand2.getText().toString());
            double result = caculator.pow(value1,value2);
            textViewResult.setText("" + result);
        }
    });

    btnFac.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            long value1 = Integer.parseInt( editTextOperand1.getText().toString());
            long result = caculator.fac(value1);
            textViewResult.setText("" + result);
        }
    });
    }


    private void Mapping(){
        editTextOperand1 = (EditText) findViewById(R.id.textViewOperand1);
        editTextOperand2 = (EditText) findViewById(R.id.textViewOperand2);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnLog = (Button) findViewById(R.id.btnLog);
        btnPow = (Button) findViewById(R.id.btnPow);
        btnFac = (Button) findViewById(R.id.btnFac);
    }
}