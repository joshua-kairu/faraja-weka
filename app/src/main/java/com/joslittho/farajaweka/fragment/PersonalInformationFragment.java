package com.joslittho.farajaweka.fragment;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.joslittho.farajaweka.R;
import com.joslittho.farajaweka.R2;
import com.joslittho.farajaweka.model.Person.GENDER;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.joslittho.farajaweka.fragment.PersonDetailsFragment.ARGUMENT_AGE;
import static com.joslittho.farajaweka.fragment.PersonDetailsFragment.ARGUMENT_GENDER;
import static com.joslittho.farajaweka.fragment.PersonDetailsFragment.ARGUMENT_NAME;
import static com.joslittho.farajaweka.fragment.PersonDetailsFragment.ARGUMENT_UNIQUE_ID;

/**
 * {@link Fragment} for displaying personal information
 */
// begin fragment PersonalInformationFragment
public class PersonalInformationFragment extends Fragment {

    /* CONSTANTS */

    /* Integers */
    
    /* Strings */

    /**
     * The logger.
     */
    private static final String LOG_TAG = PersonalInformationFragment.class.getSimpleName();
    
    /* VARIABLES */

    /* Spinners */

    @BindView( R2.id.personal_info_s_gender )
    public Spinner mGenderSpinner; //ditto

    /* TextViews */

    @BindView( R2.id.personal_info_tv_unique_id_value )
    public TextView mUniqueIDValueTextView; // ditto

    @BindView( R2.id.personal_info_til_name )
    public TextInputLayout mNameTextInputLayout; // ditto

    @BindView( R2.id.personal_info_til_age )
    public TextInputLayout mAgeTextInputLayout; // ditto

    /* CONSTRUCTOR */

    public PersonalInformationFragment() {
        // Required empty public constructor
    }

    /**
     * Create a new {@link PersonalInformationFragment} with the given arguments.
     *
     * @param gender The person's gender
     * @param uniqueID The person's unique ID
     * @param name The person's name
     * @param age An integer reference to the person's age
     * */
    // begin instantiating method newInstance
    public static PersonalInformationFragment newInstance( GENDER gender, String uniqueID,
                                                           String name, int age ) {

        // 0. create a new PersonalInformationFragment
        // 1. put the parameters in a bundle
        // 2. use the bundle as the arguments for the created PersonalInformationFragment
        // 3. return the created PersonalInformationFragment

        // 0. create a new PersonalInformationFragment

        PersonalInformationFragment personalInformationFragment = new PersonalInformationFragment();

        // 1. put the parameters in a bundle

        Bundle bundle = new Bundle();

        bundle.putSerializable( ARGUMENT_GENDER, gender );
        bundle.putString( ARGUMENT_UNIQUE_ID, uniqueID );
        bundle.putString( ARGUMENT_NAME, name );
        bundle.putInt( ARGUMENT_AGE, age );

        // 2. use the bundle as the arguments for the created PersonalInformationFragment

        personalInformationFragment.setArguments( bundle );

        // 3. return the created PersonalInformationFragment

        return personalInformationFragment;

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
        // 2. initialize gender spinner
        // 2a. specify the adapter to inflate genders from the arrays resource
        // 2b. specify the adapter's dropdown layout
        // 2c. use the adapter in the spinner
        // 3. if there are arguments
        // 3a. initialize corresponding views
        // last. return the inflated view

        // 0. inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_personal_information, container, false );

        // 1. bind

        ButterKnife.bind( this, rootView );

        // 2. initialize gender spinner

        // 2a. specify the adapter to inflate genders from the arrays resource

        ArrayAdapter< CharSequence > gendersSpinnerAdapter = ArrayAdapter.createFromResource(
                getActivity(), R.array.genders_array, android.R.layout.simple_spinner_item );

        // 2b. specify the adapter's dropdown layout

        gendersSpinnerAdapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );

        // 2c. use the adapter in the spinner

        mGenderSpinner.setAdapter( gendersSpinnerAdapter );

        // 3. if there are arguments

        Bundle bundle = getArguments();

        // begin if there are arguments
        if ( bundle != null ) {

            // 3a. initialize corresponding views

            GENDER gender = ( GENDER ) bundle.getSerializable( ARGUMENT_GENDER );

            mGenderSpinner.setSelection( gender.ordinal() );

            String uniqueID = bundle.getString( ARGUMENT_UNIQUE_ID );

            mUniqueIDValueTextView.setText( uniqueID );

            String name = bundle.getString( ARGUMENT_NAME );

            mNameTextInputLayout.getEditText().setText( name );

            int age = bundle.getInt( ARGUMENT_AGE );

            mAgeTextInputLayout.getEditText().setText( String.valueOf( age ) );

        } // end if there are arguments

        // last. return the inflated view

        return rootView;

    } // end onCreateView
    
    /* Other Methods */

} // end fragment PersonalInformationFragment
