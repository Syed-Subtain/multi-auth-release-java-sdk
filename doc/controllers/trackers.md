# Trackers

Use the `/trackers` resource to update and retrieve tracking information for PayPal orders.

```java
TrackersController trackersController = client.getTrackersController();
```

## Class Name

`TrackersController`


# Orders Trackers Patch

Updates or cancels the tracking information for a PayPal order, by ID. Updatable attributes or objects:<br/><br/><table><thead><th>Attribute</th><th>Op</th><th>Notes</th></thead><tbody></tr><tr><td><code>items</code></td><td>replace</td><td>Using replace op for <code>items</code> will replace the entire <code>items</code> object with the value sent in request.</td></tr><tr><td><code>notify_payer</code></td><td>replace, add</td><td></td></tr><tr><td><code>status</code></td><td>replace</td><td>Only patching status to CANCELLED is currently supported.</td></tr></tbody></table>

```java
CompletableFuture<Void> ordersTrackersPatchAsync(
    final String id,
    final String trackerId,
    final List<Patch> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to update payment details. |
| `trackerId` | `String` | Template, Required | The order tracking ID. |
| `body` | [`List<Patch>`](../../doc/models/patch.md) | Body, Optional | - |

## Requires scope

### Oauth2

`https://uri.paypal.com/services/payments/payment`

## Response Type

`void`

## Example Usage

```java
String id = "id0";
String trackerId = "tracker_id2";
List<Patch> body = Arrays.asList(
    new Patch.Builder(
        PatchOpEnum.REPLACE
    )
    .path("/purchase_units/@reference_id=='PUHF'/shipping/address")
    .value(ApiHelper.deserialize("{\"address_line_1\":\"2211 N First Street\",\"address_line_2\":\"Building 17\",\"admin_area_2\":\"San Jose\",\"admin_area_1\":\"CA\",\"postal_code\":\"95131\",\"country_code\":\"US\"}"))
    .build()
);

trackersController.ordersTrackersPatchAsync(id, trackerId, body).thenAccept(result -> {
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
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`OrdersTrackersPatchResponse400JsonException`](../../doc/models/orders-trackers-patch-response-400-json-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`OrdersTrackersPatchResponse403JsonException`](../../doc/models/orders-trackers-patch-response-403-json-exception.md) |
| 404 | The specified resource does not exist. | [`OrdersTrackersPatchResponse404JsonException`](../../doc/models/orders-trackers-patch-response-404-json-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`OrdersTrackersPatchResponse422JsonException`](../../doc/models/orders-trackers-patch-response-422-json-exception.md) |
| 500 | An internal server error has occurred. | [`M500ErrorErrorException`](../../doc/models/m500-error-error-exception.md) |
| Default | The default response. | `ApiException` |

