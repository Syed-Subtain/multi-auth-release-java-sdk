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
 * This is a model class for SetupTokenRequestPaymentSource type.
 */
public class SetupTokenRequestPaymentSource {
    private CardRequest1 card;
    private PayPalWalletRequest paypal;
    private VenmoRequest venmo;
    private TokenRequest token;

    /**
     * Default constructor.
     */
    public SetupTokenRequestPaymentSource() {
    }

    /**
     * Initialization constructor.
     * @param  card  CardRequest1 value for card.
     * @param  paypal  PayPalWalletRequest value for paypal.
     * @param  venmo  VenmoRequest value for venmo.
     * @param  token  TokenRequest value for token.
     */
    public SetupTokenRequestPaymentSource(
            CardRequest1 card,
            PayPalWalletRequest paypal,
            VenmoRequest venmo,
            TokenRequest token) {
        this.card = card;
        this.paypal = paypal;
        this.venmo = venmo;
        this.token = token;
    }

    /**
     * Getter for Card.
     * A Resource representing a request to vault a Card.
     * @return Returns the CardRequest1
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardRequest1 getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * A Resource representing a request to vault a Card.
     * @param card Value for CardRequest1
     */
    @JsonSetter("card")
    public void setCard(CardRequest1 card) {
        this.card = card;
    }

    /**
     * Getter for Paypal.
     * A resource representing a request to vault PayPal Wallet.
     * @return Returns the PayPalWalletRequest
     */
    @JsonGetter("paypal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalWalletRequest getPaypal() {
        return paypal;
    }

    /**
     * Setter for Paypal.
     * A resource representing a request to vault PayPal Wallet.
     * @param paypal Value for PayPalWalletRequest
     */
    @JsonSetter("paypal")
    public void setPaypal(PayPalWalletRequest paypal) {
        this.paypal = paypal;
    }

    /**
     * Getter for Venmo.
     * A resource representing a request to vault Venmo.
     * @return Returns the VenmoRequest
     */
    @JsonGetter("venmo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VenmoRequest getVenmo() {
        return venmo;
    }

    /**
     * Setter for Venmo.
     * A resource representing a request to vault Venmo.
     * @param venmo Value for VenmoRequest
     */
    @JsonSetter("venmo")
    public void setVenmo(VenmoRequest venmo) {
        this.venmo = venmo;
    }

    /**
     * Getter for Token.
     * The Tokenized Payment Source representing a Request to Vault a Token.
     * @return Returns the TokenRequest
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenRequest getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * The Tokenized Payment Source representing a Request to Vault a Token.
     * @param token Value for TokenRequest
     */
    @JsonSetter("token")
    public void setToken(TokenRequest token) {
        this.token = token;
    }

    /**
     * Converts this SetupTokenRequestPaymentSource into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SetupTokenRequestPaymentSource [" + "card=" + card + ", paypal=" + paypal
                + ", venmo=" + venmo + ", token=" + token + "]";
    }

    /**
     * Builds a new {@link SetupTokenRequestPaymentSource.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SetupTokenRequestPaymentSource.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .paypal(getPaypal())
                .venmo(getVenmo())
                .token(getToken());
        return builder;
    }

    /**
     * Class to build instances of {@link SetupTokenRequestPaymentSource}.
     */
    public static class Builder {
        private CardRequest1 card;
        private PayPalWalletRequest paypal;
        private VenmoRequest venmo;
        private TokenRequest token;



        /**
         * Setter for card.
         * @param  card  CardRequest1 value for card.
         * @return Builder
         */
        public Builder card(CardRequest1 card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for paypal.
         * @param  paypal  PayPalWalletRequest value for paypal.
         * @return Builder
         */
        public Builder paypal(PayPalWalletRequest paypal) {
            this.paypal = paypal;
            return this;
        }

        /**
         * Setter for venmo.
         * @param  venmo  VenmoRequest value for venmo.
         * @return Builder
         */
        public Builder venmo(VenmoRequest venmo) {
            this.venmo = venmo;
            return this;
        }

        /**
         * Setter for token.
         * @param  token  TokenRequest value for token.
         * @return Builder
         */
        public Builder token(TokenRequest token) {
            this.token = token;
            return this;
        }

        /**
         * Builds a new {@link SetupTokenRequestPaymentSource} object using the set fields.
         * @return {@link SetupTokenRequestPaymentSource}
         */
        public SetupTokenRequestPaymentSource build() {
            return new SetupTokenRequestPaymentSource(card, paypal, venmo, token);
        }
    }
}
