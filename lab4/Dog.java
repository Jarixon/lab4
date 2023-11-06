public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", "Bulldog");
        Dog dog2 = new Dog("Buddy", "Labrador");

        // Modificăm proprietățile folosind setter-ele
        dog1.setName("Max");
        dog2.setBreed("Golden Retriever");

        // Afișăm proprietățile folosind getter-ele
        System.out.println("Câinele 1: " + dog1.getName() + " (" + dog1.getBreed() + ")");
        System.out.println("Câinele 2: " + dog2.getName() + " (" + dog2.getBreed() + ")");
    }
}
