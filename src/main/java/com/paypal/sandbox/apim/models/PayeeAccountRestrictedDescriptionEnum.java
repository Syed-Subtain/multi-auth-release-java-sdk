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
 * PayeeAccountRestrictedDescriptionEnum to be used.
 */
public enum PayeeAccountRestrictedDescriptionEnum {
    ENUM_THE_MERCHANT_ACCOUNT_IS_RESTRICTED;


    private static TreeMap<String, PayeeAccountRestrictedDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_MERCHANT_ACCOUNT_IS_RESTRICTED.value = "The merchant account is restricted.";

        valueMap.put("The merchant account is restricted.", ENUM_THE_MERCHANT_ACCOUNT_IS_RESTRICTED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayeeAccountRestrictedDescriptionEnum constructFromString(String toConvert) throws IOException {
        PayeeAccountRestrictedDescriptionEnum enumValue = fromString(toConvert);
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
    public static PayeeAccountRestrictedDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PayeeAccountRestrictedDescriptionEnum values to list of string values.
     * @param toConvert The list of PayeeAccountRestrictedDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayeeAccountRestrictedDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayeeAccountRestrictedDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 