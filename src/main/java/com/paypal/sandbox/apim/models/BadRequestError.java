/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.BadRequestErrorIssuesItems;
import java.util.List;

/**
 * This is a model class for BadRequestError type.
 */
public class BadRequestError {
    private List<BadRequestErrorIssuesItems> issues;

    /**
     * Default constructor.
     */
    public BadRequestError() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of BadRequestErrorIssuesItems value for issues.
     */
    public BadRequestError(
            List<BadRequestErrorIssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of BadRequestErrorIssuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BadRequestErrorIssuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of BadRequestErrorIssuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<BadRequestErrorIssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this BadRequestError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BadRequestError [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link BadRequestError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BadRequestError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link BadRequestError}.
     */
    public static class Builder {
        private List<BadRequestErrorIssuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of BadRequestErrorIssuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<BadRequestErrorIssuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link BadRequestError} object using the set fields.
         * @return {@link BadRequestError}
         */
        public BadRequestError build() {
            return new BadRequestError(issues);
        }
    }
}
