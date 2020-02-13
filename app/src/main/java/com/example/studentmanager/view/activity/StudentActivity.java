package com.example.studentmanager.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.studentmanager.R;
import com.example.studentmanager.databinding.ActivityStudentBinding;
import com.example.studentmanager.view.fragment.ContactFragment;
import com.example.studentmanager.view.fragment.HomeFragment;
import com.example.studentmanager.view.fragment.MessageFragment;
import com.example.studentmanager.view.fragment.ScheduleFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StudentActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    private ActivityStudentBinding binding;
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_student);
        binding.bottomNav.setOnNavigationItemSelectedListener(this);

        toolbar = getSupportActionBar();
        toolbar.setTitle("Trang Chủ");

        loadFragment(new HomeFragment());

    }
    private boolean loadFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.navigation_home:
                toolbar.setTitle("Trang Chủ");
                fragment = new HomeFragment();
                break;
            case R.id.navigation_message:
                toolbar.setTitle("Tin Nhắn");
                fragment = new MessageFragment();
                break;
            case R.id.navigation_contact_book:
                toolbar.setTitle("Sổ Liên Lạc");
                fragment = new ContactFragment();
                break;
            case R.id.navigation_schedule:
                toolbar.setTitle("Thơi Khóa Biểu");
                fragment = new ScheduleFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
