package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nameField;
    EditText usernameField;
    EditText emailField;
    EditText passwordField;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nameField = findViewById(R.id.nameField);
        usernameField = findViewById(R.id.usernameField);
        emailField = findViewById(R.id.emailField);
        passwordField = findViewById(R.id.passwordField);
        btn = findViewById(R.id.btn);


        Editable name = nameField.getText();
        Editable user = usernameField.getText();
        Editable email = emailField.getText();
        Editable password = passwordField.getText();





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Name = "+name+" User = "+user+" Email = "+email+" Password = "+password);
            }
        });
    }


}