/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * BillingAgreementIdMismatchDescriptionEnum to be used.
 */
public enum BillingAgreementIdMismatchDescriptionEnum {
    ENUM_BILLING_AGREEMENT_ID_MUST_EXACTLY_MATCH_THE_BILLING_AGREEMENT_ID_THAT_WAS_PROVIDED_DURING_ORDER_CREATION;


    private static TreeMap<String, BillingAgreementIdMismatchDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_BILLING_AGREEMENT_ID_MUST_EXACTLY_MATCH_THE_BILLING_AGREEMENT_ID_THAT_WAS_PROVIDED_DURING_ORDER_CREATION.value = "Billing Agreement ID must exactly match the Billing Agreement ID that was provided during order creation.";

        valueMap.put("Billing Agreement ID must exactly match the Billing Agreement ID that was provided during order creation.", ENUM_BILLING_AGREEMENT_ID_MUST_EXACTLY_MATCH_THE_BILLING_AGREEMENT_ID_THAT_WAS_PROVIDED_DURING_ORDER_CREATION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BillingAgreementIdMismatchDescriptionEnum constructFromString(String toConvert) throws IOException {
        BillingAgreementIdMismatchDescriptionEnum enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static BillingAgreementIdMismatchDescriptionEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of BillingAgreementIdMismatchDescriptionEnum values to list of string values.
     * @param toConvert The list of BillingAgreementIdMismatchDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BillingAgreementIdMismatchDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BillingAgreementIdMismatchDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 