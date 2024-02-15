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
 * This is a model class for ConfirmApplicationContext type.
 */
public class ConfirmApplicationContext {
    private String brandName;
    private String locale;
    private String returnUrl;
    private String cancelUrl;
    private StoredPaymentSource storedPaymentSource;

    /**
     * Default constructor.
     */
    public ConfirmApplicationContext() {
    }

    /**
     * Initialization constructor.
     * @param  brandName  String value for brandName.
     * @param  locale  String value for locale.
     * @param  returnUrl  String value for returnUrl.
     * @param  cancelUrl  String value for cancelUrl.
     * @param  storedPaymentSource  StoredPaymentSource value for storedPaymentSource.
     */
    public ConfirmApplicationContext(
            String brandName,
            String locale,
            String returnUrl,
            String cancelUrl,
            StoredPaymentSource storedPaymentSource) {
        this.brandName = brandName;
        this.locale = locale;
        this.returnUrl = returnUrl;
        this.cancelUrl = cancelUrl;
        this.storedPaymentSource = storedPaymentSource;
    }

    /**
     * Getter for BrandName.
     * Label to present to your payer as part of the PayPal hosted web experience.
     * @return Returns the String
     */
    @JsonGetter("brand_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrandName() {
        return brandName;
    }

    /**
     * Setter for BrandName.
     * Label to present to your payer as part of the PayPal hosted web experience.
     * @param brandName Value for String
     */
    @JsonSetter("brand_name")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Getter for Locale.
     * The BCP 47-formatted locale of pages that the PayPal payment experience shows. PayPal
     * supports a five-character code. For example, `da-DK`, `he-IL`, `id-ID`, `ja-JP`, `no-NO`,
     * `pt-BR`, `ru-RU`, `sv-SE`, `th-TH`, `zh-CN`, `zh-HK`, or `zh-TW`.
     * @return Returns the String
     */
    @JsonGetter("locale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocale() {
        return locale;
    }

    /**
     * Setter for Locale.
     * The BCP 47-formatted locale of pages that the PayPal payment experience shows. PayPal
     * supports a five-character code. For example, `da-DK`, `he-IL`, `id-ID`, `ja-JP`, `no-NO`,
     * `pt-BR`, `ru-RU`, `sv-SE`, `th-TH`, `zh-CN`, `zh-HK`, or `zh-TW`.
     * @param locale Value for String
     */
    @JsonSetter("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Getter for ReturnUrl.
     * The URL where the customer is redirected after the customer approves the payment.
     * @return Returns the String
     */
    @JsonGetter("return_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Setter for ReturnUrl.
     * The URL where the customer is redirected after the customer approves the payment.
     * @param returnUrl Value for String
     */
    @JsonSetter("return_url")
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * Getter for CancelUrl.
     * The URL where the customer is redirected after the customer cancels the payment.
     * @return Returns the String
     */
    @JsonGetter("cancel_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Setter for CancelUrl.
     * The URL where the customer is redirected after the customer cancels the payment.
     * @param cancelUrl Value for String
     */
    @JsonSetter("cancel_url")
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    /**
     * Getter for StoredPaymentSource.
     * Provides additional details to process a payment using a `payment_source` that has been
     * stored or is intended to be stored (also referred to as stored_credential or
     * card-on-file).&lt;br/&gt;Parameter compatibility:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;`payment_type=ONE_TIME` is compatible
     * only with `payment_initiator=CUSTOMER`.&lt;/li&gt;&lt;li&gt;`usage=FIRST` is compatible only with
     * `payment_initiator=CUSTOMER`.&lt;/li&gt;&lt;li&gt;`previous_transaction_reference` or
     * `previous_network_transaction_reference` is compatible only with
     * `payment_initiator=MERCHANT`.&lt;/li&gt;&lt;li&gt;Only one of the parameters -
     * `previous_transaction_reference` and `previous_network_transaction_reference` - can be
     * present in the request.&lt;/li&gt;&lt;/ul&gt;
     * @return Returns the StoredPaymentSource
     */
    @JsonGetter("stored_payment_source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StoredPaymentSource getStoredPaymentSource() {
        return storedPaymentSource;
    }

    /**
     * Setter for StoredPaymentSource.
     * Provides additional details to process a payment using a `payment_source` that has been
     * stored or is intended to be stored (also referred to as stored_credential or
     * card-on-file).&lt;br/&gt;Parameter compatibility:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;`payment_type=ONE_TIME` is compatible
     * only with `payment_initiator=CUSTOMER`.&lt;/li&gt;&lt;li&gt;`usage=FIRST` is compatible only with
     * `payment_initiator=CUSTOMER`.&lt;/li&gt;&lt;li&gt;`previous_transaction_reference` or
     * `previous_network_transaction_reference` is compatible only with
     * `payment_initiator=MERCHANT`.&lt;/li&gt;&lt;li&gt;Only one of the parameters -
     * `previous_transaction_reference` and `previous_network_transaction_reference` - can be
     * present in the request.&lt;/li&gt;&lt;/ul&gt;
     * @param storedPaymentSource Value for StoredPaymentSource
     */
    @JsonSetter("stored_payment_source")
    public void setStoredPaymentSource(StoredPaymentSource storedPaymentSource) {
        this.storedPaymentSource = storedPaymentSource;
    }

    /**
     * Converts this ConfirmApplicationContext into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConfirmApplicationContext [" + "brandName=" + brandName + ", locale=" + locale
                + ", returnUrl=" + returnUrl + ", cancelUrl=" + cancelUrl + ", storedPaymentSource="
                + storedPaymentSource + "]";
    }

    /**
     * Builds a new {@link ConfirmApplicationContext.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConfirmApplicationContext.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brandName(getBrandName())
                .locale(getLocale())
                .returnUrl(getReturnUrl())
                .cancelUrl(getCancelUrl())
                .storedPaymentSource(getStoredPaymentSource());
        return builder;
    }

    /**
     * Class to build instances of {@link ConfirmApplicationContext}.
     */
    public static class Builder {
        private String brandName;
        private String locale;
        private String returnUrl;
        private String cancelUrl;
        private StoredPaymentSource storedPaymentSource;



        /**
         * Setter for brandName.
         * @param  brandName  String value for brandName.
         * @return Builder
         */
        public Builder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        /**
         * Setter for locale.
         * @param  locale  String value for locale.
         * @return Builder
         */
        public Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
         * Setter for returnUrl.
         * @param  returnUrl  String value for returnUrl.
         * @return Builder
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * Setter for cancelUrl.
         * @param  cancelUrl  String value for cancelUrl.
         * @return Builder
         */
        public Builder cancelUrl(String cancelUrl) {
            this.cancelUrl = cancelUrl;
            return this;
        }

        /**
         * Setter for storedPaymentSource.
         * @param  storedPaymentSource  StoredPaymentSource value for storedPaymentSource.
         * @return Builder
         */
        public Builder storedPaymentSource(StoredPaymentSource storedPaymentSource) {
            this.storedPaymentSource = storedPaymentSource;
            return this;
        }

        /**
         * Builds a new {@link ConfirmApplicationContext} object using the set fields.
         * @return {@link ConfirmApplicationContext}
         */
        public ConfirmApplicationContext build() {
            return new ConfirmApplicationContext(brandName, locale, returnUrl, cancelUrl,
                    storedPaymentSource);
        }
    }
}
