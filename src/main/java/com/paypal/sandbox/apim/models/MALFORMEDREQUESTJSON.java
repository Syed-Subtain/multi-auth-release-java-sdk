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
 * This is a model class for MALFORMEDREQUESTJSON type.
 */
public class MALFORMEDREQUESTJSON {
    private MalformedRequestJsonIssueEnum issue;
    private MalformedRequestJsonDescriptionEnum description;

    /**
     * Default constructor.
     */
    public MALFORMEDREQUESTJSON() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MalformedRequestJsonIssueEnum value for issue.
     * @param  description  MalformedRequestJsonDescriptionEnum value for description.
     */
    public MALFORMEDREQUESTJSON(
            MalformedRequestJsonIssueEnum issue,
            MalformedRequestJsonDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MalformedRequestJsonIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MalformedRequestJsonIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MalformedRequestJsonIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MalformedRequestJsonIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MalformedRequestJsonDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MalformedRequestJsonDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MalformedRequestJsonDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MalformedRequestJsonDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MALFORMEDREQUESTJSON into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MALFORMEDREQUESTJSON [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link MALFORMEDREQUESTJSON.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MALFORMEDREQUESTJSON.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MALFORMEDREQUESTJSON}.
     */
    public static class Builder {
        private MalformedRequestJsonIssueEnum issue;
        private MalformedRequestJsonDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MalformedRequestJsonIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MalformedRequestJsonIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MalformedRequestJsonDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(MalformedRequestJsonDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MALFORMEDREQUESTJSON} object using the set fields.
         * @return {@link MALFORMEDREQUESTJSON}
         */
        public MALFORMEDREQUESTJSON build() {
            return new MALFORMEDREQUESTJSON(issue, description);
        }
    }
}
