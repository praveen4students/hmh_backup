package com.hmco.eai.tibco.enterprisewebservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by FuseSource Services Framework 2.5.0.fuse-7-061
 * 2013-01-23T23:53:33.972+05:30
 * Generated source version: 2.5.0.fuse-7-061
 * 
 */
@WebService(targetNamespace = "http://www.hmco.com/EAI/Tibco/EnterpriseWebServices", name = "EskerServices")
@XmlSeeAlso({com.hmco.eai.ots.transactionnew.ObjectFactory.class, com.hmco.eai.ots.order.ObjectFactory.class, com.hmco.eai.ots.material.getatp.ObjectFactory.class, com.hmco.eai.ots.material.ObjectFactory.class, com.hmco.eai.ots.materialnew.ObjectFactory.class, com.hmco.eai.ObjectFactory.class, com.hmco.eai.ots.customer.ObjectFactory.class, com.hmco.eai.ots.transaction.ObjectFactory.class, com.hmco.eai.ots.customernew.ObjectFactory.class, com.hmco.eai.ots.eskertransaction.ObjectFactory.class, com.hmco.eai.ots.packinglist.ObjectFactory.class, com.hmco.eai.ots.material.getatpnew.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EskerServices {

    @WebResult(name = "EskerTransactionResult", targetNamespace = "http://www.hmco.com/EAI/OTS/EskerTransaction", partName = "EskerTransactionResult")
    @WebMethod(operationName = "EskerTransactionOperation", action = "/BusinessProcesses/V1.1/EnterpriseWebServices.serviceagent/EskerServicesEndpoint1/EskerTransactionOperation")
    public com.hmco.eai.ots.eskertransaction.EskerTransactionResult eskerTransactionOperation(
        @WebParam(partName = "EskerTransactionRequest", name = "EskerTransactionRequest", targetNamespace = "http://www.hmco.com/EAI/OTS/EskerTransaction")
        com.hmco.eai.ots.eskertransaction.EskerTransactionRequest eskerTransactionRequest
    ) throws EaiException;
}
