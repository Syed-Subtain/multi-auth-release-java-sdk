
# BILLINGAGREEMENTIDMISMATCHERROR

## Structure

`BILLINGAGREEMENTIDMISMATCHERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`BillingAgreementIdMismatch1IssueEnum`](../../doc/models/billing-agreement-id-mismatch-1-issue-enum.md) | Optional | - | BillingAgreementIdMismatch1IssueEnum getIssue() | setIssue(BillingAgreementIdMismatch1IssueEnum issue) |
| `Description` | [`BillingAgreementIdMismatch1DescriptionEnum`](../../doc/models/billing-agreement-id-mismatch-1-description-enum.md) | Optional | - | BillingAgreementIdMismatch1DescriptionEnum getDescription() | setDescription(BillingAgreementIdMismatch1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "BILLING_AGREEMENT_ID_MISMATCH",
  "description": "Billing Agreement ID must exactly match the Billing Agreement ID that was provided during order creation."
}
```

