package com.joslittho.farajaweka.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joslittho.farajaweka.R;
import com.joslittho.farajaweka.model.Person.GENDER;

import static com.joslittho.farajaweka.fragment.PersonDetailsFragment.ARGUMENT_GENDER;

/**
 * {@link Fragment} to show a person's medical history. 
 * It displays slightly different content based on the person's gender. 
 */
// begin fragment MedicalHistoryFragment
public class MedicalHistoryFragment extends Fragment {

    /* CONSTANTS */

    /* Integers */

    /* Strings */

    /**
     * The logger.
     */
    private static final String LOG_TAG = MedicalHistoryFragment.class.getSimpleName();

    /* VARIABLES */

    /* CONSTRUCTOR */

    public MedicalHistoryFragment() {
        // Required empty public constructor
    }

    /**
     * Create a new {@link MedicalHistoryFragment} with the given arguments.
     *
     * @param gender The person's gender
     * */
    // begin instantiating method newInstance
    public static MedicalHistoryFragment newInstance( GENDER gender ) {

        // 0. create a new MedicalHistoryFragment
        // 1. put the parameters in a bundle
        // 2. use the bundle as the arguments for the created MedicalHistoryFragment
        // 3. return the created MedicalHistoryFragment

        // 0. create a new MedicalHistoryFragment

        MedicalHistoryFragment medicalHistoryFragment = new MedicalHistoryFragment();

        // 1. put the parameters in a bundle

        Bundle bundle = new Bundle();

        bundle.putSerializable( ARGUMENT_GENDER, gender );

        // 2. use the bundle as the arguments for the created MedicalHistoryFragment

        medicalHistoryFragment.setArguments( bundle );

        // 3. return the created MedicalHistoryFragment

        return medicalHistoryFragment;

    } // end instantiating method newInstance

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        // 0. get the person's gender and use it to inflate the layout for this fragment
        // last. return the inflated view

        // 0. get the person's gender and use it to inflate the layout for this fragment

        View rootView;

        Bundle bundle = getArguments();
        
        // begin if there are arguments
        if ( bundle != null ) {

            GENDER gender = ( GENDER ) bundle.getSerializable( ARGUMENT_GENDER );

            if ( gender.equals( GENDER.FEMALE ) ) {
                rootView = inflater.inflate( R.layout.fragment_medical_history_female, container, false );
            }

            else if ( gender.equals( GENDER.MALE ) ) {
                rootView = inflater.inflate( R.layout.fragment_medical_history_male, container, false );
            }

            else {
                throw new RuntimeException( "No valid gender." );
            }

            // last. return the inflated view

            return rootView;

        } // end if there are arguments

        else {
            throw new RuntimeException( "MedicalHistoryFragment has to have arguments to know the gender!" );
        }

    } // end onCreateView
    
    /* Other Methods */

} // end fragment MedicalHistoryFragment
