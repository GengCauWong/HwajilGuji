package com.example.srmobile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImageSelectionWay#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImageSelectionWay extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button cameraBtn;
    private Button galleryBtn;
    private Button configureBtn;
    public ImageSelectionWay() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ImageSelectionWay.
     */
    // TODO: Rename and change types and number of parameters
    public static ImageSelectionWay newInstance(String param1, String param2) {
        ImageSelectionWay fragment = new ImageSelectionWay();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    MainActivity mainActivity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainActivity = (MainActivity)getActivity();
        ViewGroup selectionPage= (ViewGroup) inflater.inflate(R.layout.fragment_image_selection_way, container, false);
        cameraBtn = selectionPage.findViewById(R.id.cameraBtn);
        galleryBtn = selectionPage.findViewById(R.id.galleryBtn);
        configureBtn = selectionPage.findViewById(R.id.configureBtn);

        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setFragment(2);
            }
        });
        return selectionPage;
    }
}
