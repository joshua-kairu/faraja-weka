package com.joslittho.farajaweka.model;

/**
 * A female {@link Person}
 */
// begin class Female
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

    /* INNER CLASSES */

    /** Builder for the {@link Female} class */
    // begin inner class Builder
    public static class Builder {

        /* CONSTANTS */

        /* VARIABLES */

        private String uniqueID;
        private String name;
        private int age;
        private String phoneNumber;
        private String location;
        private String bloodPressure;
        private double weight;
        private int height;
        private double bmi;
        private double bloodGlucose;
        private boolean hasHistoryOfCancer;
        private boolean hasPriorHistoryOfCancerInFamily;
        private String historyFamilyCancers;
        private boolean hasHistoryOfSmokingCigarettes;
        private boolean hasBeenPregnant;
        private int numberOfTimesPregnant;
        private boolean hasChildren;
        private int numberOfChildren;
        private boolean getsMenstrualPeriods;
        private Person.BREAST_EXAMINATION breastExamination;
        private Person.BREAST_MASS breastMass;
        private Female.CERVICAL_EXAMINATION cervicalExamination;
        private Female.CERVICAL_ABNORMAL cervicalAbnormal;
        private String cervicalAbnormalOthers;
        private String referrals;

        /* CONSTRUCTOR */

        /**
         * Constructor to take the lady's unique ID and name
         *
         * @param uniqueID The lady's unique ID
         * @param name The lady's name
         * */
        // begin constructor
        public Builder( String uniqueID, String name ) {

            // 0. initialize unique ID
            // 1. initialize name

            // 0. initialize unique ID
            // 1. initialize name

            this.uniqueID = uniqueID;
            this.name = name;

        } // end constructor

        /* METHODS */

        /* Getters and Setters */

        /* Overrides */

        /* Other Methods */

        public Builder setUniqueID( String uniqueID ) {
            this.uniqueID = uniqueID;
            return this;
        }

        public Builder setName( String name ) {
            this.name = name;
            return this;
        }

        public Builder setAge( int age ) {
            this.age = age;
            return this;
        }

        public Builder setPhoneNumber( String phoneNumber ) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setLocation( String location ) {
            this.location = location;
            return this;
        }

        public Builder setBloodPressure( String bloodPressure ) {
            this.bloodPressure = bloodPressure;
            return this;
        }

        public Builder setWeight( double weight ) {
            this.weight = weight;
            return this;
        }

        public Builder setHeight( int height ) {
            this.height = height;
            return this;
        }

        public Builder setBMI( double bmi ) {
            this.bmi = bmi;
            return this;
        }

        public Builder setBloodGlucose( double bloodGlucose ) {
            this.bloodGlucose = bloodGlucose;
            return this;
        }

        public Builder setHasHistoryOfCancer( boolean hasHistoryOfCancer ) {
            this.hasHistoryOfCancer = hasHistoryOfCancer;
            return this;
        }

        public Builder setHasPriorHistoryOfCancerInFamily( boolean hasPriorHistoryOfCancerInFamily ) {
            this.hasPriorHistoryOfCancerInFamily = hasPriorHistoryOfCancerInFamily;
            return this;
        }

        public Builder setHistoryFamilyCancers( String historyFamilyCancers ) {
            this.historyFamilyCancers = historyFamilyCancers;
            return this;
        }

        public Builder setHasHistoryOfSmokingCigarettes( boolean hasHistoryOfSmokingCigarettes ) {
            this.hasHistoryOfSmokingCigarettes = hasHistoryOfSmokingCigarettes;
            return this;
        }

        public Builder setHasBeenPregnant( boolean hasBeenPregnant ) {
            this.hasBeenPregnant = hasBeenPregnant;
            return this;
        }

        public Builder setNumberOfTimesPregnant( int numberOfTimesPregnant ) {
            this.numberOfTimesPregnant = numberOfTimesPregnant;
            return this;
        }

        public Builder setHasChildren( boolean hasChildren ) {
            this.hasChildren = hasChildren;
            return this;
        }

        public Builder setNumberOfChildren( int numberOfChildren ) {
            this.numberOfChildren = numberOfChildren;
            return this;
        }

        public Builder setGetsMenstrualPeriods( boolean getsMenstrualPeriods ) {
            this.getsMenstrualPeriods = getsMenstrualPeriods;
            return this;
        }

        public Builder setBreastExamination( Person.BREAST_EXAMINATION breastExamination ) {
            this.breastExamination = breastExamination;
            return this;
        }

        public Builder setBreastMass( Person.BREAST_MASS breastMass ) {
            this.breastMass = breastMass;
            return this;
        }

        public Builder setCervicalExamination( Female.CERVICAL_EXAMINATION cervicalExamination ) {
            this.cervicalExamination = cervicalExamination;
            return this;
        }

        public Builder setCervicalAbnormal( Female.CERVICAL_ABNORMAL cervicalAbnormal ) {
            this.cervicalAbnormal = cervicalAbnormal;
            return this;
        }

        public Builder setCervicalAbnormalOthers( String cervicalAbnormalOthers ) {
            this.cervicalAbnormalOthers = cervicalAbnormalOthers;
            return this;
        }

        public Builder setReferrals( String referrals ) {
            this.referrals = referrals;
            return this;
        }

        public Female build() {
            return new Female( uniqueID, name, age, phoneNumber, location, bloodPressure, weight,
                    height, bmi, bloodGlucose, hasHistoryOfCancer, hasPriorHistoryOfCancerInFamily,
                    historyFamilyCancers, hasHistoryOfSmokingCigarettes, hasBeenPregnant,
                    numberOfTimesPregnant, hasChildren, numberOfChildren, getsMenstrualPeriods,
                    breastExamination, breastMass, cervicalExamination, cervicalAbnormal,
                    cervicalAbnormalOthers, referrals );
        }

    } // end inner class Builder

} // end class Female
