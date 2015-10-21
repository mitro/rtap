
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
 *         &lt;element name="parameters" type="{http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc}ViolationGetWcfParams" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "parameters",
    "userId"
})
@XmlRootElement(name = "GetViolations", namespace = "http://tempuri.org/")
public class GetViolations {

    @XmlElementRef(name = "parameters", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ViolationGetWcfParams> parameters;
    @XmlElementRef(name = "userId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> userId;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ViolationGetWcfParams }{@code >}
     *     
     */
    public JAXBElement<ViolationGetWcfParams> getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ViolationGetWcfParams }{@code >}
     *     
     */
    public void setParameters(JAXBElement<ViolationGetWcfParams> value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUserId(JAXBElement<Integer> value) {
        this.userId = value;
    }

}
