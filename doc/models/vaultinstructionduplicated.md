
# VAULTINSTRUCTIONDUPLICATED

## Structure

`VAULTINSTRUCTIONDUPLICATED`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`VaultInstructionDuplicatedIssueEnum`](../../doc/models/vault-instruction-duplicated-issue-enum.md) | Optional | - | VaultInstructionDuplicatedIssueEnum getIssue() | setIssue(VaultInstructionDuplicatedIssueEnum issue) |
| `Description` | [`VaultInstructionDuplicatedDescriptionEnum`](../../doc/models/vault-instruction-duplicated-description-enum.md) | Optional | - | VaultInstructionDuplicatedDescriptionEnum getDescription() | setDescription(VaultInstructionDuplicatedDescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "VAULT_INSTRUCTION_DUPLICATED",
  "description": "Only one vault instruction is allowed. Please use `vault.store_in_vault` to provide vault instruction."
}
```

