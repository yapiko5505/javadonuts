package shop;

import bean.Product;
import dao.ProductDAO;
import tool.Action;
import javax.servlet.http.*;
import java.util.List;

public class SearchAction extends Action {

    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception {

        HttpSession session=request.getSession();

        if (session.getAttribute("staff")==null) {
            return "preview-error-login.jsp";
        }

        String keyword=request.getParameter("keyword");

        ProductDAO dao=new ProductDAO();
        List<Product> list=dao.search(keyword);

        request.setAttribute("list", list);

        return "list.jsp";   
       
    }
    
}
