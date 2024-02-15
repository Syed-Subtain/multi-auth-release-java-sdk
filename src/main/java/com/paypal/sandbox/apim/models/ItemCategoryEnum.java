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
 * ItemCategoryEnum to be used.
 */
public enum ItemCategoryEnum {
    DIGITAL_GOODS,

    PHYSICAL_GOODS,

    DONATION;


    private static TreeMap<String, ItemCategoryEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DIGITAL_GOODS.value = "DIGITAL_GOODS";
        PHYSICAL_GOODS.value = "PHYSICAL_GOODS";
        DONATION.value = "DONATION";

        valueMap.put("DIGITAL_GOODS", DIGITAL_GOODS);
        valueMap.put("PHYSICAL_GOODS", PHYSICAL_GOODS);
        valueMap.put("DONATION", DONATION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ItemCategoryEnum constructFromString(String toConvert) throws IOException {
        ItemCategoryEnum enumValue = fromString(toConvert);
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
    public static ItemCategoryEnum fromString(String toConvert) {
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
     * Convert list of ItemCategoryEnum values to list of string values.
     * @param toConvert The list of ItemCategoryEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ItemCategoryEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ItemCategoryEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 