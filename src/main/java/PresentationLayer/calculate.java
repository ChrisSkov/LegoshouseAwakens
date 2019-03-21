package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.house;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 @author Chris Skov
 */
public class calculate extends Command {

    public calculate()
    {
        
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException
    {
        int height = Integer.parseInt(request.getParameter("Height"));
        int width = Integer.parseInt(request.getParameter("Width"));
        int length = Integer.parseInt(request.getParameter("Length"));
        
        house house = new house(height,width,length);
        
        request.setAttribute("house", house);
        return "placeOrder";
    }

}
