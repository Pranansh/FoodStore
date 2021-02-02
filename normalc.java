import java.util.*;
public class normalc extends customer implements calc{

	@Override
	public float rewardcalc(float cur,String namer) {
		if (namer.compareTo("fastfood")==0) {
			reward=(10*(int)(cur/150));
		}
		else if (namer.compareTo("authentic")==0) {
			reward=(25*(int)(cur/200));
		}
		else {
			reward=(5*(int)(cur/100));
		}
		return 0;
	}
	
	@Override
	public float discountcalc(float cur) {
		discount =0;
		return discount;
	}
	
	@Override
	public float deliverycalc() {
		delivery=40;
		return delivery;
	}
	
}
