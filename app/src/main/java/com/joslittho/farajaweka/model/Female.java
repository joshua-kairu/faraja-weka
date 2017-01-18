package com.joslittho.farajaweka.model;

/**
 * A female {@link Person}
 */
// begin class Male
public class Female extends Person {

    /* CONSTANTS */

    /* Integers */

    /** Constant for when the lady hasn't been pregnant */
    public static final int NUMBER_OF_TIMES_PREGNANT_NONE = -1;

    /** Constant for when the lady doesn't have any children */
    public static final int NUMBER_OF_CHILDREN_NONE = -1;

    /**
     * Constant for when the lady hasn't had any abnormal cervical examination results.
     *
     * This is put here since there is an "Others" section in the "Abnormal Cervical Examination"
     * part. If the lady has an abnormal cervical examination result that is neither
     * Aceto-white nor suspicious lesion, a description of that result should be filled in the "Others"
     * section. Otherwise this constant - ABNORMAL_CERVICAL_EXAMINATION_NONE - should be put in
     * that "Others" section.
     * */
    public static final String ABNORMAL_CERVICAL_EXAMINATION_NONE = "ABNORMAL_CERVICAL_EXAMINATION_NONE";

    /* Strings */

    /* VARIABLES */

    /*
     * Medical History and Results
     * ===========================
     */

    private boolean hasBeenPregnant; // ditto

    private int numberOfTimesPregnant = NUMBER_OF_TIMES_PREGNANT_NONE; // ditto. Start with none

    private boolean hasChildren; // ditto

    private int numberOfChildren = NUMBER_OF_CHILDREN_NONE; // ditto. Start with no kids

    private boolean getsMenstrualPeriods; // ditto

    /*
     * Cervical Examination
     * ====================
     */

    public enum CERVICAL_EXAMINATION { NOT_DONE, NORMAL, ABNORMAL } // ditto

    private CERVICAL_EXAMINATION cervicalExamination = CERVICAL_EXAMINATION.NOT_DONE ; // ditto.
                                                                                       // Start with
                                                                                       // not done

    // ACETO_WHITE_ONLY - Positive VIA + Aceto-white only
    // SUSPICIOUS_LESION - Positive VIA + Suspicious lesion
    public enum CERVICAL_ABNORMAL { ACETO_WHITE_ONLY, SUSPICIOUS_LESION, OTHERS, NONE } // ditto

    private CERVICAL_ABNORMAL cervicalAbnormal = CERVICAL_ABNORMAL.NONE; // ditto. Start with none
    
    public String cervicalAbnormalOthers = ABNORMAL_CERVICAL_EXAMINATION_NONE; 
    // a description of a cervical examination result that is neither Aceto-white only nor 
    // suspicious lesion. Start with there being no description

    /* CONSTRUCTOR */
    
