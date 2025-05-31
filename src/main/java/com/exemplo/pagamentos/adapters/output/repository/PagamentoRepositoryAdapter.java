package com.exemplo.pagamentos.adapters.output.repository;

import com.exemplo.pagamentos.domain.model.Pagamento;
import com.exemplo.pagamentos.domain.ports.output.PagamentoRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class PagamentoRepositoryAdapter implements PagamentoRepositoryPort {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoRepositoryAdapter(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public Pagamento salvar(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
}
