package lquiz;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pizza")
public class PizzaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
    	request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String pizzaType = request.getParameter("pizzaType");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("topping");
        String requestNote = request.getParameter("requestNote");

        int totalAmount = 0;
        
        if (pizzaType.equals("불고기")) {
            totalAmount += 15000;
        } else if (pizzaType.equals("콤비네이션")) {
            totalAmount += 14000;
        } else if (pizzaType.equals("포테이토")) {
            totalAmount += 13000;
        } else if (pizzaType.equals("쉬림프")) {
            totalAmount += 17000;
        }

        if (size.equals("Large")) {
            totalAmount += 5000;
        } else if (size.equals("Regular")) {
        } else if (size.equals("Small")) {
            totalAmount -= 3000;
        }

        int toppingCount = 0;
        if (toppings != null) {
            toppingCount = toppings.length;
            totalAmount += toppingCount * 1000; // 토핑 하나당 1000원
        }
        
        out.println("<head><title>주문 내역</title></head>");
        out.println("<h1>주문 내역</h1>");
        out.println("<hr>");
        out.println("<h3> 피자 종류: " + pizzaType + "</h3>");
        out.println("<h3> 사이즈: " + size + "</h3>");
        
        out.println("<h3> 토핑: ");
        if (toppings != null && toppings.length > 0) {
            out.println(String.join(", ", toppings));
        } else {
            out.println("없음");
        }
        out.println("</h3>");
        
        out.println("<h3> 요청사항: " + (requestNote) + "</h3>");
        out.println("<hr>");
        out.println("<h2> 총 주문 금액: " + totalAmount + "원</h2>");
        out.println("</body>");
        out.println("</html>");
        }catch(Exception e){
        	e.printStackTrace();
        	
        }
    }
}