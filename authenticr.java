import java.util.*;
public class authenticr extends restaurant implements calc1{
	
	@Override
	public float rewardcalc(float cur) {
		reward=(25*(int)(cur/200));
		return reward;
	}
	
	@Override
	public float discountcalc(float cur,float billdis) {
		discount=((cur)*(billdis/100));
		cur-=discount;
		if (cur>200) {
			discount+=50;
		}
		return discount;
	}
	
}
