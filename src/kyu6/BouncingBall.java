package kyu6;

public class BouncingBall {
    public static void main(String[] args) {
        System.out.println(bouncingBall(3.0, 0.66, 1.5)); //3
        System.out.println(bouncingBall(30.0, 0.66, 1.5)); //15
        System.out.println(bouncingBall(2.0, 0.5, 1.0)); //1
    }

    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }
        double tempH = h;
        int bounces = 0;
        while (tempH > window) {
            bounces++;
            if (tempH * bounce > window) {
                bounces++;
            }
            tempH = tempH * bounce;
        }
        return bounces;
    }
}

