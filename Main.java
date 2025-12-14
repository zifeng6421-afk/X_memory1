import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("小明",2500));
        employees.add(new Employee("小军",8000));
        employees.add(new Employee("小红",100000));
        for(Employee em: employees){
            System.out.println(em.getName()+"应该缴纳的个人所得税是:"+em.salaryend(em.getSalary()));
        }
        //System.out.println("小明应该缴纳的个人所得税是：0.0");
        //System.out.println("小军应该缴纳的个人所得税是：345.0");
        //System.out.println("小红应该缴纳的个人所得税是：28270.0");
    }
}
class Employee{
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Double salaryend(double salary){
        if(salary<3500){
            return 0.0;
        }
        Double s=salary-3500;
        Double ans;
        if(s<=1500){
            ans=s*0.03;
        }else if(s>1500&& s<=4500){
            ans=s*0.1-105;
        }else if(s>4500 && s<=9000){
            ans=s*0.2-555;
        }else if(s>9000 && s<=35000){
            ans=s*0.25-1005;
        }else if(s>35000 && s<=55000){
            ans=s*0.3-2755;
        }else if(s>55000 && s<=800000){
            ans=s*0.35-5505;
        }else{
            ans=s*0.45-13505;
        }
        return ans;
    }
}