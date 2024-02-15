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
 * This is a model class for CAPTUREFULLYREFUNDED type.
 */
public class CAPTUREFULLYREFUNDED {
    private CapturesRefund422IssuesItemsAnyof6IssueEnum issue;
    private CapturesRefund422IssuesItemsAnyof6DescriptionEnum description;

    /**
     * Default constructor.
     */
    public CAPTUREFULLYREFUNDED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CapturesRefund422IssuesItemsAnyof6IssueEnum value for issue.
     * @param  description  CapturesRefund422IssuesItemsAnyof6DescriptionEnum value for description.
     */
    public CAPTUREFULLYREFUNDED(
            CapturesRefund422IssuesItemsAnyof6IssueEnum issue,
            CapturesRefund422IssuesItemsAnyof6DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CapturesRefund422IssuesItemsAnyof6IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CapturesRefund422IssuesItemsAnyof6IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CapturesRefund422IssuesItemsAnyof6IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CapturesRefund422IssuesItemsAnyof6IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CapturesRefund422IssuesItemsAnyof6DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CapturesRefund422IssuesItemsAnyof6DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CapturesRefund422IssuesItemsAnyof6DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CapturesRefund422IssuesItemsAnyof6DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this CAPTUREFULLYREFUNDED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CAPTUREFULLYREFUNDED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link CAPTUREFULLYREFUNDED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CAPTUREFULLYREFUNDED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CAPTUREFULLYREFUNDED}.
     */
    public static class Builder {
        private CapturesRefund422IssuesItemsAnyof6IssueEnum issue;
        private CapturesRefund422IssuesItemsAnyof6DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CapturesRefund422IssuesItemsAnyof6IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CapturesRefund422IssuesItemsAnyof6IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CapturesRefund422IssuesItemsAnyof6DescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(
                CapturesRefund422IssuesItemsAnyof6DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link CAPTUREFULLYREFUNDED} object using the set fields.
         * @return {@link CAPTUREFULLYREFUNDED}
         */
        public CAPTUREFULLYREFUNDED build() {
            return new CAPTUREFULLYREFUNDED(issue, description);
        }
    }
}
