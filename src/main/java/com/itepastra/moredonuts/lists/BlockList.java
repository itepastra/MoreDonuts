package com.itepastra.moredonuts.lists;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockList {
    public static Block fourtytwo_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 1000.0f).lightValue(7).sound(SoundType.METAL)).setRegistryName("fourtytwo_block");
    public static Block fourtytwo_ore_block  = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).lightValue(7).sound(SoundType.METAL)).setRegistryName("fourtytwo_ore_block");;
}
