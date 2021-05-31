/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springinterface;


public class Car implements EngineMountable {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void mount(Engine e)
    {
        //System.out.println("interface");
    }
  public void show(){
       System.out.println("interface"+engine.getStrName());
  }
}

 interface EngineMountable {
    void mount(Engine engine);
}
