import java.util.*;
public class fastfoodr extends restaurant implements calc1{
	
	@Override
	public float rewardcalc(float cur) {
		reward=(10*(int)(cur/150));
		return reward;
	}
	
	@Override
	public float discountcalc(float cur,float billdis) {
		discount=((cur)*(billdis/100));
		return discount;
	}
	
}
