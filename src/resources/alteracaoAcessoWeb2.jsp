<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>

<jsp:useBean id="servidorImagens" scope="page" class="br.com.bradseg.vida.acessoweb.util.UrlUtil"/>
<link href="<bean:write name='servidorImagens' property='caminhoCss'/>css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" 	src="includes/scripts/jslib.js"></script>
<script type="text/javascript" 	src="includes/scripts/util.js"></script>


<script language="JavaScript" type="text/JavaScript">
var cdArquivo, nmArquivo, cdSistema, cdTipoInfo;
var reDigits = /^\d+$/;

<!--
	function MM_reloadPage(init) {  //reloads the window if Nav4 resized
	  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
	    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
	  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
	}
	MM_reloadPage(true);

	function validaForm(opcao){

		if (opcao == 1){
		
			if (window.event.keyCode == 13){			
			
				if (Trim(document.getElementById("codTipoAcessoWeb").value) == ""){
					alert ("Preencha o campo Código.");
					document.getElementById("codTipoAcessoWeb").focus();
					return false;				
				}

				if (Trim(document.getElementById("descricao").value) == ""){
					alert ("Preencha o campo tipo de acesso.");
					document.getElementById("descricao").focus();					
					return false;				
				}			
				
				document.getElementById("progresso").style.visibility = "visible";
				document.forms[0].submit();
			}
		}else{			
			
			if (Trim(document.getElementById("codTipoAcessoWeb").value) == ""){
				alert ("Preencha o campo Código.");
				document.getElementById("codTipoAcessoWeb").focus();
				return false;				
			}

			if (Trim(document.getElementById("descricao").value) == ""){
				alert ("Preencha o campo tipo de acesso.");
				document.getElementById("descricao").focus();				
				return false;				
			}			

			document.getElementById("progresso").style.visibility = "visible";
			document.forms[0].submit();			
		}
	
	}
	

	
function validaInput(param) {
	
	if (param == "inclusao"){	
	
		document.cookie = "resetForm=true";
		
	}else if (param == "consulta"){	
			
		document.cookie="codTipoAcessoWeb=";
		document.cookie="descricao=";		
		document.getElementById("Reload").value = "true";
		document.cookie = "d-16544-p=" + document.getElementById("d-16544-p").value;

	}else if (param == "exclusao"){	

		document.getElementById("Reload").value = "true";
		document.cookie = "d-16544-p=" + document.getElementById("d-16544-p").value;
		
	}
	
}
	
	
	
//-->		
</script>
<html:html>
<head>
<title>
</title>
</head>
<body onkeypress="javascript:validaForm(1)">
<html:form action="confirmarAlteracaoAcessoWeb.do">
<input type="hidden" name="d-16544-p" value="<%=session.getAttribute("d-16544-p")%>"/>
<input type="hidden" name="Reload"/>
<table id="tabela_principal" width="100%">
	<tr>
    	<td width="100%" height="100%">
			<img src="<bean:write name="servidorImagens" property="caminhoImagens"/>tit_vida_controle_acesso.gif"/>
			<br />
    		<!--subt´titulo da aplicação-->
    		<span class="subtitulo">			
    		</span>
    		<br/>
			<!--início texto da aplicação-->
			<p>&nbsp;</p>
			<!--fim texto da aplicação-->
    		<!--início das tabelas aplicações-->
      		<br/>      		
      		<br/>  
			<!--fim -->
    	</td>
  	</tr>
	<tr>
		<td align="center" width="100%" height="100%">
			<table width="100%">
				<tr>
					<td><jsp:include page="menu.jsp"/>
						<table width="95%" id="tabela_interna">
							<tr>
								<td width="8%">Código:</td>
								<td align="left" width="87%"><html:text property="codTipoAcessoWeb" size="60" maxlength="20" /></td>
							</tr>						
							<tr>
								<td width="8%">Tipo Acesso:</td>
								<td align="left" width="87%"><html:text property="descricao" size="60" maxlength="50"/></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
	  		<br/>			  		
			<table border="0" width="100%" align="left">
                <tr><td>&nbsp;</td></tr>				
				<tr><td>&nbsp;</td></tr>
				<tr><td>&nbsp;</td></tr>
				<tr>
					<td height="33" align="center">
						<a href="#">					
							<img src="<bean:write name="servidorImagens" property="caminhoImagens"/>bt_confirmar.jpg" name="imgConfirmar" onclick="javascript:return validaForm(2)"/>
						</a>
					</td>
				</tr>
				<tr>
					<td height="45"><jsp:include page="carregando.jsp"/></td>
				</tr>				
			</table>									
	  		<br/>				
	  		<br/>			
	  		<br/>
			<!--fim -->						
		</td>
	</tr>
</table>
</html:form>
</body>
</html:html>
