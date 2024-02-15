
# BLIKONECLICKMISSINGREQUIREDPARAMETER

## Structure

`BLIKONECLICKMISSINGREQUIREDPARAMETER`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`BlikOneClickMissingRequiredParameterIssueEnum`](../../doc/models/blik-one-click-missing-required-parameter-issue-enum.md) | Optional | - | BlikOneClickMissingRequiredParameterIssueEnum getIssue() | setIssue(BlikOneClickMissingRequiredParameterIssueEnum issue) |
| `Description` | [`OneClickFirstTransactionParamsEnum`](../../doc/models/one-click-first-transaction-params-enum.md) | Optional | - | OneClickFirstTransactionParamsEnum getDescription() | setDescription(OneClickFirstTransactionParamsEnum description) |

## Example (as JSON)

```json
{
  "issue": "BLIK_ONE_CLICK_MISSING_REQUIRED_PARAMETER",
  "description": "Blik's one_click flow requires one_click.auth_code and one_click.alias_label parameters for the buyer's first transaction. For all subsequent transactions,only the one_click.alias_key parameter is required."
}
```

