package com.example.urms;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FirstPage extends AppCompatActivity {
    Button welcome_button;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.first_page);

       welcome_button = findViewById(R.id.welcomeButton);
       welcome_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(FirstPage.this, LogInPage.class);
               startActivity(intent);
           }
       });
   }

}
