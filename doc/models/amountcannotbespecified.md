
# AMOUNTCANNOTBESPECIFIED

## Structure

`AMOUNTCANNOTBESPECIFIED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AmountCannotBeSpecifiedIssueEnum`](../../doc/models/amount-cannot-be-specified-issue-enum.md) | Optional | - | AmountCannotBeSpecifiedIssueEnum getIssue() | setIssue(AmountCannotBeSpecifiedIssueEnum issue) |
| `Description` | [`AmountCannotBeSpecifiedDescriptionEnum`](../../doc/models/amount-cannot-be-specified-description-enum.md) | Optional | - | AmountCannotBeSpecifiedDescriptionEnum getDescription() | setDescription(AmountCannotBeSpecifiedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AMOUNT_CANNOT_BE_SPECIFIED",
  "description": "An authorization amount can only be specified if an Order has been saved by calling /v2/checkout/orders/{order_id}/save.  Please save the order and try again."
}
```

