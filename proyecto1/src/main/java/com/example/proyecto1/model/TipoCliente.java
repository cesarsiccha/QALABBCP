package com.example.proyecto1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("TipoCliente")
@Data
@NoArgsConstructor
public class TipoCliente {

    @Id
    private String idTipoCliente;
    private String descripcion;
    private boolean estado;
}
