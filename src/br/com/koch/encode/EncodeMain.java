package br.com.koch.encode;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EncodeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o caminho do projeto: ");
		String strPath = sc.nextLine();
//		String strPath = "C:\\STEFANINI\\BRADESCO\\Projetos\\STF-2023-0004 STF-2023-0008 SVID e VIDA\\MeusProjetos\\ProjetoSVNEncode";
//		
//		File path = new File(strPath);
//		
//		File[] folders = path.listFiles(File::isDirectory);
//		System.out.println("FOLDERS:");
//		for(File folder: folders){
//			if(!folder.toString().equals(null) && folder.toString().contains("-web")){
//				pathWeb = folder.toString();
//			}
////			System.out.println(folder);
//		}
//
//		System.out.println(pathWeb);
//		
//		File path2 = new File(pathWeb);
//		File[] folders2 = path2.listFiles(File::isDirectory);
//		for(File folder : folders2){
//			System.out.println(folder);
//		}
//		
//		List<String> pathsJava = new ArrayList<String>();
		
//		final File folder = new File(strPath);
////		EncodeUtils.listFilesForFolder(folder);
//		EncodeUtils.listFilesForFolderSearchJsp(folder);
		
//		List<String> pathsJava = EncodeUtils.returnPathsFilesJsp();
//		
//		EncodeUtils.searchAndReplaceEncode(pathsJava);
		
		List<String> pathsJava = EncodeUtils.returnPathsFilesJava(strPath);
		String escolha;
		
		do{
			System.out.println("Qual procedimento deseja realizar?");
			System.out.println("1 - Encode ");
			System.out.println("2 - Unescape ");
			System.out.println("0 - Sair ");
			System.out.println("Opção escolhida: ");
			
			escolha = sc.nextLine();

			switch(escolha){
				case "1":
					EncodeUtils.searchAndReplaceEncodeJava(pathsJava);
					break;
				case "2":
					EncodeUtils.searchAndReplaceUnescapeJava(pathsJava);
					break;
				case "0":
					System.out.println("Programa encerrado.");
					break;
				default:
					System.out.println("Valor inserido incorreto.");
			}
			
		}while(!escolha.equals("0"));
		
		sc.close();
	}

}
