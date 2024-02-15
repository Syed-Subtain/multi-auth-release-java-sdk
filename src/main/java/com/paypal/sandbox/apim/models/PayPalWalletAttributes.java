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
 * This is a model class for PayPalWalletAttributes type.
 */
public class PayPalWalletAttributes {
    private PayPalSCustomerDataRecords customer;
    private VaultedPayPalWalletCommonAttributes vault;

    /**
     * Default constructor.
     */
    public PayPalWalletAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  customer  PayPalSCustomerDataRecords value for customer.
     * @param  vault  VaultedPayPalWalletCommonAttributes value for vault.
     */
    public PayPalWalletAttributes(
            PayPalSCustomerDataRecords customer,
            VaultedPayPalWalletCommonAttributes vault) {
        this.customer = customer;
        this.vault = vault;
    }

    /**
     * Getter for Customer.
     * The details about a customer in PayPal's system of record.
     * @return Returns the PayPalSCustomerDataRecords
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalSCustomerDataRecords getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * The details about a customer in PayPal's system of record.
     * @param customer Value for PayPalSCustomerDataRecords
     */
    @JsonSetter("customer")
    public void setCustomer(PayPalSCustomerDataRecords customer) {
        this.customer = customer;
    }

    /**
     * Getter for Vault.
     * Attributes used to provide the instructions during vaulting of the PayPal Wallet.
     * @return Returns the VaultedPayPalWalletCommonAttributes
     */
    @JsonGetter("vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultedPayPalWalletCommonAttributes getVault() {
        return vault;
    }

    /**
     * Setter for Vault.
     * Attributes used to provide the instructions during vaulting of the PayPal Wallet.
     * @param vault Value for VaultedPayPalWalletCommonAttributes
     */
    @JsonSetter("vault")
    public void setVault(VaultedPayPalWalletCommonAttributes vault) {
        this.vault = vault;
    }

    /**
     * Converts this PayPalWalletAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayPalWalletAttributes [" + "customer=" + customer + ", vault=" + vault + "]";
    }

    /**
     * Builds a new {@link PayPalWalletAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayPalWalletAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customer(getCustomer())
                .vault(getVault());
        return builder;
    }

    /**
     * Class to build instances of {@link PayPalWalletAttributes}.
     */
    public static class Builder {
        private PayPalSCustomerDataRecords customer;
        private VaultedPayPalWalletCommonAttributes vault;



        /**
         * Setter for customer.
         * @param  customer  PayPalSCustomerDataRecords value for customer.
         * @return Builder
         */
        public Builder customer(PayPalSCustomerDataRecords customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for vault.
         * @param  vault  VaultedPayPalWalletCommonAttributes value for vault.
         * @return Builder
         */
        public Builder vault(VaultedPayPalWalletCommonAttributes vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Builds a new {@link PayPalWalletAttributes} object using the set fields.
         * @return {@link PayPalWalletAttributes}
         */
        public PayPalWalletAttributes build() {
            return new PayPalWalletAttributes(customer, vault);
        }
    }
}