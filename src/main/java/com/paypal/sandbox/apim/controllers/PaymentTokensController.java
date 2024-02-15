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
import com.paypal.sandbox.apim.models.PaymentTokenRequest;
import com.paypal.sandbox.apim.models.PaymentTokenResponse;
import com.paypal.sandbox.apim.models.VaultOfACustomer;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class PaymentTokensController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public PaymentTokensController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a Payment Token from the given payment source and adds it to the Vault of the
     * associated customer.
     * @param  payPalRequestId  Required parameter: The server stores keys for 3 hours.
     * @param  body  Required parameter: Payment Token creation with a financial instrument and an
     *         optional customer_id.
     * @return    Returns the PaymentTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentTokenResponse paymentTokensCreate(
            final String payPalRequestId,
            final PaymentTokenRequest body) throws ApiException, IOException {
        return preparePaymentTokensCreateRequest(payPalRequestId, body).execute();
    }

    /**
     * Creates a Payment Token from the given payment source and adds it to the Vault of the
     * associated customer.
     * @param  payPalRequestId  Required parameter: The server stores keys for 3 hours.
     * @param  body  Required parameter: Payment Token creation with a financial instrument and an
     *         optional customer_id.
     * @return    Returns the PaymentTokenResponse response from the API call
     */
    public CompletableFuture<PaymentTokenResponse> paymentTokensCreateAsync(
            final String payPalRequestId,
            final PaymentTokenRequest body) {
        try { 
            return preparePaymentTokensCreateRequest(payPalRequestId, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for paymentTokensCreate.
     */
    private ApiCall<PaymentTokenResponse, ApiException> preparePaymentTokensCreateRequest(
            final String payPalRequestId,
            final PaymentTokenRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<PaymentTokenResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEFAULT1.value())
                        .path("/v3/vault/payment-tokens")
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
                                response -> ApiHelper.deserialize(response, PaymentTokenResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is not well-formed, syntactically incorrect, or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Request contains reference to resources that do not exist.",
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
     * Returns all payment tokens for a customer.
     * @param  customerId  Required parameter: A unique identifier representing a specific customer
     *         in merchant's/partner's system or records.
     * @param  pageSize  Optional parameter: A non-negative, non-zero integer indicating the maximum
     *         number of results to return at one time.
     * @param  page  Optional parameter: A non-negative, non-zero integer representing the page of
     *         the results.
     * @param  totalRequired  Optional parameter: A boolean indicating total number of items
     *         (total_items) and pages (total_pages) are expected to be returned in the response.
     * @return    Returns the VaultOfACustomer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public VaultOfACustomer customerPaymentTokensGet(
            final String customerId,
            final Integer pageSize,
            final Integer page,
            final Boolean totalRequired) throws ApiException, IOException {
        return prepareCustomerPaymentTokensGetRequest(customerId, pageSize, page,
                totalRequired).execute();
    }

    /**
     * Returns all payment tokens for a customer.
     * @param  customerId  Required parameter: A unique identifier representing a specific customer
     *         in merchant's/partner's system or records.
     * @param  pageSize  Optional parameter: A non-negative, non-zero integer indicating the maximum
     *         number of results to return at one time.
     * @param  page  Optional parameter: A non-negative, non-zero integer representing the page of
     *         the results.
     * @param  totalRequired  Optional parameter: A boolean indicating total number of items
     *         (total_items) and pages (total_pages) are expected to be returned in the response.
     * @return    Returns the VaultOfACustomer response from the API call
     */
    public CompletableFuture<VaultOfACustomer> customerPaymentTokensGetAsync(
            final String customerId,
            final Integer pageSize,
            final Integer page,
            final Boolean totalRequired) {
        try { 
            return prepareCustomerPaymentTokensGetRequest(customerId, pageSize, page,
            totalRequired).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for customerPaymentTokensGet.
     */
    private ApiCall<VaultOfACustomer, ApiException> prepareCustomerPaymentTokensGetRequest(
            final String customerId,
            final Integer pageSize,
            final Integer page,
            final Boolean totalRequired) throws IOException {
        return new ApiCall.Builder<VaultOfACustomer, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEFAULT1.value())
                        .path("/v3/vault/payment-tokens")
                        .queryParam(param -> param.key("customer_id")
                                .value(customerId))
                        .queryParam(param -> param.key("page_size")
                                .value((pageSize != null) ? pageSize : 5).isRequired(false))
                        .queryParam(param -> param.key("page")
                                .value((page != null) ? page : 1).isRequired(false))
                        .queryParam(param -> param.key("total_required")
                                .value((totalRequired != null) ? totalRequired : false).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth21"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, VaultOfACustomer.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is not well-formed, syntactically incorrect, or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("An internal server error has occurred.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Delete the payment token associated with the payment token id.
     * @param  id  Required parameter: A representation of a vault token.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void paymentTokensDelete(
            final String id) throws ApiException, IOException {
        preparePaymentTokensDeleteRequest(id).execute();
    }

    /**
     * Delete the payment token associated with the payment token id.
     * @param  id  Required parameter: A representation of a vault token.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> paymentTokensDeleteAsync(
            final String id) {
        try { 
            return preparePaymentTokensDeleteRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for paymentTokensDelete.
     */
    private ApiCall<Void, ApiException> preparePaymentTokensDeleteRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEFAULT1.value())
                        .path("/v3/vault/payment-tokens/{id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .add("Oauth21"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is not well-formed, syntactically incorrect, or violates schema.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Authorization failed due to insufficient permissions.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("An internal server error has occurred.",
                                (reason, context) -> new ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a readable representation of vaulted payment source associated with the payment token
     * id.
     * @param  id  Required parameter: A representation of a vault token.
     * @return    Returns the PaymentTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PaymentTokenResponse paymentTokensGet(
            final String id) throws ApiException, IOException {
        return preparePaymentTokensGetRequest(id).execute();
    }

    /**
     * Returns a readable representation of vaulted payment source associated with the payment token
     * id.
     * @param  id  Required parameter: A representation of a vault token.
     * @return    Returns the PaymentTokenResponse response from the API call
     */
    public CompletableFuture<PaymentTokenResponse> paymentTokensGetAsync(
            final String id) {
        try { 
            return preparePaymentTokensGetRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for paymentTokensGet.
     */
    private ApiCall<PaymentTokenResponse, ApiException> preparePaymentTokensGetRequest(
            final String id) throws IOException {
        return new ApiCall.Builder<PaymentTokenResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEFAULT1.value())
                        .path("/v3/vault/payment-tokens/{id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth21"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PaymentTokenResponse.class))
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