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
 * This is a model class for AmountBreakdown type.
 */
public class AmountBreakdown {
    private Money itemTotal;
    private Money shipping;
    private Money handling;
    private Money taxTotal;
    private Money insurance;
    private Money shippingDiscount;
    private Money discount;

    /**
     * Default constructor.
     */
    public AmountBreakdown() {
    }

    /**
     * Initialization constructor.
     * @param  itemTotal  Money value for itemTotal.
     * @param  shipping  Money value for shipping.
     * @param  handling  Money value for handling.
     * @param  taxTotal  Money value for taxTotal.
     * @param  insurance  Money value for insurance.
     * @param  shippingDiscount  Money value for shippingDiscount.
     * @param  discount  Money value for discount.
     */
    public AmountBreakdown(
            Money itemTotal,
            Money shipping,
            Money handling,
            Money taxTotal,
            Money insurance,
            Money shippingDiscount,
            Money discount) {
        this.itemTotal = itemTotal;
        this.shipping = shipping;
        this.handling = handling;
        this.taxTotal = taxTotal;
        this.insurance = insurance;
        this.shippingDiscount = shippingDiscount;
        this.discount = discount;
    }

    /**
     * Getter for ItemTotal.
     * The subtotal for all items. Required if the request includes
     * `purchase_units[].items[].unit_amount`. Must equal the sum of `(items[].unit_amount *
     * items[].quantity)` for all items. &lt;code&gt;item_total.value&lt;/code&gt; can not be a negative number.
     * @return Returns the Money
     */
    @JsonGetter("item_total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getItemTotal() {
        return itemTotal;
    }

    /**
     * Setter for ItemTotal.
     * The subtotal for all items. Required if the request includes
     * `purchase_units[].items[].unit_amount`. Must equal the sum of `(items[].unit_amount *
     * items[].quantity)` for all items. &lt;code&gt;item_total.value&lt;/code&gt; can not be a negative number.
     * @param itemTotal Value for Money
     */
    @JsonSetter("item_total")
    public void setItemTotal(Money itemTotal) {
        this.itemTotal = itemTotal;
    }

    /**
     * Getter for Shipping.
     * The shipping fee for all items within a given `purchase_unit`. &lt;code&gt;shipping.value&lt;/code&gt;
     * can not be a negative number.
     * @return Returns the Money
     */
    @JsonGetter("shipping")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getShipping() {
        return shipping;
    }

    /**
     * Setter for Shipping.
     * The shipping fee for all items within a given `purchase_unit`. &lt;code&gt;shipping.value&lt;/code&gt;
     * can not be a negative number.
     * @param shipping Value for Money
     */
    @JsonSetter("shipping")
    public void setShipping(Money shipping) {
        this.shipping = shipping;
    }

    /**
     * Getter for Handling.
     * The handling fee for all items within a given `purchase_unit`. &lt;code&gt;handling.value&lt;/code&gt;
     * can not be a negative number.
     * @return Returns the Money
     */
    @JsonGetter("handling")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getHandling() {
        return handling;
    }

    /**
     * Setter for Handling.
     * The handling fee for all items within a given `purchase_unit`. &lt;code&gt;handling.value&lt;/code&gt;
     * can not be a negative number.
     * @param handling Value for Money
     */
    @JsonSetter("handling")
    public void setHandling(Money handling) {
        this.handling = handling;
    }

    /**
     * Getter for TaxTotal.
     * The total tax for all items. Required if the request includes `purchase_units.items.tax`.
     * Must equal the sum of `(items[].tax * items[].quantity)` for all items.
     * &lt;code&gt;tax_total.value&lt;/code&gt; can not be a negative number.
     * @return Returns the Money
     */
    @JsonGetter("tax_total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getTaxTotal() {
        return taxTotal;
    }

    /**
     * Setter for TaxTotal.
     * The total tax for all items. Required if the request includes `purchase_units.items.tax`.
     * Must equal the sum of `(items[].tax * items[].quantity)` for all items.
     * &lt;code&gt;tax_total.value&lt;/code&gt; can not be a negative number.
     * @param taxTotal Value for Money
     */
    @JsonSetter("tax_total")
    public void setTaxTotal(Money taxTotal) {
        this.taxTotal = taxTotal;
    }

    /**
     * Getter for Insurance.
     * The insurance fee for all items within a given `purchase_unit`. &lt;code&gt;insurance.value&lt;/code&gt;
     * can not be a negative number.
     * @return Returns the Money
     */
    @JsonGetter("insurance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getInsurance() {
        return insurance;
    }

