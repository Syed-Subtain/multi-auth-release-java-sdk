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
 * AuthCaptureNotEnabled2DescriptionEnum to be used.
 */
public enum AuthCaptureNotEnabled2DescriptionEnum {
    ENUM_AUTHORIZATION_AND_CAPTURE_FEATURE_IS_NOT_ENABLED_FOR_THE_MERCHANT_MAKE_SURE_THAT_THE_RECIPIENT_OF_THE_FUNDS_IS_A_VERIFIED_BUSINESS_ACCOUNT;


    private static TreeMap<String, AuthCaptureNotEnabled2DescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_AUTHORIZATION_AND_CAPTURE_FEATURE_IS_NOT_ENABLED_FOR_THE_MERCHANT_MAKE_SURE_THAT_THE_RECIPIENT_OF_THE_FUNDS_IS_A_VERIFIED_BUSINESS_ACCOUNT.value = "Authorization and Capture feature is not enabled for the merchant. Make sure that the recipient of the funds is a verified business account.";

        valueMap.put("Authorization and Capture feature is not enabled for the merchant. Make sure that the recipient of the funds is a verified business account.", ENUM_AUTHORIZATION_AND_CAPTURE_FEATURE_IS_NOT_ENABLED_FOR_THE_MERCHANT_MAKE_SURE_THAT_THE_RECIPIENT_OF_THE_FUNDS_IS_A_VERIFIED_BUSINESS_ACCOUNT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AuthCaptureNotEnabled2DescriptionEnum constructFromString(String toConvert) throws IOException {
        AuthCaptureNotEnabled2DescriptionEnum enumValue = fromString(toConvert);
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
    public static AuthCaptureNotEnabled2DescriptionEnum fromString(String toConvert) {
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
     * Convert list of AuthCaptureNotEnabled2DescriptionEnum values to list of string values.
     * @param toConvert The list of AuthCaptureNotEnabled2DescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AuthCaptureNotEnabled2DescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AuthCaptureNotEnabled2DescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 