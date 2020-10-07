package com.example.fragmentmove;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class CobaFragment extends Fragment implements View.OnClickListener {

    public CobaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_coba, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnDetailCategory = view.findViewById(R.id.btn_detail_category);
        btnDetailCategory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_detail_category){
            DetailCobaFragment detailCobaFragment = new DetailCobaFragment();

            Bundle bundle = new Bundle();
            bundle.putString(DetailCobaFragment.EXTRA_NAME, "Ridwan Hart");
            String description = "Ini adalah data yang akan dikirim";

            detailCobaFragment.setArguments(bundle);
            detailCobaFragment.setDescription(description);

            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager != null){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_container, detailCobaFragment, DetailCobaFragment.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        }
    }
}