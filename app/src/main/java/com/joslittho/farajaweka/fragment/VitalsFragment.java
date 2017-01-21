package com.joslittho.farajaweka.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joslittho.farajaweka.R;

/**
 * {@link Fragment} to show a person's vitals
 */
// begin fragment VitalsFragment
public class VitalsFragment extends Fragment {

    /* CONSTANTS */

    /* Integers */
    
    /* Strings */

    /**
     * The logger.
     */
    private static final String LOG_TAG = VitalsFragment.class.getSimpleName();
    
    /* VARIABLES */

    /* CONSTRUCTOR */

    public VitalsFragment() {
        // Required empty public constructor
    }

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        // 0. inflate the layout for this fragment
        // last. return the inflated view

        // 0. Inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_vitals, container, false );

        // last. return the inflated view

        return rootView;

    } // end onCreateView
    
    /* Other Methods */

} // end fragment VitalsFragment
