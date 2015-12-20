/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodeyuezhang;

/**
 *
 * @author Administrator
 */
public class Solution214 {

    public String shortestPalindrome(String s) {
        String strRet = "";

        int nLength = s.length();

        if (nLength == 0) {
            return strRet;
        }
        //try from the middle
        //length = 8, start from 
        StringBuffer sbResult = new StringBuffer();
        int nStart = 0;
        int nEnd = 0;
        if (nLength % 2 == 0) {
            nStart = nLength / 2 - 1;
            nEnd = nLength;
        } else {
            nStart = nLength / 2;
            nEnd = nLength / 2;
        }
        
        while(nStart > 0)
        {
            //check
            boolean bFind = true;
        }
            
        
        return strRet;
    }

}
