
# OAuth 2 Client Credentials Grant



Documentation for accessing and setting credentials for Oauth2.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| OAuthClientId | `String` | OAuth 2 Client ID | `oAuthClientId` | `getOAuthClientId()` |
| OAuthClientSecret | `String` | OAuth 2 Client Secret | `oAuthClientSecret` | `getOAuthClientSecret()` |
| OAuthToken | `OAuthToken` | Object for storing information about the OAuth token | `oAuthToken` | `getOAuthToken()` |
| OAuthScopes | `List<OAuthScopeOauth2Enum>` | List of scopes that apply to the OAuth token | `oAuthScopes` | `getOAuthScopes()` |



**Note:** Auth credentials can be set using `oauth2Credentials` in the client builder and accessed through `getOauth2Credentials` method in the client instance.

## Usage Example

### Client Initialization

You must initialize the client with *OAuth 2.0 Client Credentials Grant* credentials as shown in the following code snippet.

```java
PaypalMergedAPIClient client = new PaypalMergedAPIClient.Builder()
    .oauth2Credentials(new Oauth2Model.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScopeOauth2Enum.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT,
                OAuthScopeOauth2Enum.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_REFERENCE_TRANSACTION
            ))
        .build())
    .build();
```



Your application must obtain user authorization before it can execute an endpoint call in case this SDK chooses to use *OAuth 2.0 Client Credentials Grant*. This authorization includes the following steps

The `fetchToken()` method will exchange the OAuth client credentials for an *access token*. The access token is an object containing information for authorizing client requests and refreshing the token itself.

You must have initialized the client with scopes for which you need permission to access.

```java
try {
    OAuthToken token = client.getOauth2Credentials().fetchToken();
    // re-instantiate the client with oauth token
    client = client.newBuilder()
            .oauth2Credentials(client.getOauth2Model().toBuilder()
                    .oAuthToken(token)
                    .build())
            .build();
} catch (Throwable e) {
    // TODO Handle exception
}
```

The client can now make authorized endpoint calls.

### Scopes

Scopes enable your application to only request access to the resources it needs while enabling users to control the amount of access they grant to your application. Available scopes are defined in the [`OAuthScopeOauth2Enum`](../../doc/models/o-auth-scope-oauth-2-enum.md) enumeration.

| Scope Name | Description |
|  --- | --- |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT` | Manage payments and checkout workflow. |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_REFERENCE_TRANSACTION` | Permission to initiate reference transaction |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_INITIATEPAYMENT` | Initiates payments and checkout workflows. |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_ORDERS_CLIENT_SIDE_INTEGRATION` | Allows client-side integration on Create, Get, Patch, Authorize & Capture Order endpoints. |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_AUTHCAPTURE` | Permission to do non-real time payments like capture on authorization |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_REFUND` | Permission to initiate a refund on a capture transaction |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_NON_REFERENCED_CREDIT` | Permission to initiate non referenced credit |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_REALTIMEPAYMENT` | Permission to do any real time payment, with support for sale/authorize/order intents |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_REVERSEPAYMENT` | Permission to do any reverse payment |

### Storing an access token for reuse

It is recommended that you store the access token for reuse.

```java
// store token
storeAccessToken(client.getOauth2Credentials().getOAuthToken());
```

### Creating a client from a stored token

To authorize a client from a stored access token, just set the access token in Configuration along with the other configuration parameters before creating the client:

```java
// load token later...
OAuthToken token = loadAccessToken();

// re-instantiate the client with oauth token
client = client.newBuilder()
        .oauth2Credentials(client.getOauth2Model().toBuilder()
                .oAuthToken(token)
                .build())
        .build();
```

### Complete example



```java
package com.example;

import com.paypal.sandbox.apim.models.OAuthScopeEnum;
import java.util.Arrays;

public class Main {
    public Main() {
        PaypalMergedAPIClient client = new PaypalMergedAPIClient.Builder()
            .oauth2Credentials(new Oauth2Model.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .oAuthScopes(Arrays.asList(
                        OAuthScopeOauth2Enum.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT,
                        OAuthScopeOauth2Enum.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_REFERENCE_TRANSACTION
                    ))
                .build())
            .build();


        try {
            OAuthToken token = client.getOauth2Credentials().fetchToken();
            // re-instantiate the client with oauth token
            client = client.newBuilder()
                    .oauth2Credentials(client.getOauth2Model().toBuilder()
                            .oAuthToken(token)
                            .build())
                    .build();
        } catch (Throwable e) {
            // TODO Handle exception
        }

        // the client is now authorized; you can use client to make endpoint calls
    }
}
```


