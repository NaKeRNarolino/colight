package name.nakern.colight

import net.minecraft.block.BlockRenderType
import net.minecraft.block.BlockState
import net.minecraft.block.LightBlock

class ColightBlock(settings: Settings) : LightBlock(settings) {
    override fun getRenderType(state: BlockState?): BlockRenderType? {
        return BlockRenderType.MODEL
    }
}