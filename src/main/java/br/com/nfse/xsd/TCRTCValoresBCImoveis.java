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
 * <p>Classe Java de TCRTCValoresBCImoveis complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCRTCValoresBCImoveis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAjusteBCLocImoveis" type="{http://www.sped.fazenda.gov.br/nfse}TSAjusteBCLocImoveis"/>
 *         &lt;element name="xTpAjusteBCLocImoveis" type="{http://www.sped.fazenda.gov.br/nfse}TSDesc150" minOccurs="0"/>
 *         &lt;element name="vAjusteBCLocImoveis" type="{http://www.sped.fazenda.gov.br/nfse}TSDec15V2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCRTCValoresBCImoveis", propOrder = {
    "tpAjusteBCLocImoveis",
    "xTpAjusteBCLocImoveis",
    "vAjusteBCLocImoveis"
})
public class TCRTCValoresBCImoveis {

    @XmlElement(required = true)
    protected String tpAjusteBCLocImoveis;
    protected String xTpAjusteBCLocImoveis;
    @XmlElement(required = true)
    protected String vAjusteBCLocImoveis;

    /**
     * Obtém o valor da propriedade tpAjusteBCLocImoveis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAjusteBCLocImoveis() {
        return tpAjusteBCLocImoveis;
    }

    /**
     * Define o valor da propriedade tpAjusteBCLocImoveis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAjusteBCLocImoveis(String value) {
        this.tpAjusteBCLocImoveis = value;
    }

    /**
     * Obtém o valor da propriedade xTpAjusteBCLocImoveis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXTpAjusteBCLocImoveis() {
        return xTpAjusteBCLocImoveis;
    }

    /**
     * Define o valor da propriedade xTpAjusteBCLocImoveis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXTpAjusteBCLocImoveis(String value) {
        this.xTpAjusteBCLocImoveis = value;
    }

    /**
     * Obtém o valor da propriedade vAjusteBCLocImoveis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAjusteBCLocImoveis() {
        return vAjusteBCLocImoveis;
    }

    /**
     * Define o valor da propriedade vAjusteBCLocImoveis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAjusteBCLocImoveis(String value) {
        this.vAjusteBCLocImoveis = value;
    }

}
