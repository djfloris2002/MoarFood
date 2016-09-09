package nl.djfloris2002.moarfood.items;

import net.minecraft.item.Item;
import nl.djfloris2002.moarfood.Refrence;

/**
 * Created by Floris on 9/9/2016.
 */
public class ItemEmptyPizza extends Item {

    public  ItemEmptyPizza(){
        setUnlocalizedName(Refrence.MoarFoodItems.EMPTYPIZZA.getUnlocalizedName());
        setRegistryName(Refrence.MoarFoodItems.EMPTYPIZZA.getRegistryName());
    }

}
