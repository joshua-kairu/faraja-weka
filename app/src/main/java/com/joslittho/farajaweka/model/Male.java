package com.joslittho.farajaweka.model;

/**
 * A male {@link Person}
 */
// begin class Male
public class Male extends Person {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /* VARIABLES */

    /*
     * Prostate Examination
     * ====================
     */

    public enum PROSTATE_EXAMINATION { NOT_DONE, NORMAL, ABNORMAL } // ditto

    private PROSTATE_EXAMINATION prostateExamination = PROSTATE_EXAMINATION.NOT_DONE ; // ditto.
                                                                                       // Start with
                                                                                       // not done

    /* CONSTRUCTOR */

    // begin constructor

    /**
     * Default constructor for a {@link Male} {@link Person}
     *
     * @param uniqueID The gentleman's unique ID
     * @param name The gentleman's name
     * @param age The gentleman's age
     * @param phoneNumber The gentleman's phone number
     * @param location The gentleman's location
     * @param bloodPressure The gentleman's blood pressure in the form "systolic/diastolic", e.g. "120/70"
     * @param weight The gentleman's weight in kilograms
     * @param height The gentleman's height in centimeters
     * @param BMI The gentleman's Body-Mass-Index
     * @param bloodGlucose The gentleman's blood glucose level
     * @param hasHistoryOfCancer Whether the gentleman has had cancer before
     * @param hasPriorHistoryOfCancerInFamily Whether the gentleman's family has had cancer
     * @param historyFamilyCancers A list of the cancers, if any, suffered by the gentleman's family
     * @param hasHistoryOfSmokingCigarettes Whether the gentleman has smoked cigarettes
     * @param breastExamination The gentleman's breast examination results
     * @param breastMass The gentleman's breast mass results, if any
     * @param prostateExamination The gentleman's prostate examination results
     * @param referrals The gentleman's referrals
     */
    // begin constructor
    public Male(

            // personal info

            String uniqueID, String name, int age, String phoneNumber, String location,

            // vitals
            String bloodPressure, double weight, int height, double BMI, double bloodGlucose,

            // medical history and results
            boolean hasHistoryOfCancer, boolean hasPriorHistoryOfCancerInFamily,
            String historyFamilyCancers, boolean hasHistoryOfSmokingCigarettes,

            // breast examination
            BREAST_EXAMINATION breastExamination, BREAST_MASS breastMass,

            // prostate examination
            PROSTATE_EXAMINATION prostateExamination,

            // others
            String referrals ) {

        // 0. super stuff
        // 1. initialize prostate

        // 0. super stuff

        super( GENDER.MALE, uniqueID, name, age, phoneNumber, location, bloodPressure, weight, height,
                BMI, bloodGlucose, hasHistoryOfCancer, hasPriorHistoryOfCancerInFamily,
                historyFamilyCancers, hasHistoryOfSmokingCigarettes, breastExamination, breastMass,
                referrals );

        // 1. initialize prostate

        this.prostateExamination = prostateExamination;

    } // end constructor
    
    /* METHODS */
    
    /* Getters and Setters */

    public PROSTATE_EXAMINATION getProstateExamination() {
        return prostateExamination;
    }

    public void setProstateExamination( PROSTATE_EXAMINATION prostateExamination ) {
        this.prostateExamination = prostateExamination;
    }

    /* Overrides */
    
    /* Other Methods */

} // end class Male
