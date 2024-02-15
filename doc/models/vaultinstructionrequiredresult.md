
# VAULTINSTRUCTIONREQUIREDRESULT

## Structure

`VAULTINSTRUCTIONREQUIREDRESULT`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Issue` | [`VaultInstructionRequired2IssueEnum`](../../doc/models/vault-instruction-required-2-issue-enum.md) | Optional | - | VaultInstructionRequired2IssueEnum getIssue() | setIssue(VaultInstructionRequired2IssueEnum issue) |
| `Description` | [`VaultInstructionRequired2DescriptionEnum`](../../doc/models/vault-instruction-required-2-description-enum.md) | Optional | - | VaultInstructionRequired2DescriptionEnum getDescription() | setDescription(VaultInstructionRequired2DescriptionEnum description) |

## Example (as JSON)

```json
{
  "issue": "VAULT_INSTRUCTION_REQUIRED",
  "description": "Vault instruction is required. Please use `vault.store_in_vault` to provide vault instruction."
}
```

