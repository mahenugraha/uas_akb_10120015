package com.example.uas_10120015;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.HashMap;

// NIM : 10120015
// NAMA : MAHENDRA NUGRAHA
// KELAS : IF 1
public class DAONotes {
    private DatabaseReference databaseReference;

    public DAONotes() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Notes.class.getSimpleName());
    }

    public Task<Void> add(Notes notes) {
        return databaseReference.push().setValue(notes);
    }

    public Task<Void> update(String key, HashMap<String, Object> hashMap) {
        return databaseReference.child(key).updateChildren(hashMap);
    }

    public Task<Void> remove(String key) {
        return databaseReference.child(key).removeValue();
    }

    public Query get(String key) {
        if (key == null) {
            return databaseReference.orderByKey().limitToFirst(8);
        }
        return databaseReference.orderByKey().startAfter(key).limitToFirst(8);
    }

    public Query get() {
        return databaseReference;
    }
}
