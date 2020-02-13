package com.example.studentmanager.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.studentmanager.R;
import com.example.studentmanager.databinding.ActivityMainBinding;
import com.example.studentmanager.databinding.ActivityMainBindingImpl;
import com.example.studentmanager.model.object.Classes;
import com.example.studentmanager.model.object.Meeting;
import com.example.studentmanager.model.object.School;
import com.example.studentmanager.model.object.Student;
import com.example.studentmanager.model.object.Teacher;
import com.example.studentmanager.model.object.Afternoon;
import com.example.studentmanager.model.object.Morning;
import com.example.studentmanager.model.object.NewsFeed;
import com.example.studentmanager.model.object.Notice;
import com.example.studentmanager.model.object.SDB;
import com.example.studentmanager.model.subject.English;
import com.example.studentmanager.model.subject.Literature;
import com.example.studentmanager.model.subject.Math;
import com.example.studentmanager.util.CurentTime;
import com.example.studentmanager.viewmodel.StudentViewModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private StudentViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Intent intent = new Intent(this, StudentActivity.class);

        binding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        viewModel = ViewModelProviders.of(this).get(StudentViewModel.class);
        viewModel.getLiveStudent().observe(this,data->{
            try {
                Student student = data.get(0);
                Log.d("Student",student.getNameStudent());
            }
            catch (Exception e){}
        });
        viewModel.loadData(this);
//        viewModel.getData().observe(this, new Observer<List<Student>>() {
//            @Override
//            public void onChanged(List<Student> students) {
//
//            }
//        });
    }
}
