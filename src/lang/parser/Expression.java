package lang.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
	
	@Override
	public String toString() {
			String res = "";
			if(qobjects != null){
				for(QObject qs: qobjects){
					res+=qs.toString();
				}
			}
			if(qattributes != null){
				for(QAttribute qa: qattributes){
					res+=qa.toString();
				}
			}
		return  res ;
	}
	

	ArrayList<QObject> qobjects;
	ArrayList<QAttribute> qattributes;
	
	public Expression(){
		qobjects = new ArrayList<QObject>();
		qattributes = new ArrayList<QAttribute>();
	}
	
	
	public Expression(ArrayList<QObject> qobjects, ArrayList<QAttribute> qattributes) {
		super();
		this.qobjects = qobjects;
		this.qattributes = qattributes;
	}
	
	public Expression(QObject qobject) {
		super();
		this.qobjects = new ArrayList();
		qobjects.add(qobject);
		this.qattributes = null;
	}


	public void setQobjects(ArrayList<QObject> qobjects) {
		this.qobjects = qobjects;
	}

	public void setQattributes(ArrayList<QAttribute> qattributes) {
		this.qattributes = qattributes;
	}
	
	public ArrayList<QObject> getQobjects() {
		return qobjects;
	}
	
	public ArrayList<QAttribute> getQattributes() {
		return qattributes;
	}
	
	public void addQobjects(QObject qobject) {
		qobjects.add(qobject);
	}
	
	public String toStringEval() {
		return "Expression [qobjects=" + qobjects + ", qattributes=" + qattributes + "]";
	}



	
}
