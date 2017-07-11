package lang.parser;

import java.util.ArrayList;

public class UNION extends QOPERATION{
	
	public UNION(Expression e1, Expression e2) {
		super(e1, e2);
		eval();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toStringEval() {
		return "UNION [qobjects=" + qobjects + ", qattributes=" + qattributes + "]";
	}

	public void eval(){//Concatena dos expresiones sin repeticion
		if(e1 == null || e2 == null){
			qobjects = new ArrayList();
			qattributes = new ArrayList();
			return;
		}

		ArrayList<QObject> e1Elements = e1.getQobjects();
		ArrayList<QAttribute> e1Attributes = e1.getQattributes();
		ArrayList<QObject> e2Elements = e2.getQobjects();
		ArrayList<QAttribute> e2Attributes = e2.getQattributes();
		if(e1Elements != null && !e1Elements.isEmpty()){
			qobjects.addAll(e1Elements);
			}
		if(e2Elements != null && !e2Elements.isEmpty()){
			qobjects.addAll(e2Elements);
			}
		if(e1Attributes != null && !e1Attributes.isEmpty()){
			qattributes.addAll(e1Attributes);
			}
		if(e2Attributes != null && !e2Attributes.isEmpty()){
			qattributes.addAll(e2Attributes);
			}

	}
	
	@Override
	public String toString() {
		return e1.toString() + "∪" + e2.toString();
	}
	
}
