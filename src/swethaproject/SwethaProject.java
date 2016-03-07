/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swethaproject;

import javassist.*;
/**
 *
 * @author i070514ÏÏÏ
 */
public class SwethaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try{
            ClassPool cp = ClassPool.getDefault();
            CtClass cc = cp.get("swethaproject.Hello");
            CtMethod m = cc.getDeclaredMethod("say");
            m.insertBefore("{ int x=0; "
                    + "System.out.println(\"Vinay loves swetha more than ever, muuuuah <3\"); }");
            Class c = cc.toClass();
            Hello h = (Hello)c.newInstance();
            h.say();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }   
}
