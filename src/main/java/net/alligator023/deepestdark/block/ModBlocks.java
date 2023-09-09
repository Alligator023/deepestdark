package net.alligator023.deepestdark.block;

import net.alligator023.deepestdark.DeepestDarkMod;
import net.alligator023.deepestdark.item.ModItems;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DeepestDarkMod.MOD_ID);

    public static final RegistryObject<Block> DEEP_SCULK = registerBlock("deep_sculk",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.SCULK), ConstantInt.of(1)));
    public static final RegistryObject<Block> DEEP_SHRIEKER = registerBlock("deep_shrieker",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SCULK_SHRIEKER)));
    public static final RegistryObject<Block> SCULK_ALTAR = registerBlock("sculk_altar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SCULK_CATALYST)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
