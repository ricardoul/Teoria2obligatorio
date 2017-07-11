package lang.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QObject {
	String tag;
	Map<String,Object> attributes = new HashMap<String,Object>();
	ArrayList<QObject> elements;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((elements == null) ? 0 : elements.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QObject other = (QObject) obj;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (elements == null) {
			if (other.elements != null)
				return false;
		} else if (!elements.equals(other.elements))
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		return true;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
			this.attributes = attributes;
	}

	public ArrayList<QObject> getElements() {
		return elements;
	}

	public void addElements(ArrayList<QObject> elements) {
		this.elements.addAll(elements);
	}
	
	public void addAttributes(Map<String, Object>  attributes) {
		if(attributes != null){
			System.out.println("attr"+attributes + "" +"this attr"+ this.attributes);
			this.attributes.putAll(attributes);
		}
	}
	
	public void setElements(ArrayList<QObject> elements) {
		this.elements = elements;
	}
	public QObject(){
		super();
	}
	public QObject(String tag, Map<String, Object> attributes, ArrayList<QObject> elements) {
		super();
		this.tag = tag;
		this.attributes = attributes;
		this.elements = elements;
	}

	public String toStringEval() {
		return "QObject [tag=" + tag + ", at=" + attributes + ", el=" + elements + "]";
	}
	public String toString() {
		System.out.println("entro"+ this.attributes.keySet());
		String res = tag+"(";
		if(elements != null){
			for(QObject qs: elements){
				res+=qs.toString()+",";
			}
		}
		String aux = "";
		if(attributes != null){
			for(String qa: attributes.keySet()){
				aux+=qa.toString()+":"+attributes.get(qa).toString()+",";
			}
			if(aux.length() >0){
				aux = aux.substring(0, aux.length()-1);
			}
		}else{
			if(res.length() >0){
				res =res.substring(0, res.length()-1);
			}
		}
		if(res.length()>0 && aux.length() == 0){
			System.out.println("mira res"+res);
			String res2= res.substring(res.length()-1, res.length());
			if(res2.equals(",")){
				res = res.substring(0, res.length()-1);
			}
		}
		

		
		return res+aux+")";
	}

}
