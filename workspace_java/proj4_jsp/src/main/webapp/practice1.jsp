<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script>
	window.onload = function (){
		console.log('practice1';)
	}
</script>
	<h1>합체가 과연 어떻게 될까요</h1>
	
<%		int Tp= 10;	
	
		String mark = "+";
		String space = ".";	
		
	for (int i =1; i<= Tp; i++) {
		for (int j = 0; j < Tp -i; j ++) {
			out.print(space);
		}
		
		 for (int j = 0; j< 2*i-1; j++) {
			out.print(mark);	
		}
		
		 for (int j = 0; j < Tp -i; j ++) {
			out.print(space);
		}
			out.println("<br>");
	}
	
	%>
