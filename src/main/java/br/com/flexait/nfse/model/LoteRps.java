package br.com.flexait.nfse.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class LoteRps {
	
	@XStreamAsAttribute
	private String Id;
	
	@XStreamAsAttribute
	private Versao versao;
	
	private Long NumeroLote;
	
	private CpfCnpj CpfCnpj;
	
	private Long InscricaoMunicipal;
	
	private int QuantidadeRps;
	
	private final List<Rps> ListaRps;
	
	public LoteRps() {
		Id = UUID.randomUUID().toString();
		ListaRps = new ArrayList<>();
		versao = Versao.V2_01;
		CpfCnpj = new CpfCnpj();
	}

	@Override
	public String toString() {
		return "LoteRps [Id=" + Id + ", versao=" + versao + ", NumeroLote="
				+ NumeroLote + ", CpfCnpj=" + CpfCnpj + ", InscricaoMunicipal="
				+ InscricaoMunicipal + ", QuantidadeRps=" + QuantidadeRps
				+ ", ListaRps=" + ListaRps + "]";
	}

	public void setId(String id) {
		Id = id;
	}

	public String getId() {
		return Id;
	}

	public Versao getVersao() {
		return versao;
	}

	public void setVersao(Versao versao) {
		this.versao = versao;
	}

	public Long getNumeroLote() {
		return NumeroLote;
	}

	public void setNumeroLote(Long numeroLote) {
		NumeroLote = numeroLote;
	}

	public CpfCnpj getCpfCnpj() {
		return CpfCnpj;
	}

	public void setCpfCnpj(CpfCnpj cpfCnpj) {
		CpfCnpj = cpfCnpj;
	}

	public Long getInscricaoMunicipal() {
		return InscricaoMunicipal;
	}

	public void setInscricaoMunicipal(Long l) {
		InscricaoMunicipal = l;
	}

	public Integer getQuantidadeRps() {
		return QuantidadeRps;
	}

	public List<Rps> getRps() {
		return Collections.unmodifiableList(ListaRps);
	}

	public void addRps(List<Rps> rps) {
		ListaRps.addAll(rps);
		QuantidadeRps = ListaRps.size();
	}
	
	public void addRps(Rps... rps) {
		addRps(Arrays.asList(rps));
	}

	public void setCnpj(String cnpj) {
		CpfCnpj.setCnpj(cnpj);		
	}

	public void v2_02() {
		versao = Versao.V2_02;
	}

	public void v2_01() {
		versao = Versao.V2_01;
	}

}