
# Authorizations Reauthorize Response 400 Json Exception

## Structure

`AuthorizationsReauthorizeResponse400JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error400NameEnum`](../../doc/models/error-400-name-enum.md) | Optional | - | Error400NameEnum getName() | setName(Error400NameEnum name) |
| `Message` | [`Error400MessageEnum`](../../doc/models/error-400-message-enum.md) | Optional | - | Error400MessageEnum getMessageField() | setMessageField(Error400MessageEnum messageField) |
| `Issues` | [`List<ErrorDetails7>`](../../doc/models/error-details-7.md) | Optional | - | List<ErrorDetails7> getIssues() | setIssues(List<ErrorDetails7> issues) |
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
      "description": "A required field / parameter is missing."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "A required field / parameter is missing."
    }
  ],
  "debug_id": "debug_id8",
  "information_link": "information_link2"
}
```

