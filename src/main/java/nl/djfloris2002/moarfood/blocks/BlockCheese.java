package nl.djfloris2002.moarfood.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nl.djfloris2002.moarfood.Refrence;

/**
 * Created by Floris on 9/10/2016.
 */
public class BlockCheese extends Block{

    public BlockCheese(){
        super(Material.IRON);
        setUnlocalizedName(Refrence.MoarFoodBlocks.CHEESE.getUnlocalizedName());
        setRegistryName(Refrence.MoarFoodBlocks.CHEESE.getRegistryName());
    }
}
