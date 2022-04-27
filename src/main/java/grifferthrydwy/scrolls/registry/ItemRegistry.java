package grifferthrydwy.scrolls.registry;

import grifferthrydwy.scrolls.Main;
import grifferthrydwy.scrolls.ScrollItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ItemRegistry {
    public static Item SCROLL_ONE = new ScrollItem(ScrollItem.Spell.SPELL_ONE, new QuiltItemSettings().group(ItemGroup.MISC).maxCount(1));
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "scroll_one"), SCROLL_ONE);
    }
}
