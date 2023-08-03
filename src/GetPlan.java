public class GetPlan {
    public Plan makePlan(int planType){
        if(planType == 1){
            return new CommercialPlan();
        } else if (planType == 2){
            return new InstitutionalPlan();
        }
        return null;
    }
}
