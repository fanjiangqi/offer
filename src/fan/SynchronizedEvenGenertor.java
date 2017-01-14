package fan;

/**
 * Created by fanjiangqi on 2017/1/5.
 */
public class SynchronizedEvenGenertor extends IntGenerator{
    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenertor());
    }
}
