
package kz.dtech.rt.ap.ws.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViolationStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ViolationStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OrderCreated"/>
 *     &lt;enumeration value="OrderPrinted"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="NotifySended"/>
 *     &lt;enumeration value="Payed"/>
 *     &lt;enumeration value="PayChecked"/>
 *     &lt;enumeration value="PartialPayment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ViolationStatusEnum", namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Services.ViolationService")
@XmlEnum
public enum ViolationStatusEnum {

    @XmlEnumValue("OrderCreated")
    ORDER_CREATED("OrderCreated"),
    @XmlEnumValue("OrderPrinted")
    ORDER_PRINTED("OrderPrinted"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("NotifySended")
    NOTIFY_SENDED("NotifySended"),
    @XmlEnumValue("Payed")
    PAYED("Payed"),
    @XmlEnumValue("PayChecked")
    PAY_CHECKED("PayChecked"),
    @XmlEnumValue("PartialPayment")
    PARTIAL_PAYMENT("PartialPayment");
    private final String value;

    ViolationStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViolationStatusEnum fromValue(String v) {
        for (ViolationStatusEnum c: ViolationStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
