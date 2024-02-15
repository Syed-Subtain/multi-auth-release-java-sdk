# Payment-Tokens

Use the `/vault/payment-tokens` resource to create, retrieve, and delete a payment token that may optionally be associated with a customer.

```java
PaymentTokensController paymentTokensController = client.getPaymentTokensController();
```

## Class Name

`PaymentTokensController`

## Methods

* [Payment-Tokens Create](../../doc/controllers/payment-tokens.md#payment-tokens-create)
* [Customer Payment-Tokens Get](../../doc/controllers/payment-tokens.md#customer-payment-tokens-get)
* [Payment-Tokens Delete](../../doc/controllers/payment-tokens.md#payment-tokens-delete)
* [Payment-Tokens Get](../../doc/controllers/payment-tokens.md#payment-tokens-get)


# Payment-Tokens Create

Creates a Payment Token from the given payment source and adds it to the Vault of the associated customer.

```java
CompletableFuture<PaymentTokenResponse> paymentTokensCreateAsync(
    final String payPalRequestId,
    final PaymentTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `payPalRequestId` | `String` | Header, Required | The server stores keys for 3 hours. |
| `body` | [`PaymentTokenRequest`](../../doc/models/payment-token-request.md) | Body, Required | Payment Token creation with a financial instrument and an optional customer_id. |

## Server

`Server.DEFAULT1`

## Requires scope

### Oauth21

`https://uri.paypal.com/services/vault/payment-tokens/readwrite`

## Response Type

[`PaymentTokenResponse`](../../doc/models/payment-token-response.md)

## Example Usage

```java
String payPalRequestId = "PayPal-Request-Id6";
PaymentTokenRequest body = new PaymentTokenRequest.Builder(
    new PaymentSourceRequest.Builder()
        .token(new TokenRequest.Builder(
            "5C991763VB2781612",
            "BILLING_AGREEMENT"
        )
        .build())
        .build()
)
.build();

paymentTokensController.paymentTokensCreateAsync(payPalRequestId, body).thenAccept(result -> {
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
  "id": "8kk8451t",
  "customer": {
    "id": "customer_4029352050"
  },
  "payment_source": {
    "card": {
      "last_digits": "1111",
      "expiry": "2027-02",
      "brand": "VISA",
      "name": "John Doe",
      "billing_address": {
        "address_line_1": "2211 N First Street",
        "address_line_2": "17.3.160",
        "admin_area_2": "San Jose",
        "admin_area_1": "CA",
        "postal_code": "95131",
        "country_code": "US"
      }
    }
  },
  "links": [
    {
      "rel": "self",
      "href": "https://api-m.paypal.com/v3/vault/payment-tokens/8kk8451t",
      "method": "GET",
      "encType": "application/json"
    },
    {
      "rel": "delete",
      "href": "https://api-m.paypal.com/v3/vault/payment-tokens/8kk8451t",
      "method": "DELETE",
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
| 404 | Request contains reference to resources that do not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# Customer Payment-Tokens Get

Returns all payment tokens for a customer.

```java
CompletableFuture<VaultOfACustomer> customerPaymentTokensGetAsync(
    final String customerId,
    final Integer pageSize,
    final Integer page,
    final Boolean totalRequired)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Query, Required | A unique identifier representing a specific customer in merchant's/partner's system or records. |
| `pageSize` | `Integer` | Query, Optional | A non-negative, non-zero integer indicating the maximum number of results to return at one time. |
| `page` | `Integer` | Query, Optional | A non-negative, non-zero integer representing the page of the results. |
| `totalRequired` | `Boolean` | Query, Optional | A boolean indicating total number of items (total_items) and pages (total_pages) are expected to be returned in the response. |

## Server

`Server.DEFAULT1`

## Requires scope

### Oauth21

`https://uri.paypal.com/services/vault/payment-tokens/readwrite`

## Response Type

[`VaultOfACustomer`](../../doc/models/vault-of-a-customer.md)

## Example Usage

```java
String customerId = "customer_id8";
Integer pageSize = 5;
Integer page = 1;
Boolean totalRequired = false;

paymentTokensController.customerPaymentTokensGetAsync(customerId, pageSize, page, totalRequired).thenAccept(result -> {
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
  "customer": {
    "id": "customer_4029352050"
  },
  "payment_tokens": [
    {
      "id": "8kk8451t",
      "customer": {
        "id": "customer_4029352050"
      },
      "payment_source": {
        "card": {
          "brand": "VISA",
          "last_digits": "1111",
          "expiry": "2027-02",
          "name": "John Doe",
          "billing_address": {
            "address_line_1": "2211 N First Street",
            "address_line_2": "17.3.160",
            "admin_area_2": "San Jose",
            "admin_area_1": "CA",
            "postal_code": "95131",
            "country_code": "US"
          }
        }
      },
      "links": [
        {
          "rel": "self",
          "href": "https://api-m.paypal.com/v3/vault/payment-tokens/8kk8451t",
          "method": "GET",
          "encType": "application/json"
        },
        {
          "rel": "delete",
          "href": "https://api-m.paypal.com/v3/vault/payment-tokens/8kk8451t",
          "method": "DELETE",
          "encType": "application/json"
        }
      ]
    },
    {
      "id": "fgh6561t",
      "customer": {
        "id": "customer_4029352050"
      },
      "payment_source": {
        "paypal": {
          "description": "Description for PayPal to be shown to PayPal payer",
          "email_address": "john.doe@example.com",
          "account_id": "VYYFH3WJ4JPJQ",
          "shipping": {
            "name": {
              "full_name": "John Doe"
            },
            "address": {
              "address_line_1": "2211 N First Street",
              "address_line_2": "17.3.160",
              "admin_area_2": "San Jose",
              "admin_area_1": "CA",
              "postal_code": "95131",
              "country_code": "US"
            }
          },
          "usage_pattern": "IMMEDIATE",
          "usage_type": "MERCHANT",
          "customer_type": "CONSUMER",
          "name": {
            "given_name": "John",
            "surname": "Doe"
          },
          "address": {
            "address_line_1": "2211 N First Street",
            "address_line_2": "17.3.160",
            "admin_area_2": "San Jose",
            "admin_area_1": "CA",
            "postal_code": "95131",
            "country_code": "US"
          }
        }
      },
      "links": [
        {
          "rel": "self",
          "href": "https://api-m.paypal.com/v3/vault/payment-tokens/fgh6561t",
          "method": "GET",
          "encType": "application/json"
        },
        {
          "rel": "delete",
          "href": "https://api-m.paypal.com/v3/vault/payment-tokens/fgh6561t",
          "method": "DELETE",
          "encType": "application/json"
        }
      ]
    },
    {
      "id": "hg654s1t",
      "customer": {
        "id": "customer_4029352050"
      },
      "payment_source": {
        "venmo": {
          "description": "Description for Venmo to be shown to Venmo payer",
          "shipping": {
            "name": {
              "full_name": "John Doe"
            },
            "address": {
              "address_line_1": "2211 N First Street",
              "address_line_2": "17.3.160",
              "admin_area_2": "San Jose",
              "admin_area_1": "CA",
              "postal_code": "95131",
              "country_code": "US"
            }
          },
          "usage_pattern": "IMMEDIATE",
          "usage_type": "MERCHANT",
          "customer_type": "CONSUMER",
          "email_address": "john.doe@example.com",
          "user_name": "johndoe",
          "name": {
            "given_name": "John",
            "surname": "Doe"
          },
          "account_id": "VYYFH3WJ4JPJQ",
          "address": {
            "address_line_1": "PayPal",
            "address_line_2": "2211 North 1st Street",
            "admin_area_1": "CA",
            "admin_area_2": "San Jose",
            "postal_code": "96112",
            "country_code": "US"
          }
        }
      },
      "links": [
        {
          "rel": "self",
          "href": "https://api-m.paypal.com/v3/vault/payment-tokens/hg654s1t",
          "method": "GET",
          "encType": "application/json"
        },
        {
          "rel": "delete",
          "href": "https://api-m.paypal.com/v3/vault/payment-tokens/hg654s1t",
          "method": "DELETE",
          "encType": "application/json"
        }
      ]
    }
  ],
  "links": [
    {
      "rel": "self",
      "href": "https://api-m.paypal.com/v3/vault/payment-tokens?customer_id=customer_4029352050&page=1&page_size=5&total_required=false",
      "method": "GET",
      "encType": "application/json"
    },
    {
      "rel": "first",
      "href": "https://api-m.paypal.com/v3/vault/payment-tokens?customer_id=customer_4029352050&page=1&page_size=5&total_required=false",
      "method": "GET",
      "encType": "application/json"
    },
    {
      "rel": "last",
      "href": "https://api-m.paypal.com/v3/vault/payment-tokens?customer_id=customer_4029352050&page=1&page_size=5&total_required=false",
      "method": "GET",
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
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# Payment-Tokens Delete

Delete the payment token associated with the payment token id.

```java
CompletableFuture<Void> paymentTokensDeleteAsync(
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

`https://uri.paypal.com/services/vault/payment-tokens/readwrite`

## Response Type

`void`

## Example Usage

```java
String id = "id0";

paymentTokensController.paymentTokensDeleteAsync(id).thenAccept(result -> {
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
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# Payment-Tokens Get

Returns a readable representation of vaulted payment source associated with the payment token id.

```java
CompletableFuture<PaymentTokenResponse> paymentTokensGetAsync(
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

`https://uri.paypal.com/services/vault/payment-tokens/readwrite`

## Response Type

[`PaymentTokenResponse`](../../doc/models/payment-token-response.md)

## Example Usage

```java
String id = "id0";

paymentTokensController.paymentTokensGetAsync(id).thenAccept(result -> {
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

