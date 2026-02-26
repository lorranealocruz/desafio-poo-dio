# Desafio POO Java (DIO) — Abstraindo um Bootcamp

Projeto desenvolvido como parte do desafio de **Programação Orientada a Objetos (POO) em Java** da **DIO**, com o tema **“Abstraindo um Bootcamp”**.  
A proposta é modelar um domínio simples de bootcamp (cursos, mentorias e devs) para praticar os pilares da POO: **Abstração, Encapsulamento, Herança e Polimorfismo**.

---

## 🧠 Conceitos de POO aplicados

- **Abstração:** o domínio é representado por entidades como `Bootcamp`, `Dev` e `Conteudo`.
- **Encapsulamento:** atributos privados com acesso via *getters/setters*.
- **Herança:** `Curso` e `Mentoria` herdam de `Conteudo`.
- **Polimorfismo:** o cálculo de XP usa `calcularXp()` definido em `Conteudo` e implementado de forma diferente em `Curso` e `Mentoria`.

---

## 📚 Regras do domínio (implementadas)

### Conteúdos
- `Conteudo` é uma classe abstrata com:
  - `titulo`
  - `descricao`
  - `calcularXp()` (abstrato)
  - constante `XP_PADRAO = 10`

### Curso
- Possui `cargaHoraria`
- **XP do curso:** `XP_PADRAO * cargaHoraria`

### Mentoria
- Possui `data`
- **XP da mentoria:** `XP_PADRAO + 20`

### Bootcamp
- Possui:
  - `nome`, `descricao`
  - `dataInicial = LocalDate.now()`
  - `dataFinal = dataInicial.plusDays(45)`
  - `devsInscritos` (Set)
  - `conteudos` (Set)

### Dev
- Possui:
  - `nome`
  - `conteudosInscritos` (Set)
  - `conteudosConcluidos` (Set)
- Fluxo:
  - `inscreverBootcamp(bootcamp)`: adiciona todos os conteúdos do bootcamp aos inscritos e registra o dev no bootcamp.
  - `progredir()`: move 1 conteúdo de **inscrito** para **concluído** (o primeiro do Set).
  - `calcularTotalXp()`: soma o XP de tudo que foi concluído.

---
## 👩‍💻 Autora

Projeto desenvolvido por **Lorrane Aló Cruz**, como parte do aprendizado em POO e Java.

