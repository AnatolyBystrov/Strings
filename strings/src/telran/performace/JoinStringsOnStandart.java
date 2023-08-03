package telran.performace;
public class JoinStringsOnStandart implements JoinStrings {

	@Override
	public String join(String[] strings, String delimeter) {
		
		String res = "";
		if (strings != null && strings.length > 0) {
			res = strings[0];
			for (int i = 1; i < strings.length; i++) {
				res = String.join(delimeter, res, strings[i]);
			}
		}
		return res;
	}

}