package lang.parser;

import java.util.ArrayList;

public class DIFFERENCE extends QOPERATION {
	
	public DIFFERENCE(Expression e1, Expression e2) {
		super(e1, e2);
		eval();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toStringEval() {
		return "DIFFERENCE [qobjects=" + qobjects + ", qattributes=" + qattributes + "]";
	}

	public void eval(){//Remueve los elementos de e2 en e1
		ArrayList<QObject> e1Elements = e1.getQobjects();
		ArrayList<QAttribute> e1Attributes = e1.getQattributes();
		ArrayList<QObject> e2Elements = e2.getQobjects();
		ArrayList<QAttribute> e2Attributes = e2.getQattributes();		
		if(e1Elements != null){
			if(e2Elements != null){
				e1Elements.removeAll(e2Elements);
			}
			qobjects = e1Elements;
		}else{
			qobjects = new ArrayList();
		}
		
		if(e1Attributes != null){
			if(e2Attributes != null){
				e1Attributes.removeAll(e2Attributes);
			}
			qattributes = e1Attributes;
		}else{
			qattributes = new ArrayList();
		}		
	}
	
	@Override
	public String toString() {
		return e1.toString() + "-" + e2.toString();
	}	

}
