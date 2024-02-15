
# MERCHANTINITIATEDWITHSECURITYCODE

## Structure

`MERCHANTINITIATEDWITHSECURITYCODE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MerchantInitiatedWithSecurityCodeIssueEnum`](../../doc/models/merchant-initiated-with-security-code-issue-enum.md) | Optional | - | MerchantInitiatedWithSecurityCodeIssueEnum getIssue() | setIssue(MerchantInitiatedWithSecurityCodeIssueEnum issue) |
| `Description` | [`MerchantInitiatedWithSecurityCodeDescriptionEnum`](../../doc/models/merchant-initiated-with-security-code-description-enum.md) | Optional | - | MerchantInitiatedWithSecurityCodeDescriptionEnum getDescription() | setDescription(MerchantInitiatedWithSecurityCodeDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "MERCHANT_INITIATED_WITH_SECURITY_CODE",
  "description": "`stored_payment_source.payment_initiator` = `MERCHANT` is not supported if `payment_source.card.security_code` is present in the order. `security_code` can be present in the order only when customer is the payment initiator. It is semantically incorrect to perform a merchant initiated payment with `security_code` is the order."
}
```

