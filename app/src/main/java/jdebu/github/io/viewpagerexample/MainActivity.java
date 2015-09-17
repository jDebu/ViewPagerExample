package jdebu.github.io.viewpagerexample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private  SlidePagerAdapter slidePagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        viewPager=(ViewPager) findViewById(R.id.pager);
        slidePagerAdapter = new SlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(slidePagerAdapter);
        viewPager.setOnPageChangeListener
                (new ViewPager.SimpleOnPageChangeListener(){
                     @Override
                     public void onPageSelected(int position) {
                         // When changing pages, reset the action bar actions since they are dependent
                         // on which page is currently active. An alternative approach is to have each
                         // fragment expose actions itself (rather than the activity exposing actions),
                         // but for simplicity, the activity provides the actions in this sample.
                         invalidateOptionsMenu();
                     }

                 }
        );
    }

}
