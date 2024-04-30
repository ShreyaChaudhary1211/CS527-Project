/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.functional.parser;

import static org.semanticweb.owlapi.functional.parser.OWLFunctionalSyntaxParserConstants.*;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by ses on 6/9/14.
 */
@java.lang.SuppressWarnings({"fallthrough"}) class CustomTokenizer implements TokenManager {public static class __CLR4_5_23ni3nilvicm909{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,5109,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int unreadChar = -1;
    private final Reader in;
    private boolean eofSeen = false;
    private final StringBuilder buf = new StringBuilder();

    public CustomTokenizer(Reader reader) {try{__CLR4_5_23ni3nilvicm909.R.inc(4734);
        __CLR4_5_23ni3nilvicm909.R.inc(4735);in = reader;
    }finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}

    /**
     * This gets the next token from the input stream. A token of kind 0 (EOF)
     * should be returned on EOF.
     */
    @Override
    public Token getNextToken() {try{__CLR4_5_23ni3nilvicm909.R.inc(4736);
        __CLR4_5_23ni3nilvicm909.R.inc(4737);while (true) {{
            __CLR4_5_23ni3nilvicm909.R.inc(4738);char c;
            __CLR4_5_23ni3nilvicm909.R.inc(4739);try {
                __CLR4_5_23ni3nilvicm909.R.inc(4740);c = findTokenStart();
                boolean __CLB4_5_2_bool0=false;__CLR4_5_23ni3nilvicm909.R.inc(4741);switch (c) {
                    case '(':if (!__CLB4_5_2_bool0) {__CLR4_5_23ni3nilvicm909.R.inc(4742);__CLB4_5_2_bool0=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4743);return makeToken(OPENPAR, "(");
                    case ')':if (!__CLB4_5_2_bool0) {__CLR4_5_23ni3nilvicm909.R.inc(4744);__CLB4_5_2_bool0=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4745);return makeToken(CLOSEPAR, ")");
                    case '@':if (!__CLB4_5_2_bool0) {__CLR4_5_23ni3nilvicm909.R.inc(4746);__CLB4_5_2_bool0=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4747);return makeToken(LANGIDENTIFIER, "@");
                    case '^':if (!__CLB4_5_2_bool0) {__CLR4_5_23ni3nilvicm909.R.inc(4748);__CLB4_5_2_bool0=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4749);c = readChar();
                        __CLR4_5_23ni3nilvicm909.R.inc(4750);if ((((c == '^')&&(__CLR4_5_23ni3nilvicm909.R.iget(4751)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(4752)==0&false))) {{
                            __CLR4_5_23ni3nilvicm909.R.inc(4753);return makeToken(DATATYPEIDENTIFIER, "^^");
                        } }else {{
                            __CLR4_5_23ni3nilvicm909.R.inc(4754);return makeToken(ERROR, "^" + c);
                        }
                    }case '=':if (!__CLB4_5_2_bool0) {__CLR4_5_23ni3nilvicm909.R.inc(4755);__CLB4_5_2_bool0=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4756);return makeToken(EQUALS, "=");
                    case '#':if (!__CLB4_5_2_bool0) {__CLR4_5_23ni3nilvicm909.R.inc(4757);__CLB4_5_2_bool0=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4758);skipComment();
                        __CLR4_5_23ni3nilvicm909.R.inc(4759);break;
                    case '"':if (!__CLB4_5_2_bool0) {__CLR4_5_23ni3nilvicm909.R.inc(4760);__CLB4_5_2_bool0=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4761);return readStringLiteralToken();
                    case '<':if (!__CLB4_5_2_bool0) {__CLR4_5_23ni3nilvicm909.R.inc(4762);__CLB4_5_2_bool0=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4763);return readFullIRI();
                    default:if (!__CLB4_5_2_bool0) {__CLR4_5_23ni3nilvicm909.R.inc(4764);__CLB4_5_2_bool0=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4765);return readTextualToken(c);
                }
            } catch (IOException e) {
                __CLR4_5_23ni3nilvicm909.R.inc(4766);return makeToken(EOF, "");
            }
        }
    }}finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}

    private void skipComment() throws IOException {try{__CLR4_5_23ni3nilvicm909.R.inc(4767);
        __CLR4_5_23ni3nilvicm909.R.inc(4768);for (char c = readChar(); (((c != '\n')&&(__CLR4_5_23ni3nilvicm909.R.iget(4769)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(4770)==0&false)); c = readChar()) {{}
    }}finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}

    private Token readStringLiteralToken() throws IOException {try{__CLR4_5_23ni3nilvicm909.R.inc(4771);
        __CLR4_5_23ni3nilvicm909.R.inc(4772);buf.setLength(0);
        __CLR4_5_23ni3nilvicm909.R.inc(4773);buf.append('"');
        __CLR4_5_23ni3nilvicm909.R.inc(4774);while (true) {{
            __CLR4_5_23ni3nilvicm909.R.inc(4775);char c = readChar();
            boolean __CLB4_5_2_bool1=false;__CLR4_5_23ni3nilvicm909.R.inc(4776);switch (c) {
                case '"':if (!__CLB4_5_2_bool1) {__CLR4_5_23ni3nilvicm909.R.inc(4777);__CLB4_5_2_bool1=true;}
                    __CLR4_5_23ni3nilvicm909.R.inc(4778);buf.append(c);
                    __CLR4_5_23ni3nilvicm909.R.inc(4779);return makeToken(STRINGLITERAL, buf.toString());
                case '\\':if (!__CLB4_5_2_bool1) {__CLR4_5_23ni3nilvicm909.R.inc(4780);__CLB4_5_2_bool1=true;}
                    __CLR4_5_23ni3nilvicm909.R.inc(4781);buf.append(c);
                    __CLR4_5_23ni3nilvicm909.R.inc(4782);c = readChar();
                    __CLR4_5_23ni3nilvicm909.R.inc(4783);if ((((c != '\\' && c != '\"')&&(__CLR4_5_23ni3nilvicm909.R.iget(4784)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(4785)==0&false))) {{
                        __CLR4_5_23ni3nilvicm909.R.inc(4786);return makeToken(ERROR,
                                "Bad escape sequence in StringLiteral");
                    }
                    // fallthrough
                    //$FALL-THROUGH$
                }default:if (!__CLB4_5_2_bool1) {__CLR4_5_23ni3nilvicm909.R.inc(4787);__CLB4_5_2_bool1=true;}
                    __CLR4_5_23ni3nilvicm909.R.inc(4788);buf.append(c);
            }
        }
    }}finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}

    private Token readFullIRI() {try{__CLR4_5_23ni3nilvicm909.R.inc(4789);
        __CLR4_5_23ni3nilvicm909.R.inc(4790);try {
            __CLR4_5_23ni3nilvicm909.R.inc(4791);buf.setLength(0);
            __CLR4_5_23ni3nilvicm909.R.inc(4792);buf.append('<');
            __CLR4_5_23ni3nilvicm909.R.inc(4793);while (true) {{
                __CLR4_5_23ni3nilvicm909.R.inc(4794);char c = readChar();
                __CLR4_5_23ni3nilvicm909.R.inc(4795);buf.append(c);
                __CLR4_5_23ni3nilvicm909.R.inc(4796);if ((((c == '>')&&(__CLR4_5_23ni3nilvicm909.R.iget(4797)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(4798)==0&false))) {{
                    __CLR4_5_23ni3nilvicm909.R.inc(4799);return makeToken(FULLIRI, buf.toString());
                }
            }}
        }} catch (IOException e) {
            __CLR4_5_23ni3nilvicm909.R.inc(4800);return makeToken(ERROR, "<");
        }
    }finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}

    private Token readTextualToken(char c) throws IOException {try{__CLR4_5_23ni3nilvicm909.R.inc(4801);
        __CLR4_5_23ni3nilvicm909.R.inc(4802);if ((((c >= '0' && c <= '9')&&(__CLR4_5_23ni3nilvicm909.R.iget(4803)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(4804)==0&false))) {{
            __CLR4_5_23ni3nilvicm909.R.inc(4805);return readNumber(c);
        }
        }__CLR4_5_23ni3nilvicm909.R.inc(4806);buf.setLength(0);
        __CLR4_5_23ni3nilvicm909.R.inc(4807);buf.append(c);
        __CLR4_5_23ni3nilvicm909.R.inc(4808);int colonIndex = -1;
        __CLR4_5_23ni3nilvicm909.R.inc(4809);if ((((c == ':')&&(__CLR4_5_23ni3nilvicm909.R.iget(4810)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(4811)==0&false))) {{
            __CLR4_5_23ni3nilvicm909.R.inc(4812);colonIndex = 0;
        }
        }__CLR4_5_23ni3nilvicm909.R.inc(4813);loop: while (true) {{
            __CLR4_5_23ni3nilvicm909.R.inc(4814);try {
                __CLR4_5_23ni3nilvicm909.R.inc(4815);c = readChar();
                boolean __CLB4_5_2_bool2=false;__CLR4_5_23ni3nilvicm909.R.inc(4816);switch (c) {
                    case '=':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4817);__CLB4_5_2_bool2=true;}
                    case '"':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4818);__CLB4_5_2_bool2=true;}
                    case '(':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4819);__CLB4_5_2_bool2=true;}
                    case ')':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4820);__CLB4_5_2_bool2=true;}
                    case '<':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4821);__CLB4_5_2_bool2=true;}
                    case '>':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4822);__CLB4_5_2_bool2=true;}
                    case '@':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4823);__CLB4_5_2_bool2=true;}
                    case '^':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4824);__CLB4_5_2_bool2=true;}
                    case '\r':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4825);__CLB4_5_2_bool2=true;}
                    case '\n':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4826);__CLB4_5_2_bool2=true;}
                    case ' ':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4827);__CLB4_5_2_bool2=true;}
                    case '\t':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4828);__CLB4_5_2_bool2=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4829);unread(c);
                        __CLR4_5_23ni3nilvicm909.R.inc(4830);break loop;
                    case ':':if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4831);__CLB4_5_2_bool2=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4832);colonIndex = buf.length();  // and fall through
                        //$FALL-THROUGH$
                    default:if (!__CLB4_5_2_bool2) {__CLR4_5_23ni3nilvicm909.R.inc(4833);__CLB4_5_2_bool2=true;}
                        __CLR4_5_23ni3nilvicm909.R.inc(4834);buf.append(c);
                }
            } catch (EOFException eof) {
                __CLR4_5_23ni3nilvicm909.R.inc(4835);break;
            }
        }
        }__CLR4_5_23ni3nilvicm909.R.inc(4836);String s = buf.toString();
        __CLR4_5_23ni3nilvicm909.R.inc(4837);if ((((colonIndex >= 0)&&(__CLR4_5_23ni3nilvicm909.R.iget(4838)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(4839)==0&false))) {{
            // System.out.println("colonIndex >=0 - so expect abbreviated IRI from "
            // + buf);
            __CLR4_5_23ni3nilvicm909.R.inc(4840);if ((((colonIndex == s.length() - 1)&&(__CLR4_5_23ni3nilvicm909.R.iget(4841)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(4842)==0&false))) {{
                __CLR4_5_23ni3nilvicm909.R.inc(4843);return makeToken(PNAME_NS, s);
            } }else {{
                __CLR4_5_23ni3nilvicm909.R.inc(4844);if ((((s.startsWith("_:"))&&(__CLR4_5_23ni3nilvicm909.R.iget(4845)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(4846)==0&false))) {{
                    __CLR4_5_23ni3nilvicm909.R.inc(4847);return makeToken(NODEID, s);
                }
                }__CLR4_5_23ni3nilvicm909.R.inc(4848);return makeToken(OWLFunctionalSyntaxParserConstants.PNAME_LN, s);
            }
        }}
        }boolean __CLB4_5_2_bool3=false;__CLR4_5_23ni3nilvicm909.R.inc(4849);switch (s) {
            case "Ontology":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4850);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4851);return makeToken(ONTOLOGY, s);
            case "Label":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4852);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4853);return makeToken(LABEL, s);
            case "Import":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4854);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4855);return makeToken(IMPORT, s);
            case "Comment":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4856);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4857);return makeToken(COMMENT, s);
            case "SubClassOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4858);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4859);return makeToken(SUBCLASSOF, s);
            case "EquivalentClasses":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4860);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4861);return makeToken(EQUIVALENTCLASSES, s);
            case "DisjointClasses":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4862);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4863);return makeToken(DISJOINTCLASSES, s);
            case "DisjointUnion":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4864);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4865);return makeToken(DISJOINTUNION, s);
            case "Annotation":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4866);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4867);return makeToken(ANNOTATION, s);
            case "AnnotationProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4868);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4869);return makeToken(ANNOTATIONPROPERTY, s);
            case "AnnotationAssertion":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4870);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4871);return makeToken(ANNOTATIONASSERTION, s);
            case "SubAnnotationPropertyOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4872);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4873);return makeToken(SUBANNOTATIONPROPERTYOF, s);
            case "AnnotationPropertyDomain":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4874);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4875);return makeToken(ANNOTATIONPROPERTYDOMAIN, s);
            case "AnnotationPropertyRange":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4876);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4877);return makeToken(ANNOTATIONPROPERTYRANGE, s);
            case "HasKey":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4878);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4879);return makeToken(HASKEY, s);
            case "Declaration":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4880);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4881);return makeToken(DECLARATION, s);
            case "Documentation":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4882);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4883);return makeToken(DOCUMENTATION, s);
            case "Class":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4884);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4885);return makeToken(CLASS, s);
            case "ObjectProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4886);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4887);return makeToken(OBJECTPROP, s);
            case "DataProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4888);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4889);return makeToken(DATAPROP, s);
            case "NamedIndividual":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4890);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4891);return makeToken(NAMEDINDIVIDUAL, s);
            case "Datatype":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4892);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4893);return makeToken(DATATYPE, s);
            case "DataOneOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4894);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4895);return makeToken(DATAONEOF, s);
            case "DataUnionOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4896);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4897);return makeToken(DATAUNIONOF, s);
            case "DataIntersectionOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4898);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4899);return makeToken(DATAINTERSECTIONOF, s);
            case "ObjectOneOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4900);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4901);return makeToken(OBJECTONEOF, s);
            case "ObjectUnionOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4902);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4903);return makeToken(OBJECTUNIONOF, s);
            case "ObjectHasValue":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4904);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4905);return makeToken(OBJECTHASVALUE, s);
            case "ObjectInverseOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4906);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4907);return makeToken(OBJECTINVERSEOF, s);
            case "InverseObjectProperties":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4908);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4909);return makeToken(INVERSEOBJECTPROPERTIES, s);
            case "DataComplementOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4910);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4911);return makeToken(DATACOMPLEMENTOF, s);
            case "DatatypeRestriction":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4912);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4913);return makeToken(DATATYPERESTRICTION, s);
            case "DatatypeDefinition":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4914);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4915);return makeToken(DATATYPEDEFINITION, s);
            case "ObjectIntersectionOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4916);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4917);return makeToken(OBJECTINTERSECTIONOF, s);
            case "ObjectComplementOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4918);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4919);return makeToken(OBJECTCOMPLEMENTOF, s);
            case "ObjectAllValuesFrom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4920);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4921);return makeToken(OBJECTALLVALUESFROM, s);
            case "ObjectSomeValuesFrom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4922);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4923);return makeToken(OBJECTSOMEVALUESFROM, s);
            case "ObjectHasSelf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4924);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4925);return makeToken(OBJECTHASSELF, s);
            case "ObjectMinCardinality":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4926);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4927);return makeToken(OBJECTMINCARDINALITY, s);
            case "ObjectMaxCardinality":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4928);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4929);return makeToken(OBJECTMAXCARDINALITY, s);
            case "ObjectExactCardinality":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4930);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4931);return makeToken(OBJECTEXACTCARDINALITY, s);
            case "DataAllValuesFrom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4932);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4933);return makeToken(DATAALLVALUESFROM, s);
            case "DataSomeValuesFrom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4934);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4935);return makeToken(DATASOMEVALUESFROM, s);
            case "DataHasValue":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4936);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4937);return makeToken(DATAHASVALUE, s);
            case "DataMinCardinality":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4938);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4939);return makeToken(DATAMINCARDINALITY, s);
            case "DataMaxCardinality":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4940);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4941);return makeToken(DATAMAXCARDINALITY, s);
            case "DataExactCardinality":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4942);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4943);return makeToken(DATAEXACTCARDINALITY, s);
            case "ObjectPropertyChain":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4944);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4945);return makeToken(SUBOBJECTPROPERTYCHAIN, s);
            case "SubObjectPropertyOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4946);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4947);return makeToken(SUBOBJECTPROPERTYOF, s);
            case "EquivalentObjectProperties":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4948);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4949);return makeToken(EQUIVALENTOBJECTPROPERTIES, s);
            case "DisjointObjectProperties":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4950);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4951);return makeToken(DISJOINTOBJECTPROPERTIES, s);
            case "ObjectPropertyDomain":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4952);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4953);return makeToken(OBJECTPROPERTYDOMAIN, s);
            case "ObjectPropertyRange":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4954);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4955);return makeToken(OBJECTPROPERTYRANGE, s);
            case "FunctionalObjectProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4956);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4957);return makeToken(FUNCTIONALOBJECTPROPERTY, s);
            case "InverseFunctionalObjectProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4958);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4959);return makeToken(INVERSEFUNCTIONALOBJECTPROPERTY, s);
            case "ReflexiveObjectProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4960);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4961);return makeToken(REFLEXIVEOBJECTPROPERTY, s);
            case "IrreflexiveObjectProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4962);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4963);return makeToken(IRREFLEXIVEOBJECTPROPERTY, s);
            case "SymmetricObjectProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4964);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4965);return makeToken(SYMMETRICOBJECTPROPERTY, s);
            case "AsymmetricObjectProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4966);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4967);return makeToken(ASYMMETRICOBJECTPROPERTY, s);
            case "TransitiveObjectProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4968);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4969);return makeToken(TRANSITIVEOBJECTPROPERTY, s);
            case "SubDataPropertyOf":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4970);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4971);return makeToken(SUBDATAPROPERTYOF, s);
            case "EquivalentDataProperties":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4972);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4973);return makeToken(EQUIVALENTDATAPROPERTIES, s);
            case "DisjointDataProperties":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4974);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4975);return makeToken(DISJOINTDATAPROPERTIES, s);
            case "DataPropertyDomain":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4976);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4977);return makeToken(DATAPROPERTYDOMAIN, s);
            case "DataPropertyRange":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4978);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4979);return makeToken(DATAPROPERTYRANGE, s);
            case "FunctionalDataProperty":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4980);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4981);return makeToken(FUNCTIONALDATAPROPERTY, s);
            case "SameIndividual":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4982);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4983);return makeToken(SAMEINDIVIDUAL, s);
            case "DifferentIndividuals":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4984);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4985);return makeToken(DIFFERENTINDIVIDUALS, s);
            case "ClassAssertion":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4986);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4987);return makeToken(CLASSASSERTION, s);
            case "ObjectPropertyAssertion":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4988);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4989);return makeToken(OBJECTPROPERTYASSERTION, s);
            case "NegativeObjectPropertyAssertion":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4990);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4991);return makeToken(NEGATIVEOBJECTPROPERTYASSERTION, s);
            case "DataPropertyAssertion":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4992);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4993);return makeToken(DATAPROPERTYASSERTION, s);
            case "NegativeDataPropertyAssertion":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4994);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4995);return makeToken(NEGATIVEDATAPROPERTYASSERTION, s);
            case "Prefix":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4996);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4997);return makeToken(PREFIX, s);
            case "length":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(4998);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(4999);return makeToken(LENGTH, s);
            case "minLength":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5000);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5001);return makeToken(MINLENGTH, s);
            case "maxLength":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5002);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5003);return makeToken(MAXLENGTH, s);
            case "pattern":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5004);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5005);return makeToken(PATTERN, s);
            case "minInclusive":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5006);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5007);return makeToken(MININCLUSIVE, s);
            case "maxInclusive":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5008);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5009);return makeToken(MAXINCLUSIVE, s);
            case "minExclusive":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5010);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5011);return makeToken(MINEXCLUSIVE, s);
            case "maxExclusive":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5012);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5013);return makeToken(MAXEXCLUSIVE, s);
            case "totalDigits":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5014);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5015);return makeToken(TOTALDIGITS, s);
            case "DLSafeRule":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5016);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5017);return makeToken(DLSAFERULE, s);
            case "Body":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5018);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5019);return makeToken(BODY, s);
            case "Head":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5020);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5021);return makeToken(HEAD, s);
            case "ClassAtom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5022);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5023);return makeToken(CLASSATOM, s);
            case "DataRangeAtom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5024);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5025);return makeToken(DATARANGEATOM, s);
            case "ObjectPropertyAtom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5026);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5027);return makeToken(OBJECTPROPERTYATOM, s);
            case "DataPropertyAtom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5028);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5029);return makeToken(DATAPROPERTYATOM, s);
            case "BuiltInAtom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5030);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5031);return makeToken(BUILTINATOM, s);
            case "SameIndividualAtom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5032);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5033);return makeToken(SAMEINDIVIDUALATOM, s);
            case "DifferentIndividualsAtom":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5034);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5035);return makeToken(DIFFERENTINDIVIDUALSATOM, s);
            case "Variable":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5036);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5037);return makeToken(VARIABLE, s);
            case "DescriptionGraphRule":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5038);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5039);return makeToken(OWLFunctionalSyntaxParserConstants.DGRULE, s);
            case "DescriptionGraph":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5040);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5041);return makeToken(DESCRIPTIONGRAPH, s);
            case "Nodes":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5042);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5043);return makeToken(NODES, s);
            case "NodeAssertion":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5044);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5045);return makeToken(NODEASSERTION, s);
            case "Edges":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5046);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5047);return makeToken(EDGES, s);
            case "EdgeAssertion":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5048);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5049);return makeToken(EDGEASSERTION, s);
            case "MainClasses":if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5050);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5051);return makeToken(MAINCLASSES, s);
            default:if (!__CLB4_5_2_bool3) {__CLR4_5_23ni3nilvicm909.R.inc(5052);__CLB4_5_2_bool3=true;}
                __CLR4_5_23ni3nilvicm909.R.inc(5053);return makeToken(PN_LOCAL, s);
        }
    }finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}

    private Token readNumber(char c) throws IOException {try{__CLR4_5_23ni3nilvicm909.R.inc(5054);
        __CLR4_5_23ni3nilvicm909.R.inc(5055);buf.setLength(0);
        __CLR4_5_23ni3nilvicm909.R.inc(5056);buf.append(c);
        __CLR4_5_23ni3nilvicm909.R.inc(5057);while (true) {{
            __CLR4_5_23ni3nilvicm909.R.inc(5058);c = readChar();
            __CLR4_5_23ni3nilvicm909.R.inc(5059);if ((((!Character.isDigit(c))&&(__CLR4_5_23ni3nilvicm909.R.iget(5060)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(5061)==0&false))) {{
                __CLR4_5_23ni3nilvicm909.R.inc(5062);unread(c);
                __CLR4_5_23ni3nilvicm909.R.inc(5063);return makeToken(OWLFunctionalSyntaxParserConstants.INT,
                        buf.toString());
            } }else {{
                __CLR4_5_23ni3nilvicm909.R.inc(5064);buf.append(c);
            }
        }}
    }}finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}

    private int lineNo = 1;
    private int colNo = 0;
    private int startLine = -1;
    private int startCol = -1;

    private Token makeToken(int kind, String image) {try{__CLR4_5_23ni3nilvicm909.R.inc(5065);
        __CLR4_5_23ni3nilvicm909.R.inc(5066);Token result = new Token(kind, image);
        __CLR4_5_23ni3nilvicm909.R.inc(5067);result.beginLine = startLine;
        __CLR4_5_23ni3nilvicm909.R.inc(5068);result.beginColumn = startCol;
        __CLR4_5_23ni3nilvicm909.R.inc(5069);return result;
    }finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}

    private char findTokenStart() throws IOException {try{__CLR4_5_23ni3nilvicm909.R.inc(5070);
        __CLR4_5_23ni3nilvicm909.R.inc(5071);while (true) {{
            __CLR4_5_23ni3nilvicm909.R.inc(5072);char c = readChar();
            __CLR4_5_23ni3nilvicm909.R.inc(5073);if ((((c != ' ' && c != '\t' && c != '\r' && c != '\n')&&(__CLR4_5_23ni3nilvicm909.R.iget(5074)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(5075)==0&false))) {{
                __CLR4_5_23ni3nilvicm909.R.inc(5076);startLine = lineNo;
                __CLR4_5_23ni3nilvicm909.R.inc(5077);startCol = colNo;
                __CLR4_5_23ni3nilvicm909.R.inc(5078);return c;
            }
        }}
    }}finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}

    private void unread(char c) {try{__CLR4_5_23ni3nilvicm909.R.inc(5079);
        __CLR4_5_23ni3nilvicm909.R.inc(5080);unreadChar = c;
        __CLR4_5_23ni3nilvicm909.R.inc(5081);if ((((c != '\n')&&(__CLR4_5_23ni3nilvicm909.R.iget(5082)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(5083)==0&false))) {{
            __CLR4_5_23ni3nilvicm909.R.inc(5084);colNo--;
        }
    }}finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}

    private char readChar() throws IOException {try{__CLR4_5_23ni3nilvicm909.R.inc(5085);
        __CLR4_5_23ni3nilvicm909.R.inc(5086);if ((((eofSeen)&&(__CLR4_5_23ni3nilvicm909.R.iget(5087)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(5088)==0&false))) {{
            __CLR4_5_23ni3nilvicm909.R.inc(5089);throw new EOFException();
        }
        }__CLR4_5_23ni3nilvicm909.R.inc(5090);int c;
        __CLR4_5_23ni3nilvicm909.R.inc(5091);if ((((unreadChar < 0)&&(__CLR4_5_23ni3nilvicm909.R.iget(5092)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(5093)==0&false))) {{
            __CLR4_5_23ni3nilvicm909.R.inc(5094);c = in.read();
            __CLR4_5_23ni3nilvicm909.R.inc(5095);if ((((c == '\n')&&(__CLR4_5_23ni3nilvicm909.R.iget(5096)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(5097)==0&false))) {{
                __CLR4_5_23ni3nilvicm909.R.inc(5098);lineNo++;
                __CLR4_5_23ni3nilvicm909.R.inc(5099);colNo = 0;
            }
        }} }else {{
            __CLR4_5_23ni3nilvicm909.R.inc(5100);c = unreadChar;
            __CLR4_5_23ni3nilvicm909.R.inc(5101);unreadChar = -1;
        }
        }__CLR4_5_23ni3nilvicm909.R.inc(5102);colNo++;
        __CLR4_5_23ni3nilvicm909.R.inc(5103);if ((((c < 0)&&(__CLR4_5_23ni3nilvicm909.R.iget(5104)!=0|true))||(__CLR4_5_23ni3nilvicm909.R.iget(5105)==0&false))) {{
            __CLR4_5_23ni3nilvicm909.R.inc(5106);eofSeen = true;
            __CLR4_5_23ni3nilvicm909.R.inc(5107);throw new EOFException();
        } }else {{
            __CLR4_5_23ni3nilvicm909.R.inc(5108);return (char) c;
        }
    }}finally{__CLR4_5_23ni3nilvicm909.R.flushNeeded();}}
}
