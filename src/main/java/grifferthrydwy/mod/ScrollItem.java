package grifferthrydwy.mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ScrollItem extends Item {
    public Spell spell;

    public ScrollItem(Spell spell, QuiltItemSettings settings) {
        super(settings);
        this.spell = spell;

    }

    public enum Spell {
        SPELL_ONE,
        SPELL_TWO,
        SPELL_THREE
    }
    public int castSpell(ItemStack stack) {
        Spell spell = this.spell;

        switch (spell) {
            case SPELL_ONE -> spellOne.run();
            case SPELL_TWO -> spellTwo.run();
            case SPELL_THREE -> spellThree.run();
        }
        return 0;
    }





    private static final Runnable spellOne = () -> {
        //spellOne code
        System.out.println("okjj");
    };

    private static final Runnable spellTwo = () -> {
        //spellOne code
        System.out.println("okjj");
    };

    private static final Runnable spellThree = () -> {
        //spellOne code
        System.out.println("okjj");
    };

}
