
# Unprocessable Entity Error 422 Response

## Structure

`UnprocessableEntityError422Response`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<Unprocessableentityerror422responseissuesItems>`](../../doc/models/containers/unprocessableentityerror-422-responseissues-items.md) | Optional | - | List<Unprocessableentityerror422responseissuesItems> getIssues() | setIssues(List<Unprocessableentityerror422responseissuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "INVALID_CURRENCY_CODE",
      "description": "Currency code is invalid or is not currently supported. Please refer https://developer.paypal.com/docs/api/reference/currency-codes/ for list of supported currency codes."
    },
    {
      "issue": "INVALID_CURRENCY_CODE",
      "description": "Currency code is invalid or is not currently supported. Please refer https://developer.paypal.com/docs/api/reference/currency-codes/ for list of supported currency codes."
    }
  ]
}
```

