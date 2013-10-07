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
        <title>Cadastrar Professor</title>
             <link href="screen.css" rel="stylesheet" type="text/css">
                     <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/jquery.maskedinput.js" type="text/javascript"></script>
        <script src="js/validarprofessor.js"></script>
        
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
			<h1>Bem Vindo Sistema X-NET</h1>
		</div>

		<div id="content">
			<p id="status">Logado : Administrador</p>
			<form action="cadastrarProfessor" method="post" id="cadastrarProfessor">
			  <fieldset>
				<legend>Professor</legend>
                  <a href="cadastrarProfessor.jsp">Cadastrar Professor</a>
              /<a href="removerProfessor.jsp">Remover Professor</a>
              /<a href="selectProfessor">Listar Professor</a>
              /<a href="atualizarProfessor.jsp">Atualizar Professor</a>
			  </fieldset>
               <fieldset>
				<legend>Disciplina</legend>
                  <a href="listaProfDisciplina">Cadastrar Disciplina</a>
              /<a href="ListaDisciplinasrev">Remover Disciplina</a>
              /<a href="selectDisciplina">Listar Disciplina</a>
              /<a href="atualizarDisciplina.jsp">Atualizar Disciplina</a>
			  </fieldset>
			</form>
			  <input type="button" class="button" name="btDeslogar "  value="Deslogar" onclick="location.href='login.jsp'">
			 <label class="centered info"><br>
		     <a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
			</div>
	</div>
    </body>
</html>