    /**
     * Setter for Insurance.
     * The insurance fee for all items within a given `purchase_unit`. &lt;code&gt;insurance.value&lt;/code&gt;
     * can not be a negative number.
     * @param insurance Value for Money
     */
    @JsonSetter("insurance")
    public void setInsurance(Money insurance) {
        this.insurance = insurance;
    }

    /**
     * Getter for ShippingDiscount.
     * The shipping discount for all items within a given `purchase_unit`.
     * &lt;code&gt;shipping_discount.value&lt;/code&gt; can not be a negative number.
     * @return Returns the Money
     */
    @JsonGetter("shipping_discount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getShippingDiscount() {
        return shippingDiscount;
    }

    /**
     * Setter for ShippingDiscount.
     * The shipping discount for all items within a given `purchase_unit`.
     * &lt;code&gt;shipping_discount.value&lt;/code&gt; can not be a negative number.
     * @param shippingDiscount Value for Money
     */
    @JsonSetter("shipping_discount")
    public void setShippingDiscount(Money shippingDiscount) {
        this.shippingDiscount = shippingDiscount;
    }

    /**
     * Getter for Discount.
     * The discount for all items within a given `purchase_unit`. &lt;code&gt;discount.value&lt;/code&gt; can
     * not be a negative number.
     * @return Returns the Money
     */
    @JsonGetter("discount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getDiscount() {
        return discount;
    }

    /**
     * Setter for Discount.
     * The discount for all items within a given `purchase_unit`. &lt;code&gt;discount.value&lt;/code&gt; can
     * not be a negative number.
     * @param discount Value for Money
     */
    @JsonSetter("discount")
    public void setDiscount(Money discount) {
        this.discount = discount;
    }

    /**
     * Converts this AmountBreakdown into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AmountBreakdown [" + "itemTotal=" + itemTotal + ", shipping=" + shipping
                + ", handling=" + handling + ", taxTotal=" + taxTotal + ", insurance=" + insurance
                + ", shippingDiscount=" + shippingDiscount + ", discount=" + discount + "]";
    }

    /**
     * Builds a new {@link AmountBreakdown.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AmountBreakdown.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .itemTotal(getItemTotal())
                .shipping(getShipping())
                .handling(getHandling())
                .taxTotal(getTaxTotal())
                .insurance(getInsurance())
                .shippingDiscount(getShippingDiscount())
                .discount(getDiscount());
        return builder;
    }

    /**
     * Class to build instances of {@link AmountBreakdown}.
     */
    public static class Builder {
        private Money itemTotal;
        private Money shipping;
        private Money handling;
        private Money taxTotal;
        private Money insurance;
        private Money shippingDiscount;
        private Money discount;



        /**
         * Setter for itemTotal.
         * @param  itemTotal  Money value for itemTotal.
         * @return Builder
         */
        public Builder itemTotal(Money itemTotal) {
            this.itemTotal = itemTotal;
            return this;
        }

        /**
         * Setter for shipping.
         * @param  shipping  Money value for shipping.
         * @return Builder
         */
        public Builder shipping(Money shipping) {
            this.shipping = shipping;
            return this;
        }

        /**
         * Setter for handling.
         * @param  handling  Money value for handling.
         * @return Builder
         */
        public Builder handling(Money handling) {
            this.handling = handling;
            return this;
        }

        /**
         * Setter for taxTotal.
         * @param  taxTotal  Money value for taxTotal.
         * @return Builder
         */
        public Builder taxTotal(Money taxTotal) {
            this.taxTotal = taxTotal;
            return this;
        }

        /**
         * Setter for insurance.
         * @param  insurance  Money value for insurance.
         * @return Builder
         */
        public Builder insurance(Money insurance) {
            this.insurance = insurance;
            return this;
        }

        /**
         * Setter for shippingDiscount.
         * @param  shippingDiscount  Money value for shippingDiscount.
         * @return Builder
         */
        public Builder shippingDiscount(Money shippingDiscount) {
            this.shippingDiscount = shippingDiscount;
            return this;
        }

        /**
         * Setter for discount.
         * @param  discount  Money value for discount.
         * @return Builder
         */
        public Builder discount(Money discount) {
            this.discount = discount;
            return this;
        }

        /**
         * Builds a new {@link AmountBreakdown} object using the set fields.
         * @return {@link AmountBreakdown}
         */
        public AmountBreakdown build() {
            return new AmountBreakdown(itemTotal, shipping, handling, taxTotal, insurance,
                    shippingDiscount, discount);
        }
    }
}