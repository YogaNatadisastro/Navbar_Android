package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        drawerLayout=findViewById(R.id.drawer_layout);

    }

    public void  ClickMenu(View view){
        MainActivity.openDrawer(drawerLayout);
    }
    public void ClickLogo(View viw){
        MainActivity.closeDrawer(drawerLayout);
    }
    public void Clickhome(View view){
        MainActivity.redirectActivity(this,MainActivity.class);
    }
    public void clickDashboard(View view){
        MainActivity.redirectActivity(this,Dashboard.class);
    }
    public void clickAboutUs(View view){
        recreate();
    }
    public void  ClickLogout(View view){
        MainActivity.logout(this);
    }
    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }
}