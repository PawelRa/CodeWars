// You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red,
// and then to green again.
// Complete the function that takes a string as an argument representing the current state of the light and returns a string representing
// the state the light should change to.
// For example, when the input is green, output should be yellow.


package kyu8;

public class TrafficLights {
    public static void main(String[] args) {
        System.out.println(updateLight("red"));
        System.out.println(updateLight("green"));
        System.out.println(updateLight("yellow"));
    }

    public static String updateLight(String current) {
        if (current == "red") {
            return "green";
        } else if (current == "green") {
            return "yellow";
        } else {
            return "red";
        }
    }
}
