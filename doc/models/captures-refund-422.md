
# Captures Refund 422

## Structure

`CapturesRefund422`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<Capturesrefund422issuesItems>`](../../doc/models/containers/capturesrefund-422-issues-items.md) | Optional | - | List<Capturesrefund422issuesItems> getIssues() | setIssues(List<Capturesrefund422issuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "CANNOT_BE_ZERO_OR_NEGATIVE",
      "description": "Must be greater than zero. If the currency supports decimals, only two decimal place precision is supported."
    },
    {
      "issue": "CANNOT_BE_ZERO_OR_NEGATIVE",
      "description": "Must be greater than zero. If the currency supports decimals, only two decimal place precision is supported."
    },
    {
      "issue": "CANNOT_BE_ZERO_OR_NEGATIVE",
      "description": "Must be greater than zero. If the currency supports decimals, only two decimal place precision is supported."
    }
  ]
}
```

