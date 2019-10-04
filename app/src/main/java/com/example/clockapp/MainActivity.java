package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public ConstraintLayout sydney;
    public ConstraintLayout paris;
    public ConstraintLayout london;
    public ConstraintLayout beijing;
    public ConstraintLayout newyork;
    public TextView location;
    public ImageView locationPic;
    public ImageView backgroundPic;
    public TextView currentTime;
    public TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    //sydney
        sydney = findViewById(R.id.city1);
        location = sydney.findViewById(R.id.cityname);
        location.setText("SYDNEY");
        info = sydney.findViewById(R.id.information);
        info.setText("Current Time");
        locationPic = sydney.findViewById(R.id.cityphoto);
        locationPic.setImageResource(R.drawable.syd);
        backgroundPic = findViewById(R.id.background);
        backgroundPic.setImageResource(R.drawable.rectangle);

    //paris
        paris = findViewById(R.id.city2);
        location = paris.findViewById(R.id.cityname);
        location.setText("PARIS");
        info = paris.findViewById(R.id.information);
        info.setText("8 hours behind");
        locationPic = paris.findViewById(R.id.cityphoto);
        locationPic.setImageResource(R.drawable.paris2);
        backgroundPic = findViewById(R.id.background);
        backgroundPic.setImageResource(R.drawable.rectangle);

        //newyork
        newyork = findViewById(R.id.city3);
        location = newyork.findViewById(R.id.cityname);
        location.setText("NEW YORK");
        locationPic = newyork.findViewById(R.id.cityphoto);
        info = newyork.findViewById(R.id.information);
        info.setText("14 hours behind");
        locationPic.setImageResource(R.drawable.newyork);
        backgroundPic = findViewById(R.id.background);
        backgroundPic.setImageResource(R.drawable.rectangle);

        //london
        london = findViewById(R.id.city4);
        location = london.findViewById(R.id.cityname);
        location.setText("LONDON");
        info = london.findViewById(R.id.information);
        info.setText("9 hours behind");
        locationPic = london.findViewById(R.id.cityphoto);
        locationPic.setImageResource(R.drawable.paris);
        backgroundPic = findViewById(R.id.background);
        backgroundPic.setImageResource(R.drawable.rectangle);

        //beijing
        beijing = findViewById(R.id.city5);
        location = beijing.findViewById(R.id.cityname);
        location.setText("BEIJING");
        info = beijing.findViewById(R.id.information);
        info.setText("2 hours behind");
        locationPic = beijing.findViewById(R.id.cityphoto);
        locationPic.setImageResource(R.drawable.beijingf);
        backgroundPic = findViewById(R.id.background);
        backgroundPic.setImageResource(R.drawable.rectangle);
    }

    public void get24CurrentTime(View view) {

        //sydney time
            Calendar syd = Calendar.getInstance();
            SimpleDateFormat mdformatS = new SimpleDateFormat("HH:mm:ss");
            String strDateS = "" + mdformatS.format(syd.getTime());
            currentTime = sydney.findViewById(R.id.time);
            currentTime.setText(strDateS);

            //paris time
        Calendar par = Calendar.getInstance();
        par.add(Calendar.HOUR, -8);
        SimpleDateFormat mdformatP = new SimpleDateFormat("HH:mm:ss");
        String strDateP = "" + mdformatP.format(par.getTime());
        currentTime = paris.findViewById(R.id.time);
        currentTime.setText(strDateP);

        //new york time
        Calendar ny = Calendar.getInstance();
        ny.add(Calendar.HOUR, -14);
        SimpleDateFormat mdformatN = new SimpleDateFormat("HH:mm:ss");
        String strDateN = "" + mdformatN.format(ny.getTime());
        currentTime = newyork.findViewById(R.id.time);
        currentTime.setText(strDateN);

        //london time
        Calendar ld = Calendar.getInstance();
        ld.add(Calendar.HOUR, -14);
        SimpleDateFormat mdformatL = new SimpleDateFormat("HH:mm:ss");
        String strDateL = "" + mdformatL.format(ld.getTime());
        currentTime = london.findViewById(R.id.time);
        currentTime.setText(strDateL);

        //beijing time
        Calendar bj = Calendar.getInstance();
        ld.add(Calendar.HOUR, -14);
        SimpleDateFormat mdformatB = new SimpleDateFormat("HH:mm:ss");
        String strDateB = "" + mdformatB.format(bj.getTime());
        currentTime = beijing.findViewById(R.id.time);
        currentTime.setText(strDateB);
    }

    public void get12CurrentTime(View view){
        //sydney time
        Calendar syd = Calendar.getInstance();
        SimpleDateFormat mdformatS = new SimpleDateFormat("hh:mm:ss a");
        String strDateS = "" + mdformatS.format(syd.getTime());
        currentTime = sydney.findViewById(R.id.time);
        currentTime.setText(strDateS);

        //paris time
        Calendar par = Calendar.getInstance();
        par.add(Calendar.HOUR, -8);
        SimpleDateFormat mdformatP = new SimpleDateFormat("hh:mm:ss a");
        String strDateP = "" + mdformatP.format(par.getTime());
        currentTime = paris.findViewById(R.id.time);
        currentTime.setText(strDateP);

        //new york time
        Calendar ny = Calendar.getInstance();
        ny.add(Calendar.HOUR, -14);
        SimpleDateFormat mdformatN = new SimpleDateFormat("hh:mm:ss a");
        String strDateN = "" + mdformatN.format(ny.getTime());
        currentTime = newyork.findViewById(R.id.time);
        currentTime.setText(strDateN);

        //london time
        Calendar ld = Calendar.getInstance();
        ld.add(Calendar.HOUR, -14);
        SimpleDateFormat mdformatL = new SimpleDateFormat("hh:mm:ss a");
        String strDateL = "" + mdformatL.format(ld.getTime());
        currentTime = london.findViewById(R.id.time);
        currentTime.setText(strDateL);

        //beijing time
        Calendar bj = Calendar.getInstance();
        ld.add(Calendar.HOUR, -14);
        SimpleDateFormat mdformatB = new SimpleDateFormat("hh:mm:ss a");
        String strDateB = "" + mdformatB.format(bj.getTime());
        currentTime = beijing.findViewById(R.id.time);
        currentTime.setText(strDateB);
    }
}
