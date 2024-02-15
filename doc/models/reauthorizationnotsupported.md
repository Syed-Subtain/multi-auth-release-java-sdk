
# REAUTHORIZATIONNOTSUPPORTED

## Structure

`REAUTHORIZATIONNOTSUPPORTED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ReauthorizationNotSupportedIssueEnum`](../../doc/models/reauthorization-not-supported-issue-enum.md) | Optional | - | ReauthorizationNotSupportedIssueEnum getIssue() | setIssue(ReauthorizationNotSupportedIssueEnum issue) |
| `Description` | [`ReauthorizationNotSupportedDescriptionEnum`](../../doc/models/reauthorization-not-supported-description-enum.md) | Optional | - | ReauthorizationNotSupportedDescriptionEnum getDescription() | setDescription(ReauthorizationNotSupportedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "REAUTHORIZATION_NOT_SUPPORTED",
  "description": "A reauthorize cannot be attempted on an authorization_id that is the result of a prior reauthorization or on an authorization made on an Order saved using the `v2/orders/id/save` API."
}
```

