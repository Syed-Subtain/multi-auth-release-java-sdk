
# BILLINGAGREEMENTIDMISMATCH

## Structure

`BILLINGAGREEMENTIDMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`BillingAgreementIdMismatchIssueEnum`](../../doc/models/billing-agreement-id-mismatch-issue-enum.md) | Optional | - | BillingAgreementIdMismatchIssueEnum getIssue() | setIssue(BillingAgreementIdMismatchIssueEnum issue) |
| `Description` | [`BillingAgreementIdMismatchDescriptionEnum`](../../doc/models/billing-agreement-id-mismatch-description-enum.md) | Optional | - | BillingAgreementIdMismatchDescriptionEnum getDescription() | setDescription(BillingAgreementIdMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "BILLING_AGREEMENT_ID_MISMATCH",
  "description": "Billing Agreement ID must exactly match the Billing Agreement ID that was provided during order creation."
}
```

