package com.programs;

public class LeetCode875 {

    static int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1, maxSpeed = 0;
        for (int pile : piles)
            maxSpeed = Math.max(maxSpeed, pile);

        while (minSpeed < maxSpeed) {
            int midSpeed = (minSpeed + (maxSpeed - minSpeed)) / 2;
            if (isSpeedMaximum(piles, midSpeed)) maxSpeed = midSpeed;
            else minSpeed = midSpeed + 1;

        }
        return minSpeed;
    }

    static boolean isSpeedMaximum(int[] piles, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += (int) Math.ceil((double) pile / h);
        }
        return hours <= h;
    }
}
