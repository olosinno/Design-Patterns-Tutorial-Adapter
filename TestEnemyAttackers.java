package DP.adapter;

public class TestEnemyAttackers {
	public static void main(String[] args) {
		EnemyTank mk1Tank = new EnemyTank();
		EnemyRobot frederator = new EnemyRobot();
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(frederator);

		System.out.println("The Robot");
		frederator.reactToHuman("Butch");
		frederator.walkForward();
		frederator.smashWithHands();
		
		System.out.println("The Enemy Tank");
		mk1Tank.assignDriver("Paul");
		mk1Tank.driveForward();
		mk1Tank.fireWeapon();

		System.out.println("The Robot w/ Adapter");
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
//		System.out.println()
	}
}
