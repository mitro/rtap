
package kz.dtech.rt.ap.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViolationGetWcfParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViolationGetWcfParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberSrts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViolationGetWcfParams", propOrder = {
    "firstName",
    "lastName",
    "legalName",
    "numberSrts",
    "secondName",
    "transportNumber"
})
public class ViolationGetWcfParams {

    @XmlElementRef(name = "FirstName", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "LastName", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "LegalName", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalName;
    @XmlElementRef(name = "NumberSrts", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberSrts;
    @XmlElementRef(name = "SecondName", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secondName;
    @XmlElementRef(name = "TransportNumber", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportNumber;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalName(JAXBElement<String> value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the numberSrts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberSrts() {
        return numberSrts;
    }

    /**
     * Sets the value of the numberSrts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberSrts(JAXBElement<String> value) {
        this.numberSrts = value;
    }

    /**
     * Gets the value of the secondName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondName() {
        return secondName;
    }

    /**
     * Sets the value of the secondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondName(JAXBElement<String> value) {
        this.secondName = value;
    }

    /**
     * Gets the value of the transportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransportNumber() {
        return transportNumber;
    }

    /**
     * Sets the value of the transportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransportNumber(JAXBElement<String> value) {
        this.transportNumber = value;
    }

}