    /**
     * Default constructor for a {@link Female} {@link Person}
     *
     * @param uniqueID The lady's unique ID
     * @param name The lady's name
     * @param age The lady's age
     * @param phoneNumber The lady's phone number
     * @param location The lady's location
     * @param bloodPressure The lady's blood pressure in the form "systolic/diastolic", e.g. "120/70"
     * @param weight The lady's weight in kilograms
     * @param height The lady's height in centimeters
     * @param BMI The lady's Body-Mass-Index
     * @param bloodGlucose The lady's blood glucose level
     * @param hasHistoryOfCancer Whether the lady has had cancer before
     * @param hasPriorHistoryOfCancerInFamily Whether the lady's family has had cancer
     * @param historyFamilyCancers A list of the cancers, if any, suffered by the lady's family
     * @param hasHistoryOfSmokingCigarettes Whether the lady has smoked cigarettes
     * @param hasBeenPregnant Whether the lady has been pregnant
     * @param numberOfTimesPregnant The number of times the lady has been pregnant, if any
     * @param hasChildren Whether the lady has children
     * @param numberOfChildren The number of children the lady has, if any
     * @param getsMenstrualPeriods Whether the lady gets menstrual periods
     * @param breastExamination The lady's breast examination results
     * @param breastMass The lady's breast mass results, if any
     * @param cervicalExamination The lady's cervical examination results, if any
     * @param cervicalAbnormal The lady's abnormal cervical examination results, if any
     * @param cervicalAbnormalOthers A description of the lady's abnormal cervical examination results
     *                               - only needed if the lady has abnormal cervical examination results
     *                               which are neither Aceto-white only nor Suspicious lesion
     * @param referrals The lady's referrals
     */
    // begin constructor
    public Female(

            // personal info
            String uniqueID, String name, int age, String phoneNumber, String location,

            // vitals
            String bloodPressure, double weight, int height, double BMI, double bloodGlucose,

            // medical history and results
            boolean hasHistoryOfCancer, boolean hasPriorHistoryOfCancerInFamily, 
            String historyFamilyCancers, boolean hasHistoryOfSmokingCigarettes,
            boolean hasBeenPregnant, int numberOfTimesPregnant, 
            boolean hasChildren, int numberOfChildren, 
            boolean getsMenstrualPeriods,
            
            // breast examination
            BREAST_EXAMINATION breastExamination, BREAST_MASS breastMass,

            // cervical examination
            CERVICAL_EXAMINATION cervicalExamination, CERVICAL_ABNORMAL cervicalAbnormal, 
            String cervicalAbnormalOthers,

            // others
            String referrals ) {
        
        // 0. super stuff
        // 1. initialize medical history
        // 2. initialize cervical examination

        // 0. super stuff
        
        super( GENDER.FEMALE, uniqueID, name, age, phoneNumber, location, bloodPressure, weight, height, 
                BMI, bloodGlucose, hasHistoryOfCancer, hasPriorHistoryOfCancerInFamily, 
                historyFamilyCancers, hasHistoryOfSmokingCigarettes, breastExamination, breastMass, 
                referrals );

        // 1. initialize medical history
        
        this.hasBeenPregnant = hasBeenPregnant;
        this.numberOfTimesPregnant = numberOfTimesPregnant;
        this.hasChildren = hasChildren;
        this.numberOfChildren = numberOfChildren;
        this.getsMenstrualPeriods = getsMenstrualPeriods;

        // 2. initialize cervical examination
        
        this.cervicalExamination = cervicalExamination;
        this.cervicalAbnormal = cervicalAbnormal;
        this.cervicalAbnormalOthers = cervicalAbnormalOthers;
        
    } // end constructor

    /* METHODS */

    /* Getters and Setters */

    public boolean isHasBeenPregnant() {
        return hasBeenPregnant;
    }

    public void setHasBeenPregnant( boolean hasBeenPregnant ) {
        this.hasBeenPregnant = hasBeenPregnant;
    }

    public int getNumberOfTimesPregnant() {
        return numberOfTimesPregnant;
    }

    public void setNumberOfTimesPregnant( int numberOfTimesPregnant ) {
        this.numberOfTimesPregnant = numberOfTimesPregnant;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren( boolean hasChildren ) {
        this.hasChildren = hasChildren;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren( int numberOfChildren ) {
        this.numberOfChildren = numberOfChildren;
    }

    public boolean isGetsMenstrualPeriods() {
        return getsMenstrualPeriods;
    }

    public void setGetsMenstrualPeriods( boolean getsMenstrualPeriods ) {
        this.getsMenstrualPeriods = getsMenstrualPeriods;
    }

    public CERVICAL_EXAMINATION getCervicalExamination() {
        return cervicalExamination;
    }

    public void setCervicalExamination( CERVICAL_EXAMINATION cervicalExamination ) {
        this.cervicalExamination = cervicalExamination;
    }

    public CERVICAL_ABNORMAL getCervicalAbnormal() {
        return cervicalAbnormal;
    }

    public void setCervicalAbnormal( CERVICAL_ABNORMAL cervicalAbnormal ) {
        this.cervicalAbnormal = cervicalAbnormal;
    }

    public String getCervicalAbnormalOthers() {
        return cervicalAbnormalOthers;
    }

    public void setCervicalAbnormalOthers( String cervicalAbnormalOthers ) {
        this.cervicalAbnormalOthers = cervicalAbnormalOthers;
    }

    /* Overrides */
    
    /* Other Methods */

} // end class Male
