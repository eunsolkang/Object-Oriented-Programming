public class AmountDiscountPolicy extends DiscountPolicy{
    private Money discontAmount;

    public AmountDiscountPolicy(Money discontAmount, DiscountCondition ...conditions){
        super(conditions);
        this.discontAmount = discontAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening){
        return discontAmount;
    }
}