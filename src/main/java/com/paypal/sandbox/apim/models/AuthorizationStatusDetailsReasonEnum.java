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
 * AuthorizationStatusDetailsReasonEnum to be used.
 */
public enum AuthorizationStatusDetailsReasonEnum {
    PENDING_REVIEW;


    private static TreeMap<String, AuthorizationStatusDetailsReasonEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PENDING_REVIEW.value = "PENDING_REVIEW";

        valueMap.put("PENDING_REVIEW", PENDING_REVIEW);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AuthorizationStatusDetailsReasonEnum constructFromString(String toConvert) throws IOException {
        AuthorizationStatusDetailsReasonEnum enumValue = fromString(toConvert);
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
    public static AuthorizationStatusDetailsReasonEnum fromString(String toConvert) {
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
     * Convert list of AuthorizationStatusDetailsReasonEnum values to list of string values.
     * @param toConvert The list of AuthorizationStatusDetailsReasonEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AuthorizationStatusDetailsReasonEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AuthorizationStatusDetailsReasonEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 