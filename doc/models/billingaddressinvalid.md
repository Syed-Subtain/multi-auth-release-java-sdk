
# BILLINGADDRESSINVALID

## Structure

`BILLINGADDRESSINVALID`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`BillingAddressInvalidIssueEnum`](../../doc/models/billing-address-invalid-issue-enum.md) | Optional | - | BillingAddressInvalidIssueEnum getIssue() | setIssue(BillingAddressInvalidIssueEnum issue) |
| `Description` | [`BillingAddressInvalidDescriptionEnum`](../../doc/models/billing-address-invalid-description-enum.md) | Optional | - | BillingAddressInvalidDescriptionEnum getDescription() | setDescription(BillingAddressInvalidDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "BILLING_ADDRESS_INVALID",
  "description": "Provided billing address is invalid."
}
```

