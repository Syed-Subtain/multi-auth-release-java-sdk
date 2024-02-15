/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.paypal.sandbox.apim.ApiHelper;
import com.paypal.sandbox.apim.Server;
import com.paypal.sandbox.apim.exceptions.ApiException;
import com.paypal.sandbox.apim.exceptions.ErrorException;
import com.paypal.sandbox.apim.http.request.HttpMethod;
import com.paypal.sandbox.apim.models.MinimalSetupToken;
import com.paypal.sandbox.apim.models.SetupToken;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class SetupTokensController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SetupTokensController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a Setup Token from the given payment source and adds it to the Vault of the
     * associated customer.
     * @param  payPalRequestId  Required parameter: The server stores keys for 3 hours.
     * @param  body  Required parameter: Setup Token creation with a instrument type optional
     *         financial instrument details and customer_id.
     * @return    Returns the MinimalSetupToken response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public MinimalSetupToken setupTokensCreate(
            final String payPalRequestId,
            final SetupToken body) throws ApiException, IOException {
        return prepareSetupTokensCreateRequest(payPalRequestId, body).execute();
    }

    /**
     * Creates a Setup Token from the given payment source and adds it to the Vault of the
     * associated customer.
     * @param  payPalRequestId  Required parameter: The server stores keys for 3 hours.
     * @param  body  Required parameter: Setup Token creation with a instrument type optional
     *         financial instrument details and customer_id.
     * @return    Returns the MinimalSetupToken response from the API call
     */
    public CompletableFuture<MinimalSetupToken> setupTokensCreateAsync(
            final String payPalRequestId,
            final SetupToken body) {
        try { 
            return prepareSetupTokensCreateRequest(payPalRequestId, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for setupTokensCreate.
     */
    private ApiCall<MinimalSetupToken, ApiException> prepareSetupTokensCreateRequest(
            final String payPalRequestId,
            final SetupToken body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<MinimalSetupToken, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEFAULT1.value())
                        .path("/v3/vault/setup-tokens")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("PayPal-Request-Id")
                                .value(payPalRequestId).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth21"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, MinimalSetupToken.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is not well-formed, syntactically incorrect, or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The requested action could not be performed, semantically incorrect, or failed business validation.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("An internal server error has occurred.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a readable representation of temporarily vaulted payment source associated with the
     * setup token id.
     * @param  id  Required parameter: A representation of a vault token.
     * @return    Returns the MinimalSetupToken response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public MinimalSetupToken setupTokensGet(
            final String id) throws ApiException, IOException {
        return prepareSetupTokensGetRequest(id).execute();
    }

    /**
     * Returns a readable representation of temporarily vaulted payment source associated with the
     * setup token id.
     * @param  id  Required parameter: A representation of a vault token.
     * @return    Returns the MinimalSetupToken response from the API call
     */
    public CompletableFuture<MinimalSetupToken> setupTokensGetAsync(
            final String id) {
        try { 
            return prepareSetupTokensGetRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for setupTokensGet.
     */
    private ApiCall<MinimalSetupToken, ApiException> prepareSetupTokensGetRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<MinimalSetupToken, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEFAULT1.value())
                        .path("/v3/vault/setup-tokens/{id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth21"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, MinimalSetupToken.class))
                        .nullify404(false)
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The specified resource does not exist.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The requested action could not be performed, semantically incorrect, or failed business validation.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("An internal server error has occurred.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}