
package kz.dtech.rt.ap.ws.client;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kz.dtech.rt.ap.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ViolationStatusEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Services.ViolationService", "ViolationStatusEnum");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ViolationGetWcfData_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolationGetWcfData");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ViolationGetWcfParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolationGetWcfParams");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfViolationGetWcfData_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ArrayOfViolationGetWcfData");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _GetViolationsParameters_QNAME = new QName("http://tempuri.org/", "parameters");
    private final static QName _GetViolationsUserId_QNAME = new QName("http://tempuri.org/", "userId");
    private final static QName _GetViolationsResponseGetViolationsResult_QNAME = new QName("http://tempuri.org/", "GetViolationsResult");
    private final static QName _ViolationGetWcfParamsLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "LastName");
    private final static QName _ViolationGetWcfParamsSecondName_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "SecondName");
    private final static QName _ViolationGetWcfParamsTransportNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "TransportNumber");
    private final static QName _ViolationGetWcfParamsLegalName_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "LegalName");
    private final static QName _ViolationGetWcfParamsFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "FirstName");
    private final static QName _ViolationGetWcfParamsNumberSrts_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "NumberSrts");
    private final static QName _ViolationGetWcfDataOrderNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "OrderNumber");
    private final static QName _ViolationGetWcfDataViolatorLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolatorLastName");
    private final static QName _ViolationGetWcfDataViolatorFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolatorFirstName");
    private final static QName _ViolationGetWcfDataViolationTypeShort_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolationTypeShort");
    private final static QName _ViolationGetWcfDataViolatorFullName_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolatorFullName");
    private final static QName _ViolationGetWcfDataViolationStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolationStatus");
    private final static QName _ViolationGetWcfDataColor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "Color");
    private final static QName _ViolationGetWcfDataModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "Model");
    private final static QName _ViolationGetWcfDataViolationStatusKz_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolationStatusKz");
    private final static QName _ViolationGetWcfDataViolationTypeKz_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolationTypeKz");
    private final static QName _ViolationGetWcfDataPostAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "PostAddress");
    private final static QName _ViolationGetWcfDataViolatorSecondName_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolatorSecondName");
    private final static QName _ViolationGetWcfDataViolationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "ViolationType");
    private final static QName _ViolationGetWcfDataNumberSRTS_QNAME = new QName("http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", "NumberSRTS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kz.dtech.rt.ap.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetViolationsResponse }
     * 
     */
    public GetViolationsResponse createGetViolationsResponse() {
        return new GetViolationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfViolationGetWcfData }
     * 
     */
    public ArrayOfViolationGetWcfData createArrayOfViolationGetWcfData() {
        return new ArrayOfViolationGetWcfData();
    }

    /**
     * Create an instance of {@link GetViolations }
     * 
     */
    public GetViolations createGetViolations() {
        return new GetViolations();
    }

    /**
     * Create an instance of {@link ViolationGetWcfParams }
     * 
     */
    public ViolationGetWcfParams createViolationGetWcfParams() {
        return new ViolationGetWcfParams();
    }

    /**
     * Create an instance of {@link ViolationGetWcfData }
     * 
     */
    public ViolationGetWcfData createViolationGetWcfData() {
        return new ViolationGetWcfData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationStatusEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Services.ViolationService", name = "ViolationStatusEnum")
    public JAXBElement<ViolationStatusEnum> createViolationStatusEnum(ViolationStatusEnum value) {
        return new JAXBElement<ViolationStatusEnum>(_ViolationStatusEnum_QNAME, ViolationStatusEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationGetWcfData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolationGetWcfData")
    public JAXBElement<ViolationGetWcfData> createViolationGetWcfData(ViolationGetWcfData value) {
        return new JAXBElement<ViolationGetWcfData>(_ViolationGetWcfData_QNAME, ViolationGetWcfData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationGetWcfParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolationGetWcfParams")
    public JAXBElement<ViolationGetWcfParams> createViolationGetWcfParams(ViolationGetWcfParams value) {
        return new JAXBElement<ViolationGetWcfParams>(_ViolationGetWcfParams_QNAME, ViolationGetWcfParams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolationGetWcfData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ArrayOfViolationGetWcfData")
    public JAXBElement<ArrayOfViolationGetWcfData> createArrayOfViolationGetWcfData(ArrayOfViolationGetWcfData value) {
        return new JAXBElement<ArrayOfViolationGetWcfData>(_ArrayOfViolationGetWcfData_QNAME, ArrayOfViolationGetWcfData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationGetWcfParams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameters", scope = GetViolations.class)
    public JAXBElement<ViolationGetWcfParams> createGetViolationsParameters(ViolationGetWcfParams value) {
        return new JAXBElement<ViolationGetWcfParams>(_GetViolationsParameters_QNAME, ViolationGetWcfParams.class, GetViolations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userId", scope = GetViolations.class)
    public JAXBElement<Integer> createGetViolationsUserId(Integer value) {
        return new JAXBElement<Integer>(_GetViolationsUserId_QNAME, Integer.class, GetViolations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolationGetWcfData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetViolationsResult", scope = GetViolationsResponse.class)
    public JAXBElement<ArrayOfViolationGetWcfData> createGetViolationsResponseGetViolationsResult(ArrayOfViolationGetWcfData value) {
        return new JAXBElement<ArrayOfViolationGetWcfData>(_GetViolationsResponseGetViolationsResult_QNAME, ArrayOfViolationGetWcfData.class, GetViolationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "LastName", scope = ViolationGetWcfParams.class)
    public JAXBElement<String> createViolationGetWcfParamsLastName(String value) {
        return new JAXBElement<String>(_ViolationGetWcfParamsLastName_QNAME, String.class, ViolationGetWcfParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "SecondName", scope = ViolationGetWcfParams.class)
    public JAXBElement<String> createViolationGetWcfParamsSecondName(String value) {
        return new JAXBElement<String>(_ViolationGetWcfParamsSecondName_QNAME, String.class, ViolationGetWcfParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "TransportNumber", scope = ViolationGetWcfParams.class)
    public JAXBElement<String> createViolationGetWcfParamsTransportNumber(String value) {
        return new JAXBElement<String>(_ViolationGetWcfParamsTransportNumber_QNAME, String.class, ViolationGetWcfParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "LegalName", scope = ViolationGetWcfParams.class)
    public JAXBElement<String> createViolationGetWcfParamsLegalName(String value) {
        return new JAXBElement<String>(_ViolationGetWcfParamsLegalName_QNAME, String.class, ViolationGetWcfParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "FirstName", scope = ViolationGetWcfParams.class)
    public JAXBElement<String> createViolationGetWcfParamsFirstName(String value) {
        return new JAXBElement<String>(_ViolationGetWcfParamsFirstName_QNAME, String.class, ViolationGetWcfParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "NumberSrts", scope = ViolationGetWcfParams.class)
    public JAXBElement<String> createViolationGetWcfParamsNumberSrts(String value) {
        return new JAXBElement<String>(_ViolationGetWcfParamsNumberSrts_QNAME, String.class, ViolationGetWcfParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "OrderNumber", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataOrderNumber(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataOrderNumber_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolatorLastName", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataViolatorLastName(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataViolatorLastName_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolatorFirstName", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataViolatorFirstName(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataViolatorFirstName_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolationTypeShort", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataViolationTypeShort(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataViolationTypeShort_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "TransportNumber", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataTransportNumber(String value) {
        return new JAXBElement<String>(_ViolationGetWcfParamsTransportNumber_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolatorFullName", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataViolatorFullName(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataViolatorFullName_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolationStatus", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataViolationStatus(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataViolationStatus_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "Color", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataColor(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataColor_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "Model", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataModel(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataModel_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolationStatusKz", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataViolationStatusKz(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataViolationStatusKz_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolationTypeKz", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataViolationTypeKz(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataViolationTypeKz_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "PostAddress", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataPostAddress(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataPostAddress_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolatorSecondName", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataViolatorSecondName(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataViolatorSecondName_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "ViolationType", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataViolationType(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataViolationType_QNAME, String.class, ViolationGetWcfData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DTech.RoadTraffic.Service.WCF.ViolationGetSvc", name = "NumberSRTS", scope = ViolationGetWcfData.class)
    public JAXBElement<String> createViolationGetWcfDataNumberSRTS(String value) {
        return new JAXBElement<String>(_ViolationGetWcfDataNumberSRTS_QNAME, String.class, ViolationGetWcfData.class, value);
    }

}
