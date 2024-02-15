
# Shipping With Tracking Details Allof 1

## Structure

`ShippingWithTrackingDetailsAllof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Trackers` | [`List<OrderTrackerResponse>`](../../doc/models/order-tracker-response.md) | Optional | An array of trackers for a transaction. | List<OrderTrackerResponse> getTrackers() | setTrackers(List<OrderTrackerResponse> trackers) |

## Example (as JSON)

```json
{
  "trackers": [
    {
      "id": "id2",
      "status": {
        "key1": "val1",
        "key2": "val2"
      },
      "items": [
        {
          "name": "name8",
          "quantity": "quantity4",
          "sku": "sku6",
          "image_url": "image_url4",
          "upc": {
            "key1": "val1",
            "key2": "val2"
          }
        }
      ],
      "links": [
        {
          "href": "href6",
          "rel": "rel0",
          "method": "HEAD"
        },
        {
          "href": "href6",
          "rel": "rel0",
          "method": "HEAD"
        }
      ],
      "create_time": "create_time8"
    }
  ]
}
```

