import java.util.*;

public class _0874_Walking_Robot_Simulation {
    public static int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obstaclesSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstaclesSet.add(obstacle[0] + "," + obstacle[1]);
        }
        char currentDirection = 'N';
        int currentX = 0;
        int currentY = 0;
        int result = 0;
        for (int command : commands) {
            if (command != -1 && command != -2) {
                for (int i = 0 ; i < command ; i++) {
                    if (currentDirection == 'N') {
                        if (hasNoObstacle(currentX, currentY + 1, obstaclesSet)) {
                            currentY++;
                        }
                    } else if (currentDirection == 'E') {
                        if (hasNoObstacle(currentX + 1, currentY, obstaclesSet)) {
                            currentX++;
                        }
                    } else if (currentDirection == 'S') {
                        if (hasNoObstacle(currentX, currentY - 1, obstaclesSet)) {
                            currentY--;
                        }
                    } else {
                        if (hasNoObstacle(currentX - 1, currentY, obstaclesSet)) {
                            currentX--;
                        }
                    }
                }
                result = Math.max(result, currentX * currentX + currentY * currentY);
            } else {
                currentDirection = setDirection(command, currentDirection);
            }
        }

        return result;
    }

    private static boolean hasNoObstacle(int x, int y, Set<String> obstaclesSet) {
        return !obstaclesSet.contains(x + "," + y);
    }

    private static char setDirection(int command, char currentDirection) {
        char newDirection = 0;
        if (command == -2) {
            switch (currentDirection) {
                case 'N':
                    newDirection = 'W';
                    break;
                case 'W':
                    newDirection = 'S';
                    break;
                case 'S':
                    newDirection = 'E';
                    break;
                case 'E':
                    newDirection = 'N';
                    break;
            }
        } else if (command == -1){
            switch (currentDirection) {
                case 'N':
                    newDirection = 'E';
                    break;
                case 'W':
                    newDirection = 'N';
                    break;
                case 'S':
                    newDirection = 'W';
                    break;
                case 'E':
                    newDirection = 'S';
                    break;
            }
        }
        return newDirection;
    }

    public static void main(String[] args) {
        int[] commands1 = {4, -1, 3};
        int[][] obstacles1 = {};
        System.out.println(robotSim(commands1, obstacles1));

        int[] commands2 = {4, -1, 4, -2, 4};
        int[][] obstacles2 = {{2, 4}};
        System.out.println(robotSim(commands2, obstacles2));
    }
}
