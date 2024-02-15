
# Orders Capture Response 403 Json Exception

## Structure

`OrdersCaptureResponse403JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error403NameEnum`](../../doc/models/error-403-name-enum.md) | Optional | - | Error403NameEnum getName() | setName(Error403NameEnum name) |
| `Message` | [`Error403MessageEnum`](../../doc/models/error-403-message-enum.md) | Optional | - | Error403MessageEnum getMessageField() | setMessageField(Error403MessageEnum messageField) |
| `Issues` | [`List<ErrorDetails20>`](../../doc/models/error-details-20.md) | Optional | - | List<ErrorDetails20> getIssues() | setIssues(List<ErrorDetails20> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "NOT_AUTHORIZED",
  "message": "Authorization failed due to insufficient permissions.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "CONSENT_NEEDED"
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "CONSENT_NEEDED"
    }
  ],
  "debug_id": "debug_id0",
  "information_link": "information_link6"
}
```

