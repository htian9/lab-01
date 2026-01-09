package com.example.petshop;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "PetShop";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Cat("Lucy");

        Dog dog = new Dog("Snoopy");

        Scorpion scorpion = new Scorpion("Scorponok");

        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);

        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();
        pettablePets.add(cat);
        pettablePets.add(dog);
   
        Mood happyMood = new HappyMood();
        Mood sadMood = new SadMood(new Date(122, 11, 31));

        Log.d(TAG, "PetShop demo running");
        for (Pet pet : petList) {
            Log.d(TAG, pet.getName() + " says: " + pet.speak());
        }
        
        Log.d(TAG, "Happy mood: " + happyMood.getMoodString());
        Log.d(TAG, "Sad mood date: " + sadMood.getDate());
    }
}
