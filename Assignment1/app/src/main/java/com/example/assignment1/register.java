package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        button1 = findViewById(R.id.button1);
        editText1 = findViewById(R.id.edi1);
        editText2 = findViewById(R.id.edi2);
        editText3 = findViewById(R.id.edi3);
        editText4 = findViewById(R.id.edi4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(register.this,"Registered successfully",Toast.LENGTH_LONG).show();
                mydatabase md = new mydatabase(getApplicationContext());
                md.insertvalues(editText1.getText().toString(),Integer.parseInt(editText2.getText().toString()),editText3.getText().toString(),editText4.getText().toString());
            }
        });

    }
}
