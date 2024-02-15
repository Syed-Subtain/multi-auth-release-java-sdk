
# Orders Authorize Response 422 Json Exception

## Structure

`OrdersAuthorizeResponse422JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error422NameEnum`](../../doc/models/error-422-name-enum.md) | Optional | - | Error422NameEnum getName() | setName(Error422NameEnum name) |
| `Message` | [`Error422MessageEnum`](../../doc/models/error-422-message-enum.md) | Optional | - | Error422MessageEnum getMessageField() | setMessageField(Error422MessageEnum messageField) |
| `Issues` | [`List<ErrorDetails17>`](../../doc/models/error-details-17.md) | Optional | - | List<ErrorDetails17> getIssues() | setIssues(List<ErrorDetails17> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "UNPROCESSABLE_ENTITY",
  "message": "The requested action could not be performed, semantically incorrect, or failed business validation.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "Order was created with an intent to 'CAPTURE'. Please use v2/checkout/orders/order_id/capture to complete the transaction or alternately Create an order with an intent of 'AUTHORIZE'."
    }
  ],
  "debug_id": "debug_id6",
  "information_link": "information_link0"
}
```

