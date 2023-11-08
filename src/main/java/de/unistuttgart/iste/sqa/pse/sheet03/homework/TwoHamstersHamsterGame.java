package de.unistuttgart.iste.sqa.pse.sheet03.homework;

/**
 * Two Hamsters prepare for winter. They will move through the territory
 * and collect all grains to reunite after.
 *
 * @author (Amores, Schneyinck)
 * @version (08.11.2023)
 */
public class TwoHamstersHamsterGame extends InternalTwoHamstersHamsterGame {

	@Override
	void hamsterRun() {
		controller.pickGrainsMoving(paule);
		controller.turnCounter(paule, 3);
		controller.pickGrainsMoving(paule);
		controller.turnCounter(paule, 3);
		controller.pickGrainsMoving(paule);
		controller.turnCounter(paule, 1);
		controller.pickAllGrains(paule);
		controller.performHalfCircle(paule);
		controller.stepCounter(paule,1);
		controller.pickAllGrains(paule);
		controller.turnCounter(paule, 2);
		controller.stepCounter(paule,1);
		controller.turnCounter(paule, 1);
		controller.stepCounter(paule, 2);
		controller.putAllGrains(paule);

		controller.stepCounter(paula, 1);
		controller.pickAllGrains(paula);
		controller.turnCounter(paula,1 );
		controller.pickGrainsMoving(paula);
		controller.turnCounter(paula, 3);
		controller.pickGrainsMoving(paula);
		controller.pickAllGrains(paula);
		controller.turnCounter(paula, 3);
		controller.stepCounter(paula, 3);
		controller.putAllGrains(paula);



	}
}
