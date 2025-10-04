package oops;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "cannot input 8 or 9";
    }
}

class CannotDivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "cannot divide by 0";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input can't be greater than 100000";
    }
}

class MaxMultiplyInputException extends Exception {
    @Override
    public String toString() {
        return "Input can't be greater than 7000 while multiplying";
    }
}

class CustomCalc {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a == 8 || a == 9 || b == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a + b;
    }

    double subtract(double a, double b) throws InvalidInputException, MaxInputException {
        if (a == 8 || a == 9 || b == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    double multiply(double a, double b) throws InvalidInputException, MaxInputException, MaxMultiplyInputException {
        if (a == 8 || a == 9 || b == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        } else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    double divide(double a, double b) throws CannotDivideByZeroException, InvalidInputException, MaxInputException {
        if (a == 8 || a == 9 || b == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class CustomCalculator {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException {
        /*
        Exercise: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input exception. ex: 8 & 9
        2. Cannot divide by 0 exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier reached Exception - Don't allow any multiplication input to be greater than 7000
         */

        CustomCalc c = new CustomCalc();
//        System.out.println(c.add(7,8));
//        System.out.println(c.divide(7,0));
//        System.out.println(c.add(2, 1000000));
        System.out.println(c.multiply(3, 8300));
    }
}