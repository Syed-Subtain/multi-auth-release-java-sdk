
# MERCHANTINITIATEDAUTHRESULTSERRORRESPONSE

## Structure

`MERCHANTINITIATEDAUTHRESULTSERRORRESPONSE`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`MerchantInitiatedWithAuthResultsEnum`](../../doc/models/merchant-initiated-with-auth-results-enum.md) | Optional | - | MerchantInitiatedWithAuthResultsEnum getIssue() | setIssue(MerchantInitiatedWithAuthResultsEnum issue) |
| `Description` | [`ErrMerchInitAuthResults3dsInvalidDescEnum`](../../doc/models/err-merch-init-auth-results-3-ds-invalid-desc-enum.md) | Optional | - | ErrMerchInitAuthResults3dsInvalidDescEnum getDescription() | setDescription(ErrMerchInitAuthResults3dsInvalidDescEnum description) |

## Example (as JSON)

```json
{
  "issue": "MERCHANT_INITIATED_WITH_AUTHENTICATION_RESULTS",
  "description": "`stored_payment_source.payment_initiator` = `MERCHANT` is not supported if 3D-Secure authentication results are present in the order. 3D-Secure authentication results can be present in the order only when customer is the payment initiator. It is semantically incorrect to perform a merchant initiated payment with 3D-Secure authentication results is the order."
}
```

