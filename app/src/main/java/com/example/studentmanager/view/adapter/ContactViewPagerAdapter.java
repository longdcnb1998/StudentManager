package com.example.studentmanager.view.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.studentmanager.view.fragment.ProfileFragment;
import com.example.studentmanager.view.fragment.ResultCourse2Fragment;
import com.example.studentmanager.view.fragment.ResultCourseFragment;

public class ContactViewPagerAdapter extends FragmentPagerAdapter {


    public ContactViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0 :
                fragment = new ResultCourseFragment();
                break;
            case 1:
                fragment = new ResultCourse2Fragment();
                break;
            case 2:
                fragment = new ProfileFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch (position){
            case 0:
                title = "Học Kì I";
                break;
            case 1:
                title = "Học Kì II";
                break;
            case 2:
                title = "Hồ Sơ";
        }
        return title;
    }
}
