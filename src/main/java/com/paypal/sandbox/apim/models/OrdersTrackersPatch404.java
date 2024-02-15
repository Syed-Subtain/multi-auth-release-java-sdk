/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.OrdersTrackersPatch404IssuesItems;
import java.util.List;

/**
 * This is a model class for OrdersTrackersPatch404 type.
 */
public class OrdersTrackersPatch404 {
    private List<OrdersTrackersPatch404IssuesItems> issues;

    /**
     * Default constructor.
     */
    public OrdersTrackersPatch404() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of OrdersTrackersPatch404IssuesItems value for issues.
     */
    public OrdersTrackersPatch404(
            List<OrdersTrackersPatch404IssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of OrdersTrackersPatch404IssuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrdersTrackersPatch404IssuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of OrdersTrackersPatch404IssuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<OrdersTrackersPatch404IssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this OrdersTrackersPatch404 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersTrackersPatch404 [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link OrdersTrackersPatch404.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersTrackersPatch404.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersTrackersPatch404}.
     */
    public static class Builder {
        private List<OrdersTrackersPatch404IssuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of OrdersTrackersPatch404IssuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<OrdersTrackersPatch404IssuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link OrdersTrackersPatch404} object using the set fields.
         * @return {@link OrdersTrackersPatch404}
         */
        public OrdersTrackersPatch404 build() {
            return new OrdersTrackersPatch404(issues);
        }
    }
}
