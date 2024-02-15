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
 * This is a model class for ITEMSKUMISMATCH type.
 */
public class ITEMSKUMISMATCH {
    private ItemSkuMismatchIssueEnum issue;
    private ItemSkuMismatchDescriptionEnum description;

    /**
     * Default constructor.
     */
    public ITEMSKUMISMATCH() {
    }

    /**
     * Initialization constructor.
     * @param  issue  ItemSkuMismatchIssueEnum value for issue.
     * @param  description  ItemSkuMismatchDescriptionEnum value for description.
     */
    public ITEMSKUMISMATCH(
            ItemSkuMismatchIssueEnum issue,
            ItemSkuMismatchDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the ItemSkuMismatchIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ItemSkuMismatchIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for ItemSkuMismatchIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(ItemSkuMismatchIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ItemSkuMismatchDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ItemSkuMismatchDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ItemSkuMismatchDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(ItemSkuMismatchDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this ITEMSKUMISMATCH into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ITEMSKUMISMATCH [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link ITEMSKUMISMATCH.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ITEMSKUMISMATCH.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ITEMSKUMISMATCH}.
     */
    public static class Builder {
        private ItemSkuMismatchIssueEnum issue;
        private ItemSkuMismatchDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  ItemSkuMismatchIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(ItemSkuMismatchIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ItemSkuMismatchDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(ItemSkuMismatchDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ITEMSKUMISMATCH} object using the set fields.
         * @return {@link ITEMSKUMISMATCH}
         */
        public ITEMSKUMISMATCH build() {
            return new ITEMSKUMISMATCH(issue, description);
        }
    }
}
