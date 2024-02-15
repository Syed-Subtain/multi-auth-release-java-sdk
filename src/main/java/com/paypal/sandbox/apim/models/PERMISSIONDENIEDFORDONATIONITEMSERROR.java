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
 * This is a model class for PERMISSIONDENIEDFORDONATIONITEMSERROR type.
 */
public class PERMISSIONDENIEDFORDONATIONITEMSERROR {
    private PermissionDeniedForDonationItems1IssueEnum issue;
    private PermissionDeniedForDonationItems1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public PERMISSIONDENIEDFORDONATIONITEMSERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PermissionDeniedForDonationItems1IssueEnum value for issue.
     * @param  description  PermissionDeniedForDonationItems1DescriptionEnum value for description.
     */
    public PERMISSIONDENIEDFORDONATIONITEMSERROR(
            PermissionDeniedForDonationItems1IssueEnum issue,
            PermissionDeniedForDonationItems1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PermissionDeniedForDonationItems1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PermissionDeniedForDonationItems1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PermissionDeniedForDonationItems1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PermissionDeniedForDonationItems1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PermissionDeniedForDonationItems1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PermissionDeniedForDonationItems1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PermissionDeniedForDonationItems1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PermissionDeniedForDonationItems1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PERMISSIONDENIEDFORDONATIONITEMSERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PERMISSIONDENIEDFORDONATIONITEMSERROR [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link PERMISSIONDENIEDFORDONATIONITEMSERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PERMISSIONDENIEDFORDONATIONITEMSERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PERMISSIONDENIEDFORDONATIONITEMSERROR}.
     */
    public static class Builder {
        private PermissionDeniedForDonationItems1IssueEnum issue;
        private PermissionDeniedForDonationItems1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PermissionDeniedForDonationItems1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PermissionDeniedForDonationItems1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PermissionDeniedForDonationItems1DescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(PermissionDeniedForDonationItems1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PERMISSIONDENIEDFORDONATIONITEMSERROR} object using the set fields.
         * @return {@link PERMISSIONDENIEDFORDONATIONITEMSERROR}
         */
        public PERMISSIONDENIEDFORDONATIONITEMSERROR build() {
            return new PERMISSIONDENIEDFORDONATIONITEMSERROR(issue, description);
        }
    }
}
