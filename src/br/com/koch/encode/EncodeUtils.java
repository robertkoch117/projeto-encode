package br.com.koch.encode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringEscapeUtils;

public class EncodeUtils {
	
	static List<String> listEncodesIso = new ArrayList<>();
	static List<String> listEncodesUtf8 = new ArrayList<>();
	
	public String converterEncode(String texto1) throws UnsupportedEncodingException{
		
		String folderProject = "C:\\workspace\\stf-was-vida-encode\\ProjetoConversaoEncode\\src\\resources";
		
		String encodeOrigem = "ISO-8859-1";
		String encodeSaida = "UTF-8";
		
		byte[] latin1 = "Eu sou legalzão e não sou palhaço".getBytes();
		byte[] utf8 = new String(latin1, encodeOrigem).getBytes(encodeSaida);
		System.out.println(utf8);
		System.out.println(new String(utf8, StandardCharsets.UTF_8));
		return "";
	}
	
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
	}
	
	public static List<String> returnPathsFilesJava(String strPath) {
		List<String> pathsJava = new ArrayList<String>();
		
//		String strPath = "C:\\STEFANINI\\BRADESCO\\Projetos\\STF-2023-0004 STF-2023-0008 SVID e VIDA\\MeusProjetos\\ProjetoSVNEncode";
		
		final File folder = new File(strPath);
//		EncodeUtils.listFilesForFolder(folder);
		listFilesForFolderSearchJava(folder, pathsJava);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		pathsJava.stream().forEach(System.out::println);
		
		return pathsJava;
	}
	
	public static void listFilesForFolderSearchJava(final File folder, List<String> pathsJava) {
		for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	listFilesForFolderSearchJava(fileEntry, pathsJava);
	        } else {
	        	if(fileEntry !=null && (fileEntry.getName().contains(".java") || fileEntry.getName().contains(".jsp") || fileEntry.getName().contains(".properties") || fileEntry.getName().contains(".css"))){
	        		System.out.println(fileEntry.getName());
	        		pathsJava.add(fileEntry.getAbsolutePath());
	        	}
	        }
	    }

	}
	
	public static List<String> returnPathsFilesJsp() {
		List<String> pathsJsp = new ArrayList<String>();
		
//		String strPath = "C:\\STEFANINI\\BRADESCO\\Projetos\\STF-2023-0004 STF-2023-0008 SVID e VIDA\\MeusProjetos\\ProjetoSVNEncode";
		String strPath = "C:\\workspace\\stf-was-vida-encode\\ProjetoConversaoEncode\\src\\resources";
		
		final File folder = new File(strPath);
//		EncodeUtils.listFilesForFolder(folder);
		listFilesForFolderSearchJsp(folder, pathsJsp);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		pathsJsp.stream().forEach(System.out::println);
		
		return pathsJsp;
	}
	
	public static void listFilesForFolderSearchJsp(final File folder, List<String> pathsJava) {
		for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	listFilesForFolderSearchJsp(fileEntry, pathsJava);
	        } else {
	        	if(fileEntry !=null && fileEntry.getName().contains(".jsp")){
	        		System.out.println(fileEntry.getName());
	        		pathsJava.add(fileEntry.getAbsolutePath());
	        	}
	        }
	    }

	}
	

	public static void searchAndReplaceEncode(List<String> pathsJava) {
		System.out.println("=======================================================");
		for(String path : pathsJava){
			
//			try(BufferedReader br = new BufferedReader(new FileReader(path))){
//				String line = br.readLine();
//				
//				while(line != null){
//					System.out.println(line);
//					line = br.readLine();
//				}
//			}catch(IOException e){
//				e.printStackTrace();
//			}
			
			try {
				if(path.contains("Web2")){
					continue;
				}
				File file = new File(path);
				String fileContext = FileUtils.readFileToString(file);
				fileContext = fileContext.replaceAll("ã", "&#227;");
				fileContext = fileContext.replaceAll("ó", "&#243;");
				FileUtils.write(file, fileContext);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void searchAndReplaceEncodeJava(List<String> pathsJava) {
		System.out.println("=======================================================");
		Encode encodeObj = new Encode();
		
		for(String path : pathsJava){
			
			try {
//				if(path.contains("Web2")){
//					continue;
//				}
				File file = new File(path);
				String fileContext = FileUtils.readFileToString(file);

//				String escapeHtml4 = StringEscapeUtils.escapeHtml4("Eu sou legalzão e não sou palhaço. Aplicação Java código");
//				
//				String unescapeHtml4 = StringEscapeUtils.unescapeHtml4("Eu sou legalz&atilde;o e n&atilde;o sou palha&ccedil;o. Aplica&ccedil;&atilde;o Java c&oacute;digo");
				
//				System.out.println(escapeHtml4);
//				System.out.println(unescapeHtml4);
				
//				int contador = 0;
//				for(String encodeIso : encodeObj.getListEncodesIso()){
//					fileContext = fileContext.replaceAll(encodeObj.getListEncodesIso().get(contador), encodeObj.getListEncodesUtf8().get(contador));
//					fileContext = fileContext.replaceAll(encodeObj.getListEncodesIso().get(contador), encodeObj.getListEncodesUtf8().get(contador));
//					contador++;
//				}
//				
				fileContext = new String(StringEscapeUtils.escapeHtml4(fileContext).getBytes(), Charset.forName("UTF-8"));
				FileUtils.write(file, fileContext);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
	}
	
	public static void searchAndReplaceUnescapeJava(List<String> pathsJava) {
		System.out.println("=======================================================");
		
		for(String path : pathsJava){
			
			try {
				File file = new File(path);
				String fileContext = FileUtils.readFileToString(file);

//				String unescapeHtml4 = StringEscapeUtils.unescapeHtml4("# Optional header and footer for &lt;errors/&gt; tag.#errors.header=&lt;ul&gt;#errors.footer=&lt;/ul&gt;sucesso.inclusao=Registro inclu&iacute;do com sucessosucesso.alteracao=Registro alterado com sucessosucesso.exclusao=Registro excluido com sucessoerro.duplicidadade=Registro j&aacute; existenteerro.alteracao=N&atilde;o h&aacute; dados a serem alteradoserro.exclusao=Problemas na exclus&atilde;oerro.consulta=Problemas na consultaerro.pesquisa=Problemas na pesquisaerro.inicializacao=Problemas na inicializa&ccedil;&atilde;o");
//				
//				System.out.println(unescapeHtml4);
				
				fileContext = StringEscapeUtils.unescapeHtml4(fileContext);
				FileUtils.write(file, fileContext, Charset.forName("UTF-8"));
//				FileUtils.write(file, data, encoding);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
	}

	
}
