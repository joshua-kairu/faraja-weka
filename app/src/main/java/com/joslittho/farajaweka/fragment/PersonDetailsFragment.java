package com.joslittho.farajaweka.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joslittho.farajaweka.R;
import com.joslittho.farajaweka.R2;
import com.joslittho.farajaweka.adapter.PersonDetailsViewPagerAdapter;
import com.joslittho.farajaweka.model.Person;
import com.joslittho.farajaweka.model.Person.GENDER;

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

    public static final String ARGUMENT_GENDER = "ARGUMENT_GENDER"; // ditto
    public static final String ARGUMENT_UNIQUE_ID = "ARGUMENT_UNIQUE_ID"; // ditto
    public static final String ARGUMENT_NAME = "ARGUMENT_NAME"; // ditto
    public static final String ARGUMENT_AGE = "ARGUMENT_AGE"; // ditto

    /**
     * The logger.
     */
    private static final String LOG_TAG = PersonDetailsFragment.class.getSimpleName();
    
    /* VARIABLES */

    /* Genders */

    private GENDER mGender; // ditto

    /* Primitives */

    private int mAge; // ditto

    /* Strings */

    private String mName, mUniqueID; // ditto

    /* TabLayouts */

    @BindView( R2.id.person_details_tb_tabs )
    public TabLayout mTabLayout; // the tab layout

    /* ViewPagers */

    @BindView( R2.id.person_details_vp_pager )
    public ViewPager mPersonViewPager; // ditto

    /* CONSTRUCTOR */

    public PersonDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Create a new {@link PersonDetailsFragment} with the given arguments.
     *
     * @param gender The person's gender
     * @param uniqueID The person's unique ID
     * @param name The person's name
     * @param age An integer reference to the person's age
     * */
    // begin instantiating method newInstance
    public static PersonDetailsFragment newInstance( GENDER gender, String uniqueID, String name,
                                                     int age ) {

        // 0. create a new PersonDetailsFragment
        // 1. put the parameters in a bundle
        // 2. use the bundle as the arguments for the created PersonDetailsFragment
        // 3. return the created PersonDetailsFragment

        // 0. create a new PersonDetailsFragment

        PersonDetailsFragment personDetailsFragment = new PersonDetailsFragment();

        // 1. put the parameters in a bundle

        Bundle bundle = new Bundle();

        bundle.putSerializable( ARGUMENT_GENDER, gender );
        bundle.putString( ARGUMENT_UNIQUE_ID, uniqueID );
        bundle.putString( ARGUMENT_NAME, name );
        bundle.putInt( ARGUMENT_AGE, age );

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
        // 2. if we have a bundle, mine it
        // 3. setup the view pager for the tabs
        // 4. make the tabs use the setup view pager
        // last. return the inflated view

        // 0. Inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_person_details, container, false );

        // 1. bind

        ButterKnife.bind( this, rootView );

        // 2. if we have a bundle, mine it

        Bundle bundle = getArguments();

        // begin if there is a bundle and it has the arguments we need
        if ( bundle != null ) {

            mGender = ( GENDER ) bundle.getSerializable( ARGUMENT_GENDER );

            mUniqueID = bundle.getString( ARGUMENT_UNIQUE_ID );

            mName = bundle.getString( ARGUMENT_NAME );

            mAge = bundle.getInt( ARGUMENT_AGE );

        } // end if there is a bundle and it has the arguments we need

        // no bundle means yes problem
        else {
            throw new RuntimeException( "We need bundled person info!" );
        }

        // 3. setup the view pager for the tabs

        setupViewPager( mPersonViewPager );

        // 4. make the tabs use the setup view pager

        mTabLayout.setupWithViewPager( mPersonViewPager );

        // last. return the inflated view

        return rootView;

    } // end onCreateView
    
    /* Other Methods */

    /**
     * Helper method to set up the {@link ViewPager}.
     *
     * @param viewPager The {@link ViewPager} to be set up
     * */
    // begin method setupViewPager
    private void setupViewPager( ViewPager viewPager ) {

        // 0. initialize a detail view pager adapter
        // 1. add the fragments we will need in the view pager
        // 1a. personal info
        // 1b. vitals
        // 1c. medical history
        // 1d. examinations
        // 1e. referrals
        // 2. use this adapter for the parameter view pager

        // 0. initialize a detail view pager adapter

        PersonDetailsViewPagerAdapter personDetailsViewPagerAdapter =
                new PersonDetailsViewPagerAdapter( getActivity().getSupportFragmentManager() );

        // 1. add the fragments we will need in the view pager

        // 1a. personal info

        personDetailsViewPagerAdapter
                .addFragment( PersonalInformationFragment.newInstance( mGender, mUniqueID, mName, mAge ),
                        getContext().getString( R.string.title_fragment_personal_info ) );

        // 1b. vitals

        personDetailsViewPagerAdapter
                .addFragment( new VitalsFragment(),
                        getContext().getString( R.string.title_fragment_vitals ) );

        // 1c. medical history

        personDetailsViewPagerAdapter
                .addFragment( MedicalHistoryFragment.newInstance( mGender ),
                        getContext().getString( R.string.title_fragment_medical_history ) );

        // 1d. examinations

        personDetailsViewPagerAdapter
                .addFragment( ExaminationsFragment.newInstance( mGender ),
                        getContext().getString( R.string.title_fragment_examinations ) );

        // 1e. referrals

        personDetailsViewPagerAdapter
                .addFragment( new ReferralsFragment(),
                        getContext().getString( R.string.title_fragment_referrals ) );

        // 2. use this adapter for the parameter view pager

        viewPager.setAdapter( personDetailsViewPagerAdapter );

    } // end method setupViewPager

} // end fragment PersonDetailsFragment
