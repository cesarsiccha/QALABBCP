package com.example.proyecto1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("DetalleProductoCliente")
@Data
@NoArgsConstructor
public class DetalleProductoCliente {

    @Id
    private String idDetalleProductoCliente;
    private Cliente idCliente;
    private Producto idProducto;
    private boolean estado;
}
