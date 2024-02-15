
# APPLEPAYAMOUNTMISMATCHRESULT

## Structure

`APPLEPAYAMOUNTMISMATCHRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ApplePayAmountMismatch2IssueEnum`](../../doc/models/apple-pay-amount-mismatch-2-issue-enum.md) | Optional | - | ApplePayAmountMismatch2IssueEnum getIssue() | setIssue(ApplePayAmountMismatch2IssueEnum issue) |
| `Description` | [`ApplePayAmountMismatch2DescriptionEnum`](../../doc/models/apple-pay-amount-mismatch-2-description-enum.md) | Optional | - | ApplePayAmountMismatch2DescriptionEnum getDescription() | setDescription(ApplePayAmountMismatch2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "APPLE_PAY_AMOUNT_MISMATCH",
  "description": "The 'amount' specified in the Order should match the amount that was viewed and authorized by the payer/buyer on Apple Pay. If the amount has changed, please redirect the buyer to authorize the order again via Apple Pay."
}
```

