/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import static strategy.SaveImage.BLUR3x3;

/**
 *
 * @author cristhian
 */
public class LowPass extends Strategy {

	@Override
	public  BufferedImageOp applyFilter() {
		float[] data = BLUR3x3;
		return  new ConvolveOp(new Kernel(3, 3, data), ConvolveOp.EDGE_NO_OP,  null);
	}
	
}
