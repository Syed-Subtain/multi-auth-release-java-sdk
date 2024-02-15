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
 * This is a model class for VaultedVenmoWalletCommonAttributes type.
 */
public class VaultedVenmoWalletCommonAttributes {
    private String storeInVault;
    private String description;
    private VaultVenmoWalletBaseAllof1UsagePatternEnum usagePattern;
    private VaultVenmoWalletBaseAllof1UsageTypeEnum usageType;
    private VaultVenmoWalletBaseAllof1CustomerTypeEnum customerType;
    private Boolean permitMultiplePaymentTokens;

    /**
     * Default constructor.
     */
    public VaultedVenmoWalletCommonAttributes() {
        storeInVault = "ON_SUCCESS";
        customerType = VaultVenmoWalletBaseAllof1CustomerTypeEnum.CONSUMER;
        permitMultiplePaymentTokens = false;
    }

    /**
     * Initialization constructor.
     * @param  storeInVault  String value for storeInVault.
     * @param  usageType  VaultVenmoWalletBaseAllof1UsageTypeEnum value for usageType.
     * @param  description  String value for description.
     * @param  usagePattern  VaultVenmoWalletBaseAllof1UsagePatternEnum value for usagePattern.
     * @param  customerType  VaultVenmoWalletBaseAllof1CustomerTypeEnum value for customerType.
     * @param  permitMultiplePaymentTokens  Boolean value for permitMultiplePaymentTokens.
     */
    public VaultedVenmoWalletCommonAttributes(
            String storeInVault,
            VaultVenmoWalletBaseAllof1UsageTypeEnum usageType,
            String description,
            VaultVenmoWalletBaseAllof1UsagePatternEnum usagePattern,
            VaultVenmoWalletBaseAllof1CustomerTypeEnum customerType,
            Boolean permitMultiplePaymentTokens) {
        this.storeInVault = storeInVault;
        this.description = description;
        this.usagePattern = usagePattern;
        this.usageType = usageType;
        this.customerType = customerType;
        this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
    }

    /**
     * Getter for StoreInVault.
     * Defines how and when the payment source gets vaulted.
     * @return Returns the String
     */
    @JsonGetter("store_in_vault")
    public String getStoreInVault() {
        return storeInVault;
    }

    /**
     * Setter for StoreInVault.
     * Defines how and when the payment source gets vaulted.
     * @param storeInVault Value for String
     */
    @JsonSetter("store_in_vault")
    private void setStoreInVault(String storeInVault) {
        this.storeInVault = storeInVault;
    }

    /**
     * Getter for Description.
     * The description displayed to Venmo consumer on the approval flow for Venmo, as well as on the
     * Venmo payment token management experience on Venmo.com.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The description displayed to Venmo consumer on the approval flow for Venmo, as well as on the
     * Venmo payment token management experience on Venmo.com.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for UsagePattern.
     * Expected business/pricing model for the billing agreement.
     * @return Returns the VaultVenmoWalletBaseAllof1UsagePatternEnum
     */
    @JsonGetter("usage_pattern")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultVenmoWalletBaseAllof1UsagePatternEnum getUsagePattern() {
        return usagePattern;
    }

    /**
     * Setter for UsagePattern.
     * Expected business/pricing model for the billing agreement.
     * @param usagePattern Value for VaultVenmoWalletBaseAllof1UsagePatternEnum
     */
    @JsonSetter("usage_pattern")
    public void setUsagePattern(VaultVenmoWalletBaseAllof1UsagePatternEnum usagePattern) {
        this.usagePattern = usagePattern;
    }

    /**
     * Getter for UsageType.
     * The usage type associated with the Venmo payment token.
     * @return Returns the VaultVenmoWalletBaseAllof1UsageTypeEnum
     */
    @JsonGetter("usage_type")
    public VaultVenmoWalletBaseAllof1UsageTypeEnum getUsageType() {
        return usageType;
    }

    /**
     * Setter for UsageType.
     * The usage type associated with the Venmo payment token.
     * @param usageType Value for VaultVenmoWalletBaseAllof1UsageTypeEnum
     */
    @JsonSetter("usage_type")
    public void setUsageType(VaultVenmoWalletBaseAllof1UsageTypeEnum usageType) {
        this.usageType = usageType;
    }

    /**
     * Getter for CustomerType.
     * The customer type associated with the Venmo payment token. This is to indicate whether the
     * customer acting on the merchant / platform is either a business or a consumer.
     * @return Returns the VaultVenmoWalletBaseAllof1CustomerTypeEnum
     */
    @JsonGetter("customer_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultVenmoWalletBaseAllof1CustomerTypeEnum getCustomerType() {
        return customerType;
    }

    /**
     * Setter for CustomerType.
     * The customer type associated with the Venmo payment token. This is to indicate whether the
     * customer acting on the merchant / platform is either a business or a consumer.
     * @param customerType Value for VaultVenmoWalletBaseAllof1CustomerTypeEnum
     */
    @JsonSetter("customer_type")
    public void setCustomerType(VaultVenmoWalletBaseAllof1CustomerTypeEnum customerType) {
        this.customerType = customerType;
    }

