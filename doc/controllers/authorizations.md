# Authorizations

Use the `/authorizations` resource to show details for, capture payment for, reauthorize, and void authorized payments.

```java
AuthorizationsController authorizationsController = client.getAuthorizationsController();
```

## Class Name

`AuthorizationsController`

## Methods

* [Authorizations Reauthorize](../../doc/controllers/authorizations.md#authorizations-reauthorize)
* [Authorizations Void](../../doc/controllers/authorizations.md#authorizations-void)
* [Authorizations Get](../../doc/controllers/authorizations.md#authorizations-get)
* [Authorizations Capture](../../doc/controllers/authorizations.md#authorizations-capture)


# Authorizations Reauthorize

Reauthorizes an authorized PayPal account payment, by ID. To ensure that funds are still available, reauthorize a payment after its initial three-day honor period expires. Within the 29-day authorization period, you can issue multiple re-authorizations after the honor period expires.<br/><br/>If 30 days have transpired since the date of the original authorization, you must create an authorized payment instead of reauthorizing the original authorized payment.<br/><br/>A reauthorized payment itself has a new honor period of three days.<br/><br/>You can reauthorize an authorized payment once for up to 115% of the original authorized amount, not to exceed an increase of $75 USD.<br/><br/>Supports only the `amount` request parameter.<blockquote><strong>Note:</strong> This request is currently not supported for Partner use cases.</blockquote>

```java
CompletableFuture<AdditionalAuthorization> authorizationsReauthorizeAsync(
    final String authorizationId,
    final String payPalRequestId,
    final String prefer,
    final ReauthorizeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `authorizationId` | `String` | Template, Required | The PayPal-generated ID for the authorized payment to void. |
| `payPalRequestId` | `String` | Header, Required | The server stores keys for 45 days. |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul> |
| `body` | [`ReauthorizeRequest`](../../doc/models/reauthorize-request.md) | Body, Optional | - |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/payment/authcapture`

## Response Type

[`AdditionalAuthorization`](../../doc/models/additional-authorization.md)

## Example Usage

```java
String authorizationId = "authorization_id8";
String payPalRequestId = "PayPal-Request-Id6";
ReauthorizeRequest body = new ReauthorizeRequest.Builder()
    .amount(new Money.Builder(
        "USD",
        "10.99"
    )
    .build())
    .build();

authorizationsController.authorizationsReauthorizeAsync(authorizationId, payPalRequestId, null, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The request failed because it is not well-formed or is syntactically incorrect or violates schema. | [`AuthorizationsReauthorizeResponse400JsonException`](../../doc/models/authorizations-reauthorize-response-400-json-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`M401ErrorErrorException`](../../doc/models/m401-error-error-exception.md) |
| 403 | The request failed because the caller has insufficient permissions. | [`AuthorizationsReauthorizeResponse403JsonException`](../../doc/models/authorizations-reauthorize-response-403-json-exception.md) |
| 404 | The request failed because the resource does not exist. | [`AuthorizationsReauthorizeResponse404JsonException`](../../doc/models/authorizations-reauthorize-response-404-json-exception.md) |
| 422 | The request failed because it either is semantically incorrect or failed business validation. | [`AuthorizationsReauthorizeResponse422JsonException`](../../doc/models/authorizations-reauthorize-response-422-json-exception.md) |
| 500 | The request failed because an internal server error occurred. | `ApiException` |
| Default | The default response. | `ApiException` |


# Authorizations Void

Voids, or cancels, an authorized payment, by ID. You cannot void an authorized payment that has been fully captured.

```java
CompletableFuture<AdditionalAuthorization> authorizationsVoidAsync(
    final String authorizationId,
    final String payPalAuthAssertion,
    final String prefer)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `authorizationId` | `String` | Template, Required | The PayPal-generated ID for the authorized payment to void. |
| `payPalAuthAssertion` | `String` | Header, Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion).<blockquote><strong>Note:</strong>For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject.</blockquote> |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul> |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/payment/authcapture`

## Response Type

[`AdditionalAuthorization`](../../doc/models/additional-authorization.md)

## Example Usage

```java
String authorizationId = "authorization_id8";
String prefer = "return=minimal";

authorizationsController.authorizationsVoidAsync(authorizationId, null, prefer).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The request failed because it is not well-formed or is syntactically incorrect or violates schema. | [`M400ErrorErrorException`](../../doc/models/m400-error-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`AuthorizationsVoidResponse401JsonException`](../../doc/models/authorizations-void-response-401-json-exception.md) |
| 403 | The request failed because the caller has insufficient permissions. | [`AuthorizationsVoidResponse403JsonException`](../../doc/models/authorizations-void-response-403-json-exception.md) |
| 404 | The request failed because the resource does not exist. | [`AuthorizationsVoidResponse404JsonException`](../../doc/models/authorizations-void-response-404-json-exception.md) |
| 409 | The request failed because a previous call for the given resource is in progress. | [`AuthorizationsVoidResponse409JsonException`](../../doc/models/authorizations-void-response-409-json-exception.md) |
| 422 | The request failed because it either is semantically incorrect or failed business validation. | [`AuthorizationsVoidResponse422JsonException`](../../doc/models/authorizations-void-response-422-json-exception.md) |
| 500 | The request failed because an internal server error occurred. | `ApiException` |
| Default | The default response. | `ApiException` |


# Authorizations Get

Shows details for an authorized payment, by ID.

```java
CompletableFuture<AdditionalAuthorization> authorizationsGetAsync(
    final String authorizationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `authorizationId` | `String` | Template, Required | The PayPal-generated ID for the authorized payment to void. |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/payment/authcapture`

## Response Type

[`AdditionalAuthorization`](../../doc/models/additional-authorization.md)

## Example Usage

```java
String authorizationId = "authorization_id8";

authorizationsController.authorizationsGetAsync(authorizationId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`M401ErrorErrorException`](../../doc/models/m401-error-error-exception.md) |
| 403 | The request failed because the caller has insufficient permissions. | [`AuthorizationsGetResponse403JsonException`](../../doc/models/authorizations-get-response-403-json-exception.md) |
| 404 | The request failed because the resource does not exist. | [`AuthorizationsGetResponse404JsonException`](../../doc/models/authorizations-get-response-404-json-exception.md) |
| 500 | The request failed because an internal server error occurred. | `ApiException` |
| Default | The default response. | `ApiException` |


# Authorizations Capture

Captures an authorized payment, by ID.

```java
CompletableFuture<AdditionalCapture> authorizationsCaptureAsync(
    final String authorizationId,
    final String payPalRequestId,
    final String prefer,
    final CaptureRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `authorizationId` | `String` | Template, Required | The PayPal-generated ID for the authorized payment to void. |
| `payPalRequestId` | `String` | Header, Required | The server stores keys for 45 days. |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul> |
| `body` | [`CaptureRequest`](../../doc/models/capture-request.md) | Body, Optional | - |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/payment/authcapture`

## Response Type

[`AdditionalCapture`](../../doc/models/additional-capture.md)

## Example Usage

```java
String authorizationId = "authorization_id8";
String payPalRequestId = "PayPal-Request-Id6";
CaptureRequest body = new CaptureRequest.Builder()
    .invoiceId("INVOICE-123")
    .noteToPayer("If the ordered color is not available, we will substitute with a different color free of charge.")
    .amount(new Money.Builder(
        "USD",
        "10.99"
    )
    .build())
    .finalCapture(true)
    .softDescriptor("Bob's Custom Sweaters")
    .build();

authorizationsController.authorizationsCaptureAsync(authorizationId, payPalRequestId, null, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The request failed because it is not well-formed or is syntactically incorrect or violates schema. | [`AuthorizationsCaptureResponse400JsonException`](../../doc/models/authorizations-capture-response-400-json-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`M401ErrorErrorException`](../../doc/models/m401-error-error-exception.md) |
| 403 | The request failed because the caller has insufficient permissions. | [`AuthorizationsCaptureResponse403JsonException`](../../doc/models/authorizations-capture-response-403-json-exception.md) |
| 404 | The request failed because the resource does not exist. | [`AuthorizationsCaptureResponse404JsonException`](../../doc/models/authorizations-capture-response-404-json-exception.md) |
| 422 | The request failed because it is semantically incorrect or failed business validation. | [`AuthorizationsCaptureResponse422JsonException`](../../doc/models/authorizations-capture-response-422-json-exception.md) |
| 500 | The request failed because an internal server error occurred. | `ApiException` |
| Default | The default response. | `ApiException` |

