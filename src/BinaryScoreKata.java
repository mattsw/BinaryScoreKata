
public class BinaryScoreKata {

	public int getBinaryScore(int toScore){
		int result = 0;
		for(int x = 0; x< toScore; x++){
			if((x|x+1) > result){
				result = x|x+1;
			}
		}
		return result;
	}
	
	
}
