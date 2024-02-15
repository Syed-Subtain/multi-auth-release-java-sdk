
# BILLINGAGREEMENTNOTFOUNDRESULT

## Structure

`BILLINGAGREEMENTNOTFOUNDRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`BillingAgreementNotFound2IssueEnum`](../../doc/models/billing-agreement-not-found-2-issue-enum.md) | Optional | - | BillingAgreementNotFound2IssueEnum getIssue() | setIssue(BillingAgreementNotFound2IssueEnum issue) |
| `Description` | [`BillingAgreementNotFound2DescriptionEnum`](../../doc/models/billing-agreement-not-found-2-description-enum.md) | Optional | - | BillingAgreementNotFound2DescriptionEnum getDescription() | setDescription(BillingAgreementNotFound2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "BILLING_AGREEMENT_NOT_FOUND",
  "description": "The requested Billing Agreement token was not found."
}
```

