/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TaxInformation type.
 */
public class TaxInformation {
    private String taxId;
    private TaxInfoTaxIdTypeEnum taxIdType;

    /**
     * Default constructor.
     */
    public TaxInformation() {
    }

    /**
     * Initialization constructor.
     * @param  taxId  String value for taxId.
     * @param  taxIdType  TaxInfoTaxIdTypeEnum value for taxIdType.
     */
    public TaxInformation(
            String taxId,
            TaxInfoTaxIdTypeEnum taxIdType) {
        this.taxId = taxId;
        this.taxIdType = taxIdType;
    }

    /**
     * Getter for TaxId.
     * The customer's tax ID value.
     * @return Returns the String
     */
    @JsonGetter("tax_id")
    public String getTaxId() {
        return taxId;
    }

    /**
     * Setter for TaxId.
     * The customer's tax ID value.
     * @param taxId Value for String
     */
    @JsonSetter("tax_id")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * Getter for TaxIdType.
     * The customer's tax ID type.
     * @return Returns the TaxInfoTaxIdTypeEnum
     */
    @JsonGetter("tax_id_type")
    public TaxInfoTaxIdTypeEnum getTaxIdType() {
        return taxIdType;
    }

    /**
     * Setter for TaxIdType.
     * The customer's tax ID type.
     * @param taxIdType Value for TaxInfoTaxIdTypeEnum
     */
    @JsonSetter("tax_id_type")
    public void setTaxIdType(TaxInfoTaxIdTypeEnum taxIdType) {
        this.taxIdType = taxIdType;
    }

    /**
     * Converts this TaxInformation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TaxInformation [" + "taxId=" + taxId + ", taxIdType=" + taxIdType + "]";
    }

    /**
     * Builds a new {@link TaxInformation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TaxInformation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(taxId, taxIdType);
        return builder;
    }

    /**
     * Class to build instances of {@link TaxInformation}.
     */
    public static class Builder {
        private String taxId;
        private TaxInfoTaxIdTypeEnum taxIdType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  taxId  String value for taxId.
         * @param  taxIdType  TaxInfoTaxIdTypeEnum value for taxIdType.
         */
        public Builder(String taxId, TaxInfoTaxIdTypeEnum taxIdType) {
            this.taxId = taxId;
            this.taxIdType = taxIdType;
        }

        /**
         * Setter for taxId.
         * @param  taxId  String value for taxId.
         * @return Builder
         */
        public Builder taxId(String taxId) {
            this.taxId = taxId;
            return this;
        }

        /**
         * Setter for taxIdType.
         * @param  taxIdType  TaxInfoTaxIdTypeEnum value for taxIdType.
         * @return Builder
         */
        public Builder taxIdType(TaxInfoTaxIdTypeEnum taxIdType) {
            this.taxIdType = taxIdType;
            return this;
        }

        /**
         * Builds a new {@link TaxInformation} object using the set fields.
         * @return {@link TaxInformation}
         */
        public TaxInformation build() {
            return new TaxInformation(taxId, taxIdType);
        }
    }
}
