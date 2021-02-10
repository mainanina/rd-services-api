package com.rd.projetointegrador.rdservicesapi.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="TB_AGENDA")
@Data
public class AgendaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_AGENDA")
    private BigInteger agenda;

    @OneToOne
    @JoinColumn(name="ID_MEDICO")
    private UsuarioEntity medico;

    @OneToOne
    @JoinColumn(name="ID_TIPO_CONSULTA")
    private TipoConsultaEntity tipoConsulta;

    @OneToOne
    @JoinColumn(name="ID_PERIODO")
    private PeriodoEntity periodo;

    @Column(name = "DT_DIA_DISPONIVEL")
    private Date diaDisponivel;

    @Column(name="FL_DISPONIVEL")
    private Integer flDisponivel;

}