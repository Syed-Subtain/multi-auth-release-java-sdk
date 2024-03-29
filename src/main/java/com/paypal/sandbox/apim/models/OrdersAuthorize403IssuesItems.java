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
 * This is a model class for OrdersAuthorize403IssuesItems type.
 */
public class OrdersAuthorize403IssuesItems {
    private NotEligibleForTokenProcessingIssueEnum issue;
    private NotEligibleForTokenProcessingDescriptionEnum description;

    /**
     * Default constructor.
     */
    public OrdersAuthorize403IssuesItems() {
    }

    /**
     * Initialization constructor.
     * @param  issue  NotEligibleForTokenProcessingIssueEnum value for issue.
     * @param  description  NotEligibleForTokenProcessingDescriptionEnum value for description.
     */
    public OrdersAuthorize403IssuesItems(
            NotEligibleForTokenProcessingIssueEnum issue,
            NotEligibleForTokenProcessingDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the NotEligibleForTokenProcessingIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligibleForTokenProcessingIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for NotEligibleForTokenProcessingIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(NotEligibleForTokenProcessingIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the NotEligibleForTokenProcessingDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligibleForTokenProcessingDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for NotEligibleForTokenProcessingDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(NotEligibleForTokenProcessingDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this OrdersAuthorize403IssuesItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersAuthorize403IssuesItems [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link OrdersAuthorize403IssuesItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersAuthorize403IssuesItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersAuthorize403IssuesItems}.
     */
    public static class Builder {
        private NotEligibleForTokenProcessingIssueEnum issue;
        private NotEligibleForTokenProcessingDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  NotEligibleForTokenProcessingIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(NotEligibleForTokenProcessingIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  NotEligibleForTokenProcessingDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(NotEligibleForTokenProcessingDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link OrdersAuthorize403IssuesItems} object using the set fields.
         * @return {@link OrdersAuthorize403IssuesItems}
         */
        public OrdersAuthorize403IssuesItems build() {
            return new OrdersAuthorize403IssuesItems(issue, description);
        }
    }
}