    /**
     * Getter for PermitMultiplePaymentTokens.
     * Create multiple payment tokens for the same payer, merchant/platform combination. Use this
     * when the customer has not logged in at merchant/platform. The payment token thus generated,
     * can then also be used to create the customer account at merchant/platform. Use this also when
     * multiple payment tokens are required for the same payer, different customer at
     * merchant/platform. This helps to identify customers distinctly even though they may share the
     * same Venmo account.
     * @return Returns the Boolean
     */
    @JsonGetter("permit_multiple_payment_tokens")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPermitMultiplePaymentTokens() {
        return permitMultiplePaymentTokens;
    }

    /**
     * Setter for PermitMultiplePaymentTokens.
     * Create multiple payment tokens for the same payer, merchant/platform combination. Use this
     * when the customer has not logged in at merchant/platform. The payment token thus generated,
     * can then also be used to create the customer account at merchant/platform. Use this also when
     * multiple payment tokens are required for the same payer, different customer at
     * merchant/platform. This helps to identify customers distinctly even though they may share the
     * same Venmo account.
     * @param permitMultiplePaymentTokens Value for Boolean
     */
    @JsonSetter("permit_multiple_payment_tokens")
    public void setPermitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) {
        this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
    }

    /**
     * Converts this VaultedVenmoWalletCommonAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VaultedVenmoWalletCommonAttributes [" + "storeInVault=" + storeInVault
                + ", usageType=" + usageType + ", description=" + description + ", usagePattern="
                + usagePattern + ", customerType=" + customerType + ", permitMultiplePaymentTokens="
                + permitMultiplePaymentTokens + "]";
    }

    /**
     * Builds a new {@link VaultedVenmoWalletCommonAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VaultedVenmoWalletCommonAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(storeInVault, usageType)
                .description(getDescription())
                .usagePattern(getUsagePattern())
                .customerType(getCustomerType())
                .permitMultiplePaymentTokens(getPermitMultiplePaymentTokens());
        return builder;
    }

    /**
     * Class to build instances of {@link VaultedVenmoWalletCommonAttributes}.
     */
    public static class Builder {
        private String storeInVault = "ON_SUCCESS";
        private VaultVenmoWalletBaseAllof1UsageTypeEnum usageType;
        private String description;
        private VaultVenmoWalletBaseAllof1UsagePatternEnum usagePattern;
        private VaultVenmoWalletBaseAllof1CustomerTypeEnum customerType =
                VaultVenmoWalletBaseAllof1CustomerTypeEnum.CONSUMER;
        private Boolean permitMultiplePaymentTokens = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  storeInVault  String value for storeInVault.
         * @param  usageType  VaultVenmoWalletBaseAllof1UsageTypeEnum value for usageType.
         */
        public Builder(String storeInVault, VaultVenmoWalletBaseAllof1UsageTypeEnum usageType) {
            this.storeInVault = storeInVault;
            this.usageType = usageType;
        }

        /**
         * Setter for storeInVault.
         * @param  storeInVault  String value for storeInVault.
         * @return Builder
         */
        public Builder storeInVault(String storeInVault) {
            this.storeInVault = storeInVault;
            return this;
        }

        /**
         * Setter for usageType.
         * @param  usageType  VaultVenmoWalletBaseAllof1UsageTypeEnum value for usageType.
         * @return Builder
         */
        public Builder usageType(VaultVenmoWalletBaseAllof1UsageTypeEnum usageType) {
            this.usageType = usageType;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for usagePattern.
         * @param  usagePattern  VaultVenmoWalletBaseAllof1UsagePatternEnum value for usagePattern.
         * @return Builder
         */
        public Builder usagePattern(VaultVenmoWalletBaseAllof1UsagePatternEnum usagePattern) {
            this.usagePattern = usagePattern;
            return this;
        }

        /**
         * Setter for customerType.
         * @param  customerType  VaultVenmoWalletBaseAllof1CustomerTypeEnum value for customerType.
         * @return Builder
         */
        public Builder customerType(VaultVenmoWalletBaseAllof1CustomerTypeEnum customerType) {
            this.customerType = customerType;
            return this;
        }

        /**
         * Setter for permitMultiplePaymentTokens.
         * @param  permitMultiplePaymentTokens  Boolean value for permitMultiplePaymentTokens.
         * @return Builder
         */
        public Builder permitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) {
            this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
            return this;
        }

        /**
         * Builds a new {@link VaultedVenmoWalletCommonAttributes} object using the set fields.
         * @return {@link VaultedVenmoWalletCommonAttributes}
         */
        public VaultedVenmoWalletCommonAttributes build() {
            return new VaultedVenmoWalletCommonAttributes(storeInVault, usageType, description,
                    usagePattern, customerType, permitMultiplePaymentTokens);
        }
    }
}
