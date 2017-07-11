package lang.parser;

public class ROOT  extends QOPERATION{
	
	public  void eval(){
		qobjects = e1.getQobjects();
		qattributes = e1.getQattributes();
	}
	
	
	public ROOT(Expression e1) {
		super(e1);
		eval();
	}

	@Override
	public String toString() {
		return "$";
	}

	@Override
	public String toStringEval() {
		return "ROOT [qobjects=" + qobjects + ", qattributes=" + qattributes + "]";
	}

	

}
