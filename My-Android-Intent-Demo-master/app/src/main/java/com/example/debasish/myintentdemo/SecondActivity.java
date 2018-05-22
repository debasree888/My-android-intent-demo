package com.example.debasish.myintentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText=findViewById(R.id.et);
        button=findViewById(R.id.button_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string=editText.getText().toString();
                Intent intent=new Intent(SecondActivity.this,FirstActivity.class);
                intent.putExtra("key",string);
                //time to return the result to the proper requestcode
                setResult(1,intent);
                finish();
            }
        });
    }
}
