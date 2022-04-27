package grifferthrydwy.scrolls;

import grifferthrydwy.scrolls.registry.ItemRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class Main implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("Scrolls");
    public static final String MOD_ID = "scrolls";

    @Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info( "Hello Quilt world from Scrolls v{}!", mod.metadata().version().raw() );
		ItemRegistry.register();
	}
}
