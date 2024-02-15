
# INVALIDIBANERROR

## Structure

`INVALIDIBANERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`InvalidIban1IssueEnum`](../../doc/models/invalid-iban-1-issue-enum.md) | Optional | - | InvalidIban1IssueEnum getIssue() | setIssue(InvalidIban1IssueEnum issue) |
| `Description` | [`InvalidIban1DescriptionEnum`](../../doc/models/invalid-iban-1-description-enum.md) | Optional | - | InvalidIban1DescriptionEnum getDescription() | setDescription(InvalidIban1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "INVALID_IBAN",
  "description": "IBAN provided is not a valid bank account number."
}
```

