package com.example.nandhini.edc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.os.PersistableBundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class SyconHomeFragment extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    ViewPager viewPager;
    String []names=new String[]{"Mark Zuckerberg","   Bill Gates","  Steve Jobs"};
    private int dotcount;
    private ImageView[] dot;
    LinearLayout linearLayout;
    TextView textView;
    private final static String MENU_SELECTED = "selected";
    private int selected = -1;
    MenuItem menuItem;
    DateFormat dateFormat;
    Date date;
    Calendar cal;
    String time2,Sylendra="09:00",Chandra_Karlo="09:25",Padma_Subramanyam="09:50",Break1="10:15",Lakshaman_Krish="11:00";
    String Auto_annadurai="11:25",Malathi_kola="11:50",Lunch="12:15",Kurangan="13:25",Kirthi_Jayakumar="14:15",Shravan_Krishnan="14:40";



    public SyconHomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SyconHomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SyconHomeFragment newInstance(String param1, String param2) {
        SyconHomeFragment fragment = new SyconHomeFragment();
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

    @Override
    public void onCreateOptionsMenu(Menu menu,MenuInflater menuInflater) {
        //MenuInflater menuInflater= getActivity().getMenuInflater();
        Log.i("Time",String.valueOf(time2));
        menuInflater.inflate(R.menu.menu_bar,menu);
        if(((String)time2).compareTo(Sylendra)>=0){
            menuItem = (MenuItem) menu.findItem(R.id.Sylendra);
            menuItem.setChecked(true);
        }
        if(((String)time2).compareTo(Chandra_Karlo)>=0){
            MenuItem  menuItem1 = (MenuItem) menu.findItem(R.id.Chandra_Karlo);
            Log.i("Original",time2);
            menuItem1.setChecked(true);
        }
        if(((String)time2).compareTo(Break1)>=0){
            MenuItem  menuItem1 = (MenuItem) menu.findItem(R.id.break1);
            Log.i("Original",time2);
            menuItem1.setChecked(true);
        }
        if(((String)time2).compareTo(Lakshaman_Krish)>=0){
            MenuItem  menuItem1 = (MenuItem) menu.findItem(R.id.Lakshmanan_Krish);
            Log.i("Original",time2);
            menuItem1.setChecked(true);
        }
        if(((String)time2).compareTo(Auto_annadurai)>=0){
            MenuItem  menuItem1 = (MenuItem) menu.findItem(R.id.Auto_Annadurai);
            Log.i("Original",time2);
            menuItem1.setChecked(true);
        }
        if(((String)time2).compareTo(Malathi_kola)>=0){
            MenuItem  menuItem1 = (MenuItem) menu.findItem(R.id.Malathi_kola);
            Log.i("Original",time2);
            menuItem1.setChecked(true);
        }
        if(((String)time2).compareTo(Lunch)>=0){
            MenuItem  menuItem1 = (MenuItem) menu.findItem(R.id.Lunch);
            Log.i("Original",time2);
            menuItem1.setChecked(true);
        }
        if(((String)time2).compareTo(Kurangan)>=0){
            MenuItem  menuItem1 = (MenuItem) menu.findItem(R.id.Kurangan);
            Log.i("Original",time2);
            menuItem1.setChecked(true);
        }
        if(((String)time2).compareTo(Kirthi_Jayakumar)>=0){
            MenuItem  menuItem1 = (MenuItem) menu.findItem(R.id.Kirthi_Jayakumar);
            Log.i("Original",time2);
            menuItem1.setChecked(true);
        }
        if(((String)time2).compareTo(Shravan_Krishnan)>=0){
            MenuItem  menuItem1 = (MenuItem) menu.findItem(R.id.Shravan_Jayakumar);
            Log.i("Original",time2);
            menuItem1.setChecked(true);
        }
        super.onCreateOptionsMenu(menu,menuInflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
//        super.onSaveInstanceState(outState, outPersistentState);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview  = inflater.inflate(R.layout.fragment_sycon_home, container, false);


        setHasOptionsMenu(true);
        dateFormat = new SimpleDateFormat("HH:mm");
        date = new Date();
        cal = Calendar.getInstance();
        time2=dateFormat.format(cal.getTime());
        return rootview;
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
