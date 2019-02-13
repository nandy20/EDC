package com.example.nandhini.edc;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Sycon19TabsAdapter extends FragmentPagerAdapter {

    private Context mContext;

    int NoOfTabs;
    public Sycon19TabsAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        NoOfTabs = 2;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SyconHomeFragment();
        } else if (position == 1) {
            return new SyconSpeakersFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return NoOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.sycon_home);
        } else if (position == 1) {
            return mContext.getString(R.string.sycon_speakers);
        }
        else
            return mContext.getString(R.string.defaultstr);
    }
}

