package grifferthrydwy.scrolls;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
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
    public void castSpell(PlayerEntity user) {
        Spell spell = this.spell;

        switch (spell) {
            case SPELL_ONE -> spellOne.run();
            case SPELL_TWO -> spellTwo.run();
            case SPELL_THREE -> spellThree.run();
        }
    }
    private boolean tick = false;
    private int tickCounter = 0;
    private ServerPlayerEntity player;
    private ClientPlayerEntity clientPlayer;

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if (playerEntity instanceof ServerPlayerEntity) player = (ServerPlayerEntity) playerEntity; // Get server player
        else if (playerEntity instanceof ClientPlayerEntity) clientPlayer = (ClientPlayerEntity) playerEntity; // Get client player

        if (!tick) {
            final MinecraftClient client = MinecraftClient.getInstance();
            // client.particleManager.addEmitter(clientPlayer, ParticleTypes.END_ROD, 30);
            client.gameRenderer.showFloatingItem(this.getDefaultStack());
            if (player != null)
                player.getWorld().playSound(playerEntity, playerEntity.getBlockPos(), SoundEvents.ENCHANT_THORNS_HIT, SoundCategory.PLAYERS, 1f, 1f);
            tick = true;
            return TypedActionResult.success(playerEntity.getStackInHand(hand));
        } else {
            return TypedActionResult.fail(playerEntity.getStackInHand(hand));
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (player != null && tick) {
            tickCounter++;
            if (tickCounter >= 30) {
                castSpell(player);
                tick = false;
                tickCounter = 0;
            }
        }
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
