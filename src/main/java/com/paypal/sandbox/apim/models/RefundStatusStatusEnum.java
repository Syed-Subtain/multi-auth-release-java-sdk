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
 * RefundStatusStatusEnum to be used.
 */
public enum RefundStatusStatusEnum {
    CANCELLED,

    FAILED,

    PENDING,

    COMPLETED;


    private static TreeMap<String, RefundStatusStatusEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        CANCELLED.value = "CANCELLED";
        FAILED.value = "FAILED";
        PENDING.value = "PENDING";
        COMPLETED.value = "COMPLETED";

        valueMap.put("CANCELLED", CANCELLED);
        valueMap.put("FAILED", FAILED);
        valueMap.put("PENDING", PENDING);
        valueMap.put("COMPLETED", COMPLETED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static RefundStatusStatusEnum constructFromString(String toConvert) throws IOException {
        RefundStatusStatusEnum enumValue = fromString(toConvert);
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
    public static RefundStatusStatusEnum fromString(String toConvert) {
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
     * Convert list of RefundStatusStatusEnum values to list of string values.
     * @param toConvert The list of RefundStatusStatusEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RefundStatusStatusEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RefundStatusStatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 