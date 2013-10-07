<%-- 
    Document   : login
    Created on : 25/04/2013, 19:40:20
    Author     : aluno
--%>

<%@page import="java.io.File"%>
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
	     <%
                    boolean isExcel = true;
                    if ("1".equals(request.getParameter("excel"))) {
                        isExcel = false;
                    }
                    boolean isWord = true;
                    if ("1".equals(request.getParameter("word"))) {
                        isWord = false;
                    }
        %>
        <%
                    if (!isExcel) {
                        String formName = "";
                        formName = "test.xls";
                        File filepath = new File(formName);
                        response.setContentType("application/vnd.ms-excel");
                        response.setHeader("Content-Disposition", "inline; filename=" + filepath);
                    }
                    if (!isWord) {
                        String formName = "";
                        formName = "test.doc";
                        File filepath = new File(formName);
                        response.setContentType("application/vnd.ms-word");
                        response.setHeader("Content-Disposition", "inline; filename=" + filepath);
                    }
        %>
<div id="page">

		<div id="header">
			<h1>Gravação executada com sucesso!</h1>
		</div>

		<div id="content">
			<p id="status"></p>
			<form action="" method="get" id="sucesso_professor">
			<fieldset>
					<legend>Concluido.</legend>
					<ul>
			<legend>Gravação executada com sucesso!</legend>
                        <div align="center">
        <%if (isExcel || !isWord) {%>
        <a href="sucesso_professor.jsp?excel=1">Gera Excel</a>
        <%}%>
        <%if (isWord || !isExcel) {%>
        <a href="sucesso_professor.jsp?word=1">Gera Word</a>
        <%}%>
        </div>
                            <li>
	<label for="nome"><span class="required">Nome:</span></label>
	<input name="nome" type="text" disabled="disabled" id="nome" value="<%= request.getParameter("nome") %>" readonly/>
	</li>
	
        <li>
	<label for="sobrenome"><span class="required">Sobrenome</span></label>
	<input name="sobrenome" type="text" disabled="disabled"  id="sobrenome" value="<%= request.getParameter("sobrenome") %>" readonly />
	</li>
            
         <li>
	<label for="email"><span class="required">E-mail</span></label>
	<input name="email" type="email" disabled="disabled" id="email" value="<%= request.getParameter("email") %>" readonly/>
	</li>
        
         <li>
	<label for="data"><span class="required">Data de Nascimento</span></label>
	<input name="data" type="date" disabled="disabled"  id="data" value="<%= request.getParameter("data") %>" readonly/>
	</li>
        
        <li>
	<label for="rg"><span class="required">RG</span></label>
	<input name="rg" type="text" disabled="disabled" id="rg" value="<%= request.getParameter("rg") %>" readonly/>
	</li>
         
        <li>
	<label for="cpf"><span class="required">CPF</span></label>
	<input name="cpf" type="text" disabled="disabled" id="cpf" value="<%= request.getParameter("cpf") %>" readonly/>
	</li>
        
        <li>
        <label for="usuario"><span class="required">Usuario:</span></label>
        <input id="usuario" name="usuario" disabled="disabled" class="text required email" type="text" value="<%= request.getParameter("usuario") %>" readonly/>
	</li>
	
	<li>
	<label for="password"><span class="required">senha</span></label>
        <input name="senha" type="password" disabled="disabled"  class="text required" id="senha" minlength="4" maxlength="20" value="<%= request.getParameter("senha") %>" readonly/>
	</ul>
	</fieldset>
	<fieldset class="submit">
            <input  type="submit" class="button" name="btEnviar"  value="Pagina Inicial" onclick="location.href='index_admin.jsp'">
            <input type="button" class="button" name="btDeslogar "  value="Deslogar" onclick="location.href='login.jsp'">
	</fieldset>
			

			 <label class="centered info"><a  id="lembrasenha"  >Todos os Direitos Reservados X-NET</a></label>
			</div>
	</div>
</body>
</html>