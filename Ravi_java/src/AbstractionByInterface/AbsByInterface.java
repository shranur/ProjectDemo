package AbstractionByInterface;  // Interfaces are similar to Abstract class but having all the method of abstract types.
													// Interfaces are the blue print of the class. It specify what a class must do and not how.

//    Use-> 
//               To achieve abstraction, support multiple inheritance, It can be achieve loose coupling
// Loose coupling--> loose coupling is a design goal that seeks to reduce the inter-dependencies b/w components of a system with the goal of 
// reducing the risk that changes in one component will require changes in any other component. Loose coupling is much more generic concept
// Indented to increase the flexibility of system, make it more maintainable and makes the entire framework more stable.


/*  Syntax--->
 * 
 * Interface InterfaceName
 *{
 *
 *  method   (Abstract method only, compiler also put public behind method so all the methods should be public abstract type inside an interface)
 *  
 *               From java 8 onwards we can create concrete method in interface but method needs to be default 
 *               ex--> deafult void display(){
 *               
 *                   //  Body
 *                   
 *                    }
 *             We can also create Static concrete methods from java 8 onwards and access modifier needs to be public
 *             ex--> public static void run(){ // if you dont write public then compiler automatic add it.
 *             
 *                    // Body
 *                    
 *                    }
 *                    
 *                    From java 9 version onward We can create private methods as well.
 *                    
 *                                                             
 *                                                             
 *  Fields  // if we create any field inside an interface then it would be public, static, final
 *  
 *  ex-->   public_static_final int a=10;
 *  
 *  
 *  }
 */

public class AbsByInterface {

}
