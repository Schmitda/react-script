// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: grammars/Scanner.flex

package ch.ffhs.ti.umk.skript.parser;

import static ch.ffhs.ti.umk.skript.parser.Terminals.*;
import java_cup.runtime.Symbol;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  private static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  private static final int YYINITIAL = 0;

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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\10\u2f00\31\u1f00\1\u0100\1\u3000\1\u3100\1\u0100\1\u3200"+
    "\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u3a00"+
    "\1\u0100\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100"+
    "\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800\1\u4900"+
    "\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u4e00\1\u1f00\1\u4f00\1\u5000"+
    "\1\u5100\1\u5200\3\u0100\1\u5300\1\u5400\1\u5500\12\u1f00\4\u0100"+
    "\1\u5600\17\u1f00\2\u0100\1\u5700\41\u1f00\2\u0100\1\u5800\1\u5900"+
    "\2\u1f00\1\u5a00\1\u5b00\27\u0100\1\u5c00\4\u0100\1\u5d00\1\u5e00"+
    "\42\u1f00\1\u0100\1\u5f00\1\u6000\11\u1f00\1\u6100\24\u1f00\1\u6200"+
    "\1\u6300\1\u1f00\1\u6400\1\u6500\1\u6600\1\u6700\2\u1f00\1\u6800"+
    "\5\u1f00\1\u6900\1\u6a00\1\u6b00\5\u1f00\1\u6c00\1\u6d00\2\u1f00"+
    "\1\u6e00\1\u1f00\1\u6f00\14\u1f00\1\u7000\4\u1f00\246\u0100\1\u7100"+
    "\20\u0100\1\u7200\1\u7300\25\u0100\1\u7400\34\u0100\1\u7500\14\u1f00"+
    "\2\u0100\1\u7600\5\u1f00\23\u0100\1\u7700\u0aec\u1f00\1\u7800\1\u7900"+
    "\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\16\0\4\5\1\6"+
    "\1\5\1\7\1\5\1\10\1\11\1\5\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\12\23"+
    "\1\24\1\5\1\25\1\26\1\27\1\30\1\5\32\10"+
    "\1\31\1\5\1\32\1\5\1\10\1\5\1\33\1\10"+
    "\1\34\1\35\1\36\1\37\1\10\1\40\1\41\2\10"+
    "\1\42\1\10\1\43\1\10\1\44\1\10\1\45\1\46"+
    "\1\47\1\50\1\10\1\51\3\10\4\5\6\0\1\52"+
    "\32\0\2\5\4\10\4\5\1\10\2\5\1\0\7\5"+
    "\1\10\4\5\1\10\5\5\27\10\1\5\37\10\1\5"+
    "\u01ca\10\4\5\14\10\16\5\5\10\7\5\1\10\1\5"+
    "\1\10\21\5\160\0\5\10\1\5\2\10\2\5\4\10"+
    "\1\5\1\10\6\5\1\10\1\5\3\10\1\5\1\10"+
    "\1\5\24\10\1\5\123\10\1\5\213\10\1\5\5\0"+
    "\2\5\246\10\1\5\46\10\2\5\1\10\6\5\51\10"+
    "\6\5\1\10\1\5\55\0\1\5\1\0\1\5\2\0"+
    "\1\5\2\0\1\5\1\0\10\5\33\10\4\5\4\10"+
    "\15\5\6\0\5\5\1\10\4\5\13\0\1\5\1\0"+
    "\3\5\53\10\37\0\4\5\2\10\1\0\143\10\1\5"+
    "\1\10\10\0\1\5\6\0\2\10\2\0\1\5\4\0"+
    "\2\10\12\0\3\10\2\5\1\10\17\5\1\0\1\10"+
    "\1\0\36\10\33\0\2\5\131\10\13\0\1\10\16\5"+
    "\12\0\41\10\11\0\2\10\4\5\1\10\2\5\1\0"+
    "\30\10\4\0\1\10\11\0\1\10\3\0\1\10\5\0"+
    "\22\5\31\10\3\0\4\5\13\10\65\5\25\10\1\5"+
    "\22\10\13\5\61\0\66\10\3\0\1\10\22\0\1\10"+
    "\7\0\12\10\2\0\2\5\12\0\1\5\20\10\3\0"+
    "\1\5\10\10\2\5\2\10\2\5\26\10\1\5\7\10"+
    "\1\5\1\10\3\5\4\10\2\5\1\0\1\10\7\0"+
    "\2\5\2\0\2\5\3\0\1\10\10\5\1\0\4\5"+
    "\2\10\1\5\3\10\2\0\2\5\12\0\4\10\7\5"+
    "\2\10\1\5\1\0\2\5\3\0\1\5\6\10\4\5"+
    "\2\10\2\5\26\10\1\5\7\10\1\5\2\10\1\5"+
    "\2\10\1\5\2\10\2\5\1\0\1\5\5\0\4\5"+
    "\2\0\2\5\3\0\3\5\1\0\7\5\4\10\1\5"+
    "\1\10\7\5\14\0\3\10\1\0\13\5\3\0\1\5"+
    "\11\10\1\5\3\10\1\5\26\10\1\5\7\10\1\5"+
    "\2\10\1\5\5\10\2\5\1\0\1\10\10\0\1\5"+
    "\3\0\1\5\3\0\2\5\1\10\17\5\2\10\2\0"+
    "\2\5\12\0\1\5\1\10\7\5\1\10\6\0\1\5"+
    "\3\0\1\5\10\10\2\5\2\10\2\5\26\10\1\5"+
    "\7\10\1\5\2\10\1\5\5\10\2\5\1\0\1\10"+
    "\7\0\2\5\2\0\2\5\3\0\7\5\3\0\4\5"+
    "\2\10\1\5\3\10\2\0\2\5\12\0\1\5\1\10"+
    "\20\5\1\0\1\10\1\5\6\10\3\5\3\10\1\5"+
    "\4\10\3\5\2\10\1\5\1\10\1\5\2\10\3\5"+
    "\2\10\3\5\3\10\3\5\14\10\4\5\5\0\3\5"+
    "\3\0\1\5\4\0\2\5\1\10\6\5\1\0\16\5"+
    "\12\0\11\5\1\10\6\5\5\0\10\10\1\5\3\10"+
    "\1\5\27\10\1\5\20\10\3\5\1\10\7\0\1\5"+
    "\3\0\1\5\4\0\7\5\2\0\1\5\3\10\5\5"+
    "\2\10\2\0\2\5\12\0\20\5\1\10\3\0\1\5"+
    "\10\10\1\5\3\10\1\5\27\10\1\5\12\10\1\5"+
    "\5\10\2\5\1\0\1\10\7\0\1\5\3\0\1\5"+
    "\4\0\7\5\2\0\7\5\1\10\1\5\2\10\2\0"+
    "\2\5\12\0\1\5\2\10\15\5\4\0\11\10\1\5"+
    "\3\10\1\5\51\10\2\0\1\10\7\0\1\5\3\0"+
    "\1\5\4\0\1\10\5\5\3\10\1\0\7\5\3\10"+
    "\2\0\2\5\12\0\12\5\6\10\1\5\3\0\1\5"+
    "\22\10\3\5\30\10\1\5\11\10\1\5\1\10\2\5"+
    "\7\10\3\5\1\0\4\5\6\0\1\5\1\0\1\5"+
    "\10\0\6\5\12\0\2\5\2\0\15\5\60\10\1\0"+
    "\2\10\7\0\4\5\10\10\10\0\1\5\12\0\47\5"+
    "\2\10\1\5\1\10\1\5\5\10\1\5\30\10\1\5"+
    "\1\10\1\5\12\10\1\0\2\10\11\0\1\10\2\5"+
    "\5\10\1\5\1\10\1\5\6\0\2\5\12\0\2\5"+
    "\4\10\40\5\1\10\27\5\2\0\6\5\12\0\13\5"+
    "\1\0\1\5\1\0\1\5\1\0\4\5\2\0\10\10"+
    "\1\5\44\10\4\5\24\0\1\5\2\0\5\10\13\0"+
    "\1\5\44\0\11\5\1\0\71\5\53\10\24\0\1\10"+
    "\12\0\6\5\6\10\4\0\4\10\3\0\1\10\3\0"+
    "\2\10\7\0\3\10\4\0\15\10\14\0\1\10\17\0"+
    "\2\5\46\10\1\5\1\10\5\5\1\10\2\5\53\10"+
    "\1\5\115\10\1\5\4\10\2\5\7\10\1\5\1\10"+
    "\1\5\4\10\2\5\51\10\1\5\4\10\2\5\41\10"+
    "\1\5\4\10\2\5\7\10\1\5\1\10\1\5\4\10"+
    "\2\5\17\10\1\5\71\10\1\5\4\10\2\5\103\10"+
    "\2\5\3\0\40\5\20\10\20\5\126\10\2\5\6\10"+
    "\3\5\u016c\10\2\5\21\10\1\5\32\10\5\5\113\10"+
    "\3\5\13\10\7\5\15\10\1\5\4\10\3\0\13\5"+
    "\22\10\3\0\13\5\22\10\2\0\14\5\15\10\1\5"+
    "\3\10\1\5\2\0\14\5\64\10\40\0\3\5\1\10"+
    "\3\5\2\10\1\0\2\5\12\0\41\5\4\0\1\5"+
    "\12\0\6\5\131\10\7\5\5\10\2\0\42\10\1\0"+
    "\1\10\5\5\106\10\12\5\37\10\1\5\14\0\4\5"+
    "\14\0\12\5\12\0\36\10\2\5\5\10\13\5\54\10"+
    "\4\5\32\10\6\5\12\0\46\5\27\10\5\0\4\5"+
    "\65\10\12\0\1\5\35\0\2\5\13\0\6\5\12\0"+
    "\15\5\1\10\10\5\16\0\1\5\2\0\77\5\5\0"+
    "\57\10\21\0\7\10\4\5\12\0\21\5\11\0\14\5"+
    "\3\0\36\10\15\0\2\10\12\0\54\10\16\0\14\5"+
    "\44\10\24\0\10\5\12\0\3\5\3\10\12\0\44\10"+
    "\2\5\11\10\7\5\53\10\2\5\3\10\20\5\3\0"+
    "\1\5\25\0\4\10\1\0\6\10\1\0\2\10\3\0"+
    "\1\10\5\5\300\10\72\0\1\5\5\0\26\10\2\5"+
    "\6\10\2\5\46\10\2\5\6\10\2\5\10\10\1\5"+
    "\1\10\1\5\1\10\1\5\1\10\1\5\37\10\2\5"+
    "\65\10\1\5\7\10\1\5\1\10\3\5\3\10\1\5"+
    "\7\10\3\5\4\10\2\5\6\10\4\5\15\10\5\5"+
    "\3\10\1\5\7\10\16\5\5\0\30\5\2\3\5\0"+
    "\20\5\2\10\23\5\1\10\13\5\5\0\1\5\12\0"+
    "\1\5\1\10\15\5\1\10\20\5\15\10\3\5\40\10"+
    "\20\5\15\0\4\5\1\0\3\5\14\0\21\5\1\10"+
    "\4\5\1\10\2\5\12\10\1\5\1\10\3\5\5\10"+
    "\6\5\1\10\1\5\1\10\1\5\1\10\1\5\4\10"+
    "\1\5\13\10\2\5\4\10\5\5\5\10\4\5\1\10"+
    "\21\5\51\10\u0177\5\57\10\1\5\57\10\1\5\205\10"+
    "\6\5\4\10\3\0\2\10\14\5\46\10\1\5\1\10"+
    "\5\5\1\10\2\5\70\10\7\5\1\10\17\5\1\0"+
    "\27\10\11\5\7\10\1\5\7\10\1\5\7\10\1\5"+
    "\7\10\1\5\7\10\1\5\7\10\1\5\7\10\1\5"+
    "\7\10\1\5\40\0\57\5\1\10\325\5\3\10\31\5"+
    "\11\10\6\0\1\5\5\10\2\5\5\10\4\5\126\10"+
    "\2\5\2\0\2\5\3\10\1\5\132\10\1\5\4\10"+
    "\5\5\53\10\1\5\136\10\21\5\40\10\60\5\320\10"+
    "\100\5\375\10\3\5\215\10\103\5\56\10\2\5\15\10"+
    "\3\5\20\10\12\0\2\10\24\5\57\10\1\0\4\5"+
    "\12\0\1\5\37\10\2\0\120\10\2\0\45\5\11\10"+
    "\2\5\147\10\2\5\65\10\2\5\11\10\52\5\15\10"+
    "\1\0\3\10\1\0\4\10\1\0\27\10\5\0\4\5"+
    "\1\0\13\5\1\10\7\5\64\10\14\5\2\0\62\10"+
    "\22\0\12\5\12\0\6\5\22\0\6\10\3\5\1\10"+
    "\1\5\2\10\13\0\34\10\10\0\2\5\27\10\15\0"+
    "\14\5\35\10\3\5\4\0\57\10\16\0\16\5\1\10"+
    "\12\0\6\5\5\10\1\0\12\10\12\0\5\10\1\5"+
    "\51\10\16\0\11\5\3\10\1\0\10\10\2\0\2\5"+
    "\12\0\6\5\27\10\3\5\1\10\3\0\62\10\1\0"+
    "\1\10\3\0\2\10\2\0\5\10\2\0\1\10\1\0"+
    "\1\10\30\5\3\10\2\5\13\10\5\0\2\5\3\10"+
    "\2\0\12\5\6\10\2\5\6\10\2\5\6\10\11\5"+
    "\7\10\1\5\7\10\1\5\53\10\1\5\16\10\6\5"+
    "\163\10\10\0\1\5\2\0\2\5\12\0\6\5\244\10"+
    "\14\5\27\10\4\5\61\10\4\5\u0100\3\156\10\2\5"+
    "\152\10\46\5\7\10\14\5\5\10\5\5\1\10\1\0"+
    "\12\10\1\5\15\10\1\5\5\10\1\5\1\10\1\5"+
    "\2\10\1\5\2\10\1\5\154\10\41\5\153\10\22\5"+
    "\100\10\2\5\66\10\50\5\15\10\3\5\20\0\20\5"+
    "\20\0\3\5\2\10\30\5\3\10\31\5\1\10\6\5"+
    "\5\10\1\5\207\10\2\5\1\0\4\5\1\10\13\5"+
    "\12\0\7\5\32\10\4\5\1\10\1\5\32\10\13\5"+
    "\131\10\3\5\6\10\2\5\6\10\2\5\6\10\2\5"+
    "\3\10\3\5\2\10\3\5\2\10\22\5\3\0\4\5"+
    "\14\10\1\5\32\10\1\5\23\10\1\5\2\10\1\5"+
    "\17\10\2\5\16\10\42\5\173\10\105\5\65\10\210\5"+
    "\1\0\202\5\35\10\3\5\61\10\17\5\1\0\37\5"+
    "\40\10\15\5\36\10\5\5\46\10\5\0\5\5\36\10"+
    "\2\5\44\10\4\5\10\10\1\5\5\10\52\5\236\10"+
    "\2\5\12\0\6\5\44\10\4\5\44\10\4\5\50\10"+
    "\10\5\64\10\234\5\67\10\11\5\26\10\12\5\10\10"+
    "\230\5\6\10\2\5\1\10\1\5\54\10\1\5\2\10"+
    "\3\5\1\10\2\5\27\10\12\5\27\10\11\5\37\10"+
    "\101\5\23\10\1\5\2\10\12\5\26\10\12\5\32\10"+
    "\106\5\70\10\6\5\2\10\100\5\1\10\3\0\1\5"+
    "\2\0\5\5\4\0\4\10\1\5\3\10\1\5\35\10"+
    "\2\5\3\0\4\5\1\0\40\5\35\10\3\5\35\10"+
    "\43\5\10\10\1\5\34\10\2\0\31\5\66\10\12\5"+
    "\26\10\12\5\23\10\15\5\22\10\156\5\111\10\67\5"+
    "\63\10\15\5\63\10\15\5\44\10\4\0\10\5\12\0"+
    "\u0146\5\52\10\1\5\2\0\3\5\2\10\116\5\35\10"+
    "\12\5\1\10\10\5\26\10\13\0\137\5\25\10\33\5"+
    "\27\10\11\5\3\0\65\10\17\0\37\5\12\0\17\5"+
    "\4\0\55\10\13\0\2\5\1\0\17\5\1\0\2\5"+
    "\31\10\7\5\12\0\6\5\3\0\44\10\16\0\1\5"+
    "\12\0\4\5\1\10\2\0\1\10\10\5\43\10\1\0"+
    "\2\5\1\10\11\5\3\0\60\10\16\0\4\10\4\5"+
    "\4\0\1\5\14\0\1\10\1\5\1\10\43\5\22\10"+
    "\1\5\31\10\14\0\6\5\1\0\101\5\7\10\1\5"+
    "\1\10\1\5\4\10\1\5\17\10\1\5\12\10\7\5"+
    "\57\10\14\0\5\5\12\0\6\5\4\0\1\5\10\10"+
    "\2\5\2\10\2\5\26\10\1\5\7\10\1\5\2\10"+
    "\1\5\5\10\1\5\2\0\1\10\7\0\2\5\2\0"+
    "\2\5\3\0\2\5\1\10\6\5\1\0\5\5\5\10"+
    "\2\0\2\5\7\0\3\5\5\0\213\5\65\10\22\0"+
    "\4\10\5\5\12\0\4\5\1\0\3\10\36\5\60\10"+
    "\24\0\2\10\1\5\1\10\10\5\12\0\246\5\57\10"+
    "\7\0\2\5\11\0\27\5\4\10\2\0\42\5\60\10"+
    "\21\0\3\5\1\10\13\5\12\0\46\5\53\10\15\0"+
    "\1\10\7\5\12\0\66\5\33\10\2\5\17\0\4\5"+
    "\12\0\306\5\54\10\17\0\145\5\100\10\12\0\25\5"+
    "\10\10\2\5\1\10\2\5\10\10\1\5\2\10\1\5"+
    "\30\10\6\0\1\5\2\0\2\5\4\0\1\10\1\0"+
    "\1\10\2\0\14\5\12\0\106\5\10\10\2\5\47\10"+
    "\7\0\2\5\7\0\1\10\1\5\1\10\1\0\33\5"+
    "\1\10\12\0\50\10\7\0\1\10\4\0\10\5\1\0"+
    "\10\5\1\10\13\0\56\10\20\0\3\5\1\10\42\5"+
    "\71\10\7\5\11\10\1\5\45\10\10\0\1\5\10\0"+
    "\1\10\17\5\12\0\30\5\36\10\2\5\26\0\1\5"+
    "\16\0\111\5\7\10\1\5\2\10\1\5\46\10\6\0"+
    "\3\5\1\0\1\5\2\0\1\5\7\0\1\10\1\0"+
    "\10\5\12\0\6\5\6\10\1\5\2\10\1\5\40\10"+
    "\5\0\1\5\2\0\1\5\5\0\1\10\7\5\12\0"+
    "\u0136\5\23\10\4\0\271\5\1\10\54\5\4\10\37\5"+
    "\232\10\146\5\157\10\21\5\304\10\274\5\57\10\1\5"+
    "\11\0\307\5\107\10\271\5\71\10\7\5\37\10\1\5"+
    "\12\0\146\5\36\10\2\5\5\0\13\5\60\10\7\0"+
    "\11\5\4\10\14\5\12\0\11\5\25\10\5\5\23\10"+
    "\260\5\100\10\200\5\113\10\4\5\1\0\1\10\67\0"+
    "\7\5\4\0\15\10\100\5\2\10\1\5\1\10\1\0"+
    "\13\5\2\0\16\5\370\10\10\5\326\10\52\5\11\10"+
    "\367\5\37\10\61\5\3\10\21\5\4\10\10\5\u018c\10"+
    "\4\5\153\10\5\5\15\10\3\5\11\10\7\5\12\10"+
    "\3\5\2\0\1\5\4\0\301\5\5\0\3\5\26\0"+
    "\2\5\7\0\36\5\4\0\224\5\3\0\273\5\125\10"+
    "\1\5\107\10\1\5\2\10\2\5\1\10\2\5\2\10"+
    "\2\5\4\10\1\5\14\10\1\5\1\10\1\5\7\10"+
    "\1\5\101\10\1\5\4\10\2\5\10\10\1\5\7\10"+
    "\1\5\34\10\1\5\4\10\1\5\5\10\1\5\1\10"+
    "\3\5\7\10\1\5\u0154\10\2\5\31\10\1\5\31\10"+
    "\1\5\37\10\1\5\31\10\1\5\37\10\1\5\31\10"+
    "\1\5\37\10\1\5\31\10\1\5\37\10\1\5\31\10"+
    "\1\5\10\10\2\5\151\0\4\5\62\0\10\5\1\0"+
    "\16\5\1\0\26\5\5\0\1\5\17\0\120\5\7\0"+
    "\1\5\21\0\2\5\7\0\1\5\2\0\1\5\5\0"+
    "\325\5\55\10\3\5\7\0\7\10\2\5\12\0\4\5"+
    "\1\10\u0171\5\54\10\16\0\5\5\306\10\13\5\7\0"+
    "\51\5\104\10\7\0\1\10\4\5\12\0\u0156\5\1\10"+
    "\117\5\4\10\1\5\33\10\1\5\2\10\1\5\1\10"+
    "\2\5\1\10\1\5\12\10\1\5\4\10\1\5\1\10"+
    "\1\5\1\10\6\5\1\10\4\5\1\10\1\5\1\10"+
    "\1\5\1\10\1\5\3\10\1\5\2\10\1\5\1\10"+
    "\2\5\1\10\1\5\1\10\1\5\1\10\1\5\1\10"+
    "\1\5\1\10\1\5\2\10\1\5\1\10\2\5\4\10"+
    "\1\5\7\10\1\5\4\10\1\5\4\10\1\5\1\10"+
    "\1\5\12\10\1\5\21\10\5\5\3\10\1\5\5\10"+
    "\1\5\21\10\u0134\5\12\0\6\5\336\10\42\5\65\10"+
    "\13\5\336\10\2\5\u0182\10\16\5\u0131\10\37\5\36\10"+
    "\342\5\113\10\266\5\1\0\36\5\140\0\200\5\360\0"+
    "\20\5";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[31232];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\1"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\1\1\20\1\21\1\22\1\23\10\4"+
    "\1\0\1\24\1\0\1\24\1\25\2\0\1\2\1\0"+
    "\1\26\1\27\1\30\1\31\1\32\4\4\1\33\4\4"+
    "\2\2\1\15\2\4\1\34\5\4\1\35\1\36\3\4"+
    "\1\37\1\4\1\0\1\40\1\41\1\4\1\42\1\0"+
    "\1\43\1\44";

  private static int [] zzUnpackAction() {
    int [] result = new int[80];
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
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\53\0\u0102"+
    "\0\53\0\53\0\u012d\0\53\0\53\0\u0158\0\u0183\0\u01ae"+
    "\0\u01d9\0\u0204\0\u022f\0\u025a\0\53\0\53\0\53\0\u0285"+
    "\0\u02b0\0\u02db\0\u0306\0\u0331\0\u035c\0\u0387\0\u03b2\0\254"+
    "\0\53\0\u0102\0\u0102\0\53\0\u03dd\0\u0408\0\u0433\0\u045e"+
    "\0\53\0\53\0\53\0\53\0\53\0\u0489\0\u04b4\0\u04df"+
    "\0\u050a\0\327\0\u0535\0\u0560\0\u058b\0\u05b6\0\u0408\0\53"+
    "\0\u045e\0\u05e1\0\u060c\0\327\0\u0637\0\u0662\0\u068d\0\u06b8"+
    "\0\u06e3\0\327\0\u070e\0\u0739\0\u0764\0\u078f\0\327\0\u07ba"+
    "\0\u07e5\0\327\0\327\0\u0810\0\327\0\u083b\0\327\0\53";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[80];
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
    "\1\2\1\3\1\4\1\0\1\4\1\2\1\3\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\2\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\6\1\30\1\6\1\31\1\32"+
    "\1\6\1\33\2\6\1\34\1\6\1\35\1\36\1\6"+
    "\1\37\55\0\1\3\4\0\1\3\46\0\1\4\1\0"+
    "\1\4\46\0\7\40\1\41\43\40\1\6\7\0\1\6"+
    "\12\0\1\6\7\0\20\6\7\42\1\0\2\42\1\43"+
    "\40\42\15\0\1\44\60\0\1\45\44\0\1\46\4\0"+
    "\1\47\51\0\1\50\1\0\1\20\55\0\1\51\52\0"+
    "\1\52\52\0\1\53\1\54\51\0\1\55\24\0\1\6"+
    "\7\0\1\6\12\0\1\6\7\0\1\56\20\6\7\0"+
    "\1\6\12\0\1\6\7\0\7\6\1\57\1\60\10\6"+
    "\7\0\1\6\12\0\1\6\7\0\1\61\20\6\7\0"+
    "\1\6\12\0\1\6\7\0\4\6\1\62\14\6\7\0"+
    "\1\6\12\0\1\6\7\0\12\6\1\63\6\6\7\0"+
    "\1\6\12\0\1\6\7\0\16\6\1\64\2\6\7\0"+
    "\1\6\12\0\1\6\7\0\12\6\1\65\6\6\7\0"+
    "\1\6\12\0\1\6\7\0\5\6\1\66\12\6\21\0"+
    "\1\50\1\0\1\45\27\0\2\46\3\0\15\46\1\67"+
    "\27\46\1\0\2\47\1\70\2\0\45\47\24\0\1\71"+
    "\27\0\1\6\7\0\1\6\12\0\1\6\7\0\13\6"+
    "\1\72\5\6\7\0\1\6\12\0\1\6\7\0\13\6"+
    "\1\73\5\6\7\0\1\6\12\0\1\6\7\0\2\6"+
    "\1\74\16\6\7\0\1\6\12\0\1\6\7\0\7\6"+
    "\1\75\11\6\7\0\1\6\12\0\1\6\7\0\6\6"+
    "\1\76\12\6\7\0\1\6\12\0\1\6\7\0\6\6"+
    "\1\77\12\6\7\0\1\6\12\0\1\6\7\0\15\6"+
    "\1\100\3\6\7\0\1\6\12\0\1\6\7\0\6\6"+
    "\1\101\12\6\7\0\1\6\12\0\1\6\7\0\3\6"+
    "\1\102\15\6\7\0\1\6\12\0\1\6\7\0\3\6"+
    "\1\103\15\6\7\0\1\6\12\0\1\6\7\0\13\6"+
    "\1\104\5\6\7\0\1\6\12\0\1\6\7\0\10\6"+
    "\1\105\10\6\7\0\1\6\12\0\1\6\7\0\14\6"+
    "\1\106\4\6\7\0\1\6\12\0\1\6\7\0\3\6"+
    "\1\107\15\6\7\0\1\6\12\0\1\6\7\0\7\6"+
    "\1\110\11\6\5\0\1\111\1\0\1\6\12\0\1\6"+
    "\7\0\21\6\7\0\1\6\12\0\1\6\7\0\3\6"+
    "\1\112\15\6\7\0\1\6\12\0\1\6\7\0\14\6"+
    "\1\113\4\6\7\0\1\6\12\0\1\6\7\0\1\6"+
    "\1\114\17\6\7\0\1\6\12\0\1\6\7\0\3\6"+
    "\1\115\14\6\41\0\1\116\11\0\1\6\7\0\1\6"+
    "\12\0\1\6\7\0\5\6\1\117\12\6\37\0\1\120"+
    "\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2150];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\1\1\2\11\1\1\2\11"+
    "\7\1\3\11\10\1\1\0\1\11\1\0\1\1\1\11"+
    "\2\0\1\1\1\0\5\11\12\1\1\11\20\1\1\0"+
    "\4\1\1\0\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[80];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */

    private Symbol sym(int type)
    {
         return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symVal(int type)
    {
         return new Symbol(type, yyline, yycolumn, yytext());
    }
   


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  private final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  private final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  private final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  private final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  private final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  private final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  private final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  private final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  private void yypushback(int number)  {
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
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(Terminals.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new RuntimeException("Illegal Symbol '" + yytext() + '\''
             + " in line " + yyline + ", column" + yycolumn);
            }
            // fall through
          case 37: break;
          case 2:
            { 
            }
            // fall through
          case 38: break;
          case 3:
            { return sym(SEP);
            }
            // fall through
          case 39: break;
          case 4:
            { return symVal(NAME);
            }
            // fall through
          case 40: break;
          case 5:
            { return symVal(MOD);
            }
            // fall through
          case 41: break;
          case 6:
            { return sym(LPAR);
            }
            // fall through
          case 42: break;
          case 7:
            { return sym(RPAR);
            }
            // fall through
          case 43: break;
          case 8:
            { return symVal(TIMES);
            }
            // fall through
          case 44: break;
          case 9:
            { return symVal(PLUS);
            }
            // fall through
          case 45: break;
          case 10:
            { return sym(COMMA);
            }
            // fall through
          case 46: break;
          case 11:
            { return symVal(MINUS);
            }
            // fall through
          case 47: break;
          case 12:
            { return symVal(DIV);
            }
            // fall through
          case 48: break;
          case 13:
            { return symVal(NUMBER);
            }
            // fall through
          case 49: break;
          case 14:
            { return sym(DOUBLE_POINT);
            }
            // fall through
          case 50: break;
          case 15:
            { return symVal(LOWER_THAN);
            }
            // fall through
          case 51: break;
          case 16:
            { return symVal(GREATER_THAN);
            }
            // fall through
          case 52: break;
          case 17:
            { return sym(QUESTION);
            }
            // fall through
          case 53: break;
          case 18:
            { return symVal(ARR_START);
            }
            // fall through
          case 54: break;
          case 19:
            { return symVal(ARR_END);
            }
            // fall through
          case 55: break;
          case 20:
            { return symVal(STRING);
            }
            // fall through
          case 56: break;
          case 21:
            { return symVal(POW);
            }
            // fall through
          case 57: break;
          case 22:
            { return sym(ASSIGN);
            }
            // fall through
          case 58: break;
          case 23:
            { return symVal(LOWER_EQUAL);
            }
            // fall through
          case 59: break;
          case 24:
            { return symVal(EQUAL);
            }
            // fall through
          case 60: break;
          case 25:
            { return sym(FUNC_EXPRESSION);
            }
            // fall through
          case 61: break;
          case 26:
            { return symVal(GREATER_EQUAL);
            }
            // fall through
          case 62: break;
          case 27:
            { return sym(IF);
            }
            // fall through
          case 63: break;
          case 28:
            { return sym(END_WHILE);
            }
            // fall through
          case 64: break;
          case 29:
            { return sym(CASE_SYMBOL);
            }
            // fall through
          case 65: break;
          case 30:
            { return sym(ELSE);
            }
            // fall through
          case 66: break;
          case 31:
            { return sym(TRUE);
            }
            // fall through
          case 67: break;
          case 32:
            { return sym(FALSE);
            }
            // fall through
          case 68: break;
          case 33:
            { return sym(PRINT);
            }
            // fall through
          case 69: break;
          case 34:
            { return sym(WHILE);
            }
            // fall through
          case 70: break;
          case 35:
            { return sym(SWITCH);
            }
            // fall through
          case 71: break;
          case 36:
            { return sym(ELIF);
            }
            // fall through
          case 72: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
