<%-- 
    Document   : login
    Created on : 25/04/2013, 19:40:20
    Author     : aluno
--%>

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
List<Professor> listaprofessores = (ArrayList<Professor>)request.getAttribute("professores");
%>
<div id="page">

		<div id="header">
			<h1>Lista Professores X-NET</h1>
		</div>

		<div id="content">
			<p id="status"></p>
                        <fieldset>
					<legend>Lista de Professores</legend>
			            <table border="1" id="contactform">  
            <tr>  
                <td>Nome</td>  
                <td>SobreNome</td>  
                <td>Data de Nascimento</td>
                <td>Email</td>
                <td>RG</td>
                <td>CPF</td>
                <td>Usuario</td>
                <td>Senha</td>
                   </tr>  
                    <%  
                for (int i = 0; i < listaprofessores.size(); i++ ) {  
            %>  
                    <tr>   
                <td> <%=((Professor)listaprofessores.get(i)).getNome() %> </td>
                <td> <%=((Professor)listaprofessores.get(i)).getSobrenome()%> </td>  
                <td> <%=((Professor)listaprofessores.get(i)).getDataNasci()%> </td> 
                <td><%=((Professor)listaprofessores.get(i)).getEmail()%> </td> 
                <td> <%=((Professor)listaprofessores.get(i)).getRG()%> </td>  
                 <td> <%=((Professor)listaprofessores.get(i)).getCPF()%> </td>  
                  <td> <%=((Professor)listaprofessores.get(i)).getLogin()%> </td> 
                   <td> <%=((Professor)listaprofessores.get(i)).getSenha()%> </td>  
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