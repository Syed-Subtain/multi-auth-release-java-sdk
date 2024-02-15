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
 * This is a model class for CardResponse1 type.
 */
public class CardResponse1 {
    private String name;
    private String lastDigits;
    private CardBrandEnum brand;
    private String expiry;
    private Object billingAddress;
    private String verificationStatus;
    private CardVerificationDetails verification;

    /**
     * Default constructor.
     */
    public CardResponse1() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  lastDigits  String value for lastDigits.
     * @param  brand  CardBrandEnum value for brand.
     * @param  expiry  String value for expiry.
     * @param  billingAddress  Object value for billingAddress.
     * @param  verificationStatus  String value for verificationStatus.
     * @param  verification  CardVerificationDetails value for verification.
     */
    public CardResponse1(
            String name,
            String lastDigits,
            CardBrandEnum brand,
            String expiry,
            Object billingAddress,
            String verificationStatus,
            CardVerificationDetails verification) {
        this.name = name;
        this.lastDigits = lastDigits;
        this.brand = brand;
        this.expiry = expiry;
        this.billingAddress = billingAddress;
        this.verificationStatus = verificationStatus;
        this.verification = verification;
    }

    /**
     * Getter for Name.
     * The card holder's name as it appears on the card.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The card holder's name as it appears on the card.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for LastDigits.
     * The last digits of the payment card.
     * @return Returns the String
     */
    @JsonGetter("last_digits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastDigits() {
        return lastDigits;
    }

    /**
     * Setter for LastDigits.
     * The last digits of the payment card.
     * @param lastDigits Value for String
     */
    @JsonSetter("last_digits")
    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    /**
     * Getter for Brand.
     * The card brand or network. Typically used in the response.
     * @return Returns the CardBrandEnum
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardBrandEnum getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * The card brand or network. Typically used in the response.
     * @param brand Value for CardBrandEnum
     */
    @JsonSetter("brand")
    public void setBrand(CardBrandEnum brand) {
        this.brand = brand;
    }

    /**
     * Getter for Expiry.
     * The card expiration year and month, in [Internet date
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("expiry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiry() {
        return expiry;
    }

    /**
     * Setter for Expiry.
     * The card expiration year and month, in [Internet date
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param expiry Value for String
     */
    @JsonSetter("expiry")
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    /**
     * Getter for BillingAddress.
     * The billing address for this card. Supports only the `address_line_1`, `address_line_2`,
     * `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties.
     * @return Returns the Object
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The billing address for this card. Supports only the `address_line_1`, `address_line_2`,
     * `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties.
     * @param billingAddress Value for Object
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(Object billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for VerificationStatus.
     * Card Verification status.
     * @return Returns the String
     */
    @JsonGetter("verification_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * Setter for VerificationStatus.
     * Card Verification status.
     * @param verificationStatus Value for String
     */
    @JsonSetter("verification_status")
    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    /**
     * Getter for Verification.
     * Card Verification details including the authorization details and 3D SECURE details.
     * @return Returns the CardVerificationDetails
     */
    @JsonGetter("verification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardVerificationDetails getVerification() {
        return verification;
    }

    /**
     * Setter for Verification.
     * Card Verification details including the authorization details and 3D SECURE details.
     * @param verification Value for CardVerificationDetails
     */
    @JsonSetter("verification")
    public void setVerification(CardVerificationDetails verification) {
        this.verification = verification;
    }

    /**
     * Converts this CardResponse1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardResponse1 [" + "name=" + name + ", lastDigits=" + lastDigits + ", brand="
                + brand + ", expiry=" + expiry + ", billingAddress=" + billingAddress
                + ", verificationStatus=" + verificationStatus + ", verification=" + verification
                + "]";
    }

    /**
     * Builds a new {@link CardResponse1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardResponse1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .lastDigits(getLastDigits())
                .brand(getBrand())
                .expiry(getExpiry())
                .billingAddress(getBillingAddress())
                .verificationStatus(getVerificationStatus())
                .verification(getVerification());
        return builder;
    }

    /**
     * Class to build instances of {@link CardResponse1}.
     */
    public static class Builder {
        private String name;
        private String lastDigits;
        private CardBrandEnum brand;
        private String expiry;
        private Object billingAddress;
        private String verificationStatus;
        private CardVerificationDetails verification;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for lastDigits.
         * @param  lastDigits  String value for lastDigits.
         * @return Builder
         */
        public Builder lastDigits(String lastDigits) {
            this.lastDigits = lastDigits;
            return this;
        }

        /**
         * Setter for brand.
         * @param  brand  CardBrandEnum value for brand.
         * @return Builder
         */
        public Builder brand(CardBrandEnum brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Setter for expiry.
         * @param  expiry  String value for expiry.
         * @return Builder
         */
        public Builder expiry(String expiry) {
            this.expiry = expiry;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  Object value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(Object billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for verificationStatus.
         * @param  verificationStatus  String value for verificationStatus.
         * @return Builder
         */
        public Builder verificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }

        /**
         * Setter for verification.
         * @param  verification  CardVerificationDetails value for verification.
         * @return Builder
         */
        public Builder verification(CardVerificationDetails verification) {
            this.verification = verification;
            return this;
        }

        /**
         * Builds a new {@link CardResponse1} object using the set fields.
         * @return {@link CardResponse1}
         */
        public CardResponse1 build() {
            return new CardResponse1(name, lastDigits, brand, expiry, billingAddress,
                    verificationStatus, verification);
        }
    }
}
