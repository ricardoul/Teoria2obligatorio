package lang.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CONCAT extends QOPERATION {
	
	public CONCAT(Expression e1, Expression e2) {
		super(e1, e2);
		eval();
	}
	
	@Override
	public String toStringEval() {
		return "CONCAT [qobjects=" + qobjects + ", qattributes=" + qattributes + "]";
	}
	@Override
	public void eval() {//Contatena dos expresiones con repeticion
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
		Set<QAttribute> hsa = new HashSet<>();
		hsa.addAll(qattributes);
		ArrayList<QAttribute> ala = new ArrayList();
		ala.clear();
		ala.addAll(hsa);
		qattributes = ala;
		Set<QObject> hso = new HashSet<>();
		ArrayList<QObject> alo = new ArrayList();
		hso.addAll(qobjects);
		alo.clear();
		alo.addAll(hso);
		qobjects = alo;
		}

	@Override
	public String toString() {
		return e1.toString() + "+" + e2.toString();
	}


	

}
