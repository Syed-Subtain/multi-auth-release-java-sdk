
# Orders Confirm 400

## Structure

`OrdersConfirm400`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<OrdersConfirm400IssuesItems>`](../../doc/models/containers/orders-confirm-400-issues-items.md) | Optional | - | List<OrdersConfirm400IssuesItems> getIssues() | setIssues(List<OrdersConfirm400IssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "INVALID_PARAMETER_SYNTAX",
      "description": "The value of the field does not conform to the expected format."
    }
  ]
}
```

