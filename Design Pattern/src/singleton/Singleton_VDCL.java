/**
 *
 */
package singleton;

/**
 * @author yuyc
 *
 */
public class Singleton_VDCL {
    private static volatile Singleton_VDCL singleton = null;

    private Singleton_VDCL() {
    	System.out.println("Singleton_VDCL has been created!");
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Singleton_VDCL getInstance() {
        // Volatileによって、原子性が保証される
        if (singleton == null) {
            synchronized (Singleton_VDCL.class) {
                if (singleton == null) {
                    singleton = new Singleton_VDCL();
                }
            }
        }

        return singleton;
    }
}
