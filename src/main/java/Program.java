import entities.Emplyoee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Emplyoee> list = new ArrayList<>();


        System.out.print("How many employees wil be registred? ");
        int qnt = sc.nextInt();

        for (int i = 0; i<qnt; i++){
            System.out.printf("Emplyoee #%d:\n", (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(list, id)){
                System.out.println("This id has been taked. Try again.");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Emplyoee emp = new Emplyoee(id, name, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary incrase: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);
        if(pos == null){
            System.out.println("Id não encontrado.");
        } else{
            System.out.print("Enter the percentage: ");
            double perc = sc.nextDouble();
            list.get(pos).aumentPerc(perc);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("List employee:");
        for(Emplyoee emp : list){
            System.out.println(emp);
        }


    }

    public static Integer position(List<Emplyoee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<Emplyoee> list, int id){
        for (Emplyoee emplyoee : list) {
            if (emplyoee.getId() == id) {
                return true;
            }
        }
        return false;
    }

}
