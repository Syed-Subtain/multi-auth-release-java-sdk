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
 * This is a model class for ORDERALREADYAUTHORIZEDERROR type.
 */
public class ORDERALREADYAUTHORIZEDERROR {
    private OrderAlreadyAuthorized1IssueEnum issue;
    private OrderAlreadyAuthorized1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public ORDERALREADYAUTHORIZEDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  OrderAlreadyAuthorized1IssueEnum value for issue.
     * @param  description  OrderAlreadyAuthorized1DescriptionEnum value for description.
     */
    public ORDERALREADYAUTHORIZEDERROR(
            OrderAlreadyAuthorized1IssueEnum issue,
            OrderAlreadyAuthorized1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the OrderAlreadyAuthorized1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderAlreadyAuthorized1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for OrderAlreadyAuthorized1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(OrderAlreadyAuthorized1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the OrderAlreadyAuthorized1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderAlreadyAuthorized1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for OrderAlreadyAuthorized1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(OrderAlreadyAuthorized1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this ORDERALREADYAUTHORIZEDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ORDERALREADYAUTHORIZEDERROR [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link ORDERALREADYAUTHORIZEDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ORDERALREADYAUTHORIZEDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ORDERALREADYAUTHORIZEDERROR}.
     */
    public static class Builder {
        private OrderAlreadyAuthorized1IssueEnum issue;
        private OrderAlreadyAuthorized1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  OrderAlreadyAuthorized1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(OrderAlreadyAuthorized1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  OrderAlreadyAuthorized1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(OrderAlreadyAuthorized1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ORDERALREADYAUTHORIZEDERROR} object using the set fields.
         * @return {@link ORDERALREADYAUTHORIZEDERROR}
         */
        public ORDERALREADYAUTHORIZEDERROR build() {
            return new ORDERALREADYAUTHORIZEDERROR(issue, description);
        }
    }
}
