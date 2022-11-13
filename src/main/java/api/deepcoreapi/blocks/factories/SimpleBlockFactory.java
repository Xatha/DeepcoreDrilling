package api.deepcoreapi.blocks.factories;

import api.deepcoreapi.blocks.simpleblocks.IBlockDataEnum;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public final class SimpleBlockFactory {

    private final Logger LOGGER = LogManager.getLogger();

    private final String _modId;
    private final IBlockDataEnum[] _blockData;
    private final HashMap<String, RegistryObject<Block>> BLOCK_OBJECTS = new HashMap<>();

    private DeferredRegister<Block> _forgeBlockRegistry;
    private DeferredRegister<Item> _forgeBlockItemRegistry;


    public SimpleBlockFactory(String modId, IBlockDataEnum[] blockData) {
        _modId = modId;
        _blockData = blockData;
    }

    public DeferredRegister<Block> BuildBlockRegistry()
    {
        _forgeBlockRegistry = DeferredRegister.create(ForgeRegistries.BLOCKS, _modId);
        for(IBlockDataEnum block : _blockData) {
            BLOCK_OBJECTS.put(
                    block.getName(),
                    _forgeBlockRegistry.register(block.getName(),
                            () -> new Block(AbstractBlock.Properties.create(block.getMaterial(), block.getMaterialColor())
                                    .hardnessAndResistance(block.getHardness(), block.getResistance())
                                    .harvestTool(block.getHarvestTool())
                                    .harvestLevel(block.getHarvestLevel())
                                    .sound(block.getSound()))));

            LOGGER.info("Successfully loaded block: " + block.getName());
        }
        return _forgeBlockRegistry;
    }

    //Remember to use this after calling BuildRegistry().
    public DeferredRegister<Item> BuildBlockItemRegistry()
    {
        _forgeBlockItemRegistry = DeferredRegister.create(ForgeRegistries.ITEMS, _modId);
        for(IBlockDataEnum block : _blockData)
        {
            Item.Properties blockItem = block.getblockItem();
            if (blockItem != null)
            {
                _forgeBlockItemRegistry.register(block.getName(),
                        () -> new BlockItem(BLOCK_OBJECTS.get(block.getName()).get(), blockItem));

                LOGGER.info("Successfully loaded block item: " + block.getName());
            }
        }
        return _forgeBlockItemRegistry;
    }
}