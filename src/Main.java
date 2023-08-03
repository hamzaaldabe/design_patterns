import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int planId=0;
            GetPlan planGenerator = new GetPlan();
            System.out.println("Please choose a plan number or anything else to exit:");
            System.out.println("1-Commercial Plan");
            System.out.println("2-Institutional Plan");
            Scanner scanner = new Scanner(System.in);
             try{
                planId =  scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Bye");
                return;
            }
            Plan plan = planGenerator.makePlan(planId);
            Optional <Plan> checker = Optional.ofNullable(plan);
            if(checker.isPresent()){
                System.out.println("Please enter the amount of months to subscribe:");
                int months = 0;
                boolean invalid;
                    try{
                        invalid = false;
                        months = scanner.nextInt();
                    }catch (InputMismatchException e){
                        System.out.println("Invalid Input, integers only");
                        return;
                    }

                plan.getRate();
                plan.calculateBill(months);
            }else{
                System.out.println("Bye");
            }

    }
}