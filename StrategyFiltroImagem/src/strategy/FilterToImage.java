/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import java.awt.image.BufferedImageOp;
	
/**
 *
 * @author cristhian
 */
public class FilterToImage {
	Strategy filter;
	
	public FilterToImage(Strategy filter){
		this.filter = filter;
	}
	
	public BufferedImageOp setFilter(){
		return this.filter.applyFilter();
	}
}
