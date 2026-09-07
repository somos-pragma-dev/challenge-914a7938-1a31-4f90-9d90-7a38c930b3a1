# Desarrollo de un Microservicio REST

Necesitas desarrollar un microservicio REST que gestione la información de productos en un catálogo. Los productos tienen un nombre, precio, stock y categoría. El sistema debe prohibir precios negativos y nombres duplicados. Deberás decidir cómo estructurar la información y qué hacer cuando una validación falla.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | java spring boot |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración Inicial

**Objetivo:** Tener un microservicio básico que pueda crear, leer, actualizar y eliminar productos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- El sistema debe permitir la creación de productos con las propiedades mencionadas.
- Debe validar que el precio no sea negativo y que el nombre no esté duplicado.
- El sistema debe devolver un mensaje de error descriptivo si alguna de las validaciones falla.

**Entregable:** Microservicio REST básico con las funcionalidades de CRUD para productos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo estructurar la información de los productos.
- Piensa en cómo manejar los errores de validación.

</details>

### Fase 2: Validaciones y Errores

**Objetivo:** Mejorar el microservicio para manejar correctamente las validaciones y los errores.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- El sistema debe manejar correctamente los casos en los que el precio es negativo o el nombre está duplicado.
- Debe devolver un mensaje de error específico para cada caso.
- Considera cómo mejorar la experiencia del usuario en caso de error.

**Entregable:** Microservicio REST con manejo mejorado de validaciones y errores.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo comunicar los errores al usuario de manera efectiva.
- Considera si hay otras validaciones que podrías agregar.

</details>

### Fase 3: Optimización y Refactorización

**Objetivo:** Optimizar y refactorizar el microservicio para mejorar su rendimiento y mantenibilidad.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Analiza el código y busca oportunidades de optimización y refactorización.
- Considera cómo mejorar la estructura del código para hacerlo más mantenible.
- Prueba el microservicio para asegurarte de que las optimizaciones no introducen errores.

**Entregable:** Microservicio REST optimizado y refactorizado.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo podrías mejorar la estructura del código.
- Considera si hay oportunidades de optimización que no hayas explotado.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un microservicio REST y cómo se diferencia de otros tipos de servicios?
- **paraQueSirve**: ¿Para qué sirve validar los datos de entrada en un microservicio?
- **comoSeUsa**: ¿Cómo se usa un microservicio REST para crear, leer, actualizar y eliminar recursos?
- **erroresComunes**: ¿Cuáles son los errores comunes al desarrollar un microservicio REST y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño de un microservicio REST y cómo afectan su rendimiento y mantenibilidad?

## Criterios de Evaluacion

- Desarrollar un microservicio REST básico con las funcionalidades de CRUD para productos.
- Manejar correctamente las validaciones y los errores.
- Optimizar y refactorizar el microservicio para mejorar su rendimiento y mantenibilidad.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
