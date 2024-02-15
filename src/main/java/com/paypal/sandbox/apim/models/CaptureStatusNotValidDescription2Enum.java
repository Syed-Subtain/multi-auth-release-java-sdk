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
 * CaptureStatusNotValidDescription2Enum to be used.
 */
public enum CaptureStatusNotValidDescription2Enum {
    ENUM_INVALID_CAPTURE_STATUS_TRACKER_INFORMATION_CAN_ONLY_BE_ADDED_TO_CAPTURES_IN_COMPLETED_STATE;


    private static TreeMap<String, CaptureStatusNotValidDescription2Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_INVALID_CAPTURE_STATUS_TRACKER_INFORMATION_CAN_ONLY_BE_ADDED_TO_CAPTURES_IN_COMPLETED_STATE.value = "Invalid capture status. Tracker information can only be added to captures in `COMPLETED` state.";

        valueMap.put("Invalid capture status. Tracker information can only be added to captures in `COMPLETED` state.", ENUM_INVALID_CAPTURE_STATUS_TRACKER_INFORMATION_CAN_ONLY_BE_ADDED_TO_CAPTURES_IN_COMPLETED_STATE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CaptureStatusNotValidDescription2Enum constructFromString(String toConvert) throws IOException {
        CaptureStatusNotValidDescription2Enum enumValue = fromString(toConvert);
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
    public static CaptureStatusNotValidDescription2Enum fromString(String toConvert) {
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
     * Convert list of CaptureStatusNotValidDescription2Enum values to list of string values.
     * @param toConvert The list of CaptureStatusNotValidDescription2Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CaptureStatusNotValidDescription2Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CaptureStatusNotValidDescription2Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 