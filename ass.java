import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ass {

    public static class employee{
        String empid;
        String name;
        int age;
        int salary;

    
        public employee(String empid,String name,int age,int salary){
            this.name=name;
            this.age=age;
            this.empid=empid;
            this.salary=salary;
        }

    }

    public static void main(String[] args) {
        employee [] arr=new employee[4];
        arr[0]=new employee("161E90","Ramu" , 35,59000);
        arr[1]=new employee("171E22","Tejas" , 30,82100);
        arr[2]=new employee("171G55","Abhi" , 25,100000);
        arr[3]=new employee("152K46","Jaya" , 32,85000);

        while (true) {
            System.out.println("ENTER YOUR CHOICE:-");
            System.out.println("ENTER 1 TO SORT ON THE BASIS OF AGE");
            System.out.println("ENTER 2 TO SORT ON THE BASIS OF NAME");
            System.out.println("ENTER 3 TO SORT ON THE BASIS OF SALARY");
            System.out.print("ENTER 4 TO EXIT\n");


            Scanner sc=new Scanner(System.in);
            int choice = sc.nextInt();

            if(choice==4){
                break;
            }

            switch (choice) {
            case 1:
                Arrays.sort(arr, Comparator.comparingInt(employee-> employee.age));
                break;
            case 2:
                Arrays.sort(arr, Comparator.comparing(employee -> employee.name));
                break;
            case 3:
                Arrays.sort(arr, Comparator.comparingInt(employee -> employee.salary));
                break;
            default:
                System.out.println("Invalid choice. Sorting by name by default.");
                Arrays.sort(arr, Comparator.comparing(employee-> employee.name));
                break;
            }

            for(int i=0;i<arr.length;i++){
                System.out.println("Employee " + (i + 1) + ": " +"EmpId: " + arr[i].empid +", Name: " + arr[i].name +", Age: " + arr[i].age + ", Salary: "+ arr[i].salary);
            }

            
        }
    }


}
