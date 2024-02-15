
# M500 Error Error Exception

Error response for 500

## Structure

`M500ErrorErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error500NameEnum`](../../doc/models/error-500-name-enum.md) | Optional | - | Error500NameEnum getName() | setName(Error500NameEnum name) |
| `Message` | [`Error500MessageEnum`](../../doc/models/error-500-message-enum.md) | Optional | - | Error500MessageEnum getMessageField() | setMessageField(Error500MessageEnum messageField) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | [`Error500InformationLinkEnum`](../../doc/models/error-500-information-link-enum.md) | Optional | The information link, or URI, that shows detailed information about this error for the developer. | Error500InformationLinkEnum getInformationLink() | setInformationLink(Error500InformationLinkEnum informationLink) |

## Example (as JSON)

```json
{
  "name": "INTERNAL_SERVER_ERROR",
  "message": "An internal server error occurred.",
  "debug_id": "90957fca61718",
  "information_link": "https://developer.paypal.com/api/orders/v2/#error-INTERNAL_SERVER_ERROR"
}
```

