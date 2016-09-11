package nl.djfloris2002.moarfood.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nl.djfloris2002.moarfood.items.ItemBasePizza;
import nl.djfloris2002.moarfood.items.ItemCheese;
import nl.djfloris2002.moarfood.items.ItemEmptyPizza;

public class ModItems {

    public static Item emptyPizza;
    public static Item basePizza;
    public static Item cheese;

    public static void init(){
        emptyPizza = new ItemEmptyPizza();
        basePizza = new ItemBasePizza();
        cheese = new ItemCheese();
    }

    public static void register(){
        GameRegistry.register(emptyPizza);
        GameRegistry.register(basePizza);
        GameRegistry.register(cheese);
    }

    public static void registerRenders(){
        registerRender(emptyPizza);
        registerRender(basePizza);
        registerRender(cheese);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
