/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

/**
 *
 * @author NABILA
 */
class GenericClass<T> {
    private T data;
    
    public GenericClass(T data){
        this.data = data;
    }
    
    public T getData(){
        return this.data;
    }
    
}
