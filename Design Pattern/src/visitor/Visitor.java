/**
 * 
 */
package visitor;

/**
 * @author yongcongyu
 *
 */
public class Visitor implements IVisitor {

	/* (non-Javadoc)
	 * @see visitor.IVisitor#visit(visitor.Employee)
	 */
	@Override
	public void visit(IAcceptor acceptor) {
		acceptor.report();
	}

}
