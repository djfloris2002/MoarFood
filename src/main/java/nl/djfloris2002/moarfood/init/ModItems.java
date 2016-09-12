package nl.djfloris2002.moarfood.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nl.djfloris2002.moarfood.items.*;

public class ModItems {

    public static Item emptyPizza;
    public static Item basePizza;
    public static Item cheese;
    public static Item tomato;

    public static Item tomatoSeeds;

    public static void init(){
        tomatoSeeds = new ItemTomatoSeeds();
        emptyPizza = new ItemEmptyPizza();
        basePizza = new ItemBasePizza();
        cheese = new ItemCheese();
        tomato = new ItemTomato();
    }

    public static void register(){
        GameRegistry.register(tomatoSeeds);
        GameRegistry.register(emptyPizza);
        GameRegistry.register(basePizza);
        GameRegistry.register(cheese);
        GameRegistry.register(tomato);
    }

    public static void registerRenders(){
        registerRender(tomatoSeeds);
        registerRender(emptyPizza);
        registerRender(basePizza);
        registerRender(cheese);
        registerRender(tomato);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
