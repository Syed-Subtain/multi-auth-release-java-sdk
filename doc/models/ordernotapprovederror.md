
# ORDERNOTAPPROVEDERROR

## Structure

`ORDERNOTAPPROVEDERROR`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`OrderNotApproved1IssueEnum`](../../doc/models/order-not-approved-1-issue-enum.md) | Optional | - | OrderNotApproved1IssueEnum getIssue() | setIssue(OrderNotApproved1IssueEnum issue) |
| `Description` | [`OrderNotApproved1DescriptionEnum`](../../doc/models/order-not-approved-1-description-enum.md) | Optional | - | OrderNotApproved1DescriptionEnum getDescription() | setDescription(OrderNotApproved1DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "ORDER_NOT_APPROVED",
  "description": "Payer has not yet approved the Order for payment. Please redirect the payer to the 'rel':'approve' url returned as part of the HATEOAS links within the Create Order call or provide a valid `payment_source` in the request."
}
```

