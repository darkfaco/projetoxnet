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
        <title>Gravação executada com sucesso!</title>
<link href="screen.css" rel="stylesheet" type="text/css">
</head>
<body >
    <% session.invalidate();%>
    
<div id="page">

		<div id="header">
			<h1>Gravação executada com sucesso!</h1>
		</div>

		<div id="content">
			<p id="status"></p>
			<form action="login" method="post" id="login">
				<fieldset>
					<legend>Concluido.</legend>
					<ul>
			<legend>Gravação executada com sucesso!</legend>
	<label class="centered info"><a id="lembrasenha" href="#">Esqueceu sua senha ?</a></label>
	</li>
	</ul>
	</fieldset>
	<fieldset class="submit">
            <input type="submit" class="button" name="btEnviar" value="Voltar" onclick="history.back()">
	</fieldset>
			
			</form>
			 <label class="centered info"><a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
			</div>
	</div>
</body>
</html>