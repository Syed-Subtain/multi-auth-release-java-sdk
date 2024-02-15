
# M503 Error

Error response for 503

## Structure

`M503Error`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error503NameEnum`](../../doc/models/error-503-name-enum.md) | Optional | - | Error503NameEnum getName() | setName(Error503NameEnum name) |
| `Message` | [`Error503MessageEnum`](../../doc/models/error-503-message-enum.md) | Optional | - | Error503MessageEnum getMessage() | setMessage(Error503MessageEnum message) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "SERVICE_UNAVAILABLE",
  "message": "Service Unavailable.",
  "debug_id": "90957fca61718",
  "information_link": "https://developer.paypal.com/docs/api/orders/v2/#error-SERVICE_UNAVAILABLE"
}
```

