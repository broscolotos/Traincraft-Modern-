package traincraftmodernplus;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.items.TiMTab;
import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.creativetab.CreativeTabs;
import traincraftmodernplus.entities.locomotives.*;
//import traincraftmodernplus.entities.rollingstock.*;
import traincraftmodernplus.entities.tenders.*;

import javax.swing.event.TableModelListener;

import static ebf.tim.registry.TiMGenericRegistry.registerTransports;
import static sun.security.x509.ReasonFlags.UNUSED;




@Mod(modid = TrancraftModernPlus.MODID, version = TrancraftModernPlus.MOD_VERSION, name = "Traincraft Modern+")
public class TrancraftModernPlus {
    public static final String MODID = "traincraftmodernplus";
    public static final String MOD_VERSION = "pre-release";
    public static TiMTab locoTab;
    private static ItemTransport tabItem;
    public static TiMTab rollingstockTab;

    @Mod.EventHandler
    @SuppressWarnings(UNUSED)

    public void init(FMLInitializationEvent event) {


        locoTab = new TiMTab("TraincraftModernLocomotives", tabItem);
        rollingstockTab = new TiMTab("TraincraftModernRollingstock", MODID,"TCM+Rollingstock");

        TiMGenericRegistry.registerTransports(MODID, listSteamTrains(), null);
        TiMGenericRegistry.registerTransports(MODID, listFreight(), null);
        //TiMGenericRegistry.registerTransports(MODID, listDieselTrains(), null);
        //TiMGenericRegistry.registerTransports(MODID, listElectricTrains(), null);
        //TiMGenericRegistry.registerTransports(MODID, listPassenger(), null);\

        locoTab.tabItem = tabItem= (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new T1E(null),MODID,null)
                ,MODID, "tab.TraincraftModernLocomotives.name",null,null,null,null);
        rollingstockTab.tabItem = tabItem= (ItemTransport) TiMGenericRegistry.RegisterItem(
                new ItemTransport(new T1TenderE(null),MODID,null)
                ,MODID, "tab.TraincraftModernRollingstock.name",null,null,null,null);
    }

    public static GenericRailTransport[] listSteamTrains() {
        return new GenericRailTransport[]{new T1E(null)};
    }

    /*public static GenericRailTransport[] listDieselTrains() {
        return new GenericRailTransport[]{};
    }*/

    /*public static GenericRailTransport[] listPassenger() {
        return new GenericRailTransport[] {};
    }*/

    /*public static GenericRailTransport[] listElectricTrains() {
        return new GenericRailTransport[] {};
    }*/
    public static GenericRailTransport[] listFreight() {
        return new GenericRailTransport[]{new T1TenderE(null)};
    }


}