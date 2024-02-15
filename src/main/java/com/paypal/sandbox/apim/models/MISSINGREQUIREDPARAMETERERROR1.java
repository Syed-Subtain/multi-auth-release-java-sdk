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
 * This is a model class for MISSINGREQUIREDPARAMETERERROR1 type.
 */
public class MISSINGREQUIREDPARAMETERERROR1 {
    private MissingRequiredParameter3IssueEnum issue;
    private MissingRequiredParameter3DescriptionEnum description;

    /**
     * Default constructor.
     */
    public MISSINGREQUIREDPARAMETERERROR1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MissingRequiredParameter3IssueEnum value for issue.
     * @param  description  MissingRequiredParameter3DescriptionEnum value for description.
     */
    public MISSINGREQUIREDPARAMETERERROR1(
            MissingRequiredParameter3IssueEnum issue,
            MissingRequiredParameter3DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MissingRequiredParameter3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingRequiredParameter3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MissingRequiredParameter3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MissingRequiredParameter3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MissingRequiredParameter3DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingRequiredParameter3DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MissingRequiredParameter3DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MissingRequiredParameter3DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MISSINGREQUIREDPARAMETERERROR1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MISSINGREQUIREDPARAMETERERROR1 [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link MISSINGREQUIREDPARAMETERERROR1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MISSINGREQUIREDPARAMETERERROR1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MISSINGREQUIREDPARAMETERERROR1}.
     */
    public static class Builder {
        private MissingRequiredParameter3IssueEnum issue;
        private MissingRequiredParameter3DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MissingRequiredParameter3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MissingRequiredParameter3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MissingRequiredParameter3DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(MissingRequiredParameter3DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MISSINGREQUIREDPARAMETERERROR1} object using the set fields.
         * @return {@link MISSINGREQUIREDPARAMETERERROR1}
         */
        public MISSINGREQUIREDPARAMETERERROR1 build() {
            return new MISSINGREQUIREDPARAMETERERROR1(issue, description);
        }
    }
}