package org.usfirst.frc.team86.robot.AutoPosition;

import org.usfirst.frc.team86.robot.AutoRobotFunctions;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Paths {
	private static int stateProgress = 0;
	
	// ------------------------------
	public static void RToRSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		switch (state) {
		case 0:// Go to row one
			SmartDashboard.putNumber("RToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][3], Map.keyPointsY[0], Map.keyPointsX[1][1], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1: // Go to row two
			SmartDashboard.putNumber("RToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[1][1], Map.keyPointsY[1], Map.keyPointsX[1][1], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 2: // Line Up for switch
			SmartDashboard.putNumber("RToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[1][1], Map.keyPointsY[2], Map.keyPointsX[2][1], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 3: // Get in placement position
			SmartDashboard.putNumber("RToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[2], Map.keyPointsX[2][1], Map.keyPointsY[3]);
			stateProgress++;
			break;
		case 4: // Place In scale
			SmartDashboard.putNumber("RToRSwitch State", state);
			AutoRobotFunctions.placeScale();
			stateProgress++;
			break;
		case 5:
			SmartDashboard.putString("What just happened:", "Right Switch");
			SmartDashboard.putNumber("RToRSwitch State", state);
			if (scale == 0) {
				RSwitchToLScale();
			} else {
				RSwitchToRScale();
			}
			stateProgress++;
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void RToLSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		switch (state) {
		case 0:// Go to row one
			SmartDashboard.putNumber("RToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][0], Map.keyPointsY[0], Map.keyPointsX[1][0], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1: // Go to right on row 1
			SmartDashboard.putNumber("RToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[1][0], Map.keyPointsY[1], Map.keyPointsX[1][1], Map.keyPointsY[1]);
			break;
		case 2: // Go to row two
			SmartDashboard.putNumber("RToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[1][1], Map.keyPointsY[1], Map.keyPointsX[1][1], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 3: // Line Up for switch
			SmartDashboard.putNumber("RToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[1][1], Map.keyPointsY[1], Map.keyPointsX[2][1], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 4: // Get in placement position
			SmartDashboard.putNumber("RToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[2], Map.keyPointsX[2][1], Map.keyPointsY[3]);
			stateProgress++;
			break;
		case 5: // Place In scale
			SmartDashboard.putNumber("RToLSwitch State", state);
			AutoRobotFunctions.placeScale();
			stateProgress++;
			break;
		case 6:
			SmartDashboard.putString("What just happened:", "Left Switch");
			SmartDashboard.putNumber("RToLSwitch State", state);
			if (scale == 0) {
				LSwitchToLScale();
			} else {
				LSwitchToRScale();
			}
			stateProgress++;
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void LToRSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		switch (state) {
		case 0:// Go to row one
			SmartDashboard.putNumber("LToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][3], Map.keyPointsY[0], Map.keyPointsX[1][1], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1: // Go to left on row 1
			SmartDashboard.putNumber("LToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[1][1], Map.keyPointsY[1], Map.keyPointsX[1][0], Map.keyPointsY[1]);
			break;
		case 2: // Go to row two
			SmartDashboard.putNumber("LToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[1][0], Map.keyPointsY[1], Map.keyPointsX[1][0], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 3: // Line Up for switch
			SmartDashboard.putNumber("LToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[1][0], Map.keyPointsY[1], Map.keyPointsX[2][0], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 4: // Get in placement position
			SmartDashboard.putNumber("LToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[2], Map.keyPointsX[2][0], Map.keyPointsY[3]);
			stateProgress++;
			break;
		case 5: // Place In scale
			SmartDashboard.putNumber("LToRSwitch State", state);
			AutoRobotFunctions.placeScale();
			stateProgress++;
			break;
		case 6:
			SmartDashboard.putString("What just happened:", "Right Switch");
			SmartDashboard.putNumber("LToRSwitch State", state);
			if (scale == 0) {
				RSwitchToLScale();
			} else {
				RSwitchToRScale();
			}
			stateProgress++;
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void LToLSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		switch (state) {
		case 0:// Go to row one
			SmartDashboard.putNumber("LToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][0], Map.keyPointsY[0], Map.keyPointsX[1][0], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1: // Go to row two
			SmartDashboard.putNumber("LToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[1][0], Map.keyPointsY[1], Map.keyPointsX[1][0], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 2: // Line Up for switch
			SmartDashboard.putNumber("LToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[1][0], Map.keyPointsY[2], Map.keyPointsX[2][0], Map.keyPointsY[2]);
			stateProgress++;
			break;
		case 3: // Get in placement position
			SmartDashboard.putNumber("LToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[2], Map.keyPointsX[2][0], Map.keyPointsY[3]);
			stateProgress++;
			break;
		case 4: // Place In scale
			SmartDashboard.putNumber("LToLSwitch State", state);
			AutoRobotFunctions.placeScale();
			stateProgress++;
			break;
		case 5:
			SmartDashboard.putString("What just happened:", "Left Switch");
			SmartDashboard.putNumber("LToLSwitch State", state);
			if (scale == 0) {
				LSwitchToLScale();
			} else {
				LSwitchToRScale();
			}
			stateProgress++;
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void IRToRSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		switch (state) {
		case 0:
			SmartDashboard.putNumber("IRToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[0][2], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1:
			SmartDashboard.putNumber("IRToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[1][1], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 2:
			SmartDashboard.putNumber("IRToRSwitch State", state);
			RToRSwitch((1 - state), scale);
			break;
		default:
			state = 0;
			break;
		}
	}

	public static void IRToLSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		switch (state) {
		case 0:
			SmartDashboard.putNumber("IRToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[0][2], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1:
			SmartDashboard.putNumber("IRToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[1][0], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 2:
			SmartDashboard.putNumber("IRToLSwitch State", state);
			LToLSwitch((1 - state), scale);
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void ILToRSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		switch (state) {
		case 0:
			SmartDashboard.putNumber("ILToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][1], Map.keyPointsY[0], Map.keyPointsX[0][1], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1:
			SmartDashboard.putNumber("ILToRSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][1], Map.keyPointsY[0], Map.keyPointsX[1][1], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 2:
			SmartDashboard.putNumber("ILToRSwitch State", state);
			RToRSwitch((1 - state), scale);
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void ILToLSwitch(int inputState, int scale) {
		int state = inputState + stateProgress;
		switch (state) {
		case 0:
			SmartDashboard.putNumber("ILToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[0][2], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 1:
			SmartDashboard.putNumber("ILToLSwitch State", state);
			MoveToPositions.moveTo(Map.keyPointsX[0][2], Map.keyPointsY[0], Map.keyPointsX[1][0], Map.keyPointsY[1]);
			stateProgress++;
			break;
		case 2:
			SmartDashboard.putNumber("ILToLSwitch State", state);
			LToLSwitch((1 - state), scale);
			break;
		default:
			state = 0;
			break;
		}

	}

	// -----------------------------------------------------------------------------------------
	public static void RSwitchToRScale() {
		int state = 0;
		switch (state) {
		case 0:// Go to row
			SmartDashboard.putNumber("RSwitchToRScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[3], Map.keyPointsX[2][1], Map.keyPointsY[2]);
			state++;
			break;
		case 1:// Align to scale
			SmartDashboard.putNumber("RSwitchToRScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[2], Map.keyPointsX[3][1], Map.keyPointsY[2]);
			state++;
			break;
		case 2:// Go to scale
			SmartDashboard.putNumber("RSwitchToRScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[3][1], Map.keyPointsY[2], Map.keyPointsX[3][1], Map.keyPointsY[4]);
			state++;
			break;
		case 3:
			SmartDashboard.putString("What just happened:", "Right Scale");
			SmartDashboard.putNumber("RSwitchToRScale State", state);
			AutoRobotFunctions.placeScale();
			break;
		default:
			state = 0;
			break;
		}
	}

	public static void RSwitchToLScale() {
		int state = 0;
		switch (state) {
		case 0:// Go to row
			SmartDashboard.putNumber("RSwitchToLScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[3], Map.keyPointsX[2][1], Map.keyPointsY[2]);
			state++;
			break;
		case 1:// Align to scale
			SmartDashboard.putNumber("RSwitchToLScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][1], Map.keyPointsY[2], Map.keyPointsX[3][0], Map.keyPointsY[2]);
			state++;
			break;
		case 2:// Go to scale
			SmartDashboard.putNumber("RSwitchToLScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[3][0], Map.keyPointsY[2], Map.keyPointsX[3][0], Map.keyPointsY[4]);
			state++;
			break;
		case 3:
			SmartDashboard.putString("What just happened:", "Left Scale");
			SmartDashboard.putNumber("RSwitchToLScale State", state);
			AutoRobotFunctions.placeScale();
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void LSwitchToRScale() {
		int state = 0;
		switch (state) {
		case 0:// Go to row
			SmartDashboard.putNumber("LSwitchToRScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[3], Map.keyPointsX[2][0], Map.keyPointsY[2]);
			state++;
			break;
		case 1:// Align to scale
			SmartDashboard.putNumber("LSwitchToRScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[2], Map.keyPointsX[3][1], Map.keyPointsY[2]);
			state++;
			break;
		case 2:// Go to scale
			SmartDashboard.putNumber("LSwitchToRScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[3][1], Map.keyPointsY[2], Map.keyPointsX[3][1], Map.keyPointsY[4]);
			state++;
			break;
		case 3:
			SmartDashboard.putString("What just happened:", "Right Scale");
			SmartDashboard.putNumber("LSwitchToRScale State", state);
			AutoRobotFunctions.placeScale();
			break;
		default:
			state = 0;
			break;
		}

	}

	public static void LSwitchToLScale() {
		int state = 0;
		switch (state) {
		case 0:// Go to row
			SmartDashboard.putNumber("LSwitchToLScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[3], Map.keyPointsX[2][0], Map.keyPointsY[2]);
			state++;
			break;
		case 1:// Align to scale
			SmartDashboard.putNumber("LSwitchToLScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[2][0], Map.keyPointsY[2], Map.keyPointsX[3][0], Map.keyPointsY[2]);
			state++;
			break;
		case 2:// Go to scale
			SmartDashboard.putNumber("LSwitchToLScale State", state);
			MoveToPositions.moveTo(Map.keyPointsX[3][0], Map.keyPointsY[2], Map.keyPointsX[3][0], Map.keyPointsY[4]);
			state++;
			break;
		case 3:
			SmartDashboard.putString("What just happened:", "Left Scale");
			SmartDashboard.putNumber("LSwitchToLScale State", state);
			AutoRobotFunctions.placeScale();
			break;
		default:
			state = 0;
			break;
		}
	}

}
