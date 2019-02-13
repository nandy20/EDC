package com.example.nandhini.edc;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Sycon19Activity extends AppCompatActivity implements SyconHomeFragment.OnFragmentInteractionListener,SyconSpeakersFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sycon19);

        ViewPager SyconPager = (ViewPager) findViewById(R.id.viewpager);

        Sycon19TabsAdapter adapter = new Sycon19TabsAdapter(this, getSupportFragmentManager());

        SyconPager.setAdapter(adapter);

        TabLayout sycontab = (TabLayout) findViewById(R.id.tabs);

        sycontab.setupWithViewPager(SyconPager);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
