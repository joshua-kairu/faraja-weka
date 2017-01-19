package com.joslittho.farajaweka.utils;

import android.content.Context;

import com.joslittho.farajaweka.R;
import com.joslittho.farajaweka.model.Person;

/**
 * A utility class
 */
// begin class Utility
public class Utility {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /* VARIABLES */
    
    /* CONSTRUCTOR */
    
    /* METHODS */
    
    /* Getters and Setters */
    
    /* Overrides */
    
    /* Other Methods */

    /**
     * Helper method to return the string containing the short form of a person's gender
     *
     * @param context Android context
     * @param person The {@link Person}
     *
     * @return A string representing the first letter of the person's gender in capitals
     * */
    // begin method getGenderShortForm
    public static String getGenderShortForm( Context context, Person person ) {

        // 0. return the short form of the person's gender

        // 0. return the short form of the person's gender

        if ( person.getGender() == Person.GENDER.FEMALE ) {
            return context.getString( R.string.gender_female_short );
        }

        else {
            return context.getString( R.string.gender_male_short );
        }

    } // end method getGenderShortForm

    /**
     * Helper method to get a human-readable form of the age
     *
     * @param context Android context
     * @param person The {@link Person}
     *
     * @return A string representing the person's age in the form "DD years" eg "23 years"
     * */
    // begin method getAgeDisplayString
    public static String getAgeDisplayString( Context context, Person person ) {

        // 0. return the person's age in human-readable format

        // 0. return the person's age in human-readable format

        return context.getString( R.string.format_age, person.getAge() );

    } // end method getAgeDisplayString

    /**
     * Helper method to generate a unique ID for a person
     *
     * @param context Android context
     * @param person The {@link Person}
     * @param number The person's unique number
     *
     * @return A string representing the person's unique ID in the form "GenderNumber" eg "F001"
     * for the first female
     * */
    // begin method generateUniqueID
    public static String generateUniqueID( Context context, Person person, int number ) {

        // 0. return the unique ID

        // 0. return the unique ID

        return context.getString( R.string.format_unique_id,
                Utility.getGenderShortForm( context, person ),
                number );

    } // end method generateUniqueID

} // end class Utility
