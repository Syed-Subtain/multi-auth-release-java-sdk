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
 * This is a model class for AUTHORIZATIONAMOUNTEXCEEDED type.
 */
public class AUTHORIZATIONAMOUNTEXCEEDED {
    private AuthorizationAmountExceededIssueEnum issue;
    private AuthorizationAmountExceededDescriptionEnum description;

    /**
     * Default constructor.
     */
    public AUTHORIZATIONAMOUNTEXCEEDED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  AuthorizationAmountExceededIssueEnum value for issue.
     * @param  description  AuthorizationAmountExceededDescriptionEnum value for description.
     */
    public AUTHORIZATIONAMOUNTEXCEEDED(
            AuthorizationAmountExceededIssueEnum issue,
            AuthorizationAmountExceededDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the AuthorizationAmountExceededIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationAmountExceededIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for AuthorizationAmountExceededIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(AuthorizationAmountExceededIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the AuthorizationAmountExceededDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationAmountExceededDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for AuthorizationAmountExceededDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(AuthorizationAmountExceededDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this AUTHORIZATIONAMOUNTEXCEEDED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AUTHORIZATIONAMOUNTEXCEEDED [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link AUTHORIZATIONAMOUNTEXCEEDED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AUTHORIZATIONAMOUNTEXCEEDED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link AUTHORIZATIONAMOUNTEXCEEDED}.
     */
    public static class Builder {
        private AuthorizationAmountExceededIssueEnum issue;
        private AuthorizationAmountExceededDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  AuthorizationAmountExceededIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(AuthorizationAmountExceededIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  AuthorizationAmountExceededDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(AuthorizationAmountExceededDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link AUTHORIZATIONAMOUNTEXCEEDED} object using the set fields.
         * @return {@link AUTHORIZATIONAMOUNTEXCEEDED}
         */
        public AUTHORIZATIONAMOUNTEXCEEDED build() {
            return new AUTHORIZATIONAMOUNTEXCEEDED(issue, description);
        }
    }
}