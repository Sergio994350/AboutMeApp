package com.sergio994350.aboutmeapp.ui.education;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.sergio994350.aboutmeapp.databinding.FragmentEducationBinding;

public class EducationFragment extends Fragment {

    private EducationViewModel educationViewModel;
    private FragmentEducationBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        educationViewModel =
                new ViewModelProvider(this).get(EducationViewModel.class);

        binding = FragmentEducationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMyEducation;
        educationViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
