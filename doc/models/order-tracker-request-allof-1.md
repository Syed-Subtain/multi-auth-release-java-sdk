
# Order Tracker Request Allof 1

## Structure

`OrderTrackerRequestAllof1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CaptureId` | `String` | Required | The PayPal capture ID.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50`, *Pattern*: `^[a-zA-Z0-9]*$` | String getCaptureId() | setCaptureId(String captureId) |
| `NotifyPayer` | `Boolean` | Optional | If true, sends an email notification to the payer of the PayPal transaction. The email contains the tracking information that was uploaded through the API.<br>**Default**: `false` | Boolean getNotifyPayer() | setNotifyPayer(Boolean notifyPayer) |
| `Items` | [`List<TrackerItem>`](../../doc/models/tracker-item.md) | Optional | An array of details of items in the shipment. | List<TrackerItem> getItems() | setItems(List<TrackerItem> items) |

## Example (as JSON)

```json
{
  "capture_id": "capture_id8",
  "notify_payer": false,
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
    },
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
  ]
}
```

