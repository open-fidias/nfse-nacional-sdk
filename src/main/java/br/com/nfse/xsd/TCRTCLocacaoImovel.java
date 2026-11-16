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
 * <p>Classe Java de TCRTCLocacaoImovel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCRTCLocacaoImovel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pCopropriedade" type="{http://www.sped.fazenda.gov.br/nfse}TSDec3V2"/>
 *         &lt;element name="vTotOper" type="{http://www.sped.fazenda.gov.br/nfse}TSDec15V2"/>
 *         &lt;element name="vDescIncondTot" type="{http://www.sped.fazenda.gov.br/nfse}TSDec15V2" minOccurs="0"/>
 *         &lt;element name="vDescCondTot" type="{http://www.sped.fazenda.gov.br/nfse}TSDec15V2" minOccurs="0"/>
 *         &lt;element name="dVencOrig" type="{http://www.sped.fazenda.gov.br/nfse}TSData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCRTCLocacaoImovel", propOrder = {
    "pCopropriedade",
    "vTotOper",
    "vDescIncondTot",
    "vDescCondTot",
    "dVencOrig"
})
public class TCRTCLocacaoImovel {

    @XmlElement(required = true)
    protected String pCopropriedade;
    @XmlElement(required = true)
    protected String vTotOper;
    protected String vDescIncondTot;
    protected String vDescCondTot;
    protected String dVencOrig;

    /**
     * Obtém o valor da propriedade pCopropriedade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCopropriedade() {
        return pCopropriedade;
    }

    /**
     * Define o valor da propriedade pCopropriedade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCopropriedade(String value) {
        this.pCopropriedade = value;
    }

    /**
     * Obtém o valor da propriedade vTotOper.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTotOper() {
        return vTotOper;
    }

    /**
     * Define o valor da propriedade vTotOper.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTotOper(String value) {
        this.vTotOper = value;
    }

    /**
     * Obtém o valor da propriedade vDescIncondTot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDescIncondTot() {
        return vDescIncondTot;
    }

    /**
     * Define o valor da propriedade vDescIncondTot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDescIncondTot(String value) {
        this.vDescIncondTot = value;
    }

    /**
     * Obtém o valor da propriedade vDescCondTot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDescCondTot() {
        return vDescCondTot;
    }

    /**
     * Define o valor da propriedade vDescCondTot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDescCondTot(String value) {
        this.vDescCondTot = value;
    }

    /**
     * Obtém o valor da propriedade dVencOrig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVencOrig() {
        return dVencOrig;
    }

    /**
     * Define o valor da propriedade dVencOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVencOrig(String value) {
        this.dVencOrig = value;
    }

}
