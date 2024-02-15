
# AUTHORIZATIONAMOUNTEXCEEDED

## Structure

`AUTHORIZATIONAMOUNTEXCEEDED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`AuthorizationAmountExceededIssueEnum`](../../doc/models/authorization-amount-exceeded-issue-enum.md) | Optional | - | AuthorizationAmountExceededIssueEnum getIssue() | setIssue(AuthorizationAmountExceededIssueEnum issue) |
| `Description` | [`AuthorizationAmountExceededDescriptionEnum`](../../doc/models/authorization-amount-exceeded-description-enum.md) | Optional | - | AuthorizationAmountExceededDescriptionEnum getDescription() | setDescription(AuthorizationAmountExceededDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "AUTHORIZATION_AMOUNT_EXCEEDED",
  "description": "Authorization amount specified exceeded allowable limit. Specify a different amount and try the request again. Alternately, contact Customer Support to increase your limits. Local regulations (e.g. in PSD2 countries) prohibit overages above the amount authorized by the payer."
}
```

