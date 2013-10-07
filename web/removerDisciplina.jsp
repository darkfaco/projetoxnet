<%-- 
    Document   : removerDisciplina
    Created on : 01/10/2013, 22:15:34
    Author     : darkfaco
--%>

<%@page import="MODEL.Disciplina"%>
<%@page import="java.util.ArrayList"%>
<%@page import="MODEL.Professor"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remover Disciplina</title>
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
<%  List<Disciplina> disciplinare = (ArrayList<Disciplina>)request.getAttribute("disciplinare");  %>
<div id="page">

		<div id="header">
			<h1>Remover Disciplina Sistema X-NET</h1>
		</div>

		<div id="content">
			<p id="status"></p>
			<form action="removerDisciplina" method="post" id="removerDisciplina">
				<fieldset>
					<legend>Detalhes do Usuário</legend>
					<ul>	
        <li>
	<label for="sobrenome"><span class="required">Professor</span></label>
	<select name="listDisciplina">
<%
List lista2 = (List)request.getAttribute("disciplinare");
for (int i = 0; i < lista2.size(); i++ ) { 
%>
        <option value="<%=((Disciplina)lista2.get(i)).getID()%>"> <%=((Disciplina)lista2.get(i)).getNome()%>  </option>
        
<%
}
%>
</select>
	</li>
	<label class="centered info"><a id="lembrasenha" href="#">Esqueceu sua senha ?</a></label>
	</li>
	</ul>
	</fieldset>
	<fieldset class="submit">
            <input type="submit" class="button" name="btEnviar" value="Remover Disciplina" onclick="return validarprofessor()">
	</fieldset>
			
			</form>
			 <label class="centered info"><a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
			</div>
	</div>
    </body>
</html>
