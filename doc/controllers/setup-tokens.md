# Setup-Tokens

Use the `/vault/setup-tokens` resource to create and retrieve temporary vault payment methods.

```java
SetupTokensController setupTokensController = client.getSetupTokensController();
```

## Class Name

`SetupTokensController`

## Methods

* [Setup-Tokens Create](../../doc/controllers/setup-tokens.md#setup-tokens-create)
* [Setup-Tokens Get](../../doc/controllers/setup-tokens.md#setup-tokens-get)


# Setup-Tokens Create

Creates a Setup Token from the given payment source and adds it to the Vault of the associated customer.

```java
CompletableFuture<MinimalSetupToken> setupTokensCreateAsync(
    final String payPalRequestId,
    final SetupToken body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `payPalRequestId` | `String` | Header, Required | The server stores keys for 3 hours. |
| `body` | [`SetupToken`](../../doc/models/setup-token.md) | Body, Required | Setup Token creation with a instrument type optional financial instrument details and customer_id. |

## Server

`Server.DEFAULT1`

## Requires scope

### Oauth21

`https://uri.paypal.com/services/vault/payment-tokens/read`

## Response Type

[`MinimalSetupToken`](../../doc/models/minimal-setup-token.md)

## Example Usage

```java
String payPalRequestId = "PayPal-Request-Id6";
SetupToken body = new SetupToken.Builder(
    new SetupTokenRequestPaymentSource.Builder()
        .card(new CardRequest1.Builder()
            .name("John Doe")
            .number("4111111111111111")
            .expiry("2027-02")
            .billingAddress(new PortablePostalAddressMediumGrained.Builder(
                "US"
            )
            .addressLine1("2211 N First Street")
            .addressLine2("17.3.160")
            .adminArea2("San Jose")
            .adminArea1("CA")
            .postalCode("95131")
            .build())
            .experienceContext(new ExperienceContext1.Builder()
                .brandName("YourBrandName")
                .locale("en-US")
                .returnUrl("https://example.com/returnUrl")
                .cancelUrl("https://example.com/cancelUrl")
                .build())
            .build())
        .build()
)
.build();

setupTokensController.setupTokensCreateAsync(payPalRequestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "5C991763VB2781612",
  "customer": {
    "id": "customer_4029352050"
  },
  "status": "APPROVED",
  "payment_source": {
    "card": {
      "last_digits": "1111",
      "expiry": "2027-02",
      "name": "John Doe",
      "billing_address": {
        "address_line_1": "2211 N First Street",
        "address_line_2": "17.3.160",
        "admin_area_1": "CA",
        "admin_area_2": "San Jose",
        "postal_code": "95131",
        "country_code": "US"
      }
    }
  },
  "links": [
    {
      "rel": "self",
      "href": "https://api-m.paypal.com/v3/vault/setup-tokens/5C991763VB2781612",
      "method": "GET",
      "encType": "application/json"
    },
    {
      "rel": "confirm",
      "href": "https://api-m.paypal.com/v3/vault/payment-token",
      "method": "POST",
      "encType": "application/json"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# Setup-Tokens Get

Returns a readable representation of temporarily vaulted payment source associated with the setup token id.

```java
CompletableFuture<MinimalSetupToken> setupTokensGetAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | A representation of a vault token. |

## Server

`Server.DEFAULT1`

## Requires scope

### Oauth21

`https://uri.paypal.com/services/vault/payment-tokens/read`

## Response Type

[`MinimalSetupToken`](../../doc/models/minimal-setup-token.md)

## Example Usage

```java
String id = "id0";

setupTokensController.setupTokensGetAsync(id).thenAccept(result -> {
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
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |

