
# VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE

## Structure

`VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MismatchedVaultIdToPaymentSource3IssueEnum`](../../doc/models/mismatched-vault-id-to-payment-source-3-issue-enum.md) | Optional | - | MismatchedVaultIdToPaymentSource3IssueEnum getIssue() | setIssue(MismatchedVaultIdToPaymentSource3IssueEnum issue) |
| `Description` | [`MismatchedVaultIdToPaymentSource3DescriptionEnum`](../../doc/models/mismatched-vault-id-to-payment-source-3-description-enum.md) | Optional | - | MismatchedVaultIdToPaymentSource3DescriptionEnum getDescription() | setDescription(MismatchedVaultIdToPaymentSource3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MISMATCHED_VAULT_ID_TO_PAYMENT_SOURCE",
  "description": "The vault_id does not match the payment_source provided. Please verify that the vault_id token used refers to the matching payment_source and try again. For example, a PayPal token cannot be passed in the vault_id field in the payment_source.card object."
}
```

