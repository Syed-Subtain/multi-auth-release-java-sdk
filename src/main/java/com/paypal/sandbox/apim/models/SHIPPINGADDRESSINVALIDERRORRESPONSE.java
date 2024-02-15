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
 * This is a model class for SHIPPINGADDRESSINVALIDERRORRESPONSE type.
 */
public class SHIPPINGADDRESSINVALIDERRORRESPONSE {
    private ShippingAddressInvalid3IssueEnum issue;
    private ShippingAddressInvalid3DescriptionEnum description;

    /**
     * Default constructor.
     */
    public SHIPPINGADDRESSINVALIDERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  ShippingAddressInvalid3IssueEnum value for issue.
     * @param  description  ShippingAddressInvalid3DescriptionEnum value for description.
     */
    public SHIPPINGADDRESSINVALIDERRORRESPONSE(
            ShippingAddressInvalid3IssueEnum issue,
            ShippingAddressInvalid3DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the ShippingAddressInvalid3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingAddressInvalid3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for ShippingAddressInvalid3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(ShippingAddressInvalid3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ShippingAddressInvalid3DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingAddressInvalid3DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ShippingAddressInvalid3DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(ShippingAddressInvalid3DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this SHIPPINGADDRESSINVALIDERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SHIPPINGADDRESSINVALIDERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link SHIPPINGADDRESSINVALIDERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SHIPPINGADDRESSINVALIDERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link SHIPPINGADDRESSINVALIDERRORRESPONSE}.
     */
    public static class Builder {
        private ShippingAddressInvalid3IssueEnum issue;
        private ShippingAddressInvalid3DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  ShippingAddressInvalid3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(ShippingAddressInvalid3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ShippingAddressInvalid3DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(ShippingAddressInvalid3DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link SHIPPINGADDRESSINVALIDERRORRESPONSE} object using the set fields.
         * @return {@link SHIPPINGADDRESSINVALIDERRORRESPONSE}
         */
        public SHIPPINGADDRESSINVALIDERRORRESPONSE build() {
            return new SHIPPINGADDRESSINVALIDERRORRESPONSE(issue, description);
        }
    }
}
