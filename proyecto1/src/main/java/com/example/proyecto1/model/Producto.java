package com.example.proyecto1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Producto")
@Data
@NoArgsConstructor
public class Producto {

    @Id
    private String idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private TipoProducto idTipoProducto;
    private boolean estado;

}
