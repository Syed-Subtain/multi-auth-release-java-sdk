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
 * This is a model class for PartyName type.
 */
public class PartyName {
    private String prefix;
    private String givenName;
    private String surname;
    private String middleName;
    private String suffix;
    private String alternateFullName;
    private String fullName;

    /**
     * Default constructor.
     */
    public PartyName() {
    }

    /**
     * Initialization constructor.
     * @param  prefix  String value for prefix.
     * @param  givenName  String value for givenName.
     * @param  surname  String value for surname.
     * @param  middleName  String value for middleName.
     * @param  suffix  String value for suffix.
     * @param  alternateFullName  String value for alternateFullName.
     * @param  fullName  String value for fullName.
     */
    public PartyName(
            String prefix,
            String givenName,
            String surname,
            String middleName,
            String suffix,
            String alternateFullName,
            String fullName) {
        this.prefix = prefix;
        this.givenName = givenName;
        this.surname = surname;
        this.middleName = middleName;
        this.suffix = suffix;
        this.alternateFullName = alternateFullName;
        this.fullName = fullName;
    }

    /**
     * Getter for Prefix.
     * The prefix, or title, to the party's name.
     * @return Returns the String
     */
    @JsonGetter("prefix")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrefix() {
        return prefix;
    }

    /**
     * Setter for Prefix.
     * The prefix, or title, to the party's name.
     * @param prefix Value for String
     */
    @JsonSetter("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Getter for GivenName.
     * When the party is a person, the party's given, or first, name.
     * @return Returns the String
     */
    @JsonGetter("given_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGivenName() {
        return givenName;
    }

    /**
     * Setter for GivenName.
     * When the party is a person, the party's given, or first, name.
     * @param givenName Value for String
     */
    @JsonSetter("given_name")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * Getter for Surname.
     * When the party is a person, the party's surname or family name. Also known as the last name.
     * Required when the party is a person. Use also to store multiple surnames including the
     * matronymic, or mother's, surname.
     * @return Returns the String
     */
    @JsonGetter("surname")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSurname() {
        return surname;
    }

    /**
     * Setter for Surname.
     * When the party is a person, the party's surname or family name. Also known as the last name.
     * Required when the party is a person. Use also to store multiple surnames including the
     * matronymic, or mother's, surname.
     * @param surname Value for String
     */
    @JsonSetter("surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Getter for MiddleName.
     * When the party is a person, the party's middle name. Use also to store multiple middle names
     * including the patronymic, or father's, middle name.
     * @return Returns the String
     */
    @JsonGetter("middle_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Setter for MiddleName.
     * When the party is a person, the party's middle name. Use also to store multiple middle names
     * including the patronymic, or father's, middle name.
     * @param middleName Value for String
     */
    @JsonSetter("middle_name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Getter for Suffix.
     * The suffix for the party's name.
     * @return Returns the String
     */
    @JsonGetter("suffix")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSuffix() {
        return suffix;
    }

    /**
     * Setter for Suffix.
     * The suffix for the party's name.
     * @param suffix Value for String
     */
    @JsonSetter("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * Getter for AlternateFullName.
     * DEPRECATED. The party's alternate name. Can be a business name, nickname, or any other name
     * that cannot be split into first, last name. Required when the party is a business.
     * @return Returns the String
     */
    @JsonGetter("alternate_full_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAlternateFullName() {
        return alternateFullName;
    }

    /**
     * Setter for AlternateFullName.
     * DEPRECATED. The party's alternate name. Can be a business name, nickname, or any other name
     * that cannot be split into first, last name. Required when the party is a business.
     * @param alternateFullName Value for String
     */
    @JsonSetter("alternate_full_name")
    public void setAlternateFullName(String alternateFullName) {
        this.alternateFullName = alternateFullName;
    }

    /**
     * Getter for FullName.
     * When the party is a person, the party's full name.
     * @return Returns the String
     */
    @JsonGetter("full_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFullName() {
        return fullName;
    }

    /**
     * Setter for FullName.
     * When the party is a person, the party's full name.
     * @param fullName Value for String
     */
    @JsonSetter("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Converts this PartyName into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PartyName [" + "prefix=" + prefix + ", givenName=" + givenName + ", surname="
                + surname + ", middleName=" + middleName + ", suffix=" + suffix
                + ", alternateFullName=" + alternateFullName + ", fullName=" + fullName + "]";
    }

    /**
     * Builds a new {@link PartyName.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PartyName.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .prefix(getPrefix())
                .givenName(getGivenName())
                .surname(getSurname())
                .middleName(getMiddleName())
                .suffix(getSuffix())
                .alternateFullName(getAlternateFullName())
                .fullName(getFullName());
        return builder;
    }

    /**
     * Class to build instances of {@link PartyName}.
     */
    public static class Builder {
        private String prefix;
        private String givenName;
        private String surname;
        private String middleName;
        private String suffix;
        private String alternateFullName;
        private String fullName;



        /**
         * Setter for prefix.
         * @param  prefix  String value for prefix.
         * @return Builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Setter for givenName.
         * @param  givenName  String value for givenName.
         * @return Builder
         */
        public Builder givenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        /**
         * Setter for surname.
         * @param  surname  String value for surname.
         * @return Builder
         */
        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        /**
         * Setter for middleName.
         * @param  middleName  String value for middleName.
         * @return Builder
         */
        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        /**
         * Setter for suffix.
         * @param  suffix  String value for suffix.
         * @return Builder
         */
        public Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        /**
         * Setter for alternateFullName.
         * @param  alternateFullName  String value for alternateFullName.
         * @return Builder
         */
        public Builder alternateFullName(String alternateFullName) {
            this.alternateFullName = alternateFullName;
            return this;
        }

        /**
         * Setter for fullName.
         * @param  fullName  String value for fullName.
         * @return Builder
         */
        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        /**
         * Builds a new {@link PartyName} object using the set fields.
         * @return {@link PartyName}
         */
        public PartyName build() {
            return new PartyName(prefix, givenName, surname, middleName, suffix, alternateFullName,
                    fullName);
        }
    }
}
