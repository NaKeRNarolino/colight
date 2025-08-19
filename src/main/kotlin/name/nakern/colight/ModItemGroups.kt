package name.nakern.colight

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object ModItemGroups {
    val itemGroupKey: RegistryKey<ItemGroup> =
        RegistryKey.of(Registries.ITEM_GROUP.key, Identifier.of("colight", "item_group"))
    val itemGroup = FabricItemGroup.builder()
        .icon { ItemStack(ModBlocks.greenLightBlock.second) }
        .displayName(Text.translatable("itemGroup.colight"))
        .build()
    val autoAdd: MutableList<Item> = mutableListOf()

    fun initialize() {
        Registry.register(Registries.ITEM_GROUP,
            itemGroupKey,
            itemGroup
        );

        ItemGroupEvents.modifyEntriesEvent(itemGroupKey).register { reg ->
            for (item in autoAdd) {
                reg.add(item)
            }
        }
    }
}