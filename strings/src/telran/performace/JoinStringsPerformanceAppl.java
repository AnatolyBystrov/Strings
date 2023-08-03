package telran.performace;

import java.util.Arrays;

public class JoinStringsPerformanceAppl {
private static final int N_STRINGS = 10000;
private static final int N_RUNS = 100;

	public static void main(String[] args) {
		String [] strings = getBigArray();
JoinStringsOnString onString = new JoinStringsOnString();
JoinStringsOnBuilder builder = new JoinStringsOnBuilder();
JoinStringsOnStandart onStandart = new JoinStringsOnStandart();

JoinStringsPerfomanceTest test1 = new 
JoinStringsPerfomanceTest("JoinStringsBuilderImplTest", N_RUNS, strings, builder);
JoinStringsPerfomanceTest test2 = new 
JoinStringsPerfomanceTest("JoinStringsOnStandardImplTest", N_RUNS, strings, onStandart);
JoinStringsPerfomanceTest test3 = new 
JoinStringsPerfomanceTest("JoinStringsOnStringImplTest", N_RUNS, strings, onString);
test1.run();
test2.run();
test3.run();
	}
	static String[] getBigArray() {
		String[] res = new String[N_STRINGS];
		Arrays.fill(res , "Hello");
		return res;
	}
}