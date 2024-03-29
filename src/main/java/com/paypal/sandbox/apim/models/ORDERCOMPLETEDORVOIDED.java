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
 * This is a model class for ORDERCOMPLETEDORVOIDED type.
 */
public class ORDERCOMPLETEDORVOIDED {
    private OrderCompletedOrVoidedIssueEnum issue;
    private OrderCompletedOrVoidedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public ORDERCOMPLETEDORVOIDED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  OrderCompletedOrVoidedIssueEnum value for issue.
     * @param  description  OrderCompletedOrVoidedDescriptionEnum value for description.
     */
    public ORDERCOMPLETEDORVOIDED(
            OrderCompletedOrVoidedIssueEnum issue,
            OrderCompletedOrVoidedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the OrderCompletedOrVoidedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderCompletedOrVoidedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for OrderCompletedOrVoidedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(OrderCompletedOrVoidedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the OrderCompletedOrVoidedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderCompletedOrVoidedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for OrderCompletedOrVoidedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(OrderCompletedOrVoidedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this ORDERCOMPLETEDORVOIDED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ORDERCOMPLETEDORVOIDED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link ORDERCOMPLETEDORVOIDED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ORDERCOMPLETEDORVOIDED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ORDERCOMPLETEDORVOIDED}.
     */
    public static class Builder {
        private OrderCompletedOrVoidedIssueEnum issue;
        private OrderCompletedOrVoidedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  OrderCompletedOrVoidedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(OrderCompletedOrVoidedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  OrderCompletedOrVoidedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(OrderCompletedOrVoidedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ORDERCOMPLETEDORVOIDED} object using the set fields.
         * @return {@link ORDERCOMPLETEDORVOIDED}
         */
        public ORDERCOMPLETEDORVOIDED build() {
            return new ORDERCOMPLETEDORVOIDED(issue, description);
        }
    }
}
