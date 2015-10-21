
package kz.dtech.rt.ap.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ViolationGetWcfData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViolationGetWcfData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FineCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FixationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsLegalEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRepeat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberSRTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViolationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViolationStatusEnum" type="{http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Services.ViolationService}ViolationStatusEnum" minOccurs="0"/>
 *         &lt;element name="ViolationStatusKz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViolationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViolationTypeKz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViolationTypeShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViolatorFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViolatorFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViolatorLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViolatorSecondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViolationGetWcfData", propOrder = {
    "color",
    "fineCost",
    "fixationDate",
    "isLegalEntity",
    "isRepeat",
    "model",
    "numberSRTS",
    "orderNumber",
    "postAddress",
    "transportNumber",
    "violationStatus",
    "violationStatusEnum",
    "violationStatusKz",
    "violationType",
    "violationTypeKz",
    "violationTypeShort",
    "violatorFirstName",
    "violatorFullName",
    "violatorLastName",
    "violatorSecondName"
})
public class ViolationGetWcfData {

    @XmlElementRef(name = "Color", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> color;
    @XmlElement(name = "FineCost")
    protected Double fineCost;
    @XmlElement(name = "FixationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fixationDate;
    @XmlElement(name = "IsLegalEntity")
    protected Boolean isLegalEntity;
    @XmlElement(name = "IsRepeat")
    protected Boolean isRepeat;
    @XmlElementRef(name = "Model", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "NumberSRTS", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberSRTS;
    @XmlElementRef(name = "OrderNumber", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderNumber;
    @XmlElementRef(name = "PostAddress", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postAddress;
    @XmlElementRef(name = "TransportNumber", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transportNumber;
    @XmlElementRef(name = "ViolationStatus", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violationStatus;
    @XmlElement(name = "ViolationStatusEnum")
    @XmlSchemaType(name = "string")
    protected ViolationStatusEnum violationStatusEnum;
    @XmlElementRef(name = "ViolationStatusKz", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violationStatusKz;
    @XmlElementRef(name = "ViolationType", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violationType;
    @XmlElementRef(name = "ViolationTypeKz", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violationTypeKz;
    @XmlElementRef(name = "ViolationTypeShort", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violationTypeShort;
    @XmlElementRef(name = "ViolatorFirstName", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violatorFirstName;
    @XmlElementRef(name = "ViolatorFullName", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violatorFullName;
    @XmlElementRef(name = "ViolatorLastName", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violatorLastName;
    @XmlElementRef(name = "ViolatorSecondName", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violatorSecondName;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setColor(JAXBElement<String> value) {
        this.color = value;
    }

    /**
     * Gets the value of the fineCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFineCost() {
        return fineCost;
    }

    /**
     * Sets the value of the fineCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFineCost(Double value) {
        this.fineCost = value;
    }

    /**
     * Gets the value of the fixationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFixationDate() {
        return fixationDate;
    }

    /**
     * Sets the value of the fixationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFixationDate(XMLGregorianCalendar value) {
        this.fixationDate = value;
    }

    /**
     * Gets the value of the isLegalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLegalEntity() {
        return isLegalEntity;
    }

    /**
     * Sets the value of the isLegalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLegalEntity(Boolean value) {
        this.isLegalEntity = value;
    }

    /**
     * Gets the value of the isRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRepeat() {
        return isRepeat;
    }

    /**
     * Sets the value of the isRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRepeat(Boolean value) {
        this.isRepeat = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

    /**
     * Gets the value of the numberSRTS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberSRTS() {
        return numberSRTS;
    }

    /**
     * Sets the value of the numberSRTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberSRTS(JAXBElement<String> value) {
        this.numberSRTS = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<String> value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the postAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostAddress() {
        return postAddress;
    }

    /**
     * Sets the value of the postAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostAddress(JAXBElement<String> value) {
        this.postAddress = value;
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

    /**
     * Gets the value of the violationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolationStatus() {
        return violationStatus;
    }

    /**
     * Sets the value of the violationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolationStatus(JAXBElement<String> value) {
        this.violationStatus = value;
    }

    /**
     * Gets the value of the violationStatusEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ViolationStatusEnum }
     *     
     */
    public ViolationStatusEnum getViolationStatusEnum() {
        return violationStatusEnum;
    }

    /**
     * Sets the value of the violationStatusEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViolationStatusEnum }
     *     
     */
    public void setViolationStatusEnum(ViolationStatusEnum value) {
        this.violationStatusEnum = value;
    }

    /**
     * Gets the value of the violationStatusKz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolationStatusKz() {
        return violationStatusKz;
    }

    /**
     * Sets the value of the violationStatusKz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolationStatusKz(JAXBElement<String> value) {
        this.violationStatusKz = value;
    }

    /**
     * Gets the value of the violationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolationType() {
        return violationType;
    }

    /**
     * Sets the value of the violationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolationType(JAXBElement<String> value) {
        this.violationType = value;
    }

    /**
     * Gets the value of the violationTypeKz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolationTypeKz() {
        return violationTypeKz;
    }

    /**
     * Sets the value of the violationTypeKz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolationTypeKz(JAXBElement<String> value) {
        this.violationTypeKz = value;
    }

    /**
     * Gets the value of the violationTypeShort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolationTypeShort() {
        return violationTypeShort;
    }

    /**
     * Sets the value of the violationTypeShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolationTypeShort(JAXBElement<String> value) {
        this.violationTypeShort = value;
    }

    /**
     * Gets the value of the violatorFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolatorFirstName() {
        return violatorFirstName;
    }

    /**
     * Sets the value of the violatorFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolatorFirstName(JAXBElement<String> value) {
        this.violatorFirstName = value;
    }

    /**
     * Gets the value of the violatorFullName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolatorFullName() {
        return violatorFullName;
    }

    /**
     * Sets the value of the violatorFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolatorFullName(JAXBElement<String> value) {
        this.violatorFullName = value;
    }

    /**
     * Gets the value of the violatorLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolatorLastName() {
        return violatorLastName;
    }

    /**
     * Sets the value of the violatorLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolatorLastName(JAXBElement<String> value) {
        this.violatorLastName = value;
    }

    /**
     * Gets the value of the violatorSecondName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolatorSecondName() {
        return violatorSecondName;
    }

    /**
     * Sets the value of the violatorSecondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolatorSecondName(JAXBElement<String> value) {
        this.violatorSecondName = value;
    }

}
