
# Order Tracker Response

The tracking response on creation of tracker.

## Structure

`OrderTrackerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The tracker id. | String getId() | setId(String id) |
| `Status` | `Object` | Optional | - | Object getStatus() | setStatus(Object status) |
| `Items` | [`List<TrackerItem>`](../../doc/models/tracker-item.md) | Optional | An array of details of items in the shipment. | List<TrackerItem> getItems() | setItems(List<TrackerItem> items) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of request-related HATEOAS links. | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `CreateTime` | `String` | Optional | The date and time when the transaction occurred, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time when the transaction was last updated, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |

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
  ],
  "create_time": "create_time0"
}
```

