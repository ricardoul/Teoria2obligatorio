package lang.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
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


	public void setQobjects(ArrayList<QObject> qobjects) {
		this.qobjects = qobjects;
	}

	public void setQattributes(ArrayList<QAttribute> qattributes) {
		this.qattributes = qattributes;
	}

	public void concat(Expression e1, Expression e2) {//Contatena dos expresiones con repeticion
		ArrayList<QObject> e1Elements = e1.getQobjects();
		ArrayList<QAttribute> e1Attributes = e1.getQattributes();
		ArrayList<QObject> e2Elements = e2.getQobjects();
		ArrayList<QAttribute> e2Attributes = e2.getQattributes();
		if(!e1Elements.isEmpty()){
			qobjects.addAll(e1Elements);
			}
		if(!e2Elements.isEmpty()){
			qobjects.addAll(e2Elements);
			}
		if(!e1Attributes.isEmpty()){
			qattributes.addAll(e1Attributes);
			}
		if(!e2Attributes.isEmpty()){
			qattributes.addAll(e2Attributes);
			}
		}	
	public void union(Expression e1, Expression e2){//Concatena dos expresiones sin repeticion
		ArrayList<QObject> e1Elements = e1.getQobjects();
		ArrayList<QAttribute> e1Attributes = e1.getQattributes();
		ArrayList<QObject> e2Elements = e2.getQobjects();
		ArrayList<QAttribute> e2Attributes = e2.getQattributes();
		e2Elements.removeAll(e1Elements);
		qobjects.addAll(e1Elements);
		qobjects.addAll(e2Elements);		
		if(!e2Elements.isEmpty() && !e1Elements.isEmpty()){
			e2Elements.removeAll(e1Elements);
			qobjects.addAll(e1Elements);
			qobjects.addAll(e2Elements);
			}else{
				if(!e2Elements.isEmpty()){
					qobjects.addAll(e2Elements);
					}
				else if(!e1Elements.isEmpty()){
					qobjects.addAll(e1Elements);
				}
			}		
		if(!e2Attributes.isEmpty() && !e1Attributes.isEmpty()){
			e2Attributes.removeAll(e1Attributes);
			qattributes.addAll(e1Attributes);
			qattributes.addAll(e2Attributes);
			}else{
				if(!e2Elements.isEmpty()){
					qattributes.addAll(e2Attributes);
					}
				else if(!e1Attributes.isEmpty()){
					qattributes.addAll(e1Attributes);
				}
			}			
	}
	
	public void difference(Expression e1, Expression e2){//Remueve los elementos de e2 en e1
		ArrayList<QObject> e1Elements = e1.getQobjects();
		ArrayList<QAttribute> e1Attributes = e1.getQattributes();
		ArrayList<QObject> e2Elements = e2.getQobjects();
		ArrayList<QAttribute> e2Attributes = e2.getQattributes();		
		if(!e2Elements.isEmpty() && !e1Elements.isEmpty()){
			e1Elements.removeAll(e2Elements);
			qobjects.addAll(e1Elements);
			}else{
				if(!e1Elements.isEmpty()){
					qobjects.addAll(e1Elements);
				}
			}		
		if(!e2Attributes.isEmpty() && !e1Attributes.isEmpty()){
			e1Attributes.removeAll(e2Attributes);
			qattributes.addAll(e1Attributes);
			}else{
				if(!e1Attributes.isEmpty()){
					qattributes.addAll(e1Attributes);
				}
			}
	}
	
	public void intersect(Expression e1, Expression e2){//Devuelve la interseccion
		ArrayList<QObject> e1Elements = e1.getQobjects();
		ArrayList<QAttribute> e1Attributes = e1.getQattributes();
		ArrayList<QObject> e2Elements = e2.getQobjects();
		ArrayList<QAttribute> e2Attributes = e2.getQattributes();
		e1Elements.retainAll(e2Elements);
		qobjects.addAll(e1Elements);
		e1Attributes.retainAll(e2Attributes);
		qattributes.addAll(e1Attributes);
	}
	
	public void slash(Expression e){//Devuelve todos los elementos de los elementos de la Expression
		ArrayList<QObject> eElements = e.getQobjects();
		for(QObject qobjt: eElements){
			if(!qobjt.getElements().isEmpty()){
				qobjects.addAll(qobjt.getElements());
			}			
		}
	}
	
	public void dot(Expression e){//Por cada elemento del objeto crea un nuevo objeto con tag key y valor value
		ArrayList<QObject> eElements = e.getQobjects();
		for(QObject qobjt: eElements){
			Map<String,Object> mapa = qobjt.getAttributes();
			for(String key: mapa.keySet()){
				qattributes.add(new QAttribute(key,mapa.get(key)));
			}
		}
	}
	
	public void searchTag(Expression e,String tag){//Dado tag trae todos los objetos que cumplen con ese tag
		ArrayList<QObject> eElements = e.getQobjects();
		for(QObject qobjt: eElements){
			if(qobjt.getTag().equals(tag)){
				qobjects.add(qobjt);
			}
		}
		ArrayList<QAttribute> eAttributes = e.getQattributes();
		for(QAttribute qatrbt: eAttributes){
			if(qatrbt.getTag().equals(tag)){
				qattributes.add(qatrbt);
			}
		}
	}
	 
	public void searchRegex(Expression e,String regex){
		Pattern pat = Pattern.compile(regex);
		ArrayList<QObject> eElements = e.getQobjects();
		for(QObject qobjt: eElements){
			Matcher mat = pat.matcher(qobjt.getTag());
			if(mat.find()){
				qobjects.add(qobjt);
			}
		}
		ArrayList<QAttribute> eAttributes = e.getQattributes();
		for(QAttribute qatrbt: eAttributes){
			Matcher mat = pat.matcher(qatrbt.getTag());
			if(mat.find()){
				qattributes.add(qatrbt);
			}
		}
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

	
}
