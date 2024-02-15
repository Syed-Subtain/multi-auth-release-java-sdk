/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sandbox.apim.models.Error403MessageEnum;
import com.paypal.sandbox.apim.models.Error403NameEnum;
import com.paypal.sandbox.apim.models.ErrorDetails11;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for AuthorizationsVoidResponse403JsonException type.
 */
public class AuthorizationsVoidResponse403JsonException extends ApiException {
    private static final long serialVersionUID = -6258364521296595606L;
    private Error403NameEnum name;
    private Error403MessageEnum message;
    private List<ErrorDetails11> issues;
    private String debugId;
    private String informationLink;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public AuthorizationsVoidResponse403JsonException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Name.
     * @return Returns the Error403NameEnum
     */
    @JsonGetter("name")
    public Error403NameEnum getName() {
        return this.name;
    }

    /**
     * Setter for Name.
     * @param name Value for Error403NameEnum
     */
    @JsonSetter("name")
    private void setName(Error403NameEnum name) {
        this.name = name;
    }

    /**
     * Getter for Message.
     * @return Returns the Error403MessageEnum
     */
    @JsonGetter("message")
    public Error403MessageEnum getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * @param messageField Value for Error403MessageEnum
     */
    @JsonSetter("message")
    private void setMessageField(Error403MessageEnum messageField) {
        this.message = messageField;
    }

    /**
     * Getter for Issues.
     * @return Returns the List of ErrorDetails11
     */
    @JsonGetter("issues")
    public List<ErrorDetails11> getIssues() {
        return this.issues;
    }

    /**
     * Setter for Issues.
     * @param issues Value for List of ErrorDetails11
     */
    @JsonSetter("issues")
    private void setIssues(List<ErrorDetails11> issues) {
        this.issues = issues;
    }

    /**
     * Getter for DebugId.
     * The PayPal internal ID. Used for correlation purposes.
     * @return Returns the String
     */
    @JsonGetter("debug_id")
    public String getDebugId() {
        return this.debugId;
    }

    /**
     * Setter for DebugId.
     * The PayPal internal ID. Used for correlation purposes.
     * @param debugId Value for String
     */
    @JsonSetter("debug_id")
    private void setDebugId(String debugId) {
        this.debugId = debugId;
    }

    /**
     * Getter for InformationLink.
     * The information link, or URI, that shows detailed information about this error for the
     * developer.
     * @return Returns the String
     */
    @JsonGetter("information_link")
    public String getInformationLink() {
        return this.informationLink;
    }

    /**
     * Setter for InformationLink.
     * The information link, or URI, that shows detailed information about this error for the
     * developer.
     * @param informationLink Value for String
     */
    @JsonSetter("information_link")
    private void setInformationLink(String informationLink) {
        this.informationLink = informationLink;
    }
}
