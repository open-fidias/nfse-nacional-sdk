//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.11.16 às 04:59:00 PM BRT 
//


package br.com.nfse.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TCRTCInfoBensMoveis complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCRTCInfoBensMoveis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cNCMBemMovel" type="{http://www.sped.fazenda.gov.br/nfse}TSNCM"/>
 *         &lt;element name="xNCMBemMovel" type="{http://www.sped.fazenda.gov.br/nfse}TSDesc150"/>
 *         &lt;element name="qtdNCMBemMovel" type="{http://www.sped.fazenda.gov.br/nfse}TSNum3Dig"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCRTCInfoBensMoveis", propOrder = {
    "cncmBemMovel",
    "xncmBemMovel",
    "qtdNCMBemMovel"
})
public class TCRTCInfoBensMoveis {

    @XmlElement(name = "cNCMBemMovel", required = true)
    protected String cncmBemMovel;
    @XmlElement(name = "xNCMBemMovel", required = true)
    protected String xncmBemMovel;
    @XmlElement(required = true)
    protected String qtdNCMBemMovel;

    /**
     * Obtém o valor da propriedade cncmBemMovel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNCMBemMovel() {
        return cncmBemMovel;
    }

    /**
     * Define o valor da propriedade cncmBemMovel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNCMBemMovel(String value) {
        this.cncmBemMovel = value;
    }

    /**
     * Obtém o valor da propriedade xncmBemMovel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXNCMBemMovel() {
        return xncmBemMovel;
    }

    /**
     * Define o valor da propriedade xncmBemMovel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXNCMBemMovel(String value) {
        this.xncmBemMovel = value;
    }

    /**
     * Obtém o valor da propriedade qtdNCMBemMovel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtdNCMBemMovel() {
        return qtdNCMBemMovel;
    }

    /**
     * Define o valor da propriedade qtdNCMBemMovel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdNCMBemMovel(String value) {
        this.qtdNCMBemMovel = value;
    }

}
