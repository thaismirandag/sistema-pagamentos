package com.exemplo.pagamentos.adapters.output.repository;

import com.exemplo.pagamentos.domain.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}

