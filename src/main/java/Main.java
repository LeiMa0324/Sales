public class Main {
    public static void main(String[] args){
        SalesManager tom = new SalesManager("Tom", 1);
        SalesManager jane = new SalesManager("Jane", 2);
        SalesAssociate harry = new SalesAssociate("Harry", 28);
        SalesAssociate nancy = new SalesAssociate("Nancy", 15);

        Client ann = new Client("Ann", 51);
        Client john = new Client("John", 734);
        Client susan = new Client("Susan", 515);
        Client david = new Client("David", 921);
        Client sarah = new Client("Sarah", 478);
        Client daniel = new Client("Daniel", 269);

        harry.setManager(jane);
        jane.addEmployee(harry);
        nancy.setManager(tom);
        tom.addEmployee(nancy);

        jane.addClient(john);
        jane.addClient(sarah);

        tom.addClient(david);
        harry.addClient(ann);
        nancy.addClient(daniel);
        nancy.addClient(susan);

        // Sale managers
        System.out.println(jane.toString());
        System.out.println(tom.toString());
        // Sale Associates
        System.out.println(harry.toString());
        System.out.println(nancy.toString());
        // Clients
        System.out.println(ann.toString());
        System.out.println(john.toString());
        System.out.println(susan.toString());
        System.out.println(david.toString());
        System.out.println(sarah.toString());
        System.out.println(daniel.toString());

    }
}
