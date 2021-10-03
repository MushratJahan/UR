package com.example.urms;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreateNewAccount extends AppCompatActivity {
    TextView name,id,password,Cpassword,email;
    EditText ID;
    EditText StudentName;
    EditText Email;
    EditText Password;
    EditText ConfirmPassword;
    Button Signup;
    private Object View;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_new_account);

        id =findViewById(R.id.student_id);
        ID=findViewById(R.id.studentID);
        name = findViewById(R.id.name);
        StudentName=findViewById(R.id.studentName);
        email =findViewById(R.id.emailText);
        Email= findViewById(R.id.email);
        password=(TextView) findViewById(R.id.passText);
        Password=findViewById(R.id.password);
        Cpassword=findViewById(R.id.passwordC);
        ConfirmPassword=findViewById(R.id.passwordConfirm);
        Signup=findViewById(R.id.signUp);


        Signup.setOnClickListener(view -> {
            Intent intent = new Intent(CreateNewAccount.this,LogInPage.class);
            startActivity(intent);

        });

    }
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }


}
