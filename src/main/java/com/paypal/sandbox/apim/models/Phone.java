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
 * This is a model class for Phone type.
 */
public class Phone {
    private String countryCode;
    private String nationalNumber;
    private String extensionNumber;

    /**
     * Default constructor.
     */
    public Phone() {
    }

    /**
     * Initialization constructor.
     * @param  countryCode  String value for countryCode.
     * @param  nationalNumber  String value for nationalNumber.
     * @param  extensionNumber  String value for extensionNumber.
     */
    public Phone(
            String countryCode,
            String nationalNumber,
            String extensionNumber) {
        this.countryCode = countryCode;
        this.nationalNumber = nationalNumber;
        this.extensionNumber = extensionNumber;
    }

    /**
     * Getter for CountryCode.
     * The country calling code (CC), in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the CC and the
     * national number must not be greater than 15 digits. The national number consists of a
     * national destination code (NDC) and subscriber number (SN).
     * @return Returns the String
     */
    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * The country calling code (CC), in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the CC and the
     * national number must not be greater than 15 digits. The national number consists of a
     * national destination code (NDC) and subscriber number (SN).
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for NationalNumber.
     * The national number, in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the country calling
     * code (CC) and the national number must not be greater than 15 digits. The national number
     * consists of a national destination code (NDC) and subscriber number (SN).
     * @return Returns the String
     */
    @JsonGetter("national_number")
    public String getNationalNumber() {
        return nationalNumber;
    }

    /**
     * Setter for NationalNumber.
     * The national number, in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the country calling
     * code (CC) and the national number must not be greater than 15 digits. The national number
     * consists of a national destination code (NDC) and subscriber number (SN).
     * @param nationalNumber Value for String
     */
    @JsonSetter("national_number")
    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    /**
     * Getter for ExtensionNumber.
     * The extension number.
     * @return Returns the String
     */
    @JsonGetter("extension_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * Setter for ExtensionNumber.
     * The extension number.
     * @param extensionNumber Value for String
     */
    @JsonSetter("extension_number")
    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
    }

    /**
     * Converts this Phone into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Phone [" + "countryCode=" + countryCode + ", nationalNumber=" + nationalNumber
                + ", extensionNumber=" + extensionNumber + "]";
    }

    /**
     * Builds a new {@link Phone.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Phone.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(countryCode, nationalNumber)
                .extensionNumber(getExtensionNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link Phone}.
     */
    public static class Builder {
        private String countryCode;
        private String nationalNumber;
        private String extensionNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  countryCode  String value for countryCode.
         * @param  nationalNumber  String value for nationalNumber.
         */
        public Builder(String countryCode, String nationalNumber) {
            this.countryCode = countryCode;
            this.nationalNumber = nationalNumber;
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
         * Setter for nationalNumber.
         * @param  nationalNumber  String value for nationalNumber.
         * @return Builder
         */
        public Builder nationalNumber(String nationalNumber) {
            this.nationalNumber = nationalNumber;
            return this;
        }

        /**
         * Setter for extensionNumber.
         * @param  extensionNumber  String value for extensionNumber.
         * @return Builder
         */
        public Builder extensionNumber(String extensionNumber) {
            this.extensionNumber = extensionNumber;
            return this;
        }

        /**
         * Builds a new {@link Phone} object using the set fields.
         * @return {@link Phone}
         */
        public Phone build() {
            return new Phone(countryCode, nationalNumber, extensionNumber);
        }
    }
}
