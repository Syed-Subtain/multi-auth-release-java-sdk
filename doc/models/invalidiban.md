
# INVALIDIBAN

## Structure

`INVALIDIBAN`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidIbanIssueEnum`](../../doc/models/invalid-iban-issue-enum.md) | Optional | - | InvalidIbanIssueEnum getIssue() | setIssue(InvalidIbanIssueEnum issue) |
| `Description` | [`InvalidIbanDescriptionEnum`](../../doc/models/invalid-iban-description-enum.md) | Optional | - | InvalidIbanDescriptionEnum getDescription() | setDescription(InvalidIbanDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_IBAN",
  "description": "IBAN provided is not a valid bank account number."
}
```

