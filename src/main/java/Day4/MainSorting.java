package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSorting {
    public static void main(String[] args){
        MainSorting p = new MainSorting();
        p.start();
    }

    private void start(){
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "Nawavit", 200));
        employees.add(new Employee(3, "Montree", 400));
        employees.add(new Employee(2, "Nut", 100));
        employees.forEach(System.out::println);

        System.out.println("=============================================");
        Collections.sort(employees, new SortingBySalaryWithDecending());
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                // -1 = Desc, 0 = not, 1 = Asc
//                //return e1.getName().compareTo(e2.getName()); //compare Name (String)
//                return (int)(e1.getSalary() - e2.getSalary()); //compare Salary (double)
//                //return e1.getId() - e2.getId(); //compare ID (int)
//            }
//        });

        employees.forEach(System.out::println);
    }
}

class SortingBySalaryWithDecending implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
        return (int)(e1.getSalary() - e2.getSalary());
    }
}