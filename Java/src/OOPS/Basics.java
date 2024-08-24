package OOPS;

public class Basics {

    class Employee {
        private int id;
        private String name;
        public String company = "XYZ";

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void display() {
            System.out.println("Id: " + id + " Name: " + name);
        }

    }

    class Animal {
        public void display() {
            System.out.println("I am an animal");
        }
    }

    class Dog extends Animal {
        @Override
        public void display() {
            System.out.println("I am a dog");
        }
    }

    class MathOperation {
        public int add(int a, int b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        Basics obj = new Basics();
        Employee emp = obj.new Employee(1, "John");
        emp.display();
        Dog dog = obj.new Dog();
        dog.display();
        MathOperation math = obj.new MathOperation();
        System.out.println(math.add(1, 3, 2));
    }
}
