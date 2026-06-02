package Praktikum14;
import java.util.ArrayList;
public class DemoArrayList7 {
    public static void main(String[] args) {
        ArrayList<Customer7> customers = new ArrayList<>();

        Customer7 customer1 = new Customer7(1, "Zakia");
        Customer7 customer2 = new Customer7(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer7(4, "Cica"));

        customers.add(2, new Customer7(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer7 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";
        
        ArrayList<Customer7> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer7(201, "Della"));
        newCustomers.add(new Customer7(202, "Victor"));
        newCustomers.add(new Customer7(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer7 cust : customers) {
            System.out.println(cust.toString());
        }
    }
}