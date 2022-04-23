package grifferthrydwy.mod.registry;

import grifferthrydwy.mod.Main;
import grifferthrydwy.mod.ScrollItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    public static Item EXAMPLE_ITEM = new ScrollItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1).Spell());
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "example_item"), EXAMPLE_ITEM);
    }
}
