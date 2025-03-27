# Clean Code - Linters (Kotlin & Ktlint)

## Tabela de Conteúdos

- [Clean Code - Linters](#clean-code-linters)
    * [Sobre o Linter](#sobre-o-linter)
    * [Instalação e Configuração](#instalação-e-configuração)
        + [Pré-Requisitos](#pré-requisitos)
        + [Configuração Inicial](#configuração-inicial)
        + [Verificação e Formatação](#verificação-e-formatação)
    * [Estilização Automática com Ktlint](#estilização-automática-com-ktlint)
        + [Configuração das Regras de Estilo](#configuração-das-regras-de-estilo)
    * [Exemplo de Código a Ser Estilizado](#exemplo-de-código-a-ser-estilizado)
    * [Conclusão](#conclusão)

## Sobre o Linter

**Ktlint** é uma ferramenta de linting para o código **Kotlin** que tem como objetivo garantir que o código esteja padronizado, corretamente formatado e livre de erros comuns, promovendo boas práticas de codificação e melhor legibilidade. Ela é fácil de integrar ao ambiente de desenvolvimento e ajuda a manter a qualidade do código de forma automatizada.

---

## Instalação e Configuração

### Pré-Requisitos

Antes de instalar e usar o Ktlint, verifique se você possui os seguintes pré-requisitos no seu ambiente:

- **Java 17** ou superior instalado.
- **Gradle** (via Gradle Wrapper ou instalação global)

### Configuração Inicial

#### Dentro do seu projeto, você precisa Adicionar o Plugin Ktlint no arquivo `build.gradle.kts`
    
```kotlin
plugins { 
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
}
```

### Verificação e Formatação

Com o Ktlint configurado, você pode utilizar os seguintes comandos para verificar e corrigir o código automaticamente:

- **Verificar o código** (sem corrigir):

    ```bash
    ./gradlew ktlintCheck
    ```

- **Formatar o código automaticamente** (corrigir a formatação):

    ```bash
    ./gradlew ktlintFormat
    ```

Esses comandos garantem que o código esteja de acordo com as regras definidas pelo Ktlint.

---

## ✨ Estilização Automática com Ktlint

O Ktlint permite que o código seja **automaticamente estilizado** de acordo com as regras de formatação definidas. Isso elimina a necessidade de formatação manual, economizando tempo e garantindo consistência.

### Configuração das Regras de Estilo

O Ktlint pode ser configurado por meio de um arquivo **`ktlint.yml`**, onde você define as regras de formatação que deseja aplicar. Aqui está um exemplo de configuração para a **indentação** e **comprimento máximo das linhas**:

```yaml
indentation:
  indent-size: 4
  continuation-indent-size: 4

max_line_length:
  active: true
  value: 120
```

## 💻 Exemplo de Código a Ser Estilizado

A seguir, mostramos um exemplo de código Kotlin **não formatado** e o código após ser estilizado automaticamente com o Ktlint.

### Código Não Formatado

```kotlin
fun soma(a:Int,b:Int):Int{
return a+b
}
```
### Código Após Estilização (Formatado pelo Ktlint)

```kotlin
fun soma(a: Int, b: Int): Int {
    return a + b
}
```
## 📜 Conclusão
O Ktlint é uma ferramenta essencial para desenvolvedores Kotlin que buscam garantir que seu código siga boas práticas de formatação e seja livre de erros comuns. A integração do Ktlint ao seu projeto com Gradle é simples e eficiente, e ele oferece uma maneira prática de manter a consistência no código ao longo do desenvolvimento.
