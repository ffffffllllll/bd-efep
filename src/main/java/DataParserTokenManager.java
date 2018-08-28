/***********************************************************************

	This file is part of KEEL-software, the Data Mining tool for regression, 
	classification, clustering, pattern mining and so on.

	Copyright (C) 2004-2010
	
	F. Herrera (herrera@decsai.ugr.es)
        L. Sanchez (luciano@uniovi.es)
        J. Alcala-Fdez (jalcala@decsai.ugr.es)
        S. Garcia (sglopez@ujaen.es)
        A. Fernandez (alberto.fernandez@ujaen.es)
        J. Luengo (julianlm@decsai.ugr.es)

	This program is free software: you can redistribute it and/or modify
	it under the terms of the GNU General Public License as published by
	the Free Software Foundation, either version 3 of the License, or
	(at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program.  If not, see http://www.gnu.org/licenses/
  
**********************************************************************/

/* Generated By:JavaCC: Do not edit this line. DataParserTokenManager.java */

import java.io.*;
import java.util.*;
import java.lang.*;

public class DataParserTokenManager implements DataParserConstants
{
  public static void CommonTokenAction(Token t) {

        /*if (t.kind == ATTRIBUTE || t.kind == INPUTS || t.kind == OUTPUTS ||
            t.kind == DATA)
            System.out.println();
        System.out.print(t.image+" ");
        */

        if (DataParser.tokenImage[t.kind].toString().equals("<ERR_LEX>")){
                System.out.println("ERR_LEX:  Character ["+t.image+"] unknown in line "+t.beginLine+" and column "+t.beginColumn);
        }

  }
  public static  PrintStream debugStream = System.out;
  public static  void setDebugStream(PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1f00L) != 0L)
            return 16;
         if ((active0 & 0x6000L) != 0L)
         {
            jjmatchedKind = 27;
            return 45;
         }
         return -1;
      case 1:
         if ((active0 & 0x6000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 1;
            return 45;
         }
         if ((active0 & 0x100L) != 0L)
            return 15;
         return -1;
      case 2:
         if ((active0 & 0x100L) != 0L)
            return 14;
         if ((active0 & 0x6000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 2;
            return 45;
         }
         return -1;
      case 3:
         if ((active0 & 0x4000L) != 0L)
            return 45;
         if ((active0 & 0x100L) != 0L)
            return 13;
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 3;
            return 45;
         }
         return -1;
      case 4:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 4;
            return 45;
         }
         if ((active0 & 0x100L) != 0L)
            return 12;
         return -1;
      case 5:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 5;
            return 45;
         }
         if ((active0 & 0x100L) != 0L)
            return 11;
         return -1;
      case 6:
         if ((active0 & 0x100L) != 0L)
            return 10;
         if ((active0 & 0x2000L) != 0L)
            return 45;
         return -1;
      case 7:
         if ((active0 & 0x100L) != 0L)
            return 5;
         return -1;
      case 8:
         if ((active0 & 0x100L) != 0L)
            return 68;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 44:
         return jjStopAtPos(0, 20);
      case 59:
         return jjStopAtPos(0, 21);
      case 64:
         return jjMoveStringLiteralDfa1_0(0x1f00L);
      case 91:
         return jjStopAtPos(0, 16);
      case 93:
         return jjStopAtPos(0, 17);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 123:
         return jjStopAtPos(0, 18);
      case 125:
         return jjStopAtPos(0, 19);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x5000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x2200L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 76:
      case 108:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 45);
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x1a00L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(4, 12);
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x500L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 66:
      case 98:
         return jjMoveStringLiteralDfa7_0(active0, 0x200L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 82:
      case 114:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 45);
         break;
      case 83:
      case 115:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(6, 10);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 79:
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      case 83:
      case 115:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(7, 11);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa8_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(8, 8, 68);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private final int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(9, 9);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
