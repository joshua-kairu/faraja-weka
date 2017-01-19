package com.joslittho.farajaweka.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.joslittho.farajaweka.R;

/**
 * {@link android.app.Activity} to display the selected good
 */
// begin activity PersonDetailsActivity
public class PersonDetailsActivity extends AppCompatActivity {

    /* CONSTANTS */
    
    /* Integers */

    /* Strings */

    /**
     * The logger.
     */
    private static final String LOG_TAG = PersonDetailsActivity.class.getSimpleName();
    
    /* VARIABLES */

    /* CONSTRUCTOR */
    
    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super stuff
        // 1. use the person details activity layout
        // 2. get the picture from the extras
        // 3. start the selected good fragment with the picture

        // 0. super stuff

        super.onCreate( savedInstanceState );

        // 1. use the person details activity layout

        setContentView( R.layout.activity_person_details );

        // 2. get the picture from the extras

//        Bundle bundle = getIntent().getExtras();
//        int imageRes = bundle.getInt( SelectedGoodFragment.ARGUMENT_PICTURE );

        // 3. start the selected good fragment with the picture

        // begin if this is first run
//        if ( savedInstanceState == null ) {
//
//            getSupportFragmentManager().beginTransaction()
//                    .add( R.id.detail_fl_container, SelectedGoodFragment.newInstance( imageRes ) )
//                    .commit();
//
//        } // end if this is first run

    } // end onCreate
    
    /* Other Methods */

} // end activity PersonDetailsActivity
