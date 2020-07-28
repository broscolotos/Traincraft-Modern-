//FMT-Marker FVTM-1.4
//Using PER-GROUP-INIT mode with limit '500'!
package traincraftmodernplus.models.bogies.T1;

import ebf.tim.models.StaticModelAnimator;
import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.entity.Entity;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.5.4 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class T1FrontBogie extends RollingStockModel {

	public T1FrontBogie(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Broscolotos");
		//
		initGroup_FrontBogie();
	}

	private final void initGroup_FrontBogie(){
		TurboList FrontBogie = new TurboList("FrontBogie");
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 0, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 12, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f)
			.setRotationPoint(-53.5f, 4.5f, -6).setRotationAngle(0, 0, 0).setName("Box 219cp")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 226, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.421875f, 0, 0.125f, 0, 0, 0, 0, -1, 0, -0.5f, -1, 0, -0.421875f, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-50.5f, 3.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 219cp")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 505, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1, 1, 16, 0, 1, 1, 4, null)
			.setRotationPoint(-49.5f, 3.5f, 0).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 219, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.421875f, 0, 0.125f, -0.5f, -1, 0, 0, -1, 0, 0, 0, 0, -0.421875f, 0, 0.125f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, 3.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 219cp")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 208, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -1, 0, 0, -1, 0, 0, 0, 0, -0.421875f, 0, 0.125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.421875f, 0, 0.125f)
			.setRotationPoint(-50.5f, 3.5f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 219cp")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 405, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, -0.5f, -1, 0, -0.421875f, 0, 0.125f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.421875f, 0, 0.125f, 0, 0, 0)
			.setRotationPoint(-49.5f, 3.5f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 219cp")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 72, 185, textureX, textureY).addCylinder(0, 0, 0, 1, 1.5f, 16, 1, 1, 4, null)
			.setRotationPoint(-49.5f, 3, 0).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 332, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-53.5f, 6.25f, -7).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 375, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-60, 3.25f, -7).setRotationAngle(0, 0, 0).setName("Box 201")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 257, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-42.5f, 3.25f, -7).setRotationAngle(0, 0, 0).setName("Box 202")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 198, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(-56.5f, 3.25f, -7).setRotationAngle(0, 0, 0).setName("Box 203")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 137, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -2.375f, 0, 0, -2.375f, 0, 0, -0.5f, 0, 0, 1.5f, 0, 0, 2.5f, 0, 0, 2.5f, 0, 0, 1.5f, 0)
			.setRotationPoint(-55.5f, 3.25f, -7).setRotationAngle(0, 0, 0).setName("Box 204")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 132, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1.375f, 0, 0, -2, 0, 0, -2, 0, 0, -1.375f, 0, 0, 1.5f, 0, 0, 1.75f, 0, 0, 1.75f, 0, 0, 1.5f, 0)
			.setRotationPoint(-54.5f, 4.25f, -7).setRotationAngle(0, 0, 0).setName("Box 205")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 127, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, 0, -1.375f, 0, 0, -1.375f, 0, 0, -2, 0, 0, 1.75f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.75f, 0)
			.setRotationPoint(-45.5f, 4.25f, -7).setRotationAngle(0, 0, 0).setName("Box 206")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 122, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2.375f, 0, 0, 2.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 2.5f, 0)
			.setRotationPoint(-44.5f, 3.25f, -7).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 214, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f)
			.setRotationPoint(-42.5f, 5.25f, -7).setRotationAngle(0, 0, 0).setName("Box 209")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 97, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f)
			.setRotationPoint(-59.5f, 5.25f, -7).setRotationAngle(0, 0, 0).setName("Box 210")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 111, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0, -0.25f, 0)
			.setRotationPoint(-39, 3.25f, -7).setRotationAngle(0, 0, 0).setName("Box 211")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 106, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.375f, 0)
			.setRotationPoint(-61, 3.25f, -7).setRotationAngle(0, 0, 0).setName("Box 212")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 364, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-43, 5.25f, -6.875f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 278, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-60, 5.25f, -6.875f).setRotationAngle(0, 0, 0).setName("Box 214")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 398, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.375f, 0, -3, -0.375f, 0, -3, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-56, 5.25f, -7).setRotationAngle(0, 0, 0).setName("Box 216")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 391, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -3, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.125f, 0, -3, -0.125f)
			.setRotationPoint(-45, 5.25f, -7).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 55, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-54, 5, -7).setRotationAngle(0, 0, 0).setName("Box 218")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 198, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-55.5f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 219")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 101, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-53, 5, -7).setRotationAngle(0, 0, 0).setName("Box 220")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 22, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-47, 5, -7).setRotationAngle(0, 0, 0).setName("Box 221")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 112, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-53.5f, 6.25f, 6).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 14, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1.375f, 0, 0, -2, 0, 0, -2, 0, 0, -1.375f, 0, 0, 1.5f, 0, 0, 1.75f, 0, 0, 1.75f, 0, 0, 1.5f, 0)
			.setRotationPoint(-54.5f, 4.25f, 6).setRotationAngle(0, 0, 0).setName("Box 223")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 0, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -2.375f, 0, 0, -2.375f, 0, 0, -0.5f, 0, 0, 1.5f, 0, 0, 2.5f, 0, 0, 2.5f, 0, 0, 1.5f, 0)
			.setRotationPoint(-55.5f, 3.25f, 6).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 504, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(-56.5f, 3.25f, 6).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 152, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-60, 3.25f, 6).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 499, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.375f, 0)
			.setRotationPoint(-61, 3.25f, 6).setRotationAngle(0, 0, 0).setName("Box 227")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 494, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, 0, -1.375f, 0, 0, -1.375f, 0, 0, -2, 0, 0, 1.75f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 1.75f, 0)
			.setRotationPoint(-45.5f, 4.25f, 6).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 482, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2.375f, 0, 0, 2.5f, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 2.5f, 0)
			.setRotationPoint(-44.5f, 3.25f, 6).setRotationAngle(0, 0, 0).setName("Box 229")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 473, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1.5f, 0)
			.setRotationPoint(-43.5f, 3.25f, 6).setRotationAngle(0, 0, 0).setName("Box 230")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 141, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-42.5f, 3.25f, 6).setRotationAngle(0, 0, 0).setName("Box 231")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 468, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, 0, -0.25f, 0)
			.setRotationPoint(-39, 3.25f, 6).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 88, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0.25f, -0.875f, 0, 0.25f, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-42.5f, 5.25f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 233")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 79, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0.25f, -0.875f, 0, 0.25f, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.875f, -0.875f, 0, -0.875f, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-59.5f, 5.25f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 234")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 314, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-60, 5.25f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 235")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 303, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-43, 5.25f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 236")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 384, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -3, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.125f, 0, -3, -0.125f)
			.setRotationPoint(-45, 5.25f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 237")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 360, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0.25f, -0.375f, 0, 0.25f, -0.375f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, -0.875f, -0.375f, 0, -3, -0.375f, 0, -3, -0.125f, 0, -0.875f, -0.125f)
			.setRotationPoint(-56, 5.25f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 238")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 0, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-54, 5, 5.75f).setRotationAngle(0, 0, 0).setName("Box 239")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 402, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-55.5f, 4.5f, 5.75f).setRotationAngle(0, 0, 0).setName("Box 240")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 416, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-53, 5, 6).setRotationAngle(0, 0, 0).setName("Box 241")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 334, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-47, 5, 6).setRotationAngle(0, 0, 0).setName("Box 242")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 298, 237, textureX, textureY).addCylinder(0, 0, 0, 1, 10, 30, 1, 1, 0, null)
			.setRotationPoint(-41, 6.75f, -5.25f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 225, 237, textureX, textureY).addCylinder(0, 0, 0, 1, 10, 30, 1, 1, 0, null)
			.setRotationPoint(-58, 6.75f, -5.25f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 329, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1.5f, 0)
			.setRotationPoint(-43.5f, 3.25f, -7).setRotationAngle(0, 0, 0).setName("Box 208")
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 9, 25, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 30, 0.9375f, 0.9375f, 1, new Vec3f(0.0, 0.0, 0.625))
			.setRotationPoint(-41, 6.5f, -6.625f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 236, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 30, 0.9375f, 0.9375f, 1, new Vec3f(0.0, 0.0, 0.625))
			.setRotationPoint(-58, 6.5f, -6.625f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 9, 25, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 30, 0.9375f, 0.9375f, 1, new Vec3f(0.0, 0.0, 0.625))
			.setRotationPoint(-41, 6.5f, 5).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 236, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 30, 0.9375f, 0.9375f, 1, new Vec3f(0.0, 0.0, 0.625))
			.setRotationPoint(-58, 6.5f, 5).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 0, 104, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(-58, 6.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 0, 129, textureX, textureY).addCylinder(0, 0, 0, 2.8125f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-58, 6.5f, -5.625f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 494, 63, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-58, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 412, 103, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(-41, 6.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 493, 96, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 30, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-41, 6.5f, -5.625f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 186, 62, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-41, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 412, 94, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(-58, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 0, 121, textureX, textureY).addCylinder(0, 0, 0, 2.8125f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-58, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 398, 35, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-58, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 493, 87, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(-41, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 494, 73, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 30, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-41, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		FrontBogie.add(new ModelRendererTurbo(FrontBogie, 495, 20, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-41, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(FrontBogie);
	}

}
