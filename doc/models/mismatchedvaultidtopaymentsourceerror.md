
# MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR

## Structure

`MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MismatchedVaultIdToPaymentSource1IssueEnum`](../../doc/models/mismatched-vault-id-to-payment-source-1-issue-enum.md) | Optional | - | MismatchedVaultIdToPaymentSource1IssueEnum getIssue() | setIssue(MismatchedVaultIdToPaymentSource1IssueEnum issue) |
| `Description` | [`MismatchedVaultIdToPaymentSource1DescriptionEnum`](../../doc/models/mismatched-vault-id-to-payment-source-1-description-enum.md) | Optional | - | MismatchedVaultIdToPaymentSource1DescriptionEnum getDescription() | setDescription(MismatchedVaultIdToPaymentSource1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MISMATCHED_VAULT_ID_TO_PAYMENT_SOURCE",
  "description": "The vault_id does not match the payment_source provided. Please verify that the vault_id token used refers to the matching payment_source and try again. For example, a PayPal token cannot be passed in the vault_id field in the payment_source.card object."
}
```

