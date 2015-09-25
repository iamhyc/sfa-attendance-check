/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

/**
 *
 * @author iamhy_000
 */
public class req implements java.io.Serializable{
    
    public String type;
    public Object finder, newer;
    
    public req(String type){
        this.type = type;
    }
    
    public req(String type, Object obj){
        this.type = type;
        this.finder = obj;
    }
    
    public req(String type, Object obj1, Object obj2){
        this.type = type;
        this.finder = obj1;
        this.newer = obj2;
    }
    
}
