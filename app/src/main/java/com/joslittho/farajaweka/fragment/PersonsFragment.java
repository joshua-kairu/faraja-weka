package com.joslittho.farajaweka.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.joslittho.farajaweka.R;
import com.joslittho.farajaweka.R2;
import com.joslittho.farajaweka.activity.PersonDetailsActivity;
import com.joslittho.farajaweka.adapter.PersonsAdapter;
import com.joslittho.farajaweka.adapter.PersonsAdapterOnClickHandler;
import com.joslittho.farajaweka.model.Female;
import com.joslittho.farajaweka.model.Male;
import com.joslittho.farajaweka.model.Person;
import com.joslittho.farajaweka.model.Person.GENDER;
import com.joslittho.farajaweka.utils.Utility;
import com.joslittho.farajaweka.viewholder.PersonViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link Fragment} to hold the list of goods
 */
// begin fragment PersonsFragment
public class PersonsFragment extends Fragment implements PersonsAdapterOnClickHandler {

    /* CONSTANTS */

    /* Integers */

    public static final int PERSON_NUMBER = 20; // ditto
    
    /* Strings */

    /**
     * The logger.
     */
    private static final String LOG_TAG = PersonsFragment.class.getSimpleName();
    
    /* VARIABLES */

    /* Lists */

    private List< Person > mPersons; // ditto

    /* PersonsAdapters */

    private PersonsAdapter mPersonsAdapter; // ditto


    /* RecyclerViews */

    @BindView( R2.id.persons_rv_list )
    public RecyclerView mPersonsRecyclerView; // ditto

    /* CONSTRUCTOR */

    public PersonsFragment() {
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
        // 1. bind
        // 2. get a list of persons
        // 3. the recycler
        // 3a. use a linear layout manager
        // 3b. has fixed size
        // 3c. set adapter
        // last. return the inflated view

        // 0. inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_persons, container, false );

        // 1. bind

        ButterKnife.bind( this, rootView );

        // 2. get a list of persons

        mPersons = generatePersons();

        // 2. the recycler

        // 2a. use a linear layout manager

        mPersonsRecyclerView.setLayoutManager( new LinearLayoutManager( getActivity() ) );

        // 2b. has fixed size

        mPersonsRecyclerView.setHasFixedSize( true );

        // 2c. set adapter

        mPersonsAdapter = new PersonsAdapter( mPersons, this, getActivity() );

        mPersonsRecyclerView.setAdapter( mPersonsAdapter );

        // last. return the inflated view

        return rootView;

    } // end onCreateView

    /**
     * Listener for when a good item in the recycler is clicked.
     *
     * @param clickedHolder The {@link com.joslittho.farajaweka.viewholder.PersonViewHolder} that has been clicked.
     * */
    @Override
    // begin onClick
    public void onClick( PersonViewHolder clickedHolder ) {

        // 0. get the details of the clicked person
        // 1. put the details in an intent
        // 2. start the person details activity using the intent

        // 0. get the details of the clicked item

        Person currentPerson = mPersons.get( clickedHolder.getAdapterPosition() );
        GENDER gender = currentPerson.getGender();
        String uniqueId = currentPerson.getUniqueID();
        String name = currentPerson.getName();
        int age = currentPerson.getAge();

        // 1. put the details in an intent

        Intent detailsIntent = new Intent( getActivity(), PersonDetailsActivity.class )
                .putExtra( PersonDetailsFragment.ARGUMENT_GENDER, gender )
                .putExtra( PersonDetailsFragment.ARGUMENT_UNIQUE_ID, uniqueId )
                .putExtra( PersonDetailsFragment.ARGUMENT_NAME, name )
                .putExtra( PersonDetailsFragment.ARGUMENT_AGE, age );

        // 2. start the person details activity using the intent

        startActivity( detailsIntent );

    } // end onClick

    /* Other Methods */

    /**
     * Helper method to generate persons for the list.
     *
     * @return An {@link ArrayList} of some generated persons.
     * */
    // begin generatePersons
    private ArrayList< Person > generatePersons() {

        ArrayList< Person > persons = new ArrayList<>( PERSON_NUMBER );

        Context context = getActivity();

        for ( int i = 0; i < PERSON_NUMBER; i++ ) {

            String name;

            int age;

            Person person;

            switch ( i % 4 ) {

                case 0:
                    age = 34;
                    name = "Cinthia Aloo";

                    person = new Female.Builder( "F00" + String.valueOf( i ), name )
                            .setAge( age ).build();
                    break;

                case 1:
                    age = 36;
                    name = "Phinehas Band";

                    person = new Male.Builder( "M00" + String.valueOf( i ), name )
                            .setAge( age ).build();
                    break;

                case 2:
                    age = 29;
                    name = "Arnette Ali";

                    person = new Female.Builder( "F00" + String.valueOf( i ), name )
                            .setAge( age ).build();
                    break;

                case 3: default:
                    age = 27;
                    name = "Joel Mwita";

                    person = new Male.Builder( "M00" + String.valueOf( i ), name )
                            .setAge( age ).build();
                    break;
            }

            persons.add( person );

        }

        return persons;

    } // end generatePersons

} // end fragment PersonsFragment
