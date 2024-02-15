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
 * This is a model class for VAULTINSTRUCTIONREQUIREDRESULT type.
 */
public class VAULTINSTRUCTIONREQUIREDRESULT {
    private VaultInstructionRequired2IssueEnum issue;
    private VaultInstructionRequired2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public VAULTINSTRUCTIONREQUIREDRESULT() {
    }

    /**
     * Initialization constructor.
     * @param  issue  VaultInstructionRequired2IssueEnum value for issue.
     * @param  description  VaultInstructionRequired2DescriptionEnum value for description.
     */
    public VAULTINSTRUCTIONREQUIREDRESULT(
            VaultInstructionRequired2IssueEnum issue,
            VaultInstructionRequired2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the VaultInstructionRequired2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultInstructionRequired2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for VaultInstructionRequired2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(VaultInstructionRequired2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the VaultInstructionRequired2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultInstructionRequired2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for VaultInstructionRequired2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(VaultInstructionRequired2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this VAULTINSTRUCTIONREQUIREDRESULT into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VAULTINSTRUCTIONREQUIREDRESULT [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link VAULTINSTRUCTIONREQUIREDRESULT.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VAULTINSTRUCTIONREQUIREDRESULT.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link VAULTINSTRUCTIONREQUIREDRESULT}.
     */
    public static class Builder {
        private VaultInstructionRequired2IssueEnum issue;
        private VaultInstructionRequired2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  VaultInstructionRequired2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(VaultInstructionRequired2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  VaultInstructionRequired2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(VaultInstructionRequired2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link VAULTINSTRUCTIONREQUIREDRESULT} object using the set fields.
         * @return {@link VAULTINSTRUCTIONREQUIREDRESULT}
         */
        public VAULTINSTRUCTIONREQUIREDRESULT build() {
            return new VAULTINSTRUCTIONREQUIREDRESULT(issue, description);
        }
    }
}
