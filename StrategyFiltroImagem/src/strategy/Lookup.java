/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import java.awt.image.BufferedImageOp;
import java.awt.image.ByteLookupTable;
import java.awt.image.LookupOp;

/**
 *
 * @author cristhian
 */
public class Lookup extends Strategy {

	@Override
	public  BufferedImageOp applyFilter() {
		byte lut[] = new byte[256];
		for (int j = 0; j < 256; j++) {
			lut[j] = (byte) (256 - j);
		}

		ByteLookupTable blut = new ByteLookupTable(0, lut);
		return new LookupOp(blut, null);
	}
}
