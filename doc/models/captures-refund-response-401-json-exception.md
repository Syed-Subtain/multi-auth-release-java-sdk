
# Captures Refund Response 401 Json Exception

## Structure

`CapturesRefundResponse401JsonException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`Error401NameEnum`](../../doc/models/error-401-name-enum.md) | Optional | - | Error401NameEnum getName() | setName(Error401NameEnum name) |
| `Message` | [`Error401MessageEnum`](../../doc/models/error-401-message-enum.md) | Optional | - | Error401MessageEnum getMessageField() | setMessageField(Error401MessageEnum messageField) |
| `Issues` | [`List<ErrorDetails2>`](../../doc/models/error-details-2.md) | Optional | - | List<ErrorDetails2> getIssues() | setIssues(List<ErrorDetails2> issues) |
| `DebugId` | `String` | Optional | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |

## Example (as JSON)

```json
{
  "name": "AUTHENTICATION_FAILURE",
  "message": "Authentication failed due to missing authorization header, or invalid authentication credentials.",
  "issues": [
    {
      "field": "field2",
      "value": "value0",
      "location": "location2",
      "issue": "issue4",
      "description": "Account validations failed for the user."
    }
  ],
  "debug_id": "debug_id6",
  "information_link": "information_link2"
}
```

