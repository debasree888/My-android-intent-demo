package com.example.debasish.myintentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button=findViewById(R.id.button_id);
        textView=findViewById(R.id.tv);
        //setonclicklistener for buuton so that on tapping we can perform some task
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                //because we will show the result data from next activity to this activity
                //the requestcode is significant because it will identify the particular result for particular intent
                startActivityForResult(intent,1);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //check the requestcode with the intentdata and set it to textview
        if(requestCode==1){
            String string=data.getStringExtra("key");
            textView.setText(string);
        }
    }
}
