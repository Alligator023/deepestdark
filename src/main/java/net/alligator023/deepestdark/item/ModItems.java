package net.alligator023.deepestdark.item;

import net.alligator023.deepestdark.DeepestDarkMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DeepestDarkMod.MOD_ID);

    public static final RegistryObject<Item> DEEP_SWORD = ITEMS.register("deep_sword",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_HELMET = ITEMS.register("deep_helmet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_CHESTPLATE = ITEMS.register("deep_chestplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_LEGGINGS = ITEMS.register("deep_leggings",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_BOOTS = ITEMS.register("deep_boots",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_INGOT = ITEMS.register("deep_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
