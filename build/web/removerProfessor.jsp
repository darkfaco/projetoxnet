<%-- 
    Document   : cadastrarProfessor
    Created on : 17/04/2013, 17:55:03
    Author     : darkfaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remover Professor</title>
             <link href="screen.css" rel="stylesheet" type="text/css">
                     <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/jquery.maskedinput.js" type="text/javascript"></script>
        <script language="javascript">  
            function validarremoverprof() {
var rg = cadastrarProfessor.rg.value;
var cpf = cadastrarProfessor.cpf.value;

if (rg == "") {
alert('Preencha o campo com seu RG');
cadastrarProfessor.rg.focus();
return false;
}
if (cpf == "") {
alert('Preencha o campo com seu CPF');
cadastrarProfessor.cpf.focus();
return false;
}
}
            </script>
        
                     <script>
        	jQuery(function(){
        	    jQuery("#cpf").mask("999.999.999-99");
                    jQuery("#rg").mask("999.999.99");
        	});
        </script>
    </head>
    <body>
        <%/*
String usuario = (String)session.getAttribute("usuario_autenticado");
if (session.getAttribute("usuario_autenticado") == null) {
response.sendRedirect("login.jsp");
}*/

%>

<div id="page">

		<div id="header">
			<h1>Remover Professor Sistema X-NET</h1>
		</div>

		<div id="content">
			<p id="status"></p>
			<form action="removerProfessor" method="post" id="removerProfessor">
				<fieldset>
					<legend>Detalhes do Usuário</legend>
					<ul>
        <li>
	<label for="rg"><span class="required">RG</span></label>
	<input name="rg" type="text" id="rg"/>
	</li>
         
        <li>
	<label for="cpf"><span class="required">CPF</span></label>
	<input name="cpf" type="text" id="cpf"/>
	</li>
	</fieldset>
	<fieldset class="submit">
            <input type="submit" class="button" name="btEnviar" value="Remover Professor" onclick="return validarremoverprof()">
	</fieldset>
			
			</form>
			 <label class="centered info"><a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
			</div>
	</div>
    </body>
</html>
