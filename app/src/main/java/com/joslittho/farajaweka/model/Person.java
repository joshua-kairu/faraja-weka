package com.joslittho.farajaweka.model;

/**
 * A person
 */
// begin class Person
public abstract class Person {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /** Constant for when the {@link Person}'s family has no history of cancer. */
    public static final String NO_HISTORY_FAMILY_CANCER = "NO_HISTORY_FAMILY_CANCER";

    /* VARIABLES */

    /*
     * Personal Information
     * ====================
     */

    public enum GENDER { FEMALE, MALE, NONE };

    private GENDER gender = GENDER.NONE; // ditto. Start with none

    private String uniqueID; // ditto - "M001" is the first male, "F001" is the first female

    private String name; // ditto

    private int age; // ditto

    private String phoneNumber; // ditto

    private String location; // ditto

    /*
     * Vitals
     * ======
     */

    private String bloodPressure; // in the form "systolic/diastolic", e.g. "120/70"

    private double weight; // in kilograms

    private int height; // in centimeters

    private double BMI; // ditto

    private double bloodGlucose; // ditto

    /*
     * Medical History and Results
     * ===========================
     */

    private boolean hasHistoryOfCancer; // whether or not this person has had cancer

    private boolean hasPriorHistoryOfCancerInFamily; // ditto

    private String historyFamilyCancers = NO_HISTORY_FAMILY_CANCER; // String of cancers in family.
                                                                   // Starts out as no history

    private boolean hasHistoryOfSmokingCigarettes; // whether or not this person has smoked

    /*
     * Breast Examination
     * ==================
     */

    public enum BREAST_EXAMINATION { NOT_DONE, NORMAL, SKIN_CHANGES, NIPPLE_DISCHARGE, MASS } // ditto

    private BREAST_EXAMINATION breastExamination = BREAST_EXAMINATION.NOT_DONE; // state of breast
                                                                               // examination. Start
                                                                               // with not done

    public enum BREAST_MASS { LHS, RHS, BILATERAL, NONE } // ditto

    private BREAST_MASS breastMass = BREAST_MASS.NONE; // ditto. Start with none

    /*
     * Others
     * ======
     */

    public String referrals; // ditto

    /* CONSTRUCTOR */

    /**
     * Default constructor for a {@link Person} class
     *
     * @param gender The person's gender
     * @param uniqueID The person's unique ID
     * @param name The person's name
     * @param age The person's age
     * @param phoneNumber The person's phone number
     * @param location The person's location
     * @param bloodPressure The person's blood pressure in the form "systolic/diastolic", e.g. "120/70"
     * @param weight The person's weight in kilograms
     * @param height The person's height in centimeters
     * @param BMI The person's Body-Mass-Index
     * @param bloodGlucose The person's blood glucose level
     * @param hasHistoryOfCancer Whether the person has had cancer before
     * @param hasPriorHistoryOfCancerInFamily The person's family has had cancer
     * @param historyFamilyCancers A list of the cancers, if any, suffered by the person's family
     * @param hasHistoryOfSmokingCigarettes Whether the person has smoked cigarettes
     * @param breastExamination The person's breast examination results
     * @param breastMass The person's breast mass results, if any
     * @param referrals The person's referrals
     */
    // begin constructor
    public Person(

            // personal info
            GENDER gender, String uniqueID, String name, int age, String phoneNumber,
            String location,

            // vitals
            String bloodPressure, double weight, int height, double BMI, double bloodGlucose,

            // medical history and results
            boolean hasHistoryOfCancer, boolean hasPriorHistoryOfCancerInFamily,
            String historyFamilyCancers, boolean hasHistoryOfSmokingCigarettes,

            // breast examination
            BREAST_EXAMINATION breastExamination, BREAST_MASS breastMass,

            // others
            String referrals ) {

        this.gender = gender;
        this.uniqueID = uniqueID;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.height = height;
        this.BMI = BMI;
        this.bloodGlucose = bloodGlucose;
        this.hasHistoryOfCancer = hasHistoryOfCancer;
        this.hasPriorHistoryOfCancerInFamily = hasPriorHistoryOfCancerInFamily;
        this.historyFamilyCancers = historyFamilyCancers;
        this.hasHistoryOfSmokingCigarettes = hasHistoryOfSmokingCigarettes;
        this.breastExamination = breastExamination;
        this.breastMass = breastMass;
        this.referrals = referrals;

    } // end constructor

    /* METHODS */
    
    /* Getters and Setters */

    public GENDER getGender() {
        return gender;
    }

    public void setGender( GENDER gender ) {
        this.gender = gender;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID( String uniqueID ) {
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation( String location ) {
        this.location = location;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure( String bloodPressure ) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight( double weight ) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight( int height ) {
        this.height = height;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI( double BMI ) {
        this.BMI = BMI;
    }

    public double getBloodGlucose() {
        return bloodGlucose;
    }

    public void setBloodGlucose( double bloodGlucose ) {
        this.bloodGlucose = bloodGlucose;
    }

    public boolean isHasHistoryOfCancer() {
        return hasHistoryOfCancer;
    }

    public void setHasHistoryOfCancer( boolean hasHistoryOfCancer ) {
        this.hasHistoryOfCancer = hasHistoryOfCancer;
    }

    public boolean isHasPriorHistoryOfCancerInFamily() {
        return hasPriorHistoryOfCancerInFamily;
    }

    public void setHasPriorHistoryOfCancerInFamily( boolean hasPriorHistoryOfCancerInFamily ) {
        this.hasPriorHistoryOfCancerInFamily = hasPriorHistoryOfCancerInFamily;
    }

    public String getHistoryFamilyCancers() {
        return historyFamilyCancers;
    }

    public void setHistoryFamilyCancers( String historyFamilyCancers ) {
        this.historyFamilyCancers = historyFamilyCancers;
    }

    public boolean isHasHistoryOfSmokingCigarettes() {
        return hasHistoryOfSmokingCigarettes;
    }

    public void setHasHistoryOfSmokingCigarettes( boolean hasHistoryOfSmokingCigarettes ) {
        this.hasHistoryOfSmokingCigarettes = hasHistoryOfSmokingCigarettes;
    }

    public BREAST_EXAMINATION getBreastExamination() {
        return breastExamination;
    }

    public void setBreastExamination( BREAST_EXAMINATION breastExamination ) {
        this.breastExamination = breastExamination;
    }

    public BREAST_MASS getBreastMass() {
        return breastMass;
    }

    public void setBreastMass( BREAST_MASS breastMass ) {
        this.breastMass = breastMass;
    }

    public String getReferrals() {
        return referrals;
    }

    public void setReferrals( String referrals ) {
        this.referrals = referrals;
    }

    /* Overrides */
    
    /* Other Methods */

} // end class Person
