
# NOTENABLEDTOVAULTPAYMENTSOURCE

## Structure

`NOTENABLEDTOVAULTPAYMENTSOURCE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`NotEnabledToVaultPaymentSourceIssueEnum`](../../doc/models/not-enabled-to-vault-payment-source-issue-enum.md) | Optional | - | NotEnabledToVaultPaymentSourceIssueEnum getIssue() | setIssue(NotEnabledToVaultPaymentSourceIssueEnum issue) |
| `Description` | [`NotEnabledToVaultPaymentSourceDescriptionEnum`](../../doc/models/not-enabled-to-vault-payment-source-description-enum.md) | Optional | - | NotEnabledToVaultPaymentSourceDescriptionEnum getDescription() | setDescription(NotEnabledToVaultPaymentSourceDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "NOT_ENABLED_TO_VAULT_PAYMENT_SOURCE",
  "description": "The API caller or the merchant on whose behalf the API call is initiated is not allowed to vault the given source. Please contact PayPal customer support for assistance."
}
```

