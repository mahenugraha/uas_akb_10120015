package com.example.uas_10120015;
import com.google.firebase.database.IgnoreExtraProperties;

// NIM : 10120015
// NAMA : MAHENDRA NUGRAHA
// KELAS : IF 1
@IgnoreExtraProperties
public class Admin {

    public String username;
    public String email;

    public Admin() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Admin(String username, String email) {
        this.username = username;
        this.email = email;
    }

}