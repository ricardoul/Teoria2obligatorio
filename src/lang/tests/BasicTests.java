package lang.tests;

import java.util.*;

import java_cup.runtime.Symbol;
import junit.framework.TestCase;
import lang.parser.Expression;
import lang.parser.Lexer;
import lang.parser.Parser;
import lang.parser.QOPERATION;
import lang.parser.QObject;
import lang.parser.Tokens;


public class BasicTests extends TestCase {
	
	
		
	  	protected void setUp() throws Exception{
		String input = "List(algo(id:\"a\",a:sist(id:∞)),algo2(id:\"a\",a:sist(id:1)))";
		//String input2 = "List(Company(id:1,name:\"Google\",Person(id: 1, name: \"Larry Page\"),Person(id: 2,name: \" Serguéi Brin\") ),Company( /* id, name at the end */ Person(id: 1,name: \"Lawrence J. Ellison\"),Person(id: 2, name: \"Bob Miner\"),Person(id: 3, name: \"Ed Oates\"), id: 2, name: \"Oracle\" ))";
		//showTokens(input);
		Expression qobj = (Expression) Parser.parseString(input);
	}
	
	public static void showTokens(String input) throws Exception {
	Lexer lexer = Parser.makeLexer(input);
	Symbol token = lexer.next_token();
	while (token.sym != Tokens.EOF) {
		System.out.println(token.sym +": "+ token.value);
		token = lexer.next_token();
	}
	System.out.println("FIN");
}

	public void testRandom1() throws Exception {
		String input = "List(algo(id:\"a\",a:sist(id:1)))";
		Expression qobj = (Expression) Parser.parseString(input);
		assertEquals(qobj.toString(), "List(algo(id:\"a\",a:sist(id:1.0)))");
		
	}
	
	public void testRandom2() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "$/.id-$/.id";
		showTokens(input);
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(qobj.toString());
		assertEquals(qobj.toString(), "$/.id-$/.id");
	}
	
	
	public void testOnlyRoot() throws Exception {
		ArrayList aux = new ArrayList();
		String input = "$";
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		assertEquals(qobj.toString(), "$");
	}
	
	
	
	public void testSuma() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "$/.id+$/.id";
		showTokens(input);
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(qobj.toString());
		assertEquals(qobj.toString(), "$/.id+$/.id");
	}
	
	
	public void testUnion() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "$/.id∪$/.id";
		showTokens(input);
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(qobj.toString());
		assertEquals(qobj.toString(),"$/.id∪$/.id");
	}
	
	
	
	public void testResta() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "$/.id-$/.id";
		showTokens(input);
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(qobj.toString());
		assertEquals( "$/.id-$/.id", qobj.toString());
	}
	
	public void testIntersection() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "$/.id&$/.";
		showTokens(input);
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(qobj.toString());
		assertEquals(qobj.toString(), "$/.id∩$/.");
	}
	
	public void testDot() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "$List/.id";
		showTokens(input);
		QOPERATION qobj =  (QOPERATION) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(((Expression)qobj).toStringEval());
		//System.out.println(qobj.eval().toString());
		assertEquals(qobj.toString(), "$List/.id");
	}
	
	public void testTag() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "$List/algo";
		showTokens(input);
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(qobj.toString());
		assertEquals(qobj.toString(), "$List/algo");
	}
	
	public void testGunsAndRoses() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "$/";
		showTokens(input);
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(qobj.toString());
		assertEquals(qobj.toString(), "$/");
	}
	
	public void testBrackets() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "($List)";
		showTokens(input);
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(qobj.toString());
		assertEquals(qobj.toString(), "$List");
	}
	
	public void testVibora() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "$~'z+'";
		showTokens(input);
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(qobj.toString());
		System.out.println(qobj.toStringEval());
		assertEquals(qobj.toString(), "$~z+");
	}
	
	public void testInfinity() throws Exception {
		//createData();
		ArrayList aux = new ArrayList();
		String input = "$id";
		showTokens(input);
		Expression qobj =  (Expression) Parser.parseString(input);
		aux.add(qobj);
		System.out.println(qobj.toString());
		assertEquals(qobj.toString(), "$id");
	}
	

}
// 