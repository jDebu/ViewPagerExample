package jdebu.github.io.viewpagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by jose on 17/09/15.
 */
public class SlidePagerAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_PAGES = 5;

    public SlidePagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position) {
        return SlideElement.create(position);
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
