package com.gradproject.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction().add(R.id.frame, new BlankFragment()).commit();
    }


    @Override
    public void onFragmentInteraction(String z) {
        Toast.makeText(MainActivity.this, z, Toast.LENGTH_SHORT).show();
    }
}
