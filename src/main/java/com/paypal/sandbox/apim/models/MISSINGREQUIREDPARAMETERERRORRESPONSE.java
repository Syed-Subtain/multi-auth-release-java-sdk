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
 * This is a model class for MISSINGREQUIREDPARAMETERERRORRESPONSE type.
 */
public class MISSINGREQUIREDPARAMETERERRORRESPONSE {
    private MissingRequiredParameter5IssueEnum issue;
    private MissingRequiredParameter5DescriptionEnum description;

    /**
     * Default constructor.
     */
    public MISSINGREQUIREDPARAMETERERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MissingRequiredParameter5IssueEnum value for issue.
     * @param  description  MissingRequiredParameter5DescriptionEnum value for description.
     */
    public MISSINGREQUIREDPARAMETERERRORRESPONSE(
            MissingRequiredParameter5IssueEnum issue,
            MissingRequiredParameter5DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MissingRequiredParameter5IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingRequiredParameter5IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MissingRequiredParameter5IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MissingRequiredParameter5IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MissingRequiredParameter5DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingRequiredParameter5DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MissingRequiredParameter5DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MissingRequiredParameter5DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MISSINGREQUIREDPARAMETERERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MISSINGREQUIREDPARAMETERERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link MISSINGREQUIREDPARAMETERERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MISSINGREQUIREDPARAMETERERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MISSINGREQUIREDPARAMETERERRORRESPONSE}.
     */
    public static class Builder {
        private MissingRequiredParameter5IssueEnum issue;
        private MissingRequiredParameter5DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MissingRequiredParameter5IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MissingRequiredParameter5IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MissingRequiredParameter5DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(MissingRequiredParameter5DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MISSINGREQUIREDPARAMETERERRORRESPONSE} object using the set fields.
         * @return {@link MISSINGREQUIREDPARAMETERERRORRESPONSE}
         */
        public MISSINGREQUIREDPARAMETERERRORRESPONSE build() {
            return new MISSINGREQUIREDPARAMETERERRORRESPONSE(issue, description);
        }
    }
}