package com.example.espino.staticfragments;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentsActivity extends Activity implements FragmentA.FragmentIterationListener{

    private FragmentB fragmentb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        fragmentb = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentb);
    }

    @Override
    public void onFragmentIterationListener(String text, int size) {
        fragmentb.changeText(text,size);
    }
}
