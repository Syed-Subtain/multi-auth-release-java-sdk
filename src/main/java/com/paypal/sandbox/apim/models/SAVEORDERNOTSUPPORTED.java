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
 * This is a model class for SAVEORDERNOTSUPPORTED type.
 */
public class SAVEORDERNOTSUPPORTED {
    private SaveOrderNotSupportedIssueEnum issue;
    private SaveOrderNotSupportedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public SAVEORDERNOTSUPPORTED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  SaveOrderNotSupportedIssueEnum value for issue.
     * @param  description  SaveOrderNotSupportedDescriptionEnum value for description.
     */
    public SAVEORDERNOTSUPPORTED(
            SaveOrderNotSupportedIssueEnum issue,
            SaveOrderNotSupportedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the SaveOrderNotSupportedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SaveOrderNotSupportedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for SaveOrderNotSupportedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(SaveOrderNotSupportedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the SaveOrderNotSupportedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SaveOrderNotSupportedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for SaveOrderNotSupportedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(SaveOrderNotSupportedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this SAVEORDERNOTSUPPORTED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SAVEORDERNOTSUPPORTED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link SAVEORDERNOTSUPPORTED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SAVEORDERNOTSUPPORTED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link SAVEORDERNOTSUPPORTED}.
     */
    public static class Builder {
        private SaveOrderNotSupportedIssueEnum issue;
        private SaveOrderNotSupportedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  SaveOrderNotSupportedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(SaveOrderNotSupportedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  SaveOrderNotSupportedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(SaveOrderNotSupportedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link SAVEORDERNOTSUPPORTED} object using the set fields.
         * @return {@link SAVEORDERNOTSUPPORTED}
         */
        public SAVEORDERNOTSUPPORTED build() {
            return new SAVEORDERNOTSUPPORTED(issue, description);
        }
    }
}
