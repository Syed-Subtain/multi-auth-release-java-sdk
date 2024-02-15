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
 * OrderIsPendingApprovalDescriptionEnum to be used.
 */
public enum OrderIsPendingApprovalDescriptionEnum {
    ENUM_THE_ORDER_WAS_CONFIRMED_AND_PAYER_ACTION_COMPLETED_BUT_ORDER_APPROVAL_PROCESSING_FROM_PAYPAL_IS_PENDING_NO_ACTION_IS_NEEDED_FROM_PAYEE_OR_PAYER_PLEASE_WAIT_UNTIL_ORDER_STATUS_CHANGES_TO_APPROVED;


    private static TreeMap<String, OrderIsPendingApprovalDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_THE_ORDER_WAS_CONFIRMED_AND_PAYER_ACTION_COMPLETED_BUT_ORDER_APPROVAL_PROCESSING_FROM_PAYPAL_IS_PENDING_NO_ACTION_IS_NEEDED_FROM_PAYEE_OR_PAYER_PLEASE_WAIT_UNTIL_ORDER_STATUS_CHANGES_TO_APPROVED.value = "The order was confirmed and payer action completed but order approval processing from PayPal is pending. No action is needed from Payee or Payer. Please wait until order status changes to 'APPROVED'.";

        valueMap.put("The order was confirmed and payer action completed but order approval processing from PayPal is pending. No action is needed from Payee or Payer. Please wait until order status changes to 'APPROVED'.", ENUM_THE_ORDER_WAS_CONFIRMED_AND_PAYER_ACTION_COMPLETED_BUT_ORDER_APPROVAL_PROCESSING_FROM_PAYPAL_IS_PENDING_NO_ACTION_IS_NEEDED_FROM_PAYEE_OR_PAYER_PLEASE_WAIT_UNTIL_ORDER_STATUS_CHANGES_TO_APPROVED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OrderIsPendingApprovalDescriptionEnum constructFromString(String toConvert) throws IOException {
        OrderIsPendingApprovalDescriptionEnum enumValue = fromString(toConvert);
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
    public static OrderIsPendingApprovalDescriptionEnum fromString(String toConvert) {
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
     * Convert list of OrderIsPendingApprovalDescriptionEnum values to list of string values.
     * @param toConvert The list of OrderIsPendingApprovalDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OrderIsPendingApprovalDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OrderIsPendingApprovalDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 