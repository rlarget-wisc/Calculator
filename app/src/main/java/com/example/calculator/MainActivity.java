package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void showResult(String result) {
        Intent intent = new Intent(this,Result.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int numberInputFromID(int id) {
        EditText numberInput = findViewById(id);
        try { return Integer.parseInt(numberInput.getText().toString()); }
        catch (Exception e){
            Log.i("input error",e.getMessage());
            return 0;
        }
    }

    public void clickAdd(View view) {
        int int1 = numberInputFromID(R.id.firstNumber);
        int int2 = numberInputFromID(R.id.secondNumber);
        showResult(""+(int1+int2));
    }

    public void clickDivide(View view) {
        int int1 = numberInputFromID(R.id.firstNumber);
        int int2 = numberInputFromID(R.id.secondNumber);
        showResult(""+(1.0*int1/int2));
    }

    public void clickSubtract(View view) {
        int int1 = numberInputFromID(R.id.firstNumber);
        int int2 = numberInputFromID(R.id.secondNumber);
        showResult(""+(int1-int2));
    }

    public void clickMultiply(View view) {
        int int1 = numberInputFromID(R.id.firstNumber);
        int int2 = numberInputFromID(R.id.secondNumber);
        showResult(""+(int1*int2));
    }
}