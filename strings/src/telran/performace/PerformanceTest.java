package telran.performace;

public abstract class PerformanceTest {
	protected String testName;
	protected int nRuns;

	public PerformanceTest(String testName, int nRuns) {
		this.testName = testName;
		this.nRuns = nRuns;
	}

	protected abstract void runTest();

	public void run() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < nRuns; i++) {
			runTest();
		}
		long endTime = System.currentTimeMillis();
		float runningTime = (endTime - startTime);
		System.out.println(
				"nRuns: " + nRuns + "; " + "testName: " + testName + "; " + "running time millsec: " + runningTime + ";");
	}
}