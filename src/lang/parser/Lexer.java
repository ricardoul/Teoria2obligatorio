/* The following code was generated by JFlex 1.4.3 on 7/10/17 7:24 PM */

package lang.parser;

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 7/10/17 7:24 PM from the specification file
 * <tt>/Users/rumpierrez/Documents/workspaces/CUP_demo 2/src/Lexer.lex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner, Tokens {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\40\27\0\1\37\1\0\1\30\1\0\1\32\1\41\1\26"+
    "\1\27\1\42\1\34\1\35\1\23\1\25\1\31\12\24\1\4\6\0"+
    "\1\15\3\0\1\7\1\14\5\0\1\3\1\0\1\1\3\0\1\6"+
    "\1\16\1\5\1\2\13\0\1\20\3\0\1\13\1\17\5\0\1\21"+
    "\5\0\1\11\1\22\1\10\1\12\6\0\1\33\1\0\1\36\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\1\1\2\4\1\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\7\1"+
    "\1\0\1\1\1\4\1\1\1\4\1\0\1\17\1\0"+
    "\6\1\1\4\3\0\1\17\1\1\1\20\1\21\2\1"+
    "\1\4\1\0\1\22\1\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[55];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\43\0\106\0\151\0\214\0\257\0\322\0\365"+
    "\0\u0118\0\u013b\0\u015e\0\151\0\151\0\151\0\u0181\0\151"+
    "\0\151\0\u01a4\0\151\0\43\0\u01c7\0\u01ea\0\u020d\0\u0230"+
    "\0\u0253\0\u0276\0\u0299\0\u015e\0\u02bc\0\u02df\0\u0302\0\u0325"+
    "\0\u0348\0\43\0\u036b\0\u038e\0\u03b1\0\u03d4\0\u03f7\0\u041a"+
    "\0\u043d\0\u043d\0\u0460\0\u0483\0\u04a6\0\151\0\u036b\0\43"+
    "\0\43\0\u04c9\0\u04ec\0\u0460\0\u050f\0\43\0\151";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[55];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\2\1\4\1\5\2\2\1\6\3\2"+
    "\1\7\2\2\1\10\3\2\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\0\1\26\5\2\1\0\20\2\4\0\1\2"+
    "\4\0\2\2\1\0\4\2\1\27\1\2\1\0\20\2"+
    "\4\0\1\2\4\0\2\2\1\0\2\2\43\0\4\2"+
    "\1\0\1\2\1\30\16\2\4\0\1\2\4\0\2\2"+
    "\1\0\6\2\1\0\4\2\1\31\13\2\4\0\1\2"+
    "\4\0\2\2\1\0\6\2\1\0\10\2\1\32\7\2"+
    "\4\0\1\2\4\0\2\2\1\0\6\2\1\0\13\2"+
    "\1\33\4\2\4\0\1\2\4\0\2\2\1\0\6\2"+
    "\1\0\17\2\1\12\1\34\3\0\1\2\4\0\2\2"+
    "\1\0\6\2\1\0\2\2\1\35\3\2\1\35\10\2"+
    "\1\12\1\34\3\0\1\2\4\0\2\2\1\0\2\2"+
    "\24\0\1\36\16\0\4\2\1\0\20\2\4\0\1\2"+
    "\4\0\2\2\1\0\1\2\1\37\24\0\1\40\1\34"+
    "\15\0\4\25\1\41\20\25\4\41\1\25\4\41\1\25"+
    "\1\42\1\0\2\25\4\26\1\0\20\26\1\43\3\0"+
    "\1\26\4\0\2\26\1\0\2\26\3\2\1\44\1\0"+
    "\20\2\4\0\1\2\4\0\2\2\1\0\4\2\1\45"+
    "\1\2\1\0\20\2\4\0\1\2\4\0\2\2\1\0"+
    "\6\2\1\0\5\2\1\46\12\2\4\0\1\2\4\0"+
    "\2\2\1\0\5\2\1\47\1\0\20\2\4\0\1\2"+
    "\4\0\2\2\1\0\6\2\1\0\14\2\1\50\3\2"+
    "\4\0\1\2\4\0\2\2\1\0\6\2\1\0\16\2"+
    "\1\51\1\52\4\0\1\2\2\0\1\53\1\0\2\2"+
    "\1\0\2\2\7\0\1\54\3\0\1\54\10\0\1\36"+
    "\16\0\4\37\1\55\20\37\4\55\1\37\4\55\2\37"+
    "\1\55\1\37\1\2\7\0\1\54\3\0\1\54\10\0"+
    "\1\40\1\34\15\0\37\41\1\56\1\0\2\41\4\43"+
    "\1\0\21\43\3\0\1\43\4\0\2\43\1\0\1\57"+
    "\1\43\3\2\1\60\1\0\20\2\4\0\1\2\4\0"+
    "\2\2\1\0\6\2\1\0\2\2\1\61\15\2\4\0"+
    "\1\2\4\0\2\2\1\0\6\2\1\0\6\2\1\61"+
    "\11\2\4\0\1\2\4\0\2\2\1\0\6\2\1\0"+
    "\11\2\1\62\6\2\4\0\1\2\4\0\2\2\1\0"+
    "\6\2\1\0\15\2\1\63\2\2\4\0\1\2\4\0"+
    "\2\2\1\0\6\2\1\0\17\2\1\52\4\0\1\2"+
    "\4\0\2\2\1\0\2\2\24\0\1\64\41\0\1\53"+
    "\1\64\7\0\1\53\6\0\42\55\1\65\4\2\1\0"+
    "\2\2\1\66\15\2\4\0\1\2\4\0\2\2\1\0"+
    "\6\2\1\0\6\2\1\66\11\2\4\0\1\2\4\0"+
    "\2\2\1\0\2\2\31\0\1\67\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1330];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\1\1\11\7\1\3\11\1\1\2\11\1\1\1\11"+
    "\10\1\1\0\4\1\1\0\1\1\1\0\7\1\3\0"+
    "\1\11\6\1\1\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[55];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	/* Embedded lexer class code */  


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 100) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 12: 
          { return new Symbol(CONCAT, yytext());
          }
        case 20: break;
        case 14: 
          { return new Symbol(TILDE, yytext());
          }
        case 21: break;
        case 5: 
          { return new Symbol(DOT);
          }
        case 22: break;
        case 18: 
          { return new Symbol(FALSE, false);
          }
        case 23: break;
        case 13: 
          { return new Symbol(COMMA, yytext());
          }
        case 24: break;
        case 11: 
          { return new Symbol(UNION, yytext());
          }
        case 25: break;
        case 7: 
          { return new Symbol(R_BRACKET, yytext());
          }
        case 26: break;
        case 8: 
          { return new Symbol(ROOT, yytext());
          }
        case 27: break;
        case 2: 
          { return new Symbol(COLON, yytext());
          }
        case 28: break;
        case 10: 
          { return new Symbol(INTERSECT, yytext());
          }
        case 29: break;
        case 15: 
          { return new Symbol(STRING, yytext());
          }
        case 30: break;
        case 3: 
          { return new Symbol(DIFFERENCE, yytext());
          }
        case 31: break;
        case 17: 
          { return new Symbol(TRUE, true);
          }
        case 32: break;
        case 1: 
          { return new Symbol(IDS, yytext());
          }
        case 33: break;
        case 9: 
          { return new Symbol(SLASH, yytext());
          }
        case 34: break;
        case 6: 
          { return new Symbol(L_BRACKET, yytext());
          }
        case 35: break;
        case 19: 
          { /*ignorar*/
          }
        case 36: break;
        case 4: 
          { return new Symbol(DOUBLE, Double.parseDouble(yytext()));
          }
        case 37: break;
        case 16: 
          { return new Symbol(NULL, yytext());
          }
        case 38: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(Tokens.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
