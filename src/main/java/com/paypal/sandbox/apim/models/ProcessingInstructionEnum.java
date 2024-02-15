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
 * ProcessingInstructionEnum to be used.
 */
public enum ProcessingInstructionEnum {
    ORDER_COMPLETE_ON_PAYMENT_APPROVAL,

    NO_INSTRUCTION;


    private static TreeMap<String, ProcessingInstructionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ORDER_COMPLETE_ON_PAYMENT_APPROVAL.value = "ORDER_COMPLETE_ON_PAYMENT_APPROVAL";
        NO_INSTRUCTION.value = "NO_INSTRUCTION";

        valueMap.put("ORDER_COMPLETE_ON_PAYMENT_APPROVAL", ORDER_COMPLETE_ON_PAYMENT_APPROVAL);
        valueMap.put("NO_INSTRUCTION", NO_INSTRUCTION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ProcessingInstructionEnum constructFromString(String toConvert) throws IOException {
        ProcessingInstructionEnum enumValue = fromString(toConvert);
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
    public static ProcessingInstructionEnum fromString(String toConvert) {
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
     * Convert list of ProcessingInstructionEnum values to list of string values.
     * @param toConvert The list of ProcessingInstructionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ProcessingInstructionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ProcessingInstructionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 