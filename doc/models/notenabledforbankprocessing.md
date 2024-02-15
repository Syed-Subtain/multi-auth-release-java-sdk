
# NOTENABLEDFORBANKPROCESSING

## Structure

`NOTENABLEDFORBANKPROCESSING`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEnabledForBankProcessingIssueEnum`](../../doc/models/not-enabled-for-bank-processing-issue-enum.md) | Optional | - | NotEnabledForBankProcessingIssueEnum getIssue() | setIssue(NotEnabledForBankProcessingIssueEnum issue) |
| `Description` | [`NotEnabledForBankProcessingDescriptionEnum`](../../doc/models/not-enabled-for-bank-processing-description-enum.md) | Optional | - | NotEnabledForBankProcessingDescriptionEnum getDescription() | setDescription(NotEnabledForBankProcessingDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ENABLED_FOR_BANK_PROCESSING",
  "description": "The API Caller account is not setup to be able to process bank payments. Please contact your PayPal account manager."
}
```

