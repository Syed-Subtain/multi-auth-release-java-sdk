
# Bad Request 400 Error Response

## Structure

`BadRequest400ErrorResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<Badrequest400errorresponseissuesItems>`](../../doc/models/containers/badrequest-400-errorresponseissues-items.md) | Optional | - | List<Badrequest400errorresponseissuesItems> getIssues() | setIssues(List<Badrequest400errorresponseissuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "INVALID_PARAMETER_VALUE",
      "description": "The value of a field is invalid."
    }
  ]
}
```

