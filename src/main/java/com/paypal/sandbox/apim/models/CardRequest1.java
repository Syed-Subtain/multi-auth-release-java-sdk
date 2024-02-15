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
 * This is a model class for CardRequest1 type.
 */
public class CardRequest1 {
    private String id;
    private String name;
    private String number;
    private String expiry;
    private String securityCode;
    private String lastDigits;
    private CardBrandEnum cardType;
    private CardTypeEnum type;
    private CardBrandEnum brand;
    private PortablePostalAddressMediumGrained billingAddress;
    private String verificationMethod;
    private ExperienceContext1 experienceContext;

    /**
     * Default constructor.
     */
    public CardRequest1() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  number  String value for number.
     * @param  expiry  String value for expiry.
     * @param  securityCode  String value for securityCode.
     * @param  lastDigits  String value for lastDigits.
     * @param  cardType  CardBrandEnum value for cardType.
     * @param  type  CardTypeEnum value for type.
     * @param  brand  CardBrandEnum value for brand.
     * @param  billingAddress  PortablePostalAddressMediumGrained value for billingAddress.
     * @param  verificationMethod  String value for verificationMethod.
     * @param  experienceContext  ExperienceContext1 value for experienceContext.
     */
    public CardRequest1(
            String id,
            String name,
            String number,
            String expiry,
            String securityCode,
            String lastDigits,
            CardBrandEnum cardType,
            CardTypeEnum type,
            CardBrandEnum brand,
            PortablePostalAddressMediumGrained billingAddress,
            String verificationMethod,
            ExperienceContext1 experienceContext) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.expiry = expiry;
        this.securityCode = securityCode;
        this.lastDigits = lastDigits;
        this.cardType = cardType;
        this.type = type;
        this.brand = brand;
        this.billingAddress = billingAddress;
        this.verificationMethod = verificationMethod;
        this.experienceContext = experienceContext;
    }

    /**
     * Getter for Id.
     * The PayPal-generated ID for the card.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The PayPal-generated ID for the card.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
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
     * Getter for Number.
     * The primary account number (PAN) for the payment card.
     * @return Returns the String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * The primary account number (PAN) for the payment card.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
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
     * Getter for SecurityCode.
     * The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or
     * CID. This parameter cannot be present in the request when `payment_initiator=MERCHANT`.
     * @return Returns the String
     */
    @JsonGetter("security_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Setter for SecurityCode.
     * The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or
     * CID. This parameter cannot be present in the request when `payment_initiator=MERCHANT`.
     * @param securityCode Value for String
     */
    @JsonSetter("security_code")
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
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
     * Getter for CardType.
     * The card brand or network. Typically used in the response.
     * @return Returns the CardBrandEnum
     */
    @JsonGetter("card_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardBrandEnum getCardType() {
        return cardType;
    }

    /**
     * Setter for CardType.
     * The card brand or network. Typically used in the response.
     * @param cardType Value for CardBrandEnum
     */
    @JsonSetter("card_type")
    public void setCardType(CardBrandEnum cardType) {
        this.cardType = cardType;
    }

    /**
     * Getter for Type.
     * The payment card type.
     * @return Returns the CardTypeEnum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The payment card type.
     * @param type Value for CardTypeEnum
     */
    @JsonSetter("type")
    public void setType(CardTypeEnum type) {
        this.type = type;
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
     * Getter for BillingAddress.
     * The billing address for this card. Supports only the `address_line_1`, `address_line_2`,
     * `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties.
     * @return Returns the PortablePostalAddressMediumGrained
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PortablePostalAddressMediumGrained getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The billing address for this card. Supports only the `address_line_1`, `address_line_2`,
     * `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties.
     * @param billingAddress Value for PortablePostalAddressMediumGrained
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(PortablePostalAddressMediumGrained billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for VerificationMethod.
     * The API caller can opt in to verify the payment token through PayPal offered verification
     * services (e.g. Smart Dollar Auth, 3DS).
     * @return Returns the String
     */
    @JsonGetter("verification_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVerificationMethod() {
        return verificationMethod;
    }

    /**
     * Setter for VerificationMethod.
     * The API caller can opt in to verify the payment token through PayPal offered verification
     * services (e.g. Smart Dollar Auth, 3DS).
     * @param verificationMethod Value for String
     */
    @JsonSetter("verification_method")
    public void setVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
    }

    /**
     * Getter for ExperienceContext.
     * Customizes the Vault creation flow experience for your customers.
     * @return Returns the ExperienceContext1
     */
    @JsonGetter("experience_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExperienceContext1 getExperienceContext() {
        return experienceContext;
    }

    /**
     * Setter for ExperienceContext.
     * Customizes the Vault creation flow experience for your customers.
     * @param experienceContext Value for ExperienceContext1
     */
    @JsonSetter("experience_context")
    public void setExperienceContext(ExperienceContext1 experienceContext) {
        this.experienceContext = experienceContext;
    }

    /**
     * Converts this CardRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardRequest1 [" + "id=" + id + ", name=" + name + ", number=" + number + ", expiry="
                + expiry + ", securityCode=" + securityCode + ", lastDigits=" + lastDigits
                + ", cardType=" + cardType + ", type=" + type + ", brand=" + brand
                + ", billingAddress=" + billingAddress + ", verificationMethod="
                + verificationMethod + ", experienceContext=" + experienceContext + "]";
    }

    /**
     * Builds a new {@link CardRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .number(getNumber())
                .expiry(getExpiry())
                .securityCode(getSecurityCode())
                .lastDigits(getLastDigits())
                .cardType(getCardType())
                .type(getType())
                .brand(getBrand())
                .billingAddress(getBillingAddress())
                .verificationMethod(getVerificationMethod())
                .experienceContext(getExperienceContext());
        return builder;
    }

    /**
     * Class to build instances of {@link CardRequest1}.
     */
    public static class Builder {
        private String id;
        private String name;
        private String number;
        private String expiry;
        private String securityCode;
        private String lastDigits;
        private CardBrandEnum cardType;
        private CardTypeEnum type;
        private CardBrandEnum brand;
        private PortablePostalAddressMediumGrained billingAddress;
        private String verificationMethod;
        private ExperienceContext1 experienceContext;



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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
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
         * Setter for securityCode.
         * @param  securityCode  String value for securityCode.
         * @return Builder
         */
        public Builder securityCode(String securityCode) {
            this.securityCode = securityCode;
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
         * Setter for cardType.
         * @param  cardType  CardBrandEnum value for cardType.
         * @return Builder
         */
        public Builder cardType(CardBrandEnum cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  CardTypeEnum value for type.
         * @return Builder
         */
        public Builder type(CardTypeEnum type) {
            this.type = type;
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
         * Setter for billingAddress.
         * @param  billingAddress  PortablePostalAddressMediumGrained value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(PortablePostalAddressMediumGrained billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for verificationMethod.
         * @param  verificationMethod  String value for verificationMethod.
         * @return Builder
         */
        public Builder verificationMethod(String verificationMethod) {
            this.verificationMethod = verificationMethod;
            return this;
        }

        /**
         * Setter for experienceContext.
         * @param  experienceContext  ExperienceContext1 value for experienceContext.
         * @return Builder
         */
        public Builder experienceContext(ExperienceContext1 experienceContext) {
            this.experienceContext = experienceContext;
            return this;
        }

        /**
         * Builds a new {@link CardRequest1} object using the set fields.
         * @return {@link CardRequest1}
         */
        public CardRequest1 build() {
            return new CardRequest1(id, name, number, expiry, securityCode, lastDigits, cardType,
                    type, brand, billingAddress, verificationMethod, experienceContext);
        }
    }
}