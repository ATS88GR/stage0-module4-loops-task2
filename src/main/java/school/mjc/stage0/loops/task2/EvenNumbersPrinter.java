package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int startNum = 0;
        while (startNum <= printTillInclusive) {
            System.out.println(startNum);
            startNum +=2;
        }
    }
}
