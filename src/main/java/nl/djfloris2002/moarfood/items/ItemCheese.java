package nl.djfloris2002.moarfood.items;

import net.minecraft.item.Item;
import nl.djfloris2002.moarfood.Refrence;

/**
 * Created by Floris on 9/10/2016.
 */
public class ItemCheese extends Item {

    public  ItemCheese(){
        setUnlocalizedName(Refrence.MoarFoodItems.CHEESE.getUnlocalizedName());
        setRegistryName(Refrence.MoarFoodItems.CHEESE.getRegistryName());
    }
}
