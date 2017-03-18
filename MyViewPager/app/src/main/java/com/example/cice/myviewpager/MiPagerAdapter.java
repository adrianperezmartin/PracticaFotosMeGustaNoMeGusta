package com.example.cice.myviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by cice on 11/3/17.
 */

public class MiPagerAdapter extends FragmentStatePagerAdapter{

    private final int TOTAL_IMAGENES = 7;

    public MiPagerAdapter (FragmentManager fragmentManager){

        super(fragmentManager);

    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position){
            case 0: fragment = new ScreenFragment1();
                break;
            case 1: fragment = new ScreenFragment2();
                break;
            case 2: fragment = new ScreenFragment3();
                break;
            case 3: fragment = new ScreenFragment4();
                break;
            case 4: fragment = new ScreenFragment5();
                break;
            case 5: fragment = new ScreenFragment6();
                break;
            case 6: fragment = new ScreenFragment7();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return TOTAL_IMAGENES;
    }



    /*@Override
    public CharSequence getPageTitle(int position) {

        if(position==0){
            return "ME GUSTA";
        }else return "NO ME GUSTA";

    }*/




}
