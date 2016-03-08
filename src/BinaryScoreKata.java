
public class BinaryScoreKata {

	public int getBinaryScore(int toScore){
		int result = 0;
		if(toScore < 2)
			return toScore;
		for(int x = 2; x< toScore; x*=2){
			if((x-1|x) > result){
				result = x-1|x;
			}
		}
		return result;
	}
	
	
}
