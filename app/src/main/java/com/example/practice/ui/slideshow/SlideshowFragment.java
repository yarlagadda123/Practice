package com.example.practice.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.practice.databinding.FragmentSlideshowBinding;
import com.google.android.material.imageview.ShapeableImageView;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    ShapeableImageView shapeableImageView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

      //  final ImageView imageView = binding.imageView4;
        ShapeableImageView shapeableImageView = binding.img2;
       // slideshowViewModel.getText().observe(getViewLifecycleOwner(), imageView::im);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}