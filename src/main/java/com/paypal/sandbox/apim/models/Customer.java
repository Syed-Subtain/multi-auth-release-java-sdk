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
 * This is a model class for Customer type.
 */
public class Customer {
    private String emailAddress;
    private String payerId;
    private PartyName name;
    private PhoneWithType phone;
    private String birthDate;
    private TaxInformation taxInfo;
    private PortableInternationalPostalAddress address;

    /**
     * Default constructor.
     */
    public Customer() {
    }

    /**
     * Initialization constructor.
     * @param  emailAddress  String value for emailAddress.
     * @param  payerId  String value for payerId.
     * @param  name  PartyName value for name.
     * @param  phone  PhoneWithType value for phone.
     * @param  birthDate  String value for birthDate.
     * @param  taxInfo  TaxInformation value for taxInfo.
     * @param  address  PortableInternationalPostalAddress value for address.
     */
    public Customer(
            String emailAddress,
            String payerId,
            PartyName name,
            PhoneWithType phone,
            String birthDate,
            TaxInformation taxInfo,
            PortableInternationalPostalAddress address) {
        this.emailAddress = emailAddress;
        this.payerId = payerId;
        this.name = name;
        this.phone = phone;
        this.birthDate = birthDate;
        this.taxInfo = taxInfo;
        this.address = address;
    }

    /**
     * Getter for EmailAddress.
     * The email address of the payer.
     * @return Returns the String
     */
    @JsonGetter("email_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * The email address of the payer.
     * @param emailAddress Value for String
     */
    @JsonSetter("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for PayerId.
     * The PayPal-assigned ID for the payer.
     * @return Returns the String
     */
    @JsonGetter("payer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * The PayPal-assigned ID for the payer.
     * @param payerId Value for String
     */
    @JsonSetter("payer_id")
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for Name.
     * The name of the payer. Supports only the `given_name` and `surname` properties.
     * @return Returns the PartyName
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PartyName getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the payer. Supports only the `given_name` and `surname` properties.
     * @param name Value for PartyName
     */
    @JsonSetter("name")
    public void setName(PartyName name) {
        this.name = name;
    }

    /**
     * Getter for Phone.
     * The phone number of the customer. Available only when you enable the **Contact Telephone
     * Number** option in the &lt;a
     * href="https://www.paypal.com/cgi-bin/customerprofileweb?cmd=_profile-website-payments"&gt;**Profile
     * &amp; Settings**&lt;/a&gt; for the merchant's PayPal account. The `phone.phone_number` supports only
     * `national_number`.
     * @return Returns the PhoneWithType
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PhoneWithType getPhone() {
        return phone;
    }

    /**
     * Setter for Phone.
     * The phone number of the customer. Available only when you enable the **Contact Telephone
     * Number** option in the &lt;a
     * href="https://www.paypal.com/cgi-bin/customerprofileweb?cmd=_profile-website-payments"&gt;**Profile
     * &amp; Settings**&lt;/a&gt; for the merchant's PayPal account. The `phone.phone_number` supports only
     * `national_number`.
     * @param phone Value for PhoneWithType
     */
    @JsonSetter("phone")
    public void setPhone(PhoneWithType phone) {
        this.phone = phone;
    }

    /**
     * Getter for BirthDate.
     * The birth date of the payer in `YYYY-MM-DD` format.
     * @return Returns the String
     */
    @JsonGetter("birth_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Setter for BirthDate.
     * The birth date of the payer in `YYYY-MM-DD` format.
     * @param birthDate Value for String
     */
    @JsonSetter("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Getter for TaxInfo.
     * The tax information of the payer. Required only for Brazilian payer's. Both `tax_id` and
     * `tax_id_type` are required.
     * @return Returns the TaxInformation
     */
    @JsonGetter("tax_info")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxInformation getTaxInfo() {
        return taxInfo;
    }

    /**
     * Setter for TaxInfo.
     * The tax information of the payer. Required only for Brazilian payer's. Both `tax_id` and
     * `tax_id_type` are required.
     * @param taxInfo Value for TaxInformation
     */
    @JsonSetter("tax_info")
    public void setTaxInfo(TaxInformation taxInfo) {
        this.taxInfo = taxInfo;
    }

    /**
     * Getter for Address.
     * The address of the payer. Supports only the `address_line_1`, `address_line_2`,
     * `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties. Also referred
     * to as the billing address of the customer.
     * @return Returns the PortableInternationalPostalAddress
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PortableInternationalPostalAddress getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * The address of the payer. Supports only the `address_line_1`, `address_line_2`,
     * `admin_area_1`, `admin_area_2`, `postal_code`, and `country_code` properties. Also referred
     * to as the billing address of the customer.
     * @param address Value for PortableInternationalPostalAddress
     */
    @JsonSetter("address")
    public void setAddress(PortableInternationalPostalAddress address) {
        this.address = address;
    }

    /**
     * Converts this Customer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Customer [" + "emailAddress=" + emailAddress + ", payerId=" + payerId + ", name="
                + name + ", phone=" + phone + ", birthDate=" + birthDate + ", taxInfo=" + taxInfo
                + ", address=" + address + "]";
    }

    /**
     * Builds a new {@link Customer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Customer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .emailAddress(getEmailAddress())
                .payerId(getPayerId())
                .name(getName())
                .phone(getPhone())
                .birthDate(getBirthDate())
                .taxInfo(getTaxInfo())
                .address(getAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link Customer}.
     */
    public static class Builder {
        private String emailAddress;
        private String payerId;
        private PartyName name;
        private PhoneWithType phone;
        private String birthDate;
        private TaxInformation taxInfo;
        private PortableInternationalPostalAddress address;



        /**
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  String value for payerId.
         * @return Builder
         */
        public Builder payerId(String payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  PartyName value for name.
         * @return Builder
         */
        public Builder name(PartyName name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for phone.
         * @param  phone  PhoneWithType value for phone.
         * @return Builder
         */
        public Builder phone(PhoneWithType phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Setter for birthDate.
         * @param  birthDate  String value for birthDate.
         * @return Builder
         */
        public Builder birthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        /**
         * Setter for taxInfo.
         * @param  taxInfo  TaxInformation value for taxInfo.
         * @return Builder
         */
        public Builder taxInfo(TaxInformation taxInfo) {
            this.taxInfo = taxInfo;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  PortableInternationalPostalAddress value for address.
         * @return Builder
         */
        public Builder address(PortableInternationalPostalAddress address) {
            this.address = address;
            return this;
        }

        /**
         * Builds a new {@link Customer} object using the set fields.
         * @return {@link Customer}
         */
        public Customer build() {
            return new Customer(emailAddress, payerId, name, phone, birthDate, taxInfo, address);
        }
    }
}