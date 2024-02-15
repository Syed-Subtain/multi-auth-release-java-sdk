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
 * This is a model class for ORDERALREADYCAPTURED type.
 */
public class ORDERALREADYCAPTURED {
    private OrderAlreadyCapturedIssueEnum issue;
    private OrderAlreadyCapturedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public ORDERALREADYCAPTURED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  OrderAlreadyCapturedIssueEnum value for issue.
     * @param  description  OrderAlreadyCapturedDescriptionEnum value for description.
     */
    public ORDERALREADYCAPTURED(
            OrderAlreadyCapturedIssueEnum issue,
            OrderAlreadyCapturedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the OrderAlreadyCapturedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderAlreadyCapturedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for OrderAlreadyCapturedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(OrderAlreadyCapturedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the OrderAlreadyCapturedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderAlreadyCapturedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for OrderAlreadyCapturedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(OrderAlreadyCapturedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this ORDERALREADYCAPTURED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ORDERALREADYCAPTURED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link ORDERALREADYCAPTURED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ORDERALREADYCAPTURED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ORDERALREADYCAPTURED}.
     */
    public static class Builder {
        private OrderAlreadyCapturedIssueEnum issue;
        private OrderAlreadyCapturedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  OrderAlreadyCapturedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(OrderAlreadyCapturedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  OrderAlreadyCapturedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(OrderAlreadyCapturedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ORDERALREADYCAPTURED} object using the set fields.
         * @return {@link ORDERALREADYCAPTURED}
         */
        public ORDERALREADYCAPTURED build() {
            return new ORDERALREADYCAPTURED(issue, description);
        }
    }
}
