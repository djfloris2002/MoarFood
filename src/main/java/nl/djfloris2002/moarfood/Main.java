package nl.djfloris2002.moarfood;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nl.djfloris2002.moarfood.init.ModItems;
import nl.djfloris2002.moarfood.proxy.CommonProxy;

@Mod(modid = Refrence.MOD_ID, name = Refrence.NAME, version = Refrence.VERSION, acceptedMinecraftVersions = "1.10")
public class Main {

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.init();
        ModItems.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
