package com.joslittho.farajaweka.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.joslittho.farajaweka.R2;
import com.joslittho.farajaweka.adapter.PersonsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link android.support.v7.widget.RecyclerView.ViewHolder} to hold the views for a person list item
 */
// begin class PersonViewHolder
public class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /* VARIABLES */

    /* PersonsAdapters */

    private PersonsAdapter mHostPersonsAdapter; // ditto

    /* TextViews */

    @BindView( R2.id.person_list_item_tv_gender )
    public TextView mGenderTextView; // ditto

    @BindView( R2.id.person_list_item_tv_name )
    public TextView mNameTextView; // ditto

    @BindView( R2.id.person_list_item_tv_age )
    public TextView mAgeTextView; // ditto
    
    /* CONSTRUCTOR */

    // begin constructor
    public PersonViewHolder( View itemView, PersonsAdapter personsAdapter ) {

        // 0. super stuff
        // 1. bind views
        // 2. this holder should handle clicks
        // 3. initialize the host adapter

        // 0. super stuff

        super( itemView );

        // 1. bind views

        ButterKnife.bind( this, itemView );

        // 2. this holder should handle clicks

        itemView.setOnClickListener( this );

        // 3. initialize the host adapter

        mHostPersonsAdapter = personsAdapter;

    } // end constructor

    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onClick
    public void onClick( View view ) {

        // 0. tell the adapter of the click

        // 0. tell the adapter of the click

        mHostPersonsAdapter.mPersonsAdapterOnClickHandler.onClick( this );

    } // end onClick
    
    /* Other Methods */

} // end class PersonViewHolder
