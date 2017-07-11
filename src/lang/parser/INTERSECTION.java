package lang.parser;

import java.util.ArrayList;

public class INTERSECTION  extends QOPERATION{
	
	public INTERSECTION(Expression e1, Expression e2) {
		super(e1, e2);
		eval();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toStringEval() {
		return "INTERSECTION [qobjects=" + qobjects + ", qattributes=" + qattributes + "]";
	}

	public void eval(){//Devuelve la interseccion
		if(e1 == null || e2 == null){
			qobjects = new ArrayList();
			qattributes = new ArrayList();
			return;
		}
		ArrayList<QObject> e1Elements = e1.getQobjects();
		ArrayList<QAttribute> e1Attributes = e1.getQattributes();
		ArrayList<QObject> e2Elements = e2.getQobjects();
		ArrayList<QAttribute> e2Attributes = e2.getQattributes();
		e1Elements.retainAll(e2Elements);
		qobjects.addAll(e1Elements);
		e1Attributes.retainAll(e2Attributes);
		qattributes.addAll(e1Attributes);
	}
	
	@Override
	public String toString() {
		return e1.toString() + "∩" + e2.toString();
	}	

}
