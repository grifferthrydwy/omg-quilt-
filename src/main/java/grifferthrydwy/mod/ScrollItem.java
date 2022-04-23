package grifferthrydwy.mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ScrollItem extends Item {
    private Spell spell;

    public ScrollItem(Settings settings) {
        super(settings);
    }

    enum Spell {
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





    private static Runnable spellOne = () -> {
        //spellOne code
        System.out.println("okjj");
    };

    private static Runnable spellTwo = () -> {
        //spellOne code
        System.out.println("okjj");
    };

    private static Runnable spellThree = () -> {
        //spellOne code
        System.out.println("okjj");
    };

}
