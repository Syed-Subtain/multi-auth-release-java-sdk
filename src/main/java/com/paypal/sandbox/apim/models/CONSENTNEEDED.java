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
 * This is a model class for CONSENTNEEDED type.
 */
public class CONSENTNEEDED {
    private ConsentNeededIssueEnum issue;
    private ConsentNeededDescriptionEnum description;

    /**
     * Default constructor.
     */
    public CONSENTNEEDED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  ConsentNeededIssueEnum value for issue.
     * @param  description  ConsentNeededDescriptionEnum value for description.
     */
    public CONSENTNEEDED(
            ConsentNeededIssueEnum issue,
            ConsentNeededDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the ConsentNeededIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ConsentNeededIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for ConsentNeededIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(ConsentNeededIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ConsentNeededDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ConsentNeededDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ConsentNeededDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(ConsentNeededDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this CONSENTNEEDED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CONSENTNEEDED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link CONSENTNEEDED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CONSENTNEEDED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CONSENTNEEDED}.
     */
    public static class Builder {
        private ConsentNeededIssueEnum issue;
        private ConsentNeededDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  ConsentNeededIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(ConsentNeededIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ConsentNeededDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(ConsentNeededDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link CONSENTNEEDED} object using the set fields.
         * @return {@link CONSENTNEEDED}
         */
        public CONSENTNEEDED build() {
            return new CONSENTNEEDED(issue, description);
        }
    }
}
