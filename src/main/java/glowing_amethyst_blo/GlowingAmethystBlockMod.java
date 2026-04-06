package glowing_amethyst_blo;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlowingAmethystBlockMod implements ModInitializer {
    public static final String MOD_ID = "glowing_amethyst_blo";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    // Register block
    public static final Block GLOWING_AMETHYST_BLOCK = registerBlock("glowing_amethyst_block",
        new Block(AbstractBlock.Settings.create()
            .strength(1.5f, 6.0f)
            .requiresTool()
            .luminance(state -> 12)
        ));
    
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }
    
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }
    
    @Override
    public void onInitialize() {
        LOGGER.info("Loading Glowing Amethyst Block!");
        
        // Add to creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(GLOWING_AMETHYST_BLOCK);
        });
    }
}
