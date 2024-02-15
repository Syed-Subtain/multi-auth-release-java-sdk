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
 * This is a model class for AUTHORIZATIONCURRENCYMISMATCH type.
 */
public class AUTHORIZATIONCURRENCYMISMATCH {
    private AuthorizationCurrencyMismatchIssueEnum issue;
    private AuthorizationCurrencyMismatchDescriptionEnum description;

    /**
     * Default constructor.
     */
    public AUTHORIZATIONCURRENCYMISMATCH() {
    }

    /**
     * Initialization constructor.
     * @param  issue  AuthorizationCurrencyMismatchIssueEnum value for issue.
     * @param  description  AuthorizationCurrencyMismatchDescriptionEnum value for description.
     */
    public AUTHORIZATIONCURRENCYMISMATCH(
            AuthorizationCurrencyMismatchIssueEnum issue,
            AuthorizationCurrencyMismatchDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the AuthorizationCurrencyMismatchIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationCurrencyMismatchIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for AuthorizationCurrencyMismatchIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(AuthorizationCurrencyMismatchIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the AuthorizationCurrencyMismatchDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationCurrencyMismatchDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for AuthorizationCurrencyMismatchDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(AuthorizationCurrencyMismatchDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this AUTHORIZATIONCURRENCYMISMATCH into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AUTHORIZATIONCURRENCYMISMATCH [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link AUTHORIZATIONCURRENCYMISMATCH.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AUTHORIZATIONCURRENCYMISMATCH.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link AUTHORIZATIONCURRENCYMISMATCH}.
     */
    public static class Builder {
        private AuthorizationCurrencyMismatchIssueEnum issue;
        private AuthorizationCurrencyMismatchDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  AuthorizationCurrencyMismatchIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(AuthorizationCurrencyMismatchIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  AuthorizationCurrencyMismatchDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(AuthorizationCurrencyMismatchDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link AUTHORIZATIONCURRENCYMISMATCH} object using the set fields.
         * @return {@link AUTHORIZATIONCURRENCYMISMATCH}
         */
        public AUTHORIZATIONCURRENCYMISMATCH build() {
            return new AUTHORIZATIONCURRENCYMISMATCH(issue, description);
        }
    }
}
