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
 * This is a model class for SHIPPINGOPTIONSNOTSUPPORTED type.
 */
public class SHIPPINGOPTIONSNOTSUPPORTED {
    private ShippingOptionNotSupportedIssueEnum issue;
    private ShippingOptionNotSupportedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public SHIPPINGOPTIONSNOTSUPPORTED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  ShippingOptionNotSupportedIssueEnum value for issue.
     * @param  description  ShippingOptionNotSupportedDescriptionEnum value for description.
     */
    public SHIPPINGOPTIONSNOTSUPPORTED(
            ShippingOptionNotSupportedIssueEnum issue,
            ShippingOptionNotSupportedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the ShippingOptionNotSupportedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingOptionNotSupportedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for ShippingOptionNotSupportedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(ShippingOptionNotSupportedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ShippingOptionNotSupportedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingOptionNotSupportedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ShippingOptionNotSupportedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(ShippingOptionNotSupportedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this SHIPPINGOPTIONSNOTSUPPORTED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SHIPPINGOPTIONSNOTSUPPORTED [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link SHIPPINGOPTIONSNOTSUPPORTED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SHIPPINGOPTIONSNOTSUPPORTED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link SHIPPINGOPTIONSNOTSUPPORTED}.
     */
    public static class Builder {
        private ShippingOptionNotSupportedIssueEnum issue;
        private ShippingOptionNotSupportedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  ShippingOptionNotSupportedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(ShippingOptionNotSupportedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ShippingOptionNotSupportedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(ShippingOptionNotSupportedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link SHIPPINGOPTIONSNOTSUPPORTED} object using the set fields.
         * @return {@link SHIPPINGOPTIONSNOTSUPPORTED}
         */
        public SHIPPINGOPTIONSNOTSUPPORTED build() {
            return new SHIPPINGOPTIONSNOTSUPPORTED(issue, description);
        }
    }
}
