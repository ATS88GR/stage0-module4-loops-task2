package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive == 0) System.out.println(1);
        else {
            System.out.println(1);
            int count = 1;
            int factorial = 1;
            while (count <= printToInclusive) {
                factorial *= count++;
                System.out.println(factorial);
            }
        }
    }
}
