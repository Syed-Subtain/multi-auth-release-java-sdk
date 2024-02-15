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
 * PermissionDenied3DescriptionEnum to be used.
 */
public enum PermissionDenied3DescriptionEnum {
    ENUM_YOU_DO_NOT_HAVE_PERMISSION_TO_ACCESS_OR_PERFORM_OPERATIONS_ON_THIS_RESOURCE;


    private static TreeMap<String, PermissionDenied3DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_YOU_DO_NOT_HAVE_PERMISSION_TO_ACCESS_OR_PERFORM_OPERATIONS_ON_THIS_RESOURCE.value = "You do not have permission to access or perform operations on this resource.";

        valueMap.put("You do not have permission to access or perform operations on this resource.", ENUM_YOU_DO_NOT_HAVE_PERMISSION_TO_ACCESS_OR_PERFORM_OPERATIONS_ON_THIS_RESOURCE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PermissionDenied3DescriptionEnum constructFromString(String toConvert) throws IOException {
        PermissionDenied3DescriptionEnum enumValue = fromString(toConvert);
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
    public static PermissionDenied3DescriptionEnum fromString(String toConvert) {
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
     * Convert list of PermissionDenied3DescriptionEnum values to list of string values.
     * @param toConvert The list of PermissionDenied3DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PermissionDenied3DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PermissionDenied3DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 