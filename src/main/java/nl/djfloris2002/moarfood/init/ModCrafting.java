package nl.djfloris2002.moarfood.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Floris on 9/11/2016.
 */
public class ModCrafting {

    public static void register() {
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cheese), "CCC", "CCC", "CCC", 'C', ModItems.cheese);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cheese, 9), ModBlocks.cheese);
    }
}
