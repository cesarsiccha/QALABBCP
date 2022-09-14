package com.example.proyecto1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("TipoProducto")
@Data
@NoArgsConstructor
public class TipoProducto {

    @Id
    private String idTipoProducto;
    private String descripcionProducto;
    private boolean estado;
}
