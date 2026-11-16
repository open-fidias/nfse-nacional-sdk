//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.11.16 às 04:59:00 PM BRT 
//


package br.com.nfse.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TCRTCUnidadesImobiliarias complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCRTCUnidadesImobiliarias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inscImobFisc" type="{http://www.sped.fazenda.gov.br/nfse}TSInscImobFisc" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="cCIB" type="{http://www.sped.fazenda.gov.br/nfse}TSCodCIB"/>
 *           &lt;element name="end" type="{http://www.sped.fazenda.gov.br/nfse}TCEnderImovel"/>
 *         &lt;/choice>
 *         &lt;element name="gAjusteBCLocImoveis" type="{http://www.sped.fazenda.gov.br/nfse}TCRTCValoresBCImoveis" maxOccurs="1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCRTCUnidadesImobiliarias", propOrder = {
    "inscImobFisc",
    "ccib",
    "end",
    "gAjusteBCLocImoveis"
})
public class TCRTCUnidadesImobiliarias {

    protected String inscImobFisc;
    @XmlElement(name = "cCIB")
    protected String ccib;
    protected TCEnderImovel end;
    protected List<TCRTCValoresBCImoveis> gAjusteBCLocImoveis;

    /**
     * Obtém o valor da propriedade inscImobFisc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscImobFisc() {
        return inscImobFisc;
    }

    /**
     * Define o valor da propriedade inscImobFisc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscImobFisc(String value) {
        this.inscImobFisc = value;
    }

    /**
     * Obtém o valor da propriedade ccib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCIB() {
        return ccib;
    }

    /**
     * Define o valor da propriedade ccib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCIB(String value) {
        this.ccib = value;
    }

    /**
     * Obtém o valor da propriedade end.
     * 
     * @return
     *     possible object is
     *     {@link TCEnderImovel }
     *     
     */
    public TCEnderImovel getEnd() {
        return end;
    }

    /**
     * Define o valor da propriedade end.
     * 
     * @param value
     *     allowed object is
     *     {@link TCEnderImovel }
     *     
     */
    public void setEnd(TCEnderImovel value) {
        this.end = value;
    }

    /**
     * Gets the value of the gAjusteBCLocImoveis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gAjusteBCLocImoveis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGAjusteBCLocImoveis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCRTCValoresBCImoveis }
     * 
     * 
     */
    public List<TCRTCValoresBCImoveis> getGAjusteBCLocImoveis() {
        if (gAjusteBCLocImoveis == null) {
            gAjusteBCLocImoveis = new ArrayList<TCRTCValoresBCImoveis>();
        }
        return this.gAjusteBCLocImoveis;
    }

}
