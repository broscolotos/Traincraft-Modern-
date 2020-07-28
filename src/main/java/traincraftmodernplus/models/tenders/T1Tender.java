//FMT-Marker FVTM-1.4
//Using PER-GROUP-INIT mode with limit '500'!
package traincraftmodernplus.models.tenders;

import ebf.tim.models.GroupedModelRender;
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
public class T1Tender extends RollingStockModel {

	private static final String cargo1 = GroupedModelRender.tagRenderBlockCargo + "1";
	private static final String cargo2 = GroupedModelRender.tagRenderBlockCargo + "2";
	private static final String cargo3 = GroupedModelRender.tagRenderBlockCargo + "3";
	private static final String cargo4 = GroupedModelRender.tagRenderBlockCargo + "4";
	public T1Tender(){

		super(); textureX = 512; textureY = 512;
		this.addToCreators("Broscolotos");
		//
		initGroup_T1_CTC_Tender();
	}

	private final void initGroup_T1_CTC_Tender(){
		TurboList T1_CTC_Tender = new TurboList("T1_CTC_Tender");
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 235, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 116, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(75, -18.5f, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 364, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 22, 22, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(191, -17, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 273, 106, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1.0E-15f, 22, 16, 4, 1, 1, 0, null)
			.setRotationPoint(191, -17, -11).setRotationAngle(0, 0, 180)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 429, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 6, 20, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(192.5f, -0.5f, -10).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 282, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 20, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0)
			.setRotationPoint(192.5f, 6, -10).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 116, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(75, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 307, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 25, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(75, -18.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 192, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 20, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(81.75f, -18.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 277, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 25, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(75, -18.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 218, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 20, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(142.75f, -18.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 322, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 42, 19, 21, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(148.75f, -17.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 163, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 21, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(75.5f, -4.25f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 232, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 9, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(75, -4.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 282, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(188, -18.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 252, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(159.75f, -18.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 197, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(172.5f, -18.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 468, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(148.75f, -19.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 168, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(160.75f, -20.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 209, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(160.75f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 12, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(173.5f, -20.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 204, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(173.5f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 422, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(189, -20.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 199, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(189, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 333, 87, textureX, textureY).addHollowCylinder(0, 0, 0, 1.5f, 1.0E-15f, 3.5f, 16, 8, 1, 1, 3, null)
			.setRotationPoint(148.75f, -19.5f, 0).setRotationAngle(-90, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 304, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(152.75f, -17.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 79, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(152.25f, -18, -1.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 502, 98, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 9, 16, 1, 1, 3, null)
			.setRotationPoint(148.75f, -19, 3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 462, 41, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 0.25f, 16, 1, 0.9375f, 3, null)
			.setRotationPoint(157.75f, -19, 3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 470, 20, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 0.25f, 16, 0.9375f, 0.75f, 3, null)
			.setRotationPoint(158, -19, 3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 500, 15, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 0.25f, 16, 0.75f, 0, 3, null)
			.setRotationPoint(158.25f, -19, 3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 13, 73, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 9, 16, 1, 1, 3, null)
			.setRotationPoint(148.75f, -19, -3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 500, 10, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 0.25f, 16, 1, 0.9375f, 3, null)
			.setRotationPoint(157.75f, -19, -3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 500, 5, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 0.25f, 16, 0.9375f, 0.75f, 3, null)
			.setRotationPoint(158, -19, -3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 500, 0, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 0.25f, 16, 0.75f, 0, 3, null)
			.setRotationPoint(158.25f, -19, -3.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 402, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(159.875f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 194, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.375f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(159.375f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 189, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f)
			.setRotationPoint(158.875f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 184, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f)
			.setRotationPoint(158.875f, -21.125f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 120, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(158.75f, -20.375f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 109, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.25f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(191.875f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 46, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.375f, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.5f, -0.375f, -0.25f, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f)
			.setRotationPoint(192.375f, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, 0.125f, -0.25f, -0.25f, -0.625f, -0.25f, -0.25f)
			.setRotationPoint(192.375f, -21.125f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 504, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.125f, -0.25f, 0, -0.125f, -0.25f, 0, -0.125f, -0.25f, -0.5f, -0.125f, -0.25f)
			.setRotationPoint(192.5f, -20.375f, -0.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 393, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(167.125f, -18.5f, 6.875f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 458, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(167, -19.25f, 7).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 423, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(167.125f, -18.5f, -10.125f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 423, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(167, -19.25f, -10).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 282, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(173, -19.5f, 7.125f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 206, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(173, -19.5f, -8.125f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 496, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.75f, -0.5f, -0.375f, -0.75f, -0.25f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.25f, -0.375f)
			.setRotationPoint(191.375f, -21.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 487, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.625f, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(191.625f, -21.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 471, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.875f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, -0.875f, -0.25f, -0.375f)
			.setRotationPoint(191.625f, -21.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 443, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(191.75f, -20.375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 360, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.625f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.25f, -0.625f, -0.375f, -0.25f, -0.125f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.125f, -0.375f)
			.setRotationPoint(190.75f, -21.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 342, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.25f, -0.875f, -0.375f, -0.25f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.25f, -0.125f, -0.375f)
			.setRotationPoint(190.5f, -21.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 303, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f)
			.setRotationPoint(190.5f, -21.125f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 219, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(191.25f, -21.625f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 214, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(189.875f, -20.375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 179, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.5f, -0.375f, 0, -0.625f, -0.375f, 0, -0.625f, -0.375f, -0.75f, -0.5f, -0.375f, -0.75f, -0.25f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.25f, -0.375f)
			.setRotationPoint(191.375f, -21.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 174, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.625f, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.75f, -0.625f, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(191.625f, -21.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 142, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.25f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.75f, -0.25f, -0.375f, -0.875f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, 0.125f, -0.25f, -0.375f, -0.875f, -0.25f, -0.375f)
			.setRotationPoint(191.625f, -21.125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 115, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(191.75f, -20.375f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 77, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.625f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f, -0.5f, -0.375f, -0.25f, -0.625f, -0.375f, -0.25f, -0.125f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.125f, -0.375f)
			.setRotationPoint(190.75f, -21.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 41, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.875f, -0.375f, -0.5f, -0.625f, -0.375f, -0.5f, -0.625f, -0.375f, -0.25f, -0.875f, -0.375f, -0.25f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.5f, -0.125f, -0.375f, -0.25f, -0.125f, -0.375f)
			.setRotationPoint(190.5f, -21.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 10, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, -0.25f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.625f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f)
			.setRotationPoint(190.5f, -21.125f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 482, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, -0.125f, -0.5f, -0.375f, 0, -0.5f, -0.375f, 0, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, -0.125f, -0.25f, -0.375f, 0, -0.25f, -0.375f)
			.setRotationPoint(191.25f, -21.75f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 466, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.125f, -0.375f, 0, -0.125f, -0.375f, 0, -0.125f, -0.375f, -0.75f, -0.125f, -0.375f)
			.setRotationPoint(189.875f, -20.375f, -8.25f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 459, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(192.125f, -19.9375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 451, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(192.125f, -17.1875f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 436, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(192.125f, -14.4375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 418, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(192.125f, -11.6875f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 353, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(192.125f, -8.9375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 335, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(192.125f, -6.1875f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 318, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, 0.5f, -0.4375f, -0.4375f, 0.5f)
			.setRotationPoint(192.125f, -3.4375f, -7.625f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 161, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 6, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(83.75f, -4.25f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 252, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(195, 0.5f, -1).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 159, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(75, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 308, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(83, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 298, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 293, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -1, 0, 0, -1, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(85, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 140, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(75, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 278, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(83, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 268, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(84, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 155, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -1, 0, 0, -1, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(85, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 293, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, -1.75f, 0.25f, 0, -1.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 5, 0, -0.75f, 5, 0, -1, 0, 0, -1)
			.setRotationPoint(148.75f, -20.5f, -11.75f).setRotationAngle(0, 0, 0).setName("Box 151cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 255, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.5f, -3.25f, -1, 0.5f, -3.25f, -1, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -3.75f, 0, 0, -3.75f)
			.setRotationPoint(148.75f, -23, -8).setRotationAngle(0, 0, 0).setName("Box 145cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 282, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -1.75f, 0, 0, -1.75f, 0, 0, -1, 5, 0, -1, 5, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(148.75f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 151cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 246, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, -1.75f, 0, -0.25f, -1.75f, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -2.75f, 0, 0, -2.75f)
			.setRotationPoint(148.75f, -22.25f, -9).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 322, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.25f, -1, -0.25f, -0.25f, -1, -0.25f, -0.25f, -1.75f, 0, -0.25f, -1.75f, 0, 0, 0, 1.25f, 0, 0, 1.25f, 0, -2.75f, 0, 0, -2.75f)
			.setRotationPoint(148.75f, -21.5f, -10).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 91, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0.25f, -0.75f, -1, 0.25f, -0.75f, -1, 0.5f, -3.25f, 0, 0.5f, -3.25f, 0, 0, -3.75f, 0, 0, -3.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(148.75f, -23, 4).setRotationAngle(0, 0, 0).setName("Box 145cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 162, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, -1.75f, 0, -0.25f, -1.75f, 0, -0.25f, -1, 0, -0.25f, -1, 0, 0, -2.75f, 0.75f, 0, -2.75f, 0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(148.75f, -22.25f, 6).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 297, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.25f, -1.75f, -0.25f, -0.25f, -1.75f, -0.25f, -0.25f, -1, 0, -0.25f, -1, 0, 0, -2.75f, 1.25f, 0, -2.75f, 1.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(148.75f, -21.5f, 7).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 306, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 2, 3, 0, 0, -0.5f, -2, -0.25f, -0.5f, -2, -0.25f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -2.75f, 0, 0, -2.75f)
			.setRotationPoint(75, -22.5f, -10).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 149, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 1, 4, 0, 0, 0.5f, -3.25f, -0.25f, 0.5f, -3.25f, -0.25f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -3.75f, 0, 0, -3.75f)
			.setRotationPoint(75, -23, -8).setRotationAngle(0, 0, 0).setName("Box 145cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 2, 2, 0, 0, 0, -1.75f, -0.25f, 0, -1.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -1, 0, 0, -1)
			.setRotationPoint(75, -20.5f, -11.75f).setRotationAngle(0, 0, 0).setName("Box 151cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 310, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 2, 3, 0, 0, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -2, 0, -0.5f, -2, 0, 0, -2.75f, -0.25f, 0, -2.75f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(75, -22.5f, 7).setRotationAngle(0, 0, 0).setName("Box 143cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 153, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 1, 4, 0, 0, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f, 0.5f, -3.25f, 0, 0.5f, -3.25f, 0, 0, -3.75f, -0.25f, 0, -3.75f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(75, -23, 4).setRotationAngle(0, 0, 0).setName("Box 145cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 74, 2, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.75f, 0, 0, -1.75f, 0, 0, -1, -0.25f, 0, -1, -0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(75, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 151cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 151, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 10, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(142.75f, -24, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 475, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 10, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(142.75f, -23.5f, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 449, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 3, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(142.75f, -23.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 485, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(142.75f, -22, -9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 301, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(142.75f, -20.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 466, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 5, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(142.75f, -23.5f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 449, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(142.75f, -22, 7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 496, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(142.75f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.75f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 59, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(83.75f, -20.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 74, textureX, textureY, cargo1)
			.addShapeBox(0, 0, 0, 59, 16, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.75f, -18.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 254, 55, textureX, textureY, cargo2)
			.addShapeBox(0, 0, 0, 59, 2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(83.75f, -20.5f, -9.75f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 123, 55, textureX, textureY, cargo3)
			.addShapeBox(0, 0, 0, 59, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 2, 0, -0.5f, 2, 0, -0.5f, 1.5f, 0, -0.5f, 1.5f)
			.setRotationPoint(83.75f, -22, -7.75f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 53, textureX, textureY, cargo4)
			.addShapeBox(0, 0, 0, 59, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 2.75f, 0, 0.25f, 2.75f, 0, 0.25f, 2.75f, 0, 0.25f, 2.75f)
			.setRotationPoint(83.75f, -23.25f, -5).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 335, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(81.75f, -24, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 307, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(75, -24, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 405, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 10, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(75, -23.5f, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 232, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(75, -23.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 135, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(75, -22, -9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 104, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(75, -20.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 125, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(75, -23.5f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 70, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.5f, 0, 0, -1.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(75, -22, 7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 59, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, 0, -2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(75, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 282, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 10, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(81.75f, -23.5f, -5).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 198, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 3, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(81.75f, -23.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 189, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(81.75f, -22, -9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 182, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(81.75f, -20.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 171, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(81.75f, -23.5f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 162, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(81.75f, -22, 7.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 138, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(81.75f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 497, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, -2, 0, 0, -2, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(75.5f, -20.5f, 9.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 258, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -2, 0, 0.25f, -2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(75.5f, -20.5f, -10.75f).setRotationAngle(0, 0, 0).setName("Box 147cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 87, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(81.75f, -23.5f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 158cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 490, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(81.75f, -23.5f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 158cp")
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 201, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 100, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83, -18.5f, -11.05f).setRotationAngle(0, 0, 0)
		);
		T1_CTC_Tender.add(new ModelRendererTurbo(T1_CTC_Tender, 0, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 100, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83, -18.5f, 11.05f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(T1_CTC_Tender);
	}

}
