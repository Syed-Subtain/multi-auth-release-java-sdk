/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.containers.OrdersPatch422IssuesItems;
import java.util.List;

/**
 * This is a model class for OrdersPatch422 type.
 */
public class OrdersPatch422 {
    private List<OrdersPatch422IssuesItems> issues;

    /**
     * Default constructor.
     */
    public OrdersPatch422() {
    }

    /**
     * Initialization constructor.
     * @param  issues  List of OrdersPatch422IssuesItems value for issues.
     */
    public OrdersPatch422(
            List<OrdersPatch422IssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of OrdersPatch422IssuesItems
     */
    @JsonGetter("issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrdersPatch422IssuesItems> getIssues() {
        return issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of OrdersPatch422IssuesItems
     */
    @JsonSetter("issues")
    public void setIssues(List<OrdersPatch422IssuesItems> issues) {
        this.issues = issues;
    }

    /**
     * Converts this OrdersPatch422 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersPatch422 [" + "issues=" + issues + "]";
    }

    /**
     * Builds a new {@link OrdersPatch422.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersPatch422.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issues(getIssues());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersPatch422}.
     */
    public static class Builder {
        private List<OrdersPatch422IssuesItems> issues;



        /**
         * Setter for issues.
         * @param  issues  List of OrdersPatch422IssuesItems value for issues.
         * @return Builder
         */
        public Builder issues(List<OrdersPatch422IssuesItems> issues) {
            this.issues = issues;
            return this;
        }

        /**
         * Builds a new {@link OrdersPatch422} object using the set fields.
         * @return {@link OrdersPatch422}
         */
        public OrdersPatch422 build() {
            return new OrdersPatch422(issues);
        }
    }
}