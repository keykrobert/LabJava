import java.util.ArrayList;
import java.util.List;

//interface Employer {
//
//    public void setEmployeeKey(int employeeKey, String name, int salary);
//    public void setEmployeeKey(int employeeKey);
//    public void setName(String name);
//    public void setSalary(int salary);
//    public int getEmployeeKey();
//    public String getName();
//    public int getSalary();
//    public boolean addEmployer(Constructor employer);
//    public void printEmployer(Constructor employer);
//}

class Employee {

    public List<Employee> data = new ArrayList<Employee>();
    public int employeeKey;
    public String name;
    public int salary;

    public Employee(int employeeKey, String name, int salary) {
        this.employeeKey = employeeKey;
        this.name = name;
        this.salary = salary;
    }

    public void setEmployeeKey(int employeeKey) {
        this.employeeKey = employeeKey;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeKey() {
        return this.employeeKey;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public boolean addEmployer(Employee employer) {
        if (employer == null || data.contains(employer)) {
            return false;
        }
        data.add(employer);
        return true;
    }

    public void printEmployer(FullDayEmployee employer) {
        System.out.println("key: " + employer.employeeKey + " \nName: " + employer.getName() + " \nSalary: " + employer.getSalary());
    }

    public Employee getByKey(int key) {
        Employee result = null;
        for (Employee employer : data) {
            if (employer.getEmployeeKey() == key) {
                result = employer;
            }
        }
        return result;
    }

    public int totalSalary() {
        int totalSalary = 0;
        for (Employee employer : data) {
            totalSalary += employer.getSalary();
        }
        return totalSalary;
    }

    public int highestSalary() {
        int max = 0;
        int key = 0;
        for (Employee employer : data) {

            if (employer.getSalary() > max) {
                max = employer.getSalary();
                key = employer.getEmployeeKey();
            }
        }
        return key;
    }

    public int lowestSalary() {
        int min = 999999999;
        int key = 0;
        for (Employee employer : data) {

            if (employer.getSalary() < min) {
                min = employer.getSalary();
                key = employer.getEmployeeKey();
            }
        }
        return key;
    }

    public int averageSalary() {
        int sum = 0;
        int count = 0;
        for (Employee employer : data) {
            sum += employer.getSalary();
            count++;
        }
        return sum / count;
    }

    public void printEmployee() {
        for (Employee employer : data) {
            System.out.println("\nkey: " + employer.employeeKey + " \nName: " + employer.getName() + " \nSalary: " + employer.getSalary());
        }
    }

}

class FullDayEmployee {
    public List<FullDayEmployee> data = new ArrayList<FullDayEmployee>();
    public int employeeKey;
    public String name;
    public int salary;

    public FullDayEmployee(int employeeKey, String name, int salary) {
        this.employeeKey = employeeKey;
        this.name = name;
        this.salary = salary;
    }

    public void setEmployeeKey(int employeeKey) {
        this.employeeKey = employeeKey;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeKey() {
        return this.employeeKey;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public boolean addEmployer(FullDayEmployee employer) {
        if (employer == null || data.contains(employer)) {
            return false;
        }
        data.add(employer);
        return true;
    }

    public void printEmployer(FullDayEmployee employer) {
        System.out.println("key: " + employer.employeeKey + " \nName: " + employer.getName() + " \nSalary: " + employer.getSalary());
    }

    public FullDayEmployee getByKey(int key) {
        FullDayEmployee result = null;
        for (FullDayEmployee employer : data) {
            if (employer.getEmployeeKey() == key) {
                result = employer;
            }
        }
        return result;
    }

    public int totalSalary() {
        int totalSalary = 0;
        for (FullDayEmployee employer : data) {
            totalSalary += employer.getSalary();
        }
        return totalSalary;
    }

    public int highestSalary() {
        int max = 0;
        int key = 0;
        for (FullDayEmployee employer : data) {

            if (employer.getSalary() > max) {
                max = employer.getSalary();
                key = employer.getEmployeeKey();
            }
        }
        return key;
    }

    public int lowestSalary() {
        int min = 999999999;
        int key = 0;
        for (FullDayEmployee employer : data) {

            if (employer.getSalary() < min) {
                min = employer.getSalary();
                key = employer.getEmployeeKey();
            }
        }
        return key;
    }

    public int averageSalary() {
        int sum = 0;
        int count = 0;
        for (FullDayEmployee employer : data) {
            sum += employer.getSalary();
            count++;
        }
        return sum / count;
    }

    public void printEmployee() {
        for (FullDayEmployee employer : data) {
            System.out.println("\nkey: " + employer.getEmployeeKey() + " \nName: " + employer.getName() + " \nSalary: " + employer.getSalary());
        }
    }

}

class Checker {
    static public void main(String args[]) {
        FullDayEmployee fullDayEmployee = new FullDayEmployee(48, "Mark", 1000);
        fullDayEmployee.addEmployer(new FullDayEmployee(49, "Carl", 1200));
        fullDayEmployee.addEmployer(new FullDayEmployee(50, "Vasa", 3300));
        fullDayEmployee.addEmployer(new FullDayEmployee(60, "Adalbert", 600));

        fullDayEmployee.data.add(fullDayEmployee);

        System.out.println("Example with full time: ");
        fullDayEmployee.printEmployee();
        System.out.println("Total salary: " + fullDayEmployee.totalSalary());
        System.out.println("\nHighest salary: ");
        fullDayEmployee.printEmployer(fullDayEmployee.getByKey(fullDayEmployee.highestSalary()));
        System.out.println("\nLowest salary: ");
        fullDayEmployee.printEmployer(fullDayEmployee.getByKey(fullDayEmployee.lowestSalary()));
        System.out.println("\nAverage salary: " + fullDayEmployee.averageSalary());

        Employee employee = new Employee(41, "Mark", 2000);
        employee.addEmployer(new Employee(412, "Carl", 3000));
        employee.addEmployer(new Employee(4241, "Vasa", 3300));
        employee.addEmployer(new Employee(421, "Adalbert", 6500));

        if (fullDayEmployee.averageSalary() > employee.averageSalary()) {
            System.out.println("Full time get more salary !");
        } else if (fullDayEmployee.averageSalary() < employee.averageSalary()) {
            System.out.println("Part-time get more salary !");
        } else {
            System.out.println("Full time == Part-time");
        }
    }
}
