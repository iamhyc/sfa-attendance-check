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
public class res implements java.io.Serializable{
    
    public boolean flag;
    public String msg;
    
    public Object finder;
    
    public res(boolean flag, String msg){
        this.flag = flag;
        this.msg = msg;
    }
    
    public res(boolean flag, Object obj){
        this.flag = flag;
        this.finder = obj;
    }
}
