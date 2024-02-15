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
 * PayeePaymentMethodPreferenceEnum to be used.
 */
public enum PayeePaymentMethodPreferenceEnum {
    UNRESTRICTED,

    IMMEDIATE_PAYMENT_REQUIRED;


    private static TreeMap<String, PayeePaymentMethodPreferenceEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        UNRESTRICTED.value = "UNRESTRICTED";
        IMMEDIATE_PAYMENT_REQUIRED.value = "IMMEDIATE_PAYMENT_REQUIRED";

        valueMap.put("UNRESTRICTED", UNRESTRICTED);
        valueMap.put("IMMEDIATE_PAYMENT_REQUIRED", IMMEDIATE_PAYMENT_REQUIRED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayeePaymentMethodPreferenceEnum constructFromString(String toConvert) throws IOException {
        PayeePaymentMethodPreferenceEnum enumValue = fromString(toConvert);
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
    public static PayeePaymentMethodPreferenceEnum fromString(String toConvert) {
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
     * Convert list of PayeePaymentMethodPreferenceEnum values to list of string values.
     * @param toConvert The list of PayeePaymentMethodPreferenceEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayeePaymentMethodPreferenceEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayeePaymentMethodPreferenceEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 