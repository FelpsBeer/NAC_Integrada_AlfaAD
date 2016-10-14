<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Processos</title>
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="menu.jsp"%>

	<div class="container">
		<br>
		<h3>LISTAR PROCESSOS</h3>
		<br> <br>
		<c:if test="${not empty msg}">
			<div class="alert alert-success">${msg}</div>

		</c:if>

		<form action="listarProcessoServlet" class="form-horizontal"
			method="post"  id="campo" >

			<div class="form-group">
				<label for="idNome" class="col-sm-2 control-label">Número do
					Processo:</label>
		
				<div class="col-sm-3">
		
					<input type="text" name="processo" id="idProcesso" size="10"
						maxlength="5" class="form-control"
						placeholder="Digite o Num. do Processo"
						onblur="validarProcesso (this ,'erroProcesso' );"> <span
						class="erro" id="erroProcesso"></span>
				</div>

			</div>



			<div class="form-group">
				<label for="idNome" class="col-sm-2 control-label">Nome do
					Cliente:</label>
				<div class="col-sm-5">

					<input type="text" name="nome" id="idNome" size="20" maxlength="50"
						class="form-control" placeholder="Digite o Nome"
						onblur="validarNome (this ,'erroNome' );" onkeyup="alteraMaiusculo()"> <span
						class="erro" id="erroNome"></span>
				</div>

			</div>


			<div class="form-group">
				<label for="idData" class="col-sm-2 control-label"> Período:
				</label>
				<div class="col-sm-2">


					<input type="text" class="form-control" name="data" id="idData"
						placeholder="De" maxlength="10"
						OnKeyPress="formatar('##/##/####', this) "
						onblur="validarData (this ,'erroData' );"><br> <input
						type="text" class="form-control" name="data2" id="idData2"
						placeholder="Até" maxlength="10"
						OnKeyPress="formatar('##/##/####', this) "
						onblur="validarData (this ,'erroData' );">


				</div>
			</div>
			<p class="text-center">
				<input type="submit" value="Buscar" class="btn btn-danger" />
			</p>
		</form>
		<!-- Fechamento do form -->


		<br> <br>
		<h3>Lista de Processos</h3>


		<table class="table table-bordered">
			<tr>
				<th class= "active">Número</th>
				<th class= "active">Cliente</th>
				<th class= "active">Descrição</th>
			</tr>

			<!--
			// RESULTADO DA TABELA
			
			<c:forEach items="${lista}" var="processo">
			
			
			 <tr>
					<td class="active">${processo.numero}</td>
					<td class="success">${processo.cliente}</td>
					<td class="warning">${processo.descricao}</td>
					<td class="danger">${ }</td>
					<td class="info">${ }</td>
					
						<td><a href="#" class="btn btn-info"> Lancar Despersa</a> <a href="#"
						class=" btn btn-danger">Lancar Honorário</a></td>
				
					
				</tr>
				</c:forEach>
	
		
		
			
			-->
		</table>
	</div>


	<script type="text/javascript" src="js/script.js" charset="utf-8"></script>

</body>
</html>