package io.github.Jackoki.service;


import io.github.Jackoki.domain.entity.Pedido;
import io.github.Jackoki.domain.enums.StatusPedido;
import io.github.Jackoki.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
