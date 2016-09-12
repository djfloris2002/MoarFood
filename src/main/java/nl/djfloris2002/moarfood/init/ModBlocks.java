package nl.djfloris2002.moarfood.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nl.djfloris2002.moarfood.blocks.BlockCheese;
import nl.djfloris2002.moarfood.blocks.BlockWhite;
import nl.djfloris2002.moarfood.blocks.crops.CropTomato;

/**
 * Created by Floris on 9/10/2016.
 */
public class ModBlocks {

    public static Block cheese;
    public static Block white;
    public static Block tomatoPlant;

    public static void init(){
        tomatoPlant = new CropTomato();
        cheese = new BlockCheese();
        white = new BlockWhite();
    }

    public static void register(){
        registerBlock(tomatoPlant);
        registerBlock(cheese);
        registerBlock(white);
    }

    private static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRenders() {
        registerRender(cheese);
        registerRender(white);
    }

    public static void registerRender(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
