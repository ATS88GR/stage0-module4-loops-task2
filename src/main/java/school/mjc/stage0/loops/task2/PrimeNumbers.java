package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive >= 2)
            System.out.println(2);
        int tempNum = 3;
        while (tempNum < printToInclusive) {
            int count = 2;
            int sumCount = 0;
            while (count <= Math.sqrt(tempNum)) {
                if (tempNum % count++ == 0) {
                    sumCount++;
                    break;
                }
            }
            if (sumCount == 0) System.out.println(tempNum);
            tempNum++;
        }
    }
}
