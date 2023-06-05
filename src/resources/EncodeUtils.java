package resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class EncodeUtils {
	
	public String converterEncode(String texto1) throws UnsupportedEncodingException{
		
		String folderProject = "C:\\workspace\\stf-was-vida-encode\\ProjetoConversaoEncode\\src\\resources";
		
		String encodeOrigem = "ISO-8859-1";
		String encodeSaida = "UTF-8";
		
		// TESTE palhaço saídas entradas substituição de valores caídos 
		
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
	
	public static List<String> returnPathsFilesJava() {
		List<String> pathsJava = new ArrayList<String>();
		
		String strPath = "C:\\STEFANINI\\BRADESCO\\Projetos\\STF-2023-0004 STF-2023-0008 SVID e VIDA\\MeusProjetos\\ProjetoSVNEncode";
		
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
	        	if(fileEntry !=null && fileEntry.getName().contains(".java")){
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
				fileContext = fileContext.replaceAll("&#227;", "ã");
				fileContext = fileContext.replaceAll("&#243;", "ó");
				fileContext = fileContext.replaceAll("&#243;", "à");
				FileUtils.write(file, fileContext);
			} catch (IOException e) {
				e.printStackTrace();
			}

			
		}
		
	}

	
	
}
