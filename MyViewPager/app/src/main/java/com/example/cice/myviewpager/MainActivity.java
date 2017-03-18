package com.example.cice.myviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /*Permite la animacion y la transicion entre fragments*/
    private ViewPager viewPager;

    /*Esta clase suministra las vistas a ViewPager*/
    private MiPagerAdapter miPagerAdapter;

    final Button megusta = (Button)findViewById(R.id.megusta);
    final Button nomegusta = (Button)findViewById(R.id.nomegusta);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.miviewpager);
        miPagerAdapter = new MiPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(miPagerAdapter);

    }

    @Override
    public void onBackPressed() {
        if(viewPager.getCurrentItem() == 0){
            super.onBackPressed();//finish
        }else{
            viewPager.setCurrentItem(viewPager.getCurrentItem()-1);
        }
    }




}
