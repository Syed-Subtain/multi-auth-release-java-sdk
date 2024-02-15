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
 * PlatformFeesNotSupportedDescriptionEnum to be used.
 */
public enum PlatformFeesNotSupportedDescriptionEnum {
    ENUM_THE_API_CALLER_IS_NOT_ENABLED_TO_PROCESS_TRANSACTIONS_BY_SPECIFYING_PLATFORM_FEES_PLEASE_WORK_WITH_YOUR_PAYPAL_ACCOUNT_MANAGER_TO_ENABLE_THIS_OPTION_FOR_YOUR_ACCOUNT;


    private static TreeMap<String, PlatformFeesNotSupportedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_API_CALLER_IS_NOT_ENABLED_TO_PROCESS_TRANSACTIONS_BY_SPECIFYING_PLATFORM_FEES_PLEASE_WORK_WITH_YOUR_PAYPAL_ACCOUNT_MANAGER_TO_ENABLE_THIS_OPTION_FOR_YOUR_ACCOUNT.value = "The API Caller is not enabled to process transactions by specifying 'platform_fees'. Please work with your PayPal Account Manager to enable this option for your account.";

        valueMap.put("The API Caller is not enabled to process transactions by specifying 'platform_fees'. Please work with your PayPal Account Manager to enable this option for your account.", ENUM_THE_API_CALLER_IS_NOT_ENABLED_TO_PROCESS_TRANSACTIONS_BY_SPECIFYING_PLATFORM_FEES_PLEASE_WORK_WITH_YOUR_PAYPAL_ACCOUNT_MANAGER_TO_ENABLE_THIS_OPTION_FOR_YOUR_ACCOUNT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PlatformFeesNotSupportedDescriptionEnum constructFromString(String toConvert) throws IOException {
        PlatformFeesNotSupportedDescriptionEnum enumValue = fromString(toConvert);
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
    public static PlatformFeesNotSupportedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PlatformFeesNotSupportedDescriptionEnum values to list of string values.
     * @param toConvert The list of PlatformFeesNotSupportedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PlatformFeesNotSupportedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PlatformFeesNotSupportedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 