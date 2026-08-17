# Estadía de Estacionamiento

## Descripción

Programa desarrollado en Java que simula la estadía de vehículos en un estacionamiento. Permite registrar la patente, los costos y el estado de la estadía, además de calcular el costo final.

## Funcionamiento

El programa utiliza la clase `estadiaEstacionamiento` con los siguientes atributos:

* `costoEstacionamiento`: almacena el costo del estacionamiento.
* `costoEstadia`: almacena el costo de la estadía.
* `costoFinal`: almacena el resultado de la suma de ambos costos.
* `patente`: identifica al vehículo.
* `estadoEstadia`: indica si la estadía está activa o finalizada.

El método `ingresar()` cambia el estado de la estadía a `"Activa"` e informa por consola que el ingreso fue realizado correctamente.

El método `salir()` cambia el estado de la estadía a `"Finalizada"` y muestra el nuevo estado.

El método `calcularCostoFinal()` suma `costoEstacionamiento` y `costoEstadia` para obtener el costo final.

En el método `main` se crean dos objetos `estadiaEstacionamiento`, se asignan sus datos y se simula el ingreso, cálculo del costo y finalización de cada estadía.

## Ejemplo de cálculo

```text
Costo Final = Costo Estacionamiento + Costo Estadía
```

Para la primera estadía:

```text
1500 + 5000 = 6500
```

Para la segunda:

```text
2000 + 6000 = 8000
```

## Captura de ejecución
<img width="417" height="382" alt="image" src="https://github.com/user-attachments/assets/2fbb2388-7d6e-4b26-8d11-fcf41f2b2355" />


