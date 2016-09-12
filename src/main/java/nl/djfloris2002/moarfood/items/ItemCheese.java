package nl.djfloris2002.moarfood.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import nl.djfloris2002.moarfood.Refrence;

/**
 * Created by Floris on 9/10/2016.
 */
public class ItemCheese extends ItemFood {

    public  ItemCheese(){
        super(3, 1.0F, true);
        setUnlocalizedName(Refrence.MoarFoodItems.CHEESE.getUnlocalizedName());
        setRegistryName(Refrence.MoarFoodItems.CHEESE.getRegistryName());
    }
}
