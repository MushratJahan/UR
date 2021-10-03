package com.example.urms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.urms.ui.home.HomeFragment;

public class LogInPage extends AppCompatActivity {
    TextView StudentID, IdPassword;
    EditText ID;
    EditText Password;
    Button Login, CreateNewPassword, ForgotPassword;
    DBHelper DB;
    private Object View;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        StudentID = (TextView) findViewById(R.id.student_ID);
        ID=(EditText) findViewById(R.id.studentID);
        IdPassword =(TextView) findViewById(R.id.Id_password);
        Password=(EditText)findViewById(R.id.password);
        CreateNewPassword=(Button) findViewById(R.id.crateNew_account);
        Login=(Button)findViewById(R.id.logIN);
        ForgotPassword=(Button) findViewById(R.id.forgot_password);
        DB = new DBHelper(this);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String users = ID.getText().toString();
                String pass =Password.getText().toString();

                if(users.equals("")||pass.equals(""))
                Toast.makeText(LogInPage.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    boolean checkusers = false;
                    if (pass == "1234") {
                    }
                    if (checkusers == false) {
                        Boolean insert = DB.insertData(users, pass);
                    }

                    boolean insert = false;
                    if (insert) {
                        Toast.makeText(LogInPage.this, "Login successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(LogInPage.this, "Reistration failed", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        }

    public void buttonClicked(View view) {

        if (view.getId() == R.id.crateNew_account) {
            Intent intent = new Intent(LogInPage.this, CreateNewAccount.class);
            startActivity(intent);
        } else if (view.getId() == R.id.logIN) {

            Intent intent = new Intent(LogInPage.this, HomeFragment.class);
            startActivity(intent);
        } else if (view.getId() == R.id.forgot_password) {
            Intent intent = new Intent(LogInPage.this, Forgot_Password.class);
            startActivity(intent);
        }

    }



}

