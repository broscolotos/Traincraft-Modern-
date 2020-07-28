
package traincraftmodernplus.entities.tenders;
        import cpw.mods.fml.relauncher.Side;
        import cpw.mods.fml.relauncher.SideOnly;
        import ebf.tim.TrainsInMotion;
        import ebf.tim.api.RollingstockBase;
        import ebf.tim.api.SkinRegistry;
        import ebf.tim.items.ItemTransport;
        import ebf.tim.models.Bogie;
        import ebf.tim.utility.FuelHandler;
        import fexcraft.tmt.slim.ModelBase;
        import net.minecraft.init.Items;
        import net.minecraft.item.Item;
        import net.minecraft.item.ItemStack;
        import net.minecraft.world.World;
        import traincraftmodernplus.TrancraftModernPlus;
        import traincraftmodernplus.models.bogies.T1.T1TenderBogie;

        import java.util.List;
        import java.util.UUID;

/**
 * <h1>T1 Tender entity</h1>
 * designed after the : Original T1 Tenders'
 * This class is intended to serve as the primary example for API use.
 * @author Eternal Blue Flame
 */
public class T1TenderE extends RollingstockBase {

    /*    public static final String[] itemDescription = new String[]{
                "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 4" + StatCollector.translateToLocal("menu.item.tons"),
                "\u00A77" + StatCollector.translateToLocal("menu.item.sizeof") +": 13.4" + StatCollector.translateToLocal("gui.buckets")};*/
    public static final Item thisItem = new ItemTransport(new T1TenderE(null), TrancraftModernPlus.MODID, TrancraftModernPlus.rollingstockTab);

    public T1TenderE(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public T1TenderE(World world){
        super(world);
    }

    /*
     * <h1>Variable Overrides</h1>
     */

    @SideOnly(Side.CLIENT)
    public Bogie[] bogies(){
        return new Bogie[]{
                new Bogie(new T1TenderBogie(),8.45f,0f,0),
                new Bogie(new T1TenderBogie(),4.525f,0f,0),
        };
    }


    @Override
    public float[] bogieLengthFromCenter(){return new float[]{1.925f,-2};}

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-8.45f,0f,0}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), TrancraftModernPlus.MODID, "textures/tenders/T1Tender.png",
                new String[]{"textures/bogies/T1Bogie.png"},
                "PRR T1 Tender",
               "A tender for the PRR T1s numbers 6110 and 6111");
    }

    @Override
    public boolean isReinforced() {
        return false;
    }

    @Override
    public int getInventoryRows(){return 3;}
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.TANKER.singleton();}
    @Override
    public float[][] getRiderOffsets(){return null;}

    @Override
    public float[] getHitboxSize() {
        return new float[]{7.75f,2.25f,1.75f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public Item getItem(){
        return thisItem;
    }
    @Override
    public int[] getTankCapacity(){return new int[]{13400};}

    @Override
    public String[][] getTankFilters() {
        return null;
    }

    @Override
    public int getRFCapacity() {
        return 0;
    }

    @Override
    public void manageFuel(){

    }

    @Override
    public float weightKg() {
        return 199208.7f;
    }

    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    @Override
    public String transportName() {
        return "T1 Tender";
    }

    @Override
    public String transportcountry() {
        return "US";
    }

    @Override
    public String transportYear() {
        return "1942";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    @Override
    public float transportTopSpeed() {
        return 0;
    }

    @Override
    public boolean isFictional() {
        return false;
    }

    @Override
    public float transportTractiveEffort() {
        return 0;
    }

    @Override
    public float transportMetricHorsePower() {
        return 0;
    }

    @Override
    public String[] additionalItemText() {
        return new String[]{""};
    }

    @Override
    public float getMaxFuel() {
        return 0;
    }


    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new traincraftmodernplus.models.tenders.T1Tender()};}
}
