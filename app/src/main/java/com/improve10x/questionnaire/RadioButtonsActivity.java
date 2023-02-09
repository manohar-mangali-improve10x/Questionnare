package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonsActivity extends AppCompatActivity {
    Button verifyBtn;
    RadioGroup planetsRg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttons);
        handleIntiViews();
        handleVerifyButton();

    }

    private void handleVerifyButton() {
        verifyBtn.setOnClickListener(v -> {
            boolean result = isCorrect();
            showResult(result);
        });
    }

    private void showResult(boolean result) {
        if (isCorrect()) {
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Sorry Wrong Answer", Toast.LENGTH_SHORT).show();
        }

    }

    private boolean isCorrect() {
        int selectRb = planetsRg.getCheckedRadioButtonId();
        boolean result = false;
        if (selectRb == R.id.eight_rb){
            result = true;
        }
        return result;
    }

    private void handleIntiViews() {
      verifyBtn = findViewById(R.id.verify_btn);
      planetsRg = findViewById(R.id.planets_rg);
    }
}