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
 * UnsupportedShippingTypeDescriptionEnum to be used.
 */
public enum UnsupportedShippingTypeDescriptionEnum {
    ENUM_THE_PROVIDED_SHIPPINGTYPE_IS_ONLY_SUPPORTED_FOR_APPLICATION_CONTEXTSHIPPING_PREFERENCESET_PROVIDED_ADDRESS_OR_NO_SHIPPING;


    private static TreeMap<String, UnsupportedShippingTypeDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_PROVIDED_SHIPPINGTYPE_IS_ONLY_SUPPORTED_FOR_APPLICATION_CONTEXTSHIPPING_PREFERENCESET_PROVIDED_ADDRESS_OR_NO_SHIPPING.value = "The provided `shipping.type` is only supported for `application_context.shipping_preference`=`SET_PROVIDED_ADDRESS` or `NO_SHIPPING`.";

        valueMap.put("The provided `shipping.type` is only supported for `application_context.shipping_preference`=`SET_PROVIDED_ADDRESS` or `NO_SHIPPING`.", ENUM_THE_PROVIDED_SHIPPINGTYPE_IS_ONLY_SUPPORTED_FOR_APPLICATION_CONTEXTSHIPPING_PREFERENCESET_PROVIDED_ADDRESS_OR_NO_SHIPPING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UnsupportedShippingTypeDescriptionEnum constructFromString(String toConvert) throws IOException {
        UnsupportedShippingTypeDescriptionEnum enumValue = fromString(toConvert);
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
    public static UnsupportedShippingTypeDescriptionEnum fromString(String toConvert) {
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
     * Convert list of UnsupportedShippingTypeDescriptionEnum values to list of string values.
     * @param toConvert The list of UnsupportedShippingTypeDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UnsupportedShippingTypeDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UnsupportedShippingTypeDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 