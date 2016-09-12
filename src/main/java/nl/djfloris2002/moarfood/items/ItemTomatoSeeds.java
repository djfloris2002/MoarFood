package nl.djfloris2002.moarfood.items;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import nl.djfloris2002.moarfood.Refrence;
import nl.djfloris2002.moarfood.blocks.crops.CropTomato;
import nl.djfloris2002.moarfood.init.ModBlocks;

/**
 * Created by Floris on 9/11/2016.
 */
public class ItemTomatoSeeds extends ItemSeeds{

    public  ItemTomatoSeeds(){
        super(ModBlocks.tomatoPlant, Blocks.FARMLAND);
        setUnlocalizedName(Refrence.MoarFoodItems.TOMATOSEEDS.getUnlocalizedName());
        setRegistryName(Refrence.MoarFoodItems.TOMATOSEEDS.getRegistryName());
    }

}
