
# Orders Trackers Patch 404

## Structure

`OrdersTrackersPatch404`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<OrdersTrackersPatch404IssuesItems>`](../../doc/models/containers/orders-trackers-patch-404-issues-items.md) | Optional | - | List<OrdersTrackersPatch404IssuesItems> getIssues() | setIssues(List<OrdersTrackersPatch404IssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "TRACKER_ID_NOT_FOUND",
      "description": "Specified tracker ID does not exist. Check the tracker ID and try again."
    },
    {
      "issue": "TRACKER_ID_NOT_FOUND",
      "description": "Specified tracker ID does not exist. Check the tracker ID and try again."
    }
  ]
}
```

