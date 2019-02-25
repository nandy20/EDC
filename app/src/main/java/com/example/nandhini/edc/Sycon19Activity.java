package com.example.nandhini.edc;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Sycon19Activity extends AppCompatActivity implements SyconHomeFragment.OnFragmentInteractionListener,SyconSpeakersFragment.OnFragmentInteractionListener {

    private DrawerLayout mdrawerlayout;
    private ActionBarDrawerToggle mtoggle;

    public boolean onOptionsItemSelected(MenuItem item) {
        if (mtoggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sycon19);

        ViewPager SyconPager = (ViewPager) findViewById(R.id.viewpager);

        Sycon19TabsAdapter adapter = new Sycon19TabsAdapter(this, getSupportFragmentManager());

        SyconPager.setAdapter(adapter);

        TabLayout sycontab = (TabLayout) findViewById(R.id.tabs);

        sycontab.setupWithViewPager(SyconPager);

        mdrawerlayout=(DrawerLayout)findViewById(R.id.drawer);
        mtoggle=new ActionBarDrawerToggle(this,mdrawerlayout,R.string.open,R.string.close);
        mdrawerlayout.addDrawerListener(mtoggle);
        mtoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
