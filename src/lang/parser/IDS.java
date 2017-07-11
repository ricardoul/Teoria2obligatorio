package lang.parser;

import java.util.ArrayList;

public class IDS extends QOPERATION {
	
	public IDS(Expression e1, String tag) {
		super(e1);
		this.tag = tag;
		eval();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toStringEval() {
		return "IDS [qobjects=" + qobjects + ", qattributes=" + qattributes + "]";
	}

	String tag;
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public void eval(){//Dado tag trae todos los objetos que cumplen con ese tag
		if(e1 == null){
			qobjects = new ArrayList();
			qattributes = new ArrayList();
			return;
		}
		ArrayList<QObject> eElements = e1.getQobjects();
		if(eElements != null){
			for(QObject qobjt: eElements){
				if(qobjt.getTag().equals(tag)){
					qobjects.add(qobjt);
				}
			}
		}else{
			qobjects = new ArrayList();
		}
		ArrayList<QAttribute> eAttributes = e1.getQattributes();
		if(eAttributes != null){
			for(QAttribute qatrbt: eAttributes){
				if(qatrbt.getTag().equals(tag)){
					qattributes.add(qatrbt);
				}
			}
		}else{
			qattributes = new ArrayList();
		}
	}
	
	@Override
	public String toString() {
		if(e1 != null && e1.toString().length()>0){
			System.out.println(e1+ "e1");
			if(!(e1.toString().trim().equals("$")) && !(e1.toString().substring(e1.toString().length()-1, e1.toString().length()).equals("/"))){
				return e1.toString().trim() +" "+ tag.toString().trim();
			}else{
				return e1.toString().trim() +""+ tag.toString().trim();
			}
		}else{
			return tag.toString();
		}
	}	

}
