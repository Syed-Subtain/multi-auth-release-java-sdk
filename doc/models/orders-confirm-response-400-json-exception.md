
# Orders Confirm Response 400 Json Exception

## Structure

`OrdersConfirmResponse400JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error400NameEnum`](../../doc/models/error-400-name-enum.md) | Optional | - | Error400NameEnum getName() | setName(Error400NameEnum name) |
| `Message` | [`Error400MessageEnum`](../../doc/models/error-400-message-enum.md) | Optional | - | Error400MessageEnum getMessageField() | setMessageField(Error400MessageEnum messageField) |
| `Issues` | [`List<ErrorDetails10>`](../../doc/models/error-details-10.md) | Optional | - | List<ErrorDetails10> getIssues() | setIssues(List<ErrorDetails10> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "INVALID_REQUEST",
  "message": "Request is not well-formed, syntactically incorrect, or violates schema.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "The value of the field does not conform to the expected format."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "The value of the field does not conform to the expected format."
    }
  ],
  "debug_id": "debug_id2",
  "information_link": "information_link8"
}
```

