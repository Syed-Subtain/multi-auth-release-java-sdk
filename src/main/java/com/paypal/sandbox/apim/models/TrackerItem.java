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
 * This is a model class for TrackerItem type.
 */
public class TrackerItem {
    private String name;
    private String quantity;
    private String sku;
    private String imageUrl;
    private Object upc;

    /**
     * Default constructor.
     */
    public TrackerItem() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  quantity  String value for quantity.
     * @param  sku  String value for sku.
     * @param  imageUrl  String value for imageUrl.
     * @param  upc  Object value for upc.
     */
    public TrackerItem(
            String name,
            String quantity,
            String sku,
            String imageUrl,
            Object upc) {
        this.name = name;
        this.quantity = quantity;
        this.sku = sku;
        this.imageUrl = imageUrl;
        this.upc = upc;
    }

    /**
     * Getter for Name.
     * The item name or title.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The item name or title.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Quantity.
     * The item quantity. Must be a whole number.
     * @return Returns the String
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The item quantity. Must be a whole number.
     * @param quantity Value for String
     */
    @JsonSetter("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for Sku.
     * The stock keeping unit (SKU) for the item. This can contain unicode characters.
     * @return Returns the String
     */
    @JsonGetter("sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSku() {
        return sku;
    }

    /**
     * Setter for Sku.
     * The stock keeping unit (SKU) for the item. This can contain unicode characters.
     * @param sku Value for String
     */
    @JsonSetter("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * Getter for ImageUrl.
     * The URL of the item's image. File type and size restrictions apply. An image that violates
     * these restrictions will not be honored.
     * @return Returns the String
     */
    @JsonGetter("image_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Setter for ImageUrl.
     * The URL of the item's image. File type and size restrictions apply. An image that violates
     * these restrictions will not be honored.
     * @param imageUrl Value for String
     */
    @JsonSetter("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Getter for Upc.
     * The Universal Product Code of the item.
     * @return Returns the Object
     */
    @JsonGetter("upc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getUpc() {
        return upc;
    }

    /**
     * Setter for Upc.
     * The Universal Product Code of the item.
     * @param upc Value for Object
     */
    @JsonSetter("upc")
    public void setUpc(Object upc) {
        this.upc = upc;
    }

    /**
     * Converts this TrackerItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TrackerItem [" + "name=" + name + ", quantity=" + quantity + ", sku=" + sku
                + ", imageUrl=" + imageUrl + ", upc=" + upc + "]";
    }

    /**
     * Builds a new {@link TrackerItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TrackerItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .quantity(getQuantity())
                .sku(getSku())
                .imageUrl(getImageUrl())
                .upc(getUpc());
        return builder;
    }

    /**
     * Class to build instances of {@link TrackerItem}.
     */
    public static class Builder {
        private String name;
        private String quantity;
        private String sku;
        private String imageUrl;
        private Object upc;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  String value for quantity.
         * @return Builder
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for sku.
         * @param  sku  String value for sku.
         * @return Builder
         */
        public Builder sku(String sku) {
            this.sku = sku;
            return this;
        }

        /**
         * Setter for imageUrl.
         * @param  imageUrl  String value for imageUrl.
         * @return Builder
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Setter for upc.
         * @param  upc  Object value for upc.
         * @return Builder
         */
        public Builder upc(Object upc) {
            this.upc = upc;
            return this;
        }

        /**
         * Builds a new {@link TrackerItem} object using the set fields.
         * @return {@link TrackerItem}
         */
        public TrackerItem build() {
            return new TrackerItem(name, quantity, sku, imageUrl, upc);
        }
    }
}
