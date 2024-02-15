
# SETUPERRORFORBANK

## Structure

`SETUPERRORFORBANK`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`SetupErrorForBankIssueEnum`](../../doc/models/setup-error-for-bank-issue-enum.md) | Optional | - | SetupErrorForBankIssueEnum getIssue() | setIssue(SetupErrorForBankIssueEnum issue) |
| `Description` | [`SetupErrorForBankDescriptionEnum`](../../doc/models/setup-error-for-bank-description-enum.md) | Optional | - | SetupErrorForBankDescriptionEnum getDescription() | setDescription(SetupErrorForBankDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "SETUP_ERROR_FOR_BANK",
  "description": "The API Caller account setup, for bank payments, is incomplete or incorrect. Please contact your PayPal account manager."
}
```

