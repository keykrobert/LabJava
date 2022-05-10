import java.util.Set;

interface Product {
    void purchase();
}

class WhiteProduct implements Product {
    @Override
    public void purchase() {
        System.out.println("You are purchase white product");
    }
}

class BlackProduct implements Product {
    @Override
    public void purchase() {
        System.out.println("You are purchase black product");
    }
}

class RedProduct implements Product {
    @Override
    public void purchase() {
        System.out.println("You are purchase red product");
    }
}

enum ProductTypes {
    WHITE,
    BLACK,
    RED
}

class ProductFactory {
    public Product getProduct(ProductTypes type) {
        Product toReturn = null;
        switch (type) {
            case WHITE:
                toReturn = new WhiteProduct();
                break;
            case BLACK:
                toReturn = new BlackProduct();
                break;
            case RED:
                toReturn = new RedProduct();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return toReturn;
    }
}

class Factory {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        Product white = factory.getProduct(ProductTypes.WHITE);
        Product black = factory.getProduct(ProductTypes.BLACK);
        Product red = factory.getProduct(ProductTypes.RED);

        white.purchase();
        black.purchase();
        red.purchase();
    }
} //classic Factory

abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}

class PC extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}

class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

}

interface ComputerAbstractFactory {

    public Computer createComputer();

}

class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }

}

class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }

}

class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}

class TestAbstract {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("16 GB", "1000 GB", "5 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }

}//abstract


class PersonBuilder {

    private String name;
    private String surname;
    private String specialization;
    private int course;
    private int age;
    private int height;
    private int weight;
    private Set<PersonBuilder> parents;



    public static class Builder {
        private PersonBuilder newPerson;

        public Builder() {
            newPerson = new PersonBuilder();
        }

        public Builder withName(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder withSpecialization(String specialization) {
            newPerson.specialization = specialization;
            return this;
        }

        public Builder withCourse(int course) {
            newPerson.course = course;
            return this;
        }

        public Builder withAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height) {
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight) {
            newPerson.weight = weight;
            return this;
        }

        public Builder withParents(Set<PersonBuilder> parents) {
            newPerson.parents = parents;
            return this;
        }

        public PersonBuilder build() {
            return newPerson;
        }

    }

    public static void main(String[] args) {
        PersonBuilder myPerson = new PersonBuilder.Builder()
                .withName("Robert")
                .withSurname("Kek")
                .withSpecialization("Software Eng.")
                .withAge(21)
                .withHeight(174)
                .withWeight(65)
                .build();
        System.out.println(myPerson.specialization);
    }
}

class MyInteger {
    public static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(29));
    }
}

