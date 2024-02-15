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
 * TaxTotalMismatchDescriptionEnum to be used.
 */
public enum TaxTotalMismatchDescriptionEnum {
    ENUM_SHOULD_EQUAL_SUM_OF_TAX_QUANTITY_ACROSS_ALL_ITEMS_FOR_A_GIVEN_PURCHASE_UNIT;


    private static TreeMap<String, TaxTotalMismatchDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_SHOULD_EQUAL_SUM_OF_TAX_QUANTITY_ACROSS_ALL_ITEMS_FOR_A_GIVEN_PURCHASE_UNIT.value = "Should equal sum of (tax * quantity) across all items for a given purchase_unit.";

        valueMap.put("Should equal sum of (tax * quantity) across all items for a given purchase_unit.", ENUM_SHOULD_EQUAL_SUM_OF_TAX_QUANTITY_ACROSS_ALL_ITEMS_FOR_A_GIVEN_PURCHASE_UNIT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TaxTotalMismatchDescriptionEnum constructFromString(String toConvert) throws IOException {
        TaxTotalMismatchDescriptionEnum enumValue = fromString(toConvert);
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
    public static TaxTotalMismatchDescriptionEnum fromString(String toConvert) {
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
     * Convert list of TaxTotalMismatchDescriptionEnum values to list of string values.
     * @param toConvert The list of TaxTotalMismatchDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TaxTotalMismatchDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TaxTotalMismatchDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 