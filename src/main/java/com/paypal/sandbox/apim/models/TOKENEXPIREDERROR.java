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
 * This is a model class for TOKENEXPIREDERROR type.
 */
public class TOKENEXPIREDERROR {
    private TokenExpired1IssueEnum issue;
    private TokenExpired1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public TOKENEXPIREDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  TokenExpired1IssueEnum value for issue.
     * @param  description  TokenExpired1DescriptionEnum value for description.
     */
    public TOKENEXPIREDERROR(
            TokenExpired1IssueEnum issue,
            TokenExpired1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the TokenExpired1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenExpired1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for TokenExpired1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(TokenExpired1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the TokenExpired1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenExpired1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for TokenExpired1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(TokenExpired1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this TOKENEXPIREDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TOKENEXPIREDERROR [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link TOKENEXPIREDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TOKENEXPIREDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link TOKENEXPIREDERROR}.
     */
    public static class Builder {
        private TokenExpired1IssueEnum issue;
        private TokenExpired1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  TokenExpired1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(TokenExpired1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  TokenExpired1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(TokenExpired1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link TOKENEXPIREDERROR} object using the set fields.
         * @return {@link TOKENEXPIREDERROR}
         */
        public TOKENEXPIREDERROR build() {
            return new TOKENEXPIREDERROR(issue, description);
        }
    }
}
