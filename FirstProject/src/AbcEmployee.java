public class AbcEmployee implements EmployeeRules, FamilyRules
{
    public static void main(String[] args) {
        AbcEmployee abc = new AbcEmployee();
        abc.maintainHours();
        abc.relocate();
        abc.report();
        abc.dress();
        System.out.println("Salary : "+ EmployeeRules.SALARY);
        System.out.println("Leaves : "+ abc.LEAVES);
        System.out.println("FamilyRules");
        abc.enjoy();
    }
    public void maintainHours(){
        System.out.println("40 hrs");
    }
    public void relocate(){
        System.out.println("Coimbatore");
    }
    public void report(){
        System.out.println("TeamLead");
    }
    public void dress(){
        System.out.println("Casual");
    }
    public void takeCareOfParents(){}
    public void helpFamily(){}
    public void eatTogether(){}
    public void enjoy(){
        System.out.println("Play together with children");
    }
}
