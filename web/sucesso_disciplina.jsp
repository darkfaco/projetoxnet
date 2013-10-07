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
			<h1>Gravação executada com sucesso!</h1>
		</div>

		<div id="content">
			<p id="status"></p>
			<form action="cadastrarDisciplina" method="get" id="cadastrarDisciplina">
				<fieldset>
									<legend>Concluido.</legend>
					<ul>
			<legend>Gravação executada com sucesso!</legend>
					<ul>
	<li>
	<label for="nome"><span class="required">Nome:</span></label>
	<input name="nome" type="text" disabled="disabled" id="nome" value="<%= request.getParameter("nome") %>" readonly />
	</li>
	
        <li>
	<label for="professor"><span class="required">Professor</span></label>
	<input name="professor" type="text" disabled="disabled" id="professor" value="<%= request.getParameter("professor") %>" readonly />
        </li>
            
         <li>
	<label for="descricao"><span class="required">Descrição</span></label>
	<input name="descricao" type="text" disabled="disabled"  id="descricao" value="<%= request.getParameter("descricao") %>" readonly />
	</ul>
	</fieldset>
	<fieldset class="submit">
	  <input  type="submit" class="button" name="btEnviar"  value="Pagina Inicial" onclick="location.href='index_admin.jsp'">
      <input type="button" class="button" name="btDeslogar "  value="Deslogar" onclick="location.href='login.jsp'">
	</fieldset>
			
			</form>
			 <label class="centered info"><a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
			</div>
	</div>
    </body>
</html>
