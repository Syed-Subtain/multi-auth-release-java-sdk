/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.OrdersAuthorize422IssuesItems;
import java.util.List;

/**
 * This is a model class for OrdersAuthorize422 type.
 */
public class OrdersAuthorize422 {
    private List<OrdersAuthorize422IssuesItems> issues;

    /**
     * Default constructor.
     */
    public OrdersAuthorize422() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of OrdersAuthorize422IssuesItems value for issues.
     */
    public OrdersAuthorize422(
            List<OrdersAuthorize422IssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of OrdersAuthorize422IssuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrdersAuthorize422IssuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of OrdersAuthorize422IssuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<OrdersAuthorize422IssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this OrdersAuthorize422 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersAuthorize422 [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link OrdersAuthorize422.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersAuthorize422.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersAuthorize422}.
     */
    public static class Builder {
        private List<OrdersAuthorize422IssuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of OrdersAuthorize422IssuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<OrdersAuthorize422IssuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link OrdersAuthorize422} object using the set fields.
         * @return {@link OrdersAuthorize422}
         */
        public OrdersAuthorize422 build() {
            return new OrdersAuthorize422(issues);
        }
    }
}
