package nl.djfloris2002.moarfood;

public class Refrence {

    public static final String MOD_ID = "djf_moarfood";
    public static final String NAME = "Moar Food";
    public static final String VERSION = "0.1-ALPHA";

    public static final String CLIENT_PROXY_CLASS = "nl.djfloris2002.moarfood.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "nl.djfloris2002.moarfood.proxy.ServerProxy";

    public static enum MoarFoodItems{
        EMPTYPIZZA("emptyPizza", "ItemEmptyPizza");

        private String unlocalizedName;
        private String registryName;

        MoarFoodItems(String unlocalizedName, String  registryName){
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }
    }

}
