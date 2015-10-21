
package kz.dtech.rt.ap.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetViolationsResult" type="{http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc}ArrayOfViolationGetWcfData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getViolationsResult"
})
@XmlRootElement(name = "GetViolationsResponse", namespace = "http://tempuri.org/")
public class GetViolationsResponse {

    @XmlElementRef(name = "GetViolationsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfViolationGetWcfData> getViolationsResult;

    /**
     * Gets the value of the getViolationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfViolationGetWcfData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfViolationGetWcfData> getGetViolationsResult() {
        return getViolationsResult;
    }

    /**
     * Sets the value of the getViolationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfViolationGetWcfData }{@code >}
     *     
     */
    public void setGetViolationsResult(JAXBElement<ArrayOfViolationGetWcfData> value) {
        this.getViolationsResult = value;
    }

}
