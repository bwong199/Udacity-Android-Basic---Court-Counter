package com.benwong.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button homeOnePtnBtn;
    private Button homeTwoPtnBtn;
    private Button homeThreePtnBtn;
    private Button awayOnePtnBtn;
    private Button awayTwoPtnBtn;
    private Button awayThreePtnBtn;
    private Button resetBtn;
    private TextView homePt;
    private TextView awayPt;

    public int homePoints;
    public int awayPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeOnePtnBtn = (Button)findViewById(R.id.homeOnePtBtn);
        homeTwoPtnBtn = (Button)findViewById(R.id.homeTwoPtBtn);
        homeThreePtnBtn = (Button)findViewById(R.id.homeThreePtBtn);
        awayOnePtnBtn = (Button)findViewById(R.id.awayOnePtnBtn);
        awayTwoPtnBtn = (Button)findViewById(R.id.awayTwoPtnBtn);
        awayThreePtnBtn = (Button)findViewById(R.id.awayThreePtnBtn);
        resetBtn = (Button)findViewById(R.id.resetBtn);
        homePt = (TextView)findViewById(R.id.homePtTV);
        awayPt = (TextView)findViewById(R.id.awayPtTV);


        homeOnePtnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homePoints += 1;
                System.out.println("Home Points " + homePoints);
                homePt.setText(String.valueOf(homePoints));

            }
        });

        homeTwoPtnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homePoints += 2;
                homePt.setText(String.valueOf(homePoints));
            }
        });

        homeThreePtnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homePoints += 3;
                homePt.setText(String.valueOf(homePoints));
            }
        });

        awayOnePtnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awayPoints += 1;
                awayPt.setText(String.valueOf(awayPoints));

            }
        });

        awayTwoPtnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awayPoints += 2;
                awayPt.setText(String.valueOf(awayPoints));
            }
        });

        awayThreePtnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awayPoints += 3;
                awayPt.setText(String.valueOf(awayPoints));
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homePoints = 0;
                awayPoints = 0;
                homePt.setText(String.valueOf(homePoints));
                awayPt.setText(String.valueOf(awayPoints));
            }
        });
    }
}
