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
 * This is a model class for INVALIDCURRENCYCODE2 type.
 */
public class INVALIDCURRENCYCODE2 {
    private InvalidCurrencyCodeIssueEnum issue;
    private InvalidCurrencyCodeDescription1Enum description;

    /**
     * Default constructor.
     */
    public INVALIDCURRENCYCODE2() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidCurrencyCodeIssueEnum value for issue.
     * @param  description  InvalidCurrencyCodeDescription1Enum value for description.
     */
    public INVALIDCURRENCYCODE2(
            InvalidCurrencyCodeIssueEnum issue,
            InvalidCurrencyCodeDescription1Enum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidCurrencyCodeIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidCurrencyCodeIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidCurrencyCodeIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidCurrencyCodeIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidCurrencyCodeDescription1Enum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidCurrencyCodeDescription1Enum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidCurrencyCodeDescription1Enum
     */
    @JsonSetter("description")
    public void setDescription(InvalidCurrencyCodeDescription1Enum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDCURRENCYCODE2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDCURRENCYCODE2 [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link INVALIDCURRENCYCODE2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDCURRENCYCODE2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDCURRENCYCODE2}.
     */
    public static class Builder {
        private InvalidCurrencyCodeIssueEnum issue;
        private InvalidCurrencyCodeDescription1Enum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidCurrencyCodeIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidCurrencyCodeIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidCurrencyCodeDescription1Enum value for description.
         * @return Builder
         */
        public Builder description(InvalidCurrencyCodeDescription1Enum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDCURRENCYCODE2} object using the set fields.
         * @return {@link INVALIDCURRENCYCODE2}
         */
        public INVALIDCURRENCYCODE2 build() {
            return new INVALIDCURRENCYCODE2(issue, description);
        }
    }
}
