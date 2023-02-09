package com.improve10x.questionnaire;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ComponentsActivity extends AppCompatActivity {
    Button radioBtn;
    Button checkBoxBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        handleIntiViews();
        handleRadioBtn();
        handleCheckBox();

    }

    private void handleCheckBox() {
        checkBoxBtn.setOnClickListener(view -> {
            handleNavigateToCheckBoxActivity();
        });
    }

    private void handleNavigateToCheckBoxActivity() {
        Intent intent = new Intent(this, CheckBoxActivity.class);
        startActivity(intent);
    }

    private void handleRadioBtn() {
        radioBtn.setOnClickListener(view -> {
            handleNavigateToRadioBtnActivity();
        });

    }

    private void handleNavigateToRadioBtnActivity() {
        Intent intent = new Intent(this,RadioButtonsActivity.class);
        startActivity(intent);
    }

    private void handleIntiViews() {
        radioBtn = findViewById(R.id.radio_btn);
        checkBoxBtn = findViewById(R.id.checkbox_btn);

    }

}