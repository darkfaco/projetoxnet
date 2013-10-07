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
        <title>Gravação executada com sucesso!</title>
             <link href="screen.css" rel="stylesheet" type="text/css">
                     <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/jquery.maskedinput.js" type="text/javascript"></script>
<script src="includes/ice/ice.js" type="text/javascript"></script>
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
			<h1>Gravação executada com sucesso!</h1>
		</div>

		<div id="content">
		  <p id="status"></p>
			<form action="sucesso_removprofessor" method="get" id="sucesso_removprofessor">
				<fieldset>
				  <legend>Concluido.</legend>
					<ul>
			<legend>Gravação executada com sucesso!</legend>
        <li>
	<label for="rg"><span class="required">RG</span></label>
	<input name="rg" type="text" disabled="disabled" id="rg" value="<%= request.getParameter("rg") %>" readonly/>
	</li>
         
        <li>
	<label for="cpf"><span class="required">CPF</span></label>
	<input name="cpf" type="text" disabled="disabled" id="cpf" value="<%= request.getParameter("cpf") %>" readonly/>
	</li>
	</fieldset>
	<fieldset class="submit">
                        <input  type="button" class="button" name="btEnviar"  value="Pagina Inicial" onclick="location.href='index_admin.jsp'">
            <input type="button" class="button" name="btDeslogar "  value="Deslogar" onclick="location.href='login.jsp'">
	</fieldset>
			
			</form>
			 <label class="centered info"><a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
  </div>
</div>
    
</body>
</html>
