package org.example

fun calcularMedia(
    nota1: Double,
    nota2: Double,
    nota3: Double,
    nota4: Double,
): Double  {
    var somaNotas = nota1 + nota2 + nota3 + nota4
    var media = somaNotas / 4
    if (media >= 7)
        {
            println("Aluno aprovado com média $media")
        } else if (media >= 4 && media < 7)
        {
            println("Aluno em recuperação com média $media")
        } else
        {
            println("Aluno reprovado com média $media")
        }
    return media
}
