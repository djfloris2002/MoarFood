package nl.djfloris2002.moarfood.items;

import net.minecraft.item.ItemFood;
import nl.djfloris2002.moarfood.Refrence;

/**
 * Created by Floris on 9/11/2016.
 */
public class ItemTomato extends ItemFood {

    public  ItemTomato(){
        super(3, 1.0F, true);
        setUnlocalizedName(Refrence.MoarFoodItems.TOMATO.getUnlocalizedName());
        setRegistryName(Refrence.MoarFoodItems.TOMATO.getRegistryName());
    }
}
