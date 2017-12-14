
package com.sforce.soap.enterprise.sobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sforce.soap.enterprise.QueryResult;


/**
 * <p>Java class for DashboardComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Dashboard" type="{urn:sobject.enterprise.soap.sforce.com}Dashboard" minOccurs="0"/>
 *         &lt;element name="DashboardId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardComponent", propOrder = {
    "dashboard",
    "dashboardId",
    "feedSubscriptionsForEntity",
    "feeds",
    "name"
})
public class DashboardComponentType
    extends SObjectType
{

    @XmlElement(name = "Dashboard", nillable = true)
    protected DashboardType dashboard;
    @XmlElement(name = "DashboardId", nillable = true)
    protected String dashboardId;
    @XmlElement(name = "FeedSubscriptionsForEntity", nillable = true)
    protected QueryResult feedSubscriptionsForEntity;
    @XmlElement(name = "Feeds", nillable = true)
    protected QueryResult feeds;
    @XmlElement(name = "Name", nillable = true)
    protected String name;

    /**
     * Gets the value of the dashboard property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardType }
     *     
     */
    public DashboardType getDashboard() {
        return dashboard;
    }

    /**
     * Sets the value of the dashboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardType }
     *     
     */
    public void setDashboard(DashboardType value) {
        this.dashboard = value;
    }

    /**
     * Gets the value of the dashboardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * Sets the value of the dashboardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDashboardId(String value) {
        this.dashboardId = value;
    }

    /**
     * Gets the value of the feedSubscriptionsForEntity property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }

    /**
     * Sets the value of the feedSubscriptionsForEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFeedSubscriptionsForEntity(QueryResult value) {
        this.feedSubscriptionsForEntity = value;
    }

    /**
     * Gets the value of the feeds property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getFeeds() {
        return feeds;
    }

    /**
     * Sets the value of the feeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setFeeds(QueryResult value) {
        this.feeds = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
