package com.example.studentmanager.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.studentmanager.util.FirebaseQueryLiveData;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginViewModel extends ViewModel {
    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference("school");

}
