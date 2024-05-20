INSERT INTO `tipo_preguntas` (`id_tipo_pregunta`, `nombre`, `descripcion`) VALUES (1, 'Datos generales', 'Preguntas de datos generales');
INSERT INTO `tipo_preguntas` (`id_tipo_pregunta`, `nombre`, `descripcion`) VALUES (2, 'Intralaboral', 'Preguntas de factores de riesgo psicosocial intralaboral');
INSERT INTO `tipo_preguntas` (`id_tipo_pregunta`, `nombre`, `descripcion`) VALUES (3, 'Extralaboral', 'Preguntas de factores psicosociales extralaborales');
INSERT INTO `tipo_preguntas` (`id_tipo_pregunta`, `nombre`, `descripcion`) VALUES (4, 'Estrés', 'Preguntas para la evaluación del estrés');
INSERT INTO tipo_preguntas (id_tipo_pregunta, nombre, descripcion) VALUES (1,"prueba","tipo de pregunta para la prueba");
INSERT INTO tipo_preguntas (id_tipo_pregunta, nombre, descripcion) VALUES (2,"prueba2","segundo tipo de pregunta para la prueba");
INSERT INTO cuestionarios (id_cuestionario, titulo, descripcion) VALUES (1,"estado parcial","Cuestionario que pregunta como fué en el parcial.");
INSERT INTO cuestionarios (id_cuestionario, titulo, descripcion) VALUES (2,"estado almuerzo","Cuestionario que pregunta si ya almorzó.");
INSERT INTO preguntas (id_pregunta,enunciado,id_cuestionario,id_tipo_pregunta) VALUES (1, "¿Cómo amanece hoy?", 1, 1);
INSERT INTO preguntas (id_pregunta,enunciado,id_cuestionario,id_tipo_pregunta) VALUES (2, "¿Pasó el parcial?", 1, 2);
INSERT INTO preguntas (id_pregunta,enunciado,id_cuestionario,id_tipo_pregunta) VALUES (3, "¿Bien o que?", 2, 1);
INSERT INTO preguntas (id_pregunta,enunciado,id_cuestionario,id_tipo_pregunta) VALUES (4, "¿Ya almorzó?", 2, 2);
