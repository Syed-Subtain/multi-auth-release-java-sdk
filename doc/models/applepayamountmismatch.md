
# APPLEPAYAMOUNTMISMATCH

## Structure

`APPLEPAYAMOUNTMISMATCH`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ApplePayAmountMismatchIssueEnum`](../../doc/models/apple-pay-amount-mismatch-issue-enum.md) | Optional | - | ApplePayAmountMismatchIssueEnum getIssue() | setIssue(ApplePayAmountMismatchIssueEnum issue) |
| `Description` | [`ApplePayAmountMismatchDescriptionEnum`](../../doc/models/apple-pay-amount-mismatch-description-enum.md) | Optional | - | ApplePayAmountMismatchDescriptionEnum getDescription() | setDescription(ApplePayAmountMismatchDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "APPLE_PAY_AMOUNT_MISMATCH",
  "description": "The 'amount' specified in the Order should match the amount that was viewed and authorized by the payer/buyer on Apple Pay. If the amount has changed, please redirect the buyer to authorize the order again via Apple Pay."
}
```

