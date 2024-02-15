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
 * This is a model class for VAULTINSTRUCTIONREQUIREDERROR type.
 */
public class VAULTINSTRUCTIONREQUIREDERROR {
    private VaultInstructionRequired1IssueEnum issue;
    private VaultInstructionRequired1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public VAULTINSTRUCTIONREQUIREDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  VaultInstructionRequired1IssueEnum value for issue.
     * @param  description  VaultInstructionRequired1DescriptionEnum value for description.
     */
    public VAULTINSTRUCTIONREQUIREDERROR(
            VaultInstructionRequired1IssueEnum issue,
            VaultInstructionRequired1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the VaultInstructionRequired1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultInstructionRequired1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for VaultInstructionRequired1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(VaultInstructionRequired1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the VaultInstructionRequired1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultInstructionRequired1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for VaultInstructionRequired1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(VaultInstructionRequired1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this VAULTINSTRUCTIONREQUIREDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VAULTINSTRUCTIONREQUIREDERROR [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link VAULTINSTRUCTIONREQUIREDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VAULTINSTRUCTIONREQUIREDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link VAULTINSTRUCTIONREQUIREDERROR}.
     */
    public static class Builder {
        private VaultInstructionRequired1IssueEnum issue;
        private VaultInstructionRequired1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  VaultInstructionRequired1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(VaultInstructionRequired1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  VaultInstructionRequired1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(VaultInstructionRequired1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link VAULTINSTRUCTIONREQUIREDERROR} object using the set fields.
         * @return {@link VAULTINSTRUCTIONREQUIREDERROR}
         */
        public VAULTINSTRUCTIONREQUIREDERROR build() {
            return new VAULTINSTRUCTIONREQUIREDERROR(issue, description);
        }
    }
}
