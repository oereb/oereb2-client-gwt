//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.28 at 05:34:43 PM CEST 
//


package ch.ehi.oereb.schemas.oereb._1_0.extractdata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import ch.ehi.oereb.schemas.xmldsig._2000_09.Signature;


/**
 * <p>Java class for Extract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Extract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreationDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;minInclusive value="2009-01-01T00:00:00.000"/>
 *               &lt;maxInclusive value="2999-12-31T23:59:59.000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *         &lt;element name="ConcernedTheme" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Theme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NotConcernedTheme" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Theme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThemeWithoutData" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Theme" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isReduced" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice>
 *           &lt;element name="LogoPLRCadastre" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="LogoPLRCadastreRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="FederalLogo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="FederalLogoRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="CantonalLogo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="CantonalLogoRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="MunicipalityLogo" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="MunicipalityLogoRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;element name="ExtractIdentifier">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="QRCode" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="QRCodeRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;element name="GeneralInformation" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}MultilingualMText" minOccurs="0"/>
 *         &lt;element name="BaseData" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}MultilingualMText"/>
 *         &lt;element name="Glossary" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Glossary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RealEstate" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}RealEstate_DPR"/>
 *         &lt;element name="ExclusionOfLiability" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}ExclusionOfLiability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PLRCadastreAuthority" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Office"/>
 *         &lt;element name="Certification" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}MultilingualMText" minOccurs="0"/>
 *         &lt;element name="CertificationAtWeb" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}MultilingualUri" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extract", propOrder = {
    "creationDate",
    "signature",
    "concernedTheme",
    "notConcernedTheme",
    "themeWithoutData",
    "isReduced",
    "logoPLRCadastre",
    "logoPLRCadastreRef",
    "federalLogo",
    "federalLogoRef",
    "cantonalLogo",
    "cantonalLogoRef",
    "municipalityLogo",
    "municipalityLogoRef",
    "extractIdentifier",
    "qrCode",
    "qrCodeRef",
    "generalInformation",
    "baseData",
    "glossary",
    "realEstate",
    "exclusionOfLiability",
    "plrCadastreAuthority",
    "certification",
    "certificationAtWeb",
    "extensions"
})
public class ExtractType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CreationDate", required = true)
    protected XMLGregorianCalendar creationDate;
    @XmlElementRef(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", type = Signature.class, required = false)
    protected Signature signature;
    @XmlElement(name = "ConcernedTheme")
    protected List<ThemeType> concernedTheme;
    @XmlElement(name = "NotConcernedTheme")
    protected List<ThemeType> notConcernedTheme;
    @XmlElement(name = "ThemeWithoutData")
    protected List<ThemeType> themeWithoutData;
    protected boolean isReduced;
    @XmlElement(name = "LogoPLRCadastre")
    protected byte[] logoPLRCadastre;
    @XmlElement(name = "LogoPLRCadastreRef")
    @XmlSchemaType(name = "anyURI")
    protected String logoPLRCadastreRef;
    @XmlElement(name = "FederalLogo")
    protected byte[] federalLogo;
    @XmlElement(name = "FederalLogoRef")
    @XmlSchemaType(name = "anyURI")
    protected String federalLogoRef;
    @XmlElement(name = "CantonalLogo")
    protected byte[] cantonalLogo;
    @XmlElement(name = "CantonalLogoRef")
    @XmlSchemaType(name = "anyURI")
    protected String cantonalLogoRef;
    @XmlElement(name = "MunicipalityLogo")
    protected byte[] municipalityLogo;
    @XmlElement(name = "MunicipalityLogoRef")
    @XmlSchemaType(name = "anyURI")
    protected String municipalityLogoRef;
    @XmlElement(name = "ExtractIdentifier", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String extractIdentifier;
    @XmlElement(name = "QRCode")
    protected byte[] qrCode;
    @XmlElement(name = "QRCodeRef")
    @XmlSchemaType(name = "anyURI")
    protected String qrCodeRef;
    @XmlElement(name = "GeneralInformation")
    protected MultilingualMTextType generalInformation;
    @XmlElement(name = "BaseData", required = true)
    protected MultilingualMTextType baseData;
    @XmlElement(name = "Glossary")
    protected List<GlossaryType> glossary;
    @XmlElement(name = "RealEstate", required = true)
    protected RealEstateDPRType realEstate;
    @XmlElement(name = "ExclusionOfLiability")
    protected List<ExclusionOfLiabilityType> exclusionOfLiability;
    @XmlElement(name = "PLRCadastreAuthority", required = true)
    protected OfficeType plrCadastreAuthority;
    @XmlElement(name = "Certification")
    protected MultilingualMTextType certification;
    @XmlElement(name = "CertificationAtWeb")
    protected MultilingualUriType certificationAtWeb;
    protected Extensions extensions;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setSignature(Signature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the concernedTheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concernedTheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcernedTheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThemeType }
     * 
     * 
     */
    public List<ThemeType> getConcernedTheme() {
        if (concernedTheme == null) {
            concernedTheme = new ArrayList<ThemeType>();
        }
        return this.concernedTheme;
    }

    /**
     * Gets the value of the notConcernedTheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notConcernedTheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotConcernedTheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThemeType }
     * 
     * 
     */
    public List<ThemeType> getNotConcernedTheme() {
        if (notConcernedTheme == null) {
            notConcernedTheme = new ArrayList<ThemeType>();
        }
        return this.notConcernedTheme;
    }

    /**
     * Gets the value of the themeWithoutData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the themeWithoutData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThemeWithoutData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThemeType }
     * 
     * 
     */
    public List<ThemeType> getThemeWithoutData() {
        if (themeWithoutData == null) {
            themeWithoutData = new ArrayList<ThemeType>();
        }
        return this.themeWithoutData;
    }

    /**
     * Gets the value of the isReduced property.
     * 
     */
    public boolean isIsReduced() {
        return isReduced;
    }

    /**
     * Sets the value of the isReduced property.
     * 
     */
    public void setIsReduced(boolean value) {
        this.isReduced = value;
    }

    /**
     * Gets the value of the logoPLRCadastre property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLogoPLRCadastre() {
        return logoPLRCadastre;
    }

    /**
     * Sets the value of the logoPLRCadastre property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLogoPLRCadastre(byte[] value) {
        this.logoPLRCadastre = value;
    }

    /**
     * Gets the value of the logoPLRCadastreRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoPLRCadastreRef() {
        return logoPLRCadastreRef;
    }

    /**
     * Sets the value of the logoPLRCadastreRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoPLRCadastreRef(String value) {
        this.logoPLRCadastreRef = value;
    }

    /**
     * Gets the value of the federalLogo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFederalLogo() {
        return federalLogo;
    }

    /**
     * Sets the value of the federalLogo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFederalLogo(byte[] value) {
        this.federalLogo = value;
    }

    /**
     * Gets the value of the federalLogoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalLogoRef() {
        return federalLogoRef;
    }

    /**
     * Sets the value of the federalLogoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalLogoRef(String value) {
        this.federalLogoRef = value;
    }

    /**
     * Gets the value of the cantonalLogo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCantonalLogo() {
        return cantonalLogo;
    }

    /**
     * Sets the value of the cantonalLogo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCantonalLogo(byte[] value) {
        this.cantonalLogo = value;
    }

    /**
     * Gets the value of the cantonalLogoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantonalLogoRef() {
        return cantonalLogoRef;
    }

    /**
     * Sets the value of the cantonalLogoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantonalLogoRef(String value) {
        this.cantonalLogoRef = value;
    }

    /**
     * Gets the value of the municipalityLogo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMunicipalityLogo() {
        return municipalityLogo;
    }

    /**
     * Sets the value of the municipalityLogo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMunicipalityLogo(byte[] value) {
        this.municipalityLogo = value;
    }

    /**
     * Gets the value of the municipalityLogoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityLogoRef() {
        return municipalityLogoRef;
    }

    /**
     * Sets the value of the municipalityLogoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityLogoRef(String value) {
        this.municipalityLogoRef = value;
    }

    /**
     * Gets the value of the extractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractIdentifier() {
        return extractIdentifier;
    }

    /**
     * Sets the value of the extractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractIdentifier(String value) {
        this.extractIdentifier = value;
    }

    /**
     * Gets the value of the qrCode property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getQRCode() {
        return qrCode;
    }

    /**
     * Sets the value of the qrCode property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setQRCode(byte[] value) {
        this.qrCode = value;
    }

    /**
     * Gets the value of the qrCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQRCodeRef() {
        return qrCodeRef;
    }

    /**
     * Sets the value of the qrCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQRCodeRef(String value) {
        this.qrCodeRef = value;
    }

    /**
     * Gets the value of the generalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualMTextType }
     *     
     */
    public MultilingualMTextType getGeneralInformation() {
        return generalInformation;
    }

    /**
     * Sets the value of the generalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualMTextType }
     *     
     */
    public void setGeneralInformation(MultilingualMTextType value) {
        this.generalInformation = value;
    }

    /**
     * Gets the value of the baseData property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualMTextType }
     *     
     */
    public MultilingualMTextType getBaseData() {
        return baseData;
    }

    /**
     * Sets the value of the baseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualMTextType }
     *     
     */
    public void setBaseData(MultilingualMTextType value) {
        this.baseData = value;
    }

    /**
     * Gets the value of the glossary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glossary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlossary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlossaryType }
     * 
     * 
     */
    public List<GlossaryType> getGlossary() {
        if (glossary == null) {
            glossary = new ArrayList<GlossaryType>();
        }
        return this.glossary;
    }

    /**
     * Gets the value of the realEstate property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateDPRType }
     *     
     */
    public RealEstateDPRType getRealEstate() {
        return realEstate;
    }

    /**
     * Sets the value of the realEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateDPRType }
     *     
     */
    public void setRealEstate(RealEstateDPRType value) {
        this.realEstate = value;
    }

    /**
     * Gets the value of the exclusionOfLiability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionOfLiability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionOfLiability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionOfLiabilityType }
     * 
     * 
     */
    public List<ExclusionOfLiabilityType> getExclusionOfLiability() {
        if (exclusionOfLiability == null) {
            exclusionOfLiability = new ArrayList<ExclusionOfLiabilityType>();
        }
        return this.exclusionOfLiability;
    }

    /**
     * Gets the value of the plrCadastreAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link OfficeType }
     *     
     */
    public OfficeType getPLRCadastreAuthority() {
        return plrCadastreAuthority;
    }

    /**
     * Sets the value of the plrCadastreAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeType }
     *     
     */
    public void setPLRCadastreAuthority(OfficeType value) {
        this.plrCadastreAuthority = value;
    }

    /**
     * Gets the value of the certification property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualMTextType }
     *     
     */
    public MultilingualMTextType getCertification() {
        return certification;
    }

    /**
     * Sets the value of the certification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualMTextType }
     *     
     */
    public void setCertification(MultilingualMTextType value) {
        this.certification = value;
    }

    /**
     * Gets the value of the certificationAtWeb property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualUriType }
     *     
     */
    public MultilingualUriType getCertificationAtWeb() {
        return certificationAtWeb;
    }

    /**
     * Sets the value of the certificationAtWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualUriType }
     *     
     */
    public void setCertificationAtWeb(MultilingualUriType value) {
        this.certificationAtWeb = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}