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
 * <p>Classe Java de TCRTCInfoImovel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCRTCInfoImovel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cMun" type="{http://www.sped.fazenda.gov.br/nfse}TSCodMunIBGE"/>
 *         &lt;element name="gLocacao" type="{http://www.sped.fazenda.gov.br/nfse}TCRTCLocacaoImovel" minOccurs="0"/>
 *         &lt;element name="gUnidImob" type="{http://www.sped.fazenda.gov.br/nfse}TCRTCUnidadesImobiliarias" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCRTCInfoImovel", propOrder = {
    "cMun",
    "gLocacao",
    "gUnidImob"
})
public class TCRTCInfoImovel {

    @XmlElement(required = true)
    protected String cMun;
    protected TCRTCLocacaoImovel gLocacao;
    protected List<TCRTCUnidadesImobiliarias> gUnidImob;

    /**
     * Obtém o valor da propriedade cMun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMun() {
        return cMun;
    }

    /**
     * Define o valor da propriedade cMun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMun(String value) {
        this.cMun = value;
    }

    /**
     * Obtém o valor da propriedade gLocacao.
     * 
     * @return
     *     possible object is
     *     {@link TCRTCLocacaoImovel }
     *     
     */
    public TCRTCLocacaoImovel getGLocacao() {
        return gLocacao;
    }

    /**
     * Define o valor da propriedade gLocacao.
     * 
     * @param value
     *     allowed object is
     *     {@link TCRTCLocacaoImovel }
     *     
     */
    public void setGLocacao(TCRTCLocacaoImovel value) {
        this.gLocacao = value;
    }

    /**
     * Gets the value of the gUnidImob property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gUnidImob property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGUnidImob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCRTCUnidadesImobiliarias }
     * 
     * 
     */
    public List<TCRTCUnidadesImobiliarias> getGUnidImob() {
        if (gUnidImob == null) {
            gUnidImob = new ArrayList<TCRTCUnidadesImobiliarias>();
        }
        return this.gUnidImob;
    }

}
