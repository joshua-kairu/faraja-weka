package com.joslittho.farajaweka.adapter;

import com.joslittho.baker_order.viewholder.GoodViewHolder;

/**
 * Handler for click events in the {@link android.support.v7.widget.RecyclerView} populated by the
 * {@link PersonsAdapter}.
 */
// begin interface PersonsAdapterOnClickHandler
public interface PersonsAdapterOnClickHandler {

    /* METHODS */

    /**
     * Click handler for the {@link PersonsAdapter}.
     *
     * @param clickedHolder The {@link com.joslittho.baker_order.viewholder.GoodViewHolder} that has
     *                      been clicked.
     * */
    public void onClick( GoodViewHolder clickedHolder );

} // end interface PersonsAdapterOnClickHandler
