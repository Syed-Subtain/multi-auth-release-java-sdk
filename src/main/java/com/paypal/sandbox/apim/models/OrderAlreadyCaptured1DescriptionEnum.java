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
 * OrderAlreadyCaptured1DescriptionEnum to be used.
 */
public enum OrderAlreadyCaptured1DescriptionEnum {
    ENUM_ORDER_ALREADY_CAPTUREDIF_INTENTCAPTURE_ONLY_ONE_CAPTURE_PER_ORDER_IS_ALLOWED;


    private static TreeMap<String, OrderAlreadyCaptured1DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_ORDER_ALREADY_CAPTUREDIF_INTENTCAPTURE_ONLY_ONE_CAPTURE_PER_ORDER_IS_ALLOWED.value = "Order already captured.If 'intent=CAPTURE' only one capture per order is allowed.";

        valueMap.put("Order already captured.If 'intent=CAPTURE' only one capture per order is allowed.", ENUM_ORDER_ALREADY_CAPTUREDIF_INTENTCAPTURE_ONLY_ONE_CAPTURE_PER_ORDER_IS_ALLOWED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OrderAlreadyCaptured1DescriptionEnum constructFromString(String toConvert) throws IOException {
        OrderAlreadyCaptured1DescriptionEnum enumValue = fromString(toConvert);
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
    public static OrderAlreadyCaptured1DescriptionEnum fromString(String toConvert) {
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
     * Convert list of OrderAlreadyCaptured1DescriptionEnum values to list of string values.
     * @param toConvert The list of OrderAlreadyCaptured1DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OrderAlreadyCaptured1DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OrderAlreadyCaptured1DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 