public class dog extends mammal{
    public dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("woof");
    }
    public void greets(dog d) {
        System.out.println("Wooooof");
    }
    @Override
    public void aanimal(){
        System.out.println("animal: dog");
    }
}
