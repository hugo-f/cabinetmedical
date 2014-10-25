package fr.vidal.webservices.interactionservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2014-10-24T14:35:12.551+02:00
 * Generated source version: 2.4.6
 * 
 */
@WebServiceClient(name = "InteractionService", 
                  wsdlLocation = "http://fms.novarem.com:8078/merlin-service/services/InteractionService?wsdl",
                  targetNamespace = "urn:Vidal") 
public class InteractionService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:Vidal", "InteractionService");
    public final static QName InteractionServiceHttpPort = new QName("urn:Vidal", "InteractionServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://fms.novarem.com:8078/merlin-service/services/InteractionService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InteractionService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://fms.novarem.com:8078/merlin-service/services/InteractionService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InteractionService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InteractionService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InteractionService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InteractionService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InteractionService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public InteractionService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns InteractionService
     */
    @WebEndpoint(name = "InteractionServiceHttpPort")
    public InteractionService getInteractionServiceHttpPort() {
        return super.getPort(InteractionServiceHttpPort, InteractionService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InteractionService
     */
    @WebEndpoint(name = "InteractionServiceHttpPort")
    public InteractionService getInteractionServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(InteractionServiceHttpPort, InteractionService.class, features);
    }

}
