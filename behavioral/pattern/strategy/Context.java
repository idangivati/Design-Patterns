package behavioral.pattern.strategy;


public class Context {
    private Strategy strategy;
    public Context() {
        this.strategy = new Addition();
    }


    public void choiceToStrategy(String choice, float a, float b) {
        switch (choice) {
            case "1" -> {
                this.strategy = new Addition();
                System.out.println("Addition result: " + strategy.calculation(a, b));
            }
            case "2" -> {
                this.strategy = new Multiplication();
                System.out.println("Multiplication result: " + strategy.calculation(a, b));
            }
            case "3" -> {
                this.strategy = new Subtraction();
                System.out.println("Subtraction result: " + strategy.calculation(a, b));
            }
            default -> System.out.println("not a valid option");
        }
    }
}
