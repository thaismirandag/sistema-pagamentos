package com.exemplo.pagamentos.application.usecases;

import org.springframework.stereotype.Service;
import com.exemplo.pagamentos.domain.model.Pagamento;
import com.exemplo.pagamentos.domain.ports.input.RegistrarPagamentoUseCasePort;
import com.exemplo.pagamentos.domain.ports.output.PagamentoRepositoryPort;

@Service
public class RegistrarPagamentoUseCase implements RegistrarPagamentoUseCasePort {

    private final PagamentoRepositoryPort pagamentoRepository;

    public RegistrarPagamentoUseCase(PagamentoRepositoryPort pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public Pagamento registrar(Pagamento pagamento) {
        return pagamentoRepository.salvar(pagamento);
    }
}
