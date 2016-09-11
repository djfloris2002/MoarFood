package nl.djfloris2002.moarfood.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nl.djfloris2002.moarfood.Refrence;

/**
 * Created by Floris on 9/10/2016.
 */
public class BlockWhite extends Block{

    public BlockWhite(){
        super(Material.IRON);
        setUnlocalizedName(Refrence.MoarFoodBlocks.WHITE.getUnlocalizedName());
        setRegistryName(Refrence.MoarFoodBlocks.WHITE.getRegistryName());
    }
}
