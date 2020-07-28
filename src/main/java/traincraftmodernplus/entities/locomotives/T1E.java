
package traincraftmodernplus.entities.locomotives;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.FuelHandler;
import fexcraft.tmt.slim.ModelBase;

import java.util.List;
import java.util.UUID;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import traincraftmodernplus.models.bogies.T1.T1RearBogie;
import traincraftmodernplus.models.bogies.T1.T1FrontBogie;
import traincraftmodernplus.TrancraftModernPlus;

/**
 * <h1>PRR T1 Entity</h1>
 * designed after the : PRR T1 No. 6110'
 * This class is intended to serve as the primary example for API use.
 * @author Eternal Blue Flame
 */
public class T1E extends EntityTrainCore {


    public static final Item thisItem = new ItemTransport(new T1E(null), TrancraftModernPlus.MODID, TrancraftModernPlus.locoTab);


    public T1E(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public T1E(World world){
        super(world);
    }

    @Override
    public String transportName(){return "T1";}
    @Override
    public String transportcountry(){return "United States";}
    @Override
    public String transportYear(){return "1942";}

    @Override
    public String transportFuelType() {
        return null;
    }

    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 	64650f;}

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), TrancraftModernPlus.MODID, "textures/locomotive/T1Loco.png",
                "T1 6110",
                "This is a skin made after the PRR T1 No. 6110");
    }

    /*
     * <h1>Variable Overrides</h1>
     * We override the functions defined in the super here, to give them different values.
     * This is more efficient than having to store them in the super, or actual variables, because we won't have to store them in the NBT or RAM.
     */


    /**
     * <h2>Max speed</h2>
     * @return the value of the max speed in km/h
     */
    @Override
    public float transportTopSpeed(){return 218.871f;}

    /**
     * <h2>Inventory Size</h2>
     * @return the size of the inventory not counting any fuel or crafting slots, those are defined by the type.
     */
    @Override
    public int getInventoryRows(){return 3;}
    /**
     * <h2>Type</h2>
     * @return the type which will define it's features, GUI, a degree of storage (like crafting slots), and a number of other things.
     */
    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){return TrainsInMotion.transportTypes.STEAM.singleton();}
    /**
     * <h2>Max Fuel</h2>
     * @return the maxstorage of fuel the train can store.
     * @see FuelHandler for information on fuel consumption.
     */
    @Override
    public float getMaxFuel(){return 1;}
    /**
     * <h2>Rider offset</h2>
     * @return defines the offsets of the riders in blocks, the first value is how far back, and the second is how high.
     *     Negative values are towards the front, ground, or right. In that order.
     *     Each set of floats represents a different rider.
     *     Only the first 3 values of each set of floats are actually used.
     */
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{4.25f,1.5f, 0f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{9.325f,2.25f,1.75f};
    }

    /**
     * <h2>Acceleration</h2>
     * <h4>TRAINS ONLY.</h4>
     * @return defines the acceleration.
     */
    @Override
    public float transportMetricHorsePower(){return 6642.874f;}

    @Override
    public String[] additionalItemText() {
        return new String[]{""};
    }

    @Override
    public float weightKg(){return 222722.9f;}

    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    /**
     * <h2>Animation radius</h2>
     * @return defines the radius in microblocks (1/16 of a block) for the piston rotations.
     */
    @Override
    public float getPistonOffset(){return 0.5f;}

    @Override

    @SideOnly(Side.CLIENT)
    public Bogie[] bogies() {
        return new Bogie[]{
                new Bogie(new T1FrontBogie(), 0.05f, 0.0f, 0.0f),
                new Bogie(new T1RearBogie(), 0.05f, 0.0f, 0.0f),
                };
    }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2.95f, -3.4f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.05f,0.0f,0.0f}};
    }

    /**
     * <h2>rider sit or stand</h2>
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    /**
     * <h2>reinforced transport</h2>
     * this returns if this specific entity is reinforced (explosion proof and damage resistant).
     * since this is a function it can be conditional as well, for instance if it has a specific skin.
     */
    @Override
    public boolean isReinforced(){return false;}

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    @Override
    public int[] getTankCapacity(){return new int[]{9161, 800};}


    /**
     * <h2>fluid filter</h2>
     * defines what fluids can and can't be stored in the tank.
     * for instance if you have a wooden tanker car, you can deny fluids that are fire sources (like lava).
     */
    @Override
    public String[][] getTankFilters(){
        return new String[][]{{FluidRegistry.WATER.getName()},{FluidRegistry.LAVA.getName()}};
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return TileEntityFurnace.getItemBurnTime(stack)>0;}
            case 401:{return FluidContainerRegistry.getFluidForFilledItem(stack)!=null && canFill(null, FluidContainerRegistry.getFluidForFilledItem(stack).getFluid());}
            default:{return true;}
        }
    }

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */
    @Override
    public void manageFuel(){
        fuelHandler.manageSteam(this);
    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }


    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new traincraftmodernplus.models.locomotives.T1Main()};}

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("ProjectOne.ogg");}
    //   SkinRegistry.addSkin(this.getClass(), TrancraftModern.MODID, "textures/locomotive/ProjectOne.png"
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
