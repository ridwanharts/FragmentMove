package com.example.fragmentmove;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class DetailCobaFragment extends Fragment implements View.OnClickListener{

    public static final String EXTRA_NAME = "extra_name";
    TextView tvCategoryName;
    TextView tvCategoryDescription;
    Button btnProfile;
    Button btnShowDialog;
    String description;

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public DetailCobaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_coba, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvCategoryName = view.findViewById(R.id.tv_category_name);
        tvCategoryDescription = view.findViewById(R.id.tv_category_description);

        String categoryNma = getArguments().getString(EXTRA_NAME);
        tvCategoryName.setText(categoryNma);
        tvCategoryDescription.setText(description);

        btnProfile = view.findViewById(R.id.btn_profile);
        btnShowDialog = view.findViewById(R.id.btn_show_dialog);

        btnProfile.setOnClickListener(this);
        btnShowDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_profile :
                //
                break;
            case R.id.btn_show_dialog :
                //
                break;
        }
    }
}