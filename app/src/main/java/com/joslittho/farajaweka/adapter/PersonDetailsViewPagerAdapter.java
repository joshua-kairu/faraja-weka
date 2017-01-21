package com.joslittho.farajaweka.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link FragmentPagerAdapter} to handle the tabs for the person details
 */
// begin class PersonDetailsViewPagerAdapter
public class PersonDetailsViewPagerAdapter extends FragmentPagerAdapter {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /* VARIABLES */

    /* Lists */

    private final List< Fragment > mFragmentList = new ArrayList<>();
    // a list of the fragments that will make up the tabs handled by this view pager

    private final List< String > mFragmentTitleList = new ArrayList<>();
    // a list of the titles of the tabs
    
    /* CONSTRUCTOR */

    // default constructor
    public PersonDetailsViewPagerAdapter( FragmentManager fm ) {
        super( fm );
    }

    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    /** Return the Fragment associated with a specified position. */
    // getItem
    public Fragment getItem( int position ) {
        return mFragmentList.get( position );
    }

    @Override
    /** Return the number of views available. */
    // getCount
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    /** Obtain a title string to describe the specified page or null for no title. */
    // getPageTitle
    public CharSequence getPageTitle( int position ) {
        return mFragmentTitleList.get( position );
    }

    /* Other Methods */

    // begin method addFragment
    public void addFragment( Fragment fragment, String title ) {

        // 0. add the fragment to the fragment list
        // 1. add the title to the title list

        // 0. add the fragment to the fragment list

        mFragmentList.add( fragment );

        // 1. add the title to the title list

        mFragmentTitleList.add( title );

    } // end method addFragment

} // end class PersonDetailsViewPagerAdapter
