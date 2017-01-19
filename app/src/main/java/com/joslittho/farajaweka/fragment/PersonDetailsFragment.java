package com.joslittho.farajaweka.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joslittho.farajaweka.R;
import com.joslittho.farajaweka.R2;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link Fragment} to show the details of the selected person
 */
// begin fragment PersonDetailsFragment
public class PersonDetailsFragment extends Fragment {

    /* CONSTANTS */

    /* Integers */
    
    /* Strings */

    public static final String ARGUMENT_PICTURE = "ARGUMENT_PICTURE"; // ditto

    /**
     * The logger.
     */
    private static final String LOG_TAG = PersonDetailsFragment.class.getSimpleName();
    
    /* VARIABLES */

    /* ViewPagers */

    @BindView( R2.id.selected_person_vp_pager )
    public ViewPager mPersonViewPager; // ditto

    /* CONSTRUCTOR */

    public PersonDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Create a new {@link PersonDetailsFragment} with the given arguments.
     *
     * @param picture An integer reference to the selected good's image resource
     * */
    // begin instantiating method newInstance
    public static PersonDetailsFragment newInstance( int picture ) {

        // 0. create a new PersonDetailsFragment
        // 1. put the parameters in a bundle
        // 2. use the bundle as the arguments for the created PersonDetailsFragment
        // 3. return the created PersonDetailsFragment

        // 0. create a new PersonDetailsFragment

        PersonDetailsFragment personDetailsFragment = new PersonDetailsFragment();

        // 1. put the parameters in a bundle

        Bundle bundle = new Bundle();

        bundle.putInt( ARGUMENT_PICTURE, picture );

        // 2. use the bundle as the arguments for the created PersonDetailsFragment

        personDetailsFragment.setArguments( bundle );

        // 3. return the created PersonDetailsFragment

        return personDetailsFragment;

    } // end instantiating method newInstance

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        // 0. inflate the layout for this fragment
        // 1. bind
        // 2. if we have it in the bundle, show the picture
        // last. return the inflated view

        // 0. Inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_selected_person, container, false );

        // 1. bind

        ButterKnife.bind( this, rootView );

        // 2. if we have it in the bundle, show the picture

        Bundle bundle = getArguments();

//        // begin if there is a bundle and it has the arguments we need
//        if ( bundle != null && bundle.containsKey( ARGUMENT_PICTURE ) ) {
//
//            int imageRes = bundle.getInt( ARGUMENT_PICTURE );
//
//            mPictureImageView.setImageResource( imageRes );
//
//        } // end if there is a bundle and it has the arguments we need

        // last. return the inflated view

        return rootView;

    } // end onCreateView
    
    /* Other Methods */

} // end fragment PersonDetailsFragment
