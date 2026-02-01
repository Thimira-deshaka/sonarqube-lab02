package main.java.com.example;

import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        if (calc != null) {
            logger.info(String.valueOf(calc.calculate(10, 5, "add-again")));
        }
        UserService service = new UserService();
        if (service != null) {
            service.findUser("admin");
            service.deleteUser("admin");
        }
    }
}
