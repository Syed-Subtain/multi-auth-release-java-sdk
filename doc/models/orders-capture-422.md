
# Orders Capture 422

## Structure

`OrdersCapture422`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<OrdersCapture422IssuesItems>`](../../doc/models/containers/orders-capture-422-issues-items.md) | Optional | - | List<OrdersCapture422IssuesItems> getIssues() | setIssues(List<OrdersCapture422IssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "AGREEMENT_ALREADY_CANCELLED",
      "description": "The requested agreement is already canceled."
    }
  ]
}
```

