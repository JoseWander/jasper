package jasper;

import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
 
public class ReportExporter {
 
	public void toPDF(String reportSource, Map<String,Object> parameters) throws JRException {
 		
		final JasperDesign jd = JRXmlLoader.load(reportSource);
 
		final JasperReport report = JasperCompileManager.compileReport(jd);
 
		final JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
 
		final String reportTarget = "c:\\temp\\test.pdf";
		
		JasperExportManager.exportReportToPdfFile(print, reportTarget);
 
	}
 
}