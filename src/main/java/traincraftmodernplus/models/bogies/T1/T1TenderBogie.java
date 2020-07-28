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
public class T1TenderBogie extends RollingStockModel {

	public T1TenderBogie(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Broscolotos");
		//
		initGroup_Tender_Truck_F0();
		initGroup_Tender_Truck_F1();
	}

	private final void initGroup_Tender_Truck_F0(){
		TurboList Tender_Truck_F = new TurboList("Tender_Truck_F");
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 332, 122, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 10, 30, 1, 1, 0, null)
			.setRotationPoint(116.5f, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 329, 122, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 10, 30, 1, 1, 0, null)
			.setRotationPoint(107.5f, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 508, 119, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 10, 30, 1, 1, 0, null)
			.setRotationPoint(98.5f, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 299, 111, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 10, 30, 1, 1, 0, null)
			.setRotationPoint(89.5f, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 428, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(95, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 217, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(85, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 314, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(104, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 198, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(113, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 236, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(95, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 179, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(85, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 121, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(104, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 393, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(113, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 488, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(121, 2, 4).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 472, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(121, 2, -6.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 457, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(84, 2, 4).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 437, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(84, 2, -6.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 148, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(102, 2, -6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 241, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(111.5f, 2, -6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 52, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(93.5f, 2, -6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 284, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(102, 2, 1).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 423, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0.09375f, 0, 0, 0.09375f, 0, -1, -0.75f, 0, -0.65625f, -0.75f, 0, 0, 0.09375f, 0, 0, 0.09375f, 0, -1, -0.75f, 0, -0.65625f)
			.setRotationPoint(101.75f, 2, -0.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 418, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(103, 2, -0.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 413, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(101.5f, 2, -0.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 357, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.09375f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.65625f, 0.09375f, 0, -1, 0.09375f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.65625f, 0.09375f, 0, -1)
			.setRotationPoint(103.25f, 2, -0.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 352, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.65625f, 0.09375f, 0, -1, 0.09375f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.65625f, 0.09375f, 0, -1, 0.09375f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(101.75f, 2, -0.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 347, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.09375f, 0, -1, -0.75f, 0, -0.65625f, -0.75f, 0, 0, 0.09375f, 0, 0, 0.09375f, 0, -1, -0.75f, 0, -0.65625f, -0.75f, 0, 0, 0.09375f, 0, 0)
			.setRotationPoint(103.25f, 2, -0.5f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 506, 78, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 1.0E-15f, 2, 20, 5, 1, 1, 5, null)
			.setRotationPoint(121, 2, -6).setRotationAngle(0, 90, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 506, 71, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 1.0E-15f, 2, 20, 5, 1, 1, 5, null)
			.setRotationPoint(121, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 506, 64, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 1.0E-15f, 2, 20, 5, 1, 1, 5, null)
			.setRotationPoint(85, 2, 6).setRotationAngle(0, 270, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 506, 57, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 1.0E-15f, 2, 20, 5, 1, 1, 5, null)
			.setRotationPoint(85, 2, -6).setRotationAngle(0, 180, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 146, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(111, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 331, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(111, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 302, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(112, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 463, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(102, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 272, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(102, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 186, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(103, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 456, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(93, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 159, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(93, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 154, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(94, 2, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 223, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(111, 3.5f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 134, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0)
			.setRotationPoint(111, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 115, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(112, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 216, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(102, 3.5f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 98, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0)
			.setRotationPoint(102, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 93, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(103, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 209, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(93, 3.5f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 47, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0.5f, 0)
			.setRotationPoint(93, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 39, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(94, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 499, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(86.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 24, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(86.25f, 5, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 19, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(86.25f, 4.25f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 14, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(86.25f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 9, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(86.25f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 492, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(86.75f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 483, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(91.75f, 5, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 469, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(91.75f, 4.25f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 454, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(91.75f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 434, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(91.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 485, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(90.25f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 478, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(90.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 471, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(88.25f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 282, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.375f, 4.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 342, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(88.8125f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 326, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(89.6875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 297, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(89.9375f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 292, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(88.5625f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 287, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(88.875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 282, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(89.1875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 277, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(89.125f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 267, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(89.0625f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 262, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(89, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 257, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(88.9375f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 239, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(90.75f, 4.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 175, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(88, 4.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 170, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(88.875f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 139, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(88, 4.375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 103, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(90, 4.375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 83, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(88.625f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 78, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(89.375f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 73, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(88.4375f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 68, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(88.0625f, 4.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 34, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(89.9375f, 4.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 4, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(89.5625f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 499, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(89.8125f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 494, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(88.1875f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 478, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(89.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 464, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(88.25f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 402, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(85, 2, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 429, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(85, 2.25f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 337, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(120.75f, 2.25f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 252, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(95.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 321, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(95.25f, 5, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 316, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(95.25f, 4.25f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 311, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(95.25f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 306, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(95.25f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 140, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(95.75f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 248, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(100.75f, 5, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 182, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(100.75f, 4.25f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 165, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(100.75f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 130, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(100.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 133, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(99.25f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 126, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(99.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 119, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(97.25f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 112, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(97.375f, 4.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 125, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(97.8125f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 120, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(98.6875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 89, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(98.9375f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 52, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(97.5625f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 43, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(97.875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 29, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(98.1875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 504, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(98.125f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 489, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(98.0625f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 473, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(98, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 459, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(97.9375f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 449, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(99.75f, 4.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 444, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(97, 4.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 439, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(97.875f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 418, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(97, 4.375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 413, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(99, 4.375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 356, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(97.625f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 351, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(98.375f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 332, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(97.4375f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 273, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(97.0625f, 4.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 253, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(98.9375f, 4.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 187, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(98.5625f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 160, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(98.8125f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 155, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(97.1875f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 135, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(98.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 115, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(97.25f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 105, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(104.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 110, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(104.25f, 5, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 99, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(104.25f, 4.25f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 94, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(104.25f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 64, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(104.25f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 98, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(104.75f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 59, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(109.75f, 5, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 24, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(109.75f, 4.25f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 14, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(109.75f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(109.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 91, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(108.25f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 84, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(108.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 77, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(106.25f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 70, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(106.375f, 4.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 484, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(106.8125f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 454, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(107.6875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 434, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(107.9375f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 404, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(106.5625f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 365, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(106.875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 327, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(107.1875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 296, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(107.125f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 291, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(107.0625f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 286, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(107, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 281, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(106.9375f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 150, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(108.75f, 4.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 145, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(106, 4.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 140, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(106.875f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 105, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(106, 4.375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 85, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(108, 4.375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 80, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(106.625f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 75, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(107.375f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 70, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(106.4375f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 48, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(106.0625f, 4.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 39, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(107.9375f, 4.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 34, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(107.5625f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 479, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(107.8125f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 469, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(106.1875f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 464, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(107.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 429, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(106.25f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 63, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(113.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 424, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(113.25f, 5, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 399, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(113.25f, 4.25f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 391, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(113.25f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 379, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(113.25f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 56, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(113.75f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 346, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(118.75f, 5, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 341, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(118.75f, 4.25f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 336, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(118.75f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 322, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(118.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 49, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(117.25f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 42, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(117.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 35, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(115.25f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 28, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(115.375f, 4.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 317, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(115.8125f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 312, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(116.6875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 307, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(116.9375f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 249, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(115.5625f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 183, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(115.875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 166, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(116.1875f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 121, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(116.125f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 90, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(116.0625f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 55, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(116, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 29, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(115.9375f, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 19, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(117.75f, 4.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 9, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(115, 4.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 489, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(115.875f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 474, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(115, 4.375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 459, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(117, 4.375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 438, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(115.625f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 419, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(116.375f, 3.75f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 414, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(115.4375f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 409, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(115.0625f, 4.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 374, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(116.9375f, 4.1875f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 369, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(116.5625f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 361, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(116.8125f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 356, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(115.1875f, 3.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 351, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(116.75f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 233, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(115.25f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 302, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(94.25f, 4.125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 228, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(94.75f, 7.125f, 5.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 268, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(101.75f, 4.125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 223, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(101.25f, 7.125f, 5.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 263, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(103.25f, 4.125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 218, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(103.75f, 7.125f, 5.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 258, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(110.75f, 4.125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 205, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(110.25f, 7.125f, 5.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 244, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(112.25f, 4.125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 200, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(112.75f, 7.125f, 5.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 239, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(119.75f, 4.125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 189, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(119.25f, 7.125f, 5.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 178, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(90.75f, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 173, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(88, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 161, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(88.875f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 156, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(88, 4.375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 136, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(90, 4.375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 116, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(88.625f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(89.375f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 96, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(88.4375f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 66, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(88.0625f, 4.1875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 61, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(89.9375f, 4.1875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 44, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(89.5625f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 24, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(89.8125f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 14, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(88.1875f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 402, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(85, 2, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 4, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(85, 2.25f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 505, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(120.75f, 2.25f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 500, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(99.75f, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 495, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(97, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 484, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(97.875f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 404, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(97, 4.375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 395, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(99, 4.375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 326, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(97.625f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 297, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(98.375f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 292, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(97.4375f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 287, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(97.0625f, 4.1875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 282, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(98.9375f, 4.1875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 151, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(98.5625f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 146, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(98.8125f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 141, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(97.1875f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 131, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(108.75f, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 126, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(106, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 106, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(106.875f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 86, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(106, 4.375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 81, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(108, 4.375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 76, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(106.625f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 71, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(107.375f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 51, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(106.4375f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 34, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(106.0625f, 4.1875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 479, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(107.9375f, 4.1875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 470, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(107.5625f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 465, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(107.8125f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 455, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(106.1875f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 450, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(117.75f, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 445, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(115, 4.625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 434, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(115.875f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 429, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, -0.0625f, 0, -0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(115, 4.375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 378, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6875f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.75f, -0.6875f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(117, 4.375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 365, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.0625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.0625f, -0.75f, 0, -0.6875f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(115.625f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 347, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.75f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, -0.75f, -0.75f, -0.75f)
			.setRotationPoint(116.375f, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 342, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.625f, 0, -0.8125f, -0.75f, 0, -0.8125f, -0.75f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(115.4375f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 337, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, -0.125f, 0, -0.75f, 0, -0.8125f, 0, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, -0.8125f, -0.75f)
			.setRotationPoint(115.0625f, 4.1875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 321, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.75f, -0.625f, 0, -0.75f, -0.75f, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, -0.75f, -0.75f, -0.8125f, -0.75f)
			.setRotationPoint(116.9375f, 4.1875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 316, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f, -0.75f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.8125f, -0.75f, -0.75f)
			.setRotationPoint(116.5625f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 311, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, 0, 0, -0.375f, 0, 0, -0.375f, -0.75f, -0.75f, -0.125f, -0.75f, -0.75f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, -0.75f, -0.625f, -0.75f)
			.setRotationPoint(116.8125f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 306, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(115.1875f, 3.8125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 21, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(86.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 195, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(86.25f, 5, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 185, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(86.25f, 4.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 169, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(86.25f, 4.5f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 121, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(86.25f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 14, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(86.75f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 101, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(91.75f, 5, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 92, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(91.75f, 4.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 57, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(91.75f, 4.5f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 29, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(91.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 7, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(90.25f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(90.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 440, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(88.25f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 433, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(88.375f, 4.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(88.8125f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(89.6875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(89.9375f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 491, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(88.5625f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 419, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(88.875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 414, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(89.1875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 409, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(89.125f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 400, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(89.0625f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 391, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(89, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 373, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(88.9375f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 360, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(89.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 355, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(88.25f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 426, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(95.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 332, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(95.25f, 5, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 268, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(95.25f, 4.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 263, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(95.25f, 4.5f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 258, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(95.25f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 419, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(95.75f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 253, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(100.75f, 5, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 248, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(100.75f, 4.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 243, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(100.75f, 4.5f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 238, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(100.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 412, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(99.25f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 405, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(99.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 398, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(97.25f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 391, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(97.375f, 4.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 233, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(97.8125f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 228, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(98.6875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 223, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(98.9375f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 218, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(97.5625f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 205, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(97.875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 180, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(98.1875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 164, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(98.125f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 137, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(98.0625f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 116, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(98, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(97.9375f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 67, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(98.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 47, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(97.25f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 384, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(104.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 39, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(104.25f, 5, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 498, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(104.25f, 4.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 486, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(104.25f, 4.5f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 475, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(104.25f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 377, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(104.75f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 424, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(109.75f, 5, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 327, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(109.75f, 4.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 152, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(109.75f, 4.5f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 147, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(109.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 370, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(108.25f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 363, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(108.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 356, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(106.25f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 349, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(106.375f, 4.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 142, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(106.8125f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 132, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(107.6875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 127, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(107.9375f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 106, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(106.5625f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 97, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(106.875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(107.1875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 83, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(107.125f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 72, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(107.0625f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 34, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(107, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 25, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(106.9375f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 470, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(107.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 465, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(106.25f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 252, 111, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.15625f, 0.125f, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(107.5f, 7.125f, -7.921875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 197, 110, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.125f, 0, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(107.5f, 7.125f, -7.953125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 342, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(113.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 460, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, -0.375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.375f, -0.25f, -0.25f)
			.setRotationPoint(113.25f, 5, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 455, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, -0.25f, 0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.25f, -0.75f, -0.25f)
			.setRotationPoint(113.25f, 4.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 450, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0.25f, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(113.25f, 4.5f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 445, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 1.25f, 0, -0.25f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
			.setRotationPoint(113.25f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 335, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.875f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0, -0.875f, -0.25f)
			.setRotationPoint(113.75f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 440, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(118.75f, 5, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 435, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(118.75f, 4.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 430, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(118.75f, 4.5f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 405, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 1.25f, 0, 0, 1.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(118.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 328, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.5f, -0.75f, -0.25f)
			.setRotationPoint(117.25f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 321, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(117.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 501, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(115.25f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 309, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(115.375f, 4.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 396, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(115.8125f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 378, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(116.6875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 369, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.75f, -1, 0, -0.75f, -1, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(116.9375f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 364, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -1, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.25f, -1, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(115.5625f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 351, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(115.875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 346, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.4375f, -0.25f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(116.1875f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 341, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(116.125f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 336, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.875f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.875f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(116.0625f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 322, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.84375f, 0, -0.5f, -0.875f, 0, -0.5f, -0.875f, -0.25f, -0.4375f, -0.84375f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(116, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 317, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, -0.75f, 0, -0.5f, -0.84375f, 0, -0.5f, -0.84375f, -0.25f, -0.4375f, -0.75f, -0.25f, -0.4375f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.4375f, 0, -0.25f)
			.setRotationPoint(115.9375f, 3.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 312, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -1, -0.75f, -0.25f)
			.setRotationPoint(116.75f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 307, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(115.25f, 4, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 506, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 1.109375f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(116.5f, 6.5f, -7.734375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 134, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.984375f, 0.796875f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(116.5f, 6.5f, -7.859375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 200, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(85.25f, 4.125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 195, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(85.75f, 7.125f, -6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 190, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(92.75f, 4.125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 185, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(92.25f, 7.125f, -6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 175, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(94.25f, 4.125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 170, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(94.75f, 7.125f, -6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 159, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(101.75f, 4.125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 122, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(101.25f, 7.125f, -6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 62, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(103.25f, 4.125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(103.75f, 7.125f, -6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 15, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(110.75f, 4.125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(110.25f, 7.125f, -6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(112.25f, 4.125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(112.75f, 7.125f, -6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 504, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(119.75f, 4.125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 494, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(119.25f, 7.125f, -6.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 481, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.90625f, -0.5625f, -0.375f, -1.125f, -0.5625f, -0.375f, -1.125f, -0.375f, -0.5f, -0.90625f, -0.375f, -0.5f, -0.15625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.375f, -0.5f, -0.15625f, -0.375f)
			.setRotationPoint(119.625f, 5, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 420, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.5625f, -0.375f, 0.125f, -0.5625f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(119.625f, 5.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 415, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(119.5f, 5.28125f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 410, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(119.5f, 6.46875f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 391, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(119.5f, 6.15625f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 359, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(119.5f, 5.59375f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 331, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(119.5f, 5.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 205, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f)
			.setRotationPoint(119.5f, 6.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 180, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(119.5f, 6.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 165, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(119.5f, 5.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 138, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(119.5f, 6.46875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 117, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(119.5f, 6.15625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 112, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(119.5f, 5.59375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 93, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(119.5f, 5.28125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 508, 185, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 16, 0.625f, 0.625f, 4, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(103, 1.5f, 0).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 78, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(85.25f, 4.125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 68, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(85.75f, 7.125f, 5.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 53, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(92.75f, 4.125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 48, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f)
			.setRotationPoint(92.25f, 7.125f, 5.75f).setRotationAngle(0.125f, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 43, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.90625f, -0.5625f, -0.375f, -1.125f, -0.5625f, -0.375f, -1.125f, -0.375f, -0.5f, -0.90625f, -0.375f, -0.5f, -0.15625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.375f, -0.5f, -0.15625f, -0.375f)
			.setRotationPoint(119.625f, 5, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 38, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.5625f, -0.375f, 0.125f, -0.5625f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(119.625f, 5.5f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 30, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(119.5f, 5.28125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 499, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(119.5f, 6.46875f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 489, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(119.5f, 6.15625f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 476, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(119.5f, 5.59375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 401, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(119.5f, 5.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 374, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f)
			.setRotationPoint(119.5f, 6.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 155, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(119.5f, 6.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 150, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(119.5f, 5.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 145, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(119.5f, 6.46875f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 133, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(119.5f, 6.15625f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 128, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(119.5f, 5.59375f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 107, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(119.5f, 5.28125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 102, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.90625f, -0.5625f, -0.375f, -1.125f, -0.5625f, -0.375f, -1.125f, -0.375f, -0.5f, -0.90625f, -0.375f, -0.5f, -0.15625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.375f, -0.5f, -0.15625f, -0.375f)
			.setRotationPoint(110.625f, 5, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.5625f, -0.375f, 0.125f, -0.5625f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(110.625f, 5.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 83, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(110.5f, 5.28125f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 58, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(110.5f, 6.46875f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 25, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(110.5f, 6.15625f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 471, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(110.5f, 5.59375f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 466, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(110.5f, 5.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 461, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f)
			.setRotationPoint(110.5f, 6.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 456, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(110.5f, 6.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 451, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(110.5f, 5.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 446, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(110.5f, 6.46875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 441, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(110.5f, 6.15625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 436, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(110.5f, 5.59375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 431, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(110.5f, 5.28125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 426, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.90625f, -0.5625f, -0.375f, -1.125f, -0.5625f, -0.375f, -1.125f, -0.375f, -0.5f, -0.90625f, -0.375f, -0.5f, -0.15625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.375f, -0.5f, -0.15625f, -0.375f)
			.setRotationPoint(110.625f, 5, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 396, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.5625f, -0.375f, 0.125f, -0.5625f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(110.625f, 5.5f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 379, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(110.5f, 5.28125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 369, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(110.5f, 6.46875f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 364, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(110.5f, 6.15625f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 201, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(110.5f, 5.59375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 196, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(110.5f, 5.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 191, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f)
			.setRotationPoint(110.5f, 6.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 186, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(110.5f, 6.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 176, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(110.5f, 5.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 171, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(110.5f, 6.46875f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 161, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(110.5f, 6.15625f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 123, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(110.5f, 5.59375f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 97, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(110.5f, 5.28125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 73, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.90625f, -0.5625f, -0.375f, -1.125f, -0.5625f, -0.375f, -1.125f, -0.375f, -0.5f, -0.90625f, -0.375f, -0.5f, -0.15625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.375f, -0.5f, -0.15625f, -0.375f)
			.setRotationPoint(101.625f, 5, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 64, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.5625f, -0.375f, 0.125f, -0.5625f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(101.625f, 5.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 34, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(101.5f, 5.28125f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(101.5f, 6.46875f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 15, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(101.5f, 6.15625f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(101.5f, 5.59375f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(101.5f, 5.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 504, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f)
			.setRotationPoint(101.5f, 6.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 495, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(101.5f, 6.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 485, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(101.5f, 5.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 480, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(101.5f, 6.46875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 421, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(101.5f, 6.15625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 416, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(101.5f, 5.59375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 411, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(101.5f, 5.28125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 406, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.90625f, -0.5625f, -0.375f, -1.125f, -0.5625f, -0.375f, -1.125f, -0.375f, -0.5f, -0.90625f, -0.375f, -0.5f, -0.15625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.375f, -0.5f, -0.15625f, -0.375f)
			.setRotationPoint(101.625f, 5, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 391, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.5625f, -0.375f, 0.125f, -0.5625f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(101.625f, 5.5f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 208, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(101.5f, 5.28125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 181, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(101.5f, 6.46875f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 166, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(101.5f, 6.15625f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 141, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(101.5f, 5.59375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 118, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(101.5f, 5.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 113, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f)
			.setRotationPoint(101.5f, 6.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 92, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(101.5f, 6.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 54, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(101.5f, 5.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 49, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(101.5f, 6.46875f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 44, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(101.5f, 6.15625f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 39, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(101.5f, 5.59375f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 29, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(101.5f, 5.28125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.90625f, -0.5625f, -0.375f, -1.125f, -0.5625f, -0.375f, -1.125f, -0.375f, -0.5f, -0.90625f, -0.375f, -0.5f, -0.15625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.375f, -0.5f, -0.15625f, -0.375f)
			.setRotationPoint(92.625f, 5, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 490, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.5625f, -0.375f, 0.125f, -0.5625f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(92.625f, 5.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 475, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(92.5f, 5.28125f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 401, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(92.5f, 6.46875f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 360, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(92.5f, 6.15625f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 337, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(92.5f, 5.59375f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 331, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(92.5f, 5.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 152, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f)
			.setRotationPoint(92.5f, 6.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 147, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(92.5f, 6.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 136, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(92.5f, 5.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 131, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(92.5f, 6.46875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 108, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(92.5f, 6.15625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 103, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(92.5f, 5.59375f, -7).setRotationAngle(0, 0, 0)
		);
		this.groups.add(Tender_Truck_F);
	}

	private final void initGroup_Tender_Truck_F1(){
		TurboList Tender_Truck_F = new TurboList("Tender_Truck_F");
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 87, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(92.5f, 5.28125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 79, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.90625f, -0.5625f, -0.375f, -1.125f, -0.5625f, -0.375f, -1.125f, -0.375f, -0.5f, -0.90625f, -0.375f, -0.5f, -0.15625f, -0.5625f, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.375f, -0.5f, -0.15625f, -0.375f)
			.setRotationPoint(92.625f, 5, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 500, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.40625f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.40625f, -0.375f, -0.5f, 0.34375f, -0.5625f, -0.375f, 0.125f, -0.5625f, -0.375f, 0.125f, -0.375f, -0.5f, 0.34375f, -0.375f)
			.setRotationPoint(92.625f, 5.5f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 470, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(92.5f, 5.28125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 465, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.5625f, -0.375f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.5625f, -0.375f, -0.625f, -0.5625f, -0.375f, -0.625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(92.5f, 6.46875f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 460, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(92.5f, 6.15625f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 455, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(92.5f, 5.59375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 450, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(92.5f, 5.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 445, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5f, -0.671875f, -0.5625f, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.375f, -0.5f, -0.671875f, -0.375f)
			.setRotationPoint(92.5f, 6.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 440, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(92.5f, 6.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 435, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.5625f, -0.375f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.5625f, -0.375f, 0, -0.5625f, -0.375f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(92.5f, 5.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 430, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f)
			.setRotationPoint(92.5f, 6.46875f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 425, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f)
			.setRotationPoint(92.5f, 6.15625f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 396, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f)
			.setRotationPoint(92.5f, 5.59375f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 380, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f)
			.setRotationPoint(92.5f, 5.28125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 375, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, -1.125f, -0.5625f, -0.5f, -0.90625f, -0.5625f, -0.5f, -0.90625f, -0.375f, -0.375f, -1.125f, -0.375f, -0.375f, -0.375f, -0.5625f, -0.5f, -0.15625f, -0.5625f, -0.5f, -0.15625f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(112.375f, 5, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 370, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.40625f, -0.5625f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.5625f, -0.5f, 0.34375f, -0.5625f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(112.375f, 5.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 355, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(112.5f, 5.28125f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 350, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(112.5f, 6.46875f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 307, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(112.5f, 6.15625f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 287, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(112.5f, 5.59375f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 282, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(112.5f, 5.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 191, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(112.5f, 6.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 186, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(112.5f, 6.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 162, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(112.5f, 5.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 126, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f)
			.setRotationPoint(112.5f, 6.46875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 98, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f)
			.setRotationPoint(112.5f, 6.15625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 74, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f)
			.setRotationPoint(112.5f, 5.59375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 65, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f)
			.setRotationPoint(112.5f, 5.28125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 60, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, -1.125f, -0.5625f, -0.5f, -0.90625f, -0.5625f, -0.5f, -0.90625f, -0.375f, -0.375f, -1.125f, -0.375f, -0.375f, -0.375f, -0.5625f, -0.5f, -0.15625f, -0.5625f, -0.5f, -0.15625f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(112.375f, 5, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 25, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.40625f, -0.5625f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.5625f, -0.5f, 0.34375f, -0.5625f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(112.375f, 5.5f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(112.5f, 5.28125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 15, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(112.5f, 6.46875f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 10, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(112.5f, 6.15625f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(112.5f, 5.59375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(112.5f, 5.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 495, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(112.5f, 6.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 486, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(112.5f, 6.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 481, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(112.5f, 5.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 420, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f)
			.setRotationPoint(112.5f, 6.46875f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 410, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f)
			.setRotationPoint(112.5f, 6.15625f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 405, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f)
			.setRotationPoint(112.5f, 5.59375f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 391, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f)
			.setRotationPoint(112.5f, 5.28125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 365, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, -1.125f, -0.5625f, -0.5f, -0.90625f, -0.5625f, -0.5f, -0.90625f, -0.375f, -0.375f, -1.125f, -0.375f, -0.375f, -0.375f, -0.5625f, -0.5f, -0.15625f, -0.5625f, -0.5f, -0.15625f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(103.375f, 5, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 327, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.40625f, -0.5625f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.5625f, -0.5f, 0.34375f, -0.5625f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(103.375f, 5.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 322, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(103.5f, 5.28125f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 312, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(103.5f, 6.46875f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 302, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(103.5f, 6.15625f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 297, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(103.5f, 5.59375f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 143, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(103.5f, 5.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 121, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(103.5f, 6.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 116, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(103.5f, 6.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 93, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(103.5f, 5.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 55, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f)
			.setRotationPoint(103.5f, 6.46875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 50, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f)
			.setRotationPoint(103.5f, 6.15625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 45, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f)
			.setRotationPoint(103.5f, 5.59375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 40, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f)
			.setRotationPoint(103.5f, 5.28125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 35, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, -1.125f, -0.5625f, -0.5f, -0.90625f, -0.5625f, -0.5f, -0.90625f, -0.375f, -0.375f, -1.125f, -0.375f, -0.375f, -0.375f, -0.5625f, -0.5f, -0.15625f, -0.5625f, -0.5f, -0.15625f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(103.375f, 5, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 30, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.40625f, -0.5625f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.5625f, -0.5f, 0.34375f, -0.5625f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(103.375f, 5.5f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(103.5f, 5.28125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 476, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(103.5f, 6.46875f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 400, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(103.5f, 6.15625f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 360, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(103.5f, 5.59375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 338, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(103.5f, 5.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 182, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(103.5f, 6.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 154, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(103.5f, 6.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 149, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(103.5f, 5.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 138, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f)
			.setRotationPoint(103.5f, 6.46875f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 111, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f)
			.setRotationPoint(103.5f, 6.15625f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 106, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f)
			.setRotationPoint(103.5f, 5.59375f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f)
			.setRotationPoint(103.5f, 5.28125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 83, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, -1.125f, -0.5625f, -0.5f, -0.90625f, -0.5625f, -0.5f, -0.90625f, -0.375f, -0.375f, -1.125f, -0.375f, -0.375f, -0.375f, -0.5625f, -0.5f, -0.15625f, -0.5625f, -0.5f, -0.15625f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(94.375f, 5, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 78, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.40625f, -0.5625f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.5625f, -0.5f, 0.34375f, -0.5625f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(94.375f, 5.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 503, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(94.5f, 5.28125f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 491, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(94.5f, 6.46875f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 424, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(94.5f, 6.15625f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 395, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(94.5f, 5.59375f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 380, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(94.5f, 5.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 375, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(94.5f, 6.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 370, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(94.5f, 6.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 355, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(94.5f, 5.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 350, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f)
			.setRotationPoint(94.5f, 6.46875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 308, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f)
			.setRotationPoint(94.5f, 6.15625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 287, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f)
			.setRotationPoint(94.5f, 5.59375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 282, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f)
			.setRotationPoint(94.5f, 5.28125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 133, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, -1.125f, -0.5625f, -0.5f, -0.90625f, -0.5625f, -0.5f, -0.90625f, -0.375f, -0.375f, -1.125f, -0.375f, -0.375f, -0.375f, -0.5625f, -0.5f, -0.15625f, -0.5625f, -0.5f, -0.15625f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(94.375f, 5, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 128, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.40625f, -0.5625f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.5625f, -0.5f, 0.34375f, -0.5625f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(94.375f, 5.5f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 66, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(94.5f, 5.28125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 61, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(94.5f, 6.46875f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 9, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(94.5f, 6.15625f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 4, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(94.5f, 5.59375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 498, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(94.5f, 5.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 486, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(94.5f, 6.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 481, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(94.5f, 6.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 412, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(94.5f, 5.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 407, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f)
			.setRotationPoint(94.5f, 6.46875f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 365, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f)
			.setRotationPoint(94.5f, 6.15625f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 123, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f)
			.setRotationPoint(94.5f, 5.59375f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 118, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f)
			.setRotationPoint(94.5f, 5.28125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 101, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, -1.125f, -0.5625f, -0.5f, -0.90625f, -0.5625f, -0.5f, -0.90625f, -0.375f, -0.375f, -1.125f, -0.375f, -0.375f, -0.375f, -0.5625f, -0.5f, -0.15625f, -0.5625f, -0.5f, -0.15625f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(85.375f, 5, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 96, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.40625f, -0.5625f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.5625f, -0.5f, 0.34375f, -0.5625f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(85.375f, 5.5f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 74, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(85.5f, 5.28125f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 56, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(85.5f, 6.46875f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 51, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(85.5f, 6.15625f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 46, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(85.5f, 5.59375f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 41, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(85.5f, 5.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 36, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(85.5f, 6.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 31, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(85.5f, 6.15625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 476, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(85.5f, 5.59375f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 420, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f)
			.setRotationPoint(85.5f, 6.46875f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 391, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f)
			.setRotationPoint(85.5f, 6.15625f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 360, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f)
			.setRotationPoint(85.5f, 5.59375f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 338, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f)
			.setRotationPoint(85.5f, 5.28125f, -7).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 145, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, -1.125f, -0.5625f, -0.5f, -0.90625f, -0.5625f, -0.5f, -0.90625f, -0.375f, -0.375f, -1.125f, -0.375f, -0.375f, -0.375f, -0.5625f, -0.5f, -0.15625f, -0.5625f, -0.5f, -0.15625f, -0.375f, -0.375f, -0.375f, -0.375f)
			.setRotationPoint(85.375f, 5, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 113, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.40625f, -0.5625f, -0.5f, -0.40625f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, 0.125f, -0.5625f, -0.5f, 0.34375f, -0.5625f, -0.5f, 0.34375f, -0.375f, -0.375f, 0.125f, -0.375f)
			.setRotationPoint(85.375f, 5.5f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 108, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f)
			.setRotationPoint(85.5f, 5.28125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 81, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.5625f, -0.5625f, -0.125f, -0.375f, -0.375f, -0.125f, -0.375f, -0.375f, -0.625f, -0.5625f, -0.5f, -0.546875f, -0.5625f, -0.5f, -0.546875f, -0.375f, -0.375f, -0.625f, -0.375f)
			.setRotationPoint(85.5f, 6.46875f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 26, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(85.5f, 6.15625f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(85.5f, 5.59375f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 355, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(85.5f, 5.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 350, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.5625f, -0.5f, -0.671875f, -0.5625f, -0.5f, -0.671875f, -0.375f, -0.375f, -0.75f, -0.375f)
			.setRotationPoint(85.5f, 6.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 330, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f)
			.setRotationPoint(85.5f, 6.15625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 310, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.5625f, -0.578125f, -0.78125f, -0.375f, -0.375f, -0.78125f, -0.375f, -0.375f, 0, -0.5625f, -0.5625f, 0, -0.5625f, -0.5625f, 0, -0.375f, -0.375f, 0, -0.375f)
			.setRotationPoint(85.5f, 5.59375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 305, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f)
			.setRotationPoint(85.5f, 6.46875f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 499, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f)
			.setRotationPoint(85.5f, 6.15625f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 444, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.390625f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.578125f, -0.78125f, -0.375f, -0.390625f, -0.78125f, -0.375f, -0.40625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.5625f, 0, -0.375f, -0.40625f, 0, -0.375f)
			.setRotationPoint(85.5f, 5.59375f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 309, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.484375f, -0.5625f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.5f, -0.546875f, -0.375f, -0.484375f, -0.5625f, -0.375f, -0.40625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.5625f, -0.125f, -0.375f, -0.40625f, -0.125f, -0.375f)
			.setRotationPoint(85.5f, 5.28125f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 140, 74, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(98.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 480, 73, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 30, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(98.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 492, 30, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(98.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 441, 73, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(116.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 413, 70, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 30, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(116.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 477, 30, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(116.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 468, 107, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(116.5f, 6.5f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 73, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(107.5f, 6.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 153, 83, textureX, textureY).addCylinder(0, 0, 0, 2.8125f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(107.5f, 6.5f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 492, 20, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(107.5f, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 493, 68, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(116.5f, 6.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 480, 65, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 30, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(116.5f, 6.5f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 477, 20, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(116.5f, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 467, 65, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(107.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 140, 83, textureX, textureY).addCylinder(0, 0, 0, 2.8125f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(107.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 485, 10, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(107.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 454, 65, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(89.5f, 6.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 441, 65, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 30, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(89.5f, 6.5f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 470, 10, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(89.5f, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 428, 65, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(98.5f, 6.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 493, 60, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 30, 0.9375f, 0.9375f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(98.5f, 6.5f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 485, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(98.5f, 6.5f, -5).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 499, 40, textureX, textureY).addHollowCylinder(0, 0, 0, 3, 2.8125f, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.125))
			.setRotationPoint(89.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 454, 82, textureX, textureY).addCylinder(0, 0, 0, 2.8125f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(89.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 470, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 3.5f, 3, 1, 30, 0, 1, 1, 0, new Vec3f(0.0, 0.0, -0.875))
			.setRotationPoint(89.5f, 6.5f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 482, 98, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.15625f, 0.125f, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(98.5f, 7.125f, -7.921875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 466, 97, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.125f, 0, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(98.5f, 7.125f, -7.953125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 448, 95, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.15625f, 0.125f, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(89.5f, 7.125f, -7.921875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 462, 90, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.125f, 0, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(89.5f, 7.125f, -7.953125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 18, 89, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.15625f, 0.125f, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(116.5f, 7.125f, -7.921875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 340, 87, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.125f, 0, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(116.5f, 7.125f, -7.953125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 129, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 1.109375f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(98.5f, 6.5f, -7.734375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 5, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.984375f, 0.796875f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(98.5f, 6.5f, -7.859375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 53, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 1.109375f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(89.5f, 6.5f, -7.734375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 506, 49, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.984375f, 0.796875f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(89.5f, 6.5f, -7.859375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 36, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 1.109375f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(107.5f, 6.5f, -7.734375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 32, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.984375f, 0.796875f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(107.5f, 6.5f, -7.859375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 294, 119, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(95.75f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 205, 119, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(101.25f, 7.75f, -6.75f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 456, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(94.75f, 7.25f, -6.625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 454, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(94.75f, 7.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 452, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(94.75f, 6.375f, -6.703125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 201, 119, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(94.75f, 6.375f, -6.640625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 197, 119, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(94.75f, 6.375f, -6.359375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 317, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(94.75f, 6.375f, -6.34375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 268, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(94.75f, 6.375f, -6.65625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 264, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(94.75f, 6.375f, -6.671875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 179, 87, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(94.75f, 7.25f, -6.65625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 233, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(86.75f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 229, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(92.25f, 7.75f, -6.75f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 180, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(93.25f, 7.25f, -6.625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 176, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(93.25f, 7.25f, -6.375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 18, 86, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(93.25f, 7.25f, -6.65625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 450, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(93.25f, 6.375f, -6.703125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 172, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(93.25f, 6.375f, -6.640625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 168, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(93.25f, 6.375f, -6.359375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 164, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(93.25f, 6.375f, -6.34375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 160, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(93.25f, 6.375f, -6.65625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 156, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(93.25f, 6.375f, -6.671875f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 448, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(85.75f, 7.25f, -6.625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 446, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(85.75f, 7.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 444, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(85.75f, 6.375f, -6.703125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 152, 118, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(85.75f, 6.375f, -6.640625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 468, 117, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(85.75f, 6.375f, -6.359375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 464, 117, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(85.75f, 6.375f, -6.34375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 460, 117, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(85.75f, 6.375f, -6.65625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 456, 117, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(85.75f, 6.375f, -6.671875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 340, 84, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(85.75f, 7.25f, -6.65625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 225, 117, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(113.75f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 221, 117, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(119.25f, 7.75f, -6.75f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 217, 117, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(120.25f, 7.25f, -6.625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 213, 117, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(120.25f, 7.25f, -6.375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 179, 84, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(120.25f, 7.25f, -6.65625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 442, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(120.25f, 6.375f, -6.703125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 209, 117, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(120.25f, 6.375f, -6.640625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 148, 117, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(120.25f, 6.375f, -6.359375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 290, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(120.25f, 6.375f, -6.34375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 286, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(120.25f, 6.375f, -6.65625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 282, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(120.25f, 6.375f, -6.671875f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 440, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(112.75f, 7.25f, -6.625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 438, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(112.75f, 7.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 436, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(112.75f, 6.375f, -6.703125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 260, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(112.75f, 6.375f, -6.640625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 256, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(112.75f, 6.375f, -6.359375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 252, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(112.75f, 6.375f, -6.34375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 144, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(112.75f, 6.375f, -6.65625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 140, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(112.75f, 6.375f, -6.671875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 340, 81, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(112.75f, 7.25f, -6.65625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 136, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(104.75f, 7.75f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 132, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(110.25f, 7.75f, -6.75f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 128, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(111.25f, 7.25f, -6.625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 124, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(111.25f, 7.25f, -6.375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 179, 81, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(111.25f, 7.25f, -6.65625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 434, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(111.25f, 6.375f, -6.703125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 120, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(111.25f, 6.375f, -6.640625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 116, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(111.25f, 6.375f, -6.359375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 112, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(111.25f, 6.375f, -6.34375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 108, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(111.25f, 6.375f, -6.65625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 104, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(111.25f, 6.375f, -6.671875f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 432, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(103.75f, 7.25f, -6.625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 430, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(103.75f, 7.25f, -6.375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 428, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(103.75f, 6.375f, -6.703125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 100, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(103.75f, 6.375f, -6.640625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 96, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(103.75f, 6.375f, -6.359375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 92, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(103.75f, 6.375f, -6.34375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 88, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(103.75f, 6.375f, -6.65625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 84, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(103.75f, 6.375f, -6.671875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 340, 78, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(103.75f, 7.25f, -6.65625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 80, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(102.25f, 7.25f, -6.625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 76, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(102.25f, 7.25f, -6.375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 179, 78, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(102.25f, 7.25f, -6.65625f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 426, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(102.25f, 6.375f, -6.703125f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 72, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(102.25f, 6.375f, -6.640625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 68, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(102.25f, 6.375f, -6.359375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 64, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(102.25f, 6.375f, -6.34375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 60, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(102.25f, 6.375f, -6.65625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 56, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(102.25f, 6.375f, -6.671875f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 52, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(95.75f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 48, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(101.25f, 7.75f, 6).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 424, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(94.75f, 7.25f, 6.375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 422, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(94.75f, 7.25f, 6.125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 420, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(94.75f, 6.375f, 6.296875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 44, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(94.75f, 6.375f, 6.359375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 40, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(94.75f, 6.375f, 6.640625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 36, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(94.75f, 6.375f, 6.65625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 32, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(94.75f, 6.375f, 6.34375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 28, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(94.75f, 6.375f, 6.328125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 425, 65, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(94.75f, 7.25f, 6.09375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 24, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(86.75f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 20, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(92.25f, 7.75f, 6).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 16, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(93.25f, 7.25f, 6.375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 12, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(93.25f, 7.25f, 6.125f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 393, 65, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(93.25f, 7.25f, 6.09375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 418, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(93.25f, 6.375f, 6.296875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 8, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(93.25f, 6.375f, 6.359375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 4, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(93.25f, 6.375f, 6.640625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 0, 116, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(93.25f, 6.375f, 6.65625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 508, 115, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(93.25f, 6.375f, 6.34375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 313, 115, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(93.25f, 6.375f, 6.328125f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 416, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(85.75f, 7.25f, 6.375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 414, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(85.75f, 7.25f, 6.125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 412, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(85.75f, 6.375f, 6.296875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 309, 115, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(85.75f, 6.375f, 6.359375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 295, 115, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(85.75f, 6.375f, 6.640625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 205, 115, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(85.75f, 6.375f, 6.65625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 201, 115, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(85.75f, 6.375f, 6.34375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 197, 115, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(85.75f, 6.375f, 6.328125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 490, 60, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(85.75f, 7.25f, 6.09375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 317, 114, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(113.75f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 269, 114, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(119.25f, 7.75f, 6).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 265, 114, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(120.25f, 7.25f, 6.375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 234, 114, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(120.25f, 7.25f, 6.125f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 455, 60, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(120.25f, 7.25f, 6.09375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 410, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(120.25f, 6.375f, 6.296875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 230, 114, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(120.25f, 6.375f, 6.359375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 468, 113, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(120.25f, 6.375f, 6.640625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 464, 113, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(120.25f, 6.375f, 6.65625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 460, 113, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(120.25f, 6.375f, 6.34375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 456, 113, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(120.25f, 6.375f, 6.328125f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 408, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(112.75f, 7.25f, 6.375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 406, 41, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(112.75f, 7.25f, 6.125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 404, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(112.75f, 6.375f, 6.296875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 226, 113, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(112.75f, 6.375f, 6.359375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 222, 113, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(112.75f, 6.375f, 6.640625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 218, 113, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(112.75f, 6.375f, 6.65625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 214, 113, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(112.75f, 6.375f, 6.34375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 210, 113, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(112.75f, 6.375f, 6.328125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 423, 60, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(112.75f, 7.25f, 6.09375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 508, 111, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(104.75f, 7.75f, 6).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 313, 111, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 5, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.25))
			.setRotationPoint(110.25f, 7.75f, 6).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 309, 111, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(111.25f, 7.25f, 6.375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 295, 111, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(111.25f, 7.25f, 6.125f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 458, 58, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(111.25f, 7.25f, 6.09375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 402, 41, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(111.25f, 6.375f, 6.296875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 317, 110, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(111.25f, 6.375f, 6.359375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 269, 110, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(111.25f, 6.375f, 6.640625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 265, 110, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(111.25f, 6.375f, 6.65625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 235, 110, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(111.25f, 6.375f, 6.34375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 231, 110, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(111.25f, 6.375f, 6.328125f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 475, 38, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(103.75f, 7.25f, 6.375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 473, 38, textureX, textureY).addHollowCylinder(0, 0, 0, 0.125f, 1.0E-15f, 0.25f, 20, 10, 1, 1, 0, null)
			.setRotationPoint(103.75f, 7.25f, 6.125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 471, 38, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(103.75f, 6.375f, 6.296875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 178, 110, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(103.75f, 6.375f, 6.359375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 174, 110, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(103.75f, 6.375f, 6.640625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 498, 108, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(103.75f, 6.375f, 6.65625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 481, 107, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(103.75f, 6.375f, 6.34375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 317, 106, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(103.75f, 6.375f, 6.328125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 458, 55, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(103.75f, 7.25f, 6.09375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 269, 106, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(102.25f, 7.25f, 6.375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 265, 106, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.75))
			.setRotationPoint(102.25f, 7.25f, 6.125f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 455, 55, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.1875f, 0.1875f, 0, new Vec3f(0.0, 0.0, -0.4375))
			.setRotationPoint(102.25f, 7.25f, 6.09375f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 469, 38, textureX, textureY).addCylinder(0, 0, 0, 0.09375f, 0.40625f, 20, 1, 1, 0, null)
			.setRotationPoint(102.25f, 6.375f, 6.296875f).setRotationAngle(0, 0, -90)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 235, 106, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.71875))
			.setRotationPoint(102.25f, 6.375f, 6.359375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 231, 106, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.25f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(102.25f, 6.375f, 6.640625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 498, 104, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.15625f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(102.25f, 6.375f, 6.65625f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 178, 94, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.21875f, 0.25f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(102.25f, 6.375f, 6.34375f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 178, 90, textureX, textureY).addHollowCylinder(0, 0, 0, 0.5f, 1.0E-15f, 1, 20, 10, 0.15625f, 0.21875f, 0, new Vec3f(0.0, 0.0, -0.984375))
			.setRotationPoint(102.25f, 6.375f, 6.328125f).setRotationAngle(0, 0, 180)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 423, 55, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.125f, 0.15625f, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(89.5f, 7.125f, 5.96875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 458, 49, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0, 0.125f, 0, new Vec3f(0.0, 0.0, -0.96875))
			.setRotationPoint(89.5f, 7.125f, 6.96875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 28, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.984375f, 1.109375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(89.5f, 6.5f, 5.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 24, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.796875f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(89.5f, 6.5f, 5.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 305, 49, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.125f, 0.15625f, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(98.5f, 7.125f, 5.96875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 302, 49, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0, 0.125f, 0, new Vec3f(0.0, 0.0, -0.96875))
			.setRotationPoint(98.5f, 7.125f, 6.96875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 20, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.984375f, 1.109375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(98.5f, 6.5f, 5.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 16, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.796875f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(98.5f, 6.5f, 5.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 465, 46, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.125f, 0.15625f, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(107.5f, 7.125f, 5.96875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 309, 43, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0, 0.125f, 0, new Vec3f(0.0, 0.0, -0.96875))
			.setRotationPoint(107.5f, 7.125f, 6.96875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.984375f, 1.109375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(107.5f, 6.5f, 5.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.796875f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(107.5f, 6.5f, 5.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 306, 43, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0.125f, 0.15625f, 1, new Vec3f(0.0, 0.0, 0.96875))
			.setRotationPoint(116.5f, 7.125f, 5.96875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 153, 43, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 20, 0, 0.125f, 0, new Vec3f(0.0, 0.0, -0.96875))
			.setRotationPoint(116.5f, 7.125f, 6.96875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 4, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.984375f, 1.109375f, 1, new Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(116.5f, 6.5f, 5.875f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 507, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 20, 0.796875f, 0.984375f, 1, new Vec3f(0.0, 0.0, 0.9375))
			.setRotationPoint(116.5f, 6.5f, 5.9375f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 468, 107, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(107.5f, 6.5f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 468, 107, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(98.5f, 6.5f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 468, 107, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(89.5f, 6.5f, 5.625f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 468, 107, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(116.5f, 6.5f, -6.125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 468, 107, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(107.5f, 6.5f, -6.125f).setRotationAngle(0, 0, 0)
		);
		Tender_Truck_F.add(new ModelRendererTurbo(Tender_Truck_F, 468, 107, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 30, 1, 1, 0, new Vec3f(0.0, 0.0, -0.5))
			.setRotationPoint(98.5f, 6.5f, -6.125f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(Tender_Truck_F);
	}

}
