package marcelo.tdd.test;

/**
 * Interface for generating reports.
 * @author Meraj
 */
public interface IReportGenerator {
	
	/**
	 * Generate report.
	 * @param report Report entity.
	 */
	void generateReport(ReportEntity report);

}
