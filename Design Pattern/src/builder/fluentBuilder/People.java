/**
 *
 */
package builder.fluentBuilder;

import java.util.function.Consumer;

/**
 * @author yuyc
 *
 */
public class People {
    private People() {
    }

    private String name;
    private Integer age;
    private String hobby;

    People name(String name) {
        this.name = name;
        return this;
    }
    People age(Integer age) {
        this.age = age;
        return this;
    }
    People hobby(String hobby) {
        this.hobby = hobby;
        return this;
    }

   static String hello(final Consumer<People> builder) {
        People people = new People();
        builder.accept(people);
        if (people.name == null || people.age == null) {
            throw new NullPointerException();
        }
        return "[Name:" + people.name + ", Age:" + people.age + ", Hobby:" + people.hobby + "]";
    }
}
