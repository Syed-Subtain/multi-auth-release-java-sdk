
# Orders Authorize 403

## Structure

`OrdersAuthorize403`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<OrdersAuthorize403IssuesItems>`](../../doc/models/containers/orders-authorize-403-issues-items.md) | Optional | - | List<OrdersAuthorize403IssuesItems> getIssues() | setIssues(List<OrdersAuthorize403IssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "NOT_ELIGIBLE_FOR_TOKEN_PROCESSING",
      "description": "API caller is not enabled to process payments with the specified type of token. Please contact customer support to request permissions to process transactions with this type of token."
    },
    {
      "issue": "NOT_ELIGIBLE_FOR_TOKEN_PROCESSING",
      "description": "API caller is not enabled to process payments with the specified type of token. Please contact customer support to request permissions to process transactions with this type of token."
    }
  ]
}
```

