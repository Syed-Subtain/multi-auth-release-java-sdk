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
 * This is a model class for CRYPTOGRAMISREQUIRED type.
 */
public class CRYPTOGRAMISREQUIRED {
    private CryptogramRequired3IssueEnum issue;
    private CryptogramRequired3DescriptionEnum description;

    /**
     * Default constructor.
     */
    public CRYPTOGRAMISREQUIRED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CryptogramRequired3IssueEnum value for issue.
     * @param  description  CryptogramRequired3DescriptionEnum value for description.
     */
    public CRYPTOGRAMISREQUIRED(
            CryptogramRequired3IssueEnum issue,
            CryptogramRequired3DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CryptogramRequired3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CryptogramRequired3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CryptogramRequired3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CryptogramRequired3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CryptogramRequired3DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CryptogramRequired3DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CryptogramRequired3DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CryptogramRequired3DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this CRYPTOGRAMISREQUIRED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CRYPTOGRAMISREQUIRED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link CRYPTOGRAMISREQUIRED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CRYPTOGRAMISREQUIRED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CRYPTOGRAMISREQUIRED}.
     */
    public static class Builder {
        private CryptogramRequired3IssueEnum issue;
        private CryptogramRequired3DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CryptogramRequired3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CryptogramRequired3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CryptogramRequired3DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(CryptogramRequired3DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link CRYPTOGRAMISREQUIRED} object using the set fields.
         * @return {@link CRYPTOGRAMISREQUIRED}
         */
        public CRYPTOGRAMISREQUIRED build() {
            return new CRYPTOGRAMISREQUIRED(issue, description);
        }
    }
}
