package com.exemplo.pagamentos.adapters.input.controller;

import com.exemplo.pagamentos.domain.model.Pagamento;
import com.exemplo.pagamentos.domain.ports.input.RegistrarPagamentoUseCasePort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
@Tag(name = "Pagamentos", description = "Operações relacionadas a pagamentos")
public class PagamentoController {

    private final RegistrarPagamentoUseCasePort registrarPagamento;

    public PagamentoController(RegistrarPagamentoUseCasePort registrarPagamento) {
        this.registrarPagamento = registrarPagamento;
    }

    @PostMapping
    @Operation(summary = "Registrar um novo pagamento")
    public ResponseEntity<Pagamento> criar(@RequestBody Pagamento pagamento) {
        Pagamento salvo = registrarPagamento.registrar(pagamento);
        return ResponseEntity.ok(salvo);
    }
}
