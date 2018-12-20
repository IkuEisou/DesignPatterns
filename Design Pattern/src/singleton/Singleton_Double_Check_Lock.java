/**
 *
 */
package singleton;

/**
 * @author yuyc
 *
 */
public class Singleton_Double_Check_Lock {
    private static Singleton_Double_Check_Lock singleton = null;

    private Singleton_Double_Check_Lock() {
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Singleton_Double_Check_Lock getInstance() {
        // 原子性によって、スレッドセーフではない
        if (singleton == null) {
            synchronized (Singleton_Double_Check_Lock.class) {
                if (singleton == null) {
                    singleton = new Singleton_Double_Check_Lock();
                }
            }
        }
        return singleton;
    }
}
