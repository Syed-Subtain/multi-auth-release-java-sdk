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
 * This is a model class for MALFORMEDREQUESTJSONRESULT type.
 */
public class MALFORMEDREQUESTJSONRESULT {
    private MalformedRequestJson3IssueEnum issue;
    private MalformedRequestJson3DescriptionEnum description;

    /**
     * Default constructor.
     */
    public MALFORMEDREQUESTJSONRESULT() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MalformedRequestJson3IssueEnum value for issue.
     * @param  description  MalformedRequestJson3DescriptionEnum value for description.
     */
    public MALFORMEDREQUESTJSONRESULT(
            MalformedRequestJson3IssueEnum issue,
            MalformedRequestJson3DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MalformedRequestJson3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MalformedRequestJson3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MalformedRequestJson3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MalformedRequestJson3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MalformedRequestJson3DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MalformedRequestJson3DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MalformedRequestJson3DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MalformedRequestJson3DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MALFORMEDREQUESTJSONRESULT into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MALFORMEDREQUESTJSONRESULT [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link MALFORMEDREQUESTJSONRESULT.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MALFORMEDREQUESTJSONRESULT.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MALFORMEDREQUESTJSONRESULT}.
     */
    public static class Builder {
        private MalformedRequestJson3IssueEnum issue;
        private MalformedRequestJson3DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MalformedRequestJson3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MalformedRequestJson3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MalformedRequestJson3DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(MalformedRequestJson3DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MALFORMEDREQUESTJSONRESULT} object using the set fields.
         * @return {@link MALFORMEDREQUESTJSONRESULT}
         */
        public MALFORMEDREQUESTJSONRESULT build() {
            return new MALFORMEDREQUESTJSONRESULT(issue, description);
        }
    }
}
