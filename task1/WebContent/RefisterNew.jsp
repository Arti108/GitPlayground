<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%
try {

    //loading drivers for mysql
    Class.forName("com.mysql.cj.jdbc.Driver");

    //creating connection with the database
   java.sql.Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3307/db1","root","root");
    java.sql.PreparedStatement st = con.prepareStatement(sql);
    String sql="insert into "
   java.sql.ResultSet rs=st.executeQuery();






%>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<body>
<table border=1>
<%


while(rs.next())
		{
	
		out.println("<tr><td>"
				+rs.getString("product_id")+"</td><td>"+rs.getString("product_category")+"</td><td>"+rs.getString("product_name")+"</td><td>"+rs.getString("product_quantity")+"</td></tr>"
				);
				
	
	   }
}


catch(Exception e){
e.printStackTrace();


}

%>
</table>


</body>
</html>