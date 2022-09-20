package com.example.worksheetpart02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtOp1;
    private EditText edtOp2;
    private Button plus;
    private Button minus;
    private Button mul;
    private Button div;
    private TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  tvAnswer = new TextView(null);

        tvAnswer = (TextView) findViewById(R.id.tvAnswer);
        edtOp1 = (EditText) findViewById(R.id.edtOp1);
        edtOp2 = (EditText) findViewById(R.id.edtOp2);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                result = Double.parseDouble(edtOp1.getText().toString()) +
                        Double.parseDouble(edtOp2.getText().toString());
                tvAnswer.setText(result.toString());
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                result = Double.parseDouble(edtOp1.getText().toString()) -
                        Double.parseDouble(edtOp2.getText().toString());
                tvAnswer.setText(result.toString());


            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                result = Double.parseDouble(edtOp1.getText().toString()) *
                        Double.parseDouble(edtOp2.getText().toString());
                tvAnswer.setText(result.toString());


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                Float denominator;
                try{
                    denominator = Float.parseFloat(edtOp2.getText().toString());
                    if (denominator==0){
                        tvAnswer.setText("Divide by Zero not allowed");
                        return;
                    }
                    result = Double.parseDouble(edtOp1.getText().toString()) /
                            Double.parseDouble(edtOp2.getText().toString());
                    tvAnswer.setText(result.toString());

                }catch (Exception a) {
                    tvAnswer.setText("Division Error");
                }







            }
        });

    }

    public void onClick(View view){
        Double result;
        result = Double.parseDouble(edtOp1.getText().toString()) +
                Double.parseDouble(edtOp2.getText().toString());
        tvAnswer.setText(result.toString());
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();


    }
}