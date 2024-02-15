
# M400 Error Error Exception

Error response for 400

## Structure

`M400ErrorErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error400NameEnum`](../../doc/models/error-400-name-enum.md) | Optional | - | Error400NameEnum getName() | setName(Error400NameEnum name) |
| `Message` | [`Error400MessageEnum`](../../doc/models/error-400-message-enum.md) | Optional | - | Error400MessageEnum getMessageField() | setMessageField(Error400MessageEnum messageField) |
| `Issues` | [`List<ErrorDetails>`](../../doc/models/error-details.md) | Optional | - | List<ErrorDetails> getIssues() | setIssues(List<ErrorDetails> issues) |
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
      "description": "description8"
    }
  ],
  "debug_id": "debug_id6",
  "information_link": "information_link2"
}
```

