INSERT INTO tipo_comes_e_bebes (id, descricao) VALUES
                                                   (1, 'Carnes'),
                                                   (2, 'Acompanhamentos'),
                                                   (3, 'Bebidas'),
                                                   (4, 'Sobremesas'),
                                                   (5, 'Vegetais'),
                                                   (6, 'Frutas'),
                                                   (7, 'Queijos'),
                                                   (8, 'Entradas'),
                                                   (9, 'Salgadinhos'),
                                                   (10, 'Doces');

INSERT INTO comes_e_bebes (id, descricao, valor, quantidade, id_tipo_alimento) VALUES
                                                                                   ('550e8400-e29b-41d4-a716-446655440000', 'Picanha do L', 50.00, '1kg', 1),
                                                                                   ('550e8400-e29b-41d4-a716-446655440001', 'Arroz', 10.00, '1kg', 2),
                                                                                   ('550e8400-e29b-41d4-a716-446655440002', 'Cerveja', 3.00, '1 lata', 3),
                                                                                   ('550e8400-e29b-41d4-a716-446655440003', 'Pudim de leite', 15.00, '1 unidade', 4),
                                                                                   ('550e8400-e29b-41d4-a716-446655440004', 'Salada verde', 8.00, '300g', 5),
                                                                                   ('550e8400-e29b-41d4-a716-446655440005', 'Maçã', 2.00, '1 unidade', 6),
                                                                                   ('550e8400-e29b-41d4-a716-446655440006', 'Queijo coalho', 12.00, '500g', 7),
                                                                                   ('550e8400-e29b-41d4-a716-446655440007', 'Refrigerante', 20.00, '6 unidades', 8),
                                                                                   ('550e8400-e29b-41d4-a716-446655440008', 'Coxinha', 2.50, '1 unidade', 9),
                                                                                   ('550e8400-e29b-41d4-a716-446655440009', 'Brigadeiro', 1.00, '1 unidade', 10);
INSERT INTO local (id, rua, numero, cep, cidade, estado, complemento, vagas_estacionamento, limite_de_pessoas, valor) VALUES
                                                                                                                          ('550e8400-e29b-41d4-a716-446655450000', 'Rua das Flores', '123', '12345-678', 'Cidade A', 'Estado A', 'Próximo ao parque', 20, 50, 200.00),
                                                                                                                          ('550e8400-e29b-41d4-a716-446655450001', 'Avenida Principal', '456', '98765-432', 'Cidade B', 'Estado B', 'Próximo ao shopping', 30, 80, 300.00),
                                                                                                                          ('550e8400-e29b-41d4-a716-446655450002', 'Rua do Comércio', '789', '54321-876', 'Cidade C', 'Estado C', 'Próximo ao mercado', 40, 100, 400.00),
                                                                                                                          ('550e8400-e29b-41d4-a716-446655450003', 'Avenida Central', '789', '54321-123', 'Cidade D', 'Estado D', 'Próximo ao parque', 25, 60, 250.00),
                                                                                                                          ('550e8400-e29b-41d4-a716-446655450004', 'Rua da Praia', '456', '98765-987', 'Cidade E', 'Estado E', 'Próximo à praia', 35, 70, 350.00),
                                                                                                                          ('550e8400-e29b-41d4-a716-446655450005', 'Rua das Palmeiras', '123', '12345-543', 'Cidade F', 'Estado F', 'Próximo à floresta', 45, 90, 450.00),
                                                                                                                          ('550e8400-e29b-41d4-a716-446655450006', 'Rua do Lago', '789', '54321-765', 'Cidade G', 'Estado G', 'Próximo ao lago', 20, 40, 200.00),
                                                                                                                          ('550e8400-e29b-41d4-a716-446655450007', 'Avenida dos Coqueiros', '456', '98765-234', 'Cidade H', 'Estado H', 'Próximo ao resort', 30, 80, 300.00),
                                                                                                                          ('550e8400-e29b-41d4-a716-446655450008', 'Rua das Flores', '123', '12345-876', 'Cidade I', 'Estado I', 'Próximo ao campo', 40, 100, 400.00),
                                                                                                                          ('550e8400-e29b-41d4-a716-446655450009', 'Avenida das Árvores', '456', '98765-567', 'Cidade J', 'Estado J', 'Próximo ao bosque', 50, 120, 500.00);
INSERT INTO pessoa (id, nome, situacao, telefone, locomocao, data_confirmacao) VALUES
                                                                                   (1, 'João', 'C', '(123) 456-7890', 'C', '2024-03-01'),
                                                                                   (2, 'Maria', 'C', '(987) 654-3210', 'O', '2024-03-02'),
                                                                                   (3, 'Pedro', 'C', '(111) 222-3333', 'C', NULL),
                                                                                   (4, 'Ana', 'C', '(444) 555-6666', 'O', '2024-02-29'),
                                                                                   (5, 'Carlos', 'C', '(222) 333-4444', 'C', '2024-03-03'),
                                                                                   (6, 'Amanda', 'C', '(555) 666-7777', 'O', '2024-03-04'),
                                                                                   (7, 'Lucas', 'A', '(777) 888-9999', 'O', NULL),
                                                                                   (8, 'Julia', 'C', '(000) 111-2222', 'C', '2024-03-05'),
                                                                                   (9, 'Paula', 'C', '(333) 444-5555', 'O', '2024-03-06');

INSERT INTO xhurrasco (id, data_inicio, data_fim, anfitriao, id_local) VALUES
                                                                           (1, '2024-04-15 18:00:00', '2024-04-15 22:00:00', 1, '550e8400-e29b-41d4-a716-446655450007'),
                                                                           (2, '2024-04-20 19:00:00', '2024-04-20 23:00:00', 2, '550e8400-e29b-41d4-a716-446655450008'),
                                                                           (3, '2024-04-25 17:00:00', '2024-04-25 21:00:00', 3, '550e8400-e29b-41d4-a716-446655450009'),
                                                                           (4, '2024-04-30 18:00:00', '2024-04-30 22:00:00', 4, '550e8400-e29b-41d4-a716-446655450000'),
                                                                           (5, '2024-05-05 19:00:00', '2024-05-05 23:00:00', 5, '550e8400-e29b-41d4-a716-446655450001'),
                                                                           (6, '2024-05-10 17:00:00', '2024-05-10 21:00:00', 6, '550e8400-e29b-41d4-a716-446655450002'),
                                                                           (7, '2024-05-15 18:00:00', '2024-05-15 22:00:00', 7, '550e8400-e29b-41d4-a716-446655450003'),
                                                                           (8, '2024-05-20 19:00:00', '2024-05-20 23:00:00', 8, '550e8400-e29b-41d4-a716-446655450004'),
                                                                           (9, '2024-05-25 17:00:00', '2024-05-25 21:00:00', 2, '550e8400-e29b-41d4-a716-446655450005'),
                                                                           (10, '2024-05-30 18:00:00', '2024-05-30 22:00:00', 1, '550e8400-e29b-41d4-a716-446655450006');

INSERT INTO pessoa_alimento_xhurrasco (id_pessoa, id_alimento, id_xhurrasco, quantidade) VALUES
                                                                                             (1, '550e8400-e29b-41d4-a716-446655440002', 1, 2),
                                                                                             (2, '550e8400-e29b-41d4-a716-446655440001', 1, 3),
                                                                                             (3, '550e8400-e29b-41d4-a716-446655440008', 1, 1),
                                                                                             (4, '550e8400-e29b-41d4-a716-446655440009', 1, 4),
                                                                                             (5, '550e8400-e29b-41d4-a716-446655440003', 1, 1);