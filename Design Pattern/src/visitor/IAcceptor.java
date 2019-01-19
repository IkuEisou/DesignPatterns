/**
 * 
 */
package visitor;

/**
 * @author yongcongyu
 *
 */
public interface IAcceptor {
	default void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	void report();
}
