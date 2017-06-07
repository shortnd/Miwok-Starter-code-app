package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {


    public SimpleFragmentPagerAdapter(FragmentManager fm) { super(fm);}

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new NumbersFragment();
        } else if (i == 1) {
            return  new FamilyFragment();
        } else if (i == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
