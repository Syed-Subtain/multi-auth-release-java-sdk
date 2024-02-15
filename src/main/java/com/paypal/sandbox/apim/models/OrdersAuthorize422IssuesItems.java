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
 * This is a model class for OrdersAuthorize422IssuesItems type.
 */
public class OrdersAuthorize422IssuesItems {
    private ActionDoesNotMatchIntentIssueEnum issue;
    private ActionDoesNotMatchIntentDescriptionEnum description;

    /**
     * Default constructor.
     */
    public OrdersAuthorize422IssuesItems() {
    }

    /**
     * Initialization constructor.
     * @param  issue  ActionDoesNotMatchIntentIssueEnum value for issue.
     * @param  description  ActionDoesNotMatchIntentDescriptionEnum value for description.
     */
    public OrdersAuthorize422IssuesItems(
            ActionDoesNotMatchIntentIssueEnum issue,
            ActionDoesNotMatchIntentDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the ActionDoesNotMatchIntentIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ActionDoesNotMatchIntentIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for ActionDoesNotMatchIntentIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(ActionDoesNotMatchIntentIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ActionDoesNotMatchIntentDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ActionDoesNotMatchIntentDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ActionDoesNotMatchIntentDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(ActionDoesNotMatchIntentDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this OrdersAuthorize422IssuesItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersAuthorize422IssuesItems [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link OrdersAuthorize422IssuesItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersAuthorize422IssuesItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersAuthorize422IssuesItems}.
     */
    public static class Builder {
        private ActionDoesNotMatchIntentIssueEnum issue;
        private ActionDoesNotMatchIntentDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  ActionDoesNotMatchIntentIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(ActionDoesNotMatchIntentIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ActionDoesNotMatchIntentDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(ActionDoesNotMatchIntentDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link OrdersAuthorize422IssuesItems} object using the set fields.
         * @return {@link OrdersAuthorize422IssuesItems}
         */
        public OrdersAuthorize422IssuesItems build() {
            return new OrdersAuthorize422IssuesItems(issue, description);
        }
    }
}
