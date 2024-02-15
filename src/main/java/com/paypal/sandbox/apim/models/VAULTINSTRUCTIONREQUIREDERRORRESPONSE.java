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
 * This is a model class for VAULTINSTRUCTIONREQUIREDERRORRESPONSE type.
 */
public class VAULTINSTRUCTIONREQUIREDERRORRESPONSE {
    private VaultInstructionRequired3IssueEnum issue;
    private VaultInstructionRequired3DescriptionEnum description;

    /**
     * Default constructor.
     */
    public VAULTINSTRUCTIONREQUIREDERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  VaultInstructionRequired3IssueEnum value for issue.
     * @param  description  VaultInstructionRequired3DescriptionEnum value for description.
     */
    public VAULTINSTRUCTIONREQUIREDERRORRESPONSE(
            VaultInstructionRequired3IssueEnum issue,
            VaultInstructionRequired3DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the VaultInstructionRequired3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultInstructionRequired3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for VaultInstructionRequired3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(VaultInstructionRequired3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the VaultInstructionRequired3DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultInstructionRequired3DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for VaultInstructionRequired3DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(VaultInstructionRequired3DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this VAULTINSTRUCTIONREQUIREDERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VAULTINSTRUCTIONREQUIREDERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link VAULTINSTRUCTIONREQUIREDERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VAULTINSTRUCTIONREQUIREDERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link VAULTINSTRUCTIONREQUIREDERRORRESPONSE}.
     */
    public static class Builder {
        private VaultInstructionRequired3IssueEnum issue;
        private VaultInstructionRequired3DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  VaultInstructionRequired3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(VaultInstructionRequired3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  VaultInstructionRequired3DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(VaultInstructionRequired3DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link VAULTINSTRUCTIONREQUIREDERRORRESPONSE} object using the set fields.
         * @return {@link VAULTINSTRUCTIONREQUIREDERRORRESPONSE}
         */
        public VAULTINSTRUCTIONREQUIREDERRORRESPONSE build() {
            return new VAULTINSTRUCTIONREQUIREDERRORRESPONSE(issue, description);
        }
    }
}
