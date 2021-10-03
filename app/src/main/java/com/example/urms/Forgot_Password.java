package com.example.urms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Forgot_Password extends AppCompatActivity {
    TextView id, password, Cpassword;
    EditText ID;
    EditText Password;
    EditText ConfirmPassword;
    Button ConfirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_new_account);
        id = findViewById(R.id.student_id);
        ID = findViewById(R.id.studentID);
        password = (TextView) findViewById(R.id.passText);
        Password = findViewById(R.id.password);
        Cpassword = findViewById(R.id.passwordC);
        ConfirmPassword = findViewById(R.id.passwordConfirm);
        ConfirmButton = findViewById(R.id.confirmButton);

        ConfirmButton.setOnClickListener(view -> {
            Intent intent = new Intent(Forgot_Password.this, LogInPage.class);
            startActivity(intent);

        });

    }
}
