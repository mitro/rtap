
package kz.dtech.rt.ap.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfViolationGetWcfData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfViolationGetWcfData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ViolationGetWcfData" type="{http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc}ViolationGetWcfData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfViolationGetWcfData", propOrder = {
    "violationGetWcfData"
})
public class ArrayOfViolationGetWcfData {

    @XmlElement(name = "ViolationGetWcfData", nillable = true)
    protected List<ViolationGetWcfData> violationGetWcfData;

    /**
     * Gets the value of the violationGetWcfData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the violationGetWcfData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViolationGetWcfData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViolationGetWcfData }
     * 
     * 
     */
    public List<ViolationGetWcfData> getViolationGetWcfData() {
        if (violationGetWcfData == null) {
            violationGetWcfData = new ArrayList<ViolationGetWcfData>();
        }
        return this.violationGetWcfData;
    }

}
