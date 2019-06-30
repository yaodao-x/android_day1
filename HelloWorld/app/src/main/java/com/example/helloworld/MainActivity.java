package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    RadioGroup radioGroup;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioGroup radioGroup1;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    Switch swt_xjp;
    Button btn_xjp;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.job_list);
        radioButton1 = findViewById(R.id.radio_button1);
        radioButton2 = findViewById(R.id.radio_button2);
        radioButton3 = findViewById(R.id.radio_button3);
        radioGroup1 = findViewById(R.id.number_list);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        swt_xjp = findViewById(R.id.switch_xjp);
        btn_xjp = findViewById(R.id.button_xjp);
        textView = findViewById(R.id.textView);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                getYourFavorite(checkedId);
            }
        });


        //button监听
        btn_xjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("new world");
                Log.e(TAG, "lol");
            }
        });

        //switch监听
        swt_xjp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setText("turn on");
                    Log.d(TAG, "ischeck");
                } else {
                    textView.setText("turn off");
                    Log.d(TAG, "uncheck");
                }
            }
        });

        //checkbox
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int sum = 0;
                for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                    CheckBox temp = (CheckBox) radioGroup1.getChildAt(i);
                    if (temp.isChecked()) {
                        sum += Integer.parseInt(temp.getText().toString());
                    }
                }
                textView.setText(String.valueOf(sum));
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int sum = 0;
                for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                    CheckBox temp = (CheckBox) radioGroup1.getChildAt(i);
                    if (temp.isChecked()) {
                        sum += Integer.parseInt(temp.getText().toString());
                    }
                }
                textView.setText(String.valueOf(sum));
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int sum = 0;
                for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                    CheckBox temp = (CheckBox) radioGroup1.getChildAt(i);
                    if (temp.isChecked()) {
                        sum += Integer.parseInt(temp.getText().toString());
                    }
                }
                textView.setText(String.valueOf(sum));
            }
        });
    }

    private void getYourFavorite(int buttonId) {
        switch (buttonId) {
            case R.id.radio_button1:
                if (radioButton1.isChecked()) {
                    Log.e(TAG, "你最爱的职业是: " + radioButton1.getText().toString());
                    textView.setText("我是程序员");
                }
                break;
            case R.id.radio_button2:
                if (radioButton2.isChecked()) {
                    Log.e(TAG, "你最爱的职业是: " + radioButton2.getText().toString());
                    textView.setText("我是美食家");
                }
                break;
            case R.id.radio_button3:
                if (radioButton3.isChecked()) {
                    Log.e(TAG, "你最爱的职业是: " + radioButton3.getText().toString());
                    textView.setText("我是作家");
                }
                break;
        }
    }
}
