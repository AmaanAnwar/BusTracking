
package com.np.bustracking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListOfFeatures extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_features);
        ViewPager mViewPager;
        mViewPager = findViewById(R.id.viewpager);
        mViewPager.setAdapter(new SamplePagerAdapter(getSupportFragmentManager()));
        textView = findViewById(R.id.skiptomain);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), chooseLogin.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public class SamplePagerAdapter extends FragmentPagerAdapter {

        public SamplePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            /** Show a Fragment based on the position of the current screen */
            if (position == 0) {
                return new SampleFragment();
            } else if (position == 1)
                return new SampleFragmentTwo();
            else if (position == 2)
                return new SampleFragmentThree();
            else
                return new SampleFragmentFour();
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }
    }
}
