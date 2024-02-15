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
 * This is a model class for NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE type.
 */
public class NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE {
    private NotEligibleForPnrefProcessing3IssueEnum issue;
    private NotEligibleForPnrefProcessing3DescriptionEnum description;

    /**
     * Default constructor.
     */
    public NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  NotEligibleForPnrefProcessing3IssueEnum value for issue.
     * @param  description  NotEligibleForPnrefProcessing3DescriptionEnum value for description.
     */
    public NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE(
            NotEligibleForPnrefProcessing3IssueEnum issue,
            NotEligibleForPnrefProcessing3DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the NotEligibleForPnrefProcessing3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligibleForPnrefProcessing3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for NotEligibleForPnrefProcessing3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(NotEligibleForPnrefProcessing3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the NotEligibleForPnrefProcessing3DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligibleForPnrefProcessing3DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for NotEligibleForPnrefProcessing3DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(NotEligibleForPnrefProcessing3DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE}.
     */
    public static class Builder {
        private NotEligibleForPnrefProcessing3IssueEnum issue;
        private NotEligibleForPnrefProcessing3DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  NotEligibleForPnrefProcessing3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(NotEligibleForPnrefProcessing3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  NotEligibleForPnrefProcessing3DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(NotEligibleForPnrefProcessing3DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE} object using the set
         * fields.
         * @return {@link NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE}
         */
        public NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE build() {
            return new NOTELIGIBLEFORPNREFPROCESSINGERRORRESPONSE(issue, description);
        }
    }
}
