
# Processor Response

The processor response information for payment requests, such as direct credit card transactions.

## Structure

`ProcessorResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AvsCode` | [`ProcessorResponseAvsCodeEnum`](../../doc/models/processor-response-avs-code-enum.md) | Optional | The address verification code for Visa, Discover, Mastercard, or American Express transactions. | ProcessorResponseAvsCodeEnum getAvsCode() | setAvsCode(ProcessorResponseAvsCodeEnum avsCode) |
| `CvvCode` | [`ProcessorResponseCvvCodeEnum`](../../doc/models/processor-response-cvv-code-enum.md) | Optional | The card verification value code for for Visa, Discover, Mastercard, or American Express. | ProcessorResponseCvvCodeEnum getCvvCode() | setCvvCode(ProcessorResponseCvvCodeEnum cvvCode) |
| `ResponseCode` | [`ProcessorResponseResponseCodeEnum`](../../doc/models/processor-response-response-code-enum.md) | Optional | Processor response code for the non-PayPal payment processor errors. | ProcessorResponseResponseCodeEnum getResponseCode() | setResponseCode(ProcessorResponseResponseCodeEnum responseCode) |
| `PaymentAdviceCode` | [`ProcessorResponsePaymentAdviceCodeEnum`](../../doc/models/processor-response-payment-advice-code-enum.md) | Optional | The declined payment transactions might have payment advice codes. The card networks, like Visa and Mastercard, return payment advice codes. | ProcessorResponsePaymentAdviceCodeEnum getPaymentAdviceCode() | setPaymentAdviceCode(ProcessorResponsePaymentAdviceCodeEnum paymentAdviceCode) |

## Example (as JSON)

```json
{
  "avs_code": "M",
  "cvv_code": "U",
  "response_code": "PPII",
  "payment_advice_code": "01"
}
```

