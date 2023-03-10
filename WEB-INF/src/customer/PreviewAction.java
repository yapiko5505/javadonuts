package customer;

import bean.Item;
import tool.Action;
import javax.servlet.http.*;
import java.util.List;

public class PreviewAction extends Action {

    @SuppressWarnings("unchecked")
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception {

        HttpSession session=request.getSession();

        List<Item> cart=(List<Item>)session.getAttribute("cart");
        if (cart==null || cart.size()==0) {
            return "preview-error-cart.jsp";
        }

        return "purchase-in.jsp";
    }
    
}
