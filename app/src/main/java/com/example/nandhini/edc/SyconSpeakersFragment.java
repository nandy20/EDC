package com.example.nandhini.edc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class SyconSpeakersFragment extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SyconSpeakersFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SyconSpeakersFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SyconSpeakersFragment newInstance(String param1, String param2) {
        SyconSpeakersFragment fragment = new SyconSpeakersFragment();
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


    ArrayList <SpeakerItems> speakerlist;
    private WebView wikiview;
    CardView wikiCardView;

    private boolean wikiOpened;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_sycon_speakers, container, false);

        createSpeakersList();

        wikiview= (WebView) rootview.findViewById(R.id.webview);
        wikiview.setWebViewClient(new WebViewClient());
        wikiCardView = rootview.findViewById(R.id.wikicardview);

        ListView listview = (ListView) rootview.findViewById(R.id.speakerlistview);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(wikiOpened == true){
                    wikiCardView.setVisibility(View.GONE);
                    wikiOpened = false;

                } else {
                    wikiOpened = true;
                    wikiCardView.setVisibility(View.VISIBLE);
                    wikiview.loadUrl(speakerlist.get(position).getWikiLink());
                    Toast.makeText(getActivity(), speakerlist.get(position).getSname(), Toast.LENGTH_SHORT).show();
                }
            }

        });

        SpeakersAdapter adapter = new SpeakersAdapter(getActivity(),speakerlist);

        listview.setAdapter(adapter);

        return rootview;
    }

    void createSpeakersList(){
        speakerlist = new ArrayList<SpeakerItems>(20);
        speakerlist.add(new SpeakerItems(R.drawable.balaji_sampath,"Founder AID India","Founder Ahaguru"," ","Dr. BALAJI SAMPATH","https://en.wikipedia.org/wiki/Balaji_Sampath"));
        speakerlist.add(new SpeakerItems(R.drawable.raj_aru,"Channel Director , ","PutChutney"," ","Mr. RAJMOHAN ARMUGHAM","https://www.edexlive.com/live-story/2017/sep/26/presenting-rajmohan-arumugam-the-man-from-put-chutney-who-makes-you-sit-up-and-listen-to-him-1221.html"));

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
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
