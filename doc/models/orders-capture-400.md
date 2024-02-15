
# Orders Capture 400

## Structure

`OrdersCapture400`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<OrdersCapture400IssuesItems>`](../../doc/models/containers/orders-capture-400-issues-items.md) | Optional | - | List<OrdersCapture400IssuesItems> getIssues() | setIssues(List<OrdersCapture400IssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "INVALID_PARAMETER_VALUE",
      "description": "A parameter value is not valid."
    },
    {
      "issue": "INVALID_PARAMETER_VALUE",
      "description": "A parameter value is not valid."
    }
  ]
}
```

