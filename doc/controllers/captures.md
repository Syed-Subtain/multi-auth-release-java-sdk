# Captures

Use the `/captures` resource to show details for and refund a captured payment.

```java
CapturesController capturesController = client.getCapturesController();
```

## Class Name

`CapturesController`

## Methods

* [Captures Get](../../doc/controllers/captures.md#captures-get)
* [Captures Refund](../../doc/controllers/captures.md#captures-refund)


# Captures Get

Shows details for a captured payment, by ID.

```java
CompletableFuture<AdditionalCapture> capturesGetAsync(
    final String captureId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `captureId` | `String` | Template, Required | The PayPal-generated ID for the captured payment to refund. |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/payment/authcapture`

## Response Type

[`AdditionalCapture`](../../doc/models/additional-capture.md)

## Example Usage

```java
String captureId = "capture_id2";

capturesController.capturesGetAsync(captureId).thenAccept(result -> {
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
| 403 | The request failed because the caller has insufficient permissions. | [`CapturesGetResponse403JsonException`](../../doc/models/captures-get-response-403-json-exception.md) |
| 404 | The request failed because the resource does not exist. | [`CapturesGetResponse404JsonException`](../../doc/models/captures-get-response-404-json-exception.md) |
| 500 | The request failed because an internal server error occurred. | `ApiException` |
| Default | The default response. | `ApiException` |


# Captures Refund

Refunds a captured payment, by ID. For a full refund, include an empty payload in the JSON request body. For a partial refund, include an <code>amount</code> object in the JSON request body.

```java
CompletableFuture<Refund> capturesRefundAsync(
    final String captureId,
    final String payPalRequestId,
    final String prefer,
    final String payPalAuthAssertion,
    final RefundRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `captureId` | `String` | Template, Required | The PayPal-generated ID for the captured payment to refund. |
| `payPalRequestId` | `String` | Header, Required | The server stores keys for 45 days. |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul> |
| `payPalAuthAssertion` | `String` | Header, Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion).<blockquote><strong>Note:</strong>For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject.</blockquote> |
| `body` | [`RefundRequest`](../../doc/models/refund-request.md) | Body, Optional | - |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/refund`

## Response Type

[`Refund`](../../doc/models/refund.md)

## Example Usage

```java
String captureId = "capture_id2";
String payPalRequestId = "PayPal-Request-Id6";
RefundRequest body = new RefundRequest.Builder()
    .amount(new Money.Builder(
        "USD",
        "10.00"
    )
    .build())
    .invoiceId("INVOICE-123")
    .noteToPayer("DefectiveProduct")
    .paymentInstruction(new AdditionalPaymentInstruction.Builder()
        .platformFees(Arrays.asList(
            new PlatformFee.Builder(
                new Money.Builder(
                    "USD",
                    "1.00"
                )
                .build()
            )
            .build()
        ))
        .build())
    .build();

capturesController.capturesRefundAsync(captureId, payPalRequestId, null, null, body).thenAccept(result -> {
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
| 400 | The request failed because it is not well-formed or is syntactically incorrect or violates schema. | [`CapturesRefundResponse400JsonException`](../../doc/models/captures-refund-response-400-json-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`CapturesRefundResponse401JsonException`](../../doc/models/captures-refund-response-401-json-exception.md) |
| 403 | The request failed because the caller has insufficient permissions. | [`CapturesRefundResponse403JsonException`](../../doc/models/captures-refund-response-403-json-exception.md) |
| 404 | The request failed because the resource does not exist. | [`CapturesRefundResponse404JsonException`](../../doc/models/captures-refund-response-404-json-exception.md) |
| 409 | The request failed because a previous call for the given resource is in progress. | [`CapturesRefundResponse409JsonException`](../../doc/models/captures-refund-response-409-json-exception.md) |
| 422 | The request failed because it either is semantically incorrect or failed business validation. | [`CapturesRefundResponse422JsonException`](../../doc/models/captures-refund-response-422-json-exception.md) |
| 500 | The request failed because an internal server error occurred. | `ApiException` |
| Default | The default response. | `ApiException` |

