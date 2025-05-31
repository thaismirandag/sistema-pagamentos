package com.exemplo.pagamentos.domain.ports.input;

import com.exemplo.pagamentos.domain.model.Pagamento;

public interface RegistrarPagamentoUseCasePort {
    Pagamento registrar(Pagamento pagamento);
}
