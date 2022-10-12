/*
 * Jake Preble
 * Oct 11, 2022
 * RandomWalk
 */
import java.math.*;
public class RandomWalk {
    public static void main(String[] args) {
        int numOfSteps = 0;
        int avgSum = 0;
        int max = 0;
        for (int i = 1; i < 51; i++) {
            numOfSteps = randomWalk();
            avgSum += numOfSteps;
            if (numOfSteps > max) {
                max = numOfSteps;
            }
        }
        int avg = avgSum /= 50;
        System.out.println("Average steps taking is: " + avg);
        System.out.print("The greatest number of steps taken was " + max);
    }

    public static int randomWalk() {
        int pos = 0;
        int steps = 0;

        while (pos >= -3 && pos <= 3) {
            if ((int) (Math.random() * 2) == 0) {
                pos--;
            } else {
                pos++;
            }
            steps++;
            // System.out.print(pos + " ");
        }
        // System.out.println(steps);

        return steps;
    }
}
