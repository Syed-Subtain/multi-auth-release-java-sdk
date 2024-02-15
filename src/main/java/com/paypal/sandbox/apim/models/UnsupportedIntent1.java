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
 * This is a model class for UnsupportedIntent1 type.
 */
public class UnsupportedIntent1 {
    private UnsupportedIntent1IssueEnum issue;
    private UnsupportedIntent1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public UnsupportedIntent1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  UnsupportedIntent1IssueEnum value for issue.
     * @param  description  UnsupportedIntent1DescriptionEnum value for description.
     */
    public UnsupportedIntent1(
            UnsupportedIntent1IssueEnum issue,
            UnsupportedIntent1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the UnsupportedIntent1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UnsupportedIntent1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for UnsupportedIntent1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(UnsupportedIntent1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the UnsupportedIntent1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UnsupportedIntent1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for UnsupportedIntent1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(UnsupportedIntent1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this UnsupportedIntent1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UnsupportedIntent1 [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link UnsupportedIntent1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UnsupportedIntent1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link UnsupportedIntent1}.
     */
    public static class Builder {
        private UnsupportedIntent1IssueEnum issue;
        private UnsupportedIntent1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  UnsupportedIntent1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(UnsupportedIntent1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  UnsupportedIntent1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(UnsupportedIntent1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link UnsupportedIntent1} object using the set fields.
         * @return {@link UnsupportedIntent1}
         */
        public UnsupportedIntent1 build() {
            return new UnsupportedIntent1(issue, description);
        }
    }
}
