
# INVALIDEXPIRYDATEERROR

## Structure

`INVALIDEXPIRYDATEERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidExpiryDate1IssueEnum`](../../doc/models/invalid-expiry-date-1-issue-enum.md) | Optional | - | InvalidExpiryDate1IssueEnum getIssue() | setIssue(InvalidExpiryDate1IssueEnum issue) |
| `Description` | [`InvalidExpiryDate1DescriptionEnum`](../../doc/models/invalid-expiry-date-1-description-enum.md) | Optional | - | InvalidExpiryDate1DescriptionEnum getDescription() | setDescription(InvalidExpiryDate1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_EXPIRY_DATE",
  "description": "Expiry date is invalid. Expiry date should be a date in future and within the threshold for the payment source."
}
```

