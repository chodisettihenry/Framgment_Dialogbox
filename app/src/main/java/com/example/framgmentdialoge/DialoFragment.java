package com.example.framgmentdialoge;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class DialoFragment extends DialogFragment {

    Button ok,cancel;
    EditText userdata;



    public DialoFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_dialo, container, false);
        ok=view.findViewById(R.id.buttonok);
        cancel=view.findViewById(R.id.buttoncancel);
        userdata=view.findViewById(R.id.editTextTextPersonName);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_Message = userdata.getText().toString();
                ((MainActivity)getActivity()).textView.setText(user_Message);
                getDialog().dismiss();

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });

        return view;
    }
}