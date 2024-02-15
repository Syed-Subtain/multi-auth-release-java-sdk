/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.UnauthorizedRequestErrorIssuesItems;
import java.util.List;

/**
 * This is a model class for UnauthorizedRequestError type.
 */
public class UnauthorizedRequestError {
    private List<UnauthorizedRequestErrorIssuesItems> issues;

    /**
     * Default constructor.
     */
    public UnauthorizedRequestError() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of UnauthorizedRequestErrorIssuesItems value for issues.
     */
    public UnauthorizedRequestError(
            List<UnauthorizedRequestErrorIssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of UnauthorizedRequestErrorIssuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UnauthorizedRequestErrorIssuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of UnauthorizedRequestErrorIssuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<UnauthorizedRequestErrorIssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this UnauthorizedRequestError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UnauthorizedRequestError [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link UnauthorizedRequestError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UnauthorizedRequestError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link UnauthorizedRequestError}.
     */
    public static class Builder {
        private List<UnauthorizedRequestErrorIssuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of UnauthorizedRequestErrorIssuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<UnauthorizedRequestErrorIssuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link UnauthorizedRequestError} object using the set fields.
         * @return {@link UnauthorizedRequestError}
         */
        public UnauthorizedRequestError build() {
            return new UnauthorizedRequestError(issues);
        }
    }
}