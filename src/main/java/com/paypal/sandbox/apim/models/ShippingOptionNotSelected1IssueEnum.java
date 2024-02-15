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
 * ShippingOptionNotSelected1IssueEnum to be used.
 */
public enum ShippingOptionNotSelected1IssueEnum {
    SHIPPING_OPTION_NOT_SELECTED;


    private static TreeMap<String, ShippingOptionNotSelected1IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        SHIPPING_OPTION_NOT_SELECTED.value = "SHIPPING_OPTION_NOT_SELECTED";

        valueMap.put("SHIPPING_OPTION_NOT_SELECTED", SHIPPING_OPTION_NOT_SELECTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ShippingOptionNotSelected1IssueEnum constructFromString(String toConvert) throws IOException {
        ShippingOptionNotSelected1IssueEnum enumValue = fromString(toConvert);
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
    public static ShippingOptionNotSelected1IssueEnum fromString(String toConvert) {
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
     * Convert list of ShippingOptionNotSelected1IssueEnum values to list of string values.
     * @param toConvert The list of ShippingOptionNotSelected1IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ShippingOptionNotSelected1IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ShippingOptionNotSelected1IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 