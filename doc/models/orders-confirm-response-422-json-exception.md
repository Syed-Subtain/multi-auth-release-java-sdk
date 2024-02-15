
# Orders Confirm Response 422 Json Exception

## Structure

`OrdersConfirmResponse422JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error422NameEnum`](../../doc/models/error-422-name-enum.md) | Optional | - | Error422NameEnum getName() | setName(Error422NameEnum name) |
| `Message` | [`Error422MessageEnum`](../../doc/models/error-422-message-enum.md) | Optional | - | Error422MessageEnum getMessageField() | setMessageField(Error422MessageEnum messageField) |
| `Issues` | [`List<ErrorDetails12>`](../../doc/models/error-details-12.md) | Optional | - | List<ErrorDetails12> getIssues() | setIssues(List<ErrorDetails12> issues) |
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
      "description": "Order already captured. If 'intent=CAPTURE' only one capture per order is allowed."
    }
  ],
  "debug_id": "debug_id2",
  "information_link": "information_link8"
}
```

