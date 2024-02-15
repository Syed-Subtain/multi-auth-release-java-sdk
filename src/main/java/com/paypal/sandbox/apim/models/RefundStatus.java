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
 * This is a model class for RefundStatus type.
 */
public class RefundStatus {
    private RefundStatusStatusEnum status;
    private RefundStatusDetails statusDetails;

    /**
     * Default constructor.
     */
    public RefundStatus() {
    }

    /**
     * Initialization constructor.
     * @param  status  RefundStatusStatusEnum value for status.
     * @param  statusDetails  RefundStatusDetails value for statusDetails.
     */
    public RefundStatus(
            RefundStatusStatusEnum status,
            RefundStatusDetails statusDetails) {
        this.status = status;
        this.statusDetails = statusDetails;
    }

    /**
     * Getter for Status.
     * The status of the refund.
     * @return Returns the RefundStatusStatusEnum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefundStatusStatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status of the refund.
     * @param status Value for RefundStatusStatusEnum
     */
    @JsonSetter("status")
    public void setStatus(RefundStatusStatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for StatusDetails.
     * The details of the refund status.
     * @return Returns the RefundStatusDetails
     */
    @JsonGetter("status_details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefundStatusDetails getStatusDetails() {
        return statusDetails;
    }

    /**
     * Setter for StatusDetails.
     * The details of the refund status.
     * @param statusDetails Value for RefundStatusDetails
     */
    @JsonSetter("status_details")
    public void setStatusDetails(RefundStatusDetails statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * Converts this RefundStatus into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundStatus [" + "status=" + status + ", statusDetails=" + statusDetails + "]";
    }

    /**
     * Builds a new {@link RefundStatus.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundStatus.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .statusDetails(getStatusDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundStatus}.
     */
    public static class Builder {
        private RefundStatusStatusEnum status;
        private RefundStatusDetails statusDetails;



        /**
         * Setter for status.
         * @param  status  RefundStatusStatusEnum value for status.
         * @return Builder
         */
        public Builder status(RefundStatusStatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for statusDetails.
         * @param  statusDetails  RefundStatusDetails value for statusDetails.
         * @return Builder
         */
        public Builder statusDetails(RefundStatusDetails statusDetails) {
            this.statusDetails = statusDetails;
            return this;
        }

        /**
         * Builds a new {@link RefundStatus} object using the set fields.
         * @return {@link RefundStatus}
         */
        public RefundStatus build() {
            return new RefundStatus(status, statusDetails);
        }
    }
}
