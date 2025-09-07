public class LogicalOperators {
    public static void main(String[] args){

        int temperature = 22;
        boolean isWarm = temperature>20 && temperature<30;
        System.out.println(isWarm);

        boolean highIncome=true;
        boolean goodCredit=true;
        boolean criminalRecord=false;
        boolean isEligible = (highIncome || goodCredit) && !criminalRecord;
        System.out.println(isEligible);
    }
}
