/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.OrdersTrackCreate403IssuesItems;
import java.util.List;

/**
 * This is a model class for OrdersTrackCreate403 type.
 */
public class OrdersTrackCreate403 {
    private List<OrdersTrackCreate403IssuesItems> issues;

    /**
     * Default constructor.
     */
    public OrdersTrackCreate403() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of OrdersTrackCreate403IssuesItems value for issues.
     */
    public OrdersTrackCreate403(
            List<OrdersTrackCreate403IssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of OrdersTrackCreate403IssuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrdersTrackCreate403IssuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of OrdersTrackCreate403IssuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<OrdersTrackCreate403IssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this OrdersTrackCreate403 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersTrackCreate403 [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link OrdersTrackCreate403.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersTrackCreate403.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersTrackCreate403}.
     */
    public static class Builder {
        private List<OrdersTrackCreate403IssuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of OrdersTrackCreate403IssuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<OrdersTrackCreate403IssuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link OrdersTrackCreate403} object using the set fields.
         * @return {@link OrdersTrackCreate403}
         */
        public OrdersTrackCreate403 build() {
            return new OrdersTrackCreate403(issues);
        }
    }
}
