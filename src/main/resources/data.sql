INSERT
INTO
  funcionario
  (nome)
VALUES
  ('Pedro'),
  ('Felipe'),
  ('Junior');

INSERT
INTO
  animal
  (nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, porte, data_adocao, funcionario_id, tipo)
VALUES
    ('Yuki', 5, 'Bitbull', current_date -74, 'limpo', 'medio', current_date - 35, 1, 'CACHORRO'),
    ('Faisca', 2, 'Labrador', current_date -254, 'machucado', 'pequeno', current_date - 3, 2, 'GATO'),
    ('Pirata', 3, 'Labrador retriever', current_date -5, 'gordo', 'grande', current_date, 3, 'GATO'),
    ('Totó', 2, , 'Siamês' current_date -31, 'Bem alimentado', 'Médio', current_date, 1, 'CACHORRO'),
    ('Labesta', 4, 'Pinscher', current_date -78, 'Normal', 'grande', current_date -7, 2, 'GATO'),
    ('furia', 2, 'Persa', current_date - 80, 'Bem', 'Pequena', current_date - 30, 3, 'CACHORRO');