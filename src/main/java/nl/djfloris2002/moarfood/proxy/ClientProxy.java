package nl.djfloris2002.moarfood.proxy;

import nl.djfloris2002.moarfood.init.ModItems;

public class ClientProxy implements CommonProxy{

    @Override
    public void init(){
        ModItems.registerRenders();
    }
}
