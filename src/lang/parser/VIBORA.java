package lang.parser;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VIBORA extends QOPERATION{
	
	public VIBORA(Expression e1, String regex) {
		super(e1);
		this.regex = regex;
		eval();
	}
	
	@Override
	public String toStringEval() {
		return "VIBORA [qobjects=" + qobjects + ", qattributes=" + qattributes + "]";
	}

	String regex;
	
	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public void eval(){
		
		if(e1 == null){
			qobjects = new ArrayList();
			qattributes = new ArrayList();
			return;
		}
		System.out.println(regex);
		Pattern pat = Pattern.compile(regex);
		ArrayList<QObject> eElements = e1.getQobjects();
		if(eElements != null){
			for(QObject qobjt: eElements){
				System.out.println(pat);
				Matcher mat = pat.matcher(qobjt.getTag());
				if(mat.find()){
					System.out.println("es un match!");
					qobjects.add(qobjt);
				}
			}
		}else{
			qobjects = new ArrayList();
		}
		ArrayList<QAttribute> eAttributes = e1.getQattributes();
		if(eAttributes != null){
			for(QAttribute qatrbt: eAttributes){
				Matcher mat = pat.matcher(qatrbt.getTag());
				if(mat.find()){
					qattributes.add(qatrbt);
				}
			}
		}else{
			qattributes = new ArrayList();
		}
	}
	
	@Override
	public String toString() {
		if(regex.matches(("[{}a-zA-Z0-9_\\[]*]*"))){
			return e1.toString() +"~"+ regex.toString();
		}else{
			return e1.toString() +" ~"+ "'"+regex.toString()+ "'";
		}
	}	
	

}
