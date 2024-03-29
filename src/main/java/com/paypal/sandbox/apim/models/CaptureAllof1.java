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
 * This is a model class for CaptureAllof1 type.
 */
public class CaptureAllof1 {
    private String id;
    private Money amount;
    private String invoiceId;
    private String customId;
    private NetworkTransactionReference networkTransactionReference;
    private SellerProtection sellerProtection;
    private Boolean finalCapture;
    private SellerReceivableBreakdown sellerReceivableBreakdown;
    private DisbursementModeEnum disbursementMode;
    private List<LinkDescription> links;
    private ProcessorResponse processorResponse;

    /**
     * Default constructor.
     */
    public CaptureAllof1() {
        finalCapture = false;
        disbursementMode = DisbursementModeEnum.INSTANT;
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  amount  Money value for amount.
     * @param  invoiceId  String value for invoiceId.
     * @param  customId  String value for customId.
     * @param  networkTransactionReference  NetworkTransactionReference value for
     *         networkTransactionReference.
     * @param  sellerProtection  SellerProtection value for sellerProtection.
     * @param  finalCapture  Boolean value for finalCapture.
     * @param  sellerReceivableBreakdown  SellerReceivableBreakdown value for
     *         sellerReceivableBreakdown.
     * @param  disbursementMode  DisbursementModeEnum value for disbursementMode.
     * @param  links  List of LinkDescription value for links.
     * @param  processorResponse  ProcessorResponse value for processorResponse.
     */
    public CaptureAllof1(
            String id,
            Money amount,
            String invoiceId,
            String customId,
            NetworkTransactionReference networkTransactionReference,
            SellerProtection sellerProtection,
            Boolean finalCapture,
            SellerReceivableBreakdown sellerReceivableBreakdown,
            DisbursementModeEnum disbursementMode,
            List<LinkDescription> links,
            ProcessorResponse processorResponse) {
        this.id = id;
        this.amount = amount;
        this.invoiceId = invoiceId;
        this.customId = customId;
        this.networkTransactionReference = networkTransactionReference;
        this.sellerProtection = sellerProtection;
        this.finalCapture = finalCapture;
        this.sellerReceivableBreakdown = sellerReceivableBreakdown;
        this.disbursementMode = disbursementMode;
        this.links = links;
        this.processorResponse = processorResponse;
    }

    /**
     * Getter for Id.
     * The PayPal-generated ID for the captured payment.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The PayPal-generated ID for the captured payment.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Amount.
     * The amount for this captured payment.
     * @return Returns the Money
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The amount for this captured payment.
     * @param amount Value for Money
     */
    @JsonSetter("amount")
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * Getter for InvoiceId.
     * The API caller-provided external invoice number for this order. Appears in both the payer's
     * transaction history and the emails that the payer receives.
     * @return Returns the String
     */
    @JsonGetter("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Setter for InvoiceId.
     * The API caller-provided external invoice number for this order. Appears in both the payer's
     * transaction history and the emails that the payer receives.
     * @param invoiceId Value for String
     */
    @JsonSetter("invoice_id")
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Getter for CustomId.
     * The API caller-provided external ID. Used to reconcile API caller-initiated transactions with
     * PayPal transactions. Appears in transaction and settlement reports.
     * @return Returns the String
     */
    @JsonGetter("custom_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomId() {
        return customId;
    }

    /**
     * Setter for CustomId.
     * The API caller-provided external ID. Used to reconcile API caller-initiated transactions with
     * PayPal transactions. Appears in transaction and settlement reports.
     * @param customId Value for String
     */
    @JsonSetter("custom_id")
    public void setCustomId(String customId) {
        this.customId = customId;
    }

    /**
     * Getter for NetworkTransactionReference.
     * Reference values used by the card network to identify a transaction.
     * @return Returns the NetworkTransactionReference
     */
    @JsonGetter("network_transaction_reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NetworkTransactionReference getNetworkTransactionReference() {
        return networkTransactionReference;
    }

    /**
     * Setter for NetworkTransactionReference.
     * Reference values used by the card network to identify a transaction.
     * @param networkTransactionReference Value for NetworkTransactionReference
     */
    @JsonSetter("network_transaction_reference")
    public void setNetworkTransactionReference(NetworkTransactionReference networkTransactionReference) {
        this.networkTransactionReference = networkTransactionReference;
    }

    /**
     * Getter for SellerProtection.
     * @return Returns the SellerProtection
     */
    @JsonGetter("seller_protection")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerProtection getSellerProtection() {
        return sellerProtection;
    }

    /**
     * Setter for SellerProtection.
     * @param sellerProtection Value for SellerProtection
     */
    @JsonSetter("seller_protection")
    public void setSellerProtection(SellerProtection sellerProtection) {
        this.sellerProtection = sellerProtection;
    }

    /**
     * Getter for FinalCapture.
     * Indicates whether you can make additional captures against the authorized payment. Set to
     * `true` if you do not intend to capture additional payments against the authorization. Set to
     * `false` if you intend to capture additional payments against the authorization.
     * @return Returns the Boolean
     */
    @JsonGetter("final_capture")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFinalCapture() {
        return finalCapture;
    }

    /**
     * Setter for FinalCapture.
     * Indicates whether you can make additional captures against the authorized payment. Set to
     * `true` if you do not intend to capture additional payments against the authorization. Set to
     * `false` if you intend to capture additional payments against the authorization.
     * @param finalCapture Value for Boolean
     */
    @JsonSetter("final_capture")
    public void setFinalCapture(Boolean finalCapture) {
        this.finalCapture = finalCapture;
    }

    /**
     * Getter for SellerReceivableBreakdown.
     * @return Returns the SellerReceivableBreakdown
     */
    @JsonGetter("seller_receivable_breakdown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerReceivableBreakdown getSellerReceivableBreakdown() {
        return sellerReceivableBreakdown;
    }

    /**
     * Setter for SellerReceivableBreakdown.
     * @param sellerReceivableBreakdown Value for SellerReceivableBreakdown
     */
    @JsonSetter("seller_receivable_breakdown")
    public void setSellerReceivableBreakdown(SellerReceivableBreakdown sellerReceivableBreakdown) {
        this.sellerReceivableBreakdown = sellerReceivableBreakdown;
    }

    /**
     * Getter for DisbursementMode.
     * The funds that are held on behalf of the merchant.
     * @return Returns the DisbursementModeEnum
     */
    @JsonGetter("disbursement_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DisbursementModeEnum getDisbursementMode() {
        return disbursementMode;
    }

    /**
     * Setter for DisbursementMode.
     * The funds that are held on behalf of the merchant.
     * @param disbursementMode Value for DisbursementModeEnum
     */
    @JsonSetter("disbursement_mode")
    public void setDisbursementMode(DisbursementModeEnum disbursementMode) {
        this.disbursementMode = disbursementMode;
    }

    /**
     * Getter for Links.
     * An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
     * @return Returns the List of LinkDescription
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescription> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
     * @param links Value for List of LinkDescription
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescription> links) {
        this.links = links;
    }

    /**
     * Getter for ProcessorResponse.
     * An object that provides additional processor information for a direct credit card
     * transaction.
     * @return Returns the ProcessorResponse
     */
    @JsonGetter("processor_response")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProcessorResponse getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Setter for ProcessorResponse.
     * An object that provides additional processor information for a direct credit card
     * transaction.
     * @param processorResponse Value for ProcessorResponse
     */
    @JsonSetter("processor_response")
    public void setProcessorResponse(ProcessorResponse processorResponse) {
        this.processorResponse = processorResponse;
    }

    /**
     * Converts this CaptureAllof1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CaptureAllof1 [" + "id=" + id + ", amount=" + amount + ", invoiceId=" + invoiceId
                + ", customId=" + customId + ", networkTransactionReference="
                + networkTransactionReference + ", sellerProtection=" + sellerProtection
                + ", finalCapture=" + finalCapture + ", sellerReceivableBreakdown="
                + sellerReceivableBreakdown + ", disbursementMode=" + disbursementMode + ", links="
                + links + ", processorResponse=" + processorResponse + "]";
    }

    /**
     * Builds a new {@link CaptureAllof1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CaptureAllof1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .amount(getAmount())
                .invoiceId(getInvoiceId())
                .customId(getCustomId())
                .networkTransactionReference(getNetworkTransactionReference())
                .sellerProtection(getSellerProtection())
                .finalCapture(getFinalCapture())
                .sellerReceivableBreakdown(getSellerReceivableBreakdown())
                .disbursementMode(getDisbursementMode())
                .links(getLinks())
                .processorResponse(getProcessorResponse());
        return builder;
    }

    /**
     * Class to build instances of {@link CaptureAllof1}.
     */
    public static class Builder {
        private String id;
        private Money amount;
        private String invoiceId;
        private String customId;
        private NetworkTransactionReference networkTransactionReference;
        private SellerProtection sellerProtection;
        private Boolean finalCapture = false;
        private SellerReceivableBreakdown sellerReceivableBreakdown;
        private DisbursementModeEnum disbursementMode = DisbursementModeEnum.INSTANT;
        private List<LinkDescription> links;
        private ProcessorResponse processorResponse;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Money value for amount.
         * @return Builder
         */
        public Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for invoiceId.
         * @param  invoiceId  String value for invoiceId.
         * @return Builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        /**
         * Setter for customId.
         * @param  customId  String value for customId.
         * @return Builder
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * Setter for networkTransactionReference.
         * @param  networkTransactionReference  NetworkTransactionReference value for
         *         networkTransactionReference.
         * @return Builder
         */
        public Builder networkTransactionReference(
                NetworkTransactionReference networkTransactionReference) {
            this.networkTransactionReference = networkTransactionReference;
            return this;
        }

        /**
         * Setter for sellerProtection.
         * @param  sellerProtection  SellerProtection value for sellerProtection.
         * @return Builder
         */
        public Builder sellerProtection(SellerProtection sellerProtection) {
            this.sellerProtection = sellerProtection;
            return this;
        }

        /**
         * Setter for finalCapture.
         * @param  finalCapture  Boolean value for finalCapture.
         * @return Builder
         */
        public Builder finalCapture(Boolean finalCapture) {
            this.finalCapture = finalCapture;
            return this;
        }

        /**
         * Setter for sellerReceivableBreakdown.
         * @param  sellerReceivableBreakdown  SellerReceivableBreakdown value for
         *         sellerReceivableBreakdown.
         * @return Builder
         */
        public Builder sellerReceivableBreakdown(
                SellerReceivableBreakdown sellerReceivableBreakdown) {
            this.sellerReceivableBreakdown = sellerReceivableBreakdown;
            return this;
        }

        /**
         * Setter for disbursementMode.
         * @param  disbursementMode  DisbursementModeEnum value for disbursementMode.
         * @return Builder
         */
        public Builder disbursementMode(DisbursementModeEnum disbursementMode) {
            this.disbursementMode = disbursementMode;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  List of LinkDescription value for links.
         * @return Builder
         */
        public Builder links(List<LinkDescription> links) {
            this.links = links;
            return this;
        }

        /**
         * Setter for processorResponse.
         * @param  processorResponse  ProcessorResponse value for processorResponse.
         * @return Builder
         */
        public Builder processorResponse(ProcessorResponse processorResponse) {
            this.processorResponse = processorResponse;
            return this;
        }

        /**
         * Builds a new {@link CaptureAllof1} object using the set fields.
         * @return {@link CaptureAllof1}
         */
        public CaptureAllof1 build() {
            return new CaptureAllof1(id, amount, invoiceId, customId, networkTransactionReference,
                    sellerProtection, finalCapture, sellerReceivableBreakdown, disbursementMode,
                    links, processorResponse);
        }
    }
}
