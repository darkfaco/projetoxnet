<%-- 
    Document   : atualizarProfessor
    Created on : 01/10/2013, 17:55:03
    Author     : darkfaco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizar Professor</title>
             <link href="screen.css" rel="stylesheet" type="text/css">
                     <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/jquery.maskedinput.js" type="text/javascript"></script>
        <script src="js/validarprofessor.js"></script>
        
                     <script>
        	jQuery(function(){
        	    jQuery("#cpf").mask("999.999.999-99");
                    jQuery("#cpfa").mask("999.999.999-99");
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
			<h1>Atualizar Professor Sistema X-NET</h1>
		</div>

		<div id="content">
			<p id="status"></p>
			<form action="atualizarProfessor" method="post" id="atualizarProfessor"><fieldset>
            <legend>Informa dados do Usuário a ser alterado.</legend>
                    <li>
	<label for="cpf"><span class="required">CPF</span></label>
	<input name="cpf" type="text" id="cpf"/>
	</li>
            </fieldset>
				<fieldset>
					<legend>Detalhes do Usuário</legend>
					<ul>
	<li>
	<label for="nome"><span class="required">Nome:</span></label>
	<input id="nome" name="nome" type="text" />
	</li>
	
        <li>
	<label for="sobrenome"><span class="required">Sobrenome</span></label>
	<input name="sobrenome" type="text"  id="sobrenome" />
	</li>
            
         <li>
	<label for="email"><span class="required">E-mail</span></label>
	<input name="email" type="email"  id="email" />
	</li>
        
         <li>
	<label for="data"><span class="required">Data de Nascimento</span></label>
	<input name="data" type="date"  id="data" />
	</li>
        
        <li>
	<label for="rg"><span class="required">RG</span></label>
	<input name="rg" type="text" id="rg"/>
	</li>
         
        <li>
	<label for="cpfa"><span class="required">CPF</span></label>
	<input name="cpfa" type="text" id="cpfa"/>
	</li>
        
        <li>
        <label for="usuario"><span class="required">Usuario:</span></label>
	<input id="usuario" name="usuario" class="text required email" type="text" />
	</li>
	
	<li>
	<label for="password"><span class="required">senha</span></label>
	<input name="senha" type="password" class="text required" id="senha" minlength="4" maxlength="20" />
	</li>
	<label class="centered info"><a id="lembrasenha" href="#">Esqueceu sua senha ?</a></label>
	</li>
	</ul>
	</fieldset>
	<fieldset class="submit">
            <input type="submit" class="button" name="btEnviar" value="Atualizar Professor" onclick="return validarprofessor()">
	</fieldset>
			
			</form>
			 <label class="centered info"><a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
			</div>
	</div>
    </body>
</html>
