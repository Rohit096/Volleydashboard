package com.example.rohitsingh.dashboard;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button team1;
    Button team2;
    int a=0;
    int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       team1 = (Button) findViewById(R.id.button2);
        team2 = (Button) findViewById(R.id.button3);
        final TextView t=(TextView) findViewById(R.id.textView6);

        team1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                a++;
                TextView ta=(TextView) findViewById(R.id.textView7);
                if (a>=0&&a<=25)
                    ta.setText(""+a);
                else
                {ta.setText("Winner");
                    t.setText("1:0");
                }
            }
            
        });
        team2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
                TextView tb = (TextView) findViewById(R.id.textView8);
                if (b >= 0 && b <= 25)
                    tb.setText(""+b);
                else {
                    tb.setText("Winner");
                    t.setText("0:1");
                }
            }
        });


    }

}

