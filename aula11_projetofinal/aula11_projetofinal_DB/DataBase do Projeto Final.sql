drop database if exists exemplo;  -- Remove o banco de dados, caso exista
create database exemplo DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;          -- Cria o banco de dados
use exemplo;                      -- Seleciona o banco para os próximos comandos

/* As linhas acima não devem ser executas em serviços online como o sqlite oline*/

/* O JPA cria a tabela automaticamente com o que estiver vinculado la */