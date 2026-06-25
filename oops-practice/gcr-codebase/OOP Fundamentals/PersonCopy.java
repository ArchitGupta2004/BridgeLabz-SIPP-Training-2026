public class PersonCopy {
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Copy constructor
        public Person(Person other) {
            this.name = other.name;
            this.age = other.age;
        }

        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person(p1); // using copy constructor

        System.out.println("Original Person:");
        p1.display();

        System.out.println("Copied Person:");
        p2.display();
    }
}
