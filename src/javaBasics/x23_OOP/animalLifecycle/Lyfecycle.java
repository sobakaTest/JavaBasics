package javaBasics.x23_OOP.animalLifecycle;


public class Lyfecycle {

    private Command command;
    public Lyfecycle(Command command){
        this.command = command;
    }
    public void doSomething(){
        command.execute();
    }

}
