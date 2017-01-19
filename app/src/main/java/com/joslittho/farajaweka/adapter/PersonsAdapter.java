package com.joslittho.farajaweka.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joslittho.farajaweka.R;
import com.joslittho.farajaweka.model.Person;
import com.joslittho.farajaweka.utils.Utility;
import com.joslittho.farajaweka.viewholder.PersonViewHolder;

import java.util.List;

/**
 * {@link PersonsAdapter} exposes {@link com.joslittho.farajaweka.model.Person}s to a
 * {@link android.support.v7.widget.RecyclerView}.
 */
// begin class PersonsAdapter
public class PersonsAdapter extends RecyclerView.Adapter< PersonViewHolder > {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /* VARIABLES */

    /* Contexts */

    private Context mContext; // ditto

    /* Lists */

    private List< Person > mPersons; // ditto

    /* PersonsAdapterOnClickHandler */

    public PersonsAdapterOnClickHandler mPersonsAdapterOnClickHandler; // ditto


    /* CONSTRUCTOR */

    // begin constructor
    public PersonsAdapter( List< Person > goods, PersonsAdapterOnClickHandler clickHandler,
                           Context context ) {

        // 0. initialize the list
        // 1. initialize the click handler
        // 2. initialize the context

        // 0. initialize the list

        mPersons = goods;

        // 1. initialize the click handler

        mPersonsAdapterOnClickHandler = clickHandler;

        // 2. initialize the context

        mContext = context;

    } // end constructor

    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onCreateViewHolder
    public PersonViewHolder onCreateViewHolder( ViewGroup parent, int viewType ) {

        // 0. inflate the correct layout using the parent view group's context
        // 1. return a view holder using the inflated view and this adapter

        // 0. inflate the correct layout using the parent view group's context

        View view = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.person_list_item, parent, false );

        // 1. return a view holder using the inflated view and this adapter

        return new PersonViewHolder( view, this );

    } // end onCreateViewHolder

    @Override
    // begin onBindViewHolder
    public void onBindViewHolder( PersonViewHolder personViewHolder, int position ) {

        // 0. for the list item at this position, show the correct
        // 0a. gender
        // 0b. name
        // 0c. age

        // 0. for the list item at this position, show the correct

        Person currentPerson = mPersons.get( position );

        // 0a. gender

        personViewHolder.mGenderTextView.setText( Utility.getGenderShortForm( mContext, currentPerson ) );

        // 0b. name

        personViewHolder.mNameTextView.setText( currentPerson.getName() );

        // 0c. age

        personViewHolder.mAgeTextView.setText( Utility.getAgeDisplayString( mContext, currentPerson ) );

    } // end onBindViewHolder

    @Override
    // getItemCount
    public int getItemCount() {
        return mPersons.size();
    }

    /* Other Methods */

} // end class PersonsAdapter
