package DP.adapter;
import java.util.Random;
public class EnemyTank implements EnemyAttacker {

Random generator = new Random();

	public void fireWeapon() {
		int atkDmg = generator.nextInt(10) + 1;
		System.out.println("Enemy tank deals " + atkDmg + " damage!");
		}

	public void driveForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy tank moves " + movement + " spaces!");
	}

	public void assignDriver(String driverName) {
		System.out.println(driverName + " is driving the tank!");
	}

}
