# 500 Problemas Reales de Lógica de Programación — Soluciones en Java

Repositorio donde resuelvo, en Java, los ejercicios del libro **"500 Problemas Reales de Lógica de Programación — De Junior a Senior, en cualquier lenguaje"**, un libro de práctica que armé con ayuda de Claude.

El objetivo es entrenar lógica de programación de forma progresiva: desde problemas básicos hasta ejercicios de nivel senior/staff donde importan tanto el algoritmo como el diseño del sistema.

---

## Sobre el libro

- **500 problemas originales**, ordenados de menor a mayor dificultad.
- **10 niveles** con **50 ejercicios** cada uno.
- Los **últimos 3 ejercicios de cada nivel** son **desafíos de nivel**: integran varias técnicas y son más largos.
- Cada ejercicio describe una **situación real**, con personajes y contexto, como si lo pidiera un cliente.
- **No trae soluciones**: el código lo escribo yo.

### Cómo está armado cada ejercicio

| Sección | Qué contiene |
|---|---|
| **Situación** | El problema real, con contexto. |
| **Datos de entrada** | Todo lo necesario para resolverlo (desde el nivel 6 incluye formato, ejemplo y restricciones de tamaño). |
| **Tu programa debe** | Los pasos concretos, en orden. |
| **Salida esperada** | El resultado exacto, verificado con una solución de referencia. Debe coincidir carácter por carácter. |
| **Reglas** | Redondeos, límites, complejidad esperada y casos borde. Desde el nivel 8, también requisitos no funcionales (latencia, memoria, auditoría, tolerancia a fallas). |
| **Pista** | Solo para cuando me trabo de verdad. |
| **Bonus** | Extensiones para después de resolverlo. |
| **Cierre** | Dónde se usa esto en la industria. |

---

## Tecnologías

- **Lenguaje:** Java
- **IDE:** IntelliJ IDEA
- **Control de versiones:** Git

---

## Estructura del proyecto

Cada nivel tiene su propio paquete y cada ejercicio su propia clase con un método `main`:

```
src/
└── main/
    └── java/
        ├── nivel01/
        │   ├── Ejercicio001.java
        │   ├── Ejercicio002.java
        │   └── ...
        ├── nivel02/
        │   ├── Ejercicio051.java
        │   └── ...
        └── ...
```

> La numeración de las clases sigue la numeración del libro (del 001 al 500).

---

## Cómo ejecutar un ejercicio

**Desde IntelliJ IDEA:**

1. Abrir la clase del ejercicio (por ejemplo, `nivel01/Ejercicio001.java`).
2. Clic en el ícono ▶ al lado del método `main`.
3. Comparar lo que imprime la consola con la **salida esperada** del libro.

**Desde la terminal:**

```bash
javac -d out src/main/java/nivel01/Ejercicio001.java
java -cp out nivel01.Ejercicio001
```

---

## Convenciones que respeto en las soluciones

Estas reglas vienen del libro y son las que hacen que la salida coincida exactamente:

- En las **salidas esperadas**, los decimales usan **punto** y **sin separador de miles** (por ejemplo: `12000.50`).
- En las tablas de datos del libro se usa formato local (`$12.000`, `7,2 km`), pero eso es solo para leer: la salida del programa va con el formato anterior.
- Salvo que el ejercicio diga otra cosa, **se redondea al final** y **"0,5 hacia arriba"**.
- Los **generadores de números aleatorios** están especificados con su fórmula y su semilla: con la misma semilla, la salida tiene que ser idéntica.

---

## Método de trabajo

1. Leer el ejercicio completo, incluidas las **reglas**.
2. Resolverlo **primero en papel**.
3. Programarlo en Java.
4. Comparar con la **salida esperada**.
5. Si no coincide, revisar **casos borde y redondeos** (ahí está el error casi siempre) y releer las reglas.
6. Usar la **pista** solo si me trabo de verdad.
7. Cuando funciona, intentar el **bonus**.

---

## Progreso

| Nivel | Ejercicios | Resueltos | Estado |
|---|---|---|---|
| 1 | 001 – 050 | 0 / 50 | ⬜ Pendiente |
| 2 | 051 – 100 | 0 / 50 | ⬜ Pendiente |
| 3 | 101 – 150 | 0 / 50 | ⬜ Pendiente |
| 4 | 151 – 200 | 0 / 50 | ⬜ Pendiente |
| 5 | 201 – 250 | 0 / 50 | ⬜ Pendiente |
| 6 | 251 – 300 | 0 / 50 | ⬜ Pendiente |
| 7 | 301 – 350 | 0 / 50 | ⬜ Pendiente |
| 8 | 351 – 400 | 0 / 50 | ⬜ Pendiente |
| 9 | 401 – 450 | 0 / 50 | ⬜ Pendiente |
| 10 | 451 – 500 | 0 / 50 | ⬜ Pendiente |

**Total: 0 / 500**

> Estados: ⬜ Pendiente · 🟨 En curso · ✅ Completo

---

## Notas

- Las soluciones son mías y reflejan mi nivel en el momento en que las escribí; algunas las voy a reescribir a medida que aprenda técnicas mejores.
- Los enunciados completos están en el libro; acá solo está el código.
