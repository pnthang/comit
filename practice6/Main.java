public class Main {

    public static void main(String[] args){
        Person objPerson1 = new Person("Tom","Martin","012345678");
        Person objPerson2 = new Person("jerry","Roy","876543210");

        Account objAccount1 = new Account("224466",5000,objPerson1);
        Account objAccount2 = new Account("335577",10000,objPerson2);
        Account objAccount3 = new Account("Pig","Wilson","6666333999","123456",5000);

        System.out.println(objAccount1.toString());
        System.out.println(objAccount2.toString());
        System.out.println(objAccount3.toString());

        System.out.println(objAccount1.doTransaction(4000,1));
        System.out.println(objAccount1.doTransaction(6000,2));
        System.out.println(objAccount1.doTransaction(8000,1));

        System.out.println(objAccount2.doTransaction(5000,1));
        System.out.println(objAccount2.doTransaction(20000,2));

        System.out.println(objAccount1.toString());
        System.out.println(objAccount2.toString());
    }
}
