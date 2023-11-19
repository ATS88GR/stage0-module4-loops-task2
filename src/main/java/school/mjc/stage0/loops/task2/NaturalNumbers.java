package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int startNum = 0;
        while (startNum <= lastPrinted) {
            System.out.println(startNum ++);
        }
    }
}
