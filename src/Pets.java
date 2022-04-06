public class Pets {
    public Pet get_pet(String s){
        if(s.equals("Dog"))
            return new Dog();
        else
            return new Cat();
    }
}

