
# Captures Refund Response 409 Json Exception

## Structure

`CapturesRefundResponse409JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error409NameEnum`](../../doc/models/error-409-name-enum.md) | Optional | - | Error409NameEnum getName() | setName(Error409NameEnum name) |
| `Message` | [`Error409MessageEnum`](../../doc/models/error-409-message-enum.md) | Optional | - | Error409MessageEnum getMessageField() | setMessageField(Error409MessageEnum messageField) |
| `Issues` | [`List<ErrorDetails141>`](../../doc/models/error-details-141.md) | Optional | - | List<ErrorDetails141> getIssues() | setIssues(List<ErrorDetails141> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "RESOURCE_CONFLICT",
  "message": "The server has detected a conflict while processing this request.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "A previous request on this resource is currently in progress. Please wait for sometime and try again. It is best to space out the initial and the subsequent request(s) to avoid receiving this error."
    }
  ],
  "debug_id": "debug_id6",
  "information_link": "information_link0"
}
```

