package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.house;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 @author Chris Skov
 */
public class calculate extends Command {

    public int calculator(int height, int width, int length)
    {
      
       int bricks = ((length*2)+((width-4)*2))*height;
       return bricks;
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException
    {
        calculate calc= new calculate();
        
        int height = Integer.parseInt(request.getParameter("Height"));
        int width = Integer.parseInt(request.getParameter("Width"));
        int length = Integer.parseInt(request.getParameter("Length"));
        
        int bricks = calc.calculator(height, width, length);
        house house2 = new house(height,width,length,bricks);
        
        request.setAttribute("house", house2);
        return "placeOrder";
    }

}
