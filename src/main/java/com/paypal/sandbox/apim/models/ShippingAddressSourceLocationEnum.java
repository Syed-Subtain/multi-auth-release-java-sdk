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
 * ShippingAddressSourceLocationEnum to be used.
 */
public enum ShippingAddressSourceLocationEnum {
    GET_FROM_FILE,

    NO_SHIPPING,

    SET_PROVIDED_ADDRESS;


    private static TreeMap<String, ShippingAddressSourceLocationEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        GET_FROM_FILE.value = "GET_FROM_FILE";
        NO_SHIPPING.value = "NO_SHIPPING";
        SET_PROVIDED_ADDRESS.value = "SET_PROVIDED_ADDRESS";

        valueMap.put("GET_FROM_FILE", GET_FROM_FILE);
        valueMap.put("NO_SHIPPING", NO_SHIPPING);
        valueMap.put("SET_PROVIDED_ADDRESS", SET_PROVIDED_ADDRESS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ShippingAddressSourceLocationEnum constructFromString(String toConvert) throws IOException {
        ShippingAddressSourceLocationEnum enumValue = fromString(toConvert);
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
    public static ShippingAddressSourceLocationEnum fromString(String toConvert) {
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
     * Convert list of ShippingAddressSourceLocationEnum values to list of string values.
     * @param toConvert The list of ShippingAddressSourceLocationEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ShippingAddressSourceLocationEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ShippingAddressSourceLocationEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 