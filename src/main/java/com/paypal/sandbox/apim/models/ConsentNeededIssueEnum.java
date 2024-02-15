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
 * ConsentNeededIssueEnum to be used.
 */
public enum ConsentNeededIssueEnum {
    CONSENT_NEEDED;


    private static TreeMap<String, ConsentNeededIssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        CONSENT_NEEDED.value = "CONSENT_NEEDED";

        valueMap.put("CONSENT_NEEDED", CONSENT_NEEDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ConsentNeededIssueEnum constructFromString(String toConvert) throws IOException {
        ConsentNeededIssueEnum enumValue = fromString(toConvert);
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
    public static ConsentNeededIssueEnum fromString(String toConvert) {
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
     * Convert list of ConsentNeededIssueEnum values to list of string values.
     * @param toConvert The list of ConsentNeededIssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ConsentNeededIssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ConsentNeededIssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 