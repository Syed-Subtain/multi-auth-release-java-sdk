
# Getting Started with Paypal Merged API

## Introduction

An order represents a payment between two or more parties. Use the Orders API to create, update, retrieve, authorize, and capture orders.

Find out more here: [https://developer.paypal.com/docs/api/orders/v2/](https://developer.paypal.com/docs/api/orders/v2/)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.apimatic</groupId>
  <artifactId>multi-auth-release-sdk</artifactId>
  <version>1.1.1</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/io.apimatic/multi-auth-release-sdk/1.1.1

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/http-client-configuration.md) | Http Client Configuration instance. |
| `oauth2Credentials` | [`Oauth2Credentials`](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/$a/https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |
| `oauth21Credentials` | [`Oauth21Credentials`](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/$a/https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/oauth-2-client-credentials-grant-1.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
PaypalMergedAPIClient client = new PaypalMergedAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .oauth2Credentials(new Oauth2Model.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScopeOauth2Enum.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT,
                OAuthScopeOauth2Enum.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_REFERENCE_TRANSACTION
            ))
        .build())
    .oauth21Credentials(new Oauth21Model.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScopeOauth21Enum.HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READWRITE,
                OAuthScopeOauth21Enum.HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READ
            ))
        .build())
    .environment(Environment.PRODUCTION)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | **Default** PayPal Sandbox Environment |
| environment2 | PayPal Live Environment |

## Authorization

This API uses the following authentication schemes.

* [`Oauth2 (OAuth 2 Client Credentials Grant)`](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/$a/https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/oauth-2-client-credentials-grant.md)
* [`Oauth21 (OAuth 2 Client Credentials Grant)`](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/$a/https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/oauth-2-client-credentials-grant-1.md)

## List of APIs

* [O Auth Authorization](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/controllers/o-auth-authorization.md)
* [Orders](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/controllers/orders.md)
* [Trackers](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/controllers/trackers.md)
* [Authorizations](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/controllers/authorizations.md)
* [Captures](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/controllers/captures.md)
* [Refunds](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/controllers/refunds.md)
* [Payment-Tokens](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/controllers/payment-tokens.md)
* [Setup-Tokens](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/controllers/setup-tokens.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/http-request.md)
* [HttpResponse](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/http-string-response.md)
* [HttpContext](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/http-body-request.md)
* [Headers](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/headers.md)
* [ApiException](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/Syed-Subtain/multi-auth-release-java-sdk/tree/1.1.1/doc/http-client-configuration-builder.md)

