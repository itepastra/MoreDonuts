package com.itepastra.moredonuts.lists;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemGroup;

public class ItemList {
    public static Item stone_donut = new ItemFood(1,1.0f,false, new Item.Properties().maxStackSize(6).group(ItemGroup.FOOD)).setRegistryName("stone_donut");
    public static Item coal_donut = new ItemFood(2,2.0f,false, new Item.Properties().maxStackSize(12).group(ItemGroup.FOOD)).setRegistryName("coal_donut");
    public static Item iron_donut = new ItemFood(4,4.0f,false, new Item.Properties().maxStackSize(12).group(ItemGroup.FOOD)).setRegistryName("iron_donut");
    public static Item gold_donut = new ItemFood(8,8.0f,false, new Item.Properties().maxStackSize(12).group(ItemGroup.FOOD)).setRegistryName("gold_donut");
    public static Item diamond_donut = new ItemFood(16,16.0f,false, new Item.Properties().maxStackSize(12).group(ItemGroup.FOOD)).setRegistryName("diamond_donut");
    public static Item emerald_donut = new ItemFood(20,44.0f,false, new Item.Properties().maxStackSize(12).group(ItemGroup.FOOD)).setRegistryName("emerald_donut");
    public static Item the_ultimate_donut = new ItemFood(200,300000.0f,false, new Item.Properties().maxStackSize(12).group(ItemGroup.FOOD)).setRegistryName("the_ultimate_donut");

    public static Item fourteen_thirds = new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName("fourteen_thirds");
    
    
    
    public static Item fourtytwo_ore_block = new ItemBlock(BlockList.fourtytwo_ore_block, new Item.Properties().maxStackSize(63).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("fourtytwo_ore_block");
    public static Item fourtytwo_block = new ItemBlock(BlockList.fourtytwo_block, new Item.Properties().maxStackSize(64).group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("fourtytwo_block");
    

}
