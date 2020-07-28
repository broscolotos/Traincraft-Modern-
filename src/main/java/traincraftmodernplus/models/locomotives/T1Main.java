//FMT-Marker FVTM-1.4
//Using PER-GROUP-INIT mode with limit '500'!
package traincraftmodernplus.models.locomotives;

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
public class T1Main extends RollingStockModel {

	public T1Main(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Broscolotos");
		//
		initGroup_Frame0();
		initGroup_Frame1();
		initGroup_Frame2();
		initGroup_Frame3();
		initGroup_Rest_of_locomotive();
	}

	private final void initGroup_Frame0(){
		TurboList Frame = new TurboList("Frame");
		Frame.add(new ModelRendererTurbo(Frame, 13, 102, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1, 1, 30, 0, 1, 1, 0, null)
			.setRotationPoint(-29, 2.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 13, 96, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1, 1, 30, 0, 1, 1, 0, null)
			.setRotationPoint(-29, 2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 201, 62, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1, 1, 30, 0, 1, 1, 0, null)
			.setRotationPoint(-13.5f, 2.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 502, 48, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1, 1, 30, 0, 1, 1, 0, null)
			.setRotationPoint(-13.5f, 2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 397, 47, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1, 1, 30, 0, 1, 1, 0, null)
			.setRotationPoint(12, 2.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 47, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1, 1, 30, 0, 1, 1, 0, null)
			.setRotationPoint(12, 2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 502, 42, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1, 1, 30, 0, 1, 1, 0, null)
			.setRotationPoint(27.5f, 2.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 446, 16, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1, 1, 30, 0, 1, 1, 0, null)
			.setRotationPoint(27.5f, 2.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 117, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(-31, 0.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 106, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(-15.5f, 0.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 95, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(-31, 0.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 263, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(-15.5f, 0.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 252, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(10, 0.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 241, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(25.5f, 0.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 230, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(10, 0.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 491, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f, -0.25f, -0.25f, -0.125f)
			.setRotationPoint(25.5f, 0.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 93, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-32.75f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 72, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-27.75f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 55, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-32.75f, -1.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 489, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-32.75f, 4.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 65, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-17.25f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 52, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-12.25f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.25f, -1.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 330, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.25f, 4.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 20, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-17.25f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 7, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-12.25f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 161, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.25f, -1.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 55, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.25f, 4.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-32.75f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 459, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-27.75f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 489, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-32.75f, -1.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 161, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-32.75f, 4.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 452, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(8.25f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 425, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(13.25f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(8.25f, -1.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 330, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(8.25f, 4.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 366, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(23.75f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 329, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(28.75f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 55, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.75f, -1.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.75f, 4.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 266, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(23.75f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 252, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(28.75f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 489, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.75f, -1.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 332, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.75f, 4.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 169, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(8.25f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 86, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(13.25f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 161, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(8.25f, -1.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 332, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(8.25f, 4.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 273, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, -0.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, 3.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 489, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, -0.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 55, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, 3.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, -0.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 483, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, 3.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 55, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, -0.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, 3.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 45, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 27, 296, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.25f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 20, 332, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-24.25f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 15, 332, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-24.25f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 10, 332, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.25f, 2.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 5, 332, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.25f, 2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 313, 331, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-19.25f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 308, 331, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-19.25f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 303, 331, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.25f, 2.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 232, 331, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-19.25f, 2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 227, 331, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.75f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 222, 331, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-22.75f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 217, 331, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-22.75f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 212, 331, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.75f, 2.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 142, 331, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-22.75f, 2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 495, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-20.75f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 490, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-20.75f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 485, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.75f, 2.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 480, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.75f, 2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 295, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 288, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.25f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 475, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-24.25f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 470, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-24.25f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 465, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.25f, 2.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 460, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-24.25f, 2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 437, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-19.25f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 432, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-19.25f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 427, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19.25f, 2.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 422, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-19.25f, 2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 417, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21.75f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 412, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-22.75f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 137, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-22.75f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 132, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.75f, 2.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 127, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-22.75f, 2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 122, 330, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-20.75f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 455, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-20.75f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 35, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.75f, 2.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 30, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.75f, 2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 259, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 225, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(22.75f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 25, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(16.75f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 20, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16.75f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 15, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, 2.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 10, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, 2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 5, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(21.75f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 112, 328, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(21.75f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 107, 328, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.75f, 2.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 88, 328, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(21.75f, 2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 102, 328, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.25f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 83, 328, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(18.25f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 78, 328, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(18.25f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 59, 328, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, 2.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 397, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(18.25f, 2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 360, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(20.25f, 0.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 355, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(20.25f, 1, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 350, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.25f, 2.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 345, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(20.25f, 2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 218, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 211, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(22.75f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 283, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(16.75f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 278, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16.75f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 273, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, 2.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 268, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, 2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 186, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(21.75f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 181, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(21.75f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 176, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21.75f, 2.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 171, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(21.75f, 2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 97, 328, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19.25f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 122, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(18.25f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 69, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(18.25f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 392, 326, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.25f, 2.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 383, 326, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(18.25f, 2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 378, 326, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(20.25f, 0.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 373, 326, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(20.25f, 1, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 211, 326, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.25f, 2.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 64, 326, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(20.25f, 2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 59, 325, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f)
			.setRotationPoint(-21.75f, 1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 470, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f)
			.setRotationPoint(-21.75f, 1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 465, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f)
			.setRotationPoint(19.25f, 1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 460, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f)
			.setRotationPoint(19.25f, 1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 141, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-20.625f, 1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 94, 62, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 16, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-18.875f, 1.875f, -4.375f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 134, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-23.625f, 1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 47, 62, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 16, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-23.625f, 1.875f, -4.375f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 192, 37, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 2, 16, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-23.625f, 1.875f, -4.75f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 127, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-20.625f, 1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 62, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 16, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-18.875f, 1.875f, 3.625f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 79, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-23.625f, 1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 509, 50, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 16, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(-23.625f, 1.875f, 3.625f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-19.375f, -3.125f, -5.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 450, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-19.375f, -3.125f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 445, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-24.125f, -3.125f, -5.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 298, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-24.125f, -3.125f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 293, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-19.375f, -3.125f, 2.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 502, 326, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-19.375f, -3.125f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 507, 325, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-24.125f, -3.125f, 2.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 43, 325, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(-24.125f, -3.125f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 455, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(-19.375f, -3.25f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 407, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.75f, -1.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 396, 238, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, -1.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 450, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(-24.125f, -3.25f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 445, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(-19.375f, -3.25f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 397, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(-24.125f, -3.25f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 68, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(-14.5f, -2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 392, 323, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(-13.5f, -2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 384, 323, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(-30, -2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 379, 323, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(-29, -2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 374, 323, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(-14.5f, -2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 434, 322, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(-13.5f, -2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 429, 322, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(-30, -2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 424, 322, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(-29, -2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 379, 228, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20.75f, -1.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 71, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, -1.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 369, 323, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-8.625f, -3.125f, -5.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 358, 323, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-8.625f, -3.125f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 224, 323, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-8.625f, -3.125f, 2.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 503, 322, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-8.625f, -3.125f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 402, 322, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(-8.625f, -3.25f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 332, 322, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(-8.625f, -3.25f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 324, 322, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-8.625f, -1.875f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 312, 322, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-8.625f, -1.875f, 3.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 412, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(-8.75f, -1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 397, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(-8.75f, -1.375f, 3.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 337, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-8.75f, -1.375f, 3.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 307, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(-9.375f, -1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 302, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(-9.375f, -1.375f, 3.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 249, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-9.375f, -1.375f, 3.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 241, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(-8.75f, -1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 163, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-8.75f, -1.375f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 158, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(-8.75f, -1.375f, -4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 153, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(-9.375f, -1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 148, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-9.375f, -1.375f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 93, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(-9.375f, -1.375f, -4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 88, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-9.375f, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 83, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-8.75f, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 78, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-9.375f, -1.3125f, 2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 69, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-8.75f, -1.3125f, 2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 196, 322, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(-8.75f, -1.3125f, -2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 64, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-34.875f, -3.125f, -5.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 59, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-34.875f, -3.125f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 43, 321, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-34.875f, -3.125f, 2.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 482, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(-34.875f, -3.125f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 407, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(-34.875f, -3.25f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 392, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(-34.875f, -3.25f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 384, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-34.875f, -1.875f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 379, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(-34.875f, -1.875f, 3.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 374, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(-35, -1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 369, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(-35, -1.375f, 3.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 358, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-35, -1.375f, 3.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 353, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(-35.625f, -1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 345, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(-35.625f, -1.375f, 3.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-35.625f, -1.375f, 3.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 297, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(-35, -1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 259, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-35, -1.375f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 224, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(-35, -1.375f, -4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 137, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(-35.625f, -1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 132, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(-35.625f, -1.375f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 127, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(-35.625f, -1.375f, -4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 111, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-35.625f, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 106, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-35, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 101, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-35.625f, -1.3125f, 2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 22, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(-35, -1.3125f, 2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 345, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(-35, -1.3125f, -2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 374, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.25f, 0, -3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 345, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17.25f, 4, -3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-32.75f, 0, -3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 220, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-32.75f, 4, -3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 221, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, 0, -3).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 114, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25.75f, 4, -3).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 38, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(20.375f, 1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 509, 46, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 16, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(22.125f, 1.875f, -4.375f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 14, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(17.375f, 1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 509, 42, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 16, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(17.375f, 1.875f, -4.375f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.125f, -0.25f, 0.25f, -0.125f, -0.25f, 0.25f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(20.375f, 1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 419, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 16, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(22.125f, 1.875f, 3.625f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 492, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, 0.25f, -0.125f, 0, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(17.375f, 1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 204, 40, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 16, 8, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(17.375f, 1.875f, 3.625f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 219, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(21.625f, -3.125f, -5.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 207, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(21.625f, -3.125f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 196, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(16.875f, -3.125f, -5.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 186, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(16.875f, -3.125f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 181, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(21.625f, -3.125f, 2.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 176, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(21.625f, -3.125f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 171, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(16.875f, -3.125f, 2.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 122, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0)
			.setRotationPoint(16.875f, -3.125f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 14, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(21.625f, -3.25f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 298, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.25f, -1.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 294, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, -1.25f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 320, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(16.875f, -3.25f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 504, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(21.625f, -3.25f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(16.875f, -3.25f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 494, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(26.5f, -2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 439, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(27.5f, -2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 434, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(11, -2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 429, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(12, -2.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 424, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(26.5f, -2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 416, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(27.5f, -2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 402, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(11, -2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 333, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.33333334f, -0.0625f, 0, -0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f, 0, 0.25f, -0.0625f)
			.setRotationPoint(12, -2.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 501, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.25f, -1.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 185, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, -1.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 328, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(32.375f, -3.125f, -5.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 292, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(32.375f, -3.125f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 287, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(32.375f, -3.125f, 2.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 254, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(32.375f, -3.125f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 237, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(32.375f, -3.25f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 232, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(32.375f, -3.25f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 202, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(32.375f, -1.875f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 31, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(32.375f, -1.875f, 3.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 9, 319, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(32.25f, -1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 486, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(32.25f, -1.375f, 3.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 411, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(32.25f, -1.375f, 3.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 312, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(31.625f, -1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 307, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(31.625f, -1.375f, 3.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 302, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(31.625f, -1.375f, 3.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 249, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(32.25f, -1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 163, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(32.25f, -1.375f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 158, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(32.25f, -1.375f, -4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 153, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(31.625f, -1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 148, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(31.625f, -1.375f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 92, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(31.625f, -1.375f, -4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 69, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(31.625f, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 64, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(32.25f, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 59, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(31.625f, -1.3125f, 2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 43, 318, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(32.25f, -1.3125f, 2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 268, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(32.25f, -1.3125f, -2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 463, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(6.125f, -3.125f, -5.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 455, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(6.125f, -3.125f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 450, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(6.125f, -3.125f, 2.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 397, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, -0.875f, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0)
			.setRotationPoint(6.125f, -3.125f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 392, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(6.125f, -3.25f, -4.3125f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 355, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0.375f, -0.375f, -0.875f, 0, -0.375f, -0.875f, 0)
			.setRotationPoint(6.125f, -3.25f, 3.6875f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 350, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(6.125f, -1.875f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 345, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0)
			.setRotationPoint(6.125f, -1.875f, 3.5625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 324, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(6, -1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 297, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(6, -1.375f, 3.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 258, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(6, -1.375f, 3.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 186, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.375f, -0.875f, -0.625f, -0.375f)
			.setRotationPoint(5.375f, -1.75f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 181, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.6875f, -0.875f, -0.625f, -0.6875f)
			.setRotationPoint(5.375f, -1.375f, 3.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 176, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.5625f, -0.3125f, 0, -0.5625f, -0.3125f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(5.375f, -1.375f, 3.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 171, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(6, -1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 35, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(6, -1.375f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 27, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(6, -1.375f, -4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 5, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.25f, -0.875f, -0.625f, -0.25f)
			.setRotationPoint(5.375f, -1.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 439, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.875f, 0, -0.3125f, -0.875f, -0.625f, -0.6875f, 0, -0.625f, -0.6875f, 0, -0.625f, -0.3125f, -0.875f, -0.625f, -0.3125f)
			.setRotationPoint(5.375f, -1.375f, -4.4375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 434, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.0625f, -0.3125f, -0.875f, -0.0625f, -0.3125f, -0.875f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.5625f, -0.3125f, -0.875f, -0.5625f, -0.3125f)
			.setRotationPoint(5.375f, -1.375f, -4.0625f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 429, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(5.375f, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 424, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(6, -1.3125f, -3.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 292, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(5.375f, -1.3125f, 2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 233, 316, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, -0.625f, 0)
			.setRotationPoint(6, -1.3125f, 2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 79, 314, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f)
			.setRotationPoint(6, -1.3125f, -2.375f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 468, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.75f, 0, -3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 439, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(23.75f, 4, -3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 294, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(8.25f, 0, -3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 29, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(8.25f, 4, -3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 31, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, 0, -3).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, 4, -3).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 97, 270, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-32, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 349, 269, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0)
			.setRotationPoint(-32, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 325, 269, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0)
			.setRotationPoint(-32, -3.875f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 177, 269, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-32, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 168, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.375f, 0)
			.setRotationPoint(-35, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 478, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-34, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 159, 269, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0)
			.setRotationPoint(-35, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 446, 294, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0)
			.setRotationPoint(-34, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 150, 269, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-35, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 439, 294, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0)
			.setRotationPoint(-34, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 141, 269, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0)
			.setRotationPoint(-35, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 432, 294, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0)
			.setRotationPoint(-34, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 53, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-29, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 298, 268, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-29, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 289, 268, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0)
			.setRotationPoint(-29, -3.875f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 280, 268, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0)
			.setRotationPoint(-29, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 271, 268, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 419, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 262, 268, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 412, 294, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 253, 268, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 405, 294, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 244, 268, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 374, 294, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 228, 268, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-32, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 8, 268, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0)
			.setRotationPoint(-32, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 267, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0)
			.setRotationPoint(-32, -3.875f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 490, 267, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-32, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 464, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.375f, 0)
			.setRotationPoint(-35, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 350, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-34, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 431, 267, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0)
			.setRotationPoint(-35, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 343, 294, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0)
			.setRotationPoint(-34, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 379, 267, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-35, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 336, 294, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0)
			.setRotationPoint(-34, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 363, 267, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0)
			.setRotationPoint(-35, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 323, 294, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0)
			.setRotationPoint(-34, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 341, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-29, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 455, 266, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-29, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 354, 266, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0)
			.setRotationPoint(-29, -3.875f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 332, 266, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0)
			.setRotationPoint(-29, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 236, 266, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 220, 266, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 309, 294, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 176, 266, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 302, 294, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 167, 266, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 281, 294, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0)
			.setRotationPoint(-26, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 158, 266, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-16.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 405, 265, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0)
			.setRotationPoint(-16.5f, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 396, 265, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0)
			.setRotationPoint(-16.5f, -3.875f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 387, 265, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-16.5f, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 371, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.375f, 0)
			.setRotationPoint(-19.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 274, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-18.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 323, 265, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0)
			.setRotationPoint(-19.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 246, 294, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0)
			.setRotationPoint(-18.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 314, 265, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-19.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 239, 294, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0)
			.setRotationPoint(-18.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 305, 265, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0)
			.setRotationPoint(-19.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 232, 294, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0)
			.setRotationPoint(-18.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 296, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-13.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 122, 265, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-13.5f, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 97, 265, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0)
			.setRotationPoint(-13.5f, -3.875f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 88, 265, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0)
			.setRotationPoint(-13.5f, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 79, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 204, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 44, 265, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 197, 294, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 35, 265, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 190, 294, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 264, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 183, 294, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 490, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-16.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 70, 264, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0)
			.setRotationPoint(-16.5f, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 61, 264, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0)
			.setRotationPoint(-16.5f, -3.875f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 26, 264, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(-16.5f, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 9, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.375f, 0)
			.setRotationPoint(-19.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 176, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(-18.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 481, 263, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0)
			.setRotationPoint(-19.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 163, 294, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0)
			.setRotationPoint(-18.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 379, 263, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-19.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 148, 294, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0)
			.setRotationPoint(-18.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 337, 263, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0)
			.setRotationPoint(-19.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 120, 294, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0)
			.setRotationPoint(-18.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 243, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-13.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 395, 262, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-13.5f, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 370, 262, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0)
			.setRotationPoint(-13.5f, -3.875f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 354, 262, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0)
			.setRotationPoint(-13.5f, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 328, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 113, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 319, 262, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 106, 294, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 310, 262, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 99, 294, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 301, 262, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 92, 294, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0)
			.setRotationPoint(-10.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 292, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(9, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 123, 262, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0)
			.setRotationPoint(9, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 105, 262, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0)
			.setRotationPoint(9, -3.875f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 96, 262, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(9, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 87, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.375f, 0)
			.setRotationPoint(6, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 72, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(7, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 78, 262, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0)
			.setRotationPoint(6, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 65, 294, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0)
			.setRotationPoint(7, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 53, 262, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(6, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 52, 294, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0)
			.setRotationPoint(7, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 44, 262, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0)
			.setRotationPoint(6, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 21, 294, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0)
			.setRotationPoint(7, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 35, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(12, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 69, 261, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0)
			.setRotationPoint(12, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 9, 261, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0)
			.setRotationPoint(12, -3.875f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 481, 260, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0)
			.setRotationPoint(12, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 464, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 7, 294, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 387, 260, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 294, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 378, 260, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 462, 293, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 362, 260, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 455, 293, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 248, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(9, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 398, 259, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0)
			.setRotationPoint(9, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 353, 259, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0)
			.setRotationPoint(9, -3.875f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 308, 259, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(9, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 299, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.375f, 0)
			.setRotationPoint(6, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 367, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(7, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 290, 259, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0)
			.setRotationPoint(6, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 267, 293, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0)
			.setRotationPoint(7, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 281, 259, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(6, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 253, 293, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0)
			.setRotationPoint(7, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 272, 259, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0)
			.setRotationPoint(6, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 85, 293, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0)
			.setRotationPoint(7, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 263, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(12, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 79, 259, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0)
			.setRotationPoint(12, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 61, 259, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0)
			.setRotationPoint(12, -3.875f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 52, 259, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0)
			.setRotationPoint(12, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 43, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 45, 293, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 18, 259, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 32, 293, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 498, 258, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 426, 292, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 489, 258, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 330, 292, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0)
			.setRotationPoint(15, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 473, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(24.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 464, 257, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0)
			.setRotationPoint(24.5f, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 390, 257, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0)
			.setRotationPoint(24.5f, -3.875f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 381, 257, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(24.5f, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 361, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.375f, 0)
			.setRotationPoint(21.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 296, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(22.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 345, 257, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0)
			.setRotationPoint(21.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 289, 292, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0)
			.setRotationPoint(22.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 255, 257, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(21.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 260, 292, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0)
			.setRotationPoint(22.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 152, 257, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0)
			.setRotationPoint(21.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 226, 292, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0)
			.setRotationPoint(22.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 143, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(27.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 336, 256, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0)
			.setRotationPoint(27.5f, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 317, 256, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0)
			.setRotationPoint(27.5f, -3.875f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 308, 256, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0)
			.setRotationPoint(27.5f, -4, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 274, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 219, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 265, 256, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 212, 292, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 232, 256, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 170, 292, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 223, 256, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 142, 292, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3, -4.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 134, 256, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(24.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 472, 255, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0)
			.setRotationPoint(24.5f, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 373, 255, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0)
			.setRotationPoint(24.5f, -3.875f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 353, 255, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0)
			.setRotationPoint(24.5f, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 247, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.375f, 0)
			.setRotationPoint(21.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 135, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0)
			.setRotationPoint(22.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 200, 255, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0)
			.setRotationPoint(21.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 128, 292, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0)
			.setRotationPoint(22.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 191, 255, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(21.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 15, 292, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0)
			.setRotationPoint(22.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 182, 255, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0)
			.setRotationPoint(21.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 442, 291, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0)
			.setRotationPoint(22.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 173, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(27.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 484, 253, textureX, textureY)
			.addShapeBox(0, 1.125f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.375f, -0.46875f, 0, -0.375f, -0.46875f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, 0, -0.625f, 0)
			.setRotationPoint(27.5f, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 464, 253, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -1.125f, -0.40625f, 0, -1.125f, -0.40625f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -1.125f, -0.46875f, 0, -1.125f, -0.46875f, 0, 0, -0.625f, 0)
			.setRotationPoint(27.5f, -3.875f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 455, 253, textureX, textureY)
			.addShapeBox(0, 1.25f, 0, 3, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.25f, 0, 0, -0.625f, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, -0.625f, 0)
			.setRotationPoint(27.5f, -4, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 439, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 435, 291, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.875f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 430, 253, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 3, 1, 1, 0, 0, 0, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.375f, -0.4375f, 0, -0.375f, -0.4375f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		this.groups.add(Frame);
	}

	private final void initGroup_Frame1(){
		TurboList Frame = new TurboList("Frame");
		Frame.add(new ModelRendererTurbo(Frame, 419, 291, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 2, 1, 1, 0, 0, 0, 0, -0.875f, -0.1875f, 0, -0.875f, -0.1875f, 0, 0, 0, 0, 0, -0.875f, 0, -0.875f, -0.6875f, 0, -0.875f, -0.6875f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 345, 253, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 3, 1, 1, 0, 0, 0, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, 0, 0, 0, -0.875f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 412, 291, textureX, textureY)
			.addShapeBox(0, 0.25f, 0, 2, 1, 1, 0, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 320, 253, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 3, 1, 1, 0, 0, 0, 0, -1.125f, -0.3125f, 0, -1.125f, -0.3125f, 0, 0, 0, 0, 0, -0.875f, 0, -1.125f, -0.5625f, 0, -1.125f, -0.5625f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 405, 291, textureX, textureY)
			.addShapeBox(0, 0.375f, 0, 2, 1, 1, 0, 0, 0, 0, -1.625f, -0.0625f, 0, -1.625f, -0.0625f, 0, 0, 0, 0, 0, -0.875f, 0, -1.625f, -0.8125f, 0, -1.625f, -0.8125f, 0, 0, -0.875f, 0)
			.setRotationPoint(30.5f, -3, 3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 391, 238, textureX, textureY).addCylinder(0, 0, 0, 1, 10, 30, 1, 1, 0, null)
			.setRotationPoint(12, 2.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 386, 238, textureX, textureY).addCylinder(0, 0, 0, 1, 10, 30, 1, 1, 0, null)
			.setRotationPoint(27.5f, 2.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 289, 238, textureX, textureY).addCylinder(0, 0, 0, 1, 10, 30, 1, 1, 0, null)
			.setRotationPoint(-13.5f, 2.75f, -5.125f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 163, 238, textureX, textureY).addCylinder(0, 0, 0, 1, 10, 30, 1, 1, 0, null)
			.setRotationPoint(-29, 2.75f, -5.25f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 24, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.25f, 0, -3.5f).setRotationAngle(0, 0, 0).setName("Box 209cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 192, 37, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 2, 16, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-18.875f, 1.875f, -4.75f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 192, 37, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 2, 16, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-23.625f, 1.875f, 3.25f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 192, 37, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 2, 16, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(-18.875f, 1.875f, 3.25f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 192, 37, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 2, 16, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(17.375f, 1.875f, -4.75f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 192, 37, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 2, 16, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(22.125f, 1.875f, -4.75f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 192, 37, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 2, 16, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(17.375f, 1.875f, 3.25f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 192, 37, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 2, 16, 0.5f, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(22.125f, 1.875f, 3.25f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 207, 74, textureX, textureY).addHollowCylinder(0, 0, 0, 7.5f, 7, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-13.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 227, 22, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(-13.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 372, 228, textureX, textureY).addHollowCylinder(-3.5f, 0, 0, 1.125f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(-13.5f, 2.5f, 4.875f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 347, 279, textureX, textureY)
			.addShapeBox(-1.125f, 2, 0, 2, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 215, 300, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-13.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 210, 300, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 205, 300, textureX, textureY)
			.addShapeBox(-1.25f, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-13.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 200, 300, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 13, 83, textureX, textureY).addHollowCylinder(0, 5.71875f, 0.25f, 1, 0.75f, 1, 10, 0, 0.875f, 0.875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 118, 139, textureX, textureY).addHollowCylinder(0, 0, 0, 7, 6.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(-13.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 238, 79, textureX, textureY).addHollowCylinder(2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 13, 78, textureX, textureY).addHollowCylinder(-2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 366, 228, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 331, 279, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 173, 279, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 292, 228, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 286, 228, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 166, 279, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 159, 279, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 280, 228, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 221, 227, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 144, 279, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 137, 279, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 215, 227, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 209, 227, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 63, 279, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 26, 279, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 203, 227, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 197, 227, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 14, 279, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 7, 279, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 191, 227, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 185, 227, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 417, 278, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 410, 278, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 179, 227, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 403, 278, textureX, textureY)
			.addShapeBox(2.75f, -0.875f, 0, 2, 1, 1, 0, 0, -0.005f, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, -0.005f, -0.0625f, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 396, 278, textureX, textureY)
			.addShapeBox(2.75f, -0.125f, 0, 2, 1, 1, 0, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f, 0, 0, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 195, 300, textureX, textureY)
			.addShapeBox(2.25f, -0.875f, 0, 1, 1, 1, 0, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 190, 300, textureX, textureY)
			.addShapeBox(2.25f, -0.125f, 0, 1, 1, 1, 0, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 361, 278, textureX, textureY)
			.addShapeBox(-4.75f, -0.875f, 0, 2, 1, 1, 0, -0.25f, 0.4175f, -0.3125f, 0, -0.005f, -0.3125f, 0, -0.005f, -0.0625f, -0.25f, 0.4175f, -0.0625f, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 340, 278, textureX, textureY)
			.addShapeBox(-4.75f, -0.125f, 0, 2, 1, 1, 0, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f, -0.25f, 0.4175f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.25f, 0.4175f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 371, 197, textureX, textureY)
			.addShapeBox(-2.28125f, -0.84375f, 0, 5, 2, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 185, 300, textureX, textureY)
			.addShapeBox(-3.25f, -0.875f, 0, 1, 1, 1, 0, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 180, 300, textureX, textureY)
			.addShapeBox(-3.25f, -0.125f, 0, 1, 1, 1, 0, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 244, 194, textureX, textureY)
			.addShapeBox(-2.28125f, -1.34375f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 330, 195, textureX, textureY)
			.addShapeBox(-2.28125f, -6.5f, 0, 5, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.0625f, -0.3125f, 0.03125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 44, 245, textureX, textureY)
			.addShapeBox(-2.28125f, -6.8125f, 0, 3, 1, 1, 0, -0.3125f, -0.1875f, -0.3125f, -0.71875f, 0, -0.3125f, -0.71875f, 0, -0.0625f, -0.3125f, -0.1875f, -0.0625f, -0.3125f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.0625f, -0.3125f, -0.6875f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 488, 244, textureX, textureY)
			.addShapeBox(-0.71875f, -6.8125f, 0, 3, 1, 1, 0, -0.71875f, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.0625f, -0.71875f, -0.6875f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 479, 244, textureX, textureY)
			.addShapeBox(-4.21875f, -5.625f, 0, 3, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.3125f, -0.375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 470, 244, textureX, textureY)
			.addShapeBox(-4.21875f, -6.5f, 0, 3, 1, 1, 0, -1.4375f, -0.25f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -1.4375f, -0.25f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 452, 244, textureX, textureY)
			.addShapeBox(1.21875f, -5.625f, 0, 3, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 432, 244, textureX, textureY)
			.addShapeBox(1.21875f, -6.5f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -1.4375f, -0.25f, -0.3125f, -1.4375f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.0625f, -0.75f, -0.125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 324, 278, textureX, textureY)
			.addShapeBox(-5.15625f, -5.625f, 0, 2, 2, 1, 0, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 317, 278, textureX, textureY)
			.addShapeBox(-6.09375f, -4.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 303, 278, textureX, textureY)
			.addShapeBox(-6.84375f, -3.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 259, 278, textureX, textureY)
			.addShapeBox(3.15625f, -5.625f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 152, 278, textureX, textureY)
			.addShapeBox(4.09375f, -4.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 77, 278, textureX, textureY)
			.addShapeBox(4.84375f, -3.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 70, 278, textureX, textureY)
			.addShapeBox(-6.84375f, -2.375f, 0, 2, 1, 1, 0, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 49, 278, textureX, textureY)
			.addShapeBox(-6.84375f, -1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 42, 278, textureX, textureY)
			.addShapeBox(-6.96875f, -0.65625f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 35, 278, textureX, textureY)
			.addShapeBox(-6.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 278, textureX, textureY)
			.addShapeBox(-6.84375f, 0.375f, 0, 2, 1, 1, 0, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 505, 277, textureX, textureY)
			.addShapeBox(4.84375f, -2.375f, 0, 2, 1, 1, 0, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 389, 277, textureX, textureY)
			.addShapeBox(4.84375f, -1.375f, 0, 2, 1, 1, 0, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 382, 277, textureX, textureY)
			.addShapeBox(4.96875f, -0.65625f, 0, 2, 1, 1, 0, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 310, 277, textureX, textureY)
			.addShapeBox(4.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 296, 277, textureX, textureY)
			.addShapeBox(4.84375f, 0.375f, 0, 2, 1, 1, 0, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 231, 194, textureX, textureY)
			.addShapeBox(-2.28125f, 0.453125f, 0, 5, 1, 1, 0, 0, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.0625f, 0, -0.640625f, -0.0625f, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 289, 277, textureX, textureY)
			.addShapeBox(-5.15625f, 3.59375f, 0, 2, 2, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 282, 277, textureX, textureY)
			.addShapeBox(-6.09375f, 2.875f, 0, 2, 2, 1, 0, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 275, 277, textureX, textureY)
			.addShapeBox(-6.84375f, 1.875f, 0, 2, 2, 1, 0, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 268, 277, textureX, textureY)
			.addShapeBox(-6.84375f, 1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 252, 277, textureX, textureY)
			.addShapeBox(3.140625f, 3.59375f, 0, 2, 2, 1, 0, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 245, 277, textureX, textureY)
			.addShapeBox(4.078125f, 2.875f, 0, 2, 2, 1, 0, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 238, 277, textureX, textureY)
			.addShapeBox(4.828125f, 1.875f, 0, 2, 2, 1, 0, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 231, 277, textureX, textureY)
			.addShapeBox(4.84375f, 1.375f, 0, 2, 1, 1, 0, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 218, 194, textureX, textureY)
			.addShapeBox(-2.28125f, 1.296875f, 0, 5, 1, 1, 0, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f, -0.28125f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.0625f, -0.28125f, -0.4375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 139, 196, textureX, textureY)
			.addShapeBox(-2.28125f, 1.859375f, 0, 5, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.0625f, -0.3125f, -0.8125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 423, 244, textureX, textureY)
			.addShapeBox(1.65625f, 1.859375f, 0, 3, 2, 1, 0, -0.3125f, -0.046875f, -0.3125f, -0.765625f, -0.984375f, -0.3125f, -0.765625f, -0.984375f, -0.0625f, -0.3125f, -0.046875f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 175, 300, textureX, textureY)
			.addShapeBox(1.96875f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 163, 300, textureX, textureY)
			.addShapeBox(2.890625f, 3.734375f, 0, 1, 1, 1, 0, -0.453125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.453125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 154, 300, textureX, textureY)
			.addShapeBox(2.890625f, 4.234375f, 0, 1, 2, 1, 0, -0.78125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.78125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 149, 300, textureX, textureY)
			.addShapeBox(1.96875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 144, 300, textureX, textureY)
			.addShapeBox(2.671875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 224, 277, textureX, textureY)
			.addShapeBox(1.671875f, 5.3125f, 0, 2, 1, 1, 0, -0.296875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.296875f, 0, -0.0625f, -0.296875f, 0.234375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.0625f, -0.296875f, 0.203125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 396, 244, textureX, textureY)
			.addShapeBox(-4.671875f, 1.859375f, 0, 3, 2, 1, 0, -0.765625f, -0.984375f, -0.3125f, -0.296875f, -0.046875f, -0.3125f, -0.296875f, -0.046875f, -0.0625f, -0.765625f, -0.984375f, -0.0625f, -0.765625f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.0625f, -0.765625f, -0.125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 119, 300, textureX, textureY)
			.addShapeBox(-2.96875f, 3.734375f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 114, 300, textureX, textureY)
			.addShapeBox(-3.90625f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 109, 300, textureX, textureY)
			.addShapeBox(-3.90625f, 4.234375f, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.765625f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 100, 300, textureX, textureY)
			.addShapeBox(-3.671875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 217, 277, textureX, textureY)
			.addShapeBox(-3.671875f, 5.3125f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.296875f, 0, -0.3125f, -0.296875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.4375f, -0.3125f, -0.296875f, 0.234375f, -0.3125f, -0.296875f, 0.203125f, -0.0625f, 0, -0.4375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 33, 300, textureX, textureY)
			.addShapeBox(-2.96875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 487, 299, textureX, textureY)
			.addShapeBox(-0.75f, 5.046875f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 377, 299, textureX, textureY)
			.addShapeBox(-0.75f, 5.375f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 482, 298, textureX, textureY)
			.addShapeBox(-0.265625f, 5.046875f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 470, 298, textureX, textureY)
			.addShapeBox(-0.265625f, 5.375f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 210, 277, textureX, textureY)
			.addShapeBox(-0.03125f, 5.046875f, 0, 2, 1, 1, 0, -0.765625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -0.765625f, 0.75f, -0.3125f, 0, 0.515625f, -0.3125f, 0, 0.515625f, -0.0625f, -0.765625f, 0.75f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 203, 277, textureX, textureY)
			.addShapeBox(-1.96875f, 5.046875f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.78125f, 0, -0.3125f, -0.78125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.515625f, -0.3125f, -0.78125f, 0.75f, -0.3125f, -0.78125f, 0.75f, -0.0625f, 0, 0.515625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 196, 277, textureX, textureY)
			.addShapeBox(-0.75f, 6.375f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.515625f, 0, -0.3125f, -0.515625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 92, 227, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 492, 226, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 486, 226, textureX, textureY).addHollowCylinder(3.25f, 0, 0.25f, 1, 0.4296875f, 1, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 140, 298, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -62).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 135, 298, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -118).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 130, 298, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 242).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 480, 226, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 125, 298, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 298).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 474, 226, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 468, 226, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.578125f, 1, 10, 5, 0.59375f, 0.59375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -270)
		);
		Frame.add(new ModelRendererTurbo(Frame, 79, 298, textureX, textureY)
			.addShapeBox(3.25f, -0.40625f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -90).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 39, 298, textureX, textureY)
			.addShapeBox(3.25f, -0.59375f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 270).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 359, 244, textureX, textureY)
			.addShapeBox(-2.28125f, -4.46875f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.0625f, -0.3125f, -0.5625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 332, 244, textureX, textureY)
			.addShapeBox(-0.71875f, -4.46875f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -1.1875f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.0625f, -1.1875f, -0.5625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 273, 244, textureX, textureY)
			.addShapeBox(1.21875f, -4, 0, 3, 1, 1, 0, -0.8125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.8125f, 0, -0.0625f, -1.0625f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -1.0625f, -0.75f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 203, 244, textureX, textureY)
			.addShapeBox(1.21875f, -3.75f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -1.15625f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.0625f, -1.15625f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 189, 277, textureX, textureY)
			.addShapeBox(-1.5625f, -4.03125f, 0, 2, 1, 1, 0, -0.0625f, 0, -0.3125f, -0.90625f, 0, -0.3125f, -0.90625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 182, 277, textureX, textureY)
			.addShapeBox(-0.4375f, -4.03125f, 0, 2, 1, 1, 0, -0.90625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.0625f, -0.90625f, 0, -0.0625f, -0.625f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, -0.625f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 205, 194, textureX, textureY)
			.addShapeBox(-2.28125f, -2.0625f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.0625f, -0.3125f, -0.28125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 131, 277, textureX, textureY)
			.addShapeBox(-1.28125f, -3.03125f, 0, 2, 1, 1, 0, -0.09375f, 0, -0.3125f, 0.4375f, 0, -0.3125f, 0.40625f, 0, -0.0625f, -0.09375f, 0, -0.0625f, -0.09375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.0625f, -0.09375f, -0.03125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 14, 298, textureX, textureY)
			.addShapeBox(1.15625f, -2.4375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.625f, -0.3125f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.625f, -0.0625f, 0, -0.625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 363, 131, textureX, textureY)
			.addShapeBox(-4.65625f, -6.5f, -0.0625f, 9, 1, 1, 0, -0.125f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.625f, -0.125f, -1.25f, -0.625f, 0, 0.5f, -0.25f, 0.3125f, 0.5f, -0.25f, 0.3125f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(-13.5f, 2.5f, 5.375f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 501, 297, textureX, textureY)
			.addShapeBox(-0.5f, -6.75f, -0.0625f, 1, 1, 1, 0, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-13.5f, 2.5f, 5.3125f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 496, 297, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-13.5f, 2.5f, 5.3125f).setRotationAngle(0, 0, 18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 491, 297, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-13.5f, 2.5f, 5.3125f).setRotationAngle(0, 0, -18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 462, 226, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, 5.375f).setRotationAngle(0, 0, -81)
		);
		Frame.add(new ModelRendererTurbo(Frame, 409, 226, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, 5.375f).setRotationAngle(0, 0, -99)
		);
		Frame.add(new ModelRendererTurbo(Frame, 173, 226, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, 5.375f).setRotationAngle(0, 0, -117)
		);
		Frame.add(new ModelRendererTurbo(Frame, 167, 226, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, 5.375f).setRotationAngle(0, 0, -63)
		);
		Frame.add(new ModelRendererTurbo(Frame, 177, 244, textureX, textureY)
			.addShapeBox(1.21875f, -3.09375f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -0.375f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.0625f, -0.375f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 168, 244, textureX, textureY)
			.addShapeBox(-4.21875f, -4, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 154, 244, textureX, textureY)
			.addShapeBox(-4.21875f, -3.75f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.0625f, -0.3125f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 477, 297, textureX, textureY)
			.addShapeBox(-2.1875f, -2.4375f, 0, 1, 1, 1, 0, 0.46875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.125f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.0625f, -0.125f, -0.625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 128, 244, textureX, textureY)
			.addShapeBox(-4.21875f, -3.09375f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -1.625f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.0625f, -1.625f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 161, 226, textureX, textureY).addHollowCylinder(-5.25f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 403, 224, textureX, textureY).addHollowCylinder(-5.25f, 1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 223, textureX, textureY).addHollowCylinder(-5.25f, -1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 463, 63, textureX, textureY).addHollowCylinder(0, 0, 0, 7.5f, 7, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-29, 2.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 22, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(-29, 2.5f, 4.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 242, 224, textureX, textureY).addHollowCylinder(-3.5f, 0, 0, 1.125f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(-29, 2.5f, 4.875f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 124, 277, textureX, textureY)
			.addShapeBox(-1.125f, 2, 0, 2, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 447, 297, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-29, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 442, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 437, 297, textureX, textureY)
			.addShapeBox(-1.25f, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-29, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 432, 297, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 238, 74, textureX, textureY).addHollowCylinder(0, 5.71875f, 0.25f, 1, 0.75f, 1, 10, 0, 0.875f, 0.875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 89, 139, textureX, textureY).addHollowCylinder(0, 0, 0, 7, 6.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(-29, 2.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 507, 73, textureX, textureY).addHollowCylinder(2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 13, 73, textureX, textureY).addHollowCylinder(-2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 500, 223, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 117, 277, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 110, 277, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 292, 223, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 286, 223, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 103, 277, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 96, 277, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 280, 223, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 274, 223, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 89, 277, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 498, 276, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 268, 223, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 262, 223, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 491, 276, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 375, 276, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 95, 222, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 89, 222, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 355, 276, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 334, 276, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 83, 222, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 77, 222, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 175, 276, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 168, 276, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 71, 222, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 161, 276, textureX, textureY)
			.addShapeBox(2.75f, -0.875f, 0, 2, 1, 1, 0, 0, -0.005f, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, -0.005f, -0.0625f, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 146, 276, textureX, textureY)
			.addShapeBox(2.75f, -0.125f, 0, 2, 1, 1, 0, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f, 0, 0, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 420, 297, textureX, textureY)
			.addShapeBox(2.25f, -0.875f, 0, 1, 1, 1, 0, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 415, 297, textureX, textureY)
			.addShapeBox(2.25f, -0.125f, 0, 1, 1, 1, 0, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 139, 276, textureX, textureY)
			.addShapeBox(-4.75f, -0.875f, 0, 2, 1, 1, 0, -0.25f, 0.4175f, -0.3125f, 0, -0.005f, -0.3125f, 0, -0.005f, -0.0625f, -0.25f, 0.4175f, -0.0625f, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 64, 276, textureX, textureY)
			.addShapeBox(-4.75f, -0.125f, 0, 2, 1, 1, 0, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f, -0.25f, 0.4175f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.25f, 0.4175f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 443, 193, textureX, textureY)
			.addShapeBox(-2.28125f, -0.84375f, 0, 5, 2, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 410, 297, textureX, textureY)
			.addShapeBox(-3.25f, -0.875f, 0, 1, 1, 1, 0, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 405, 297, textureX, textureY)
			.addShapeBox(-3.25f, -0.125f, 0, 1, 1, 1, 0, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 430, 193, textureX, textureY)
			.addShapeBox(-2.28125f, -1.34375f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 289, 193, textureX, textureY)
			.addShapeBox(-2.28125f, -6.5f, 0, 5, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.0625f, -0.3125f, 0.03125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 71, 244, textureX, textureY)
			.addShapeBox(-2.28125f, -6.8125f, 0, 3, 1, 1, 0, -0.3125f, -0.1875f, -0.3125f, -0.71875f, 0, -0.3125f, -0.71875f, 0, -0.0625f, -0.3125f, -0.1875f, -0.0625f, -0.3125f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.0625f, -0.3125f, -0.6875f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 27, 244, textureX, textureY)
			.addShapeBox(-0.71875f, -6.8125f, 0, 3, 1, 1, 0, -0.71875f, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.0625f, -0.71875f, -0.6875f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 18, 244, textureX, textureY)
			.addShapeBox(-4.21875f, -5.625f, 0, 3, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.3125f, -0.375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 9, 244, textureX, textureY)
			.addShapeBox(-4.21875f, -6.5f, 0, 3, 1, 1, 0, -1.4375f, -0.25f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -1.4375f, -0.25f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 244, textureX, textureY)
			.addShapeBox(1.21875f, -5.625f, 0, 3, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 501, 243, textureX, textureY)
			.addShapeBox(1.21875f, -6.5f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -1.4375f, -0.25f, -0.3125f, -1.4375f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.0625f, -0.75f, -0.125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 57, 276, textureX, textureY)
			.addShapeBox(-5.15625f, -5.625f, 0, 2, 2, 1, 0, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 20, 276, textureX, textureY)
			.addShapeBox(-6.09375f, -4.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 484, 275, textureX, textureY)
			.addShapeBox(-6.84375f, -3.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 477, 275, textureX, textureY)
			.addShapeBox(3.15625f, -5.625f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 368, 275, textureX, textureY)
			.addShapeBox(4.09375f, -4.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 348, 275, textureX, textureY)
			.addShapeBox(4.84375f, -3.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 341, 275, textureX, textureY)
			.addShapeBox(-6.84375f, -2.375f, 0, 2, 1, 1, 0, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 327, 275, textureX, textureY)
			.addShapeBox(-6.84375f, -1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 320, 275, textureX, textureY)
			.addShapeBox(-6.96875f, -0.65625f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 304, 275, textureX, textureY)
			.addShapeBox(-6.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 154, 275, textureX, textureY)
			.addShapeBox(-6.84375f, 0.375f, 0, 2, 1, 1, 0, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 83, 275, textureX, textureY)
			.addShapeBox(4.84375f, -2.375f, 0, 2, 1, 1, 0, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 76, 275, textureX, textureY)
			.addShapeBox(4.84375f, -1.375f, 0, 2, 1, 1, 0, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 50, 275, textureX, textureY)
			.addShapeBox(4.96875f, -0.65625f, 0, 2, 1, 1, 0, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 43, 275, textureX, textureY)
			.addShapeBox(4.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 36, 275, textureX, textureY)
			.addShapeBox(4.84375f, 0.375f, 0, 2, 1, 1, 0, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 330, 192, textureX, textureY)
			.addShapeBox(-2.28125f, 0.453125f, 0, 5, 1, 1, 0, 0, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.0625f, 0, -0.640625f, -0.0625f, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 29, 275, textureX, textureY)
			.addShapeBox(-5.15625f, 3.59375f, 0, 2, 2, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 13, 275, textureX, textureY)
			.addShapeBox(-6.09375f, 2.875f, 0, 2, 2, 1, 0, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 6, 275, textureX, textureY)
			.addShapeBox(-6.84375f, 1.875f, 0, 2, 2, 1, 0, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 505, 274, textureX, textureY)
			.addShapeBox(-6.84375f, 1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 274, textureX, textureY)
			.addShapeBox(3.140625f, 3.59375f, 0, 2, 2, 1, 0, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 407, 274, textureX, textureY)
			.addShapeBox(4.078125f, 2.875f, 0, 2, 2, 1, 0, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 400, 274, textureX, textureY)
			.addShapeBox(4.828125f, 1.875f, 0, 2, 2, 1, 0, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 393, 274, textureX, textureY)
			.addShapeBox(4.84375f, 1.375f, 0, 2, 1, 1, 0, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 117, 191, textureX, textureY)
			.addShapeBox(-2.28125f, 1.296875f, 0, 5, 1, 1, 0, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f, -0.28125f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.0625f, -0.28125f, -0.4375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 489, 189, textureX, textureY)
			.addShapeBox(-2.28125f, 1.859375f, 0, 5, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.0625f, -0.3125f, -0.8125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 461, 243, textureX, textureY)
			.addShapeBox(1.65625f, 1.859375f, 0, 3, 2, 1, 0, -0.3125f, -0.046875f, -0.3125f, -0.765625f, -0.984375f, -0.3125f, -0.765625f, -0.984375f, -0.0625f, -0.3125f, -0.046875f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 400, 297, textureX, textureY)
			.addShapeBox(1.96875f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 395, 297, textureX, textureY)
			.addShapeBox(2.890625f, 3.734375f, 0, 1, 1, 1, 0, -0.453125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.453125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 390, 297, textureX, textureY)
			.addShapeBox(2.890625f, 4.234375f, 0, 1, 2, 1, 0, -0.78125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.78125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 385, 297, textureX, textureY)
			.addShapeBox(1.96875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 373, 297, textureX, textureY)
			.addShapeBox(2.671875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 386, 274, textureX, textureY)
			.addShapeBox(1.671875f, 5.3125f, 0, 2, 1, 1, 0, -0.296875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.296875f, 0, -0.0625f, -0.296875f, 0.234375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.0625f, -0.296875f, 0.203125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 443, 243, textureX, textureY)
			.addShapeBox(-4.671875f, 1.859375f, 0, 3, 2, 1, 0, -0.765625f, -0.984375f, -0.3125f, -0.296875f, -0.046875f, -0.3125f, -0.296875f, -0.046875f, -0.0625f, -0.765625f, -0.984375f, -0.0625f, -0.765625f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.0625f, -0.765625f, -0.125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 361, 297, textureX, textureY)
			.addShapeBox(-2.96875f, 3.734375f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 351, 297, textureX, textureY)
			.addShapeBox(-3.90625f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 346, 297, textureX, textureY)
			.addShapeBox(-3.90625f, 4.234375f, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.765625f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 341, 297, textureX, textureY)
			.addShapeBox(-3.671875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 361, 274, textureX, textureY)
			.addShapeBox(-3.671875f, 5.3125f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.296875f, 0, -0.3125f, -0.296875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.4375f, -0.3125f, -0.296875f, 0.234375f, -0.3125f, -0.296875f, 0.203125f, -0.0625f, 0, -0.4375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 336, 297, textureX, textureY)
			.addShapeBox(-2.96875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 322, 297, textureX, textureY)
			.addShapeBox(-0.75f, 5.046875f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 317, 297, textureX, textureY)
			.addShapeBox(-0.75f, 5.375f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 312, 297, textureX, textureY)
			.addShapeBox(-0.265625f, 5.046875f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 307, 297, textureX, textureY)
			.addShapeBox(-0.265625f, 5.375f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 313, 274, textureX, textureY)
			.addShapeBox(-0.03125f, 5.046875f, 0, 2, 1, 1, 0, -0.765625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -0.765625f, 0.75f, -0.3125f, 0, 0.515625f, -0.3125f, 0, 0.515625f, -0.0625f, -0.765625f, 0.75f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 297, 274, textureX, textureY)
			.addShapeBox(-1.96875f, 5.046875f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.78125f, 0, -0.3125f, -0.78125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.515625f, -0.3125f, -0.78125f, 0.75f, -0.3125f, -0.78125f, 0.75f, -0.0625f, 0, 0.515625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 290, 274, textureX, textureY)
			.addShapeBox(-0.75f, 6.375f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.515625f, 0, -0.3125f, -0.515625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 356, 221, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 335, 221, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 173, 221, textureX, textureY).addHollowCylinder(3.25f, 0, 0.25f, 1, 0.4296875f, 1, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 302, 297, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -62).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 283, 297, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -118).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 278, 297, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 242).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 167, 221, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 273, 297, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 298).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 161, 221, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 25, 221, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.578125f, 1, 10, 5, 0.59375f, 0.59375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -270)
		);
		Frame.add(new ModelRendererTurbo(Frame, 247, 297, textureX, textureY)
			.addShapeBox(3.25f, -0.40625f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, -90).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 242, 297, textureX, textureY)
			.addShapeBox(3.25f, -0.59375f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-29, 2.5f, 4.6719f).setRotationAngle(0, 0, 270).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 243, textureX, textureY)
			.addShapeBox(-2.28125f, -4.46875f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.0625f, -0.3125f, -0.5625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 312, 243, textureX, textureY)
			.addShapeBox(-0.71875f, -4.46875f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -1.1875f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.0625f, -1.1875f, -0.5625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 303, 243, textureX, textureY)
			.addShapeBox(1.21875f, -4, 0, 3, 1, 1, 0, -0.8125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.8125f, 0, -0.0625f, -1.0625f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -1.0625f, -0.75f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 375, 242, textureX, textureY)
			.addShapeBox(1.21875f, -3.75f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -1.15625f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.0625f, -1.15625f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 283, 274, textureX, textureY)
			.addShapeBox(-1.5625f, -4.03125f, 0, 2, 1, 1, 0, -0.0625f, 0, -0.3125f, -0.90625f, 0, -0.3125f, -0.90625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 276, 274, textureX, textureY)
			.addShapeBox(-0.4375f, -4.03125f, 0, 2, 1, 1, 0, -0.90625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.0625f, -0.90625f, 0, -0.0625f, -0.625f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, -0.625f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 330, 189, textureX, textureY)
			.addShapeBox(-2.28125f, -2.0625f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.0625f, -0.3125f, -0.28125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 269, 274, textureX, textureY)
			.addShapeBox(-1.28125f, -3.03125f, 0, 2, 1, 1, 0, -0.09375f, 0, -0.3125f, 0.4375f, 0, -0.3125f, 0.40625f, 0, -0.0625f, -0.09375f, 0, -0.0625f, -0.09375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.0625f, -0.09375f, -0.03125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 237, 297, textureX, textureY)
			.addShapeBox(1.15625f, -2.4375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.625f, -0.3125f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.625f, -0.0625f, 0, -0.625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 198, 114, textureX, textureY)
			.addShapeBox(-4.65625f, -6.5f, -0.0625f, 9, 1, 1, 0, -0.125f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.625f, -0.125f, -1.25f, -0.625f, 0, 0.5f, -0.25f, 0.3125f, 0.5f, -0.25f, 0.3125f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(-29, 2.5f, 5.375f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 232, 297, textureX, textureY)
			.addShapeBox(-0.5f, -6.75f, -0.0625f, 1, 1, 1, 0, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-29, 2.5f, 5.3125f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 206, 297, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-29, 2.5f, 5.3125f).setRotationAngle(0, 0, 18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 201, 297, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-29, 2.5f, 5.3125f).setRotationAngle(0, 0, -18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 6, 221, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, 5.375f).setRotationAngle(0, 0, -81)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 221, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, 5.375f).setRotationAngle(0, 0, -99)
		);
		Frame.add(new ModelRendererTurbo(Frame, 329, 220, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, 5.375f).setRotationAngle(0, 0, -117)
		);
		Frame.add(new ModelRendererTurbo(Frame, 323, 220, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, 5.375f).setRotationAngle(0, 0, -63)
		);
		Frame.add(new ModelRendererTurbo(Frame, 324, 242, textureX, textureY)
			.addShapeBox(1.21875f, -3.09375f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -0.375f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.0625f, -0.375f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 146, 242, textureX, textureY)
			.addShapeBox(-4.21875f, -4, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 137, 242, textureX, textureY)
			.addShapeBox(-4.21875f, -3.75f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.0625f, -0.3125f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 196, 297, textureX, textureY)
			.addShapeBox(-2.1875f, -2.4375f, 0, 1, 1, 1, 0, 0.46875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.125f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.0625f, -0.125f, -0.625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 63, 242, textureX, textureY)
			.addShapeBox(-4.21875f, -3.09375f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -1.625f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.0625f, -1.625f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 403, 219, textureX, textureY).addHollowCylinder(-5.25f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 48, 219, textureX, textureY).addHollowCylinder(-5.25f, 1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 468, 217, textureX, textureY).addHollowCylinder(-5.25f, -1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 432, 63, textureX, textureY).addHollowCylinder(0, 0, 0, 7.5f, 7, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(27.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 227, 16, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(27.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 500, 218, textureX, textureY).addHollowCylinder(-3.5f, 0, 0, 1.125f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(27.5f, 2.5f, 4.875f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 262, 274, textureX, textureY)
			.addShapeBox(-1.125f, 2, 0, 2, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(27.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 191, 297, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(27.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 186, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(27.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 181, 297, textureX, textureY)
			.addShapeBox(-1.25f, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(27.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 176, 297, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(27.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 208, 67, textureX, textureY).addHollowCylinder(0, 5.71875f, 0.25f, 1, 0.75f, 1, 10, 0, 0.875f, 0.875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 60, 139, textureX, textureY).addHollowCylinder(0, 0, 0, 7, 6.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(27.5f, 2.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 208, 62, textureX, textureY).addHollowCylinder(2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 507, 54, textureX, textureY).addHollowCylinder(-2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 462, 217, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 255, 274, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 248, 274, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 356, 216, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 336, 216, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 241, 274, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 227, 274, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 25, 216, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 6, 216, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 211, 274, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 204, 274, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 216, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 106, 215, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 197, 274, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 133, 274, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 71, 214, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 48, 214, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 126, 274, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 119, 274, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 213, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 500, 213, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 101, 274, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 498, 273, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 468, 212, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 491, 273, textureX, textureY)
			.addShapeBox(2.75f, -0.875f, 0, 2, 1, 1, 0, 0, -0.005f, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, -0.005f, -0.0625f, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 379, 273, textureX, textureY)
			.addShapeBox(2.75f, -0.125f, 0, 2, 1, 1, 0, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f, 0, 0, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 163, 297, textureX, textureY)
			.addShapeBox(2.25f, -0.875f, 0, 1, 1, 1, 0, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 152, 297, textureX, textureY)
			.addShapeBox(2.25f, -0.125f, 0, 1, 1, 1, 0, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 354, 273, textureX, textureY)
			.addShapeBox(-4.75f, -0.875f, 0, 2, 1, 1, 0, -0.25f, 0.4175f, -0.3125f, 0, -0.005f, -0.3125f, 0, -0.005f, -0.0625f, -0.25f, 0.4175f, -0.0625f, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 335, 273, textureX, textureY)
			.addShapeBox(-4.75f, -0.125f, 0, 2, 1, 1, 0, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f, -0.25f, 0.4175f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.25f, 0.4175f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 289, 189, textureX, textureY)
			.addShapeBox(-2.28125f, -0.84375f, 0, 5, 2, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 147, 297, textureX, textureY)
			.addShapeBox(-3.25f, -0.875f, 0, 1, 1, 1, 0, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 120, 297, textureX, textureY)
			.addShapeBox(-3.25f, -0.125f, 0, 1, 1, 1, 0, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 248, 189, textureX, textureY)
			.addShapeBox(-2.28125f, -1.34375f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 161, 189, textureX, textureY)
			.addShapeBox(-2.28125f, -6.5f, 0, 5, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.0625f, -0.3125f, 0.03125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 54, 242, textureX, textureY)
			.addShapeBox(-2.28125f, -6.8125f, 0, 3, 1, 1, 0, -0.3125f, -0.1875f, -0.3125f, -0.71875f, 0, -0.3125f, -0.71875f, 0, -0.0625f, -0.3125f, -0.1875f, -0.0625f, -0.3125f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.0625f, -0.3125f, -0.6875f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 45, 242, textureX, textureY)
			.addShapeBox(-0.71875f, -6.8125f, 0, 3, 1, 1, 0, -0.71875f, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.0625f, -0.71875f, -0.6875f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 36, 242, textureX, textureY)
			.addShapeBox(-4.21875f, -5.625f, 0, 3, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.3125f, -0.375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 480, 241, textureX, textureY)
			.addShapeBox(-4.21875f, -6.5f, 0, 3, 1, 1, 0, -1.4375f, -0.25f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -1.4375f, -0.25f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 405, 241, textureX, textureY)
			.addShapeBox(1.21875f, -5.625f, 0, 3, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 396, 241, textureX, textureY)
			.addShapeBox(1.21875f, -6.5f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -1.4375f, -0.25f, -0.3125f, -1.4375f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.0625f, -0.75f, -0.125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 234, 273, textureX, textureY)
			.addShapeBox(-5.15625f, -5.625f, 0, 2, 2, 1, 0, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 220, 273, textureX, textureY)
			.addShapeBox(-6.09375f, -4.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 190, 273, textureX, textureY)
			.addShapeBox(-6.84375f, -3.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 183, 273, textureX, textureY)
			.addShapeBox(3.15625f, -5.625f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 112, 273, textureX, textureY)
			.addShapeBox(4.09375f, -4.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 94, 273, textureX, textureY)
			.addShapeBox(4.84375f, -3.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 70, 273, textureX, textureY)
			.addShapeBox(-6.84375f, -2.375f, 0, 2, 1, 1, 0, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 63, 273, textureX, textureY)
			.addShapeBox(-6.84375f, -1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 23, 273, textureX, textureY)
			.addShapeBox(-6.96875f, -0.65625f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 273, textureX, textureY)
			.addShapeBox(-6.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 484, 272, textureX, textureY)
			.addShapeBox(-6.84375f, 0.375f, 0, 2, 1, 1, 0, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 477, 272, textureX, textureY)
			.addShapeBox(4.84375f, -2.375f, 0, 2, 1, 1, 0, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 372, 272, textureX, textureY)
			.addShapeBox(4.84375f, -1.375f, 0, 2, 1, 1, 0, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 347, 272, textureX, textureY)
			.addShapeBox(4.96875f, -0.65625f, 0, 2, 1, 1, 0, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 328, 272, textureX, textureY)
			.addShapeBox(4.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 321, 272, textureX, textureY)
			.addShapeBox(4.84375f, 0.375f, 0, 2, 1, 1, 0, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 117, 188, textureX, textureY)
			.addShapeBox(-2.28125f, 0.453125f, 0, 5, 1, 1, 0, 0, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.0625f, 0, -0.640625f, -0.0625f, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 176, 272, textureX, textureY)
			.addShapeBox(-5.15625f, 3.59375f, 0, 2, 2, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 169, 272, textureX, textureY)
			.addShapeBox(-6.09375f, 2.875f, 0, 2, 2, 1, 0, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 162, 272, textureX, textureY)
			.addShapeBox(-6.84375f, 1.875f, 0, 2, 2, 1, 0, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 155, 272, textureX, textureY)
			.addShapeBox(-6.84375f, 1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 148, 272, textureX, textureY)
			.addShapeBox(3.140625f, 3.59375f, 0, 2, 2, 1, 0, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 141, 272, textureX, textureY)
			.addShapeBox(4.078125f, 2.875f, 0, 2, 2, 1, 0, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 56, 272, textureX, textureY)
			.addShapeBox(4.828125f, 1.875f, 0, 2, 2, 1, 0, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 49, 272, textureX, textureY)
			.addShapeBox(4.84375f, 1.375f, 0, 2, 1, 1, 0, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 205, 187, textureX, textureY)
			.addShapeBox(-2.28125f, 1.296875f, 0, 5, 1, 1, 0, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f, -0.28125f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.0625f, -0.28125f, -0.4375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 104, 188, textureX, textureY)
			.addShapeBox(-2.28125f, 1.859375f, 0, 5, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.0625f, -0.3125f, -0.8125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 351, 241, textureX, textureY)
			.addShapeBox(1.65625f, 1.859375f, 0, 3, 2, 1, 0, -0.3125f, -0.046875f, -0.3125f, -0.765625f, -0.984375f, -0.3125f, -0.765625f, -0.984375f, -0.0625f, -0.3125f, -0.046875f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 115, 297, textureX, textureY)
			.addShapeBox(1.96875f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 110, 297, textureX, textureY)
			.addShapeBox(2.890625f, 3.734375f, 0, 1, 1, 1, 0, -0.453125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.453125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 105, 297, textureX, textureY)
			.addShapeBox(2.890625f, 4.234375f, 0, 1, 2, 1, 0, -0.78125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.78125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 100, 297, textureX, textureY)
			.addShapeBox(1.96875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 34, 297, textureX, textureY)
			.addShapeBox(2.671875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 16, 272, textureX, textureY)
			.addShapeBox(1.671875f, 5.3125f, 0, 2, 1, 1, 0, -0.296875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.296875f, 0, -0.0625f, -0.296875f, 0.234375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.0625f, -0.296875f, 0.203125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 342, 241, textureX, textureY)
			.addShapeBox(-4.671875f, 1.859375f, 0, 3, 2, 1, 0, -0.765625f, -0.984375f, -0.3125f, -0.296875f, -0.046875f, -0.3125f, -0.296875f, -0.046875f, -0.0625f, -0.765625f, -0.984375f, -0.0625f, -0.765625f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.0625f, -0.765625f, -0.125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 466, 296, textureX, textureY)
			.addShapeBox(-2.96875f, 3.734375f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 380, 296, textureX, textureY)
			.addShapeBox(-3.90625f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 356, 296, textureX, textureY)
			.addShapeBox(-3.90625f, 4.234375f, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.765625f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 155, 294, textureX, textureY)
			.addShapeBox(-3.671875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 415, 271, textureX, textureY)
			.addShapeBox(-3.671875f, 5.3125f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.296875f, 0, -0.3125f, -0.296875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.4375f, -0.3125f, -0.296875f, 0.234375f, -0.3125f, -0.296875f, 0.203125f, -0.0625f, 0, -0.4375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 289, textureX, textureY)
			.addShapeBox(-2.96875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 421, 273, textureX, textureY)
			.addShapeBox(-0.75f, 5.046875f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 150, 263, textureX, textureY)
			.addShapeBox(-0.75f, 5.375f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 150, 260, textureX, textureY)
			.addShapeBox(-0.265625f, 5.046875f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 443, 259, textureX, textureY)
			.addShapeBox(-0.265625f, 5.375f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 408, 271, textureX, textureY)
			.addShapeBox(-0.03125f, 5.046875f, 0, 2, 1, 1, 0, -0.765625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -0.765625f, 0.75f, -0.3125f, 0, 0.515625f, -0.3125f, 0, 0.515625f, -0.0625f, -0.765625f, 0.75f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 401, 271, textureX, textureY)
			.addShapeBox(-1.96875f, 5.046875f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.78125f, 0, -0.3125f, -0.78125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.515625f, -0.3125f, -0.78125f, 0.75f, -0.3125f, -0.78125f, 0.75f, -0.0625f, 0, 0.515625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 394, 271, textureX, textureY)
			.addShapeBox(-0.75f, 6.375f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.515625f, 0, -0.3125f, -0.515625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 462, 212, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 438, 212, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 106, 210, textureX, textureY).addHollowCylinder(3.25f, 0, 0.25f, 1, 0.4296875f, 1, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 160, 259, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -62).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 507, 258, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -118).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 161, 256, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 242).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 71, 209, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 209, 255, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 298).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 139, 208, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 416, 207, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.578125f, 1, 10, 5, 0.59375f, 0.59375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -270)
		);
		Frame.add(new ModelRendererTurbo(Frame, 283, 247, textureX, textureY)
			.addShapeBox(3.25f, -0.40625f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, -90).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 81, 241, textureX, textureY)
			.addShapeBox(3.25f, -0.59375f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, 4.6719f).setRotationAngle(0, 0, 270).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 333, 241, textureX, textureY)
			.addShapeBox(-2.28125f, -4.46875f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.0625f, -0.3125f, -0.5625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 204, 241, textureX, textureY)
			.addShapeBox(-0.71875f, -4.46875f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -1.1875f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.0625f, -1.1875f, -0.5625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 177, 241, textureX, textureY)
			.addShapeBox(1.21875f, -4, 0, 3, 1, 1, 0, -0.8125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.8125f, 0, -0.0625f, -1.0625f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -1.0625f, -0.75f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 168, 241, textureX, textureY)
			.addShapeBox(1.21875f, -3.75f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -1.15625f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.0625f, -1.15625f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 387, 271, textureX, textureY)
			.addShapeBox(-1.5625f, -4.03125f, 0, 2, 1, 1, 0, -0.0625f, 0, -0.3125f, -0.90625f, 0, -0.3125f, -0.90625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 365, 271, textureX, textureY)
			.addShapeBox(-0.4375f, -4.03125f, 0, 2, 1, 1, 0, -0.90625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.0625f, -0.90625f, 0, -0.0625f, -0.625f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, -0.625f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 248, 186, textureX, textureY)
			.addShapeBox(-2.28125f, -2.0625f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.0625f, -0.3125f, -0.28125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 314, 271, textureX, textureY)
			.addShapeBox(-1.28125f, -3.03125f, 0, 2, 1, 1, 0, -0.09375f, 0, -0.3125f, 0.4375f, 0, -0.3125f, 0.40625f, 0, -0.0625f, -0.09375f, 0, -0.0625f, -0.09375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.0625f, -0.09375f, -0.03125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 502, 238, textureX, textureY)
			.addShapeBox(1.15625f, -2.4375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.625f, -0.3125f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.625f, -0.0625f, 0, -0.625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 113, textureX, textureY)
			.addShapeBox(-4.65625f, -6.5f, -0.0625f, 9, 1, 1, 0, -0.125f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.625f, -0.125f, -1.25f, -0.625f, 0, 0.5f, -0.25f, 0.3125f, 0.5f, -0.25f, 0.3125f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(27.5f, 2.5f, 5.375f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 53, 223, textureX, textureY)
			.addShapeBox(-0.5f, -6.75f, -0.0625f, 1, 1, 1, 0, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(27.5f, 2.5f, 5.3125f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 409, 222, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(27.5f, 2.5f, 5.3125f).setRotationAngle(0, 0, 18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 361, 220, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(27.5f, 2.5f, 5.3125f).setRotationAngle(0, 0, -18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 396, 207, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, 5.375f).setRotationAngle(0, 0, -81)
		);
		Frame.add(new ModelRendererTurbo(Frame, 6, 207, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, 5.375f).setRotationAngle(0, 0, -99)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 207, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, 5.375f).setRotationAngle(0, 0, -117)
		);
		Frame.add(new ModelRendererTurbo(Frame, 220, 205, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, 5.375f).setRotationAngle(0, 0, -63)
		);
		Frame.add(new ModelRendererTurbo(Frame, 128, 241, textureX, textureY)
			.addShapeBox(1.21875f, -3.09375f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -0.375f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.0625f, -0.375f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 72, 241, textureX, textureY)
			.addShapeBox(-4.21875f, -4, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 27, 241, textureX, textureY)
			.addShapeBox(-4.21875f, -3.75f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.0625f, -0.3125f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 30, 220, textureX, textureY)
			.addShapeBox(-2.1875f, -2.4375f, 0, 1, 1, 1, 0, 0.46875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.125f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.0625f, -0.125f, -0.625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 18, 241, textureX, textureY)
			.addShapeBox(-4.21875f, -3.09375f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -1.625f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.0625f, -1.625f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 503, 203, textureX, textureY).addHollowCylinder(-5.25f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 294, 203, textureX, textureY).addHollowCylinder(-5.25f, 1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 269, 202, textureX, textureY).addHollowCylinder(-5.25f, -1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 454, 6, textureX, textureY).addHollowCylinder(0, 0, 0, 7.5f, 7, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(12, 2.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 16, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(12, 2.5f, 4.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 29, 202, textureX, textureY).addHollowCylinder(-3.5f, 0, 0, 1.125f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(12, 2.5f, 4.875f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 307, 271, textureX, textureY)
			.addShapeBox(-1.125f, 2, 0, 2, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 409, 219, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(12, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 507, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 53, 218, textureX, textureY)
			.addShapeBox(-1.25f, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(12, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 244, 217, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 2.5f, 4.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 6, 53, textureX, textureY).addHollowCylinder(0, 5.71875f, 0.25f, 1, 0.75f, 1, 10, 0, 0.875f, 0.875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 31, 139, textureX, textureY).addHollowCylinder(0, 0, 0, 7, 6.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(12, 2.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 449, 6, textureX, textureY).addHollowCylinder(2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 6, textureX, textureY).addHollowCylinder(-2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 6, 202, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 300, 271, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 293, 271, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 202, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 397, 197, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 286, 271, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 279, 271, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 430, 196, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 31, 194, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 272, 271, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 265, 271, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 25, 194, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 194, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 258, 271, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 251, 271, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 188, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 183, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 244, 271, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 228, 271, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 178, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 456, 175, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 214, 271, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 207, 271, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 423, 175, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 200, 271, textureX, textureY)
			.addShapeBox(2.75f, -0.875f, 0, 2, 1, 1, 0, 0, -0.005f, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, -0.005f, -0.0625f, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 134, 271, textureX, textureY)
			.addShapeBox(2.75f, -0.125f, 0, 2, 1, 1, 0, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f, 0, 0, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 126, 217, textureX, textureY)
			.addShapeBox(2.25f, -0.875f, 0, 1, 1, 1, 0, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 443, 216, textureX, textureY)
			.addShapeBox(2.25f, -0.125f, 0, 1, 1, 1, 0, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 127, 271, textureX, textureY)
			.addShapeBox(-4.75f, -0.875f, 0, 2, 1, 1, 0, -0.25f, 0.4175f, -0.3125f, 0, -0.005f, -0.3125f, 0, -0.005f, -0.0625f, -0.25f, 0.4175f, -0.0625f, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 120, 271, textureX, textureY)
			.addShapeBox(-4.75f, -0.125f, 0, 2, 1, 1, 0, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f, -0.25f, 0.4175f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.25f, 0.4175f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 289, 185, textureX, textureY)
			.addShapeBox(-2.28125f, -0.84375f, 0, 5, 2, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 305, 216, textureX, textureY)
			.addShapeBox(-3.25f, -0.875f, 0, 1, 1, 1, 0, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 274, 216, textureX, textureY)
			.addShapeBox(-3.25f, -0.125f, 0, 1, 1, 1, 0, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 205, 184, textureX, textureY)
			.addShapeBox(-2.28125f, -1.34375f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 289, 181, textureX, textureY)
			.addShapeBox(-2.28125f, -6.5f, 0, 5, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.0625f, -0.3125f, 0.03125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 9, 241, textureX, textureY)
			.addShapeBox(-2.28125f, -6.8125f, 0, 3, 1, 1, 0, -0.3125f, -0.1875f, -0.3125f, -0.71875f, 0, -0.3125f, -0.71875f, 0, -0.0625f, -0.3125f, -0.1875f, -0.0625f, -0.3125f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.0625f, -0.3125f, -0.6875f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 241, textureX, textureY)
			.addShapeBox(-0.71875f, -6.8125f, 0, 3, 1, 1, 0, -0.71875f, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.0625f, -0.71875f, -0.6875f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 471, 240, textureX, textureY)
			.addShapeBox(-4.21875f, -5.625f, 0, 3, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.3125f, -0.375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 462, 240, textureX, textureY)
			.addShapeBox(-4.21875f, -6.5f, 0, 3, 1, 1, 0, -1.4375f, -0.25f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -1.4375f, -0.25f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 453, 240, textureX, textureY)
			.addShapeBox(1.21875f, -5.625f, 0, 3, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 444, 240, textureX, textureY)
			.addShapeBox(1.21875f, -6.5f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -1.4375f, -0.25f, -0.3125f, -1.4375f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.0625f, -0.75f, -0.125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 87, 271, textureX, textureY)
			.addShapeBox(-5.15625f, -5.625f, 0, 2, 2, 1, 0, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 80, 271, textureX, textureY)
			.addShapeBox(-6.09375f, -4.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 42, 271, textureX, textureY)
			.addShapeBox(-6.84375f, -3.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 35, 271, textureX, textureY)
			.addShapeBox(3.15625f, -5.625f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 9, 271, textureX, textureY)
			.addShapeBox(4.09375f, -4.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 505, 270, textureX, textureY)
			.addShapeBox(4.84375f, -3.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 498, 270, textureX, textureY)
			.addShapeBox(-6.84375f, -2.375f, 0, 2, 1, 1, 0, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 491, 270, textureX, textureY)
			.addShapeBox(-6.84375f, -1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 464, 270, textureX, textureY)
			.addShapeBox(-6.96875f, -0.65625f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 431, 270, textureX, textureY)
			.addShapeBox(-6.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 380, 270, textureX, textureY)
			.addShapeBox(-6.84375f, 0.375f, 0, 2, 1, 1, 0, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 358, 270, textureX, textureY)
			.addShapeBox(4.84375f, -2.375f, 0, 2, 1, 1, 0, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 341, 270, textureX, textureY)
			.addShapeBox(4.84375f, -1.375f, 0, 2, 1, 1, 0, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 193, 270, textureX, textureY)
			.addShapeBox(4.96875f, -0.65625f, 0, 2, 1, 1, 0, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 186, 270, textureX, textureY)
			.addShapeBox(4.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 113, 270, textureX, textureY)
			.addShapeBox(4.84375f, 0.375f, 0, 2, 1, 1, 0, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		this.groups.add(Frame);
	}

	private final void initGroup_Frame2(){
		TurboList Frame = new TurboList("Frame");
		Frame.add(new ModelRendererTurbo(Frame, 286, 173, textureX, textureY)
			.addShapeBox(-2.28125f, 0.453125f, 0, 5, 1, 1, 0, 0, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.0625f, 0, -0.640625f, -0.0625f, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 106, 270, textureX, textureY)
			.addShapeBox(-5.15625f, 3.59375f, 0, 2, 2, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 334, 269, textureX, textureY)
			.addShapeBox(-6.09375f, 2.875f, 0, 2, 2, 1, 0, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 237, 269, textureX, textureY)
			.addShapeBox(-6.84375f, 1.875f, 0, 2, 2, 1, 0, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 399, 256, textureX, textureY)
			.addShapeBox(-6.84375f, 1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 221, 269, textureX, textureY)
			.addShapeBox(3.140625f, 3.59375f, 0, 2, 2, 1, 0, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 424, 268, textureX, textureY)
			.addShapeBox(4.078125f, 2.875f, 0, 2, 2, 1, 0, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 286, 251, textureX, textureY)
			.addShapeBox(4.828125f, 1.875f, 0, 2, 2, 1, 0, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 505, 246, textureX, textureY)
			.addShapeBox(4.84375f, 1.375f, 0, 2, 1, 1, 0, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 144, textureX, textureY)
			.addShapeBox(-2.28125f, 1.296875f, 0, 5, 1, 1, 0, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f, -0.28125f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.0625f, -0.28125f, -0.4375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 248, 180, textureX, textureY)
			.addShapeBox(-2.28125f, 1.859375f, 0, 5, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.0625f, -0.3125f, -0.8125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 435, 240, textureX, textureY)
			.addShapeBox(1.65625f, 1.859375f, 0, 3, 2, 1, 0, -0.3125f, -0.046875f, -0.3125f, -0.765625f, -0.984375f, -0.3125f, -0.765625f, -0.984375f, -0.0625f, -0.3125f, -0.046875f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 139, 213, textureX, textureY)
			.addShapeBox(1.96875f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 274, 206, textureX, textureY)
			.addShapeBox(2.890625f, 3.734375f, 0, 1, 1, 1, 0, -0.453125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.453125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 444, 212, textureX, textureY)
			.addShapeBox(2.890625f, 4.234375f, 0, 1, 2, 1, 0, -0.78125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.78125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 140, 204, textureX, textureY)
			.addShapeBox(1.96875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 87, 204, textureX, textureY)
			.addShapeBox(2.671875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 79, 246, textureX, textureY)
			.addShapeBox(1.671875f, 5.3125f, 0, 2, 1, 1, 0, -0.296875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.296875f, 0, -0.0625f, -0.296875f, 0.234375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.0625f, -0.296875f, 0.203125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 426, 240, textureX, textureY)
			.addShapeBox(-4.671875f, 1.859375f, 0, 3, 2, 1, 0, -0.765625f, -0.984375f, -0.3125f, -0.296875f, -0.046875f, -0.3125f, -0.296875f, -0.046875f, -0.0625f, -0.765625f, -0.984375f, -0.0625f, -0.765625f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.0625f, -0.765625f, -0.125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 435, 200, textureX, textureY)
			.addShapeBox(-2.96875f, 3.734375f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 246, 199, textureX, textureY)
			.addShapeBox(-3.90625f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 114, 198, textureX, textureY)
			.addShapeBox(-3.90625f, 4.234375f, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.765625f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 56, 197, textureX, textureY)
			.addShapeBox(-3.671875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 282, 244, textureX, textureY)
			.addShapeBox(-3.671875f, 5.3125f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.296875f, 0, -0.3125f, -0.296875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.4375f, -0.3125f, -0.296875f, 0.234375f, -0.3125f, -0.296875f, 0.203125f, -0.0625f, 0, -0.4375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 56, 194, textureX, textureY)
			.addShapeBox(-2.96875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 456, 193, textureX, textureY)
			.addShapeBox(-0.75f, 5.046875f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 400, 192, textureX, textureY)
			.addShapeBox(-0.75f, 5.375f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 129, 185, textureX, textureY)
			.addShapeBox(-0.265625f, 5.046875f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 294, 176, textureX, textureY)
			.addShapeBox(-0.265625f, 5.375f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 438, 207, textureX, textureY)
			.addShapeBox(-0.03125f, 5.046875f, 0, 2, 1, 1, 0, -0.765625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -0.765625f, 0.75f, -0.3125f, 0, 0.515625f, -0.3125f, 0, 0.515625f, -0.0625f, -0.765625f, 0.75f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 206, textureX, textureY)
			.addShapeBox(-1.96875f, 5.046875f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.78125f, 0, -0.3125f, -0.78125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.515625f, -0.3125f, -0.78125f, 0.75f, -0.3125f, -0.78125f, 0.75f, -0.0625f, 0, 0.515625f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 282, 199, textureX, textureY)
			.addShapeBox(-0.75f, 6.375f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.515625f, 0, -0.3125f, -0.515625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 417, 175, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 384, 175, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 25, 157, textureX, textureY).addHollowCylinder(3.25f, 0, 0.25f, 1, 0.4296875f, 1, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 497, 165, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -62).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 496, 153, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -118).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 507, 150, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 242).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 70, 156, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 153, 147, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 298).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 213, 121, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 13, 108, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.578125f, 1, 10, 5, 0.59375f, 0.59375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -270)
		);
		Frame.add(new ModelRendererTurbo(Frame, 327, 141, textureX, textureY)
			.addShapeBox(3.25f, -0.40625f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, -90).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 213, 126, textureX, textureY)
			.addShapeBox(3.25f, -0.59375f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(12, 2.5f, 4.6719f).setRotationAngle(0, 0, 270).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 417, 240, textureX, textureY)
			.addShapeBox(-2.28125f, -4.46875f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.0625f, -0.3125f, -0.5625f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 325, 239, textureX, textureY)
			.addShapeBox(-0.71875f, -4.46875f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -1.1875f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.0625f, -1.1875f, -0.5625f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 82, 227, textureX, textureY)
			.addShapeBox(1.21875f, -4, 0, 3, 1, 1, 0, -0.8125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.8125f, 0, -0.0625f, -1.0625f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -1.0625f, -0.75f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 220, 221, textureX, textureY)
			.addShapeBox(1.21875f, -3.75f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -1.15625f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.0625f, -1.15625f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 257, 194, textureX, textureY)
			.addShapeBox(-1.5625f, -4.03125f, 0, 2, 1, 1, 0, -0.0625f, 0, -0.3125f, -0.90625f, 0, -0.3125f, -0.90625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 455, 185, textureX, textureY)
			.addShapeBox(-0.4375f, -4.03125f, 0, 2, 1, 1, 0, -0.90625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.0625f, -0.90625f, 0, -0.0625f, -0.625f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, -0.625f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 94, 68, textureX, textureY)
			.addShapeBox(-2.28125f, -2.0625f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.0625f, -0.3125f, -0.28125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 504, 172, textureX, textureY)
			.addShapeBox(-1.28125f, -3.03125f, 0, 2, 1, 1, 0, -0.09375f, 0, -0.3125f, 0.4375f, 0, -0.3125f, 0.40625f, 0, -0.0625f, -0.09375f, 0, -0.0625f, -0.09375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.0625f, -0.09375f, -0.03125f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 406, 118, textureX, textureY)
			.addShapeBox(1.15625f, -2.4375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.625f, -0.3125f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.625f, -0.0625f, 0, -0.625f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 432, 88, textureX, textureY)
			.addShapeBox(-4.65625f, -6.5f, -0.0625f, 9, 1, 1, 0, -0.125f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.625f, -0.125f, -1.25f, -0.625f, 0, 0.5f, -0.25f, 0.3125f, 0.5f, -0.25f, 0.3125f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(12, 2.5f, 5.375f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 425, 109, textureX, textureY)
			.addShapeBox(-0.5f, -6.75f, -0.0625f, 1, 1, 1, 0, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(12, 2.5f, 5.3125f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 238, 89, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(12, 2.5f, 5.3125f).setRotationAngle(0, 0, 18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 13, 88, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(12, 2.5f, 5.3125f).setRotationAngle(0, 0, -18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 107, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, 5.375f).setRotationAngle(0, 0, -81)
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 102, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, 5.375f).setRotationAngle(0, 0, -99)
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 97, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, 5.375f).setRotationAngle(0, 0, -117)
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 92, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, 5.375f).setRotationAngle(0, 0, -63)
		);
		Frame.add(new ModelRendererTurbo(Frame, 416, 212, textureX, textureY)
			.addShapeBox(1.21875f, -3.09375f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -0.375f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.0625f, -0.375f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 307, 212, textureX, textureY)
			.addShapeBox(-4.21875f, -4, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 242, 205, textureX, textureY)
			.addShapeBox(-4.21875f, -3.75f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.0625f, -0.3125f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 403, 52, textureX, textureY)
			.addShapeBox(-2.1875f, -2.4375f, 0, 1, 1, 1, 0, 0.46875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.125f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.0625f, -0.125f, -0.625f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 396, 189, textureX, textureY)
			.addShapeBox(-4.21875f, -3.09375f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -1.625f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.0625f, -1.625f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, 4.625f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 87, textureX, textureY).addHollowCylinder(-5.25f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 53, textureX, textureY).addHollowCylinder(-5.25f, 1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 222, 6, textureX, textureY).addHollowCylinder(-5.25f, -1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, 5.375f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 139, textureX, textureY).addHollowCylinder(0, 0, 0, 7.5f, 7, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-13.5f, 2.5f, -5).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 195, 37, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 42, 237, textureX, textureY).addHollowCylinder(-3.5f, 0, 0, 1.125f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 429, 288, textureX, textureY)
			.addShapeBox(-1.125f, 2, 0, 2, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 9, 304, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 303, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 494, 303, textureX, textureY)
			.addShapeBox(-1.25f, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 489, 303, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 17, 184, textureX, textureY).addHollowCylinder(0, 5.71875f, 0.25f, 1, 0.75f, 1, 10, 0, 0.875f, 0.875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 390, 149, textureX, textureY).addHollowCylinder(0, 0, 0, 7, 6.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(-13.5f, 2.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 129, 180, textureX, textureY).addHollowCylinder(2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 72, 180, textureX, textureY).addHollowCylinder(-2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 36, 237, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 422, 288, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 415, 288, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 485, 236, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 479, 236, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 408, 288, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 393, 288, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 358, 236, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 352, 236, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 386, 288, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 369, 288, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 346, 236, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 340, 236, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 362, 288, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 355, 288, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 334, 236, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 170, 236, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 122, 288, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 72, 288, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 135, 236, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 30, 236, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 13, 288, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 288, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 24, 236, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 499, 287, textureX, textureY)
			.addShapeBox(2.75f, -0.875f, 0, 2, 1, 1, 0, 0, -0.005f, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, -0.005f, -0.0625f, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 464, 287, textureX, textureY)
			.addShapeBox(2.75f, -0.125f, 0, 2, 1, 1, 0, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f, 0, 0, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 474, 303, textureX, textureY)
			.addShapeBox(2.25f, -0.875f, 0, 1, 1, 1, 0, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 443, 303, textureX, textureY)
			.addShapeBox(2.25f, -0.125f, 0, 1, 1, 1, 0, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 457, 287, textureX, textureY)
			.addShapeBox(-4.75f, -0.875f, 0, 2, 1, 1, 0, -0.25f, 0.4175f, -0.3125f, 0, -0.005f, -0.3125f, 0, -0.005f, -0.0625f, -0.25f, 0.4175f, -0.0625f, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 450, 287, textureX, textureY)
			.addShapeBox(-4.75f, -0.125f, 0, 2, 1, 1, 0, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f, -0.25f, 0.4175f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.25f, 0.4175f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 294, 212, textureX, textureY)
			.addShapeBox(-2.28125f, -0.84375f, 0, 5, 2, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 438, 303, textureX, textureY)
			.addShapeBox(-3.25f, -0.875f, 0, 1, 1, 1, 0, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 433, 303, textureX, textureY)
			.addShapeBox(-3.25f, -0.125f, 0, 1, 1, 1, 0, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 262, 211, textureX, textureY)
			.addShapeBox(-2.28125f, -1.34375f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 160, 211, textureX, textureY)
			.addShapeBox(-2.28125f, -6.5f, 0, 5, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.0625f, -0.3125f, 0.03125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 495, 249, textureX, textureY)
			.addShapeBox(-2.28125f, -6.8125f, 0, 3, 1, 1, 0, -0.3125f, -0.1875f, -0.3125f, -0.71875f, 0, -0.3125f, -0.71875f, 0, -0.0625f, -0.3125f, -0.1875f, -0.0625f, -0.3125f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.0625f, -0.3125f, -0.6875f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 377, 249, textureX, textureY)
			.addShapeBox(-0.71875f, -6.8125f, 0, 3, 1, 1, 0, -0.71875f, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.0625f, -0.71875f, -0.6875f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 345, 249, textureX, textureY)
			.addShapeBox(-4.21875f, -5.625f, 0, 3, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.3125f, -0.375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 336, 249, textureX, textureY)
			.addShapeBox(-4.21875f, -6.5f, 0, 3, 1, 1, 0, -1.4375f, -0.25f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -1.4375f, -0.25f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 320, 249, textureX, textureY)
			.addShapeBox(1.21875f, -5.625f, 0, 3, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 302, 249, textureX, textureY)
			.addShapeBox(1.21875f, -6.5f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -1.4375f, -0.25f, -0.3125f, -1.4375f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.0625f, -0.75f, -0.125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 443, 287, textureX, textureY)
			.addShapeBox(-5.15625f, -5.625f, 0, 2, 2, 1, 0, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 436, 287, textureX, textureY)
			.addShapeBox(-6.09375f, -4.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 401, 287, textureX, textureY)
			.addShapeBox(-6.84375f, -3.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 335, 287, textureX, textureY)
			.addShapeBox(3.15625f, -5.625f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 283, 287, textureX, textureY)
			.addShapeBox(4.09375f, -4.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 276, 287, textureX, textureY)
			.addShapeBox(4.84375f, -3.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 269, 287, textureX, textureY)
			.addShapeBox(-6.84375f, -2.375f, 0, 2, 1, 1, 0, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 248, 287, textureX, textureY)
			.addShapeBox(-6.84375f, -1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 241, 287, textureX, textureY)
			.addShapeBox(-6.96875f, -0.65625f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 234, 287, textureX, textureY)
			.addShapeBox(-6.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 206, 287, textureX, textureY)
			.addShapeBox(-6.84375f, 0.375f, 0, 2, 1, 1, 0, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 199, 287, textureX, textureY)
			.addShapeBox(4.84375f, -2.375f, 0, 2, 1, 1, 0, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 192, 287, textureX, textureY)
			.addShapeBox(4.84375f, -1.375f, 0, 2, 1, 1, 0, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 185, 287, textureX, textureY)
			.addShapeBox(4.96875f, -0.65625f, 0, 2, 1, 1, 0, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 178, 287, textureX, textureY)
			.addShapeBox(4.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 115, 287, textureX, textureY)
			.addShapeBox(4.84375f, 0.375f, 0, 2, 1, 1, 0, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 42, 211, textureX, textureY)
			.addShapeBox(-2.28125f, 0.453125f, 0, 5, 1, 1, 0, 0, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.0625f, 0, -0.640625f, -0.0625f, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 108, 287, textureX, textureY)
			.addShapeBox(-5.15625f, 3.59375f, 0, 2, 2, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 101, 287, textureX, textureY)
			.addShapeBox(-6.09375f, 2.875f, 0, 2, 2, 1, 0, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 94, 287, textureX, textureY)
			.addShapeBox(-6.84375f, 1.875f, 0, 2, 2, 1, 0, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 87, 287, textureX, textureY)
			.addShapeBox(-6.84375f, 1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 80, 287, textureX, textureY)
			.addShapeBox(3.140625f, 3.59375f, 0, 2, 2, 1, 0, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 65, 287, textureX, textureY)
			.addShapeBox(4.078125f, 2.875f, 0, 2, 2, 1, 0, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 53, 287, textureX, textureY)
			.addShapeBox(4.828125f, 1.875f, 0, 2, 2, 1, 0, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 46, 287, textureX, textureY)
			.addShapeBox(4.84375f, 1.375f, 0, 2, 1, 1, 0, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 29, 211, textureX, textureY)
			.addShapeBox(-2.28125f, 1.296875f, 0, 5, 1, 1, 0, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f, -0.28125f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.0625f, -0.28125f, -0.4375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 126, 211, textureX, textureY)
			.addShapeBox(-2.28125f, 1.859375f, 0, 5, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.0625f, -0.3125f, -0.8125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 257, 249, textureX, textureY)
			.addShapeBox(1.65625f, 1.859375f, 0, 3, 2, 1, 0, -0.3125f, -0.046875f, -0.3125f, -0.765625f, -0.984375f, -0.3125f, -0.765625f, -0.984375f, -0.0625f, -0.3125f, -0.046875f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 428, 303, textureX, textureY)
			.addShapeBox(1.96875f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 416, 303, textureX, textureY)
			.addShapeBox(2.890625f, 3.734375f, 0, 1, 1, 1, 0, -0.453125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.453125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 411, 303, textureX, textureY)
			.addShapeBox(2.890625f, 4.234375f, 0, 1, 2, 1, 0, -0.78125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.78125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 406, 303, textureX, textureY)
			.addShapeBox(1.96875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 401, 303, textureX, textureY)
			.addShapeBox(2.671875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 39, 287, textureX, textureY)
			.addShapeBox(1.671875f, 5.3125f, 0, 2, 1, 1, 0, -0.296875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.296875f, 0, -0.0625f, -0.296875f, 0.234375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.0625f, -0.296875f, 0.203125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 207, 249, textureX, textureY)
			.addShapeBox(-4.671875f, 1.859375f, 0, 3, 2, 1, 0, -0.765625f, -0.984375f, -0.3125f, -0.296875f, -0.046875f, -0.3125f, -0.296875f, -0.046875f, -0.0625f, -0.765625f, -0.984375f, -0.0625f, -0.765625f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.0625f, -0.765625f, -0.125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 396, 303, textureX, textureY)
			.addShapeBox(-2.96875f, 3.734375f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 391, 303, textureX, textureY)
			.addShapeBox(-3.90625f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 381, 303, textureX, textureY)
			.addShapeBox(-3.90625f, 4.234375f, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.765625f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 369, 303, textureX, textureY)
			.addShapeBox(-3.671875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 26, 287, textureX, textureY)
			.addShapeBox(-3.671875f, 5.3125f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.296875f, 0, -0.3125f, -0.296875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.4375f, -0.3125f, -0.296875f, 0.234375f, -0.3125f, -0.296875f, 0.203125f, -0.0625f, 0, -0.4375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 354, 303, textureX, textureY)
			.addShapeBox(-2.96875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 349, 303, textureX, textureY)
			.addShapeBox(-0.75f, 5.046875f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 337, 303, textureX, textureY)
			.addShapeBox(-0.75f, 5.375f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 332, 303, textureX, textureY)
			.addShapeBox(-0.265625f, 5.046875f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 318, 303, textureX, textureY)
			.addShapeBox(-0.265625f, 5.375f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 380, 286, textureX, textureY)
			.addShapeBox(-0.03125f, 5.046875f, 0, 2, 1, 1, 0, -0.765625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -0.765625f, 0.75f, -0.3125f, 0, 0.515625f, -0.3125f, 0, 0.515625f, -0.0625f, -0.765625f, 0.75f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 342, 286, textureX, textureY)
			.addShapeBox(-1.96875f, 5.046875f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.78125f, 0, -0.3125f, -0.78125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.515625f, -0.3125f, -0.78125f, 0.75f, -0.3125f, -0.78125f, 0.75f, -0.0625f, 0, 0.515625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 305, 286, textureX, textureY)
			.addShapeBox(-0.75f, 6.375f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.515625f, 0, -0.3125f, -0.515625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 18, 236, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 12, 236, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 6, 236, textureX, textureY).addHollowCylinder(3.25f, 0, 0.25f, 1, 0.4296875f, 1, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 313, 303, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -62).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 308, 303, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -118).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 303, 303, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 242).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 236, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 298, 303, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 298).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 473, 235, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 467, 235, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.578125f, 1, 10, 5, 0.59375f, 0.59375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -270)
		);
		Frame.add(new ModelRendererTurbo(Frame, 293, 303, textureX, textureY)
			.addShapeBox(3.25f, -0.40625f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -90).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 288, 303, textureX, textureY)
			.addShapeBox(3.25f, -0.59375f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-13.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 270).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 140, 249, textureX, textureY)
			.addShapeBox(-2.28125f, -4.46875f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.0625f, -0.3125f, -0.5625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 109, 249, textureX, textureY)
			.addShapeBox(-0.71875f, -4.46875f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -1.1875f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.0625f, -1.1875f, -0.5625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 62, 249, textureX, textureY)
			.addShapeBox(1.21875f, -4, 0, 3, 1, 1, 0, -0.8125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.8125f, 0, -0.0625f, -1.0625f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -1.0625f, -0.75f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 249, textureX, textureY)
			.addShapeBox(1.21875f, -3.75f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -1.15625f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.0625f, -1.15625f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 298, 286, textureX, textureY)
			.addShapeBox(-1.5625f, -4.03125f, 0, 2, 1, 1, 0, -0.0625f, 0, -0.3125f, -0.90625f, 0, -0.3125f, -0.90625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 291, 286, textureX, textureY)
			.addShapeBox(-0.4375f, -4.03125f, 0, 2, 1, 1, 0, -0.90625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.0625f, -0.90625f, 0, -0.0625f, -0.625f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, -0.625f, 0, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 367, 210, textureX, textureY)
			.addShapeBox(-2.28125f, -2.0625f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.0625f, -0.3125f, -0.28125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 262, 286, textureX, textureY)
			.addShapeBox(-1.28125f, -3.03125f, 0, 2, 1, 1, 0, -0.09375f, 0, -0.3125f, 0.4375f, 0, -0.3125f, 0.40625f, 0, -0.0625f, -0.09375f, 0, -0.0625f, -0.09375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.0625f, -0.09375f, -0.03125f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 283, 303, textureX, textureY)
			.addShapeBox(1.15625f, -2.4375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.625f, -0.3125f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.625f, -0.0625f, 0, -0.625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 164, textureX, textureY)
			.addShapeBox(-4.65625f, -6.5f, -0.0625f, 9, 1, 1, 0, -0.125f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.625f, -0.125f, -1.25f, -0.625f, 0, 0.5f, -0.25f, 0.3125f, 0.5f, -0.25f, 0.3125f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 278, 303, textureX, textureY)
			.addShapeBox(-0.5f, -6.75f, -0.0625f, 1, 1, 1, 0, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 273, 303, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 259, 303, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 461, 235, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -81)
		);
		Frame.add(new ModelRendererTurbo(Frame, 455, 235, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -99)
		);
		Frame.add(new ModelRendererTurbo(Frame, 449, 235, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -117)
		);
		Frame.add(new ModelRendererTurbo(Frame, 443, 235, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -63)
		);
		Frame.add(new ModelRendererTurbo(Frame, 478, 248, textureX, textureY)
			.addShapeBox(1.21875f, -3.09375f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -0.375f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.0625f, -0.375f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 449, 248, textureX, textureY)
			.addShapeBox(-4.21875f, -4, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 422, 248, textureX, textureY)
			.addShapeBox(-4.21875f, -3.75f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.0625f, -0.3125f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 254, 303, textureX, textureY)
			.addShapeBox(-2.1875f, -2.4375f, 0, 1, 1, 1, 0, 0.46875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.125f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.0625f, -0.125f, -0.625f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 405, 248, textureX, textureY)
			.addShapeBox(-4.21875f, -3.09375f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -1.625f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.0625f, -1.625f, -0.34375f, -0.0625f)
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 437, 235, textureX, textureY).addHollowCylinder(-5.25f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 431, 235, textureX, textureY).addHollowCylinder(-5.25f, 1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 425, 235, textureX, textureY).addHollowCylinder(-5.25f, -1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-13.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 332, 131, textureX, textureY).addHollowCylinder(0, 0, 0, 7.5f, 7, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(-29, 2.5f, -5).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 502, 36, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 128, 235, textureX, textureY).addHollowCylinder(-3.5f, 0, 0, 1.125f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 255, 286, textureX, textureY)
			.addShapeBox(-1.125f, 2, 0, 2, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 242, 303, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 237, 303, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 232, 303, textureX, textureY)
			.addShapeBox(-1.25f, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 227, 303, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 17, 179, textureX, textureY).addHollowCylinder(0, 5.71875f, 0.25f, 1, 0.75f, 1, 10, 0, 0.875f, 0.875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 361, 149, textureX, textureY).addHollowCylinder(0, 0, 0, 7, 6.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(-29, 2.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 507, 145, textureX, textureY).addHollowCylinder(2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 507, 140, textureX, textureY).addHollowCylinder(-2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 122, 235, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 227, 286, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 220, 286, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 116, 235, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 110, 235, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 213, 286, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 171, 286, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 104, 235, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 98, 235, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 153, 286, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 146, 286, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 328, 234, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 273, 234, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 139, 286, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 19, 286, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 267, 234, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 261, 234, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 7, 286, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 493, 285, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 255, 234, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 249, 234, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 486, 285, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 479, 285, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 243, 234, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 472, 285, textureX, textureY)
			.addShapeBox(2.75f, -0.875f, 0, 2, 1, 1, 0, 0, -0.005f, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, -0.005f, -0.0625f, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 430, 285, textureX, textureY)
			.addShapeBox(2.75f, -0.125f, 0, 2, 1, 1, 0, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f, 0, 0, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 222, 303, textureX, textureY)
			.addShapeBox(2.25f, -0.875f, 0, 1, 1, 1, 0, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 217, 303, textureX, textureY)
			.addShapeBox(2.25f, -0.125f, 0, 1, 1, 1, 0, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 373, 285, textureX, textureY)
			.addShapeBox(-4.75f, -0.875f, 0, 2, 1, 1, 0, -0.25f, 0.4175f, -0.3125f, 0, -0.005f, -0.3125f, 0, -0.005f, -0.0625f, -0.25f, 0.4175f, -0.0625f, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 366, 285, textureX, textureY)
			.addShapeBox(-4.75f, -0.125f, 0, 2, 1, 1, 0, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f, -0.25f, 0.4175f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.25f, 0.4175f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 189, 210, textureX, textureY)
			.addShapeBox(-2.28125f, -0.84375f, 0, 5, 2, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 212, 303, textureX, textureY)
			.addShapeBox(-3.25f, -0.875f, 0, 1, 1, 1, 0, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 207, 303, textureX, textureY)
			.addShapeBox(-3.25f, -0.125f, 0, 1, 1, 1, 0, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 93, 210, textureX, textureY)
			.addShapeBox(-2.28125f, -1.34375f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 497, 209, textureX, textureY)
			.addShapeBox(-2.28125f, -6.5f, 0, 5, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.0625f, -0.3125f, 0.03125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 396, 248, textureX, textureY)
			.addShapeBox(-2.28125f, -6.8125f, 0, 3, 1, 1, 0, -0.3125f, -0.1875f, -0.3125f, -0.71875f, 0, -0.3125f, -0.71875f, 0, -0.0625f, -0.3125f, -0.1875f, -0.0625f, -0.3125f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.0625f, -0.3125f, -0.6875f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 368, 248, textureX, textureY)
			.addShapeBox(-0.71875f, -6.8125f, 0, 3, 1, 1, 0, -0.71875f, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.0625f, -0.71875f, -0.6875f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 248, 248, textureX, textureY)
			.addShapeBox(-4.21875f, -5.625f, 0, 3, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.3125f, -0.375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 239, 248, textureX, textureY)
			.addShapeBox(-4.21875f, -6.5f, 0, 3, 1, 1, 0, -1.4375f, -0.25f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -1.4375f, -0.25f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 230, 248, textureX, textureY)
			.addShapeBox(1.21875f, -5.625f, 0, 3, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 154, 248, textureX, textureY)
			.addShapeBox(1.21875f, -6.5f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -1.4375f, -0.25f, -0.3125f, -1.4375f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.0625f, -0.75f, -0.125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 349, 285, textureX, textureY)
			.addShapeBox(-5.15625f, -5.625f, 0, 2, 2, 1, 0, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 328, 285, textureX, textureY)
			.addShapeBox(-6.09375f, -4.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 321, 285, textureX, textureY)
			.addShapeBox(-6.84375f, -3.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 314, 285, textureX, textureY)
			.addShapeBox(3.15625f, -5.625f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 164, 285, textureX, textureY)
			.addShapeBox(4.09375f, -4.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 132, 285, textureX, textureY)
			.addShapeBox(4.84375f, -3.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 74, 285, textureX, textureY)
			.addShapeBox(-6.84375f, -2.375f, 0, 2, 1, 1, 0, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 59, 285, textureX, textureY)
			.addShapeBox(-6.84375f, -1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 33, 285, textureX, textureY)
			.addShapeBox(-6.96875f, -0.65625f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 285, textureX, textureY)
			.addShapeBox(-6.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 500, 284, textureX, textureY)
			.addShapeBox(-6.84375f, 0.375f, 0, 2, 1, 1, 0, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 465, 284, textureX, textureY)
			.addShapeBox(4.84375f, -2.375f, 0, 2, 1, 1, 0, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 458, 284, textureX, textureY)
			.addShapeBox(4.84375f, -1.375f, 0, 2, 1, 1, 0, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 451, 284, textureX, textureY)
			.addShapeBox(4.96875f, -0.65625f, 0, 2, 1, 1, 0, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 444, 284, textureX, textureY)
			.addShapeBox(4.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 437, 284, textureX, textureY)
			.addShapeBox(4.84375f, 0.375f, 0, 2, 1, 1, 0, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 126, 208, textureX, textureY)
			.addShapeBox(-2.28125f, 0.453125f, 0, 5, 1, 1, 0, 0, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.0625f, 0, -0.640625f, -0.0625f, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 423, 284, textureX, textureY)
			.addShapeBox(-5.15625f, 3.59375f, 0, 2, 2, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 416, 284, textureX, textureY)
			.addShapeBox(-6.09375f, 2.875f, 0, 2, 2, 1, 0, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 409, 284, textureX, textureY)
			.addShapeBox(-6.84375f, 1.875f, 0, 2, 2, 1, 0, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 402, 284, textureX, textureY)
			.addShapeBox(-6.84375f, 1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 395, 284, textureX, textureY)
			.addShapeBox(3.140625f, 3.59375f, 0, 2, 2, 1, 0, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 388, 284, textureX, textureY)
			.addShapeBox(4.078125f, 2.875f, 0, 2, 2, 1, 0, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 359, 284, textureX, textureY)
			.addShapeBox(4.828125f, 1.875f, 0, 2, 2, 1, 0, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 336, 284, textureX, textureY)
			.addShapeBox(4.84375f, 1.375f, 0, 2, 1, 1, 0, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 367, 207, textureX, textureY)
			.addShapeBox(-2.28125f, 1.296875f, 0, 5, 1, 1, 0, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f, -0.28125f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.0625f, -0.28125f, -0.4375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 338, 207, textureX, textureY)
			.addShapeBox(-2.28125f, 1.859375f, 0, 5, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.0625f, -0.3125f, -0.8125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 131, 248, textureX, textureY)
			.addShapeBox(1.65625f, 1.859375f, 0, 3, 2, 1, 0, -0.3125f, -0.046875f, -0.3125f, -0.765625f, -0.984375f, -0.3125f, -0.765625f, -0.984375f, -0.0625f, -0.3125f, -0.046875f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 202, 303, textureX, textureY)
			.addShapeBox(1.96875f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 197, 303, textureX, textureY)
			.addShapeBox(2.890625f, 3.734375f, 0, 1, 1, 1, 0, -0.453125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.453125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 192, 303, textureX, textureY)
			.addShapeBox(2.890625f, 4.234375f, 0, 1, 2, 1, 0, -0.78125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.78125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 187, 303, textureX, textureY)
			.addShapeBox(1.96875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 182, 303, textureX, textureY)
			.addShapeBox(2.671875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 285, 284, textureX, textureY)
			.addShapeBox(1.671875f, 5.3125f, 0, 2, 1, 1, 0, -0.296875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.296875f, 0, -0.0625f, -0.296875f, 0.234375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.0625f, -0.296875f, 0.203125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 53, 248, textureX, textureY)
			.addShapeBox(-4.671875f, 1.859375f, 0, 3, 2, 1, 0, -0.765625f, -0.984375f, -0.3125f, -0.296875f, -0.046875f, -0.3125f, -0.296875f, -0.046875f, -0.0625f, -0.765625f, -0.984375f, -0.0625f, -0.765625f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.0625f, -0.765625f, -0.125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 177, 303, textureX, textureY)
			.addShapeBox(-2.96875f, 3.734375f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 172, 303, textureX, textureY)
			.addShapeBox(-3.90625f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 162, 303, textureX, textureY)
			.addShapeBox(-3.90625f, 4.234375f, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.765625f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 148, 303, textureX, textureY)
			.addShapeBox(-3.671875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 278, 284, textureX, textureY)
			.addShapeBox(-3.671875f, 5.3125f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.296875f, 0, -0.3125f, -0.296875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.4375f, -0.3125f, -0.296875f, 0.234375f, -0.3125f, -0.296875f, 0.203125f, -0.0625f, 0, -0.4375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 143, 303, textureX, textureY)
			.addShapeBox(-2.96875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 118, 303, textureX, textureY)
			.addShapeBox(-0.75f, 5.046875f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 113, 303, textureX, textureY)
			.addShapeBox(-0.75f, 5.375f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 98, 303, textureX, textureY)
			.addShapeBox(-0.265625f, 5.046875f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 30, 303, textureX, textureY)
			.addShapeBox(-0.265625f, 5.375f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 271, 284, textureX, textureY)
			.addShapeBox(-0.03125f, 5.046875f, 0, 2, 1, 1, 0, -0.765625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -0.765625f, 0.75f, -0.3125f, 0, 0.515625f, -0.3125f, 0, 0.515625f, -0.0625f, -0.765625f, 0.75f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 249, 284, textureX, textureY)
			.addShapeBox(-1.96875f, 5.046875f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.78125f, 0, -0.3125f, -0.78125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.515625f, -0.3125f, -0.78125f, 0.75f, -0.3125f, -0.78125f, 0.75f, -0.0625f, 0, 0.515625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 242, 284, textureX, textureY)
			.addShapeBox(-0.75f, 6.375f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.515625f, 0, -0.3125f, -0.515625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 237, 234, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 231, 234, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 501, 233, textureX, textureY).addHollowCylinder(3.25f, 0, 0.25f, 1, 0.4296875f, 1, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 506, 302, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -62).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 484, 302, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -118).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 469, 302, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 242).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 495, 233, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 461, 302, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 298).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 419, 233, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 413, 233, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.578125f, 1, 10, 5, 0.59375f, 0.59375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -270)
		);
		Frame.add(new ModelRendererTurbo(Frame, 376, 302, textureX, textureY)
			.addShapeBox(3.25f, -0.40625f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, -90).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 268, 302, textureX, textureY)
			.addShapeBox(3.25f, -0.59375f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(-29, 2.5f, -5.8281f).setRotationAngle(0, 0, 270).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 44, 248, textureX, textureY)
			.addShapeBox(-2.28125f, -4.46875f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.0625f, -0.3125f, -0.5625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 17, 248, textureX, textureY)
			.addShapeBox(-0.71875f, -4.46875f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -1.1875f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.0625f, -1.1875f, -0.5625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 487, 247, textureX, textureY)
			.addShapeBox(1.21875f, -4, 0, 3, 1, 1, 0, -0.8125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.8125f, 0, -0.0625f, -1.0625f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -1.0625f, -0.75f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 469, 247, textureX, textureY)
			.addShapeBox(1.21875f, -3.75f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -1.15625f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.0625f, -1.15625f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 235, 284, textureX, textureY)
			.addShapeBox(-1.5625f, -4.03125f, 0, 2, 1, 1, 0, -0.0625f, 0, -0.3125f, -0.90625f, 0, -0.3125f, -0.90625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 186, 284, textureX, textureY)
			.addShapeBox(-0.4375f, -4.03125f, 0, 2, 1, 1, 0, -0.90625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.0625f, -0.90625f, 0, -0.0625f, -0.625f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, -0.625f, 0, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 189, 207, textureX, textureY)
			.addShapeBox(-2.28125f, -2.0625f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.0625f, -0.3125f, -0.28125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 179, 284, textureX, textureY)
			.addShapeBox(-1.28125f, -3.03125f, 0, 2, 1, 1, 0, -0.09375f, 0, -0.3125f, 0.4375f, 0, -0.3125f, 0.40625f, 0, -0.0625f, -0.09375f, 0, -0.0625f, -0.09375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.0625f, -0.09375f, -0.03125f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 104, 302, textureX, textureY)
			.addShapeBox(1.15625f, -2.4375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.625f, -0.3125f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.625f, -0.0625f, 0, -0.625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 161, textureX, textureY)
			.addShapeBox(-4.65625f, -6.5f, -0.0625f, 9, 1, 1, 0, -0.125f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.625f, -0.125f, -1.25f, -0.625f, 0, 0.5f, -0.25f, 0.3125f, 0.5f, -0.25f, 0.3125f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 93, 302, textureX, textureY)
			.addShapeBox(-0.5f, -6.75f, -0.0625f, 1, 1, 1, 0, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 70, 302, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 65, 302, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, -18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 407, 233, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, -81)
		);
		Frame.add(new ModelRendererTurbo(Frame, 401, 233, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, -99)
		);
		Frame.add(new ModelRendererTurbo(Frame, 395, 233, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, -117)
		);
		Frame.add(new ModelRendererTurbo(Frame, 389, 233, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, -63)
		);
		Frame.add(new ModelRendererTurbo(Frame, 460, 247, textureX, textureY)
			.addShapeBox(1.21875f, -3.09375f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -0.375f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.0625f, -0.375f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 440, 247, textureX, textureY)
			.addShapeBox(-4.21875f, -4, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 431, 247, textureX, textureY)
			.addShapeBox(-4.21875f, -3.75f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.0625f, -0.3125f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 53, 302, textureX, textureY)
			.addShapeBox(-2.1875f, -2.4375f, 0, 1, 1, 1, 0, 0.46875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.125f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.0625f, -0.125f, -0.625f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 359, 247, textureX, textureY)
			.addShapeBox(-4.21875f, -3.09375f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -1.625f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.0625f, -1.625f, -0.34375f, -0.0625f)
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 383, 233, textureX, textureY).addHollowCylinder(-5.25f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 377, 233, textureX, textureY).addHollowCylinder(-5.25f, 1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 371, 233, textureX, textureY).addHollowCylinder(-5.25f, -1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(-29, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 479, 122, textureX, textureY).addHollowCylinder(0, 0, 0, 7.5f, 7, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(27.5f, 2.5f, -5).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 413, 35, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 364, 233, textureX, textureY).addHollowCylinder(-3.5f, 0, 0, 1.125f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 125, 284, textureX, textureY)
			.addShapeBox(-1.125f, 2, 0, 2, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 18, 302, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 5, 302, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 302, textureX, textureY)
			.addShapeBox(-1.25f, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 479, 301, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 327, 136, textureX, textureY).addHollowCylinder(0, 5.71875f, 0.25f, 1, 0.75f, 1, 10, 0, 0.875f, 0.875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 332, 149, textureX, textureY).addHollowCylinder(0, 0, 0, 7, 6.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(27.5f, 2.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 327, 131, textureX, textureY).addHollowCylinder(2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 425, 104, textureX, textureY).addHollowCylinder(-2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 292, 233, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 118, 284, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 104, 284, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 286, 233, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 280, 233, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 97, 284, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 90, 284, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 164, 233, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 158, 233, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 67, 284, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 45, 284, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 152, 233, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 146, 233, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 26, 284, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 13, 284, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 140, 233, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 322, 232, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 381, 283, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 343, 283, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 232, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 310, 232, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 308, 283, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 293, 283, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 304, 232, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 264, 283, textureX, textureY)
			.addShapeBox(2.75f, -0.875f, 0, 2, 1, 1, 0, 0, -0.005f, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, -0.005f, -0.0625f, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 228, 283, textureX, textureY)
			.addShapeBox(2.75f, -0.125f, 0, 2, 1, 1, 0, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f, 0, 0, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 456, 301, textureX, textureY)
			.addShapeBox(2.25f, -0.875f, 0, 1, 1, 1, 0, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 451, 301, textureX, textureY)
			.addShapeBox(2.25f, -0.125f, 0, 1, 1, 1, 0, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 221, 283, textureX, textureY)
			.addShapeBox(-4.75f, -0.875f, 0, 2, 1, 1, 0, -0.25f, 0.4175f, -0.3125f, 0, -0.005f, -0.3125f, 0, -0.005f, -0.0625f, -0.25f, 0.4175f, -0.0625f, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 214, 283, textureX, textureY)
			.addShapeBox(-4.75f, -0.125f, 0, 2, 1, 1, 0, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f, -0.25f, 0.4175f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.25f, 0.4175f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 160, 207, textureX, textureY)
			.addShapeBox(-2.28125f, -0.84375f, 0, 5, 2, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 424, 301, textureX, textureY)
			.addShapeBox(-3.25f, -0.875f, 0, 1, 1, 1, 0, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 387, 301, textureX, textureY)
			.addShapeBox(-3.25f, -0.125f, 0, 1, 1, 1, 0, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 490, 206, textureX, textureY)
			.addShapeBox(-2.28125f, -1.34375f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 127, 204, textureX, textureY)
			.addShapeBox(-2.28125f, -6.5f, 0, 5, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.0625f, -0.3125f, 0.03125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 328, 247, textureX, textureY)
			.addShapeBox(-2.28125f, -6.8125f, 0, 3, 1, 1, 0, -0.3125f, -0.1875f, -0.3125f, -0.71875f, 0, -0.3125f, -0.71875f, 0, -0.0625f, -0.3125f, -0.1875f, -0.0625f, -0.3125f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.0625f, -0.3125f, -0.6875f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 312, 247, textureX, textureY)
			.addShapeBox(-0.71875f, -6.8125f, 0, 3, 1, 1, 0, -0.71875f, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.0625f, -0.71875f, -0.6875f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 274, 247, textureX, textureY)
			.addShapeBox(-4.21875f, -5.625f, 0, 3, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.3125f, -0.375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 265, 247, textureX, textureY)
			.addShapeBox(-4.21875f, -6.5f, 0, 3, 1, 1, 0, -1.4375f, -0.25f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -1.4375f, -0.25f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 198, 247, textureX, textureY)
			.addShapeBox(1.21875f, -5.625f, 0, 3, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 177, 247, textureX, textureY)
			.addShapeBox(1.21875f, -6.5f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -1.4375f, -0.25f, -0.3125f, -1.4375f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.0625f, -0.75f, -0.125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 207, 283, textureX, textureY)
			.addShapeBox(-5.15625f, -5.625f, 0, 2, 2, 1, 0, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 200, 283, textureX, textureY)
			.addShapeBox(-6.09375f, -4.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 193, 283, textureX, textureY)
			.addShapeBox(-6.84375f, -3.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 111, 283, textureX, textureY)
			.addShapeBox(3.15625f, -5.625f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 83, 283, textureX, textureY)
			.addShapeBox(4.09375f, -4.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 52, 283, textureX, textureY)
			.addShapeBox(4.84375f, -3.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 494, 282, textureX, textureY)
			.addShapeBox(-6.84375f, -2.375f, 0, 2, 1, 1, 0, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 487, 282, textureX, textureY)
			.addShapeBox(-6.84375f, -1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 480, 282, textureX, textureY)
			.addShapeBox(-6.96875f, -0.65625f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 473, 282, textureX, textureY)
			.addShapeBox(-6.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 374, 282, textureX, textureY)
			.addShapeBox(-6.84375f, 0.375f, 0, 2, 1, 1, 0, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 367, 282, textureX, textureY)
			.addShapeBox(4.84375f, -2.375f, 0, 2, 1, 1, 0, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 353, 282, textureX, textureY)
			.addShapeBox(4.84375f, -1.375f, 0, 2, 1, 1, 0, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 330, 282, textureX, textureY)
			.addShapeBox(4.96875f, -0.65625f, 0, 2, 1, 1, 0, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 323, 282, textureX, textureY)
			.addShapeBox(4.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 282, textureX, textureY)
			.addShapeBox(4.84375f, 0.375f, 0, 2, 1, 1, 0, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 114, 204, textureX, textureY)
			.addShapeBox(-2.28125f, 0.453125f, 0, 5, 1, 1, 0, 0, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.0625f, 0, -0.640625f, -0.0625f, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 301, 282, textureX, textureY)
			.addShapeBox(-5.15625f, 3.59375f, 0, 2, 2, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 257, 282, textureX, textureY)
			.addShapeBox(-6.09375f, 2.875f, 0, 2, 2, 1, 0, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 172, 282, textureX, textureY)
			.addShapeBox(-6.84375f, 1.875f, 0, 2, 2, 1, 0, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 165, 282, textureX, textureY)
			.addShapeBox(-6.84375f, 1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 158, 282, textureX, textureY)
			.addShapeBox(3.140625f, 3.59375f, 0, 2, 2, 1, 0, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 151, 282, textureX, textureY)
			.addShapeBox(4.078125f, 2.875f, 0, 2, 2, 1, 0, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 144, 282, textureX, textureY)
			.addShapeBox(4.828125f, 1.875f, 0, 2, 2, 1, 0, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 137, 282, textureX, textureY)
			.addShapeBox(4.84375f, 1.375f, 0, 2, 1, 1, 0, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 490, 203, textureX, textureY)
			.addShapeBox(-2.28125f, 1.296875f, 0, 5, 1, 1, 0, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f, -0.28125f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.0625f, -0.28125f, -0.4375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 461, 203, textureX, textureY)
			.addShapeBox(-2.28125f, 1.859375f, 0, 5, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.0625f, -0.3125f, -0.8125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 168, 247, textureX, textureY)
			.addShapeBox(1.65625f, 1.859375f, 0, 3, 2, 1, 0, -0.3125f, -0.046875f, -0.3125f, -0.765625f, -0.984375f, -0.3125f, -0.765625f, -0.984375f, -0.0625f, -0.3125f, -0.046875f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 365, 301, textureX, textureY)
			.addShapeBox(1.96875f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 345, 301, textureX, textureY)
			.addShapeBox(2.890625f, 3.734375f, 0, 1, 1, 1, 0, -0.453125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.453125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 327, 301, textureX, textureY)
			.addShapeBox(2.890625f, 4.234375f, 0, 1, 2, 1, 0, -0.78125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.78125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 263, 301, textureX, textureY)
			.addShapeBox(1.96875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 250, 301, textureX, textureY)
			.addShapeBox(2.671875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 76, 282, textureX, textureY)
			.addShapeBox(1.671875f, 5.3125f, 0, 2, 1, 1, 0, -0.296875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.296875f, 0, -0.0625f, -0.296875f, 0.234375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.0625f, -0.296875f, 0.203125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 122, 247, textureX, textureY)
			.addShapeBox(-4.671875f, 1.859375f, 0, 3, 2, 1, 0, -0.765625f, -0.984375f, -0.3125f, -0.296875f, -0.046875f, -0.3125f, -0.296875f, -0.046875f, -0.0625f, -0.765625f, -0.984375f, -0.0625f, -0.765625f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.0625f, -0.765625f, -0.125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 168, 301, textureX, textureY)
			.addShapeBox(-2.96875f, 3.734375f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 139, 301, textureX, textureY)
			.addShapeBox(-3.90625f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 134, 301, textureX, textureY)
			.addShapeBox(-3.90625f, 4.234375f, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.765625f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 129, 301, textureX, textureY)
			.addShapeBox(-3.671875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 61, 282, textureX, textureY)
			.addShapeBox(-3.671875f, 5.3125f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.296875f, 0, -0.3125f, -0.296875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.4375f, -0.3125f, -0.296875f, 0.234375f, -0.3125f, -0.296875f, 0.203125f, -0.0625f, 0, -0.4375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 124, 301, textureX, textureY)
			.addShapeBox(-2.96875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 88, 301, textureX, textureY)
			.addShapeBox(-0.75f, 5.046875f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 83, 301, textureX, textureY)
			.addShapeBox(-0.75f, 5.375f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 78, 301, textureX, textureY)
			.addShapeBox(-0.265625f, 5.046875f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 48, 301, textureX, textureY)
			.addShapeBox(-0.265625f, 5.375f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 7, 282, textureX, textureY)
			.addShapeBox(-0.03125f, 5.046875f, 0, 2, 1, 1, 0, -0.765625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -0.765625f, 0.75f, -0.3125f, 0, 0.515625f, -0.3125f, 0, 0.515625f, -0.0625f, -0.765625f, 0.75f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 466, 281, textureX, textureY)
			.addShapeBox(-1.96875f, 5.046875f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.78125f, 0, -0.3125f, -0.78125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.515625f, -0.3125f, -0.78125f, 0.75f, -0.3125f, -0.78125f, 0.75f, -0.0625f, 0, 0.515625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 459, 281, textureX, textureY)
			.addShapeBox(-0.75f, 6.375f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.515625f, 0, -0.3125f, -0.515625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 298, 232, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 225, 232, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 219, 232, textureX, textureY).addHollowCylinder(3.25f, 0, 0.25f, 1, 0.4296875f, 1, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 43, 301, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -62).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 38, 301, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -118).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 26, 301, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 242).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 213, 232, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 13, 301, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 298).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 207, 232, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 201, 232, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.578125f, 1, 10, 5, 0.59375f, 0.59375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -270)
		);
		Frame.add(new ModelRendererTurbo(Frame, 502, 300, textureX, textureY)
			.addShapeBox(3.25f, -0.40625f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, -90).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 497, 300, textureX, textureY)
			.addShapeBox(3.25f, -0.59375f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(27.5f, 2.5f, -5.8281f).setRotationAngle(0, 0, 270).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 70, 247, textureX, textureY)
			.addShapeBox(-2.28125f, -4.46875f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.0625f, -0.3125f, -0.5625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 26, 247, textureX, textureY)
			.addShapeBox(-0.71875f, -4.46875f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -1.1875f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.0625f, -1.1875f, -0.5625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 8, 247, textureX, textureY)
			.addShapeBox(1.21875f, -4, 0, 3, 1, 1, 0, -0.8125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.8125f, 0, -0.0625f, -1.0625f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -1.0625f, -0.75f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 496, 246, textureX, textureY)
			.addShapeBox(1.21875f, -3.75f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -1.15625f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.0625f, -1.15625f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 452, 281, textureX, textureY)
			.addShapeBox(-1.5625f, -4.03125f, 0, 2, 1, 1, 0, -0.0625f, 0, -0.3125f, -0.90625f, 0, -0.3125f, -0.90625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 445, 281, textureX, textureY)
			.addShapeBox(-0.4375f, -4.03125f, 0, 2, 1, 1, 0, -0.90625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.0625f, -0.90625f, 0, -0.0625f, -0.625f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, -0.625f, 0, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 316, 203, textureX, textureY)
			.addShapeBox(-2.28125f, -2.0625f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.0625f, -0.3125f, -0.28125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 438, 281, textureX, textureY)
			.addShapeBox(-1.28125f, -3.03125f, 0, 2, 1, 1, 0, -0.09375f, 0, -0.3125f, 0.4375f, 0, -0.3125f, 0.40625f, 0, -0.0625f, -0.09375f, 0, -0.0625f, -0.09375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.0625f, -0.09375f, -0.03125f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 492, 300, textureX, textureY)
			.addShapeBox(1.15625f, -2.4375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.625f, -0.3125f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.625f, -0.0625f, 0, -0.625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 363, 137, textureX, textureY)
			.addShapeBox(-4.65625f, -6.5f, -0.0625f, 9, 1, 1, 0, -0.125f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.625f, -0.125f, -1.25f, -0.625f, 0, 0.5f, -0.25f, 0.3125f, 0.5f, -0.25f, 0.3125f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 474, 300, textureX, textureY)
			.addShapeBox(-0.5f, -6.75f, -0.0625f, 1, 1, 1, 0, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 465, 300, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 446, 300, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 195, 232, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -81)
		);
		Frame.add(new ModelRendererTurbo(Frame, 189, 232, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -99)
		);
		Frame.add(new ModelRendererTurbo(Frame, 183, 232, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -117)
		);
		Frame.add(new ModelRendererTurbo(Frame, 177, 232, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, -63)
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 246, textureX, textureY)
			.addShapeBox(1.21875f, -3.09375f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -0.375f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.0625f, -0.375f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 303, 246, textureX, textureY)
			.addShapeBox(-4.21875f, -4, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 146, 246, textureX, textureY)
			.addShapeBox(-4.21875f, -3.75f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.0625f, -0.3125f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 441, 300, textureX, textureY)
			.addShapeBox(-2.1875f, -2.4375f, 0, 1, 1, 1, 0, 0.46875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.125f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.0625f, -0.125f, -0.625f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 113, 246, textureX, textureY)
			.addShapeBox(-4.21875f, -3.09375f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -1.625f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.0625f, -1.625f, -0.34375f, -0.0625f)
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 92, 232, textureX, textureY).addHollowCylinder(-5.25f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 489, 231, textureX, textureY).addHollowCylinder(-5.25f, 1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 483, 231, textureX, textureY).addHollowCylinder(-5.25f, -1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(27.5f, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 448, 122, textureX, textureY).addHollowCylinder(0, 0, 0, 7.5f, 7, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(12, 2.5f, -5).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 502, 30, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 357, 231, textureX, textureY).addHollowCylinder(-3.5f, 0, 0, 1.125f, 1.0E-15f, 1, 16, 8, 1, 1, 0, null)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 431, 281, textureX, textureY)
			.addShapeBox(-1.125f, 2, 0, 2, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 436, 300, textureX, textureY)
			.addShapeBox(-1.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 431, 300, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 419, 300, textureX, textureY)
			.addShapeBox(-1.25f, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, 0, 0)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 414, 300, textureX, textureY)
			.addShapeBox(0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 425, 99, textureX, textureY).addHollowCylinder(0, 5.71875f, 0.25f, 1, 0.75f, 1, 10, 0, 0.875f, 0.875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 467, 140, textureX, textureY).addHollowCylinder(0, 0, 0, 7, 6.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(12, 2.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 425, 94, textureX, textureY).addHollowCylinder(2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 238, 84, textureX, textureY).addHollowCylinder(-2.75f, 4.5f, 0.25f, 1, 0.75f, 1, 10, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 351, 231, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 424, 281, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 417, 281, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 345, 231, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 339, 231, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -20)
		);
		this.groups.add(Frame);
	}

	private final void initGroup_Frame3(){
		TurboList Frame = new TurboList("Frame");
		Frame.add(new ModelRendererTurbo(Frame, 410, 281, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 403, 281, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 160).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 333, 231, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 160)
		);
		Frame.add(new ModelRendererTurbo(Frame, 171, 231, textureX, textureY).addHollowCylinder(-5.125f, 0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 396, 281, textureX, textureY)
			.addShapeBox(2.875f, -1.625f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 360, 281, textureX, textureY)
			.addShapeBox(2.875f, 0.125f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -20).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 30, 231, textureX, textureY).addHollowCylinder(2.875f, -0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 24, 231, textureX, textureY).addHollowCylinder(-5.125f, -0.625f, 0.25f, 1, 0.75f, 1, 10, 5, 1, 1, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 20)
		);
		Frame.add(new ModelRendererTurbo(Frame, 337, 281, textureX, textureY)
			.addShapeBox(2.875f, -0.375f, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, -0.25f, -0.09375f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -0.5f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 287, 281, textureX, textureY)
			.addShapeBox(2.875f, 1.375f, 0, 2, 1, 1, 0, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.09375f, 0, 0.25f, -0.09375f, 0, -1, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.09375f, 0, -1, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 200).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 18, 231, textureX, textureY).addHollowCylinder(2.875f, 0.625f, 0.25f, 1, 0.66f, 1, 10, 5, 0.75f, 0.75f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 200)
		);
		Frame.add(new ModelRendererTurbo(Frame, 12, 231, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 280, 281, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 273, 281, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 6, 231, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 231, textureX, textureY).addHollowCylinder(-4.5f, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 0)
		);
		Frame.add(new ModelRendererTurbo(Frame, 250, 281, textureX, textureY)
			.addShapeBox(2.75f, -0.6875f, 0, 2, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 243, 281, textureX, textureY)
			.addShapeBox(2.75f, -0.3125f, 0, 2, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 180).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 134, 230, textureX, textureY).addHollowCylinder(2.75f, 0, 0.25f, 1, 0.515625f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 180)
		);
		Frame.add(new ModelRendererTurbo(Frame, 236, 281, textureX, textureY)
			.addShapeBox(2.75f, -0.875f, 0, 2, 1, 1, 0, 0, -0.005f, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, -0.005f, -0.0625f, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 119, 281, textureX, textureY)
			.addShapeBox(2.75f, -0.125f, 0, 2, 1, 1, 0, 0, -0.65625f, -0.3125f, -0.25f, -0.8125f, -0.3125f, -0.25f, -0.8125f, -0.0625f, 0, -0.65625f, -0.0625f, 0, 0, -0.3125f, -0.25f, 0.4175f, -0.3125f, -0.25f, 0.4175f, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 409, 300, textureX, textureY)
			.addShapeBox(2.25f, -0.875f, 0, 1, 1, 1, 0, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 404, 300, textureX, textureY)
			.addShapeBox(2.25f, -0.125f, 0, 1, 1, 1, 0, -0.03125f, -0.296875f, -0.3125f, -0.5f, -0.65625f, -0.3125f, -0.5f, -0.65625f, -0.0625f, -0.03125f, -0.296875f, -0.0625f, -0.03125f, -0.025f, -0.3125f, -0.5f, -0.005f, -0.3125f, -0.5f, -0.005f, -0.0625f, -0.03125f, -0.025f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 69, 281, textureX, textureY)
			.addShapeBox(-4.75f, -0.875f, 0, 2, 1, 1, 0, -0.25f, 0.4175f, -0.3125f, 0, -0.005f, -0.3125f, 0, -0.005f, -0.0625f, -0.25f, 0.4175f, -0.0625f, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 46, 281, textureX, textureY)
			.addShapeBox(-4.75f, -0.125f, 0, 2, 1, 1, 0, -0.25f, -0.8125f, -0.3125f, 0, -0.65625f, -0.3125f, 0, -0.65625f, -0.0625f, -0.25f, -0.8125f, -0.0625f, -0.25f, 0.4175f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.25f, 0.4175f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 189, 203, textureX, textureY)
			.addShapeBox(-2.28125f, -0.84375f, 0, 5, 2, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.3125f, -0.4375f, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 399, 300, textureX, textureY)
			.addShapeBox(-3.25f, -0.875f, 0, 1, 1, 1, 0, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 394, 300, textureX, textureY)
			.addShapeBox(-3.25f, -0.125f, 0, 1, 1, 1, 0, -0.5f, -0.65625f, -0.3125f, -0.03125f, -0.296875f, -0.3125f, -0.03125f, -0.296875f, -0.0625f, -0.5f, -0.65625f, -0.0625f, -0.5f, -0.005f, -0.3125f, -0.03125f, -0.025f, -0.3125f, -0.03125f, -0.025f, -0.0625f, -0.5f, -0.005f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 371, 202, textureX, textureY)
			.addShapeBox(-2.28125f, -1.34375f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.3125f, -0.4375f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 160, 203, textureX, textureY)
			.addShapeBox(-2.28125f, -6.5f, 0, 5, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.3125f, -0.75f, 0.03125f, -0.0625f, -0.3125f, 0.03125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 104, 246, textureX, textureY)
			.addShapeBox(-2.28125f, -6.8125f, 0, 3, 1, 1, 0, -0.3125f, -0.1875f, -0.3125f, -0.71875f, 0, -0.3125f, -0.71875f, 0, -0.0625f, -0.3125f, -0.1875f, -0.0625f, -0.3125f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.3125f, -0.71875f, -0.6875f, -0.0625f, -0.3125f, -0.6875f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 95, 246, textureX, textureY)
			.addShapeBox(-0.71875f, -6.8125f, 0, 3, 1, 1, 0, -0.71875f, 0, -0.3125f, -0.3125f, -0.1875f, -0.3125f, -0.3125f, -0.1875f, -0.0625f, -0.71875f, 0, -0.0625f, -0.71875f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.3125f, -0.3125f, -0.6875f, -0.0625f, -0.71875f, -0.6875f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 35, 246, textureX, textureY)
			.addShapeBox(-4.21875f, -5.625f, 0, 3, 2, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.3125f, -0.375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 405, 245, textureX, textureY)
			.addShapeBox(-4.21875f, -6.5f, 0, 3, 1, 1, 0, -1.4375f, -0.25f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -1.4375f, -0.25f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.3125f, -0.75f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 377, 245, textureX, textureY)
			.addShapeBox(1.21875f, -5.625f, 0, 3, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.3125f, -0.3125f, -0.375f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 368, 245, textureX, textureY)
			.addShapeBox(1.21875f, -6.5f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -1.4375f, -0.25f, -0.3125f, -1.4375f, -0.25f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.3125f, -0.3125f, -0.125f, -0.0625f, -0.75f, -0.125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 39, 281, textureX, textureY)
			.addShapeBox(-5.15625f, -5.625f, 0, 2, 2, 1, 0, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 32, 281, textureX, textureY)
			.addShapeBox(-6.09375f, -4.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 20, 281, textureX, textureY)
			.addShapeBox(-6.84375f, -3.875f, 0, 2, 2, 1, 0, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 0, 281, textureX, textureY)
			.addShapeBox(3.15625f, -5.625f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 505, 280, textureX, textureY)
			.addShapeBox(4.09375f, -4.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 389, 280, textureX, textureY)
			.addShapeBox(4.84375f, -3.875f, 0, 2, 2, 1, 0, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 382, 280, textureX, textureY)
			.addShapeBox(-6.84375f, -2.375f, 0, 2, 1, 1, 0, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 310, 280, textureX, textureY)
			.addShapeBox(-6.84375f, -1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 295, 280, textureX, textureY)
			.addShapeBox(-6.96875f, -0.65625f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 266, 280, textureX, textureY)
			.addShapeBox(-6.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 229, 280, textureX, textureY)
			.addShapeBox(-6.84375f, 0.375f, 0, 2, 1, 1, 0, 0, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.3125f, 0.34375f, -0.28125f, -0.0625f, 0, -0.28125f, -0.0625f, -0.1875f, 0, -0.3125f, 0.34375f, 0, -0.3125f, 0.34375f, 0, -0.0625f, -0.1875f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 222, 280, textureX, textureY)
			.addShapeBox(4.84375f, -2.375f, 0, 2, 1, 1, 0, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 215, 280, textureX, textureY)
			.addShapeBox(4.84375f, -1.375f, 0, 2, 1, 1, 0, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 208, 280, textureX, textureY)
			.addShapeBox(4.96875f, -0.65625f, 0, 2, 1, 1, 0, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 201, 280, textureX, textureY)
			.addShapeBox(4.96875f, -0.34375f, 0, 2, 1, 1, 0, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.3125f, -0.1875f, -0.34375f, -0.0625f, -0.1875f, -0.34375f, -0.0625f, 0.46875f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.46875f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 194, 280, textureX, textureY)
			.addShapeBox(4.84375f, 0.375f, 0, 2, 1, 1, 0, 0.34375f, -0.28125f, -0.3125f, 0, -0.28125f, -0.3125f, 0, -0.28125f, -0.0625f, 0.34375f, -0.28125f, -0.0625f, 0.34375f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.34375f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 383, 200, textureX, textureY)
			.addShapeBox(-2.28125f, 0.453125f, 0, 5, 1, 1, 0, 0, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.3125f, -0.4375f, -0.640625f, -0.0625f, 0, -0.640625f, -0.0625f, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 187, 280, textureX, textureY)
			.addShapeBox(-5.15625f, 3.59375f, 0, 2, 2, 1, 0, -0.3125f, 0.375f, -0.3125f, -0.75f, 0.5625f, -0.3125f, -0.75f, 0.5625f, -0.0625f, -0.3125f, 0.375f, -0.0625f, -0.3125f, -0.75f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 180, 280, textureX, textureY)
			.addShapeBox(-6.09375f, 2.875f, 0, 2, 2, 1, 0, -0.5f, 0.5f, -0.3125f, -0.75f, -0.375f, -0.3125f, -0.75f, -0.375f, -0.0625f, -0.5f, 0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 130, 280, textureX, textureY)
			.addShapeBox(-6.84375f, 1.875f, 0, 2, 2, 1, 0, -0.46875f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.3125f, -0.75f, -0.5f, -0.0625f, -0.46875f, -0.5f, -0.0625f, -0.5f, -1.03125f, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.5f, -1.03125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 112, 280, textureX, textureY)
			.addShapeBox(-6.84375f, 1.375f, 0, 2, 1, 1, 0, -0.1875f, 0, -0.3125f, 0.03125f, 0, -0.3125f, 0.03125f, 0, -0.0625f, -0.1875f, 0, -0.0625f, -0.40625f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.40625f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 105, 280, textureX, textureY)
			.addShapeBox(3.140625f, 3.59375f, 0, 2, 2, 1, 0, -0.75f, 0.5625f, -0.3125f, -0.3125f, 0.375f, -0.3125f, -0.3125f, 0.375f, -0.0625f, -0.75f, 0.5625f, -0.0625f, -0.75f, 0, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 98, 280, textureX, textureY)
			.addShapeBox(4.078125f, 2.875f, 0, 2, 2, 1, 0, -0.75f, -0.375f, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.0625f, -0.75f, -0.375f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 91, 280, textureX, textureY)
			.addShapeBox(4.828125f, 1.875f, 0, 2, 2, 1, 0, -0.75f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.3125f, -0.46875f, -0.5f, -0.0625f, -0.75f, -0.5f, -0.0625f, -0.75f, 0, -0.3125f, -0.5f, -1.03125f, -0.3125f, -0.5f, -1.03125f, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 84, 280, textureX, textureY)
			.addShapeBox(4.84375f, 1.375f, 0, 2, 1, 1, 0, 0.03125f, 0, -0.3125f, -0.1875f, 0, -0.3125f, -0.1875f, 0, -0.0625f, 0.03125f, 0, -0.0625f, -0.75f, 0, -0.3125f, -0.40625f, 0, -0.3125f, -0.40625f, 0, -0.0625f, -0.75f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 269, 199, textureX, textureY)
			.addShapeBox(-2.28125f, 1.296875f, 0, 5, 1, 1, 0, -0.3125f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.3125f, -0.75f, -0.078125f, -0.0625f, -0.3125f, -0.078125f, -0.0625f, -0.28125f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.3125f, -0.71875f, -0.4375f, -0.0625f, -0.28125f, -0.4375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 79, 198, textureX, textureY)
			.addShapeBox(-2.28125f, 1.859375f, 0, 5, 4, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.3125f, -0.75f, -0.8125f, -0.0625f, -0.3125f, -0.8125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 350, 245, textureX, textureY)
			.addShapeBox(1.65625f, 1.859375f, 0, 3, 2, 1, 0, -0.3125f, -0.046875f, -0.3125f, -0.765625f, -0.984375f, -0.3125f, -0.765625f, -0.984375f, -0.0625f, -0.3125f, -0.046875f, -0.0625f, -0.3125f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.3125f, -0.765625f, -0.125f, -0.0625f, -0.3125f, -0.125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 382, 300, textureX, textureY)
			.addShapeBox(1.96875f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 372, 300, textureX, textureY)
			.addShapeBox(2.890625f, 3.734375f, 0, 1, 1, 1, 0, -0.453125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.453125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 360, 300, textureX, textureY)
			.addShapeBox(2.890625f, 4.234375f, 0, 1, 2, 1, 0, -0.78125f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.78125f, 0, -0.0625f, -0.78125f, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -0.78125f, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 355, 300, textureX, textureY)
			.addShapeBox(1.96875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 350, 300, textureX, textureY)
			.addShapeBox(2.671875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 55, 280, textureX, textureY)
			.addShapeBox(1.671875f, 5.3125f, 0, 2, 1, 1, 0, -0.296875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.296875f, 0, -0.0625f, -0.296875f, 0.234375f, -0.3125f, 0, -0.4375f, -0.3125f, 0, -0.4375f, -0.0625f, -0.296875f, 0.203125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 341, 245, textureX, textureY)
			.addShapeBox(-4.671875f, 1.859375f, 0, 3, 2, 1, 0, -0.765625f, -0.984375f, -0.3125f, -0.296875f, -0.046875f, -0.3125f, -0.296875f, -0.046875f, -0.0625f, -0.765625f, -0.984375f, -0.0625f, -0.765625f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.3125f, -0.296875f, -0.125f, -0.0625f, -0.765625f, -0.125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 340, 300, textureX, textureY)
			.addShapeBox(-2.96875f, 3.734375f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 335, 300, textureX, textureY)
			.addShapeBox(-3.90625f, 3.734375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.4375f, 0, -0.3125f, -0.4375f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 322, 300, textureX, textureY)
			.addShapeBox(-3.90625f, 4.234375f, 0, 1, 2, 1, 0, 0, 0, -0.3125f, -0.765625f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.3125f, -0.765625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 317, 300, textureX, textureY)
			.addShapeBox(-3.671875f, 4.3125f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 498, 279, textureX, textureY)
			.addShapeBox(-3.671875f, 5.3125f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.296875f, 0, -0.3125f, -0.296875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.4375f, -0.3125f, -0.296875f, 0.234375f, -0.3125f, -0.296875f, 0.203125f, -0.0625f, 0, -0.4375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 312, 300, textureX, textureY)
			.addShapeBox(-2.96875f, 4.3125f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 307, 300, textureX, textureY)
			.addShapeBox(-0.75f, 5.046875f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 302, 300, textureX, textureY)
			.addShapeBox(-0.75f, 5.375f, 0, 1, 1, 1, 0, 0, -0.5f, -0.3125f, -1, -0.5f, -0.3125f, -1, -0.5f, -0.0625f, 0, -0.5f, -0.0625f, 0, 0, -0.3125f, -0.796875f, 0, -0.3125f, -0.765625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 297, 300, textureX, textureY)
			.addShapeBox(-0.265625f, 5.046875f, 0, 1, 1, 1, 0, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 292, 300, textureX, textureY)
			.addShapeBox(-0.265625f, 5.375f, 0, 1, 1, 1, 0, -1, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.0625f, -1, -0.5f, -0.0625f, -0.796875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 491, 279, textureX, textureY)
			.addShapeBox(-0.03125f, 5.046875f, 0, 2, 1, 1, 0, -0.765625f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, -0.765625f, 0, -0.0625f, -0.765625f, 0.75f, -0.3125f, 0, 0.515625f, -0.3125f, 0, 0.515625f, -0.0625f, -0.765625f, 0.75f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 484, 279, textureX, textureY)
			.addShapeBox(-1.96875f, 5.046875f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.78125f, 0, -0.3125f, -0.78125f, 0, -0.0625f, 0, 0, -0.0625f, 0, 0.515625f, -0.3125f, -0.78125f, 0.75f, -0.3125f, -0.78125f, 0.75f, -0.0625f, 0, 0.515625f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 477, 279, textureX, textureY)
			.addShapeBox(-0.75f, 6.375f, 0, 2, 1, 1, 0, 0, 0, -0.3125f, -0.515625f, 0, -0.3125f, -0.515625f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.3125f, -0.515625f, -0.5f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 128, 230, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 122, 230, textureX, textureY).addHollowCylinder(3.125f, 0, 0.25f, 1, 0.53125f, 1, 10, 5, 0.53125f, 0.53125f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 116, 230, textureX, textureY).addHollowCylinder(3.25f, 0, 0.25f, 1, 0.4296875f, 1, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 287, 300, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -62).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 282, 300, textureX, textureY)
			.addShapeBox(3.125f, -0.3125f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -118).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 277, 300, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 242).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 110, 230, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 62)
		);
		Frame.add(new ModelRendererTurbo(Frame, 272, 300, textureX, textureY)
			.addShapeBox(3.125f, -0.6875f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.125f, -0.75f, -0.25f, -0.125f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 298).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 104, 230, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.625f, 1, 10, 5, 0.6875f, 0.6875f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -242)
		);
		Frame.add(new ModelRendererTurbo(Frame, 98, 230, textureX, textureY).addHollowCylinder(-4, 0, 0.25f, 1, 0.578125f, 1, 10, 5, 0.59375f, 0.59375f, 0, new Vec3f(0.0, 0.0, -0.34375))
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -270)
		);
		Frame.add(new ModelRendererTurbo(Frame, 258, 300, textureX, textureY)
			.addShapeBox(3.25f, -0.40625f, 0, 1, 1, 1, 0, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, -90).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 245, 300, textureX, textureY)
			.addShapeBox(3.25f, -0.59375f, 0, 1, 1, 1, 0, 0, -0.15625f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.09375f, 0, -0.15625f, -0.09375f, 0, -0.59375f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.09375f, 0, -0.59375f, -0.09375f)
			.setRotationPoint(12, 2.5f, -5.8281f).setRotationAngle(0, 0, 270).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 320, 245, textureX, textureY)
			.addShapeBox(-2.28125f, -4.46875f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.3125f, -1.1875f, -0.5625f, -0.0625f, -0.3125f, -0.5625f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 257, 245, textureX, textureY)
			.addShapeBox(-0.71875f, -4.46875f, 0, 3, 1, 1, 0, -0.75f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.75f, 0, -0.0625f, -1.1875f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.3125f, -0.3125f, -0.5625f, -0.0625f, -1.1875f, -0.5625f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 248, 245, textureX, textureY)
			.addShapeBox(1.21875f, -4, 0, 3, 1, 1, 0, -0.8125f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.8125f, 0, -0.0625f, -1.0625f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.3125f, -0.3125f, -0.75f, -0.0625f, -1.0625f, -0.75f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 239, 245, textureX, textureY)
			.addShapeBox(1.21875f, -3.75f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -1.15625f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.3125f, -0.3125f, -0.34375f, -0.0625f, -1.15625f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 375, 279, textureX, textureY)
			.addShapeBox(-1.5625f, -4.03125f, 0, 2, 1, 1, 0, -0.0625f, 0, -0.3125f, -0.90625f, 0, -0.3125f, -0.90625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.5f, 0, -0.3125f, -0.625f, 0, -0.3125f, -0.625f, 0, -0.0625f, -0.5f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 368, 279, textureX, textureY)
			.addShapeBox(-0.4375f, -4.03125f, 0, 2, 1, 1, 0, -0.90625f, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, -0.0625f, -0.90625f, 0, -0.0625f, -0.625f, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, -0.625f, 0, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 384, 197, textureX, textureY)
			.addShapeBox(-2.28125f, -2.0625f, 0, 5, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.75f, 0, -0.3125f, -0.75f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.3125f, -0.75f, -0.28125f, -0.0625f, -0.3125f, -0.28125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 354, 279, textureX, textureY)
			.addShapeBox(-1.28125f, -3.03125f, 0, 2, 1, 1, 0, -0.09375f, 0, -0.3125f, 0.4375f, 0, -0.3125f, 0.40625f, 0, -0.0625f, -0.09375f, 0, -0.0625f, -0.09375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.3125f, 0.4375f, -0.03125f, -0.0625f, -0.09375f, -0.03125f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 240, 300, textureX, textureY)
			.addShapeBox(1.15625f, -2.4375f, 0, 1, 1, 1, 0, 0, 0, -0.3125f, 0.46875f, 0, -0.3125f, 0.46875f, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.625f, -0.3125f, -0.125f, -0.625f, -0.3125f, -0.125f, -0.625f, -0.0625f, 0, -0.625f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 363, 134, textureX, textureY)
			.addShapeBox(-4.65625f, -6.5f, -0.0625f, 9, 1, 1, 0, -0.125f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.25f, 0.1875f, -1.25f, -0.625f, -0.125f, -1.25f, -0.625f, 0, 0.5f, -0.25f, 0.3125f, 0.5f, -0.25f, 0.3125f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 235, 300, textureX, textureY)
			.addShapeBox(-0.5f, -6.75f, -0.0625f, 1, 1, 1, 0, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.3125f, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 230, 300, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 225, 300, textureX, textureY)
			.addShapeBox(-0.5f, -6.96875f, -0.0625f, 1, 1, 1, 0, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.3125f, -0.375f, -0.1875f, -0.625f, -0.375f, -0.1875f, -0.625f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.3125f, -0.375f, 0.5f, -0.625f, -0.375f, 0.5f, -0.625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, -18).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 504, 228, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, -81)
		);
		Frame.add(new ModelRendererTurbo(Frame, 498, 228, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, -99)
		);
		Frame.add(new ModelRendererTurbo(Frame, 439, 228, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, -117)
		);
		Frame.add(new ModelRendererTurbo(Frame, 433, 228, textureX, textureY).addHollowCylinder(6.8125f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.4375f, 0.4375f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, -63)
		);
		Frame.add(new ModelRendererTurbo(Frame, 230, 245, textureX, textureY)
			.addShapeBox(1.21875f, -3.09375f, 0, 3, 1, 1, 0, -1.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -1.0625f, 0, -0.0625f, -0.375f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.3125f, -1.625f, -0.34375f, -0.0625f, -0.375f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 137, 245, textureX, textureY)
			.addShapeBox(-4.21875f, -4, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -0.8125f, 0, -0.3125f, -0.8125f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.3125f, -1.0625f, -0.75f, -0.0625f, -0.3125f, -0.75f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 62, 245, textureX, textureY)
			.addShapeBox(-4.21875f, -3.75f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.3125f, -1.15625f, -0.34375f, -0.0625f, -0.3125f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 220, 300, textureX, textureY)
			.addShapeBox(-2.1875f, -2.4375f, 0, 1, 1, 1, 0, 0.46875f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.0625f, 0.46875f, 0, -0.0625f, -0.125f, -0.625f, -0.3125f, 0, -0.625f, -0.3125f, 0, -0.625f, -0.0625f, -0.125f, -0.625f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 53, 245, textureX, textureY)
			.addShapeBox(-4.21875f, -3.09375f, 0, 3, 1, 1, 0, -0.3125f, 0, -0.3125f, -1.0625f, 0, -0.3125f, -1.0625f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -1.625f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.3125f, -0.375f, -0.34375f, -0.0625f, -1.625f, -0.34375f, -0.0625f)
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		Frame.add(new ModelRendererTurbo(Frame, 427, 228, textureX, textureY).addHollowCylinder(-5.25f, 0, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		Frame.add(new ModelRendererTurbo(Frame, 421, 228, textureX, textureY).addHollowCylinder(-5.25f, 1.78125f, 0.1875f, 1, 1.0E-15f, 0.75f, 10, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.625))
			.setRotationPoint(12, 2.5f, -5.875f).setRotationAngle(0, 0, 90)
		);
		this.groups.add(Frame);
	}

	private final void initGroup_Rest_of_locomotive(){
		TurboList Rest_of_locomotive = new TurboList("Rest_of_locomotive");
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 225, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-37.5f, -16, -9).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 3, 18, 0, 9, 0, -1, 0, 0, -1, 0, 0, -1, 9, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.5f, -19, -9).setRotationAngle(0, 0, 0).setName("Box 18")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 195, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 1, 18, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.5f, -14, -9).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 207, 94, textureX, textureY).addBox(0, 0, 0, 93, 1, 18)
			.setRotationPoint(-36.5f, -15, -9).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 223, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 103, 2, 16, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46.5f, -21, -8).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 330, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 16, 0, 0, 0, -3, -4, 0, -1.2f, -4, 0, -1.2f, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-58.5f, -20, -8).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 389, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 3, 16, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3)
			.setRotationPoint(-58.5f, -19, -8).setRotationAngle(0, 0, 0).setName("Box 24")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 202, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, -1, 0, 0, -1, 0, 0, -1, 9, 0, -1)
			.setRotationPoint(-37.5f, -13, 6).setRotationAngle(0, 0, 0).setName("Box 25")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 289, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 3, 16, 0, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-58.5f, -13, -8).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 61, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 16, 0, 0, 0, -3, 8, 0, 1, 8, 0, 1, 0, 0, -3, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3)
			.setRotationPoint(-58.5f, -16, -8).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 118, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 16, 0, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3, 0, 0, -3, 8, 0, 1, 8, 0, 1, 0, 0, -3)
			.setRotationPoint(-58.5f, -14, -8).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 205, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 16, 0, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3, 0, 0, -3, 9, 0, 1, 9, 0, 1, 0, 0, -3)
			.setRotationPoint(-58.5f, -15, -8).setRotationAngle(0, 0, 0).setName("Box 31")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 173, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 16, 0, 0, 0, -1.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1.2f, 0, -1, -1.2f, 0, 0, 0, 0, 0, 0, 0, -1, -1.2f)
			.setRotationPoint(-50.5f, -20, -8).setRotationAngle(0, 0, 0).setName("Box 32")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 107, 2, 12, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.5f, -23, -6).setRotationAngle(0, 0, 0).setName("Box 35")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 72, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 14, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f)
			.setRotationPoint(-50.5f, -21, -7).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 242, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 10, 0, 0, 0, -1, -8, 0, -1, -8, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 1.8f, 0, 0, 1.8f, 0, 0, 0)
			.setRotationPoint(-58.5f, -21, -5).setRotationAngle(0, 0, 0).setName("Box 45")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 87, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 10, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, -1, -1, 0, 0, 1.8f, 0, 0, 1.8f, 0, -1, -1)
			.setRotationPoint(-58.5f, -21, -5).setRotationAngle(0, 0, 0).setName("Box 47")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 54, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 8, 0, 0, -0.5f, -2.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -2.5f, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0)
			.setRotationPoint(-58.5f, -23, -4).setRotationAngle(0, 0, 0).setName("Box 48")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 227, 6, textureX, textureY).addBox(0, 0, 0, 108, 4, 5)
			.setRotationPoint(-52.5f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 245, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 121, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-52.5f, -6.5f, -11).setRotationAngle(0, 0, 0).setName("Box 56")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 217, 329, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 22, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.5f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 57")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 426, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 7, 22, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.5f, -9.5f, -11).setRotationAngle(0, 0, 0).setName("Box 59")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 248, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 16, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-58.5f, -10, -8).setRotationAngle(0, 0, 0).setName("Box 60")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 333, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 10, 0, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f)
			.setRotationPoint(-64.5f, -20, -5).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 171, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-65.5f, -20, -1.5f).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 450, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, 1, 0, 0, 1, 0, 0, -1, 0, -1)
			.setRotationPoint(-65.5f, -16, -1.5f).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 300, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 10, 0, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f, -1, 0, -3.5f, 0, 0, 0, 0, 0, 0, -1, 0, -3.5f)
			.setRotationPoint(-64.5f, -16, -5).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 324, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, 1, 0, 0.25f, 1, 0, 0.25f, -0.5f, 0, -1)
			.setRotationPoint(-64.5f, -11, -1.5f).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 373, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0.5f, 0, -1, -1, 0, 0.25f, -1, 0, 0.25f, 0.5f, 0, -1, -2, 0, -1, 1, 0, 1.5f, 1, 0, 1.5f, -2, 0, -1)
			.setRotationPoint(-63.5f, -10, -1.5f).setRotationAngle(0, 0, 0).setName("Box 72")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 339, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -1, 0, 0.25f, 3, 0, 3.5f, 3, 0, 3.5f, -1, 0, 0.25f, -3, 0, 1.5f, 1, 0, 1.5f, 1, 0, 1.5f, -3, 0, 1.5f)
			.setRotationPoint(-63.5f, -10, -1.5f).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 140, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 10, 0, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f, -1, 0, -3.25f, 0, 0, 0, 0, 0, 0, -1, 0, -3.25f)
			.setRotationPoint(-63.5f, -11, -5).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 319, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -1, 1.5f, 0, 0, 3.5f, 0, 0, 3.5f, 0, -1, 1.5f, 0, 0, 1.5f, 0, 0, 3.5f, 0, 0, 3.5f, 0, 0, 1.5f)
			.setRotationPoint(-60.5f, -10, -1.5f).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 25, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 10, 0, -1, 0, -3.5f, 0, 0, -1, 0, 0, -1, -1, 0, -3.5f, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f)
			.setRotationPoint(-64.5f, -21, -5).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 101, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.375f, -0.25f, -1, 1, 0, 0, 1, 0, 0, -0.375f, -0.25f, -1, -0.375f, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.75f)
			.setRotationPoint(-65.5f, -21, -1.5f).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 229, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 4, 0, 0, -1.25f, -1.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1.25f, -1.25f, 0, 0, -0.5f, 0, 0, 2, 0, 0, 2, 0, 0, -0.5f)
			.setRotationPoint(-63.5f, -23, -2).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 308, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.375f, -1.125f, -1, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.375f, -1.125f, -1, -0.375f, 0.25f, -1, 0, 0, 0, 0, 0, 0, -0.375f, 0.25f, -1)
			.setRotationPoint(-65.5f, -22, -1.5f).setRotationAngle(0, 0, 0).setName("Box 80")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 371, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 4, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f)
			.setRotationPoint(-63.5f, -9.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 378, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, -0.25f, -1.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -1.1f, 0, 0, -1.1f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.1f)
			.setRotationPoint(-64.5f, -9.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 430, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 3, 4, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f)
			.setRotationPoint(-63.5f, -9.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 360, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, -0.25f, -1.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -1.1f, 0, 0, -1.1f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.1f)
			.setRotationPoint(-64.5f, -9.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 84")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 121, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.5f, -6.5f, 10).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 492, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-60.5f, -8.5f, -3).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 12, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-59.5f, -8.5f, -6).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 4, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, -1, -1, 0, 1.5f, -1, 0, 1.5f, 0, 0, -1, -1, -0.5f, -0.5f, 0, -0.5f, 1.5f, 0, -0.5f, 1.5f, -1, -0.5f, -0.5f)
			.setRotationPoint(-61.5f, -9, -1.5f).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 462, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 12, 0, 1, -0.5f, -3, -5, -0.5f, -1, -5, -0.5f, -1, 1, -0.5f, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3)
			.setRotationPoint(-59.5f, -9.5f, -6).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 380, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 12, 0, 0, 0, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -1, -5, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -5, -0.5f, 0)
			.setRotationPoint(-58.5f, -9, -6).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 156, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 4, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.5f, -2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 92")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 193, 151, textureX, textureY).addBox(0, 0, 0, 24, 2, 22)
			.setRotationPoint(-69.5f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 440, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 5, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.5f, -3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 22, 0, 0, 0, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, -3, -1.25f, 0, -3, -1.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-69.5f, -5.25f, -11).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 330, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 21, 0, 0, 0, -1, 0, 1.5f, -1, 0, 1.5f, -1, 0, 0, -1, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(-69.5f, -6.25f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 280, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 19, 0, -0.5f, 0, -7.5f, 0, 1.5f, -5.5f, 0, 1.5f, -5.5f, -0.5f, 0, -7.5f, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0)
			.setRotationPoint(-69.5f, -7.25f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 98")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 72, 328, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 22, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-70.5f, -3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 270, 327, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 20, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -0.25f, -2, 0, 0, 0, 0, 0, 0, 0, -0.25f, -2)
			.setRotationPoint(-71.5f, -0.5f, -10).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 426, 324, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 16, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, -0.25f, -6, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -6)
			.setRotationPoint(-72.5f, -0.5f, -8).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 177, 317, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, -0.5f, 0, -6, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6)
			.setRotationPoint(-72, -5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 59, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, -2.5f, 0.75f, -6, 1, -0.25f, 1.5f, 1, -0.25f, 1.5f, -2.5f, 0.75f, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6)
			.setRotationPoint(-71.5f, -6.5f, -8).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 18, 315, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 22, 0, 0, -1, -1.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -1.5f, 0, -0.25f, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1)
			.setRotationPoint(-70.5f, -5.25f, -11).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 99, 313, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 20, 0, -0.5f, 0, -2, 0, -1, 0, 0, -1, 0, -0.5f, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-71.5f, -4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 321, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 21, 0, 0, -0.5f, -2.5f, 0, 0.25f, -1, 0, 0.25f, -1, 0, -0.5f, -2.5f, 0, 0.75f, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.75f, -1)
			.setRotationPoint(-70.5f, -6, -10.5f).setRotationAngle(0, 0, 0).setName("Box 108")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 369, 310, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 20, 0, -1, 0, -2, 0, -1.25f, -2, 0, -1.25f, -0.5f, -1, 0, -2, -0.5f, -1, -2, 0, 0, -2, 0, 0, 0, -0.5f, -1, -2)
			.setRotationPoint(-71.5f, -5.5f, -10).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 138, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -1, -1.25f, -0.5f, 0, -1.25f, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, -1, 0)
			.setRotationPoint(-71.5f, -5.5f, -10).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 268, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, -0.5f, -0.25f, -6, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -6)
			.setRotationPoint(-72.5f, 4.25f, -8).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 183, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 22, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-69.5f, 3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 243, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.25f, -0.25f, -0.5f, -1.5f, 0, -0.5f, -1, 0, -0.5f, -1, -0.25f, -0.5f, -1.5f)
			.setRotationPoint(-70.5f, 4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 196, 309, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0.25f, -2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, -2, -0.5f, -0.5f, -2.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.5f, -0.5f, -0.5f, -2.5f)
			.setRotationPoint(-71.5f, 4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 428, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 21, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-69.5f, 4.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 146, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.25f)
			.setRotationPoint(-70.5f, 3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 459, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0.25f, -2, 0, 0, 0, 0, 0, 0, 0, 0.25f, -2, 0, -0.25f, -2, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -2)
			.setRotationPoint(-71.5f, 3.5f, -10).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 231, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-69.5f, 5, -9).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 303, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 18, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, -2, -1, 0, -0.75f, -1, 0, -0.75f, 1, 0, -2)
			.setRotationPoint(-70.5f, 5, -9).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 230, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 16, 0, 0.5f, 0, -8, 0, 0, 0, 0, 0, 0, 0.5f, 0, -8, 2, 0, -8, -1, 0, -1, -1, 0, -1, 2, 0, -8)
			.setRotationPoint(-71.5f, 5, -8).setRotationAngle(0, 0, 0).setName("Box 120")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 403, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 18, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -0.75f, 1, 0, 0, 1, 0, 0, 0, 0, -0.75f)
			.setRotationPoint(-70.5f, 5, -9).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 104, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57.5f, -12.5f, 10).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(57.5f, -18.5f, -11).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 92, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(57.5f, -17, -11).setRotationAngle(0, 0, 0).setName("Box 125")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 79, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(67.5f, -17, -11).setRotationAngle(0, 0, 0).setName("Box 126")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 304, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(58.5f, -17, -11).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 297, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1.5f, -1, 0, -1.5f, -1, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58.5f, -16.5f, -11).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 290, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58.5f, -13.5f, -11).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 261, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.5f, -1, 0, -1.5f, -1, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58.5f, -14, -11).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 74, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(62.75f, -17, -11).setRotationAngle(0, 0, 0).setName("Box 132")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 69, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(57.5f, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 305, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(57.5f, -18.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 134")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 64, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(67.5f, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 59, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(62.75f, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 136")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 226, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58.5f, -13.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 219, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(58.5f, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 138")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 212, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1.5f, -1, 0, -1.5f, -1, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58.5f, -16.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 170, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1.5f, -1, 0, -1.5f, -1, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(58.5f, -14, 10.75f).setRotationAngle(0, 0, 0).setName("Box 140")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 147, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 2, 2, 0, 0, 0, 0, 0.6f, 0, 0, 0.6f, 0, -1.75f, 0, 0, -1.75f, -0.6f, 0, -1, 0.6f, 0, -1, 0.6f, 0, -0.75f, -0.6f, 0, -0.75f)
			.setRotationPoint(56.9f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 450, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 2, 3, 0, 0, -0.5f, -2, 0.75f, -0.5f, -2, 0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, -1.15f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -2.75f, -1.15f, 0, -2.75f)
			.setRotationPoint(55.75f, -22.5f, -10).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 94, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 4, 0, 0, 0.5f, -3.25f, -0.4f, 0.5f, -3.25f, -0.4f, 0.25f, -0.75f, -0.2f, 0.25f, -0.75f, -1.85f, 0, 0, -0.4f, 0, 0, -0.4f, 0, -3.75f, -1.85f, 0, -3.75f)
			.setRotationPoint(53.9f, -23, -8).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 41, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 10, 0, 0, 0, -3, -0.4f, 0, -3, -0.4f, 0, -3, 0, 0, -3, 0, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(53.9f, -24, -5).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 102, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 11, 0, 0, 0, -10.5f, 0, 0, 0, 0, 0, -10.75f, 0, 0, 0, 0, 0, -10.5f, 0, 0, 0, 0, 0, -10.75f, 0, 0, 0)
			.setRotationPoint(51.5f, -18.5f, -11).setRotationAngle(0, 0, 0).setName("Box 149")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 2, 2, 0, 0, 0, -1.75f, 0.6f, 0, -1.75f, 0.6f, 0, 0, 0, 0, 0, -0.6f, 0, -0.75f, 0.6f, 0, -0.75f, 0.6f, 0, -1, -0.6f, 0, -1)
			.setRotationPoint(56.9f, -20.5f, -11.75f).setRotationAngle(0, 0, 0).setName("Box 151")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 71, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 9, 0, 0, 0, -8.4375f, -0.6f, 0, 1, -0.6f, 0, -9.75f, 0, 0, 0, 0, 0, -8.5f, 0, 0, 2, 0, 0, -10.75f, 0, 0, 0)
			.setRotationPoint(51.5f, -20.5f, -9).setRotationAngle(0, 0, 0).setName("Box 152")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 205, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -0.5f, -0.5f, -1.75f, -0.5f, 7, -1.75f, -0.5f, -7.75f, 0, -0.5f, 0, 0, 0, -0.5f, -0.6f, 0, 9, -0.6f, 0, -9.75f, 0, 0, 0)
			.setRotationPoint(51.5f, -22.5f, -1).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 104, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 2, 3, 0, 0, -0.5f, -0.75f, 0.75f, -0.5f, -0.75f, 0.75f, -0.5f, -2, 0, -0.5f, -2, -1.15f, 0, -2.75f, 0.75f, 0, -2.75f, 0.75f, 0, 0, -1.15f, 0, 0)
			.setRotationPoint(55.75f, -22.5f, 7).setRotationAngle(0, 0, 0).setName("Box 154")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 205, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -0.5f, 0, -1.75f, -0.5f, -7.75f, -1.75f, -0.5f, 7, 0, -0.5f, -0.5f, 0, 0, 0, -0.6f, 0, -9.75f, -0.6f, 0, 9, 0, 0, -0.5f)
			.setRotationPoint(51.5f, -22.5f, 0).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 178, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -0.5f, -0.5f, -3.6f, -0.5f, 3.75f, -3.35f, -0.75f, -4.75f, 0, -0.5f, 0, 0, 0, -0.5f, -1.75f, 0, 7, -1.75f, 0, -7.75f, 0, 0, 0)
			.setRotationPoint(51.5f, -24, -1).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 159, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -0.5f, 0, -3.35f, -0.75f, -4.75f, -3.6f, -0.5f, 3.75f, 0, -0.5f, -0.5f, 0, 0, 0, -1.75f, 0, -7.75f, -1.75f, 0, 7, 0, 0, -0.5f)
			.setRotationPoint(51.5f, -24, 0).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 4, 0, -0.2f, 0.25f, -0.75f, -0.4f, 0.25f, -0.75f, -0.4f, 0.5f, -3.25f, 0, 0.5f, -3.25f, -1.85f, 0, -3.75f, -0.4f, 0, -3.75f, -0.4f, 0, 0, -1.85f, 0, 0)
			.setRotationPoint(53.9f, -23, 4).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 159, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(68.5f, -18.5f, -11).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 370, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(68.5f, -18.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 54, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 25, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(73.5f, -18, -11).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 220, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(68.5f, -4, -11).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 49, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 25, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(73.5f, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 163")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 323, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(68.5f, -4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 93, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(68.5f, -18, -10.875f).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 44, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(68.5f, -17, -10.875f).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 39, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(72.5f, -17, -10.875f).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 137, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(68.5f, -12.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 34, 308, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(68.5f, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 463, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(72.5f, -17, 10.75f).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 262, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(68.5f, -18, 10.75f).setRotationAngle(0, 0, 0).setName("Box 172")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 379, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 10, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(69, -2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 366, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 10, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(69, -2.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 174")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 445, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -7, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -7, -0.75f)
			.setRotationPoint(68.5f, -2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 175")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 120, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, 0, 0, -1, 0, 0, -1, -0.75f, 0, -3, -0.75f)
			.setRotationPoint(67.5f, -2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 176")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 163, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, 0, 0, -2, 0, 0, -2, -0.75f, 0, -3, -0.75f)
			.setRotationPoint(65.5f, -2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 87, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -7, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -7, -0.75f)
			.setRotationPoint(68.5f, -2.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 407, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, 0, 0, -1, 0, 0, -1, -0.75f, 0, -3, -0.75f)
			.setRotationPoint(67.5f, -2.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 179")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 150, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, 0, 0, -2, 0, 0, -2, -0.75f, 0, -3, -0.75f)
			.setRotationPoint(65.5f, -2.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 55, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(57.5f, -3, -10.75f).setRotationAngle(0, 0, 0).setName("Box 181")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 95, 3, 11, 0, 0, -0.5f, -1, 0.5f, -0.5f, -0.75f, 0.5f, -0.5f, -0.75f, 0, -0.5f, -1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.5f, -24, -5.5f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 155, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 11, 0, 0, -0.5f, -3, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44.5f, -24, -5.5f).setRotationAngle(0, 0, 0).setName("Box 183")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 182, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 7, 0, -0.25f, -0.5f, -3, 0, -0.5f, -1, 0, -0.5f, -1, -0.25f, -0.5f, -3, 2.5f, 0, 0, 0, 0, 2, 0, 0, 2, 2.5f, 0, 0)
			.setRotationPoint(-45.5f, -24, -3.5f).setRotationAngle(0, 0, 0).setName("Box 184")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 204, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 75, 1, 15, 0, -0.15f, 0, -3, -0.0725f, 0, -3, -0.0725f, 0, -3, -0.15f, 0, -3, -4.05f, 0, 0, -0.0725f, 0, 0, -0.0725f, 0, 0, -4.05f, 0, 0)
			.setRotationPoint(-18.93f, -23, -7.5f).setRotationAngle(0, 0, 0).setName("Box 185")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 16, 0, -0.05f, -0.5f, -0.5f, -0.0725f, -0.5f, -0.5f, -0.0725f, -0.5f, -0.5f, -0.05f, -0.5f, -0.5f, -0.91875f, 0, 0, -0.0725f, 0, 0, -0.0725f, 0, 0, -0.91875f, 0, 0)
			.setRotationPoint(-14.93f, -22.5f, -8).setRotationAngle(0, 0, 0).setName("Box 186")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 159, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 3, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14, -21.5f, -8).setRotationAngle(0, 0, 0).setName("Box 187")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 263, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 16, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4)
			.setRotationPoint(-21, -21.5f, -8).setRotationAngle(0, 0, 0).setName("Box 188")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 158, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 16, 0, 0, 0, -4, -0.875f, 0, -0.5f, -0.875f, 0, -0.5f, 0, 0, -4, 0, -0.5f, -4, -0.0078125f, -0.5f, 0, -0.0078125f, -0.5f, 0, 0, -0.5f, -4)
			.setRotationPoint(-21, -22, -8).setRotationAngle(0, 0, 0).setName("Box 189")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 131, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 14, 0, 0, 0, -6, -4.85f, 0, -2.5f, -4.85f, 0, -2.5f, 0, 0, -6, 0, 0, -2.95f, -0.95f, 0, 0.5f, -0.95f, 0, 0.5f, 0, 0, -2.95f)
			.setRotationPoint(-20.93f, -23, -7).setRotationAngle(0, 0, 0).setName("Box 190")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 197, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 95, 1, 10, 0, 0, 0, -3, 0.4f, 0, -3, 0.4f, 0, -3, 0, 0, -3, 0, -0.5f, -0.5f, 0.4f, -0.5f, -0.25f, 0.4f, -0.5f, -0.25f, 0, -0.5f, -0.5f)
			.setRotationPoint(-41.5f, -24, -5).setRotationAngle(0, 0, 0).setName("Box 191")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 319, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0, 0, -4, 0, 0, -3, 0, 0, -3, 0, 0, -4, 0, -0.5f, -2.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -2.5f)
			.setRotationPoint(-44.5f, -24, -5).setRotationAngle(0, 0, 0).setName("Box 192")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 143, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -1.25f, 0, 0.5f, -1.25f, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -1.25f, -0.5f, 2, -1.25f, -0.5f, 2, 0, -0.5f, 0)
			.setRotationPoint(-45.25f, -24, -0.5f).setRotationAngle(0, 0, 0).setName("Box 193")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 37, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 21, 0, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0.4f, 0, 0, 0.4f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(-5, -3, -10.5f).setRotationAngle(0, 0, 0).setName("Box 215")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 132, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 5, 15, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, -3.5f, -0.1875f, 0, -1.5f, -1, 0, -1.5f, -1, 0, -3.5f, -0.1875f, 0)
			.setRotationPoint(36.5f, -2.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 366, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 7, 19, 0, -2, -3.5f, 0, 0, -6, 0, 0, -6, 0, -2, -3.5f, 0, -4.5f, 0, 0, 0, -1, 0, 0, -1, 0, -4.5f, 0, 0)
			.setRotationPoint(31.5f, -8.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 223")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 411, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 7, 19, 0, -4.5f, -6, 0, 0, -5, 0, 0, -5, 0, -4.5f, -6, 0, -4.5f, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -4.5f, 0, 0)
			.setRotationPoint(31.5f, -7.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 402, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 7, 20, 0, -4.5f, -6.5f, 0, -0.5f, -5, 0, -0.5f, -5, 0, -4.5f, -6.5f, 0, -4.5f, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -4.5f, 0, 0)
			.setRotationPoint(31.25f, -7, -10).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 88, 3, 21, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-52.5f, -6.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 305, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.75f, -0.14999962f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 262")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 176, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, -0.45f, 0, 0, -0.45f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, -0.14999962f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 263")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 12, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-24.5f, -1.3000002f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 5, 307, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-24.5f, -2.5500002f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 265")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 491, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(-25.5f, -1.3000002f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 266")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 438, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(-25, -2.5500002f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 267")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 198, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.75f, -0.14999962f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 283")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 73, 237, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, -0.45f, 0, 0, -0.45f, 0, 0, 0, 0)
			.setRotationPoint(-27.75f, -0.14999962f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 285")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 431, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-24.5f, -1.3000002f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 286")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 424, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-24.5f, -2.5500002f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 287")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 414, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(-25.5f, -1.3000002f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 288")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 400, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(-25, -2.5500002f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 289")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 394, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.35f, -0.5f, 0, 0.35f, -0.5f, 0, 0.35f, 0, 0, 0.35f, 0, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, 0, 0.9f, 0.35f)
			.setRotationPoint(-33.5f, 1.5f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 290")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 385, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -1, -0.1f, 0.35f, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f)
			.setRotationPoint(-33.5f, 0.75f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 291")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 365, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f, -1, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -1, -0.5f, 0.35f)
			.setRotationPoint(-33.5f, 3.1499996f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 292")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 377, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.35f, -0.75f, -1.25f, 0.35f, -0.75f, -1.25f, 0.35f, 0, 0.15f, 0.35f, 0, 1.65f, 0.35f, -0.75f, 0.25f, 0.35f, -0.75f, 0.25f, 0.35f, 0, 1.65f, 0.35f)
			.setRotationPoint(-31, 1, 7.75f).setRotationAngle(0, 0, 0).setName("Box 293")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 145, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-29.5f, 5.5f, 6.125f).setRotationAngle(0, 0, 0).setName("Box 307")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 112, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-29.5f, 4.75f, 6.125f).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 450, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-29.5f, 6.25f, 6.125f).setRotationAngle(0, 0, 0).setName("Box 309")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 248, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, 0, 0.15f, 0, 0.5f, 0.15f, 0, 0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.25f, -0.14999962f, -9).setRotationAngle(0, 0, 0).setName("Box 300")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 192, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, -0.45f, 0, 0, -0.45f, 0, 0, 0, 0)
			.setRotationPoint(12.75f, -0.14999962f, -9).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 393, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(16, -1.3000002f, -9).setRotationAngle(0, 0, 0).setName("Box 302")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 367, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(16, -2.5500002f, -9).setRotationAngle(0, 0, 0).setName("Box 303")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 352, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(15, -1.3000002f, -9).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 345, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(15.5f, -2.5500002f, -9).setRotationAngle(0, 0, 0).setName("Box 305")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 42, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 18, 0, 3, 0, 0, 0, 0, 0, 0, 0, -0.5f, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-38.75f, -1.3000002f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 328")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 275, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.75f, -3.3000002f, -9).setRotationAngle(0, 0, 0).setName("Box 329")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 338, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(11.5f, 2.25f, -9.85f).setRotationAngle(0, 0, 0).setName("Box 335")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 136, 289, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 1, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(9.5f, 2.5f, -10.1f).setRotationAngle(0, 0, 6).setName("Box 336")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 333, 306, textureX, textureY)
			.addShapeBox(-0.5f, -0.25f, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(4.84375f, -2, -10.1f).setRotationAngle(0, 0, -8).setName("Box 337")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 316, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(9.9f, -2.6499996f, -9.85f).setRotationAngle(0, 0, 0).setName("Box 338")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 311, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(4.45f, -2, -9.85f).setRotationAngle(0, 0, 0).setName("Box 339")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 306, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(4.35f, -2.6999998f, -9.85f).setRotationAngle(0, 0, 0).setName("Box 342")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 237, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.25f, -2.3000002f, -9).setRotationAngle(0, 0, 0).setName("Box 343")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 299, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(1.25f, -0.14999962f, -9).setRotationAngle(0, 0, 0).setName("Box 345")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 102, 1, 1, 0, 0, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-45.5f, -19.6f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 346")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 102, 1, 1, 0, 0, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-45.5f, -19.6f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 347")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 402, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, 2.1f, 0, -0.4f, -2.9f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, 2.1f, 0, -0.4f, -2.9f, 0, -0.4f, -0.4f)
			.setRotationPoint(-58.5f, -16.6f, -5.75f).setRotationAngle(0, 0, 0).setName("Box 348")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 402, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -2.9f, 0, -0.4f, 2.1f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -2.9f, 0, -0.4f, 2.1f, 0, -0.4f, -0.4f)
			.setRotationPoint(-58.5f, -16.6f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 349")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 370, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, 3.8f, 0, -0.4f, -4.6f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, 3.8f, 0, -0.4f, -4.6f, 0, -0.4f, -0.4f)
			.setRotationPoint(-64.5f, -11.6f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 350")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 207, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.4f, -0.4f, 0, -0.4f, -4.6f, 0, -0.4f, 3.8f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -4.6f, 0, -0.4f, 3.8f, 0, -0.4f, -0.4f)
			.setRotationPoint(-64.5f, -11.6f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 351")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 294, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.4f, -1, -0.5f, -0.4f, 0.1f, -0.5f, -0.4f, -0.9f, -0.2f, -0.4f, 0, 0, -0.4f, -1, -0.5f, -0.4f, 0.1f, -0.5f, -0.4f, -0.9f, -0.2f, -0.4f, 0)
			.setRotationPoint(-65, -11.6f, -1).setRotationAngle(0, 0, 0).setName("Box 352")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 289, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.4f, 0, -0.5f, -0.4f, -0.9f, -0.5f, -0.4f, 0.1f, 0, -0.4f, -1, -0.2f, -0.4f, 0, -0.5f, -0.4f, -0.9f, -0.5f, -0.4f, 0.1f, 0, -0.4f, -1)
			.setRotationPoint(-65, -11.6f, 0).setRotationAngle(0, 0, 0).setName("Box 353")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 157, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.35f, -0.5f, 0, 0.35f, -0.5f, 0, 0.35f, 0, 0, 0.35f, 0, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, 0, 0.9f, 0.35f)
			.setRotationPoint(8.5f, 1.5f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 370")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 148, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -1, -0.1f, 0.35f, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f)
			.setRotationPoint(8.5f, 0.75f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 371")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 117, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f, -1, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -1, -0.5f, 0.35f)
			.setRotationPoint(8.5f, 3.1499996f, -8.75f).setRotationAngle(0, 0, 0).setName("Box 372")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 284, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.35f, -0.75f, -1.25f, 0.35f, -0.75f, -1.25f, 0.35f, 0, 0.15f, 0.35f, 0, 1.65f, 0.35f, -0.75f, 0.25f, 0.35f, -0.75f, 0.25f, 0.35f, 0, 1.65f, 0.35f)
			.setRotationPoint(11, 1, -8.75f).setRotationAngle(0, 0, 0).setName("Box 373")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 264, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 8, 0, 0, 0, 0, 0, -12, 0, 0, -12, 0, 0, 0, 0, 0, 0, -5, 0, -12, -5, 0, -12, -5, 0, 0, -5, 0)
			.setRotationPoint(59, -11.5f, -11.1f).setRotationAngle(0, 0, 0).setName("Box 383")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 159, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 8, 0, 0, 0, 0, 0, -12, 0, 0, -12, 0, 0, 0, 0, 0, 0, -5, 0, -12, -5, 0, -12, -5, 0, 0, -5, 0)
			.setRotationPoint(59, -11.5f, 11.1f).setRotationAngle(0, 0, 0).setName("Box 384")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 432, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14, -21.3f, -8.01f).setRotationAngle(0, 0, 0).setName("Box 385")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 145, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14, -21.3f, 8.1f).setRotationAngle(0, 0, 0).setName("Box 386")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 129, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69, 6, -9.75f).setRotationAngle(0, 0, 0).setName("Box 387")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 32, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69, 6, 8.75f).setRotationAngle(0, 0, 0).setName("Box 388")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 16, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.75f, -3.3000002f, 7).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 279, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(-39.5f, 2.25f, 8.85f).setRotationAngle(0, 0, 0).setName("Box 397")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 147, 147, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, 0.375))
			.setRotationPoint(-13.5f, 6, 5.875f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 201, 68, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, 0.375))
			.setRotationPoint(-29, 6, 5.875f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 148, 44, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 17, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, 2.5f, 7.8f).setRotationAngle(0, 0, 11.5f).setName("Box 304cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 111, 44, textureX, textureY)
			.addShapeBox(0, -1.125f, 0, 17, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-31, 2.5f, 7.8f).setRotationAngle(0, 0, 11.5f).setName("Box 305cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 74, 44, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 17, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-31, 2.5f, 7.8f).setRotationAngle(0, 0, 11.5f).setName("Box 306cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 13, 349, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 16, 16, 1, 1, 2, null)
			.setRotationPoint(-50, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 274, 306, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 5, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-40.5f, -1.75f, 8.6f).setRotationAngle(0, 0, -19.375f).setName("Box 397cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 257, 306, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f)
			.setRotationPoint(-40.5f, -1.75f, 9).setRotationAngle(0, 0, -19.375f).setName("Box 398cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 332, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39, 2.5f, 8.6f).setRotationAngle(0, 0, -4.125f).setName("Box 396cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 500, 10, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 16, 0.9375f, 0.9375f, 2, null)
			.setRotationPoint(-66, -19, 0).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 501, 153, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 7, 16, 1, 1, 2, null)
			.setRotationPoint(-52, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 200, 151, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 7, 16, 1, 1, 2, null)
			.setRotationPoint(-5.5f, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 507, 233, textureX, textureY).addCylinder(0, 0, 0, 1, 7, 16, 1, 1, 2, null)
			.setRotationPoint(-5.5f, -0.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 67, 237, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1.75f, 16, 1, 1, 0, null)
			.setRotationPoint(-13.5f, 6, 7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 45, 68, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, 0.375))
			.setRotationPoint(12, 6, 5.875f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 464, 162, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 16, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 2.5f, 7.8f).setRotationAngle(0, 0, 12).setName("Box 304cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 112, 162, textureX, textureY)
			.addShapeBox(0, -1.125f, 0, 16, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11, 2.5f, 7.8f).setRotationAngle(0, 0, 12).setName("Box 305cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 264, 160, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 16, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11, 2.5f, 7.8f).setRotationAngle(0, 0, 12).setName("Box 306cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 61, 237, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1.75f, 16, 1, 1, 0, null)
			.setRotationPoint(27.5f, 6, 7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 417, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(11.5f, 5.5f, 6.125f).setRotationAngle(0, 0, 0).setName("Box 307cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 384, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11.5f, 4.75f, 6.125f).setRotationAngle(0, 0, 0).setName("Box 308cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 145, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11.5f, 6.25f, 6.125f).setRotationAngle(0, 0, 0).setName("Box 309cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 39, 68, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, 0.375))
			.setRotationPoint(27.5f, 6, 5.875f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 404, 47, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1, 16, 1, 1, 2, null)
			.setRotationPoint(-34.5f, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 211, 151, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 11.5f, 16, 1, 1, 2, null)
			.setRotationPoint(-4, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 7, 47, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1, 16, 1, 1, 2, null)
			.setRotationPoint(7.5f, 2.5f, 8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 202, 54, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, 0.375))
			.setRotationPoint(-29, 6, -7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 37, 44, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 17, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, 2.5f, -8.8f).setRotationAngle(0, 0, 11.5f).setName("Box 304cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 44, textureX, textureY)
			.addShapeBox(0, -1.125f, 0, 17, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-31, 2.5f, -8.8f).setRotationAngle(0, 0, 11.5f).setName("Box 305cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 462, 32, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 17, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(-31, 2.5f, -8.8f).setRotationAngle(0, 0, 11.5f).setName("Box 306cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 55, 237, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1.75f, 16, 1, 1, 0, null)
			.setRotationPoint(-13.5f, 6, -9).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 112, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-29.5f, 5.5f, -7.125f).setRotationAngle(0, 0, 0).setName("Box 307cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 264, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 1, 0, 0, -0.875f, 0.0625f, 0.5f, -0.875f, 0.0625f, 0.5f, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0.5f, -0.875f, 0.0625f, 0.5f, -0.875f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(-29.5f, 4.25f, -7.125f).setRotationAngle(0, 0, 0).setName("Box 308cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 384, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 1, 0, 0, -0.875f, 0.0625f, 0.5f, -0.875f, 0.0625f, 0.5f, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0, -0.875f, 0.0625f, 0.5f, -0.875f, 0.0625f, 0.5f, -0.875f, 0.0625f, 0, -0.875f, 0.0625f)
			.setRotationPoint(-29.5f, 5.75f, -7.125f).setRotationAngle(0, 0, 0).setName("Box 309cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 413, 41, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, 0.375))
			.setRotationPoint(-13.5f, 6, -7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 252, 306, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 5, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(-40.5f, -1.75f, -10.1125f).setRotationAngle(0, 0, -19.375f).setName("Box 397cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 241, 306, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f)
			.setRotationPoint(-40.5f, -1.75f, -9.68125f).setRotationAngle(0, 0, -19.375f).setName("Box 398cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 112, 169, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39, 2.5f, -10.1125f).setRotationAngle(0, 0, -4.125f).setName("Box 396cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 43, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.35f, -0.5f, 0, 0.35f, -0.5f, 0, 0.35f, 0, 0, 0.35f, 0, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, 0, 0.9f, 0.35f)
			.setRotationPoint(-33.5f, 1.5f, -8.775001f).setRotationAngle(0, 0, 0).setName("Box 290cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 486, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -1, -0.1f, 0.35f, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f)
			.setRotationPoint(-33.5f, 0.75f, -8.775001f).setRotationAngle(0, 0, 0).setName("Box 291cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 466, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f, -1, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -1, -0.5f, 0.35f)
			.setRotationPoint(-33.5f, 3.1499996f, -8.775001f).setRotationAngle(0, 0, 0).setName("Box 292cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 236, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.35f, -0.75f, -1.25f, 0.35f, -0.75f, -1.25f, 0.35f, 0, 0.15f, 0.35f, 0, 1.65f, 0.35f, -0.75f, 0.25f, 0.35f, -0.75f, 0.25f, 0.35f, 0, 1.65f, 0.35f)
			.setRotationPoint(-31, 1, -8.775001f).setRotationAngle(0, 0, 0).setName("Box 293cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 231, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(-39.5f, 2.25f, -9.8625f).setRotationAngle(0, 0, 0).setName("Box 397cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 507, 284, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 16, 16, 1, 1, 2, null)
			.setRotationPoint(-50, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 491, 20, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1, 16, 1, 1, 2, null)
			.setRotationPoint(-34.5f, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 496, 140, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 7, 16, 1, 1, 2, null)
			.setRotationPoint(-52, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 485, 20, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, 0.375))
			.setRotationPoint(12, 6, -7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 112, 159, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 16, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 2.5f, -8.7f).setRotationAngle(0, 0, 12).setName("Box 304cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 112, 156, textureX, textureY)
			.addShapeBox(0, -1.125f, 0, 16, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11, 2.5f, -8.7f).setRotationAngle(0, 0, 12).setName("Box 305cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 370, 119, textureX, textureY)
			.addShapeBox(0, 0.125f, 0, 16, 1, 1, 0, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 1, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11, 2.5f, -8.7f).setRotationAngle(0, 0, 12).setName("Box 306cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 49, 237, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1.75f, 16, 1, 1, 0, null)
			.setRotationPoint(27.5f, 6, -9).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 264, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(11.5f, 5.5f, -7.125f).setRotationAngle(0, 0, 0).setName("Box 307cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 464, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11.5f, 4.75f, -7.125f).setRotationAngle(0, 0, 0).setName("Box 308cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 264, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0.5f, -0.375f, 0.0625f, 0, -0.375f, 0.0625f)
			.setRotationPoint(11.5f, 6.25f, -7.125f).setRotationAngle(0, 0, 0).setName("Box 309cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 505, 6, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 1, 16, 1, 1, 0, new Vec3f(0.0, 0.0, 0.375))
			.setRotationPoint(27.5f, 6, -7.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 13, 334, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 11.5f, 16, 1, 1, 2, null)
			.setRotationPoint(-4, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 228, 6, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1, 16, 1, 1, 2, null)
			.setRotationPoint(7.5f, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 457, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.35f, -0.5f, 0, 0.35f, -0.5f, 0, 0.35f, 0, 0, 0.35f, 0, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, -0.5f, 0.9f, 0.35f, 0, 0.9f, 0.35f)
			.setRotationPoint(8.5f, 1.5f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 370cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 439, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -1, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -0.5f, -0.1f, 0.35f, -1, -0.1f, 0.35f, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f)
			.setRotationPoint(8.5f, 0.75f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 371cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 430, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, -0.5f, -0.25f, 0.35f, 0, -0.25f, 0.35f, -1, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -0.5f, -0.5f, 0.35f, -1, -0.5f, 0.35f)
			.setRotationPoint(8.5f, 3.1499996f, 7.75f).setRotationAngle(0, 0, 0).setName("Box 372cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 226, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.35f, -0.75f, -1.25f, 0.35f, -0.75f, -1.25f, 0.35f, 0, 0.15f, 0.35f, 0, 1.65f, 0.35f, -0.75f, 0.25f, 0.35f, -0.75f, 0.25f, 0.35f, 0, 1.65f, 0.35f)
			.setRotationPoint(11, 1, 7.75f).setRotationAngle(0, 0, 0).setName("Box 373cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 221, 306, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 5, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(10.5f, -1.75f, -10.1125f).setRotationAngle(0, 0, -19.375f).setName("Box 397cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 216, 306, textureX, textureY)
			.addShapeBox(-0.5f, 0.25f, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f)
			.setRotationPoint(10.5f, -1.75f, -9.68125f).setRotationAngle(0, 0, -19.375f).setName("Box 398cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 233, 214, textureX, textureY)
			.addShapeBox(-5, -0.5f, 0, 5, 1, 1, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(10, -2.1125002f, -10.1f).setRotationAngle(0, 0, -7).setName("Box 340cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 92, 198, textureX, textureY).addCylinder(0, 0, 0, 1, 7, 16, 1, 1, 2, null)
			.setRotationPoint(-5.5f, -0.75f, -9.75f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 220, 214, textureX, textureY)
			.addShapeBox(-5, -0.5f, 0, 5, 1, 1, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(10, -2.8000002f, -10.1f).setRotationAngle(0, 0, -7).setName("Box 340cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 211, 306, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 5, 1, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(10.5f, -1.75f, 8.578125f).setRotationAngle(0, 0, -19.375f).setName("Box 397cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 206, 306, textureX, textureY)
			.addShapeBox(-0.5f, 0.25f, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.3125f, -0.25f, -0.25f, -0.3125f)
			.setRotationPoint(10.5f, -1.75f, 9.009376f).setRotationAngle(0, 0, -19.375f).setName("Box 398cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 189, 214, textureX, textureY)
			.addShapeBox(-5, -0.5f, 0, 5, 1, 1, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(10, -2.1125002f, 8.590625f).setRotationAngle(0, 0, -7).setName("Box 340cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 93, 213, textureX, textureY)
			.addShapeBox(-5, -0.5f, 0, 5, 1, 1, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, -0.5f, 0.5f, -0.3125f, -0.5f, 0.5f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(10, -2.8000002f, 8.590625f).setRotationAngle(0, 0, -7).setName("Box 340cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 201, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(11.5f, 2.25f, 8.840625f).setRotationAngle(0, 0, 0).setName("Box 335cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 20, 289, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 2, 1, 1, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(9.5f, 2.5f, 8.590625f).setRotationAngle(0, 0, 6).setName("Box 336cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 196, 306, textureX, textureY)
			.addShapeBox(-0.5f, -0.25f, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(4.84375f, -2, 8.590625f).setRotationAngle(0, 0, -8).setName("Box 337cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 184, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(9.9f, -2.6499996f, 8.840625f).setRotationAngle(0, 0, 0).setName("Box 338cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 179, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(4.45f, -2, 8.840625f).setRotationAngle(0, 0, 0).setName("Box 339cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 174, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(4.35f, -2.6999998f, 8.840625f).setRotationAngle(0, 0, 0).setName("Box 342cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 485, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 2, 0, 0, 0.15f, 0, 0.5f, 0.15f, 0, 0.5f, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.25f, -0.14999962f, 7).setRotationAngle(0, 0, 0).setName("Box 300cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 179, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, -0.45f, 0, 0, -0.45f, 0, 0, 0, 0)
			.setRotationPoint(12.75f, -0.14999962f, 7).setRotationAngle(0, 0, 0).setName("Box 301cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 148, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(16, -1.3000002f, 7).setRotationAngle(0, 0, 0).setName("Box 302cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 113, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(16, -2.5500002f, 7).setRotationAngle(0, 0, 0).setName("Box 303cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 502, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(15, -1.3000002f, 7).setRotationAngle(0, 0, 0).setName("Box 304cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 484, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, 1.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, -0.25f)
			.setRotationPoint(15.5f, -2.5500002f, 7).setRotationAngle(0, 0, 0).setName("Box 305cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 354, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.25f, -2.3000002f, 7).setRotationAngle(0, 0, 0).setName("Box 343cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 469, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, 0.025f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(1.25f, -0.14999962f, 7).setRotationAngle(0, 0, 0).setName("Box 345cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 316, 131, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 7, 16, 1, 1, 2, null)
			.setRotationPoint(-5.5f, 2.5f, -8.25f).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 398, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 21, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(35.5f, -3.5f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 226cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 414, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 11, 0, 0, 0, 0, 0, 0, -10.75f, 0, 0, 0, 0, 0, -10.5f, 0, 0, 0, 0, 0, -10.75f, 0, 0, 0, 0, 0, -10.5f)
			.setRotationPoint(51.5f, -18.5f, 0).setRotationAngle(0, 0, 0).setName("Box 149cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 394, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 9, 0, 0, 0, 0, -0.6f, 0, -9.75f, -0.6f, 0, 1, 0, 0, -8.4375f, 0, 0, 0, 0, 0, -10.75f, 0, 0, 2, 0, 0, -8.5f)
			.setRotationPoint(51.5f, -20.5f, 0).setRotationAngle(0, 0, 0).setName("Box 152cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 446, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(52.5f, -23.5f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 158cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 446, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(52.5f, -23.5f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 158cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 492, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(55.5f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 485, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 2.578125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, 2.578125f)
			.setRotationPoint(55.5f, -10.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 478, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.5f, -10.5f, 10).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 471, 288, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 2.578125f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 2.578125f, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55.5f, -10.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 6, textureX, textureY).addBox(0, 0, 0, 108, 4, 5)
			.setRotationPoint(-52.5f, -10.5f, 6).setRotationAngle(0, 0, 0).setName("Box 55cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 127, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(56.5f, -16, -9).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 80, 306, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, -1, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.5f, -19, -9).setRotationAngle(0, 0, 0).setName("Box 18cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 444, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 16, 0, 0, 0, -2, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, -2, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(56.5f, -21, -8).setRotationAngle(0, 0, 0).setName("Box 22cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 362, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, 0, -3, 0, -0.5f, -3.5f, 0, -0.5f, -3.5f, 0, 0, -3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(56.5f, -23, -6).setRotationAngle(0, 0, 0).setName("Box 35cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 1, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 18, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56.5f, -8, -9).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 128, 305, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(56.5f, -11, -9).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 151, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(56.5f, -11, 2).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 94, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, -1, 0, 0, -1, 0, 0, -1, 9, 0, -1)
			.setRotationPoint(-37.5f, -13, -9).setRotationAngle(0, 0, 0).setName("Box 25cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 311, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(53.5f, -11.25f, -3.25f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 287, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -12.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 266, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(53.5f, -11.25f, 2.25f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 406, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -7.75f, -4).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 23, 304, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(53.5f, -11.25f, -2).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 147, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(57.5f, -12.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 487, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f)
			.setRotationPoint(68.5f, -12.5f, -10.875f).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 509, 36, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 16, 1, 1, 2, null)
			.setRotationPoint(57, -12.25f, -1).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 509, 30, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 16, 1, 1, 2, null)
			.setRotationPoint(57, -12.25f, 1).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 328, 305, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.75f, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 269, 305, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 102, 305, textureX, textureY)
			.addShapeBox(0, 0, -0.5f, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.75f, -0.125f, 0.125f)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 93, 305, textureX, textureY)
			.addShapeBox(0, 0, -0.75f, 1, 1, 1, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, -0.125f, 0.125f, 0, -0.125f, 0.125f, 0, -0.125f, 0.125f, -0.75f, -0.125f, 0.125f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 0, 305, textureX, textureY)
			.addShapeBox(0, 0.25f, -1, 1, 1, 2, 0, -0.75f, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f, -0.75f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 477, 304, textureX, textureY)
			.addShapeBox(0, 0.25f, -1.25f, 1, 1, 2, 0, -0.75f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.125f, -0.75f, -0.625f, -0.125f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.125f, -0.75f, 0, 0.125f)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 453, 304, textureX, textureY)
			.addShapeBox(0, 0.5f, -1, 1, 1, 2, 0, -0.75f, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.75f, -0.75f, 0, -0.75f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 448, 304, textureX, textureY)
			.addShapeBox(0, 1.25f, -1, 1, 1, 1, 0, -0.75f, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, -1.125f, -0.75f, -0.25f, -1.125f, -0.75f, 0, 0.625f, 0, 0, 0.625f, 0, 0, -1.125f, -0.75f, 0, -1.125f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 421, 304, textureX, textureY)
			.addShapeBox(0, 2.25f, -1.5f, 1, 1, 1, 0, -0.75f, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0.125f, 0.3125f, 0, 0.125f, 0.3125f, 0, 0.125f, -0.625f, -0.75f, 0.125f, -0.625f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 386, 304, textureX, textureY)
			.addShapeBox(0, 1.25f, -0.75f, 1, 3, 2, 0, -0.75f, 0, -1.25f, 0, 0, -1.25f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -1.25f, 0, -0.25f, -1.25f, 0, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 364, 304, textureX, textureY)
			.addShapeBox(0, 1.25f, -1, 1, 1, 1, 0, -0.75f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.875f, -0.75f, -0.25f, -0.875f, -0.75f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.25f, -0.875f, -0.75f, -0.25f, -0.875f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 359, 304, textureX, textureY)
			.addShapeBox(0, 1, -1, 1, 3, 1, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0.25f, -0.75f, 0, 0.25f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 342, 304, textureX, textureY)
			.addShapeBox(0, 1.25f, -0.75f, 1, 1, 1, 0, -0.75f, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 323, 304, textureX, textureY)
			.addShapeBox(0, 2.25f, -1.125f, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 262, 304, textureX, textureY)
			.addShapeBox(0, 4, -1.125f, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 247, 304, textureX, textureY)
			.addShapeBox(0, 2.25f, 0.25f, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.75f, -0.5f, -0.75f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 167, 304, textureX, textureY)
			.addShapeBox(0, 0.5f, -1.25f, 1, 1, 2, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0.125f, -0.75f, -0.75f, 0.125f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0.375f, -0.75f, 0, 0.375f)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 153, 304, textureX, textureY)
			.addShapeBox(0, 1.25f, -0.25f, 1, 1, 1, 0, -0.75f, -0.25f, -1.125f, 0, -0.25f, -1.125f, 0, -0.25f, 0.375f, -0.75f, -0.25f, 0.375f, -0.75f, 0, -1.125f, 0, 0, -1.125f, 0, 0, 0.625f, -0.75f, 0, 0.625f)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 138, 304, textureX, textureY)
			.addShapeBox(0, 2.25f, 0.25f, 1, 1, 1, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0.125f, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, 0.3125f, -0.75f, 0.125f, 0.3125f)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 128, 304, textureX, textureY)
			.addShapeBox(0, 1.25f, -1.5f, 1, 3, 2, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.25f, -0.75f, 0, -1.25f, -0.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -1.25f, -0.75f, -0.25f, -1.25f)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 123, 304, textureX, textureY)
			.addShapeBox(0, 1.25f, -0.25f, 1, 1, 1, 0, -0.75f, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, 0.125f, -0.75f, -0.25f, 0.125f, -0.75f, -0.25f, -0.875f, 0, -0.25f, -0.875f, 0, -0.25f, 0.125f, -0.75f, -0.25f, 0.125f)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 108, 304, textureX, textureY)
			.addShapeBox(0, 1, -0.25f, 1, 3, 1, 0, -0.75f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, -0.125f, -0.75f, -0.5f, -0.125f, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.125f, -0.75f, 0, -0.125f)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 88, 304, textureX, textureY)
			.addShapeBox(0, 1.25f, -0.5f, 1, 1, 1, 0, -0.75f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, -1, -0.75f, -0.25f, -1, -0.75f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, -1, -0.75f, -0.25f, -1)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 83, 304, textureX, textureY)
			.addShapeBox(0, 2.25f, -0.125f, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 464, 303, textureX, textureY)
			.addShapeBox(0, 4, -1.125f, 1, 1, 2, 0, -0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 35, 304, textureX, textureY)
			.addShapeBox(0, 2.25f, -1.5f, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 216, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(54.5f, -11.25f, -2.25f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 176, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.5f, -11.25f, 1.25f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 34, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.5f, -8.75f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 25, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(54.5f, -8.75f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 22, 304, textureX, textureY)
			.addShapeBox(0, 3.5f, -1.5f, 1, 1, 1, 0, -0.75f, 0.125f, 0.3125f, 0, 0.125f, 0.3125f, 0, 0.125f, -0.625f, -0.75f, 0.125f, -0.625f, -0.75f, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.625f, -0.75f, 0, -0.625f)
			.setRotationPoint(56.75f, -12.25f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 14, 304, textureX, textureY)
			.addShapeBox(0, 3.5f, 0.25f, 1, 1, 1, 0, -0.75f, 0.125f, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, 0.3125f, -0.75f, 0.125f, 0.3125f, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0.375f, -0.75f, 0, 0.375f)
			.setRotationPoint(56.75f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 9, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(54.5f, -11.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 122cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 423, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(55.5f, -5.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 181cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 384, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(55.5f, -5.5f, 5.25f).setRotationAngle(0, 0, 0).setName("Box 181cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 500, 333, textureX, textureY).addHollowCylinder(0, 0, 0, 2, 1.875f, 1, 16, 0, 1, 1, 2, new Vec3f(-1.0, 0.0, 0.0))
			.setRotationPoint(-65.125f, -19, 0).setRotationAngle(0, 0, 0)
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 370, 351, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.5f, -4.5f, -2).setRotationAngle(0, 0, 0).setName("Box 102cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 381, 349, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 6, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.5f, -4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 102cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 396, 349, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 6, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-72.5f, -4.5f, 2).setRotationAngle(0, 0, 0).setName("Box 102cp")
		);
		Rest_of_locomotive.add(new ModelRendererTurbo(Rest_of_locomotive, 440, 350, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 22, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.5f, -4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		this.groups.add(Rest_of_locomotive);
	}

}
