public class Main {
    public static void main(String[] args) {
        var male = new Person("Lucas");
        var female = new Person("Amanda");
        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());
    }    
}
