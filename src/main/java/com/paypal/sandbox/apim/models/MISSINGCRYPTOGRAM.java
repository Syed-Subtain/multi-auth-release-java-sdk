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
 * This is a model class for MISSINGCRYPTOGRAM type.
 */
public class MISSINGCRYPTOGRAM {
    private MissingCryptogramIssueEnum issue;
    private MissingCryptogramDescriptionEnum description;

    /**
     * Default constructor.
     */
    public MISSINGCRYPTOGRAM() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MissingCryptogramIssueEnum value for issue.
     * @param  description  MissingCryptogramDescriptionEnum value for description.
     */
    public MISSINGCRYPTOGRAM(
            MissingCryptogramIssueEnum issue,
            MissingCryptogramDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MissingCryptogramIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingCryptogramIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MissingCryptogramIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MissingCryptogramIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MissingCryptogramDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingCryptogramDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MissingCryptogramDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MissingCryptogramDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MISSINGCRYPTOGRAM into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MISSINGCRYPTOGRAM [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link MISSINGCRYPTOGRAM.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MISSINGCRYPTOGRAM.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MISSINGCRYPTOGRAM}.
     */
    public static class Builder {
        private MissingCryptogramIssueEnum issue;
        private MissingCryptogramDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MissingCryptogramIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MissingCryptogramIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MissingCryptogramDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(MissingCryptogramDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MISSINGCRYPTOGRAM} object using the set fields.
         * @return {@link MISSINGCRYPTOGRAM}
         */
        public MISSINGCRYPTOGRAM build() {
            return new MISSINGCRYPTOGRAM(issue, description);
        }
    }
}
