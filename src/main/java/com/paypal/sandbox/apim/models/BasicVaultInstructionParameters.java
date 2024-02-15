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
 * This is a model class for BasicVaultInstructionParameters type.
 */
public class BasicVaultInstructionParameters {
    private StoreInVaultInstructionEnum storeInVault;

    /**
     * Default constructor.
     */
    public BasicVaultInstructionParameters() {
    }

    /**
     * Initialization constructor.
     * @param  storeInVault  StoreInVaultInstructionEnum value for storeInVault.
     */
    public BasicVaultInstructionParameters(
            StoreInVaultInstructionEnum storeInVault) {
        this.storeInVault = storeInVault;
    }

    /**
     * Getter for StoreInVault.
     * Defines how and when the payment source gets vaulted.
     * @return Returns the StoreInVaultInstructionEnum
     */
    @JsonGetter("store_in_vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StoreInVaultInstructionEnum getStoreInVault() {
        return storeInVault;
    }

    /**
     * Setter for StoreInVault.
     * Defines how and when the payment source gets vaulted.
     * @param storeInVault Value for StoreInVaultInstructionEnum
     */
    @JsonSetter("store_in_vault")
    public void setStoreInVault(StoreInVaultInstructionEnum storeInVault) {
        this.storeInVault = storeInVault;
    }

    /**
     * Converts this BasicVaultInstructionParameters into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BasicVaultInstructionParameters [" + "storeInVault=" + storeInVault + "]";
    }

    /**
     * Builds a new {@link BasicVaultInstructionParameters.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BasicVaultInstructionParameters.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .storeInVault(getStoreInVault());
        return builder;
    }

    /**
     * Class to build instances of {@link BasicVaultInstructionParameters}.
     */
    public static class Builder {
        private StoreInVaultInstructionEnum storeInVault;



        /**
         * Setter for storeInVault.
         * @param  storeInVault  StoreInVaultInstructionEnum value for storeInVault.
         * @return Builder
         */
        public Builder storeInVault(StoreInVaultInstructionEnum storeInVault) {
            this.storeInVault = storeInVault;
            return this;
        }

        /**
         * Builds a new {@link BasicVaultInstructionParameters} object using the set fields.
         * @return {@link BasicVaultInstructionParameters}
         */
        public BasicVaultInstructionParameters build() {
            return new BasicVaultInstructionParameters(storeInVault);
        }
    }
}