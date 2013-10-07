<%-- 
    Document   : selectDisciplina
    Created on : 01/10/2013, 22:37:40
    Author     : darkfaco
--%>

<%@page import="MODEL.Disciplina"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="MODEL.Professor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Professores X-NET</title>
<link href="screen.css" rel="stylesheet" type="text/css">
<script src="js/validarlogin.js"></script>

</head>
<body >
            <%/*
String usuario = (String)session.getAttribute("usuario_autenticado");
if (session.getAttribute("usuario_autenticado") == null) {
response.sendRedirect("login.jsp");
}*/
List<Disciplina> listadisciplina = (ArrayList<Disciplina>)request.getAttribute("listadisciplina");
%>
<div id="page">

		<div id="header">
			<h1>Lista Professores X-NET</h1>
		</div>

		<div id="content">
			<p id="status"></p>
                        <fieldset>
					<legend>Lista de Disciplina</legend>
			            <table border="1" id="contactform">  
            <tr>  
                <td>ID</td>  
                <td>Nome</td>  
                <td>Professor</td>
                <td>Descrição</td>
 
                   </tr>  
                    <%  
                for (int i = 0; i < listadisciplina.size(); i++ ) {  
            %>  
                    <tr>   
                <td> <%=((Disciplina)listadisciplina.get(i)).getID()%> </td>
                <td> <%=((Disciplina)listadisciplina.get(i)).getNome()%> </td>  
                <td> <%=((Disciplina)listadisciplina.get(i)).getProfessor()%> </td> 
                <td><%=((Disciplina)listadisciplina.get(i)).getDescricao()%> </td> 
            </tr>    
                    <%  
                    }  
                    %>  
        </table>   
        	</fieldset>

        <label class="centered info"><input  type="button" class="button" name="btEnviar"  value="Pagina Inicial" onClick="location.href='index_admin.jsp'">
			  <input type="button" class="button" name="btDeslogar "  value="Deslogar" onclick="location.href='login.jsp'">
			 <label class="centered info"><br>
          <a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
			</div>
	</div>
</body>
</html>