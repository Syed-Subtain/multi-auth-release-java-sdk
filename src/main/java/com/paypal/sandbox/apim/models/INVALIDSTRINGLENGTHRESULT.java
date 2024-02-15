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
 * This is a model class for INVALIDSTRINGLENGTHRESULT type.
 */
public class INVALIDSTRINGLENGTHRESULT {
    private InvalidStringLength4IssueEnum issue;
    private InvalidStringLength4DescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDSTRINGLENGTHRESULT() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidStringLength4IssueEnum value for issue.
     * @param  description  InvalidStringLength4DescriptionEnum value for description.
     */
    public INVALIDSTRINGLENGTHRESULT(
            InvalidStringLength4IssueEnum issue,
            InvalidStringLength4DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidStringLength4IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidStringLength4IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidStringLength4IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidStringLength4IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidStringLength4DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidStringLength4DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidStringLength4DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidStringLength4DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDSTRINGLENGTHRESULT into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDSTRINGLENGTHRESULT [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link INVALIDSTRINGLENGTHRESULT.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDSTRINGLENGTHRESULT.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDSTRINGLENGTHRESULT}.
     */
    public static class Builder {
        private InvalidStringLength4IssueEnum issue;
        private InvalidStringLength4DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidStringLength4IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidStringLength4IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidStringLength4DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidStringLength4DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDSTRINGLENGTHRESULT} object using the set fields.
         * @return {@link INVALIDSTRINGLENGTHRESULT}
         */
        public INVALIDSTRINGLENGTHRESULT build() {
            return new INVALIDSTRINGLENGTHRESULT(issue, description);
        }
    }
}
