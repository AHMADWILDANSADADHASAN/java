/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconstruction;

/**
 *
 * @author WINDOWS 10
 */
    public class JavaConstruction {
  long  modelNIM;
  String modelName;

  public JavaConstruction( long NIM, String name) {
    modelNIM = NIM;
    modelName = name;
  
  }

    public static void main(String[] args) {
   
        {
    JavaConstruction mymodelNIM = new JavaConstruction(201869040016L, "AHMAD WILDAN SADAD HASAN");
    System.out.println (mymodelNIM.modelNIM + " " + mymodelNIM.modelName);
    
  }
        
}
    }
    

