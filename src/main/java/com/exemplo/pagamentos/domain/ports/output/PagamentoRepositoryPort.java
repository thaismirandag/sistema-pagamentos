package com.exemplo.pagamentos.domain.ports.output;

import com.exemplo.pagamentos.domain.model.Pagamento;

public interface PagamentoRepositoryPort {
    Pagamento salvar(Pagamento pagamento);
}
