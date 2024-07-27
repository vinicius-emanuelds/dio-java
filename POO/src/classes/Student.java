package classes;

enum Color {
    FAIR, DARK
}

enum Sex {
    MALE, FEMALE
}

class Food {
    // Propriedades e métodos da classe Food
}

public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Food food) {
        // Implementação para comer
        System.out.println(name + " is eating " + food);
    }

    void drinking(Food food) {
        // Implementação para beber
        System.out.println(name + " is drinking " + food);
    }

    void running() {
        // Implementação para correr
        System.out.println(name + " is running");
    }
}
