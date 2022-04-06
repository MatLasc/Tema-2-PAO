public class Application {
    public static void main(String[] args) {
        Pets getter = new Pets();
        Pet pet1 = getter.get_pet("Dog");
        Pet pet2 = getter.get_pet("Cat");
        System.out.print("Dog goes ");
        pet1.sound();
        System.out.print("and cat goes ");
        pet2.sound();
    }
}
