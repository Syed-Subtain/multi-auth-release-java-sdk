
# Orders Trackers Patch Response 404 Json Exception

## Structure

`OrdersTrackersPatchResponse404JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error404NameEnum`](../../doc/models/error-404-name-enum.md) | Optional | - | Error404NameEnum getName() | setName(Error404NameEnum name) |
| `Message` | [`Error404MessageEnum`](../../doc/models/error-404-message-enum.md) | Optional | - | Error404MessageEnum getMessageField() | setMessageField(Error404MessageEnum messageField) |
| `Issues` | [`List<ErrorDetails29>`](../../doc/models/error-details-29.md) | Optional | - | List<ErrorDetails29> getIssues() | setIssues(List<ErrorDetails29> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "RESOURCE_NOT_FOUND",
  "message": "The specified resource does not exist.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "Specified tracker ID does not exist. Check the tracker ID and try again."
    },
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "Specified tracker ID does not exist. Check the tracker ID and try again."
    }
  ],
  "debug_id": "debug_id8",
  "information_link": "information_link4"
}
```

