package br.com.koch.encode;

import java.util.ArrayList;
import java.util.List;

public class Encode {

	private List<String> listEncodesIso;
	private List<String> listEncodesUtf8;
	
	
	public Encode(List<String> listEncodesIso, List<String> listEncodesUtf8) {
		super();
		this.listEncodesIso = listEncodesIso;
		this.listEncodesUtf8 = listEncodesUtf8;
	}
	
	

	public Encode() {

		this.listEncodesIso = new ArrayList<>();
		this.listEncodesUtf8 = new ArrayList<>();
		
		listEncodesIso.add("¡");
		listEncodesUtf8.add("&#161;");
		
		
		listEncodesIso.add("¢");
		listEncodesUtf8.add("&#162;");
		
		
		listEncodesIso.add("£");
		listEncodesUtf8.add("&#163;");
		
		
		listEncodesIso.add("¤");
		listEncodesUtf8.add("&#164;");
		
		
		listEncodesIso.add("¥");
		listEncodesUtf8.add("&#165;");
		
		
		listEncodesIso.add("¦");
		listEncodesUtf8.add("&#166;");
		
		
		listEncodesIso.add("§");
		listEncodesUtf8.add("&#167;");
		
		
		listEncodesIso.add("¨");
		listEncodesUtf8.add("&#168;");
		
		
		listEncodesIso.add("©");
		listEncodesUtf8.add("&#169;");
		
		
		listEncodesIso.add("ª");
		listEncodesUtf8.add("&#170;");
		
		
		listEncodesIso.add("«");
		listEncodesUtf8.add("&#171;");
		
		
		listEncodesIso.add("¬");
		listEncodesUtf8.add("&#172;");
		
		
		listEncodesIso.add("®");
		listEncodesUtf8.add("&#174;");
		
		
		listEncodesIso.add("¯");
		listEncodesUtf8.add("&#175;");
		
		
		listEncodesIso.add("°");
		listEncodesUtf8.add("&#176;");
		
		
		listEncodesIso.add("±");
		listEncodesUtf8.add("&#177;");
		
		
		listEncodesIso.add("²");
		listEncodesUtf8.add("&#178;");
		
		
		listEncodesIso.add("³");
		listEncodesUtf8.add("&#179;");
		
		
		listEncodesIso.add("´");
		listEncodesUtf8.add("&#180;");
		
		
		listEncodesIso.add("µ");
		listEncodesUtf8.add("&#181;");
		
		
		listEncodesIso.add("¶");
		listEncodesUtf8.add("&#182;");
		
		
		listEncodesIso.add("·");
		listEncodesUtf8.add("&#183;");
		
		
		listEncodesIso.add("¸");
		listEncodesUtf8.add("&#184;");
		
		
		listEncodesIso.add("¹");
		listEncodesUtf8.add("&#185;");
		
		
		listEncodesIso.add("º");
		listEncodesUtf8.add("&#186;");
		
		
		listEncodesIso.add("»");
		listEncodesUtf8.add("&#187;");

		listEncodesIso.add("¼");
		listEncodesUtf8.add("&#188;");
		
		listEncodesIso.add("½");
		listEncodesUtf8.add("&#189;");
		
		listEncodesIso.add("¾");
		listEncodesUtf8.add("&#190;");
		
		listEncodesIso.add("¿");
		listEncodesUtf8.add("&#191;");
		
		listEncodesIso.add("À");
		listEncodesUtf8.add("&#192;");
		
		listEncodesIso.add("Á");
		listEncodesUtf8.add("&#193;");
		
		listEncodesIso.add("Â");
		listEncodesUtf8.add("&#194;");
		
		listEncodesIso.add("Ã");
		listEncodesUtf8.add("&#195;");
		
		listEncodesIso.add("Ä");
		listEncodesUtf8.add("&#196;");
		
		listEncodesIso.add("Å");
		listEncodesUtf8.add("&#197;");
		
		listEncodesIso.add("Æ");
		listEncodesUtf8.add("&#198;");
		
		listEncodesIso.add("Ç");
		listEncodesUtf8.add("&#199;");
		
		listEncodesIso.add("È");
		listEncodesUtf8.add("&#200;");
		
		listEncodesIso.add("É");
		listEncodesUtf8.add("&#201;");
		
		listEncodesIso.add("Ê");
		listEncodesUtf8.add("&#202;");
		
		listEncodesIso.add("Ë");
		listEncodesUtf8.add("&#203;");
		
		listEncodesIso.add("Ì");
		listEncodesUtf8.add("&#204;");
		
		listEncodesIso.add("Í");
		listEncodesUtf8.add("&#205;");
		
		listEncodesIso.add("Î");
		listEncodesUtf8.add("&#206;");
		
		listEncodesIso.add("Ï");
		listEncodesUtf8.add("&#207;");
		
		listEncodesIso.add("Ð");
		listEncodesUtf8.add("&#208;");
		
		listEncodesIso.add("Ñ");
		listEncodesUtf8.add("&#209;");
		
		listEncodesIso.add("Ò");
		listEncodesUtf8.add("&#210;");
		
		listEncodesIso.add("Ó");
		listEncodesUtf8.add("&#211;");
		
		listEncodesIso.add("Ô");
		listEncodesUtf8.add("&#212;");
		
		listEncodesIso.add("Õ");
		listEncodesUtf8.add("&#213;");
		
		listEncodesIso.add("Ö");
		listEncodesUtf8.add("&#214;");
		
		listEncodesIso.add("×");
		listEncodesUtf8.add("&#215;");
		
		listEncodesIso.add("Ø");
		listEncodesUtf8.add("&#216;");
		
		listEncodesIso.add("Ù");
		listEncodesUtf8.add("&#217;");
		
		listEncodesIso.add("Ú");
		listEncodesUtf8.add("&#218;");
		
		listEncodesIso.add("Û");
		listEncodesUtf8.add("&#219;");
		
		listEncodesIso.add("Ü");
		listEncodesUtf8.add("&#220;");
		
		listEncodesIso.add("Ý");
		listEncodesUtf8.add("&#221;");
		
		listEncodesIso.add("Þ");
		listEncodesUtf8.add("&#222;");
		
		listEncodesIso.add("ß");
		listEncodesUtf8.add("&#223;");
		
		listEncodesIso.add("à");
		listEncodesUtf8.add("&#224;");
		
		listEncodesIso.add("á");
		listEncodesUtf8.add("&#225;");
		
		listEncodesIso.add("â");
		listEncodesUtf8.add("&#226;");
		
		listEncodesIso.add("ã");
		listEncodesUtf8.add("&#227;");
		
		listEncodesIso.add("ä");
		listEncodesUtf8.add("&#228;");
		
		listEncodesIso.add("å");
		listEncodesUtf8.add("&#229;");
		
		listEncodesIso.add("æ");
		listEncodesUtf8.add("&#230;");
		
		listEncodesIso.add("ç");
		listEncodesUtf8.add("&#231;");
		
		listEncodesIso.add("è");
		listEncodesUtf8.add("&#232;");
		
		listEncodesIso.add("é");
		listEncodesUtf8.add("&#233;");
		
		listEncodesIso.add("ê");
		listEncodesUtf8.add("&#234;");
		
		listEncodesIso.add("ë");
		listEncodesUtf8.add("&#235;");
		
		listEncodesIso.add("ì");
		listEncodesUtf8.add("&#236;");
		
		listEncodesIso.add("í");
		listEncodesUtf8.add("&#237;");
		
		listEncodesIso.add("î");
		listEncodesUtf8.add("&#238;");
		
		listEncodesIso.add("ï");
		listEncodesUtf8.add("&#239;");
		
		listEncodesIso.add("ð");
		listEncodesUtf8.add("&#240;");
		
		listEncodesIso.add("ñ");
		listEncodesUtf8.add("&#241;");
		
		listEncodesIso.add("ò");
		listEncodesUtf8.add("&#242;");
		
		listEncodesIso.add("ó");
		listEncodesUtf8.add("&#243;");
		
		listEncodesIso.add("ô");
		listEncodesUtf8.add("&#244;");
		
		listEncodesIso.add("õ");
		listEncodesUtf8.add("&#245;");
		
		listEncodesIso.add("ö");
		listEncodesUtf8.add("&#246;");
		
		listEncodesIso.add("÷");
		listEncodesUtf8.add("&#247;");
		
		listEncodesIso.add("ø");
		listEncodesUtf8.add("&#248;");
		
		listEncodesIso.add("ù");
		listEncodesUtf8.add("&#249;");
		
		listEncodesIso.add("ú");
		listEncodesUtf8.add("&#250;");
		
		listEncodesIso.add("û");
		listEncodesUtf8.add("&#251;");
		
		listEncodesIso.add("ü");
		listEncodesUtf8.add("&#252;");
		
		listEncodesIso.add("ý");
		listEncodesUtf8.add("&#253;");
		
		listEncodesIso.add("þ");
		listEncodesUtf8.add("&#254;");
		
		listEncodesIso.add("ÿ");
		listEncodesUtf8.add("&#255;");
		
	}



	public List<String> getListEncodesIso() {
		return listEncodesIso;
	}
	
	public List<String> getListEncodesUtf8() {
		return listEncodesUtf8;
	}
	
	
	
}
