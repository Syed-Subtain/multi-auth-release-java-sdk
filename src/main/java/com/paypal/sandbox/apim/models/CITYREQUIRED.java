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
 * This is a model class for CITYREQUIRED type.
 */
public class CITYREQUIRED {
    private CityRequiredIssueEnum issue;
    private CityRequiredDescriptionEnum description;

    /**
     * Default constructor.
     */
    public CITYREQUIRED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CityRequiredIssueEnum value for issue.
     * @param  description  CityRequiredDescriptionEnum value for description.
     */
    public CITYREQUIRED(
            CityRequiredIssueEnum issue,
            CityRequiredDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CityRequiredIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CityRequiredIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CityRequiredIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CityRequiredIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CityRequiredDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CityRequiredDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CityRequiredDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CityRequiredDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this CITYREQUIRED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CITYREQUIRED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link CITYREQUIRED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CITYREQUIRED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CITYREQUIRED}.
     */
    public static class Builder {
        private CityRequiredIssueEnum issue;
        private CityRequiredDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CityRequiredIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CityRequiredIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CityRequiredDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(CityRequiredDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link CITYREQUIRED} object using the set fields.
         * @return {@link CITYREQUIRED}
         */
        public CITYREQUIRED build() {
            return new CITYREQUIRED(issue, description);
        }
    }
}
