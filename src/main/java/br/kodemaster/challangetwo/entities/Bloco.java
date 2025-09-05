package br.kodemaster.challangetwo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_blocos")
public class Bloco extends BaseEntity{
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant inicio;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id", referencedColumnName = "id")
    private Atividade atividade;

    public Bloco() {}

    public Bloco(Instant inicio, Instant fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }

    public Atividade getAtividade() {
        return atividade;
    }
}
