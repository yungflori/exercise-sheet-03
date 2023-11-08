/**
 * Amores Valderas, Luis Miguel
 * Schneyinck, Floris
 * PSE Gruppe 17
 */
//hi luis
//heute ist es hoffentlich sonnig
package de.unistuttgart.iste.sqa.pse.sheet03.homework;

import de.hamstersimulator.objectsfirst.external.model.Hamster;

/**
 *
 * A control unit to control hamsters.
 *
 * A HamsterController knows some behavioural patterns for hamsters and makes
 * given hamsters act according to those patterns.
 *
 * @author Sarah Stieß
 *
 */
public class HamsterController {

	/*@
	@ requires hamster != null;
	@ ensures !hamster.grainAvailable();
	@*/
	/**
	 * Pick all grains on the hamster's tile.
	 *
	 * @param hamster The hamster that picks the grains.
	 */
	void pickAllGrains(Hamster hamster) {
		hamster.write("Executing pickAllGrains:");
		Integer counter = 0;
		while (hamster.grainAvailable()) {
			hamster.pickGrain();
			counter++;
		}
		hamster.write(String.format("%d available grains on my Tile. I picked all of them!", counter));
	}

	/*@
	@ requires hamster != null;
	@ ensures hamster.mouthEmpty();
	@*/
	/**
	 * Put all of the hamster's grain on the current tile.
	 *
	 * @param hamster The hamster that puts the grains.
	 */
	void putAllGrains(Hamster hamster) {
		hamster.write("Executing putAllGrains:");
		Integer counter = 0;
		while (!hamster.mouthEmpty()) {
			hamster.putGrain();
			counter++;
		}
		hamster.write(String.format("I had %d grains in my mouth. I put all of them on my Tile!", counter));
	}

	/**
	 * makes hamster move in a half circle
	 *
	 * @param hamster The hamster that performs a half circle
	 */
	void performHalfCircle(Hamster hamster) {
		hamster.write("Executing performHalfCircle:");
		hamster.turnLeft();
		hamster.move();
		hamster.turnLeft();
		hamster.write("I ran a half circle!");
	}

	/**
	 * makes the hamster pick all the grains in front of it while
	 * moving as long as front is clear
	 *
	 * @param hamster The hamster that moves and picks grains
	 */
	void pickGrainsMoving(Hamster hamster) {
		hamster.write("Executing pickGrainsMoving:");
		while (hamster.frontIsClear()) {
			pickAllGrains(hamster);
			hamster.move();
		}
		hamster.write("I picked all grains, on the tile behind me!");
	}

	/**
	 * makes the hamster execute a series of left turns
	 * and prints a String
	 *
	 * @param hamster The hamster to perform turns with
	 * @param turns   The number of left turns to perform
	 */
	void turnCounter(Hamster hamster, Integer turns) {
		hamster.write("Executing turnCounter:");
		for (Integer i = 0; i < turns; i++) {
			hamster.turnLeft();
		}
		hamster.write(String.format("I turned %d times!", turns));
	}


	/**
	 * makes the hamster move forward long when possible and produces
	 * a string with how many of the steps was able to produce
	 *
	 * @param hamster The hamster to perform steps with
	 * @param steps   The number of forward steps to perform
	 */
	void stepCounter(Hamster hamster, Integer steps) {
		hamster.write("Executing stepCounter:");
		Integer counter = 0;
		for (; counter < steps && hamster.frontIsClear(); counter++) {
			hamster.move();
		}
		hamster.write(String.format("I moved %d out of %d steps!", counter, steps));
	}
	}
