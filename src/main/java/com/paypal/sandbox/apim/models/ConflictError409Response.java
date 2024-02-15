/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.Conflicterror409responseissuesItems;
import java.util.List;

/**
 * This is a model class for ConflictError409Response type.
 */
public class ConflictError409Response {
    private List<Conflicterror409responseissuesItems> issues;

    /**
     * Default constructor.
     */
    public ConflictError409Response() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of Conflicterror409responseissuesItems value for issues.
     */
    public ConflictError409Response(
            List<Conflicterror409responseissuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of Conflicterror409responseissuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Conflicterror409responseissuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of Conflicterror409responseissuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<Conflicterror409responseissuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this ConflictError409Response into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConflictError409Response [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link ConflictError409Response.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConflictError409Response.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link ConflictError409Response}.
     */
    public static class Builder {
        private List<Conflicterror409responseissuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of Conflicterror409responseissuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<Conflicterror409responseissuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link ConflictError409Response} object using the set fields.
         * @return {@link ConflictError409Response}
         */
        public ConflictError409Response build() {
            return new ConflictError409Response(issues);
        }
    }
}
