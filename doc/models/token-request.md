
# Token Request

The Tokenized Payment Source representing a Request to Vault a Token.

## Structure

`TokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The PayPal-generated ID for the token.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_-]+$` | String getId() | setId(String id) |
| `Type` | `String` | Required, Constant | The tokenization method that generated the ID.<br>**Default**: `"BILLING_AGREEMENT"` | String getType() | setType(String type) |
| `Attributes` | `Object` | Optional | The auxiliary details of the token. | Object getAttributes() | setAttributes(Object attributes) |

## Example (as JSON)

```json
{
  "id": "id0",
  "type": "BILLING_AGREEMENT",
  "attributes": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

