package com.example.thisbetterwork.InstaHome;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thisbetterwork.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link instaPosts.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link instaPosts#newInstance} factory method to
 * create an instance of this fragment.
 */
public class popularPosts extends Fragment {


    public popularPosts() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment popularPosts.
     */
    // TODO: Rename and change types and number of parameters
    public static popularPosts newInstance() {
        popularPosts fragment = new popularPosts();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular_posts, container, false);
    }

}
