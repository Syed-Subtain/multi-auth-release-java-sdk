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
 * This is a model class for PayPalWalletExperienceContext type.
 */
public class PayPalWalletExperienceContext {
    private String brandName;
    private String locale;
    private ShippingAddressSourceLocationEnum shippingPreference;
    private String returnUrl;
    private String cancelUrl;
    private PaypalWalletExperienceContextLandingPageEnum landingPage;
    private PaypalWalletExperienceContextUserActionEnum userAction;
    private MerchantPreferredPaymentMethodsEnum paymentMethodPreference;

    /**
     * Default constructor.
     */
    public PayPalWalletExperienceContext() {
        shippingPreference = ShippingAddressSourceLocationEnum.GET_FROM_FILE;
        landingPage = PaypalWalletExperienceContextLandingPageEnum.NO_PREFERENCE;
        userAction = PaypalWalletExperienceContextUserActionEnum.CONTINUE;
        paymentMethodPreference = MerchantPreferredPaymentMethodsEnum.UNRESTRICTED;
    }

    /**
     * Initialization constructor.
     * @param  brandName  String value for brandName.
     * @param  locale  String value for locale.
     * @param  shippingPreference  ShippingAddressSourceLocationEnum value for shippingPreference.
     * @param  returnUrl  String value for returnUrl.
     * @param  cancelUrl  String value for cancelUrl.
     * @param  landingPage  PaypalWalletExperienceContextLandingPageEnum value for landingPage.
     * @param  userAction  PaypalWalletExperienceContextUserActionEnum value for userAction.
     * @param  paymentMethodPreference  MerchantPreferredPaymentMethodsEnum value for
     *         paymentMethodPreference.
     */
    public PayPalWalletExperienceContext(
            String brandName,
            String locale,
            ShippingAddressSourceLocationEnum shippingPreference,
            String returnUrl,
            String cancelUrl,
            PaypalWalletExperienceContextLandingPageEnum landingPage,
            PaypalWalletExperienceContextUserActionEnum userAction,
            MerchantPreferredPaymentMethodsEnum paymentMethodPreference) {
        this.brandName = brandName;
        this.locale = locale;
        this.shippingPreference = shippingPreference;
        this.returnUrl = returnUrl;
        this.cancelUrl = cancelUrl;
        this.landingPage = landingPage;
        this.userAction = userAction;
        this.paymentMethodPreference = paymentMethodPreference;
    }

    /**
     * Getter for BrandName.
     * The label that overrides the business name in the PayPal account on the PayPal site. The
     * pattern is defined by an external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("brand_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrandName() {
        return brandName;
    }

    /**
     * Setter for BrandName.
     * The label that overrides the business name in the PayPal account on the PayPal site. The
     * pattern is defined by an external party and supports Unicode.
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
     * Getter for ShippingPreference.
     * The location from which the shipping address is derived.
     * @return Returns the ShippingAddressSourceLocationEnum
     */
    @JsonGetter("shipping_preference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingAddressSourceLocationEnum getShippingPreference() {
        return shippingPreference;
    }

    /**
     * Setter for ShippingPreference.
     * The location from which the shipping address is derived.
     * @param shippingPreference Value for ShippingAddressSourceLocationEnum
     */
    @JsonSetter("shipping_preference")
    public void setShippingPreference(ShippingAddressSourceLocationEnum shippingPreference) {
        this.shippingPreference = shippingPreference;
    }

