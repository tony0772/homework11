package excercise2and3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Maria", 25, "Brown"));
        persons.add(new Person("Marcel", 30, "Blonde"));
        persons.add(new Person("Marcela", 35, "Black"));
        persons.add(new Person("Claudia", 40, "Brown"));

        List<String> personNames = new ArrayList<>();
        for (Person person : persons) {
            personNames.add(person.name);
        }

        Map<String, Integer> nameToAgeMap = new HashMap<>();
        for (Person person : persons) {
            nameToAgeMap.put(person.name, person.age);
        }

        int givenAge = 30;
        List<Person> olderPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.age > givenAge) {
                olderPersons.add(person);
            }
        }

        Map<String, List<String>> hairColorToNameMap = new HashMap<>();
        for (Person person : persons) {
            if (!hairColorToNameMap.containsKey(person.hairColor)) {
                hairColorToNameMap.put(person.hairColor, new ArrayList<>());
            }
            hairColorToNameMap.get(person.hairColor).add(person.name);
        }

        Map<Integer, List<Person>> ageToPersonsMap = new HashMap<>();
        for (Person person : persons) {
            if (!ageToPersonsMap.containsKey(person.age)) {
                ageToPersonsMap.put(person.age, new ArrayList<>());
            }
            ageToPersonsMap.get(person.age).add(person);
        }

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ionel", 25, "Brown", "CompanyA", 50000));
        employees.add(new Employee("Cristi", 30, "Blonde", "CompanyB", 60000));
        employees.add(new Employee("Mirela", 35, "Black", "CompanyA", 75000));
        employees.add(new Employee("George", 40, "Brown", "CompanyC", 80000));


        double specifiedSalary = 70000;
        List<Person> highSalaryPersons = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.salary > specifiedSalary) {
                highSalaryPersons.add(employee);
            }
        }

        Map<String, List<Person>> companyToPersonsMap = new HashMap<>();
        for (Employee employee : employees) {
            if (!companyToPersonsMap.containsKey(employee.company)) {
                companyToPersonsMap.put(employee.company, new ArrayList<>());
            }
            companyToPersonsMap.get(employee.company).add(employee);
        }

        double totalSalaries = 0;
        for (Employee employee : employees) {
            totalSalaries += employee.salary;
        }

        Map<String, Double> companyToTotalSalaryMap = new HashMap<>();
        for (Employee employee : employees) {
            if (!companyToTotalSalaryMap.containsKey(employee.company)) {
                companyToTotalSalaryMap.put(employee.company, 0.0);
            }
            companyToTotalSalaryMap.put(employee.company, companyToTotalSalaryMap.get(employee.company) + employee.salary);
        }

        String companyWithMaxSalary = null;
        double maxSalary = 0;
        for (Map.Entry<String, Double> entry : companyToTotalSalaryMap.entrySet()) {
            if (entry.getValue() > maxSalary) {
                maxSalary = entry.getValue();
                companyWithMaxSalary = entry.getKey();
            }
        }
    }
    }
