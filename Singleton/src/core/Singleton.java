/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author 20191bsi0077
 */
public class Singleton {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Using traditional singleton");
		SerialNumberGeneratorTraditional generator = SerialNumberGeneratorTraditional.getInstance();

		System.out.println("Next serial: " + generator.getNextSerial());
		System.out.println("Next serial: " + generator.getNextSerial());
		System.out.println("Next serial: " + generator.getNextSerial());
	}
}