    /**
     * Getter for ReturnUrl.
     * The URL where the customer will be redirected upon approving a payment.
     * @return Returns the String
     */
    @JsonGetter("return_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Setter for ReturnUrl.
     * The URL where the customer will be redirected upon approving a payment.
     * @param returnUrl Value for String
     */
    @JsonSetter("return_url")
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * Getter for CancelUrl.
     * The URL where the customer will be redirected upon cancelling the payment approval.
     * @return Returns the String
     */
    @JsonGetter("cancel_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Setter for CancelUrl.
     * The URL where the customer will be redirected upon cancelling the payment approval.
     * @param cancelUrl Value for String
     */
    @JsonSetter("cancel_url")
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    /**
     * Getter for LandingPage.
     * The type of landing page to show on the PayPal site for customer checkout.
     * @return Returns the PaypalWalletExperienceContextLandingPageEnum
     */
    @JsonGetter("landing_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalWalletExperienceContextLandingPageEnum getLandingPage() {
        return landingPage;
    }

    /**
     * Setter for LandingPage.
     * The type of landing page to show on the PayPal site for customer checkout.
     * @param landingPage Value for PaypalWalletExperienceContextLandingPageEnum
     */
    @JsonSetter("landing_page")
    public void setLandingPage(PaypalWalletExperienceContextLandingPageEnum landingPage) {
        this.landingPage = landingPage;
    }

    /**
     * Getter for UserAction.
     * Configures a &lt;strong&gt;Continue&lt;/strong&gt; or &lt;strong&gt;Pay Now&lt;/strong&gt; checkout flow.
     * @return Returns the PaypalWalletExperienceContextUserActionEnum
     */
    @JsonGetter("user_action")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalWalletExperienceContextUserActionEnum getUserAction() {
        return userAction;
    }

    /**
     * Setter for UserAction.
     * Configures a &lt;strong&gt;Continue&lt;/strong&gt; or &lt;strong&gt;Pay Now&lt;/strong&gt; checkout flow.
     * @param userAction Value for PaypalWalletExperienceContextUserActionEnum
     */
    @JsonSetter("user_action")
    public void setUserAction(PaypalWalletExperienceContextUserActionEnum userAction) {
        this.userAction = userAction;
    }

    /**
     * Getter for PaymentMethodPreference.
     * The merchant-preferred payment methods.
     * @return Returns the MerchantPreferredPaymentMethodsEnum
     */
    @JsonGetter("payment_method_preference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantPreferredPaymentMethodsEnum getPaymentMethodPreference() {
        return paymentMethodPreference;
    }

    /**
     * Setter for PaymentMethodPreference.
     * The merchant-preferred payment methods.
     * @param paymentMethodPreference Value for MerchantPreferredPaymentMethodsEnum
     */
    @JsonSetter("payment_method_preference")
    public void setPaymentMethodPreference(MerchantPreferredPaymentMethodsEnum paymentMethodPreference) {
        this.paymentMethodPreference = paymentMethodPreference;
    }

    /**
     * Converts this PayPalWalletExperienceContext into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayPalWalletExperienceContext [" + "brandName=" + brandName + ", locale=" + locale
                + ", shippingPreference=" + shippingPreference + ", returnUrl=" + returnUrl
                + ", cancelUrl=" + cancelUrl + ", landingPage=" + landingPage + ", userAction="
                + userAction + ", paymentMethodPreference=" + paymentMethodPreference + "]";
    }

    /**
     * Builds a new {@link PayPalWalletExperienceContext.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayPalWalletExperienceContext.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brandName(getBrandName())
                .locale(getLocale())
                .shippingPreference(getShippingPreference())
                .returnUrl(getReturnUrl())
                .cancelUrl(getCancelUrl())
                .landingPage(getLandingPage())
                .userAction(getUserAction())
                .paymentMethodPreference(getPaymentMethodPreference());
        return builder;
    }

    /**
     * Class to build instances of {@link PayPalWalletExperienceContext}.
     */
    public static class Builder {
        private String brandName;
        private String locale;
        private ShippingAddressSourceLocationEnum shippingPreference =
                ShippingAddressSourceLocationEnum.GET_FROM_FILE;
        private String returnUrl;
        private String cancelUrl;
        private PaypalWalletExperienceContextLandingPageEnum landingPage =
                PaypalWalletExperienceContextLandingPageEnum.NO_PREFERENCE;
        private PaypalWalletExperienceContextUserActionEnum userAction =
                PaypalWalletExperienceContextUserActionEnum.CONTINUE;
        private MerchantPreferredPaymentMethodsEnum paymentMethodPreference =
                MerchantPreferredPaymentMethodsEnum.UNRESTRICTED;



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
         * Setter for shippingPreference.
         * @param  shippingPreference  ShippingAddressSourceLocationEnum value for
         *         shippingPreference.
         * @return Builder
         */
        public Builder shippingPreference(ShippingAddressSourceLocationEnum shippingPreference) {
            this.shippingPreference = shippingPreference;
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
         * Setter for landingPage.
         * @param  landingPage  PaypalWalletExperienceContextLandingPageEnum value for landingPage.
         * @return Builder
         */
        public Builder landingPage(PaypalWalletExperienceContextLandingPageEnum landingPage) {
            this.landingPage = landingPage;
            return this;
        }

        /**
         * Setter for userAction.
         * @param  userAction  PaypalWalletExperienceContextUserActionEnum value for userAction.
         * @return Builder
         */
        public Builder userAction(PaypalWalletExperienceContextUserActionEnum userAction) {
            this.userAction = userAction;
            return this;
        }

        /**
         * Setter for paymentMethodPreference.
         * @param  paymentMethodPreference  MerchantPreferredPaymentMethodsEnum value for
         *         paymentMethodPreference.
         * @return Builder
         */
        public Builder paymentMethodPreference(
                MerchantPreferredPaymentMethodsEnum paymentMethodPreference) {
            this.paymentMethodPreference = paymentMethodPreference;
            return this;
        }

        /**
         * Builds a new {@link PayPalWalletExperienceContext} object using the set fields.
         * @return {@link PayPalWalletExperienceContext}
         */
        public PayPalWalletExperienceContext build() {
            return new PayPalWalletExperienceContext(brandName, locale, shippingPreference,
                    returnUrl, cancelUrl, landingPage, userAction, paymentMethodPreference);
        }
    }
}
