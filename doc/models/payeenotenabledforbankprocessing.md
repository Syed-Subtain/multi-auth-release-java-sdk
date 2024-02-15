
# PAYEENOTENABLEDFORBANKPROCESSING

## Structure

`PAYEENOTENABLEDFORBANKPROCESSING`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`PayeeNotEnabledForBankProcessingIssueEnum`](../../doc/models/payee-not-enabled-for-bank-processing-issue-enum.md) | Optional | - | PayeeNotEnabledForBankProcessingIssueEnum getIssue() | setIssue(PayeeNotEnabledForBankProcessingIssueEnum issue) |
| `Description` | [`PayeeNotEnabledForBankProcessingDescriptionEnum`](../../doc/models/payee-not-enabled-for-bank-processing-description-enum.md) | Optional | - | PayeeNotEnabledForBankProcessingDescriptionEnum getDescription() | setDescription(PayeeNotEnabledForBankProcessingDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "PAYEE_NOT_ENABLED_FOR_BANK_PROCESSING",
  "description": "Payee account is not setup to be able to process bank payments. Please contact your PayPal account manager."
}
```

