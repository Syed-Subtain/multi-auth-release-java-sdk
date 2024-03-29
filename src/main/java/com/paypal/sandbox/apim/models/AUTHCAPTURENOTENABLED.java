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
 * This is a model class for AUTHCAPTURENOTENABLED type.
 */
public class AUTHCAPTURENOTENABLED {
    private AuthCaptureNotEnabledIssueEnum issue;
    private AuthCaptureNotEnabledDescriptionEnum description;

    /**
     * Default constructor.
     */
    public AUTHCAPTURENOTENABLED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  AuthCaptureNotEnabledIssueEnum value for issue.
     * @param  description  AuthCaptureNotEnabledDescriptionEnum value for description.
     */
    public AUTHCAPTURENOTENABLED(
            AuthCaptureNotEnabledIssueEnum issue,
            AuthCaptureNotEnabledDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the AuthCaptureNotEnabledIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthCaptureNotEnabledIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for AuthCaptureNotEnabledIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(AuthCaptureNotEnabledIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the AuthCaptureNotEnabledDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthCaptureNotEnabledDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for AuthCaptureNotEnabledDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(AuthCaptureNotEnabledDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this AUTHCAPTURENOTENABLED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AUTHCAPTURENOTENABLED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link AUTHCAPTURENOTENABLED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AUTHCAPTURENOTENABLED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link AUTHCAPTURENOTENABLED}.
     */
    public static class Builder {
        private AuthCaptureNotEnabledIssueEnum issue;
        private AuthCaptureNotEnabledDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  AuthCaptureNotEnabledIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(AuthCaptureNotEnabledIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  AuthCaptureNotEnabledDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(AuthCaptureNotEnabledDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link AUTHCAPTURENOTENABLED} object using the set fields.
         * @return {@link AUTHCAPTURENOTENABLED}
         */
        public AUTHCAPTURENOTENABLED build() {
            return new AUTHCAPTURENOTENABLED(issue, description);
        }
    }
}
