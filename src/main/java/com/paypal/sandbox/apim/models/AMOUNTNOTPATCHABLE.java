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
 * This is a model class for AMOUNTNOTPATCHABLE type.
 */
public class AMOUNTNOTPATCHABLE {
    private AmountNotPatchableIssueEnum issue;
    private AmountNotPatchableDescriptionEnum description;

    /**
     * Default constructor.
     */
    public AMOUNTNOTPATCHABLE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  AmountNotPatchableIssueEnum value for issue.
     * @param  description  AmountNotPatchableDescriptionEnum value for description.
     */
    public AMOUNTNOTPATCHABLE(
            AmountNotPatchableIssueEnum issue,
            AmountNotPatchableDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the AmountNotPatchableIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AmountNotPatchableIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for AmountNotPatchableIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(AmountNotPatchableIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the AmountNotPatchableDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AmountNotPatchableDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for AmountNotPatchableDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(AmountNotPatchableDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this AMOUNTNOTPATCHABLE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AMOUNTNOTPATCHABLE [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link AMOUNTNOTPATCHABLE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AMOUNTNOTPATCHABLE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link AMOUNTNOTPATCHABLE}.
     */
    public static class Builder {
        private AmountNotPatchableIssueEnum issue;
        private AmountNotPatchableDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  AmountNotPatchableIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(AmountNotPatchableIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  AmountNotPatchableDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(AmountNotPatchableDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link AMOUNTNOTPATCHABLE} object using the set fields.
         * @return {@link AMOUNTNOTPATCHABLE}
         */
        public AMOUNTNOTPATCHABLE build() {
            return new AMOUNTNOTPATCHABLE(issue, description);
        }
    }
}
