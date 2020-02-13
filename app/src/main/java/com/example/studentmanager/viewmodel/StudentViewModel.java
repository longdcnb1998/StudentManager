package com.example.studentmanager.viewmodel;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.example.studentmanager.util.FirebaseQueryLiveData;
import com.example.studentmanager.model.object.Student;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class StudentViewModel extends ViewModel {
//    DatabaseReference reference = FirebaseDatabase.getInstance().getReference("school").child("students");
//    FirebaseQueryLiveData liveData = new FirebaseQueryLiveData(reference);
//    private LiveData<List<Student>> data = Transformations.map(liveData,new ChangeData());
//
//
//    private class ChangeData implements Function<DataSnapshot,List<Student>>{
//        ArrayList<Student> students = new ArrayList<>();
//
//        @Override
//        public List<Student> apply(DataSnapshot input) {
//            for (DataSnapshot snapshot : input.getChildren()){
//                Student student = snapshot.getValue(Student.class);
//                students.add(student);
//            }
//            return students;
//        }
//    }
//
//
//    public LiveData<List<Student>> getData(){
//        return data;
//    }

   private MediatorLiveData<List<Student>> liveStudent;

   public MediatorLiveData<List<Student>> getLiveStudent(){
       if (liveStudent == null){
           liveStudent = new MediatorLiveData<>();
       }
       return liveStudent;
   }

    public StudentViewModel() {
       super();
    }

    public void loadData(final Context context){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("school").child("students");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                ArrayList<Student> students = new ArrayList<>();
                for (DataSnapshot snapshot:dataSnapshot.getChildren()) {
                    Student student = snapshot.getValue(Student.class);
                    students.add(student);
                }
                liveStudent.postValue(students);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
   }


}
