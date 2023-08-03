package telran.performace;

import org.junit.jupiter.api.BeforeEach;


class JoinStringsPerfomanceTest extends PerformanceTest {
protected String [] strings;
protected JoinStrings joinStrings;
	public JoinStringsPerfomanceTest(String testName, int nRuns, String [] strings, JoinStrings joinStrings) {
		
		super(testName, nRuns);
		this.strings = strings;
		this.joinStrings = joinStrings;
	}

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Override
	protected void runTest() {
		joinStrings.join(strings, "-");
		
	}

}