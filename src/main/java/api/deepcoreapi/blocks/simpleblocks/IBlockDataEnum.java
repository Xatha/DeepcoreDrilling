package api.deepcoreapi.blocks.simpleblocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public interface IBlockDataEnum {
    ///The enum values of the blocks.
    IBlockDataEnum[] getValues();

    String getName();

    Material getMaterial();

    MaterialColor getMaterialColor();

    float getHardness();

    float getResistance();

    ToolType getHarvestTool();

    int getHarvestLevel();

    SoundType getSound();

    Item.Properties getblockItem();
}

