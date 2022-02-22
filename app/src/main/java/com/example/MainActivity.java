package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText nameField;
    EditText usernameField;
    EditText emailField;
    EditText passwordField;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btn;
    String gender;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nameField = findViewById(R.id.nameField);
        usernameField = findViewById(R.id.usernameField);
        emailField = findViewById(R.id.emailField);
        passwordField = findViewById(R.id.passwordField);
        radioGroup = findViewById(R.id.radioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(selectedId);
        btn = findViewById(R.id.btn);







        Editable name = nameField.getText();
        Editable user = usernameField.getText();
        Editable email = emailField.getText();
        Editable password = passwordField.getText();
        if(selectedId == 0){
             gender = radioButton.getText().toString();


        }
        spinner = findViewById(R.id.spinner);
        String[] location = {"Dhaka", "Rajshahi", "bogura"};
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,location);
        spinner.setAdapter(adapter);







        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("Name = "+name+" User = "+user+" Email = "+email+" Password = "+password+" Gender = "+gender);
            }
        });
    }


}