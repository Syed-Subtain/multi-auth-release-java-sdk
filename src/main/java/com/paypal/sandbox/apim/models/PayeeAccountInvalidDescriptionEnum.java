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
 * PayeeAccountInvalidDescriptionEnum to be used.
 */
public enum PayeeAccountInvalidDescriptionEnum {
    ENUM_PAYEE_ACCOUNT_SPECIFIED_IS_INVALID_PLEASE_CHECK_THE_PAYEEEMAIL_ADDRESS_OR_PAYEEMERCHANT_ID_SPECIFIED_AND_TRY_AGAIN_ENSURE_THAT_EITHER_PAYEEMERCHANT_ID_OR_PAYEEEMAIL_ADDRESS_IS_SPECIFIED;


    private static TreeMap<String, PayeeAccountInvalidDescriptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_PAYEE_ACCOUNT_SPECIFIED_IS_INVALID_PLEASE_CHECK_THE_PAYEEEMAIL_ADDRESS_OR_PAYEEMERCHANT_ID_SPECIFIED_AND_TRY_AGAIN_ENSURE_THAT_EITHER_PAYEEMERCHANT_ID_OR_PAYEEEMAIL_ADDRESS_IS_SPECIFIED.value = "Payee account specified is invalid. Please check the `payee.email_address` or `payee.merchant_id` specified and try again. Ensure that either  `payee.merchant_id` or `payee.email_address` is specified.";

        valueMap.put("Payee account specified is invalid. Please check the `payee.email_address` or `payee.merchant_id` specified and try again. Ensure that either  `payee.merchant_id` or `payee.email_address` is specified.", ENUM_PAYEE_ACCOUNT_SPECIFIED_IS_INVALID_PLEASE_CHECK_THE_PAYEEEMAIL_ADDRESS_OR_PAYEEMERCHANT_ID_SPECIFIED_AND_TRY_AGAIN_ENSURE_THAT_EITHER_PAYEEMERCHANT_ID_OR_PAYEEEMAIL_ADDRESS_IS_SPECIFIED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PayeeAccountInvalidDescriptionEnum constructFromString(String toConvert) throws IOException {
        PayeeAccountInvalidDescriptionEnum enumValue = fromString(toConvert);
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
    public static PayeeAccountInvalidDescriptionEnum fromString(String toConvert) {
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
     * Convert list of PayeeAccountInvalidDescriptionEnum values to list of string values.
     * @param toConvert The list of PayeeAccountInvalidDescriptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PayeeAccountInvalidDescriptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PayeeAccountInvalidDescriptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 