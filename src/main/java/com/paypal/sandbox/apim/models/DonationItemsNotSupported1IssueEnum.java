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
 * DonationItemsNotSupported1IssueEnum to be used.
 */
public enum DonationItemsNotSupported1IssueEnum {
    DONATION_ITEMS_NOT_SUPPORTED;


    private static TreeMap<String, DonationItemsNotSupported1IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DONATION_ITEMS_NOT_SUPPORTED.value = "DONATION_ITEMS_NOT_SUPPORTED";

        valueMap.put("DONATION_ITEMS_NOT_SUPPORTED", DONATION_ITEMS_NOT_SUPPORTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DonationItemsNotSupported1IssueEnum constructFromString(String toConvert) throws IOException {
        DonationItemsNotSupported1IssueEnum enumValue = fromString(toConvert);
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
    public static DonationItemsNotSupported1IssueEnum fromString(String toConvert) {
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
     * Convert list of DonationItemsNotSupported1IssueEnum values to list of string values.
     * @param toConvert The list of DonationItemsNotSupported1IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DonationItemsNotSupported1IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DonationItemsNotSupported1IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 