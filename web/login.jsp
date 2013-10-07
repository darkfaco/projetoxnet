<%-- 
    Document   : login
    Created on : 25/04/2013, 19:40:20
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logar no Sistema</title>
<link href="screen.css" rel="stylesheet" type="text/css">
<script src="js/validarlogin.js"></script>

</head>
<body >
    <% session.invalidate();%>
<div id="page">

		<div id="header">
			<h1>Login Sistema X-NET</h1>
		</div>

		<div id="content">
			<p id="status"></p>
			<form action="login" method="post" id="login">
				<fieldset>
					<legend>Detalhes do Usuário</legend>
					<ul>
			<li>
	<label for="login"><span class="required">Usuario:</span></label>
	<input id="login" name="login" class="text required email" type="text" />
	</li>
	
	<li>
	<label for="password"><span class="required">senha</span></label>
	<input name="senha" type="password" class="text required" id="senha" minlength="4" maxlength="20" />
	</li>
	<li>
	<label class="centered info"><a id="lembrasenha" href="#">Esqueceu sua senha ?</a></label>
	</li>
	</ul>
	</fieldset>
	<fieldset class="submit">
            <input type="submit" class="button" name="btEnviar" value="Login" onclick="return validarlogin()">
	</fieldset>
			
			</form>
                        <label class="centered info"><a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
			</div>
	</div>
</body>
</html>