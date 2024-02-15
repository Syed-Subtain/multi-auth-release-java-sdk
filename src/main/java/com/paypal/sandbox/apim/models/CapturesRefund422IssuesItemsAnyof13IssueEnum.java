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
 * CapturesRefund422IssuesItemsAnyof13IssueEnum to be used.
 */
public enum CapturesRefund422IssuesItemsAnyof13IssueEnum {
    PARTIAL_REFUND_NOT_ALLOWED;


    private static TreeMap<String, CapturesRefund422IssuesItemsAnyof13IssueEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PARTIAL_REFUND_NOT_ALLOWED.value = "PARTIAL_REFUND_NOT_ALLOWED";

        valueMap.put("PARTIAL_REFUND_NOT_ALLOWED", PARTIAL_REFUND_NOT_ALLOWED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CapturesRefund422IssuesItemsAnyof13IssueEnum constructFromString(String toConvert) throws IOException {
        CapturesRefund422IssuesItemsAnyof13IssueEnum enumValue = fromString(toConvert);
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
    public static CapturesRefund422IssuesItemsAnyof13IssueEnum fromString(String toConvert) {
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
     * Convert list of CapturesRefund422IssuesItemsAnyof13IssueEnum values to list of string values.
     * @param toConvert The list of CapturesRefund422IssuesItemsAnyof13IssueEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CapturesRefund422IssuesItemsAnyof13IssueEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CapturesRefund422IssuesItemsAnyof13IssueEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 