package nl.djfloris2002.moarfood.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nl.djfloris2002.moarfood.Refrence;
import nl.djfloris2002.moarfood.items.ItemEmptyPizza;

/**
 * Created by Floris on 9/9/2016.
 */
public class ModItems {

    public static Item emptyPizza;

    public static void init(){
        emptyPizza = new ItemEmptyPizza();
    }

    public static void register(){
        GameRegistry.register(emptyPizza);
    }

    public static void registerRenders(){
        registerRender(emptyPizza);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Refrence.MOD_ID+":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
