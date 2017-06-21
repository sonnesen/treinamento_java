package colecoes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class PropertiesSample {

	public static void main(String[] args) {
//		PropertiesSample propertiesSample = new PropertiesSample();
//
//		try {
//			propertiesSample.gravaPropriedades();
//			Properties propriedades = propertiesSample.recuperaPropriedades();
//			propertiesSample.listaPropriedades(propriedades);
//		} catch (ErroGravacaoPropriedadesException | ArquivoDePropriedadesNaoEncontrado e) {
//			e.printStackTrace();
//		}
		
	}

//	private void listaPropriedades(Properties propriedades) {
//		System.out.println(propriedades);		
//	}
//
//	private Properties recuperaPropriedades() throws ArquivoDePropriedadesNaoEncontrado {
//		Properties properties = new Properties();
//
//		try (FileInputStream inStream = new FileInputStream(new File("datasul-framework.properties"))) {
//			properties.load(inStream);
//		} catch (IOException e) {
//			e.printStackTrace();
//			throw new ArquivoDePropriedadesNaoEncontrado("Erro ao recuperar as propriedades", e);
//		}
//		return properties;
//	}
//
//	private void gravaPropriedades() throws ErroGravacaoPropriedadesException {
//		Properties properties = new Properties();
//
//		properties.put("license.server", "moitas");
//		properties.put("license.port", "5555");
//		properties.put("license.ambient.type", "normal");		
//		
//		try (PrintWriter writer = new PrintWriter(new File("datasul-framework.properties"))) {
//			properties.store(writer, "Propriedades do sistema");			
//		} catch (IOException e) {
//			e.printStackTrace();
//			throw new ErroGravacaoPropriedadesException("Erro na gravação das propriedades.", e);
//		}
//	}

}
