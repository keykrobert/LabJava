import java.util.ArrayList;
import java.util.List;


class PartTime {

    public List<PartTime> data = new ArrayList<PartTime>();
    public int employeeKey;
    public String name;
    public int salary;

    public int days;

    public int rate;

    public PartTime(int employeeKey, String name, int days, int rate) {
        this.employeeKey = employeeKey;
        this.name = name;
        this.days = days;
        this.rate = rate;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setEmployeeKey(int employeeKey) {
        this.employeeKey = employeeKey;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getEmployeeKey() {
        return this.employeeKey;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return getRate() * 8 * getDays();
    }

    public boolean addEmployer(PartTime employer) {
        if (employer == null || data.contains(employer)) {
            return false;
        }
        data.add(employer);
        return true;
    }

    public void printEmployer(PartTime employer) {
        System.out.println("key: " + employer.employeeKey + " \nName: " + employer.getName() + " \nSalary: " + employer.getSalary());
    }

    public PartTime getByKey(int key) {
        PartTime result = null;
        for (PartTime employer : data) {
            if (employer.getEmployeeKey() == key) {
                result = employer;
            }
        }
        return result;
    }

    public int totalSalary() {
        int totalSalary = 0;
        for (PartTime employer : data) {
            totalSalary += employer.getSalary();
        }
        return totalSalary;
    }

    public int highestSalary() {
        int max = 0;
        int key = 0;
        for (PartTime employer : data) {

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
        for (PartTime employer : data) {

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
        for (PartTime employer : data) {
            sum += employer.getSalary();
            count++;
        }
        return sum / count;
    }

    public void printEmployee() {
        for (PartTime employer : data) {
            System.out.println("\nkey: " + employer.employeeKey + " \nName: " + employer.getName() + " \nSalary: " + employer.getSalary());
        }
    }

}

class FullDayEmployee {
    public List<FullDayEmployee> data = new ArrayList<FullDayEmployee>();
    public int employeeKey;
    public String name;
    public int salary;

    public int rate;

    public int hours;

    public FullDayEmployee(int employeeKey, String name, int rate, int hours) {
        this.employeeKey = employeeKey;
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = rate;
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
        return this.rate * this.hours;
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
        FullDayEmployee fullDayEmployee = new FullDayEmployee(48, "Mark", 100, 140);
        fullDayEmployee.addEmployer(new FullDayEmployee(49, "Carl", 260, 100));
        fullDayEmployee.addEmployer(new FullDayEmployee(50, "Vasa", 220, 180));
        fullDayEmployee.addEmployer(new FullDayEmployee(60, "Adalbert", 150, 150));

        fullDayEmployee.data.add(fullDayEmployee);

        System.out.println("Example with full time: ");
        fullDayEmployee.printEmployee();
        System.out.println("Total salary: " + fullDayEmployee.totalSalary());
        System.out.println("\nHighest salary: ");
        fullDayEmployee.printEmployer(fullDayEmployee.getByKey(fullDayEmployee.highestSalary()));
        System.out.println("\nLowest salary: ");
        fullDayEmployee.printEmployer(fullDayEmployee.getByKey(fullDayEmployee.lowestSalary()));
        System.out.println("\nAverage salary: " + fullDayEmployee.averageSalary());

        PartTime partTime = new PartTime(41, "Mark", 20,  150);
        partTime.addEmployer(new PartTime(412, "Carl", 20, 250));
        partTime.addEmployer(new PartTime(4241, "Vasa", 15, 180));
        partTime.addEmployer(new PartTime(421, "Adalbert", 20, 400));

        System.out.println("Example with part time: ");
        partTime.printEmployee();
        System.out.println("Total salary: " + partTime.totalSalary());
        System.out.println("\nHighest salary: ");
        partTime.printEmployer(partTime.getByKey(partTime.highestSalary()));
        System.out.println("\nLowest salary: ");
        partTime.printEmployer(partTime.getByKey(partTime.lowestSalary()));
        System.out.println("\nAverage salary: " + partTime.averageSalary());

        if (fullDayEmployee.averageSalary() > partTime.averageSalary()) {
            System.out.println("Full time get more salary !");
        } else if (fullDayEmployee.averageSalary() < partTime.averageSalary()) {
            System.out.println("Part-time get more salary !");
        } else {
            System.out.println("Full time == Part-time");
        }
    }
}
