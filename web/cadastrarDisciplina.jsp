<%-- 
    Document   : cadastrarDisciplina
    Created on : 01/10/2013, 21:39:50
    Author     : darkfaco
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="MODEL.Professor"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Disciplina</title>
             <link href="screen.css" rel="stylesheet" type="text/css">
                     <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/jquery.maskedinput.js" type="text/javascript"></script>
        
    </head>
    <body>
        <%/*
String usuario = (String)session.getAttribute("usuario_autenticado");
if (session.getAttribute("usuario_autenticado") == null) {
response.sendRedirect("login.jsp");
}*/

%>
<%  List<Professor> professoresdi = (ArrayList<Professor>)request.getAttribute("professoresdi");  %>
<div id="page">

		<div id="header">
			<h1>Cadastro Disciplina Sistema X-NET</h1>
		</div>

		<div id="content">
			<p id="status"></p>
			<form action="cadastrarDisciplina" method="post" id="cadastrarDisciplina">
				<fieldset>
					<legend>Detalhes do Usuário</legend>
					<ul>
	<li>
	<label for="nome"><span class="required">Nome:</span></label>
	<input id="nome" name="nome" type="text" />
	</li>
	
        <li>
	<label for="sobrenome"><span class="required">Professor</span></label>
	<select name="listProfessor">
<%
List lista2 = (List)request.getAttribute("professoresdi");
for (int i = 0; i < lista2.size(); i++ ) { 
%>
        <option value="<%=((Professor)lista2.get(i)).getCPF()%>"> <%=((Professor)lista2.get(i)).getNome()%>  </option>
        
<%
}
%>
</select>
	</li>
            
         <li>
	<label for="descricao"><span class="required">Descrição</span></label>
	<input name="descricao" type="text"  id="descricao" />
	</li>
	<label class="centered info"><a id="lembrasenha" href="#">Esqueceu sua senha ?</a></label>
	</li>
	</ul>
	</fieldset>
	<fieldset class="submit">
            <input type="submit" class="button" name="btEnviar" value="Cadastrar Disciplina" onclick="return validarprofessor()">
	</fieldset>
			
			</form>
			 <label class="centered info"><a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
			</div>
	</div>
    </body>
</html>
