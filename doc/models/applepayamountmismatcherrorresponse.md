
# APPLEPAYAMOUNTMISMATCHERRORRESPONSE

## Structure

`APPLEPAYAMOUNTMISMATCHERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`ApplePayAmountMismatch3IssueEnum`](../../doc/models/apple-pay-amount-mismatch-3-issue-enum.md) | Optional | - | ApplePayAmountMismatch3IssueEnum getIssue() | setIssue(ApplePayAmountMismatch3IssueEnum issue) |
| `Description` | [`ApplePayAmountMismatch3DescriptionEnum`](../../doc/models/apple-pay-amount-mismatch-3-description-enum.md) | Optional | - | ApplePayAmountMismatch3DescriptionEnum getDescription() | setDescription(ApplePayAmountMismatch3DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "APPLE_PAY_AMOUNT_MISMATCH",
  "description": "The 'amount' specified in the Order should match the amount that was viewed and authorized by the payer/buyer on Apple Pay. If the amount has changed, please redirect the buyer to authorize the order again via Apple Pay."
}
```

