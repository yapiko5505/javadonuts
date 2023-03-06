package shop;

import bean.Product;
import dao.ProductDAO;
import tool.Action;
import javax.servlet.http.*;
import java.util.List;

public class DeleteAction extends Action{

    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception {

        String name=request.getParameter("name");
        Integer price=Integer.parseInt(request.getParameter("price"));

        Product p=new Product();
        p.setName(name);
        p.setPrice(price);
        ProductDAO dao=new ProductDAO();
        dao.delete(p);

        List<Product> list=dao.search("");
        request.setAttribute("list", list);

        return "list.jsp";
    }
    
}
