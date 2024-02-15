
# Orders Authorize 400

## Structure

`OrdersAuthorize400`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issues` | [`List<OrdersAuthorize400IssuesItems>`](../../doc/models/containers/orders-authorize-400-issues-items.md) | Optional | - | List<OrdersAuthorize400IssuesItems> getIssues() | setIssues(List<OrdersAuthorize400IssuesItems> issues) |

## Example (as JSON)

```json
{
  "issues": [
    {
      "issue": "INVALID_COUNTRY_CODE",
      "description": "Country code is invalid. Please refer to https://developer.paypal.com/api/rest/reference/country-codes/ for a list of supported country codes."
    },
    {
      "issue": "INVALID_COUNTRY_CODE",
      "description": "Country code is invalid. Please refer to https://developer.paypal.com/api/rest/reference/country-codes/ for a list of supported country codes."
    },
    {
      "issue": "INVALID_COUNTRY_CODE",
      "description": "Country code is invalid. Please refer to https://developer.paypal.com/api/rest/reference/country-codes/ for a list of supported country codes."
    }
  ]
}
```

