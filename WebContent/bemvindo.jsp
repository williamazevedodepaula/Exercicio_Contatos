<html>
<head>
</head>
<body>
	<%-- Comentário JSP --%>
	<%
		String mensagem = "Bem vindo ao sistema de agenda!";
	%>
	
	<% out.println(mensagem); %>
	
	<br />
	
	<% 
		String desenvolvido = "Desenvolvido por William A. Paula";
	%>
	<%= desenvolvido %>
	
	
	<br />
	
	<%
		System.out.println("Tudo foi executado!");
	%>
</body>
</html>