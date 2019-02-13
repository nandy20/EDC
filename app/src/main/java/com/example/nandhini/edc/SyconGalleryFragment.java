package com.example.nandhini.edc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SyconGalleryFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SyconGalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SyconGalleryFragment extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SyconGalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SyconGalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SyconGalleryFragment newInstance(String param1, String param2) {
        SyconGalleryFragment fragment = new SyconGalleryFragment();
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

    private ArrayList<GalleryItems> galleryList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_sycon_gallery, container, false);

        createArrayList();

        ListView view  = rootview.findViewById(R.id.galleryview);

        GalleryAdapter adapter = new GalleryAdapter(getActivity(),galleryList);

        view.setAdapter(adapter);

        return rootview;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    //Fills arraylist fully with imageID's
    public void createArrayList(){
        galleryList = new ArrayList<GalleryItems>(20);
        galleryList.add(new GalleryItems(R.drawable.i30,R.drawable.i2,R.drawable.i7,R.drawable.i11,R.drawable.i5,"2018","s","s","s","s"));
        galleryList.add(new GalleryItems(R.drawable.i33,R.drawable.i6,R.drawable.i8,R.drawable.i17,R.drawable.i28," ","s","s","s","s"));
        galleryList.add(new GalleryItems(R.drawable.i50,R.drawable.i46,R.drawable.i47,R.drawable.i48,R.drawable.i49,"2017","s","s","s","s"));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
