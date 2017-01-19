package com.joslittho.farajaweka.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.joslittho.baker_order.R2;
import com.joslittho.baker_order.adapter.GoodsAdapter;

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

    /* GoodsAdapters */

    private GoodsAdapter mHostGoodsAdapter; // ditto

    /* ImageViews */

    @BindView( R2.id.good_item_iv_picture )
    public ImageView mPictureImageView; // ditto

    /* TextViews */

    @BindView( R2.id.good_item_tv_name )
    public TextView mNameTextView; // ditto

    @BindView( R2.id.good_item_tv_value )
    public TextView mValueTextView; // ditto
    
    /* CONSTRUCTOR */

    // begin constructor
    public PersonViewHolder( View itemView, GoodsAdapter goodsAdapter ) {

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

        mHostGoodsAdapter = goodsAdapter;

    } // end constructor

    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onClick
    public void onClick( View view ) {

        // 0. tell the adapter of the click

        // 0. tell the adapter of the click

        mHostGoodsAdapter.mGoodsAdapterOnClickHandler.onClick( this );

    } // end onClick
    
    /* Other Methods */

} // end class PersonViewHolder
