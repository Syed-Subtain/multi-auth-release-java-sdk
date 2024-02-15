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
 * This is a model class for TransactionDateAndTimeStamps type.
 */
public class TransactionDateAndTimeStamps {
    private String createTime;
    private String updateTime;

    /**
     * Default constructor.
     */
    public TransactionDateAndTimeStamps() {
    }

    /**
     * Initialization constructor.
     * @param  createTime  String value for createTime.
     * @param  updateTime  String value for updateTime.
     */
    public TransactionDateAndTimeStamps(
            String createTime,
            String updateTime) {
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * Getter for CreateTime.
     * The date and time when the transaction occurred, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("create_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Setter for CreateTime.
     * The date and time when the transaction occurred, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param createTime Value for String
     */
    @JsonSetter("create_time")
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for UpdateTime.
     * The date and time when the transaction was last updated, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter for UpdateTime.
     * The date and time when the transaction was last updated, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param updateTime Value for String
     */
    @JsonSetter("update_time")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Converts this TransactionDateAndTimeStamps into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionDateAndTimeStamps [" + "createTime=" + createTime + ", updateTime="
                + updateTime + "]";
    }

    /**
     * Builds a new {@link TransactionDateAndTimeStamps.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionDateAndTimeStamps.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .createTime(getCreateTime())
                .updateTime(getUpdateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionDateAndTimeStamps}.
     */
    public static class Builder {
        private String createTime;
        private String updateTime;



        /**
         * Setter for createTime.
         * @param  createTime  String value for createTime.
         * @return Builder
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Setter for updateTime.
         * @param  updateTime  String value for updateTime.
         * @return Builder
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Builds a new {@link TransactionDateAndTimeStamps} object using the set fields.
         * @return {@link TransactionDateAndTimeStamps}
         */
        public TransactionDateAndTimeStamps build() {
            return new TransactionDateAndTimeStamps(createTime, updateTime);
        }
    }
}
