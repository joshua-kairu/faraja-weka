package com.joslittho.farajaweka.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * {@link PersonsAdapter} exposes {@link com.joslittho.farajaweka.model.Person}s to a
 * {@link android.support.v7.widget.RecyclerView}.
 */
// begin class PersonsAdapter
public class PersonsAdapter extends RecyclerView.Adapter< GoodViewHolder > {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /* VARIABLES */

    /* GoodsAdapterOnClickHandlers */

    public GoodsAdapterOnClickHandler mGoodsAdapterOnClickHandler; // ditto

    /* Lists */

    private List< BakedGood > mGoods; // ditto

    /* CONSTRUCTOR */

    // begin constructor
    public PersonsAdapter( Context context, List< BakedGood > goods,
                           GoodsAdapterOnClickHandler clickHandler ) {

        // 0. initialize the list
        // 1. initialize the click handler

        // 0. initialize the list

        mGoods = goods;

        // 1. initialize the click handler

        mGoodsAdapterOnClickHandler = clickHandler;

    } // end constructor

    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onCreateViewHolder
    public GoodViewHolder onCreateViewHolder( ViewGroup parent, int viewType ) {

        // 0. inflate the correct layout using the parent view group's context
        // 1. return a view holder using the inflated view and this adapter

        // 0. inflate the correct layout using the parent view group's context

        View view = LayoutInflater.from( parent.getContext() )
                .inflate( R.layout.person_list_item, parent, false );

        // 1. return a view holder using the inflated view and this adapter

        return new GoodViewHolder( view, this );

    } // end onCreateViewHolder

    @Override
    // begin onBindViewHolder
    public void onBindViewHolder( GoodViewHolder goodViewHolder, int position ) {

        // 0. for the list item at this position, show the correct
        // 0a. picture
        // 0b. name
        // 0c. value

        // 0. for the list item at this position, show the correct

        BakedGood currentGood = mGoods.get( position );

        // 0a. picture

        goodViewHolder.mPictureImageView.setImageResource( currentGood.getPicture() );

        // 0b. name

        goodViewHolder.mNameTextView.setText( currentGood.getName() );

        // 0c. value

        goodViewHolder.mValueTextView.setText( String.valueOf( currentGood.getPrice() ) + " XOF" );

    } // end onBindViewHolder

    @Override
    // getItemCount
    public int getItemCount() {
        return mGoods.size();
    }

    /* Other Methods */

} // end class PersonsAdapter
