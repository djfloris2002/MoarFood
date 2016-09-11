package nl.djfloris2002.moarfood.items;

import net.minecraft.item.Item;
import nl.djfloris2002.moarfood.Refrence;

/**
 * Created by Floris on 9/11/2016.
 */
public class ItemBasePizza extends Item {

    public  ItemBasePizza(){
        setUnlocalizedName(Refrence.MoarFoodItems.BASEPIZZA.getUnlocalizedName());
        setRegistryName(Refrence.MoarFoodItems.BASEPIZZA.getRegistryName());
    }
}
