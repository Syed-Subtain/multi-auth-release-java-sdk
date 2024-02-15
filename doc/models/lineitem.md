
# Lineitem

The line items for this purchase. If your merchant account has been configured for Level 3 processing this field will be passed to the processor on your behalf.

## Structure

`Lineitem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The item name or title.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127` | String getName() | setName(String name) |
| `UnitAmount` | [`Money`](../../doc/models/money.md) | Required | The item price or rate per unit. If you specify <code>unit_amount</code>, <code>purchase_units[].amount.breakdown.item_total</code> is required. Must equal <code>unit_amount * quantity</code> for all items. <code>unit_amount.value</code> can not be a negative number. | Money getUnitAmount() | setUnitAmount(Money unitAmount) |
| `Tax` | [`Money`](../../doc/models/money.md) | Optional | The item tax for each unit. If <code>tax</code> is specified, <code>purchase_units[].amount.breakdown.tax_total</code> is required. Must equal <code>tax * quantity</code> for all items. <code>tax.value</code> can not be a negative number. | Money getTax() | setTax(Money tax) |
| `Quantity` | `String` | Required | The item quantity. Must be a whole number.<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[1-9][0-9]{0,9}$` | String getQuantity() | setQuantity(String quantity) |
| `Description` | `String` | Optional | The detailed item description.<br>**Constraints**: *Maximum Length*: `127` | String getDescription() | setDescription(String description) |
| `Sku` | `String` | Optional | The stock keeping unit (SKU) for the item.<br>**Constraints**: *Maximum Length*: `127` | String getSku() | setSku(String sku) |
| `Category` | [`ItemCategoryEnum`](../../doc/models/item-category-enum.md) | Optional | The item category type.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `20` | ItemCategoryEnum getCategory() | setCategory(ItemCategoryEnum category) |
| `CommodityCode` | `String` | Optional | Code used to classify items purchased and track the total amount spent across various categories of products and services. Different corporate purchasing organizations may use different standards, but the United Nations Standard Products and Services Code (UNSPSC) is frequently used.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `12`, *Pattern*: `^[a-zA-Z0-9_'.-]*$` | String getCommodityCode() | setCommodityCode(String commodityCode) |
| `DiscountAmount` | [`Money`](../../doc/models/money.md) | Optional | Use this field to break down the discount amount included in the total purchase amount. The value provided here will not add to the total purchase amount. The value cannot be negative. | Money getDiscountAmount() | setDiscountAmount(Money discountAmount) |
| `TotalAmount` | [`Money`](../../doc/models/money.md) | Optional | The subtotal for all items. Must equal the sum of (items[].unit_amount * items[].quantity) for all items. item_total.value can not be a negative number. | Money getTotalAmount() | setTotalAmount(Money totalAmount) |
| `UnitOfMeasure` | `String` | Optional | Unit of measure is a standard used to express the magnitude of a quantity in international trade. Most commonly used (but not limited to) examples are: Acre (ACR), Ampere (AMP), Centigram (CGM), Centimetre (CMT), Cubic inch (INQ), Cubic metre (MTQ), Fluid ounce (OZA), Foot (FOT), Hour (HUR), Item (ITM), Kilogram (KGM), Kilometre (KMT), Kilowatt (KWT), Liquid gallon (GLL), Liter (LTR), Pounds (LBS), Square foot (FTK).<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `12`, *Pattern*: `^[a-zA-Z0-9_'.-]*$` | String getUnitOfMeasure() | setUnitOfMeasure(String unitOfMeasure) |

## Example (as JSON)

```json
{
  "name": "name4",
  "unit_amount": {
    "currency_code": "currency_code2",
    "value": "value8"
  },
  "tax": {
    "currency_code": "currency_code0",
    "value": "value6"
  },
  "quantity": "quantity0",
  "description": "description4",
  "sku": "sku0",
  "category": "DIGITAL_GOODS",
  "commodity_code": "commodity_code6"
}
```

