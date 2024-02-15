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
 * PayeeBlockedTransaction1DescriptionEnum to be used.
 */
public enum PayeeBlockedTransaction1DescriptionEnum {
    ENUM_THE_FRAUD_SETTINGS_FOR_THIS_SELLER_ARE_SUCH_THAT_THIS_PAYMENT_CANNOT_BE_EXECUTED;


    private static TreeMap<String, PayeeBlockedTransaction1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_FRAUD_SETTINGS_FOR_THIS_SELLER_ARE_SUCH_THAT_THIS_PAYMENT_CANNOT_BE_EXECUTED.value = "The Fraud settings for this seller are such that this payment cannot be executed.";

        valueMap.put("The Fraud settings for this seller are such that this payment cannot be executed.", ENUM_THE_FRAUD_SETTINGS_FOR_THIS_SELLER_ARE_SUCH_THAT_THIS_PAYMENT_CANNOT_BE_EXECUTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayeeBlockedTransaction1DescriptionEnum constructFromString(String toConvert) throws IOException {
        PayeeBlockedTransaction1DescriptionEnum enumValue = fromString(toConvert);
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
    public static PayeeBlockedTransaction1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of PayeeBlockedTransaction1DescriptionEnum values to list of string values.
     * @param toConvert The list of PayeeBlockedTransaction1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayeeBlockedTransaction1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayeeBlockedTransaction1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 