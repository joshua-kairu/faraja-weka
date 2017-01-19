package com.joslittho.farajaweka.adapter;

import com.joslittho.farajaweka.viewholder.PersonViewHolder;

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
     * @param clickedHolder The {@link com.joslittho.farajaweka.viewholder.PersonViewHolder} that has
     *                      been clicked.
     * */
    public void onClick( PersonViewHolder clickedHolder );

} // end interface PersonsAdapterOnClickHandler
