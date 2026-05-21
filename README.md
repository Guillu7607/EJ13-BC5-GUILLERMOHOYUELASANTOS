# Resumen
Este proyecto es una aplicación de escritorio desarrollada en Java utilizando JavaFX. El objetivo principal de este ejercicio es aprender a gestionar flujos de confirmación paso a paso mediante la manipulación dinámica de la propiedad disable en los botones, asegurando que el usuario solo pueda interactuar con los controles adecuados en cada fase del proceso.

## Características
Flujo de Confirmación en Dos Pasos: Protege la lógica del programa bloqueando las opciones de confirmación (Sí/No) hasta que se haya introducido y enviado una dirección válida.

Control de Estado Dinámico (setDisable): Habilita y deshabilita los componentes en tiempo de ejecución según las acciones del usuario, evitando clics accidentales o fuera de tiempo.

Limpieza de Formularios: Incorpora la funcionalidad de restauración de estado mediante .clear() si el usuario decide rechazar la información que introdujo previamente.

Diseño Centrado y Fluido: Los componentes se apilan de forma ordenada y centrada utilizando un contenedor VBox con alineación en Pos.CENTER.
