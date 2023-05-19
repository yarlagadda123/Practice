package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;

import java.util.ArrayList;

public class MainActivity9 extends AppCompatActivity {
   private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        fragmentManager = getSupportFragmentManager();
        final PaperOnboardingFragment paperOnboardingFragment = PaperOnboardingFragment.newInstance(getDataForOnboarding());
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,paperOnboardingFragment);
        fragmentTransaction.commit();
    }

    private ArrayList<PaperOnboardingPage> getDataForOnboarding() {
        PaperOnboardingPage scrl1 =new PaperOnboardingPage("Fast Delivery","hiiii", Color.parseColor("#ffb174"),R.drawable.delivery,R.drawable.delivery);
        PaperOnboardingPage scrl2 =new PaperOnboardingPage("Fresh Food","hello", Color.parseColor("#22eaaa"),R.drawable.food,R.drawable.food);
        PaperOnboardingPage scrl3 =new PaperOnboardingPage("Easy Payment","jjjjjjj", Color.parseColor("#ee5a5a"),R.drawable.pay,R.drawable.pay);
        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(scrl1);
        elements.add(scrl2);
        elements.add(scrl3);
        return elements;
    }
}