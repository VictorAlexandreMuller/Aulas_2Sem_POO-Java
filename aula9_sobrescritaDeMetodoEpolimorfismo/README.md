# aula9_sobrescritaDeMetodoEpolimorfismo

# Exercício:

Implemente as seguintes classes:  

*Classe: Imovel*  
| ---------------------------------- |
(-) codigo : int
(-) endereco : String
(-) valor : double
(+) Imovel()
(+) Imovel(codigo : int, endereço : String, valor : double)
(+) gets...
(+) sets...
(+) toString():String
(+) calcularValorImovel():double


*Classe: ImovelVelho*  
| ---------------------------------- |
(-) valorDesconto : double
(+) ImovelVelho()
(+) ImovelVelho(codigo : int, endereço : String, valor : double, valorDesconto : double)
(+) gets...
(+) sets...
(+) calcularValorImovel():double
(+) toString():String


*Classe: ImovelNovo*  
| ---------------------------------- |
(-) valorAdicional : double
(+) ImovelNovo()
(+) ImovelNovo(codigo : int, endereço : String, valor : double, valorAdicional : double)
(+) gets...
(+) sets...
(+) calcularValorImovel():double
(+) toString():String


# Observações:
- O método toString deverá retornar uma String com todas as informações concatenadas, não esqueça de mostrar o valor do imóvel.  
- Um ArrayList deverá ser criado na classe Main para armazenar os imóveis.  

# Retornar:
- O método calcularValorImovel deverá:  
- Imóvel: retornar o valor do imóvel;  
- Imóvel Novo: adicionar ao valor do imóvel o valor adicional;  
- Imóvel Velho: subtrair do valor do imóvel o valor do desconto;  


# Menu  
1- Inserir imóvel (perguntar se é novo ou velho)  
2- Exibir Imóveis  
3- Sair  

--------------------------------------------------------------------------
(NetBeans IDE - Aula 8 - Matéria: Programação Orientada a Objeto Java - Segundo Semestre ADS - Professor Rafael F. M. Moreno)  


Última atualização: 00h47 - 03/10/2023.
