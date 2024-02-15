/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.OrdersPatch400IssuesItems;
import java.util.List;

/**
 * This is a model class for OrdersPatch400 type.
 */
public class OrdersPatch400 {
    private List<OrdersPatch400IssuesItems> issues;

    /**
     * Default constructor.
     */
    public OrdersPatch400() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of OrdersPatch400IssuesItems value for issues.
     */
    public OrdersPatch400(
            List<OrdersPatch400IssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of OrdersPatch400IssuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrdersPatch400IssuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of OrdersPatch400IssuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<OrdersPatch400IssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this OrdersPatch400 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersPatch400 [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link OrdersPatch400.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersPatch400.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersPatch400}.
     */
    public static class Builder {
        private List<OrdersPatch400IssuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of OrdersPatch400IssuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<OrdersPatch400IssuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link OrdersPatch400} object using the set fields.
         * @return {@link OrdersPatch400}
         */
        public OrdersPatch400 build() {
            return new OrdersPatch400(issues);
        }
    }
}
