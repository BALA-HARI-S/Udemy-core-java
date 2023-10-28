public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "12/12/1995",
                "12/08/2020");

        System.out.println(tim);
        System.out.println("Tim Age : " + tim.getAge());
        System.out.println("Tim Pay : " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "12/12/1985",
                "12/08/2020", 25000);

        System.out.println("Joe Age : " + joe.getAge());
        System.out.println("Joe PayCheck : " + joe.collectPay());
        joe.retired();
        System.out.println("Joe Retired PayCheck : " + joe.collectPay());
        System.out.println(joe);

        HourlyEmployee mary = new HourlyEmployee("Mary", "12/12/2000",
                "12/12/2021" , 100);

        System.out.println("Mary PayCheck : $" + mary.collectPay());
        System.out.println("Mary DoublePayCheck : $" + mary.getDoublePay());
        System.out.println(mary);
    }
}
