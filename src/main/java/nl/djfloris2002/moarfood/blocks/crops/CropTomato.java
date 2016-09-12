package nl.djfloris2002.moarfood.blocks.crops;

import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nl.djfloris2002.moarfood.Refrence;
import nl.djfloris2002.moarfood.init.ModItems;
import nl.djfloris2002.moarfood.items.ItemTomatoSeeds;

/**
 * Created by Floris on 9/11/2016.
 */
public class CropTomato extends BlockCrops{

    public CropTomato(){
        setUnlocalizedName(Refrence.MoarFoodCrops.TOMATO.getUnlocalizedName());
        setRegistryName(Refrence.MoarFoodCrops.TOMATO.getRegistryName());
        setCreativeTab(CreativeTabs.FOOD);
    }

    public Item getSeed(){
        return ModItems.tomatoSeeds;
    }
    public Item getCrop(){
        return ModItems.tomato;
    }

}
