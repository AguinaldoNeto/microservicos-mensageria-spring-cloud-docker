package com.github.aguinaldoneto.cliente.application.representation;

import com.github.aguinaldoneto.cliente.domain.Cliente;
import lombok.Data;

@Data
public class ClienteDTO {

    private String nome;

    private String cpf;

    private Integer idade;

    public Cliente toModel() {
        return new Cliente(nome, cpf, idade);
    }
}
