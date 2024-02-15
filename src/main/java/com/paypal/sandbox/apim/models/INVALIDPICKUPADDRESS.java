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
 * This is a model class for INVALIDPICKUPADDRESS type.
 */
public class INVALIDPICKUPADDRESS {
    private InvalidPickupAddressIssueEnum issue;
    private InvalidPickupAddressDescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDPICKUPADDRESS() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidPickupAddressIssueEnum value for issue.
     * @param  description  InvalidPickupAddressDescriptionEnum value for description.
     */
    public INVALIDPICKUPADDRESS(
            InvalidPickupAddressIssueEnum issue,
            InvalidPickupAddressDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidPickupAddressIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidPickupAddressIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidPickupAddressIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidPickupAddressIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidPickupAddressDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidPickupAddressDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidPickupAddressDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidPickupAddressDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDPICKUPADDRESS into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDPICKUPADDRESS [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link INVALIDPICKUPADDRESS.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDPICKUPADDRESS.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDPICKUPADDRESS}.
     */
    public static class Builder {
        private InvalidPickupAddressIssueEnum issue;
        private InvalidPickupAddressDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidPickupAddressIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidPickupAddressIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidPickupAddressDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidPickupAddressDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDPICKUPADDRESS} object using the set fields.
         * @return {@link INVALIDPICKUPADDRESS}
         */
        public INVALIDPICKUPADDRESS build() {
            return new INVALIDPICKUPADDRESS(issue, description);
        }
    }
}
