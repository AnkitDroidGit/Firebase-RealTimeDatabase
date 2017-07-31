package com.freeankit.firebaserealtimedatabase.customObjectDB;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.freeankit.firebaserealtimedatabase.dataObject.CustomObject;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by J6673234 on 31/07/2017.
 */

public class CustomObjectActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Getting reference of DB
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("profileSnapshot");

        //Writing a value
        CustomObject customObject = new CustomObject();
        customObject.setName("Name");
        customObject.setCurrentLocation("Location");
        customObject.setJobTitle("Job");
        List<String> experinces = new ArrayList<>();
        experinces.add("One");
        experinces.add("Two");
        customObject.setExperience(experinces);
        myRef.setValue(customObject);

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                CustomObject customObject = dataSnapshot.getValue(CustomObject.class);
                Log.d("Value", "Custom Object is : " + customObject);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("Value", "Failed to read value.", error.toException());
            }
        });
    }
}
