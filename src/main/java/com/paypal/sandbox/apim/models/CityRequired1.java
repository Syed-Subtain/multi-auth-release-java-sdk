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
 * This is a model class for CityRequired1 type.
 */
public class CityRequired1 {
    private CityRequired1IssueEnum issue;
    private CityRequired1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public CityRequired1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CityRequired1IssueEnum value for issue.
     * @param  description  CityRequired1DescriptionEnum value for description.
     */
    public CityRequired1(
            CityRequired1IssueEnum issue,
            CityRequired1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CityRequired1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CityRequired1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CityRequired1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CityRequired1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CityRequired1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CityRequired1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CityRequired1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CityRequired1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this CityRequired1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CityRequired1 [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link CityRequired1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CityRequired1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CityRequired1}.
     */
    public static class Builder {
        private CityRequired1IssueEnum issue;
        private CityRequired1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CityRequired1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CityRequired1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CityRequired1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(CityRequired1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link CityRequired1} object using the set fields.
         * @return {@link CityRequired1}
         */
        public CityRequired1 build() {
            return new CityRequired1(issue, description);
        }
    }
}
