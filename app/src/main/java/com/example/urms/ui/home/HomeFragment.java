package com.example.urms.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import com.example.urms.Billing;

import com.example.urms.LogOut;

import com.example.urms.PreRegistration;
import com.example.urms.R;
import com.example.urms.Result;
import com.example.urms.Shedule;


public class HomeFragment extends Fragment {
    //Button Preregistration, Schedule, Billing, Result, LogOut;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

     View view = inflater.inflate(R.layout.fragment_home,container, false);
        /*Preregistration= view.findViewById(R.id.button1);
        Schedule= view.findViewById(R.id.button2);
        Billing= view.findViewById(R.id.button3);
        Result=view.findViewById(R.id.button4);
        LogOut= view.findViewById(R.id.button5);*/
        return view;
    }
    /*public void buttonClicked(View view) {

        if (view.getId() == R.id.button1) {
            Intent intent = new Intent(HomeFragment.this,PreRegistration.class);
            startActivity(intent);
        } else if (view.getId() == R.id.button2) {

            Intent intent = new Intent(HomeFragment.this,Shedule.class);
            startActivity(intent);
        } else if (view.getId() == R.id.button3) {
            Intent intent = new Intent(HomeFragment.this,Billing.class);
            startActivity(intent);
        }else if (view.getId() == R.id.button4) {
            Intent intent = new Intent(HomeFragment.this,Result.class);
            startActivity(intent);
        }else if (view.getId() == R.id.button5) {
            Intent intent = new Intent(HomeFragment.this,LogOut.class);
            startActivity(intent);
        }

    }*/



}