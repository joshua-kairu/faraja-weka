package com.joslittho.farajaweka.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.joslittho.farajaweka.R;
import com.joslittho.farajaweka.fragment.PersonDetailsFragment;
import com.joslittho.farajaweka.model.Person;
import com.joslittho.farajaweka.model.Person.GENDER;

import static com.joslittho.farajaweka.fragment.PersonDetailsFragment.ARGUMENT_AGE;
import static com.joslittho.farajaweka.fragment.PersonDetailsFragment.ARGUMENT_GENDER;
import static com.joslittho.farajaweka.fragment.PersonDetailsFragment.ARGUMENT_NAME;
import static com.joslittho.farajaweka.fragment.PersonDetailsFragment.ARGUMENT_UNIQUE_ID;

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
        // 2. get the person details from the extras
        // 3. start the person details fragment with the details

        // 0. super stuff

        super.onCreate( savedInstanceState );

        // 1. use the person details activity layout

        setContentView( R.layout.activity_person_details );

        // 2. get the person details from the extras

        Bundle bundle = getIntent().getExtras();

        GENDER gender = ( GENDER ) bundle.getSerializable( ARGUMENT_GENDER );

        String uniqueID = bundle.getString( ARGUMENT_UNIQUE_ID );

        String name = bundle.getString( ARGUMENT_NAME );

        int age = bundle.getInt( ARGUMENT_AGE );

        // 3. start the person details fragment with the details

        // begin if this is first run
        if ( savedInstanceState == null ) {

            getSupportFragmentManager().beginTransaction()
                    .add( R.id.detail_fl_container,
                            PersonDetailsFragment.newInstance( gender, uniqueID, name, age ) )
                    .commit();

        } // end if this is first run

    } // end onCreate
    
    /* Other Methods */

} // end activity PersonDetailsActivity
