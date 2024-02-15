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
 * This is a model class for FIELDNOTPATCHABLEERROR type.
 */
public class FIELDNOTPATCHABLEERROR {
    private FieldNotPatchable1IssueEnum issue;
    private FieldNotPatchable1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public FIELDNOTPATCHABLEERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  FieldNotPatchable1IssueEnum value for issue.
     * @param  description  FieldNotPatchable1DescriptionEnum value for description.
     */
    public FIELDNOTPATCHABLEERROR(
            FieldNotPatchable1IssueEnum issue,
            FieldNotPatchable1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the FieldNotPatchable1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FieldNotPatchable1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for FieldNotPatchable1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(FieldNotPatchable1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the FieldNotPatchable1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FieldNotPatchable1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for FieldNotPatchable1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(FieldNotPatchable1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this FIELDNOTPATCHABLEERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FIELDNOTPATCHABLEERROR [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link FIELDNOTPATCHABLEERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FIELDNOTPATCHABLEERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link FIELDNOTPATCHABLEERROR}.
     */
    public static class Builder {
        private FieldNotPatchable1IssueEnum issue;
        private FieldNotPatchable1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  FieldNotPatchable1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(FieldNotPatchable1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  FieldNotPatchable1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(FieldNotPatchable1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link FIELDNOTPATCHABLEERROR} object using the set fields.
         * @return {@link FIELDNOTPATCHABLEERROR}
         */
        public FIELDNOTPATCHABLEERROR build() {
            return new FIELDNOTPATCHABLEERROR(issue, description);
        }
    }
}
