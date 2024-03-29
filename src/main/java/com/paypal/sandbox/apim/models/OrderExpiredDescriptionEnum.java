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
 * OrderExpiredDescriptionEnum to be used.
 */
public enum OrderExpiredDescriptionEnum {
    ENUM_ORDER_IS_EXPIRED_AND_HENCE_CANNOT_BE_AUTHORIZED_PLEASE_CONTACT_CUSTOMER_SUPPORT_IF_YOU_NEED_TO_INCREASE_YOUR_ORDER_VALIDITY_PERIOD;


    private static TreeMap<String, OrderExpiredDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_ORDER_IS_EXPIRED_AND_HENCE_CANNOT_BE_AUTHORIZED_PLEASE_CONTACT_CUSTOMER_SUPPORT_IF_YOU_NEED_TO_INCREASE_YOUR_ORDER_VALIDITY_PERIOD.value = "Order is expired and hence cannot be authorized. Please contact Customer Support if you need to increase your order validity period.";

        valueMap.put("Order is expired and hence cannot be authorized. Please contact Customer Support if you need to increase your order validity period.", ENUM_ORDER_IS_EXPIRED_AND_HENCE_CANNOT_BE_AUTHORIZED_PLEASE_CONTACT_CUSTOMER_SUPPORT_IF_YOU_NEED_TO_INCREASE_YOUR_ORDER_VALIDITY_PERIOD);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OrderExpiredDescriptionEnum constructFromString(String toConvert) throws IOException {
        OrderExpiredDescriptionEnum enumValue = fromString(toConvert);
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
    public static OrderExpiredDescriptionEnum fromString(String toConvert) {
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
     * Convert list of OrderExpiredDescriptionEnum values to list of string values.
     * @param toConvert The list of OrderExpiredDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OrderExpiredDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OrderExpiredDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 