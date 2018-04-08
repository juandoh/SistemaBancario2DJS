## Desarrollo de Software 2: Taller 4
### Aplicando patrones de diseño a un sistema bancario

#### Grupo 2DJS - Universidad del Valle 2018-1

En un sistema bancario existen diferentes familias de productos con características distintas. 
Están asociados a varios tipos de cuenta que dependen del tipo de cliente que las abra: 

- Cuenta Joven: Para clientes < 25 años
- Cuenta 10: Para clientes entre 26 y 65 años y con nómina domiciliada 
- Cuenta Oro: Para mayores de 65 años con pensión
- Cuenta Estándar: Para clientes que no encajan en las anteriores


Las caracteristicas de los productos se resumen en la Tabla 4:


| Tipo de cuenta |    Cuenta     | Tarjeta débito | Tarjeta crédito       | Regalo         |
| -------------- | ------------- | -------------- | --------------------- | -------------- |
| Joven          | 2% de interés | Gratuita       | No                    | CD música      |
| 10             | 1% de interés | Gratuita       | 18 euros, 60% nómina  | Reproductor CD |
| Oro            | 1,5%          | Gratuita       | Gratuita, 60% pensión | Seguro         |
| Estándar       | 0,5%          | 5 euros        | No                    | No             | 
