/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        FizzBuzz game = new FizzBuzz();
        for(int i = 1; i < 100; i++) {
            game.fizzBuzz(i);

        }
    }
}