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
 * This is a model class for MISSINGPICKUPADDRESS type.
 */
public class MISSINGPICKUPADDRESS {
    private MissingPickupAddressIssueEnum issue;
    private MissingPickupAddressDescriptionEnum description;

    /**
     * Default constructor.
     */
    public MISSINGPICKUPADDRESS() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MissingPickupAddressIssueEnum value for issue.
     * @param  description  MissingPickupAddressDescriptionEnum value for description.
     */
    public MISSINGPICKUPADDRESS(
            MissingPickupAddressIssueEnum issue,
            MissingPickupAddressDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MissingPickupAddressIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingPickupAddressIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MissingPickupAddressIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MissingPickupAddressIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MissingPickupAddressDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingPickupAddressDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MissingPickupAddressDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MissingPickupAddressDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MISSINGPICKUPADDRESS into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MISSINGPICKUPADDRESS [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link MISSINGPICKUPADDRESS.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MISSINGPICKUPADDRESS.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MISSINGPICKUPADDRESS}.
     */
    public static class Builder {
        private MissingPickupAddressIssueEnum issue;
        private MissingPickupAddressDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MissingPickupAddressIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MissingPickupAddressIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MissingPickupAddressDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(MissingPickupAddressDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MISSINGPICKUPADDRESS} object using the set fields.
         * @return {@link MISSINGPICKUPADDRESS}
         */
        public MISSINGPICKUPADDRESS build() {
            return new MISSINGPICKUPADDRESS(issue, description);
        }
    }
}
