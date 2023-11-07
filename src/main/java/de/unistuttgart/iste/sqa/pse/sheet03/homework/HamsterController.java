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

	// TODO replace this comment with JavaDoc
	void helper0(Hamster hamster) {
		hamster.write("Executing helper0:");
		hamster.turnLeft();
		hamster.move();
		hamster.turnLeft();
		hamster.write("I ran a half circle!");
	}

	// TODO replace this comment with JavaDoc
	void helper1(Hamster hamster) {
		hamster.write("Executing helper1:");
		while (hamster.frontIsClear()) {
			pickAllGrains(hamster);
			hamster.move();
		}
		hamster.write("I picked all grains, on the tile behind me!");
	}

	// TODO replace this comment with JavaDoc
	void helper2(Hamster hamster, Integer turns) {
		hamster.write("Executing helper3:");
		for (Integer i = 0; i < turns; i++) {
			hamster.turnLeft();
		}
		hamster.write(String.format("I turned %d times!", turns));
	}

	// TODO replace this comment with JavaDoc
	void helper3(Hamster hamster, Integer steps) {
		hamster.write("Executing helper4:");
		Integer counter = 0;
		for (; counter < steps && hamster.frontIsClear(); counter++) {
			hamster.move();
		}
		hamster.write(String.format("I moved %d out of %d steps!", counter, steps));
	}
}
