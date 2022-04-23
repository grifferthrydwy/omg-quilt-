package grifferthrydwy.mod;

import grifferthrydwy.mod.registry.ItemRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class Main implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("ExampleMod");
    public static final String MOD_ID = "modid";

    @Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info( "Hello Quilt world from Mod v{}!", mod.metadata().version().raw() );
		ItemRegistry.register();
	}
}
