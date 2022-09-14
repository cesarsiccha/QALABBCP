package com.example.proyecto1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Cliente")
@Data
@NoArgsConstructor
public class Cliente {

    @Id
    private String idCliente;
    private Persona idPersona;
    private String cuentaCliente;
    private boolean estado;
}
