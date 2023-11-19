package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int startNum = 0;
        if (multiplyByAndToInclusive > 0) {
            while (startNum <= multiplyByAndToInclusive)
                System.out.println(startNum++ * multiplyByAndToInclusive);
        } else if (multiplyByAndToInclusive < 0) {
            while (startNum <= -multiplyByAndToInclusive)
                System.out.println(startNum++ * multiplyByAndToInclusive);
        }

    }
}
