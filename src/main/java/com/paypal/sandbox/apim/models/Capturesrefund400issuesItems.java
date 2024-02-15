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
 * This is a model class for Capturesrefund400issuesItems type.
 */
public class Capturesrefund400issuesItems {
    private MissingRequiredParameterIssueEnum issue;
    private MissingRequiredParameter1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public Capturesrefund400issuesItems() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MissingRequiredParameterIssueEnum value for issue.
     * @param  description  MissingRequiredParameter1DescriptionEnum value for description.
     */
    public Capturesrefund400issuesItems(
            MissingRequiredParameterIssueEnum issue,
            MissingRequiredParameter1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MissingRequiredParameterIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingRequiredParameterIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MissingRequiredParameterIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MissingRequiredParameterIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MissingRequiredParameter1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingRequiredParameter1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MissingRequiredParameter1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MissingRequiredParameter1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this Capturesrefund400issuesItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Capturesrefund400issuesItems [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link Capturesrefund400issuesItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Capturesrefund400issuesItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link Capturesrefund400issuesItems}.
     */
    public static class Builder {
        private MissingRequiredParameterIssueEnum issue;
        private MissingRequiredParameter1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MissingRequiredParameterIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MissingRequiredParameterIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MissingRequiredParameter1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(MissingRequiredParameter1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link Capturesrefund400issuesItems} object using the set fields.
         * @return {@link Capturesrefund400issuesItems}
         */
        public Capturesrefund400issuesItems build() {
            return new Capturesrefund400issuesItems(issue, description);
        }
    }
}
