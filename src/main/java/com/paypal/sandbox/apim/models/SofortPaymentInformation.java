/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SofortPaymentInformation type.
 */
public class SofortPaymentInformation {
    private String name;
    private String countryCode;
    private ExperienceContext experienceContext;

    /**
     * Default constructor.
     */
    public SofortPaymentInformation() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  countryCode  String value for countryCode.
     * @param  experienceContext  ExperienceContext value for experienceContext.
     */
    public SofortPaymentInformation(
            String name,
            String countryCode,
            ExperienceContext experienceContext) {
        this.name = name;
        this.countryCode = countryCode;
        this.experienceContext = experienceContext;
    }

    /**
     * Getter for Name.
     * The name of the account holder associated with this payment method.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the account holder associated with this payment method.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CountryCode.
     * The two-character ISO 3166-1 country code.
     * @return Returns the String
     */
    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * The two-character ISO 3166-1 country code.
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for ExperienceContext.
     * Customizes the payer experience during the approval process for the payment.
     * @return Returns the ExperienceContext
     */
    @JsonGetter("experience_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExperienceContext getExperienceContext() {
        return experienceContext;
    }

    /**
     * Setter for ExperienceContext.
     * Customizes the payer experience during the approval process for the payment.
     * @param experienceContext Value for ExperienceContext
     */
    @JsonSetter("experience_context")
    public void setExperienceContext(ExperienceContext experienceContext) {
        this.experienceContext = experienceContext;
    }

    /**
     * Converts this SofortPaymentInformation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SofortPaymentInformation [" + "name=" + name + ", countryCode=" + countryCode
                + ", experienceContext=" + experienceContext + "]";
    }

    /**
     * Builds a new {@link SofortPaymentInformation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SofortPaymentInformation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, countryCode)
                .experienceContext(getExperienceContext());
        return builder;
    }

    /**
     * Class to build instances of {@link SofortPaymentInformation}.
     */
    public static class Builder {
        private String name;
        private String countryCode;
        private ExperienceContext experienceContext;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  countryCode  String value for countryCode.
         */
        public Builder(String name, String countryCode) {
            this.name = name;
            this.countryCode = countryCode;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for experienceContext.
         * @param  experienceContext  ExperienceContext value for experienceContext.
         * @return Builder
         */
        public Builder experienceContext(ExperienceContext experienceContext) {
            this.experienceContext = experienceContext;
            return this;
        }

        /**
         * Builds a new {@link SofortPaymentInformation} object using the set fields.
         * @return {@link SofortPaymentInformation}
         */
        public SofortPaymentInformation build() {
            return new SofortPaymentInformation(name, countryCode, experienceContext);
        }
    }
}
