package com.example.cice.myviewpager;

import android.util.Log;
import android.view.View;

/**
 * Created by Adrian on 17/03/2017.
 */

public class ListenerButtons implements View.OnClickListener{

    private MainActivity mainActivity;

    public ListenerButtons(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.megusta:
                Log.d(getClass().getCanonicalName(),"ME GUSTA");
                break;
            case R.id.nomegusta:
                Log.d(getClass().getCanonicalName(),"NO ME GUSTA");
                break;
        }
    }
}
