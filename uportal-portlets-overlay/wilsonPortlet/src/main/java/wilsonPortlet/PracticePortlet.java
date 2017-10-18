package wilsonPortlet;

import static javax.portlet.PortletSession.APPLICATION_SCOPE;

import java.io.IOException;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

//import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

@Controller("wilsonController")
@RequestMapping("VIEW")
public class PracticePortlet {

//	private final static Logger logger = Logger.getLogger(PracticePortlet.class);
	
	@RenderMapping
	protected ModelAndView doView(RenderRequest request, RenderResponse response) throws IOException, PortletException {

//		logger.debug("I am in the View");
		response.setContentType("text/html");

		// Get preferences & session
		PortletSession session = request.getPortletSession();

		// Get username & noteid
		String username = (String) ((Map) request.getAttribute(PortletRequest.USER_INFO)).get("dbUid");
		session.setAttribute("username", username, APPLICATION_SCOPE);

		return new ModelAndView("practice");
	}

	@ActionMapping
	public void processAction(ActionRequest request, ActionResponse response) throws IOException, PortletException {
//		logger.debug("I am in the ACTION");
		System.out.println("Hi There in the process action");
	}

	@ResourceMapping
	public void serveResource(ResourceRequest request, ResourceResponse response) throws PortletException, IOException {
//		logger.debug("I am in the RESOURCE");
		System.out.println("hi there in the Server Resource");
	}

}
