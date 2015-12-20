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
public class Solution319 {

    public int bulbSwitch(int n) {
        
        //mathmatic question
        //assume 1-100
        //1 will be affected only by 1 
        //2 will be affected only by 1 2 
        //3 will be affected only 1 3 
        //4 will be affected only 1 2 4
        //It is easy to get only M = n * n will be remain on
        int nRet = 0;
        nRet = (int)Math.floor(Math.sqrt(Double.valueOf(n)));
        
        return nRet;
    }

}
