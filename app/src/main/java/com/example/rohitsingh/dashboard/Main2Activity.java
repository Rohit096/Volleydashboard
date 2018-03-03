package com.example.rohitsingh.dashboard;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button team1;
    Button team2;
    Button reset;
    Button regain;
    TextView vw;
    int a=0;
    int b=0;
    int a1=0;
    int b1=0;
    public static final String team_a = "a";
    public static final String team_b = "b";
    public static final String set_a = "a1";
    public static final String set_b = "b1";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         final SharedPreferences sharedpreferences= getPreferences(MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedpreferences.edit();




        team1 = (Button) findViewById(R.id.button2);
        team2 = (Button) findViewById(R.id.button3);
        reset =(Button) findViewById(R.id.reset);
        regain = (Button)findViewById(R.id.regain);
        vw=(TextView) findViewById(R.id.view);

        final TextView ta=(TextView) findViewById(R.id.textView7);
        final TextView tb = (TextView) findViewById(R.id.textView8);

        final TextView t=(TextView) findViewById(R.id.textView6);

        team1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                a++;

                if (a>=0&&a<=25) {

                    ta.setText(""+a);
                    editor.putInt(team_a,a);
                    editor.commit();

                }
                else
                {
                    vw.setText("Team A Wins");
                    a1++;
                    t.setText(a1+" : "+b1);

                    a=0;
                    b=0;
                    ta.setText(""+a);
                    tb.setText(""+b);
                    editor.putInt(set_a,a1);
                    editor.putInt(set_b,b1);

                    editor.commit();
                }

            }

        });
        team2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
                if (b >= 0 && b <= 25){
                    tb.setText(""+b);
                    editor.putInt(team_b,b);
                    editor.apply();
                }
                else {
                    vw.setText("Team B Wins");
                    b1++;
                    t.setText(a1+" : "+b1);

                    a=0;
                    b=0;
                    ta.setText(""+a);
                    tb.setText(""+b);
                    editor.putInt(set_a,a1);
                    editor.putInt(set_b,b1);
                    editor.commit();
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ta.setText("0");
                tb.setText("0");
                a1=0;
                b1=0;
                t.setText(a1+" : "+b1);


            }
        });

        regain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp_a=0;
                int temp_b=0;

                a = sharedpreferences.getInt(team_a,0);
                b=sharedpreferences.getInt(team_b,0 );
                ta.setText(""+a);
                tb.setText(""+b);

                temp_a=sharedpreferences.getInt(set_a,0);
                temp_b = sharedpreferences.getInt(set_b, 0);
                t.setText(temp_a+" : "+temp_b);

            }
        });




    }

}


