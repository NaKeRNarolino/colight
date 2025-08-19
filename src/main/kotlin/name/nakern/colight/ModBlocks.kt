package name.nakern.colight

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.LightBlock
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.Items
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModBlocks {
    fun <T: Block> register(path: String, block: (AbstractBlock.Settings) -> T, settings: AbstractBlock.Settings): Pair<T, Item> {
        val block = Registry.register(
            Registries.BLOCK,
            Identifier.of("colight", path),
            block.invoke(settings)
        )

        val item = Items.register(Identifier.of("colight", path), BlockItem(
            block,
            FabricItemSettings()
        ))

        ModItemGroups.autoAdd += item

        return Pair(block, item)
    }

    val blockSettings =
        AbstractBlock.Settings.create().replaceable().strength(-1.0f, 3600000.8f).dropsNothing().nonOpaque()
            .luminance(LightBlock.STATE_TO_LUMINANCE)

    val greenLightBlock = register(
        "green_light_block",
        ::ColightBlock,
        blockSettings
    )
    val redLightBlock = register(
        "red_light_block",
        ::ColightBlock,
        blockSettings
    )
    val limeLightBlock = register(
        "lime_light_block",
        ::ColightBlock,
        blockSettings
    )
    val cyanLightBlock = register(
        "cyan_light_block",
        ::ColightBlock,
        blockSettings
    )
    val orangeLightBlock = register(
        "orange_light_block",
        ::ColightBlock,
        blockSettings
    )
    val pinkLightBlock = register(
        "pink_light_block",
        ::ColightBlock,
        blockSettings
    )
    val purpleLightBlock = register(
        "purple_light_block",
        ::ColightBlock,
        blockSettings
    )
    val yellowLightBlock = register(
        "yellow_light_block",
        ::ColightBlock,
        blockSettings
    )
    val magentaLightBlock = register(
        "magenta_light_block",
        ::ColightBlock,
        blockSettings
    )
    val blueLightBlock = register(
        "blue_light_block",
        ::ColightBlock,
        blockSettings
    )


    fun initialize() = Unit
}