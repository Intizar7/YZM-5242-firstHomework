package com.najimaddinova.firsthomework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount= 0;
    private TextView mSHowCount;
    private Button btnToast,btnZero;


    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSHowCount = findViewById(R.id.show_count);
        btnToast = findViewById(R.id.toast);
        btnZero = findViewById(R.id.zero);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast toast = Toast.makeText(MainActivity.this, String.valueOf(mCount), Toast.LENGTH_LONG);
              toast.show();
                mSHowCount.setText(String.valueOf(mCount));
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mCount =0;
                    mSHowCount.setText(mCount + "");
                Toast.makeText(MainActivity.this, String.valueOf(mCount), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void countUp(View view) {
        btnZero.setBackgroundColor(Color.GREEN);
        mCount ++;
        if (mSHowCount!= null)
            mSHowCount.setText(Integer.toString(mCount));
    }
}
