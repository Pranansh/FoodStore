import java.util.*;
public class normalr extends restaurant implements calc1{

	@Override
	public float rewardcalc(float cur) {
		reward=(5*(int)(cur/100));
		return reward;
	}
	
	@Override
	public float discountcalc(float cur,float billdis) {
		discount=0;
		return discount;
	}
	
}
