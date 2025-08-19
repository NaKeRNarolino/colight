package name.nakern.colight

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Colight : ModInitializer {
	val logger = LoggerFactory.getLogger("colight")

	override fun onInitialize() {
		ModBlocks.initialize()
		ModItemGroups.initialize()
	}
}