package jasper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class PeopleProvider {

	public static Collection<Pessoa> listPessoa;

	public static void main(String[] args) {
		try {
	
				
			//JasperDesign desenho = JRXmlLoader.load("C:\\eclipse\\workspace\\jasper\\src\\main\\java\\jasper\\Blank_A4_bean.jrxml");
			//JasperReport relatorio = JasperCompileManager.compileReport( desenho );
		
			
			Map<String,Object> parametros=new HashMap<String,Object>();
			parametros.put("idade","15");
			parametros.put("nome","wander");
			  
			
			ReportExporter rep=new ReportExporter();
			rep.toPDF("C:\\eclipse\\workspace\\jasper\\src\\main\\java\\jasper\\Blank_A4_bean.jrxml", parametros);
	
		
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Pessoa[] peopleProvider(){
		
		Pessoa[] list = new Pessoa[3];
		list[0]=new Pessoa("ze","15");
		list[1]=new Pessoa("joao","25");
		list[2]=new Pessoa("lucas","3");
		
		return list;
	}
}

