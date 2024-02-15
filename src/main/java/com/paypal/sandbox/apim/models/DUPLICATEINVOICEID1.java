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
 * This is a model class for DUPLICATEINVOICEID1 type.
 */
public class DUPLICATEINVOICEID1 {
    private DuplicateInvoiceIdIssueEnum issue;
    private DuplicateInvoiceIdDescription1Enum description;

    /**
     * Default constructor.
     */
    public DUPLICATEINVOICEID1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  DuplicateInvoiceIdIssueEnum value for issue.
     * @param  description  DuplicateInvoiceIdDescription1Enum value for description.
     */
    public DUPLICATEINVOICEID1(
            DuplicateInvoiceIdIssueEnum issue,
            DuplicateInvoiceIdDescription1Enum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the DuplicateInvoiceIdIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DuplicateInvoiceIdIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for DuplicateInvoiceIdIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(DuplicateInvoiceIdIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the DuplicateInvoiceIdDescription1Enum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DuplicateInvoiceIdDescription1Enum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for DuplicateInvoiceIdDescription1Enum
     */
    @JsonSetter("description")
    public void setDescription(DuplicateInvoiceIdDescription1Enum description) {
        this.description = description;
    }

    /**
     * Converts this DUPLICATEINVOICEID1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DUPLICATEINVOICEID1 [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link DUPLICATEINVOICEID1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DUPLICATEINVOICEID1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link DUPLICATEINVOICEID1}.
     */
    public static class Builder {
        private DuplicateInvoiceIdIssueEnum issue;
        private DuplicateInvoiceIdDescription1Enum description;



        /**
         * Setter for issue.
         * @param  issue  DuplicateInvoiceIdIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(DuplicateInvoiceIdIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  DuplicateInvoiceIdDescription1Enum value for description.
         * @return Builder
         */
        public Builder description(DuplicateInvoiceIdDescription1Enum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link DUPLICATEINVOICEID1} object using the set fields.
         * @return {@link DUPLICATEINVOICEID1}
         */
        public DUPLICATEINVOICEID1 build() {
            return new DUPLICATEINVOICEID1(issue, description);
        }
    }
}