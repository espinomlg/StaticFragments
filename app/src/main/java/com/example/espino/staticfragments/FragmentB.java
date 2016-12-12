package com.example.espino.staticfragments;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by espino on 25/11/16.
 */

public class FragmentB extends Fragment {

    private TextView txvFragmentB;

    public FragmentB(){
        super();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_b, container, false);
        if(rootView != null)
            txvFragmentB = (TextView) rootView.findViewById(R.id.textView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if(savedInstanceState != null) {
            txvFragmentB.setText(savedInstanceState.getString("texto"));
            txvFragmentB.setTextSize(TypedValue.COMPLEX_UNIT_SP,savedInstanceState.getFloat("size"));
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public void changeText(String text, int size){
        txvFragmentB.setTextSize(TypedValue.COMPLEX_UNIT_SP,size);
        txvFragmentB.setText(text);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("texto",txvFragmentB.getText().toString());
        outState.putFloat("size",txvFragmentB.getTextSize());
    }
}
