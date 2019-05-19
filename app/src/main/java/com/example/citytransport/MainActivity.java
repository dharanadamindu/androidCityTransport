package com.example.citytransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_routeFind;
//    private Button btn_timeTable;
    private Button btn_busRoutes;
    private Button btn_aboutUs;
    private Button btn_help;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_routeFind = findViewById(R.id.btn_findRoute);
        btn_routeFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFindRoute();
            }
        });

//        btn_timeTable = findViewById(R.id.btn_timeTable);
//        btn_timeTable.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openTimeTable();
//            }
//        });

        btn_busRoutes = findViewById(R.id.btn_busRoutes);
        btn_busRoutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBusRoutes();
            }
        });

        btn_aboutUs = findViewById(R.id.btnAboutUs);
        btn_aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutUs();
            }
        });

        btn_help = findViewById(R.id.btnHelp);
        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }
        });
    }

    public void openFindRoute(){
        Intent int1 = new Intent(MainActivity.this,FindRoute.class);
        startActivity(int1);
    }

    public void openTimeTable(){
        Intent int2 = new Intent(MainActivity.this,TimeTable.class);
        startActivity(int2);
    }

    public void openBusRoutes(){
        Intent int3 = new Intent(MainActivity.this,BusRoutes.class);
        startActivity(int3);
    }

    public void openAboutUs(){
        Intent int4 = new Intent(MainActivity.this,AboutUs.class);
        startActivity(int4);
    }

    public void openHelp(){
        Intent int5 = new Intent(MainActivity.this,Help.class);
        startActivity(int5);
    }
}
