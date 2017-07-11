package lang.parser;

import java.util.ArrayList;

public abstract class QOPERATION extends Expression {
		
		ArrayList<QObject> qobjects = new ArrayList<QObject>();
		ArrayList<QAttribute> qattributes = new ArrayList<QAttribute>();
		Expression e1 = null;
		Expression e2 = null;

		
		public abstract void eval();
		
		public ArrayList<QObject> getQobjects() {
			return qobjects;
		}
		public void setQobjects(ArrayList<QObject> qobjects) {
			this.qobjects = qobjects;
		}
		public ArrayList<QAttribute> getQattributes() {
			return qattributes;
		}
		public void setQattributes(ArrayList<QAttribute> qattributes) {
			this.qattributes = qattributes;
		}
		public Expression getE1() {
			return e1;
		}
		public void setE1(Expression e1) {
			this.e1 = e1;
		}
		public Expression getE2() {
			return e2;
		}
		public void setE2(Expression e2) {
			this.e2 = e2;
		}
		public QOPERATION(Expression e1, Expression e2) {
			super();
			this.e1 = e1;
			this.e2 = e2;
		}
		public QOPERATION(Expression e1) {
			super();
			this.e1 = e1;
		}
		public QOPERATION() {
			super();
		}

		
	}

