package net.alligator023.deepestdark.item;

import net.alligator023.deepestdark.DeepestDarkMod;
import net.alligator023.deepestdark.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DeepestDarkMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DEEP_TAB = CREATIVE_MODE_TABS.register("deep_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.DEEP_SWORD.get()))
                    .title(Component.translatable("creativetab.deep_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DEEP_SWORD.get());
                        pOutput.accept(ModItems.DEEP_HELMET.get());
                        pOutput.accept(ModItems.DEEP_CHESTPLATE.get());
                        pOutput.accept(ModItems.DEEP_LEGGINGS.get());
                        pOutput.accept(ModItems.DEEP_BOOTS.get());
                        pOutput.accept(ModItems.DEEP_INGOT.get());

                        pOutput.accept(ModBlocks.DEEP_SCULK.get());
                        pOutput.accept(ModBlocks.DEEP_SHRIEKER.get());
                        pOutput.accept(ModBlocks.SCULK_ALTAR.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
