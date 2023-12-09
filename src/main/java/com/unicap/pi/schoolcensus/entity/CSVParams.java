package com.unicap.pi.schoolcensus.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.apache.commons.csv.CSVRecord;

@Data
@Entity
public class CSVParams {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Integer coRegiao;
    private Integer coUf;
    private Long coMunicipio;
    private Integer coMesorregiao;
    private Integer coMicrorregiao;
    private Long coDistrito;
    private String noEntidade;
    private Long coEntidade;
    private Integer tpDependencia;
    private Integer tpLocalizacao;
    private Integer tpLocalizacaoDiferenciada;
    private Integer tpSituacaoFuncionamento;
    private Integer inVinculoSecretariaEducacao;
    private Integer inVinculoSegurancaPublica;
    private Integer inVinculoSecretariaSaude;
    private Integer inVinculoOutroOrgao;

    public CSVParams(CSVRecord record){
        this.coRegiao = Integer.parseInt(record.get("CO_REGIAO"));
        this.coUf = Integer.parseInt(record.get("CO_UF"));
        this.coMunicipio = Long.parseLong(record.get("CO_MUNICIPIO"));
        this.coMesorregiao = Integer.parseInt(record.get("CO_MESORREGIAO"));
        this.coMicrorregiao = Integer.parseInt(record.get("CO_MICRORREGIAO"));
        this.coDistrito = Long.parseLong(record.get("CO_DISTRITO"));
        this.noEntidade = record.get("NO_ENTIDADE");
        this.coEntidade = Long.parseLong(record.get("CO_ENTIDADE"));
        this.tpDependencia = Integer.parseInt(record.get("TP_DEPENDENCIA"));
        this.tpLocalizacao = Integer.parseInt(record.get("TP_LOCALIZACAO"));
        this.tpLocalizacaoDiferenciada = Integer.parseInt(record.get("TP_LOCALIZACAO_DIFERENCIADA"));
        this.tpSituacaoFuncionamento = Integer.parseInt(record.get("TP_SITUACAO_FUNCIONAMENTO"));
        this.inVinculoSecretariaEducacao = Integer.parseInt(record.get("IN_VINCULO_SECRETARIA_EDUCACAO"));
        this.inVinculoSegurancaPublica = Integer.parseInt(record.get("IN_VINCULO_SEGURANCA_PUBLICA"));
        this.inVinculoSecretariaSaude = Integer.parseInt(record.get("IN_VINCULO_SECRETARIA_SAUDE"));
        this.inVinculoOutroOrgao = Integer.parseInt(record.get("IN_VINCULO_OUTRO_ORGAO"));

    }
}
