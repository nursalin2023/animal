public class Main {
    public static void main(String[] args) {
        Fishn12 fishn12 =new Fishn12();
        fishn12.setName("karas");
        fishn12.setAge(3);
        fishn12.setWeight("5");
        System.out.println(fishn12.getName()+ "\n" + fishn12.getAge()+ "\n" + fishn12.getWeight());
        /////////////////////
        Cat12 cat12 = new Cat12();
        cat12.setName("kisa");
        cat12.setAge(2);
        cat12.setColor("black");
        cat12.setWeing("3");
        System.out.println(cat12.getName()+ "\n " + cat12.getAge()+ "\n" + cat12.getColor() + "\n" + cat12.getWeing());
        ///////////////////////
        Parrot parrot = new Parrot() ;
        parrot.setName("alex");
        parrot.setAge(4);
        parrot.setColor("yellow");
        System.out.println(parrot.getName()+ "\n" + parrot.getAge()+ "\n" + parrot.getColor());
        ////////////////////////
        Dog dog = new Dog();
        dog.setName("ball");
        dog.setAge(6);
        dog.setWeingth("18");
        System.out.println(dog.getName()+ "\n" + dog.getAge() + "\n" + dog.getWeingth());
    }
}