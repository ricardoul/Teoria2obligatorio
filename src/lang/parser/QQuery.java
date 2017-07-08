package lang.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QQuery {
	public static ArrayList<?>  actualContext;
	
	public static  ArrayList slash(){
		ArrayList<Object> result = new ArrayList();
		for(Object exp:actualContext){
			try{
				result.addAll(((QObject)exp).getElements());
			}catch(Exception e){
			   //No tiene elementos
			}
		}
		setActualContext(result);
		return result;
	}
	
	public static ArrayList filterByTag(Object expression){
		ArrayList<Object> result = new ArrayList();
		if(actualContext == null){
			return new ArrayList<Object>();
		}
		for (Object obj: actualContext){
			if(obj instanceof QObject){
				if(((QObject) obj).getTag().equals(tag)){
					result.add(obj);
				}
			}else{
				
			}
		}
		setActualContext(result);
		return result;
	}
	
	public static ArrayList filterByRegex(Object expression){
		if(actualContext == null){
			return new ArrayList<Object>();
		}
		ArrayList<Object> response = new ArrayList();
		for(Object obj : actualContext){
			if(obj instanceof QObject){
				
				if(testTagRegex(((QObject) obj).getTag(), regex)){
					response.add(obj);
				}
			}
		}
		return response;
	}
	
	public static Boolean testTagRegex(String regex){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(tag);
		if (matcher.find()) {
		   return true;
		} else {
		   return false;
		}
	}
	
	public static void setActualContext(Object context){
		
		actualContext = (ArrayList<?>) context;
	}
	
	public static List dot(){
		ArrayList<Object> result = new ArrayList();
		for(Object o: actualContext){
			result.add(((QObject) o).getAttributes());
		}
		setActualContext(result);
		return result;
	}
	
	public static List intersect(List A, List B) {
	    List rtnList = new ArrayList<>();
	    for(Object dto : A) {
	        if(B.contains(dto)) {
	            rtnList.add(dto);
	        }
	    }
	    return rtnList;
	}
	
	public static List concat(String tag1, String tag2) {
		ArrayList<QObject> qobjectsA = filterByTag(tag1);
		ArrayList<QObject> qobjectsB = filterByTag(tag2);
		qobjectsA.addAll(qobjectsB);
		return qobjectsA;
	}
	
	public static List union(String tag1, String tag2) {
		ArrayList<QObject> qobjectsA = filterByTag(tag1);
		ArrayList<QObject> qobjectsB = filterByTag(tag2);
		qobjectsA.addAll(qobjectsB);
		return cleanRepeatedValues(qobjectsA);
	}
	
	public static List cleanRepeatedValues(ArrayList al){
		Set<Object> hs = new HashSet<>();
		hs.addAll(al);
		al.clear();
		al.addAll(hs);
		return al;
	}
	
	public static List difference(String tag1, String tag2) {
		ArrayList<QObject> qobjectsA = filterByTag(tag1);
		ArrayList<QObject> qobjectsB = filterByTag(tag2);
		qobjectsA.removeAll(qobjectsB);
		return qobjectsA;
	}
}
