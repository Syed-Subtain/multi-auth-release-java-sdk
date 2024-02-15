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
 * This is a model class for OrderAuthorizeResponseAllof1 type.
 */
public class OrderAuthorizeResponseAllof1 {
    private String id;
    private PaymentSource paymentSource;
    private CheckoutPaymentIntentEnum intent;
    private ProcessingInstructionEnum processingInstruction;
    private Customer payer;
    private List<PurchaseUnit> purchaseUnits;
    private OrderStatusEnum status;
    private List<LinkDescription> links;

    /**
     * Default constructor.
     */
    public OrderAuthorizeResponseAllof1() {
        processingInstruction = ProcessingInstructionEnum.NO_INSTRUCTION;
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  paymentSource  PaymentSource value for paymentSource.
     * @param  intent  CheckoutPaymentIntentEnum value for intent.
     * @param  processingInstruction  ProcessingInstructionEnum value for processingInstruction.
     * @param  payer  Customer value for payer.
     * @param  purchaseUnits  List of PurchaseUnit value for purchaseUnits.
     * @param  status  OrderStatusEnum value for status.
     * @param  links  List of LinkDescription value for links.
     */
    public OrderAuthorizeResponseAllof1(
            String id,
            PaymentSource paymentSource,
            CheckoutPaymentIntentEnum intent,
            ProcessingInstructionEnum processingInstruction,
            Customer payer,
            List<PurchaseUnit> purchaseUnits,
            OrderStatusEnum status,
            List<LinkDescription> links) {
        this.id = id;
        this.paymentSource = paymentSource;
        this.intent = intent;
        this.processingInstruction = processingInstruction;
        this.payer = payer;
        this.purchaseUnits = purchaseUnits;
        this.status = status;
        this.links = links;
    }

    /**
     * Getter for Id.
     * The ID of the order.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the order.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for PaymentSource.
     * The payment source used to fund the payment.
     * @return Returns the PaymentSource
     */
    @JsonGetter("payment_source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSource getPaymentSource() {
        return paymentSource;
    }

    /**
     * Setter for PaymentSource.
     * The payment source used to fund the payment.
     * @param paymentSource Value for PaymentSource
     */
    @JsonSetter("payment_source")
    public void setPaymentSource(PaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Getter for Intent.
     * The intent to either capture payment immediately or authorize a payment for an order after
     * order creation.
     * @return Returns the CheckoutPaymentIntentEnum
     */
    @JsonGetter("intent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutPaymentIntentEnum getIntent() {
        return intent;
    }

    /**
     * Setter for Intent.
     * The intent to either capture payment immediately or authorize a payment for an order after
     * order creation.
     * @param intent Value for CheckoutPaymentIntentEnum
     */
    @JsonSetter("intent")
    public void setIntent(CheckoutPaymentIntentEnum intent) {
        this.intent = intent;
    }

    /**
     * Getter for ProcessingInstruction.
     * The instruction to process an order.
     * @return Returns the ProcessingInstructionEnum
     */
    @JsonGetter("processing_instruction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProcessingInstructionEnum getProcessingInstruction() {
        return processingInstruction;
    }

    /**
     * Setter for ProcessingInstruction.
     * The instruction to process an order.
     * @param processingInstruction Value for ProcessingInstructionEnum
     */
    @JsonSetter("processing_instruction")
    public void setProcessingInstruction(ProcessingInstructionEnum processingInstruction) {
        this.processingInstruction = processingInstruction;
    }

    /**
     * Getter for Payer.
     * The customer who approves and pays for the order. The customer is also known as the payer.
     * @return Returns the Customer
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Customer getPayer() {
        return payer;
    }

    /**
     * Setter for Payer.
     * The customer who approves and pays for the order. The customer is also known as the payer.
     * @param payer Value for Customer
     */
    @JsonSetter("payer")
    public void setPayer(Customer payer) {
        this.payer = payer;
    }

    /**
     * Getter for PurchaseUnits.
     * An array of purchase units. Each purchase unit establishes a contract between a customer and
     * merchant. Each purchase unit represents either a full or partial order that the customer
     * intends to purchase from the merchant.
     * @return Returns the List of PurchaseUnit
     */
    @JsonGetter("purchase_units")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PurchaseUnit> getPurchaseUnits() {
        return purchaseUnits;
    }

    /**
     * Setter for PurchaseUnits.
     * An array of purchase units. Each purchase unit establishes a contract between a customer and
     * merchant. Each purchase unit represents either a full or partial order that the customer
     * intends to purchase from the merchant.
     * @param purchaseUnits Value for List of PurchaseUnit
     */
    @JsonSetter("purchase_units")
    public void setPurchaseUnits(List<PurchaseUnit> purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
    }

    /**
     * Getter for Status.
     * @return Returns the OrderStatusEnum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderStatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for OrderStatusEnum
     */
    @JsonSetter("status")
    public void setStatus(OrderStatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for Links.
     * An array of request-related HATEOAS links. To complete payer approval, use the `approve` link
     * to redirect the payer. The API caller has 3 hours (default setting, this which can be changed
     * by your account manager to 24/48/72 hours to accommodate your use case) from the time the
     * order is created, to redirect your payer. Once redirected, the API caller has 3 hours for the
     * payer to approve the order and either authorize or capture the order. If you are not using
     * the PayPal JavaScript SDK to initiate PayPal Checkout (in context) ensure that you include
     * `application_context.return_url` is specified or you will get "We're sorry, Things don't
     * appear to be working at the moment" after the payer approves the payment.
     * @return Returns the List of LinkDescription
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescription> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of request-related HATEOAS links. To complete payer approval, use the `approve` link
     * to redirect the payer. The API caller has 3 hours (default setting, this which can be changed
     * by your account manager to 24/48/72 hours to accommodate your use case) from the time the
     * order is created, to redirect your payer. Once redirected, the API caller has 3 hours for the
     * payer to approve the order and either authorize or capture the order. If you are not using
     * the PayPal JavaScript SDK to initiate PayPal Checkout (in context) ensure that you include
     * `application_context.return_url` is specified or you will get "We're sorry, Things don't
     * appear to be working at the moment" after the payer approves the payment.
     * @param links Value for List of LinkDescription
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescription> links) {
        this.links = links;
    }

    /**
     * Converts this OrderAuthorizeResponseAllof1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderAuthorizeResponseAllof1 [" + "id=" + id + ", paymentSource=" + paymentSource
                + ", intent=" + intent + ", processingInstruction=" + processingInstruction
                + ", payer=" + payer + ", purchaseUnits=" + purchaseUnits + ", status=" + status
                + ", links=" + links + "]";
    }

    /**
     * Builds a new {@link OrderAuthorizeResponseAllof1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderAuthorizeResponseAllof1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .paymentSource(getPaymentSource())
                .intent(getIntent())
                .processingInstruction(getProcessingInstruction())
                .payer(getPayer())
                .purchaseUnits(getPurchaseUnits())
                .status(getStatus())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderAuthorizeResponseAllof1}.
     */
    public static class Builder {
        private String id;
        private PaymentSource paymentSource;
        private CheckoutPaymentIntentEnum intent;
        private ProcessingInstructionEnum processingInstruction =
                ProcessingInstructionEnum.NO_INSTRUCTION;
        private Customer payer;
        private List<PurchaseUnit> purchaseUnits;
        private OrderStatusEnum status;
        private List<LinkDescription> links;



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
         * Setter for paymentSource.
         * @param  paymentSource  PaymentSource value for paymentSource.
         * @return Builder
         */
        public Builder paymentSource(PaymentSource paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        /**
         * Setter for intent.
         * @param  intent  CheckoutPaymentIntentEnum value for intent.
         * @return Builder
         */
        public Builder intent(CheckoutPaymentIntentEnum intent) {
            this.intent = intent;
            return this;
        }

        /**
         * Setter for processingInstruction.
         * @param  processingInstruction  ProcessingInstructionEnum value for processingInstruction.
         * @return Builder
         */
        public Builder processingInstruction(ProcessingInstructionEnum processingInstruction) {
            this.processingInstruction = processingInstruction;
            return this;
        }

        /**
         * Setter for payer.
         * @param  payer  Customer value for payer.
         * @return Builder
         */
        public Builder payer(Customer payer) {
            this.payer = payer;
            return this;
        }

        /**
         * Setter for purchaseUnits.
         * @param  purchaseUnits  List of PurchaseUnit value for purchaseUnits.
         * @return Builder
         */
        public Builder purchaseUnits(List<PurchaseUnit> purchaseUnits) {
            this.purchaseUnits = purchaseUnits;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  OrderStatusEnum value for status.
         * @return Builder
         */
        public Builder status(OrderStatusEnum status) {
            this.status = status;
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
         * Builds a new {@link OrderAuthorizeResponseAllof1} object using the set fields.
         * @return {@link OrderAuthorizeResponseAllof1}
         */
        public OrderAuthorizeResponseAllof1 build() {
            return new OrderAuthorizeResponseAllof1(id, paymentSource, intent,
                    processingInstruction, payer, purchaseUnits, status, links);
        }
    }
}
