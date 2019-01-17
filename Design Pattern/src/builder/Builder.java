/**
 *
 */
package builder;

/**
 * @author yuyc
 *
 */
public interface Builder {
    void name(String name);
    void age(Integer age);
    void hobby(String hobby);

    People getResult();
}
