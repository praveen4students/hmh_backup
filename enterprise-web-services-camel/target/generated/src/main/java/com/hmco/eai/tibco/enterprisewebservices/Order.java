package com.hmco.eai.tibco.enterprisewebservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by FuseSource Services Framework 2.5.0.fuse-7-061
 * 2013-01-23T23:53:33.957+05:30
 * Generated source version: 2.5.0.fuse-7-061
 * 
 */
@WebService(targetNamespace = "http://www.hmco.com/EAI/Tibco/EnterpriseWebServices", name = "Order")
@XmlSeeAlso({com.hmco.eai.ots.transactionnew.ObjectFactory.class, com.hmco.eai.ots.order.ObjectFactory.class, com.hmco.eai.ots.material.getatp.ObjectFactory.class, com.hmco.eai.ots.material.ObjectFactory.class, com.hmco.eai.ots.materialnew.ObjectFactory.class, com.hmco.eai.ObjectFactory.class, com.hmco.eai.ots.customer.ObjectFactory.class, com.hmco.eai.ots.transaction.ObjectFactory.class, com.hmco.eai.ots.customernew.ObjectFactory.class, com.hmco.eai.ots.eskertransaction.ObjectFactory.class, com.hmco.eai.ots.packinglist.ObjectFactory.class, com.hmco.eai.ots.material.getatpnew.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Order {

    @WebResult(name = "findUnsubmittedOrdersResponse", targetNamespace = "http://www.hmco.com/EAI/OTS/Order", partName = "findUnsubmittedOrderResponse")
    @WebMethod(action = "/BusinessProcesses/V1.1/EnterpriseWebServices.serviceagent/OrderEndpoint1/findUnsubmittedOrder")
    public com.hmco.eai.ots.order.FindUnsubmittedOrdersResponse findUnsubmittedOrder(
        @WebParam(partName = "findUnsubmittedOrderRequest", name = "findUnsubmittedOrdersRequest", targetNamespace = "http://www.hmco.com/EAI/OTS/Order")
        com.hmco.eai.ots.order.FindUnsubmittedOrdersRequest findUnsubmittedOrderRequest
    ) throws EaiException;

    @WebResult(name = "submitSampleResponse", targetNamespace = "http://www.hmco.com/EAI/OTS/Order", partName = "submitSampleResponse")
    @WebMethod(action = "/BusinessProcesses/V1.1/EnterpriseWebServices.serviceagent/OrderEndpoint1/submitSample")
    public com.hmco.eai.ots.order.SubmitSampleResponse submitSample(
        @WebParam(partName = "submitSampleRequest", name = "submitSampleRequest", targetNamespace = "http://www.hmco.com/EAI/OTS/Order")
        com.hmco.eai.ots.order.SubmitSampleRequest submitSampleRequest
    ) throws OrderException;

    @WebResult(name = "findBasisOrderResponse", targetNamespace = "http://www.hmco.com/EAI/OTS/Order", partName = "findBasisOrderResponse")
    @WebMethod(action = "/BusinessProcesses/V1.1/EnterpriseWebServices.serviceagent/OrderEndpoint1/findSfdcBasisOrder")
    public com.hmco.eai.ots.order.FindBasisOrderResponse findSfdcBasisOrder(
        @WebParam(partName = "findBasisOrderRequest", name = "findBasisOrderRequest", targetNamespace = "http://www.hmco.com/EAI/OTS/Order")
        com.hmco.eai.ots.order.FindBasisOrderRequest findBasisOrderRequest
    ) throws EaiException;

    @WebResult(name = "submitOrderResponse", targetNamespace = "http://www.hmco.com/EAI/OTS/Order", partName = "submitOrderResponse")
    @WebMethod(action = "/BusinessProcesses/V1.1/EnterpriseWebServices.serviceagent/OrderEndpoint1/submitSfdcOrder")
    public com.hmco.eai.ots.order.SubmitOrderResponse submitSfdcOrder(
        @WebParam(partName = "submitOrderRequest", name = "submitOrderRequest", targetNamespace = "http://www.hmco.com/EAI/OTS/Order")
        com.hmco.eai.ots.order.SubmitOrderRequest submitOrderRequest
    ) throws EaiException;
}
