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
 * This is a model class for TaxTotalRequired1 type.
 */
public class TaxTotalRequired1 {
    private TaxTotalRequired1IssueEnum issue;
    private TaxTotalRequired1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public TaxTotalRequired1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  TaxTotalRequired1IssueEnum value for issue.
     * @param  description  TaxTotalRequired1DescriptionEnum value for description.
     */
    public TaxTotalRequired1(
            TaxTotalRequired1IssueEnum issue,
            TaxTotalRequired1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the TaxTotalRequired1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxTotalRequired1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for TaxTotalRequired1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(TaxTotalRequired1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the TaxTotalRequired1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxTotalRequired1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for TaxTotalRequired1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(TaxTotalRequired1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this TaxTotalRequired1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TaxTotalRequired1 [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link TaxTotalRequired1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TaxTotalRequired1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link TaxTotalRequired1}.
     */
    public static class Builder {
        private TaxTotalRequired1IssueEnum issue;
        private TaxTotalRequired1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  TaxTotalRequired1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(TaxTotalRequired1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  TaxTotalRequired1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(TaxTotalRequired1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link TaxTotalRequired1} object using the set fields.
         * @return {@link TaxTotalRequired1}
         */
        public TaxTotalRequired1 build() {
            return new TaxTotalRequired1(issue, description);
        }
    }
}