static private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
static private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec1 = {
   0x0L, 0x0L, 0x8000000200000000L, 0x0L
};
static private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 68;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 68:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 0:
                  if ((0xf7ffe08200000000L & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     jjCheckNAdd(45);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(43, 44);
                  else if (curChar == 37)
                     jjCheckNAddStates(3, 5);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                     jjCheckNAddStates(6, 13);
                  }
                  else if ((0xf400e08200000000L & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                  }
                  if (curChar == 45)
                     jjCheckNAddTwoStates(51, 52);
                  else if (curChar == 39)
                     jjCheckNAddTwoStates(47, 48);
                  else if (curChar == 46)
                     jjCheckNAdd(37);
                  else if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 26;
                  else if (curChar == 63)
                  {
                     if (kind > 22)
                        kind = 22;
                  }
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 3:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 7:
                  if ((0x2400L & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 8:
                  if (curChar == 10 && kind > 7)
                     kind = 7;
                  break;
               case 9:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 19:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(20);
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(20);
                  break;
               case 21:
                  if (curChar == 63 && kind > 22)
                     kind = 22;
                  break;
               case 22:
                  if (curChar == 62 && kind > 22)
                     kind = 22;
                  break;
               case 27:
                  if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 36:
                  if (curChar == 46)
                     jjCheckNAdd(37);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddStates(14, 16);
                  break;
               case 39:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(40);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddTwoStates(40, 41);
                  break;
               case 42:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(43, 44);
                  break;
               case 43:
                  if ((0xffffffff00000000L & l) != 0L)
                     jjCheckNAddTwoStates(43, 44);
                  break;
               case 44:
                  if (curChar == 34 && kind > 26)
                     kind = 26;
                  break;
               case 45:
                  if ((0xf7ffe08200000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(45);
                  break;
               case 46:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(47, 48);
                  break;
               case 47:
                  if ((0xf7ffe08300000000L & l) != 0L)
                     jjCheckNAddTwoStates(47, 48);
                  break;
               case 48:
                  if (curChar == 39 && kind > 27)
                     kind = 27;
                  break;
               case 49:
                  if ((0xf400e08200000000L & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 50:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(51, 52);
                  break;
               case 51:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(51);
                  break;
               case 52:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(52, 53);
                  break;
               case 53:
                  if (curChar != 46)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddStates(17, 19);
                  break;
               case 54:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddStates(17, 19);
                  break;
               case 56:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(57);
                  break;
               case 57:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddTwoStates(57, 41);
                  break;
               case 58:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAddStates(6, 13);
                  break;
               case 59:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(59);
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(60, 61);
                  break;
               case 62:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(63);
                  break;
               case 63:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAddTwoStates(63, 41);
                  break;
               case 64:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(20, 22);
                  break;
               case 66:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(67);
                  break;
               case 67:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(67, 41);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 68:
               case 6:
                  jjCheckNAddStates(0, 2);
                  break;
               case 0:
                  if ((0x47fffffe97fffffeL & l) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                  }
                  else if (curChar == 64)
                     jjstateSet[jjnewStateCnt++] = 16;
                  if ((0x47fffffe97fffffeL & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     jjCheckNAdd(45);
                  }
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 34;
                  else if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  else if ((0x2000000020L & l) != 0L)
                     jjAddStates(23, 24);
                  break;
               case 1:
                  jjAddStates(3, 5);
                  break;
               case 5:
                  if ((0x400000004000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 10:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 11:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 64)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(23, 24);
                  break;
               case 23:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 28:
                  if ((0x2000000020L & l) != 0L && kind > 24)
                     kind = 24;
                  break;
               case 29:
                  if ((0x20000000200000L & l) != 0L)
                     jjCheckNAdd(28);
                  break;
               case 30:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if ((0x8000000080000L & l) != 0L)
                     jjCheckNAdd(28);
                  break;
               case 33:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 35:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 38:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(25, 26);
                  break;
               case 41:
                  if ((0x5000000050L & l) != 0L && kind > 25)
                     kind = 25;
                  break;
               case 43:
                  if ((0x47ffffffffffffffL & l) != 0L)
                     jjAddStates(27, 28);
                  break;
               case 45:
                  if ((0x47fffffe97fffffeL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(45);
                  break;
               case 47:
                  if ((0x47fffffe97fffffeL & l) != 0L)
                     jjAddStates(29, 30);
                  break;
               case 49:
                  if ((0x47fffffe97fffffeL & l) != 0L && kind > 29)
                     kind = 29;
                  break;
               case 55:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(31, 32);
                  break;
               case 61:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(33, 34);
                  break;
               case 65:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(35, 36);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 68:
               case 6:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 0:
                  if ((jjbitVec1[i2] & l2) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     jjCheckNAdd(45);
                  }
                  if ((jjbitVec1[i2] & l2) != 0L)
                  {
                     if (kind > 29)
                        kind = 29;
                  }
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 5);
                  break;
               case 43:
                  if ((jjbitVec1[i2] & l2) != 0L)
                     jjAddStates(27, 28);
                  break;
               case 45:
                  if ((jjbitVec1[i2] & l2) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(45);
                  break;
               case 47:
                  if ((jjbitVec1[i2] & l2) != 0L)
                     jjAddStates(29, 30);
                  break;
               case 49:
                  if ((jjbitVec1[i2] & l2) != 0L && kind > 29)
                     kind = 29;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 68 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   6, 7, 9, 1, 2, 4, 59, 52, 53, 60, 61, 64, 65, 41, 37, 38, 
   41, 54, 55, 41, 64, 65, 41, 19, 20, 39, 40, 43, 44, 47, 48, 56, 
   57, 62, 63, 66, 67, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, "\133", "\135", "\173", "\175", "\54", "\73", null, null, null, 
null, null, null, null, null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x7fffff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[68];
static private final int[] jjstateSet = new int[136];
static protected char curChar;
public DataParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}
public DataParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 68; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

public static Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      CommonTokenAction(matchedToken);
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002700L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 30)
   {
      jjmatchedKind = 30;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         CommonTokenAction(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}

