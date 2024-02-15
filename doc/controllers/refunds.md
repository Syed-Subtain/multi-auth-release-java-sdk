# Refunds

Use the `/refunds` resource to show refund details.

```java
RefundsController refundsController = client.getRefundsController();
```

## Class Name

`RefundsController`


# Refunds Get

Shows details for a refund, by ID.

```java
CompletableFuture<Refund> refundsGetAsync(
    final String refundId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `refundId` | `String` | Template, Required | The PayPal-generated ID for the refund for which to show details. |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/refund`

## Response Type

[`Refund`](../../doc/models/refund.md)

## Example Usage

```java
String refundId = "refund_id4";

refundsController.refundsGetAsync(refundId).thenAccept(result -> {
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
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`RefundsGetResponse401JsonException`](../../doc/models/refunds-get-response-401-json-exception.md) |
| 403 | The request failed because the caller has insufficient permissions. | [`RefundsGetResponse403JsonException`](../../doc/models/refunds-get-response-403-json-exception.md) |
| 404 | The request failed because the resource does not exist. | [`RefundsGetResponse404JsonException`](../../doc/models/refunds-get-response-404-json-exception.md) |
| 500 | The request failed because an internal server error occurred. | `ApiException` |
| Default | The default response. | `ApiException` |

