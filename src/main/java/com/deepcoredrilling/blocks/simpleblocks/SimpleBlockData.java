package com.deepcoredrilling.blocks.simpleblocks;

import api.deepcoreapi.blocks.simpleblocks.IBlockDataEnum;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public enum SimpleBlockData implements IBlockDataEnum {

    CASPER_BLOCK("casper_block", Material.TNT, MaterialColor.TNT,
            0f, 1f, ToolType.PICKAXE,
            10, SoundType.ANVIL, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)),
    EXAMPLE_BLOCK("example_block", Material.ROCK, MaterialColor.STONE, 0f, 1f, ToolType.PICKAXE, 10, SoundType.ANVIL),
    LUCA_BLOCK("luca_block", Material.CACTUS, MaterialColor.DIRT,
            1f, 1f, ToolType.PICKAXE,
            10, SoundType.ANVIL, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)),
    LUKAS_BLOCK("lukas_block", Material.ANVIL, MaterialColor.BROWN_TERRACOTTA,
            50f, 50f, ToolType.PICKAXE,
            50, SoundType.ANVIL, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)),
    PEDER_BLOCK("peder_block", Material.TNT, MaterialColor.BLUE,
            100f, 150f, ToolType.AXE,
            10, SoundType.ANVIL, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)),
    RASMUS_BLOCK("rasmus_block", Material.CARPET, MaterialColor.BLACK,
            5f, 5f, ToolType.SHOVEL,
            20, SoundType.BASALT, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));

    SimpleBlockData(String name,
              Material material,
              MaterialColor materialColor,
              float hardness,
              float resistance,
              ToolType harvestTool,
              int harvestLevel,
              SoundType sound) {

        _name = name;
        _material = material;
        _materialColor = materialColor;
        _hardness = hardness;
        _resistance = resistance;
        _harvestTool = harvestTool;
        _harvestLevel = harvestLevel;
        _sound = sound;
        _itemProperty = null;

    }

    SimpleBlockData(String name,
              Material material,
              MaterialColor materialColor,
              float hardness,
              float resistance,
              ToolType harvestTool,
              int harvestLevel,
              SoundType sound,
              Item.Properties itemProperty) {

        _name = name;
        _material = material;
        _materialColor = materialColor;
        _hardness = hardness;
        _resistance = resistance;
        _harvestTool = harvestTool;
        _harvestLevel = harvestLevel;
        _sound = sound;
        _itemProperty = itemProperty;
    }

    private final String _name;
    private final Material _material;
    private final MaterialColor _materialColor;
    private final Float _hardness;
    private final Float _resistance;
    private final ToolType _harvestTool;
    private final int _harvestLevel;
    private final SoundType _sound;
    private final Item.Properties _itemProperty;

    @Override
    public IBlockDataEnum[] getValues() {
        return SimpleBlockData.values();
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public Material getMaterial() {
        return _material;
    }

    @Override
    public MaterialColor getMaterialColor() {
        return _materialColor;
    }

    @Override
    public float getHardness() {
        return _hardness;
    }

    @Override
    public float getResistance() {
        return _resistance;
    }

    @Override
    public ToolType getHarvestTool() {
        return _harvestTool;
    }

    @Override
    public int getHarvestLevel() {
        return _harvestLevel;
    }

    @Override
    public SoundType getSound() {
        return _sound;
    }

    @Override
    public Item.Properties getblockItem() {
        return _itemProperty;
    }
}
