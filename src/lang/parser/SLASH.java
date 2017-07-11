package lang.parser;

import java.util.ArrayList;

public class SLASH extends QOPERATION {
	
	public SLASH(Expression e1) {
		super(e1);
		eval();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toStringEval() {
		return "SLASH [qobjects=" + qobjects + ", qattributes=" + qattributes + "]";
	}

	@Override
	public void eval(){//Devuelve todos los elementos de los elementos de la Expression
		if(e1 == null){
			qobjects = new ArrayList();
			qattributes = new ArrayList();
			return;
		}
		ArrayList<QObject> eElements = e1.getQobjects();
		for(QObject qobjt: eElements){
			if(qobjt.getElements() != null && !(qobjt.getElements().isEmpty())){
				qobjects.addAll(qobjt.getElements());
			}			
		}
	}
	
	@Override
	public String toString() {
		return e1.toString() + "/" ;
	}

	

	


}
