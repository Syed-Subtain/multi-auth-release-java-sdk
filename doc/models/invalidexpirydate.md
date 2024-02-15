
# INVALIDEXPIRYDATE

## Structure

`INVALIDEXPIRYDATE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidExpiryDateIssueEnum`](../../doc/models/invalid-expiry-date-issue-enum.md) | Optional | - | InvalidExpiryDateIssueEnum getIssue() | setIssue(InvalidExpiryDateIssueEnum issue) |
| `Description` | [`InvalidExpiryDateDescriptionEnum`](../../doc/models/invalid-expiry-date-description-enum.md) | Optional | - | InvalidExpiryDateDescriptionEnum getDescription() | setDescription(InvalidExpiryDateDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_EXPIRY_DATE",
  "description": "Expiry date is invalid. Expiry date should be a date in future and within the threshold for the payment source."
}
```

