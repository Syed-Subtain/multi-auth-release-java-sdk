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
 * TransactionReceivingLimitExceeded2DescriptionEnum to be used.
 */
public enum TransactionReceivingLimitExceeded2DescriptionEnum {
    ENUM_THE_TRANSACTION_EXCEEDS_THE_RECEIVERS_RECEIVING_LIMIT;


    private static TreeMap<String, TransactionReceivingLimitExceeded2DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_TRANSACTION_EXCEEDS_THE_RECEIVERS_RECEIVING_LIMIT.value = "The transaction exceeds the receiver's receiving limit.";

        valueMap.put("The transaction exceeds the receiver's receiving limit.", ENUM_THE_TRANSACTION_EXCEEDS_THE_RECEIVERS_RECEIVING_LIMIT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionReceivingLimitExceeded2DescriptionEnum constructFromString(String toConvert) throws IOException {
        TransactionReceivingLimitExceeded2DescriptionEnum enumValue = fromString(toConvert);
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
    public static TransactionReceivingLimitExceeded2DescriptionEnum fromString(String toConvert) {
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
     * Convert list of TransactionReceivingLimitExceeded2DescriptionEnum values to list of string values.
     * @param toConvert The list of TransactionReceivingLimitExceeded2DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionReceivingLimitExceeded2DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionReceivingLimitExceeded2DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 