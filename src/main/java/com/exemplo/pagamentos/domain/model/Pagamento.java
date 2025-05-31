package com.exemplo.pagamentos.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pagamento {
    private Long id;
    private String descricao;
    private BigDecimal valor;
    private LocalDateTime dataHora;

    public Pagamento(String descricao, BigDecimal valor, LocalDateTime dataHora) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataHora = dataHora;
    }

}