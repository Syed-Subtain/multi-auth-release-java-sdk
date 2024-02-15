
# Tracker Allof 0

## Structure

`TrackerAllof0`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The tracker id. | String getId() | setId(String id) |
| `Status` | `Object` | Optional | - | Object getStatus() | setStatus(Object status) |
| `Items` | [`List<TrackerItem>`](../../doc/models/tracker-item.md) | Optional | An array of details of items in the shipment. | List<TrackerItem> getItems() | setItems(List<TrackerItem> items) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of request-related HATEOAS links. | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example (as JSON)

```json
{
  "id": "id4",
  "status": {
    "key1": "val1",
    "key2": "val2"
  },
  "items": [
    {
      "name": "name8",
      "quantity": "quantity4",
      "sku": "sku6",
      "image_url": "image_url4",
      "upc": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "name": "name8",
      "quantity": "quantity4",
      "sku": "sku6",
      "image_url": "image_url4",
      "upc": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "name": "name8",
      "quantity": "quantity4",
      "sku": "sku6",
      "image_url": "image_url4",
      "upc": {
        "key1": "val1",
        "key2": "val2"
      }
    }
  ],
  "links": [
    {
      "href": "href6",
      "rel": "rel0",
      "method": "HEAD"
    }
  ]
}
```

