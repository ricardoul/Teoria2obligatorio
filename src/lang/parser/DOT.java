package lang.parser;

import java.util.ArrayList;
import java.util.Map;

public class DOT extends QOPERATION {

	public DOT(Expression e1) {
		super(e1);
		eval();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toStringEval() {
		return "DOT [qobjects=" + qobjects + ", qattributes=" + qattributes + "]";
	}

	public void eval() {// Por cada elemento del objeto crea un nuevo objeto con
						// tag key y valor value
		qattributes = new ArrayList();
		if (e1 == null) {
			qobjects = new ArrayList();
			qattributes = new ArrayList();
			return;
		}
		ArrayList<QObject> eElements = e1.getQobjects();
		for (QObject qobjt : eElements) {
			Map<String, Object> mapa = qobjt.getAttributes();
			if (mapa != null) {
				for (String key : mapa.keySet()) {
					qattributes.add(new QAttribute(key, mapa.get(key)));
				}
			}
		}
		qobjects = new ArrayList();
	}

	@Override
	public String toString() {
		return e1.toString() + ".";
	}

}
