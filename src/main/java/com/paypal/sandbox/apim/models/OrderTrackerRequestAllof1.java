/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for OrderTrackerRequestAllof1 type.
 */
public class OrderTrackerRequestAllof1 {
    private String captureId;
    private Boolean notifyPayer;
    private List<TrackerItem> items;

    /**
     * Default constructor.
     */
    public OrderTrackerRequestAllof1() {
        notifyPayer = false;
    }

    /**
     * Initialization constructor.
     * @param  captureId  String value for captureId.
     * @param  notifyPayer  Boolean value for notifyPayer.
     * @param  items  List of TrackerItem value for items.
     */
    public OrderTrackerRequestAllof1(
            String captureId,
            Boolean notifyPayer,
            List<TrackerItem> items) {
        this.captureId = captureId;
        this.notifyPayer = notifyPayer;
        this.items = items;
    }

    /**
     * Getter for CaptureId.
     * The PayPal capture ID.
     * @return Returns the String
     */
    @JsonGetter("capture_id")
    public String getCaptureId() {
        return captureId;
    }

    /**
     * Setter for CaptureId.
     * The PayPal capture ID.
     * @param captureId Value for String
     */
    @JsonSetter("capture_id")
    public void setCaptureId(String captureId) {
        this.captureId = captureId;
    }

    /**
     * Getter for NotifyPayer.
     * If true, sends an email notification to the payer of the PayPal transaction. The email
     * contains the tracking information that was uploaded through the API.
     * @return Returns the Boolean
     */
    @JsonGetter("notify_payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getNotifyPayer() {
        return notifyPayer;
    }

    /**
     * Setter for NotifyPayer.
     * If true, sends an email notification to the payer of the PayPal transaction. The email
     * contains the tracking information that was uploaded through the API.
     * @param notifyPayer Value for Boolean
     */
    @JsonSetter("notify_payer")
    public void setNotifyPayer(Boolean notifyPayer) {
        this.notifyPayer = notifyPayer;
    }

    /**
     * Getter for Items.
     * An array of details of items in the shipment.
     * @return Returns the List of TrackerItem
     */
    @JsonGetter("items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TrackerItem> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * An array of details of items in the shipment.
     * @param items Value for List of TrackerItem
     */
    @JsonSetter("items")
    public void setItems(List<TrackerItem> items) {
        this.items = items;
    }

    /**
     * Converts this OrderTrackerRequestAllof1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderTrackerRequestAllof1 [" + "captureId=" + captureId + ", notifyPayer="
                + notifyPayer + ", items=" + items + "]";
    }

    /**
     * Builds a new {@link OrderTrackerRequestAllof1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderTrackerRequestAllof1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(captureId)
                .notifyPayer(getNotifyPayer())
                .items(getItems());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderTrackerRequestAllof1}.
     */
    public static class Builder {
        private String captureId;
        private Boolean notifyPayer = false;
        private List<TrackerItem> items;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  captureId  String value for captureId.
         */
        public Builder(String captureId) {
            this.captureId = captureId;
        }

        /**
         * Setter for captureId.
         * @param  captureId  String value for captureId.
         * @return Builder
         */
        public Builder captureId(String captureId) {
            this.captureId = captureId;
            return this;
        }

        /**
         * Setter for notifyPayer.
         * @param  notifyPayer  Boolean value for notifyPayer.
         * @return Builder
         */
        public Builder notifyPayer(Boolean notifyPayer) {
            this.notifyPayer = notifyPayer;
            return this;
        }

        /**
         * Setter for items.
         * @param  items  List of TrackerItem value for items.
         * @return Builder
         */
        public Builder items(List<TrackerItem> items) {
            this.items = items;
            return this;
        }

        /**
         * Builds a new {@link OrderTrackerRequestAllof1} object using the set fields.
         * @return {@link OrderTrackerRequestAllof1}
         */
        public OrderTrackerRequestAllof1 build() {
            return new OrderTrackerRequestAllof1(captureId, notifyPayer, items);
        }
    }
}
