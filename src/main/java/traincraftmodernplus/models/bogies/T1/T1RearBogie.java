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
public class T1RearBogie extends RollingStockModel {

	public T1RearBogie(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Broscolotos");
		//
		initGroup_Rear_Bogie();
	}

	private final void initGroup_Rear_Bogie(){
		TurboList Rear_Bogie = new TurboList("Rear_Bogie");
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 70, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.0625f, 0.25f, 0, -0.0625f, 0.25f, 0, 0, 0, 0, 0, 0, 0.5f, -0.0625f, 0.25f, 0.5f, -0.0625f, 0.25f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(60.5f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 398")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 353, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.0625f, 0.5f, 0, -0.0625f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(60.5f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 399")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 282, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.0625f, -0.25f, -0.5f, -0.0625f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60.5f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 400")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 275, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(60.5f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 401")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 316, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0.5f, 0, -0.0625f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(60.5f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 402")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 311, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.0625f, -1, -0.375f, -0.0625f, -1, -0.375f, 0, 0, -0.375f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60.5f, 2, -7).setRotationAngle(0, 0, 0).setName("Box 403")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 306, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, 0, -1, -0.375f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42.5f, 2, -7).setRotationAngle(0, 0, 0).setName("Box 405")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 301, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(42.5f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 406")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 121, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.5f, 0, 0, 0.125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0.125f, 0, 0)
			.setRotationPoint(41.5f, 4, -7).setRotationAngle(0, 0, 0).setName("Box 407")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 107, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.75f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, 0.75f, -0.75f, 0, 1.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(41.5f, 4.75f, -7).setRotationAngle(0, 0, 0).setName("Box 408")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 100, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0.75f, 0, 0)
			.setRotationPoint(41.5f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 409")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 464, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 3, 1, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(43.5f, 2.5f, -7).setRotationAngle(0, 0, 0).setName("Box 411")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 220, 237, textureX, textureY).addCylinder(0, 0, 0, 1, 10, 30, 1, 1, 0, null)
			.setRotationPoint(47, 6.5f, -4.875f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 215, 237, textureX, textureY).addCylinder(0, 0, 0, 1, 10, 30, 1, 1, 0, null)
			.setRotationPoint(57, 6.5f, -4.875f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 287, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.0625f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0.5f, -0.0625f, 0, 0.5f, -0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0)
			.setRotationPoint(63.75f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 277, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(65, 6, -5.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 268, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, -1, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(64.75f, 6, -6.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 253, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.0625f, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.0625f)
			.setRotationPoint(63.75f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 239, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0.5f, 0, 0.25f, 0.5f, 0)
			.setRotationPoint(65, 6, 4.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 203, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -1, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(64.75f, 6, 5.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 27, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, -0.0625f, 0, 0.5f, -0.0625f)
			.setRotationPoint(60.5f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 93, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60.5f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 79, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60.5f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 400cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 72, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60.5f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 401cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 163, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60.5f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 402cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 158, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60.5f, 2, 6).setRotationAngle(0, 0, 0).setName("Box 403cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 204, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.0625f, 0, 0.5f, -0.0625f)
			.setRotationPoint(40, 6, 6).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 153, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.0625f, -1, -0.375f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(42.5f, 2, 6).setRotationAngle(0, 0, 0).setName("Box 405cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 148, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0.5f, 0, -0.0625f)
			.setRotationPoint(42.5f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 406cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 65, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.5f, 0, -0.0625f, 0.125f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0.125f, 0, -0.0625f)
			.setRotationPoint(41.5f, 4, 6).setRotationAngle(0, 0, 0).setName("Box 407cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 53, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.0625f, 0.75f, -0.75f, -0.0625f, 1.5f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 1.5f, 0, -0.0625f)
			.setRotationPoint(41.5f, 4.75f, 6).setRotationAngle(0, 0, 0).setName("Box 408cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 26, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.125f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.0625f, 0.125f, -0.5f, -0.0625f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0.75f, 0, -0.0625f)
			.setRotationPoint(41.5f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 409cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 494, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.0625f, 0.5f, -0.75f, -0.0625f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0.5f, 0, -0.0625f)
			.setRotationPoint(40.5f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 410cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 482, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(65, 6, -4.5f).setRotationAngle(0, 0, 0).setName("Box 398cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 374, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, -1, 1, 0, -0.75f, 0, 0, -0.75f, -0.0625f, -0.25f, -1, -1, -0.25f, 0, 1, 0, 0, 0, 0, 0, -0.0625f, -0.25f, 0, -1)
			.setRotationPoint(37, 5, 6).setRotationAngle(0, 0, 0).setName("Box 410cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 336, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 1, -0.25f, 0, 0, -0.25f, 0, -0.0625f, 0, 0, -1, 0, 0.5f, 1, -0.25f, 0.5f, 0, -0.25f, 0.5f, -0.0625f, 0, 0.5f, -1)
			.setRotationPoint(37.25f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 51, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.0625f, -0.5f, 0, -0.0625f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.0625f, -0.5f, 0.5f, -0.0625f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(40, 6, -7).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 301, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, -0.75f, -0.0625f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(40.5f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 410cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 248, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, -1, -1, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.25f, -1, 1, -0.25f, 0, -1, 0, 0, -0.0625f, 0, 0, 0, -0.25f, 0, 1)
			.setRotationPoint(37, 5, -7).setRotationAngle(0, 0, 0).setName("Box 410cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 224, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -1, -0.25f, 0, -0.0625f, -0.25f, 0, 0, 0, 0, 1, 0, 0.5f, -1, -0.25f, 0.5f, -0.0625f, -0.25f, 0.5f, 0, 0, 0.5f, 1)
			.setRotationPoint(37.25f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 135, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -1.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 1.75f, 0, 0.5f, -1.75f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 1.75f)
			.setRotationPoint(34.75f, 6, -6).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 126, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 1.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1.75f, 0, 0.5f, 1.75f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, -1.75f)
			.setRotationPoint(34.75f, 6, 5).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 108, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 2.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -2.25f, 0, 0.5f, 2.25f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, -2.25f)
			.setRotationPoint(32.25f, 6, 3.25f).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 61, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -2.25f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 2.25f, 0, 0.5f, -2.25f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 2.25f)
			.setRotationPoint(32.25f, 6, -4.25f).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 52, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 1, 0, 0.5f, -1, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0.5f, 1)
			.setRotationPoint(29.5f, 6, -2).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 1, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -1, 0, 0.5f, 1, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0.5f, -1)
			.setRotationPoint(29.5f, 6, 1).setRotationAngle(0, 0, 0).setName("Box 404cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 485, 6, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 1, 1, 5, null)
			.setRotationPoint(29.5f, 5, 0).setRotationAngle(0, 180, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 198, 237, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 1.0E-15f, 2.5f, 16, 8, 1, 1, 5, null)
			.setRotationPoint(29.5f, 6, 0).setRotationAngle(0, 180, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 370, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 3, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(43.5f, 2.5f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 499, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(46, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 92, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(47, 4.6875f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 78, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(47, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 69, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(47, 7.3125f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 64, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(47, 7.375f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 59, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(46, 4.6875f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 43, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(46, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 31, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(46, 7.3125f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 463, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(46, 7.375f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 463, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(46, 5.3125f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 456, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(46, 7.125f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 507, 78, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(47, 6.5f, 7).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 507, 59, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 16, 0.9375f, 1, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(47, 6.5f, 6.125f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 449, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(56, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 402, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(57, 4.6875f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 296, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(57, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 260, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(57, 7.3125f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 10, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(57, 7.375f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 5, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(56, 4.6875f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 439, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(56, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 434, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(56, 7.3125f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 429, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(56, 7.375f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 268, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(56, 5.3125f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 254, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(56, 7.125f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 208, 54, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57, 6.5f, 7).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 202, 37, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 16, 0.9375f, 1, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(57, 6.5f, 6.125f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 503, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f)
			.setRotationPoint(45.5f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 475, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f)
			.setRotationPoint(55.5f, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 247, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f)
			.setRotationPoint(43.5f, 5.75f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 240, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f)
			.setRotationPoint(48.5f, 5.75f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 233, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f)
			.setRotationPoint(53.5f, 5.75f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 205, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f)
			.setRotationPoint(58.5f, 5.75f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 424, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.375f, -0.0625f, 0, 0.375f, -0.0625f, 0, 0.375f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.0625f, 0, 0.375f, -0.0625f)
			.setRotationPoint(50.5f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 411, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f)
			.setRotationPoint(51.5f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 397, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.25f, 0, -0.75f, 0.0625f, 0, -0.75f, 0.0625f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(50.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 392, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.0625f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.0625f, 0, 0.0625f, -0.0625f)
			.setRotationPoint(51, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 355, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.125f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.0625f, 0, -0.125f, -0.0625f)
			.setRotationPoint(51.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 350, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.0625f, 0, 0, 0.25f, 0, 0, 0.25f, -0.0625f, -0.75f, 0.0625f, -0.0625f)
			.setRotationPoint(52.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 345, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, 0, 0, 0.0625f, 0, 0, 0.0625f, -0.0625f, -0.75f, -0.125f, -0.0625f)
			.setRotationPoint(52, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 324, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.25f, 0, 0, -0.125f, 0, 0, -0.125f, -0.0625f, -0.75f, -0.25f, -0.0625f)
			.setRotationPoint(51.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 273, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f)
			.setRotationPoint(50.5f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 249, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f)
			.setRotationPoint(50.5f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 219, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(50.5f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 211, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f)
			.setRotationPoint(50.5f, 4.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 122, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f)
			.setRotationPoint(42.75f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 111, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f)
			.setRotationPoint(42.75f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 106, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(42.75f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 101, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(42.75f, 4.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 27, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, -0.0625f, -0.75f, 0.375f, -0.0625f, -0.75f, 0.25f, 0, 0, 0.375f, 0, 0, 0.375f, -0.0625f, -0.75f, 0.25f, -0.0625f)
			.setRotationPoint(52.5f, 6, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 22, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f)
			.setRotationPoint(52.5f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f)
			.setRotationPoint(52.5f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 507, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(52.5f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 487, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(52.5f, 4.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 482, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f)
			.setRotationPoint(60.25f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 473, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f)
			.setRotationPoint(60.25f, 5.0625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 468, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(60.25f, 4.625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 416, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f)
			.setRotationPoint(60.25f, 4.5625f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 406, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(62.5f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 332, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(62.25f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 316, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(62, 4, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 311, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(61.5f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 306, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0.125f, 0, -1, 0.125f, 0, 0, 0, 0, -1, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(60.5f, 2.375f, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 473, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(43.5f, 2.375f, 6).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 301, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(40.375f, 4.5f, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 292, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(41, 4, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 287, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(41.5f, 3, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 278, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0.125f, 0, 0, 0, 0, 0, 0, 0, -1, 0.125f, 0, 0.125f, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0.125f, -0.375f, 0)
			.setRotationPoint(42.5f, 2.375f, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 256, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.125f, 0.015625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, -0.125f, 0.015625f, -0.109375f)
			.setRotationPoint(39.75f, 4.75f, 6).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 198, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(43.5f, 5.75f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 191, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(48.5f, 5.75f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 184, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(53.5f, 5.75f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 177, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0.125f, -0.0625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(58.5f, 5.75f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 240, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, -0.0625f, -0.75f, 0.375f, -0.0625f, -0.75f, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, -0.0625f, -0.75f, 0.25f, -0.0625f, -0.75f, 0.25f, 0, 0, 0.375f, 0)
			.setRotationPoint(50.5f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 235, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(51.5f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 230, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, -0.0625f, -0.75f, 0.0625f, -0.0625f, -0.75f, 0.0625f, 0, 0, 0.25f, 0)
			.setRotationPoint(50.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 225, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0, 0, 0.0625f, -0.0625f, -0.75f, -0.125f, -0.0625f, -0.75f, -0.125f, 0, 0, 0.0625f, 0)
			.setRotationPoint(51, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 199, 312, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0, 0, -0.125f, -0.0625f, -0.75f, -0.25f, -0.0625f, -0.75f, -0.25f, 0, 0, -0.125f, 0)
			.setRotationPoint(51.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 337, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.0625f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, 0, -0.75f, 0.0625f, 0)
			.setRotationPoint(52.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 268, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.125f, -0.0625f, 0, 0.0625f, -0.0625f, 0, 0.0625f, 0, -0.75f, -0.125f, 0)
			.setRotationPoint(52, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 206, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.0625f, 0, -0.125f, -0.0625f, 0, -0.125f, 0, -0.75f, -0.25f, 0)
			.setRotationPoint(51.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 114, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(46, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 14, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(50.5f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 9, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(50.5f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 4, 311, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.5f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 439, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(50.5f, 4.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 434, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(42.75f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 429, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(42.75f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 424, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(42.75f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 412, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(42.75f, 4.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 402, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0.375f, -0.0625f, 0, 0.375f, -0.0625f, 0, 0.375f, 0, -0.75f, 0.375f, 0, -0.75f, 0.25f, -0.0625f, 0, 0.375f, -0.0625f, 0, 0.375f, 0, -0.75f, 0.25f, 0)
			.setRotationPoint(52.5f, 6, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 397, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(52.5f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 392, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(52.5f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 355, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, -0.0625f, -0.125f, -0.9375f, -0.0625f, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(52.5f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 350, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, -0.0625f, -0.25f, -0.875f, -0.0625f, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, -0.0625f, -0.125f, 0, -0.0625f, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(52.5f, 4.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 345, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(60.25f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 297, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(60.25f, 5.0625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 115, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, -0.0625f, -0.75f, -0.9375f, -0.0625f, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(60.25f, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 110, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.0625f, -0.75f, -0.875f, -0.0625f, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(60.25f, 4.5625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 506, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(47, 4.6875f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 501, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(47, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 487, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(47, 7.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 482, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(47, 7.375f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 473, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(46, 4.6875f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 468, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(46, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 333, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(46, 7.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 315, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(46, 7.375f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 86, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(46, 5.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 46, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(46, 7.125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 234, 22, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(47, 6.5f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 7, 22, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 16, 0.9375f, 1, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(47, 6.5f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 421, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(45.5f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 39, 290, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(56, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 310, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(57, 4.6875f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 305, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(57, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 292, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0)
			.setRotationPoint(57, 7.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 287, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0)
			.setRotationPoint(57, 7.375f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 279, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(56, 4.6875f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 257, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(56, 4.625f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 241, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.125f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.75f, -0.9375f, 0, -0.125f, -0.9375f, 0)
			.setRotationPoint(56, 7.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 236, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.125f, 0, 0, -0.25f, -0.875f, 0, -0.75f, -0.875f, 0, -0.75f, -0.875f, 0, -0.25f, -0.875f, 0)
			.setRotationPoint(56, 7.375f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 347, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(56, 5.3125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 327, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(56, 7.125f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 234, 16, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57, 6.5f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 7, 16, textureX, textureY).addCylinder(0, 0, 0, 0.9375f, 1, 16, 0.9375f, 1, 0, new Vec3f(0.0, 0.0, -0.9375))
			.setRotationPoint(57, 6.5f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 403, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.125f, 0, -0.1875f, -0.125f, 0, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(55.5f, 5.5f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 231, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.0625f, -0.375f, 0, -0.0625f, -0.375f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(62.5f, 5, -7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 226, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(62.25f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 202, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(62, 4, -7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 197, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(61.5f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 182, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0.125f, 0, -1, 0.125f, 0, 0, 0, 0, -1, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, -1, -0.375f, 0)
			.setRotationPoint(60.5f, 2.375f, -7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 473, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(43.5f, 2.375f, -7).setRotationAngle(0, 0, 0).setName("Box 411cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 177, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(40.375f, 4.5f, -7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(41, 4, -7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 268, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(41.5f, 3, -7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 192, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0.125f, 0, 0, 0, 0, 0, 0, 0, -1, 0.125f, 0, 0.125f, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, 0, 0.125f, -0.375f, 0)
			.setRotationPoint(42.5f, 2.375f, -7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 161, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, -0.75f, 0, -0.125f, 0.015625f, -0.109375f, -0.75f, 0, -0.0625f, -0.75f, 0, 0, -0.125f, 0.015625f, 0)
			.setRotationPoint(39.75f, 4.75f, -7).setRotationAngle(0, 0, 0).setName("Box 399cp")
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 9, 25, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 30, 0.9375f, 0.9375f, 1, new Vec3f(0.0, 0.0, 0.625))
			.setRotationPoint(57, 6.5f, 5).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 236, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 30, 0.9375f, 0.9375f, 1, new Vec3f(0.0, 0.0, 0.625))
			.setRotationPoint(47, 6.5f, 5).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 211, 96, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(47, 6.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 200, 121, textureX, textureY).addCylinder(0, 0, 0, 2.8125f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(47, 6.5f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 487, 45, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(47, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 198, 96, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(57, 6.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 96, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 30, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(57, 6.5f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 487, 35, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(57, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 82, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(47, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 493, 104, textureX, textureY).addCylinder(0, 0, 0, 2.8125f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(47, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 485, 10, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(47, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 0, 73, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(57, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 408, 45, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 30, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(57, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 490, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(57, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 9, 25, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 30, 0.9375f, 0.9375f, 1, new Vec3f(0.0, 0.0, 0.625))
			.setRotationPoint(57, 6.5f, -6.625f).setRotationAngle(0, 0, 0)
		);
		Rear_Bogie.add(new ModelRendererTurbo(Rear_Bogie, 236, 19, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 30, 0.9375f, 0.9375f, 1, new Vec3f(0.0, 0.0, 0.625))
			.setRotationPoint(47, 6.5f, -6.625f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(Rear_Bogie);
	}

}
