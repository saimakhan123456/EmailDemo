package com.example.emaildemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonSend;
    EditText textName;
    EditText textEmailId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = (Button)findViewById(R.id.buttonSend);
        textName = (EditText)findViewById(R.id.text1);
        textEmailId = (EditText)findViewById(R.id.text2);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = textName.getText().toString();
                String EmailId = textEmailId.getText().toString();
                String Button = buttonSend.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email,"Choose an Email Client:"));
            }
        });
    }
}
