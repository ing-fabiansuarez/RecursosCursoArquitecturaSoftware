# Principio de Diseño: Encapsula lo que varía

Identifica los aspectos de tu aplicación que varían y sepáralos de los que se mantienen inalterables.

**El objetivo principal de este principio es minimizar el efecto provocado por los cambios.**

## La Metáfora del Barco

Imagina que tu programa es un barco y los cambios son horribles minas escondidas bajo el agua. Si el barco golpea una mina, se hunde.

Sabiendo esto, puedes dividir el casco del barco en compartimentos individuales que puedan sellarse para limitar los daños a un único compartimento. De este modo, si el barco golpea una mina, puede permanecer a flote.

Del mismo modo, puedes aislar las partes del programa que varían en módulos independientes, protegiendo el resto del código frente a efectos adversos. Al hacerlo, dedicarás menos tiempo a lograr que el programa vuelva a funcionar, implementando y probando los cambios. Cuanto menos tiempo dediques a realizar cambios, más tiempo tendrás para implementar funciones.

## Ejemplo: Encapsulación a nivel del método

Digamos que estás creando un sitio web de comercio electrónico. En alguna parte de tu código, hay un método `obtenerTotaldelPedido` (getOrderTotal) que calcula un total del pedido, impuestos incluidos.

Podemos anticipar que el código relacionado con los impuestos tendrá que cambiar en el futuro. La tasa impositiva dependerá de cada país, estado, o incluso ciudad en la que resida el cliente, y la fórmula puede variar a lo largo del tiempo con base a nuevas leyes o regulaciones. Esto hará que tengas que cambiar el método `obtenerTotaldelPedido` bastante a menudo. Pero incluso el nombre del método sugiere que no le importa cómo se calcula el impuesto.

### ANTES: Lógica mezclada

El código de cálculo del impuesto está mezclado con el resto del código del método.

```java
method getOrderTotal(order) {
    total = 0
    foreach item in order.lineItems 
        total += item.price * item.quantity 
    
    if (order.country == "US") 
        total += total * 0.07 // Impuesto sobre la venta de EUA 
    else if (order.country == "EU") 
        total += total * 0.20 // IVA europeo 
    
    return total 
}
```
