
# NOTENABLEDTOVAULTPAYMENTSOURCEERROR

## Structure

`NOTENABLEDTOVAULTPAYMENTSOURCEERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEnabledToVaultPaymentSource1IssueEnum`](../../doc/models/not-enabled-to-vault-payment-source-1-issue-enum.md) | Optional | - | NotEnabledToVaultPaymentSource1IssueEnum getIssue() | setIssue(NotEnabledToVaultPaymentSource1IssueEnum issue) |
| `Description` | [`NotEnabledToVaultPaymentSource1DescriptionEnum`](../../doc/models/not-enabled-to-vault-payment-source-1-description-enum.md) | Optional | - | NotEnabledToVaultPaymentSource1DescriptionEnum getDescription() | setDescription(NotEnabledToVaultPaymentSource1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ENABLED_TO_VAULT_PAYMENT_SOURCE",
  "description": "The API caller or the merchant on whose behalf the API call is initiated is not allowed to vault the given source. Please contact PayPal customer support for assistance."
}
```

