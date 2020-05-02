package algorithmSample1.sort;

import algorithmSample1.sortModel.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortSample3 {
    List<Employee> employeeList = new ArrayList<>();

    @Before
    public void beforeClass()  {
        Employee employee1 = Employee.builder()
                .number(1)
                .name("김연아")
                .age(20)
                .build();
        employeeList.add(employee1);

        Employee employee2 = Employee.builder()
                .number(2)
                .name("전지현")
                .age(30)
                .build();
        employeeList.add(employee2);

        Employee employee3 = Employee.builder()
                .number(3)
                .name("진세연")
                .age(25)
                .build();
        employeeList.add(employee3);

        Employee employee4 = Employee.builder()
                .number(4)
                .name("여다경")
                .age(35)
                .build();
        employeeList.add(employee4);

        Employee employee5 = Employee.builder()
                .number(5)
                .name("여다경")
                .age(30)
                .build();
        employeeList.add(employee5);
    }


    @Test
    public void Comparable_정렬_테스트코드1(){
        List<Employee> collect = employeeList
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

//        Employee(number=1, name=김연아, age=20)
//        Employee(number=3, name=진세연, age=25)
//        Employee(number=2, name=전지현, age=30)
//        Employee(number=4, name=여다경, age=35)
    }

    @Test
    public void Comparable_역순_정렬_테스트코드1(){
        List<Employee> collect = employeeList
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

//        Employee(number=4, name=여다경, age=35)
//        Employee(number=2, name=전지현, age=30)
//        Employee(number=3, name=진세연, age=25)
//        Employee(number=1, name=김연아, age=20)
    }

    @Test
    public void Comparable_정렬_테스트코드2(){
        List<Employee> collect = employeeList
                .stream()
                .sorted(((o1, o2) -> o1.getAge() - o2.getAge()))
                .collect(Collectors.toList());

//        Employee(number=1, name=김연아, age=20)
//        Employee(number=3, name=진세연, age=25)
//        Employee(number=2, name=전지현, age=30)
//        Employee(number=4, name=여다경, age=35)

        collect.forEach(System.out::println);
    }

    @Test
    public void Comparable_역순_정렬_테스트코드2(){
        List<Employee> collect = employeeList
                .stream()
                .sorted(((o1, o2) -> o2.getAge() - o1.getAge()))
                .collect(Collectors.toList());

//        Employee(number=4, name=여다경, age=35)
//        Employee(number=2, name=전지현, age=30)
//        Employee(number=3, name=진세연, age=25)
//        Employee(number=1, name=김연아, age=20)

        collect.forEach(System.out::println);
    }


    @Test
    public void Comparable_정렬_테스트코드3(){
        List<Employee> collect = employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

//        Employee(number=1, name=김연아, age=20)
//        Employee(number=4, name=여다경, age=35)
//        Employee(number=2, name=전지현, age=30)
//        Employee(number=3, name=진세연, age=25)

        collect.forEach(System.out::println);
    }

    @Test
    public void Comparable_역순_정렬_테스트코드3(){
        List<Employee> collect = employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());

//        Employee(number=3, name=진세연, age=25)
//        Employee(number=2, name=전지현, age=30)
//        Employee(number=4, name=여다경, age=35)
//        Employee(number=1, name=김연아, age=20)

        collect.forEach(System.out::println);
    }


    @Test
    public void Comparable_정렬_테스트코드4(){
        List<Employee> collect = employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
//        Employee(number=1, name=김연아, age=20)
//        Employee(number=4, name=여다경, age=35)
//        Employee(number=5, name=여다경, age=30)
//        Employee(number=2, name=전지현, age=30)
//        Employee(number=3, name=진세연, age=25)
        System.out.println("======");
        List<Employee> collect2 = employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge))
                .collect(Collectors.toList());

        collect2.forEach(System.out::println);
//        Employee(number=1, name=김연아, age=20)
//        Employee(number=5, name=여다경, age=30)
//        Employee(number=4, name=여다경, age=35)
//        Employee(number=2, name=전지현, age=30)
//        Employee(number=3, name=진세연, age=25)

    }

}

