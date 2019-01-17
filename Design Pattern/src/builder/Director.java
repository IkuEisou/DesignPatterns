/**
 *
 */
package builder;

/**
 * @author yuyc
 *
 */
public class Director {
	private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    void construct() {
        builder.name("Tom");
        builder.age(12);
        builder.hobby("BaseBall");
    }
}
