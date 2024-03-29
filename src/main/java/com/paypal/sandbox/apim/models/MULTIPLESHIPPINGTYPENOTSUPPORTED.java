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
 * This is a model class for MULTIPLESHIPPINGTYPENOTSUPPORTED type.
 */
public class MULTIPLESHIPPINGTYPENOTSUPPORTED {
    private MultipleShippingTypeNotSupportedIssueEnum issue;
    private MultipleShippingTypeNotSupportedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public MULTIPLESHIPPINGTYPENOTSUPPORTED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MultipleShippingTypeNotSupportedIssueEnum value for issue.
     * @param  description  MultipleShippingTypeNotSupportedDescriptionEnum value for description.
     */
    public MULTIPLESHIPPINGTYPENOTSUPPORTED(
            MultipleShippingTypeNotSupportedIssueEnum issue,
            MultipleShippingTypeNotSupportedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MultipleShippingTypeNotSupportedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MultipleShippingTypeNotSupportedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MultipleShippingTypeNotSupportedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MultipleShippingTypeNotSupportedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MultipleShippingTypeNotSupportedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MultipleShippingTypeNotSupportedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MultipleShippingTypeNotSupportedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MultipleShippingTypeNotSupportedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MULTIPLESHIPPINGTYPENOTSUPPORTED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MULTIPLESHIPPINGTYPENOTSUPPORTED [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link MULTIPLESHIPPINGTYPENOTSUPPORTED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MULTIPLESHIPPINGTYPENOTSUPPORTED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MULTIPLESHIPPINGTYPENOTSUPPORTED}.
     */
    public static class Builder {
        private MultipleShippingTypeNotSupportedIssueEnum issue;
        private MultipleShippingTypeNotSupportedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MultipleShippingTypeNotSupportedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MultipleShippingTypeNotSupportedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MultipleShippingTypeNotSupportedDescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(MultipleShippingTypeNotSupportedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MULTIPLESHIPPINGTYPENOTSUPPORTED} object using the set fields.
         * @return {@link MULTIPLESHIPPINGTYPENOTSUPPORTED}
         */
        public MULTIPLESHIPPINGTYPENOTSUPPORTED build() {
            return new MULTIPLESHIPPINGTYPENOTSUPPORTED(issue, description);
        }
    }
}
