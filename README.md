# Projeto Integrador 5

Projeto da cadeira de Projeto Integrador 5 ofertada pela UNICAP em 2023.2.

## Instalação

### Programas e Aplicativos

#### Spring Boot Rest API

- IDE de sua preferência como IntelliJ ou Eclipse
- JDK na versão 17

#### Python Client

- É necessário instalar a plataforma *Anaconda Navigator* e/ou o gerenciador de pacotes *Conda*.
- Também é preciso instalar o *Python* na versão **3.10** ou acima.

### Ambiente e Bilbiotecas

#### Spring Boot Rest API

- É preciso instalar as dependências do projeto via do Maven:

```
mvn clean install
```

- Também é necessário configurar variáveis de ambiente no projeto para possibilitar a conexão com o banco de dados:
  - DB_URL: String de conexão da database
  - DB_USER: Usuário da database
  - DB_PASS: Senha da database

- Feito isso, basta executar o projeto via IDE ou cmd

#### Python Client

- Após os passos anteriores, é necessário fazer o setup do ambiente:

```
conda create -n myenv python=3.10
```

- E ativar o ambiente:

```
conda activate myenv
```

- Por fim, vamos instalar as bibliotecas utilizadas no projeto:

```
conda install flask flask-cors pickle
```
